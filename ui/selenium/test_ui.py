import subprocess
from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
from selenium.webdriver.firefox.firefox_binary import FirefoxBinary


class TestUI:
    def setup_method(self, test_method):
        self.app = subprocess.Popen(['python3', 'main.py'], shell=False, stdout=subprocess.PIPE, stderr=subprocess.PIPE)

    def teardown_method(self, test_method):
        self.app.kill()

    # tear down self.attribute

    def test_saudacao(self):
        # from https://ftp.mozilla.org/pub/firefox/releases/46.0.1/
        binary = FirefoxBinary('/home/jeff/Downloads/firefox/firefox')

        cap = DesiredCapabilities().FIREFOX.copy()
        cap["marionette"] = False

        browser = webdriver.Firefox(capabilities=cap, firefox_binary=binary)
        browser.get("http://127.0.0.1:5000/saudacao")

        nome = browser.find_element_by_id("nome")
        nome.clear()
        nome.send_keys("Jefferson")
        botao = browser.find_element_by_id("botao")
        botao.click()
        saudacao = botao = browser.find_element_by_id("saudacao")

        saudacao_final = saudacao.text
        saudacao_esperada = "oi, Jefferson"

        browser.close()

        assert saudacao_final == saudacao_esperada

