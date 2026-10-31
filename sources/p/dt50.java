package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum dt50 {
    NONE("None", "", "NONE", "", "", 7),
    /* JADX INFO: Fake field, exist only in values array */
    SPECIFIC("Specific Headphones", "My imaginary Jabra device", "B9-B3-C2-D3-B2", "Jabra", "Elite 75t", 3),
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC("Airpods", "My AirPods", "A9-B3-C2-D3-B2", "Apple", "AirPods", 3),
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC("Beats Powerbeats Pro", "Beats Powerbeats Pro", "A9-B3-C2-D3-B2", "Beats", "Powerbeats Pro", 3),
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC("Generic Headphones", "My Generic Headphones", "G9-B3-C2-D3-B2", "Generic Brand", "Generic Model", 3),
    BLUETOOTH_UNKNOWN("Unknown Bluetooth Device", "Unknown Bluetooth Device", "U9-B3-C2-D3-B2", "Unknown Brand", "Unknown Model", 7),
    /* JADX INFO: Fake field, exist only in values array */
    MISCATEGORIZED_AS_CAR("QC35 II - miscategorized as car", "Bose QuietComfort 35 II", "U9-B3-C2-D3-B2", "Bose", "QuietComfort 35 II", 2);

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    dt50(String str, String str2, String str3, String str4, String str5, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
