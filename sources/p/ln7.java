package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum ln7 implements v190 {
    ATV_PAIRING_ERROR_UNSPECIFIED(0),
    ATV_PAIRING_ERROR_INVALID_PIN_FORMAT(1),
    ATV_PAIRING_ERROR_HAP_AUTHENTICATION(2),
    ATV_PAIRING_ERROR_HAP_BACKOFF(3),
    ATV_PAIRING_ERROR_HAP_MAX_PEERS(4),
    ATV_PAIRING_ERROR_HAP_MAX_TRIES(5),
    ATV_PAIRING_ERROR_HAP_UNAVAILABLE(6),
    ATV_PAIRING_ERROR_HAP_BUSY(7),
    ATV_PAIRING_ERROR_UNKNOWN_HAP_ERROR(8),
    ATV_PAIRING_ERROR_DEVICE_NOT_RESPONDING(9),
    ATV_PAIRING_ERROR_CONNECTION_LOST(10),
    ATV_PAIRING_ERROR_UNKNOWN(11),
    UNRECOGNIZED(-1);

    public final int a;

    ln7(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
