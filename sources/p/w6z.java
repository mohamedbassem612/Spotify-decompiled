package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum w6z implements v190 {
    VODCAST(0),
    AUDIO(1),
    VIDEO(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    w6z(int i) {
        this.a = i;
    }

    public static w6z a(int i) {
        if (i == 0) {
            return VODCAST;
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
