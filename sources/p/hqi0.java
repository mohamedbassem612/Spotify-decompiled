package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum hqi0 implements v190 {
    MEMBER(0),
    MANAGER(1),
    KID(2),
    KID_V2(3),
    UNRECOGNIZED(-1);

    public final int a;

    hqi0(int i) {
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
