package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum frz implements v190 {
    BEGINNING(0),
    END(1),
    CURRENT(2),
    UNRECOGNIZED(-1);

    public final int a;

    frz(int i) {
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
