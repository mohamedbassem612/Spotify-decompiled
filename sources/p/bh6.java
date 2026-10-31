package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bh6 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dw91 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ dw91 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ hdn0 h;
    public final /* synthetic */ qam1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh6(boolean z, dw91 dw91Var, vu30 vu30Var, int i, boolean z2, dw91 dw91Var2, vu30 vu30Var2, hdn0 hdn0Var, qam1 qam1Var) {
        super(0);
        this.a = z;
        this.b = dw91Var;
        this.c = vu30Var;
        this.d = i;
        this.e = z2;
        this.f = dw91Var2;
        this.g = vu30Var2;
        this.h = hdn0Var;
        this.i = qam1Var;
    }

    public final Object invoke() {
        boolean z;
        if (this.a) {
            err0 err0Var = this.h;
            Integer numValueOf = Integer.valueOf(err0Var.s());
            dw91 dw91Var = this.b;
            Object obj = dw91Var.get(numValueOf);
            Boolean bool = Boolean.TRUE;
            boolean zJ = u890.j(obj, bool);
            tf6 tf6Var = tf6.a;
            tf6 tf6Var2 = tf6.b;
            this.c.invoke(Integer.valueOf(err0Var.s()), zJ ? tf6Var2 : tf6Var);
            int i = this.d;
            if (i != 0) {
                this.i.a(i);
            }
            dw91Var.put(Integer.valueOf(err0Var.s()), Boolean.valueOf(!u890.j(dw91Var.get(Integer.valueOf(err0Var.s())), bool)));
            if (!this.e) {
                boolean zJ2 = u890.j(dw91Var.get(Integer.valueOf(err0Var.s())), bool);
                this.f.put(Integer.valueOf(err0Var.s()), Boolean.valueOf(!zJ2));
                Integer numValueOf2 = Integer.valueOf(err0Var.s());
                if (zJ2) {
                    tf6Var = tf6Var2;
                }
                this.g.invoke(numValueOf2, tf6Var);
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
