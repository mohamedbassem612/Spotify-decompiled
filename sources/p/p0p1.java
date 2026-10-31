package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum p0p1 implements swn1 {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_GMV(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    p0p1(int i) {
        this.a = i;
    }

    @Override // p.swn1
    public final int zza() {
        return this.a;
    }
}
