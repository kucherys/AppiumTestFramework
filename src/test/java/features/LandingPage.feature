Feature: Verify landing page functionality

  @Emulator
  Scenario Outline: Verify elements on landing page
    Given Appium server is running
    When I open landing page
    Then I verify elements on landing page

    Examples:
      | firstValue | secondValue               | checkBoxState | wifiSettingValue | connectionStatus |
      | Preference | 3.Preference dependencies | active        | correctPass      | Connected        |


  Scenario Outline: Verify elements on landing page test
    Given Appium server is running
    When I click <firstValue> option
    And I click <secondValue> option
    And I set WiFi checkbox in state <checkBoxState> and fill WiFi password with value <wifiSettingValue>
    Then I verify WiFi connection status is <connectionStatus>

    Examples:
      | firstValue | secondValue               | checkBoxState | wifiSettingValue | connectionStatus |
      | Preference | 3.Preference dependencies | active        | correctPass      | Connected        |
