package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum ff91 implements v190 {
    SLOT_UNKNOWN(0),
    SHORTCUT(1),
    HERO(2),
    FEED(3),
    UNRECOGNIZED(-1);

    public final int a;

    ff91(int i) {
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
