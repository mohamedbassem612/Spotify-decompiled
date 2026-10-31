package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum eoz implements v190 {
    ENCRYPTION_SCHEME_UNKNOWN(0),
    ENCRYPTION_SCHEME_CBCS(1),
    ENCRYPTION_SCHEME_CTR(2),
    UNRECOGNIZED(-1);

    public final int a;

    eoz(int i) {
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
