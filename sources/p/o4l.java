package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum o4l implements v190 {
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_UNKNOWN(0),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_WIRED(1),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_CAR_PROJECTED(2),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_BLUETOOTH(3),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_AIRPLAY(4),
    OUTPUT_PERIPHERAL_CONNECTION_TYPE_BUILT_IN_SPEAKER(5),
    UNRECOGNIZED(-1);

    public final int a;

    o4l(int i2) {
        this.a = i2;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
