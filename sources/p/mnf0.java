package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum mnf0 implements v190 {
    NONE(0),
    UNCAPPED(1),
    CAPPED(3),
    UNRECOGNIZED(-1);

    public final int a;

    mnf0(int i) {
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
