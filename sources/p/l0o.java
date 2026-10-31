package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l0o extends jsk {
    public final hy00 b;
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0o(hy00 hy00Var, byte b) {
        super(hy00Var);
        this.c = b;
        this.b = hy00Var;
    }

    @Override // p.jsk
    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        return this.b.e(obj, obj2, obj3, op80Var);
    }

    @Override // p.jsk
    public final boolean e(Object obj) {
        String str;
        switch (this.c) {
            case 0:
                x4i1 x4i1Var = ((c0o) obj).a;
                str = x4i1Var != null ? x4i1Var.a : null;
                return !(str == null || str.length() == 0);
            default:
                x4i1 x4i1Var2 = ((d5w) obj).c;
                str = x4i1Var2 != null ? x4i1Var2.a : null;
                return !(str == null || str.length() == 0);
        }
    }
}
