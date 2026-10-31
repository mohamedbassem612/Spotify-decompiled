package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum hm8 implements v190 {
    AUTHENTICATOR_TRANSPORT_UNSPECIFIED(0),
    AUTHENTICATOR_TRANSPORT_USB(1),
    AUTHENTICATOR_TRANSPORT_NFC(2),
    AUTHENTICATOR_TRANSPORT_BLE(3),
    AUTHENTICATOR_TRANSPORT_INTERNAL(4),
    AUTHENTICATOR_TRANSPORT_HYBRID(5),
    UNRECOGNIZED(-1);

    public final int a;

    hm8(int i2) {
        this.a = i2;
    }

    public static hm8 a(int i2) {
        if (i2 == 0) {
            return AUTHENTICATOR_TRANSPORT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return AUTHENTICATOR_TRANSPORT_USB;
        }
        if (i2 == 2) {
            return AUTHENTICATOR_TRANSPORT_NFC;
        }
        if (i2 == 3) {
            return AUTHENTICATOR_TRANSPORT_BLE;
        }
        if (i2 == 4) {
            return AUTHENTICATOR_TRANSPORT_INTERNAL;
        }
        if (i2 != 5) {
            return null;
        }
        return AUTHENTICATOR_TRANSPORT_HYBRID;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
