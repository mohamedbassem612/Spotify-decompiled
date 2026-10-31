package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum sk70 implements v190 {
    ICON_UNSPECIFIED(0),
    UNLIMITED(1),
    UNRECOGNIZED(-1);

    public final int a;

    sk70(int i) {
        this.a = i;
    }

    public static sk70 a(int i) {
        if (i == 0) {
            return ICON_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return UNLIMITED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
