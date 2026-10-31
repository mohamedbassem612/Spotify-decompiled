package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum joc1 implements v190 {
    UNKNOWN(0),
    SPOTIFY(1),
    GOOGLE(2),
    UNRECOGNIZED(-1);

    public final int a;

    joc1(int i) {
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
