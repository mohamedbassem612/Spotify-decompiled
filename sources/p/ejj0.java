package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum ejj0 implements v190 {
    MIXED(0),
    AUDIO(1),
    VIDEO(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ejj0(int i) {
        this.a = i;
    }

    public static ejj0 a(int i) {
        if (i == 0) {
            return MIXED;
        }
        if (i == 1) {
            return AUDIO;
        }
        if (i != 2) {
            return null;
        }
        return VIDEO;
    }

    public final int getNumber() {
        return this.a;
    }
}
