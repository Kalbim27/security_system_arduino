void setup() {
  Serial.begin(9600);      // Java ile bağlantı
  pinMode(13, OUTPUT);     // Arduino üzerindeki LED
}

void loop() {
  if (Serial.available() > 0) {
    char command = Serial.read();  // Java’dan gelen veri

    if (command == '1') {
      digitalWrite(13, HIGH);   // ARM → LED yanar
    }
    else if (command == '2') {
      digitalWrite(13, LOW);    // DISARM → LED söner
    }
    else if (command == '3') {
      digitalWrite(13, HIGH);   // ALARM → LED yanar
    }
    else if (command == '4') {
      digitalWrite(13, LOW);    // RESET → LED söner
    }
  }
}
