Feature: Verify basic functions in Android emulator positive

  @Emulator
  Scenario Outline: Verify I can set WiFi in application positive
    Given Android emulator is up and running with application
    When I click <firstValue> option
    And I click <secondValue> option
    And I set WiFi checkbox in state <checkBoxState> and fill WiFi password with value <wifiSettingValue>
    Then I verify WiFi connection status is <connectionStatus>

    Examples:
      | firstValue | secondValue               | checkBoxState | wifiSettingValue | connectionStatus |
      | Preference | 3.Preference dependencies | active        | correctPass      | Connected        |


