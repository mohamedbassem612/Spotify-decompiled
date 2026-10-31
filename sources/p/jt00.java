package p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jt00 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jt00(d030 d030Var, d030 d030Var2, n511 n511Var, int i, pg pgVar) {
        this.c = d030Var;
        this.d = d030Var2;
        this.e = n511Var;
        this.b = i;
        this.f = pgVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    public final Object invoke(Object obj) {
        int iU;
        byte b = this.a;
        Object obj2 = this.f;
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj4;
                err0 err0Var = (hdn0) obj2;
                elb0 elb0Var = (elb0) obj;
                ven0Var.setValue(elb0Var);
                ((hdn0) obj3).t((int) (elb0Var.b() >> 32));
                View view = ((oql1) obj5).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i2 = rect.top;
                int i3 = rect.bottom;
                elb0 elb0Var2 = (elb0) ven0Var.getValue();
                n511 n511VarG = (elb0Var2 == null || !elb0Var2.a()) ? n511.e : anm1.g(elb0Var2.p(0L), o0c.R(elb0Var2.b()));
                int i4 = i2 + i;
                int i5 = i3 - i;
                float f = n511VarG.b;
                if (f <= i3) {
                    float f2 = n511VarG.d;
                    if (f2 < i2) {
                        iU = i5 - i4;
                    } else {
                        iU = jch0.U(Math.max(f - i4, i5 - f2));
                    }
                } else {
                    iU = i5 - i4;
                }
                err0Var.t(Math.max(iU, 0));
                return rih1.a;
            default:
                d030 d030Var = (d030) obj4;
                n511 n511Var = (n511) obj3;
                pg pgVar = (pg) obj2;
                yqa yqaVar = (yqa) obj;
                if (((d030) obj5) != oap1.C(d030Var).getFocusOwner().h()) {
                    return Boolean.TRUE;
                }
                boolean zI0 = irn1.i0(i, pgVar, d030Var, n511Var);
                Boolean boolValueOf = Boolean.valueOf(zI0);
                if (zI0 || !yqaVar.a()) {
                    return boolValueOf;
                }
                return null;
        }
    }

    public /* synthetic */ jt00(oql1 oql1Var, int i, ven0 ven0Var, hdn0 hdn0Var, hdn0 hdn0Var2) {
        this.c = oql1Var;
        this.b = i;
        this.d = ven0Var;
        this.e = hdn0Var;
        this.f = hdn0Var2;
    }
}
