package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t0w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m0w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0w(m0w m0wVar, byte b) {
        super(1);
        this.a = b;
        this.b = m0wVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m0w m0wVar = this.b;
        switch (b) {
            case 0:
                m0wVar.a(new f0w((String) obj));
                return rih1Var;
            default:
                r1b0 r1b0Var = (s1b0) obj;
                if (r1b0Var instanceof r1b0) {
                    m0wVar.a(new c0w(r1b0Var.a));
                    return rih1Var;
                }
                if (!(r1b0Var instanceof q1b0)) {
                    eg.o();
                    return null;
                }
                q1b0 q1b0Var = (q1b0) r1b0Var;
                m0wVar.a(new b0w(new hb9(q1b0Var.a, q1b0Var.b)));
                return rih1Var;
        }
    }
}
