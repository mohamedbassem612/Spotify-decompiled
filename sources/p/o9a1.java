package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o9a1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9a1(cm0 cm0Var, byte b) {
        super(4);
        this.a = b;
        this.b = cm0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                cm0Var.t = r6h1Var;
                return new aal0(5, (String) null, r6h1Var);
            default:
                aal0 aal0Var = (aal0) obj;
                m9a1 m9a1Var = (m9a1) obj2;
                l9a1 l9a1Var = (l9a1) obj4;
                if (l9a1Var.equals(l9a1.b)) {
                    String strL = cm0Var.l(m9a1Var);
                    return strL != null ? aal0Var.a(strL) : aal0Var.h();
                }
                if (l9a1Var.equals(l9a1.a)) {
                    return aal0Var.a("spotify:internal:songdna:about");
                }
                eg.o();
                return null;
        }
    }
}
