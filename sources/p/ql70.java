package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum ql70 implements v190 {
    ICON_UNKNOWN(0),
    SHUFFLE(1),
    SPOTIFYLOGO(2),
    X(3),
    EXCLAMATIONCIRCLE(4),
    CHEVRONRIGHT(5),
    FOLLOWACTIVE(6),
    DEVICETV(7),
    DEVICESPEAKER(8),
    EXTERNALLINK(9),
    UNRECOGNIZED(-1);

    public final int a;

    ql70(int i) {
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
