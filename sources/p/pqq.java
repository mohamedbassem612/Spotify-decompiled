package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pqq implements jly0 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public pqq(int i) {
        this.a = i;
    }

    public final Object get() {
        byte b = this.a;
        if (b == 0) {
            return new mqq();
        }
        if (b == 1) {
            return new nqq();
        }
        if (b == 2) {
            return new oqq();
        }
        jah.e(b);
        return null;
    }
}
