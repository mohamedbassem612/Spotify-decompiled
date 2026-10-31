package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rjk extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ i7d b;
    public final /* synthetic */ zj51 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjk(zj51 zj51Var, i7d i7dVar, iu30 iu30Var) {
        super(1);
        this.c = zj51Var;
        this.b = i7dVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        zj51 zj51Var = this.c;
        i7d i7dVar = this.b;
        switch (b) {
            case 0:
                if (!((yj51) obj).equals(yj51.a)) {
                    eg.o();
                    return null;
                }
                xj51 xj51Var = zj51Var.c;
                if (xj51Var instanceof xj51) {
                    ((cfd) i7dVar.b).s(jv80.d);
                    iu30Var.invoke(new plk(xj51Var.a, new qjk(iu30Var, (byte) 0), xj51Var.b));
                }
                return rih1.a;
            default:
                nns nnsVar = new nns(((xfx) i7dVar.a).a.a);
                nnsVar.n(new rjk(zj51Var, i7dVar, iu30Var));
                nnsVar.f(zj51Var);
                ConstraintLayout constraintLayout = nnsVar.a.a;
                constraintLayout.setTag(nnsVar);
                return constraintLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjk(i7d i7dVar, zj51 zj51Var, iu30 iu30Var) {
        super(1);
        this.b = i7dVar;
        this.c = zj51Var;
        this.d = iu30Var;
    }
}
