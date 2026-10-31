package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pxh0 implements omv0 {
    public final String a;
    public final kxh0 b;

    public pxh0(String str, kxh0 kxh0Var) {
        this.a = str;
        this.b = kxh0Var;
    }

    public final boolean apply(Object obj) {
        uxh0 uxh0Var = (uxh0) obj;
        return uxh0Var != null && uxh0Var.b(this.a) && uxh0.b.contains(this.b);
    }
}
