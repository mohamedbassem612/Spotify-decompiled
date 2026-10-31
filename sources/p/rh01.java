package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rh01 extends a8d1 implements zu30 {
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ tob1 Y;
    public /* synthetic */ dh01 a;
    public /* synthetic */ tqw b;
    public final /* synthetic */ jjm0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ c9n f;
    public final /* synthetic */ uh01 g;
    public final /* synthetic */ ah01 h;
    public final /* synthetic */ tto1 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh01(jjm0 jjm0Var, ven0 ven0Var, ven0 ven0Var2, c9n c9nVar, uh01 uh01Var, ah01 ah01Var, tto1 tto1Var, boolean z, tob1 tob1Var, tob1 tob1Var2, lnm lnmVar) {
        super(4, lnmVar);
        this.c = jjm0Var;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = c9nVar;
        this.g = uh01Var;
        this.h = ah01Var;
        this.i = tto1Var;
        this.t = z;
        this.X = tob1Var;
        this.Y = tob1Var2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        tob1 tob1Var = this.X;
        tob1 tob1Var2 = this.Y;
        rh01 rh01Var = new rh01(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, tob1Var, tob1Var2, (lnm) obj4);
        rh01Var.a = (dh01) obj2;
        rh01Var.b = (tqw) obj3;
        rih1 rih1Var = rih1.a;
        rh01Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    public final Object invokeSuspend(Object obj) {
        dh01 dh01Var = this.a;
        tqw tqwVar = this.b;
        hm5.M(obj);
        ven0 ven0Var = this.d;
        faa0 faa0Var = (faa0) ven0Var.getValue();
        if (faa0Var == null) {
            ven0Var.setValue(fn31.T(this.f, (o8n) null, 0, new qh01(dh01Var, this.g, this.h, this.i, this.t, tqwVar, this.X, this.Y, this.e, null), 3));
        } else {
            if (!faa0Var.isActive()) {
                faa0Var = null;
            }
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
                ven0Var.setValue((Object) null);
                this.e.setValue(oh01.a);
            } else {
                ven0Var.setValue(fn31.T(this.f, (o8n) null, 0, new qh01(dh01Var, this.g, this.h, this.i, this.t, tqwVar, this.X, this.Y, this.e, null), 3));
            }
        }
        return rih1.a;
    }
}
