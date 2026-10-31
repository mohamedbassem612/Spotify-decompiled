package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum on0 implements v190 {
    CLIENT_PRODUCED(0),
    INFERRED(1),
    INGESTED_MEDIA_TIMESTAMP(2),
    UNRECOGNIZED(-1);

    public final int a;

    on0(int i) {
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
