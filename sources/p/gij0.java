package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum gij0 implements v190 {
    ALBUM(1),
    SINGLE(2),
    COMPILATION(3),
    EP(4),
    AUDIOBOOK(5),
    PODCAST(6);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    gij0(int i) {
        this.a = i;
    }

    public static gij0 a(int i) {
        switch (i) {
            case 1:
                return ALBUM;
            case 2:
                return SINGLE;
            case 3:
                return COMPILATION;
            case 4:
                return EP;
            case 5:
                return AUDIOBOOK;
            case 6:
                return PODCAST;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.a;
    }
}
