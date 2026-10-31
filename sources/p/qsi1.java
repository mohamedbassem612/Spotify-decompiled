package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qsi1 extends jni0 {
    public final byte c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public qsi1(int i) {
        StringBuilder sbR = cy30.r(i, "must have at least ", " value parameter");
        sbR.append(i > 1 ? "s" : "");
        super(sbR.toString(), (byte) 1);
        this.c = i;
    }

    @Override // p.htf
    public final boolean a(c8a0 c8a0Var) {
        return c8a0Var.F().size() >= this.c;
    }
}
