Feature: Verify basic functions in Android emulator negative

  @Emulator
  Scenario Outline: Verify I can set WiFi in application negative
    Given Android emulator is up and running with application
    When I click <firstValue> option
    And I click <secondValue> option
    And I set WiFi checkbox in state <checkBoxState> and fill WiFi password with value <wifiSettingValue>
    Then I verify WiFi connection status is <connectionStatus>

    Examples:
      | firstValue | secondValue               | checkBoxState | wifiSettingValue | connectionStatus |
      | Preference | 3.Preference dependencies | active        | correctPass      | Connected        |
      | Preference | 3.Preference dependencies | active        | incorrectPass    | Not connected    |


  Scenario Outline: Verify elements on landing page test
    Given Appium server is running
    When I click <firstValue> option
    And I click <secondValue> option
    And I set WiFi checkbox in state <checkBoxState> and fill WiFi password with value <wifiSettingValue>
    Then I verify WiFi connection status is <connectionStatus>

    Examples:
      | firstValue | secondValue               | checkBoxState | wifiSettingValue | connectionStatus |
      | Preference | 3.Preference dependencies | active        | correctPass      | Connected        |

