package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z2c1 implements zob1 {
    public final /* synthetic */ byte a = 0;
    public final zob1 b;
    public final cv30 c;

    public z2c1(iu30 iu30Var, zob1 zob1Var) {
        this.c = iu30Var;
        this.b = zob1Var;
    }

    public final List c() {
        switch (this.a) {
            case 0:
                return Collections.singletonList(getValue());
            default:
                return this.b.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        y2c1 y2c1Var;
        fnc1 fnc1Var;
        byte b = this.a;
        no70 no70Var = this.c;
        zob1 zob1Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof y2c1) {
                    y2c1Var = (y2c1) lnmVar;
                    int i = y2c1Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y2c1Var.c = i - Integer.MIN_VALUE;
                    } else {
                        y2c1Var = new y2c1(this, lnmVar);
                    }
                } else {
                    y2c1Var = new y2c1(this, lnmVar);
                }
                Object obj = y2c1Var.a;
                int i2 = y2c1Var.c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new dt61(zob1Var, (iu30) no70Var, (byte) 1));
                y2c1Var.c = 1;
                if (mr20VarU.collect(vr20Var, y2c1Var) == d9nVar) {
                    return d9nVar;
                }
                eg.m("StateFlow.collect never completes");
                return null;
            default:
                if (lnmVar instanceof fnc1) {
                    fnc1Var = (fnc1) lnmVar;
                    int i3 = fnc1Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fnc1Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        fnc1Var = new fnc1(this, lnmVar);
                    }
                } else {
                    fnc1Var = new fnc1(this, lnmVar);
                }
                Object obj2 = fnc1Var.a;
                int i4 = fnc1Var.c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj2);
                    }
                    return null;
                }
                hm5.M(obj2);
                cnc1 cnc1Var = new cnc1(vr20Var, no70Var);
                fnc1Var.c = 1;
                if (zob1Var.collect(cnc1Var, fnc1Var) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
        }
    }

    public final Object getValue() {
        byte b = this.a;
        zob1 zob1Var = this.b;
        switch (b) {
            case 0:
                return this.c.invoke(zob1Var.getValue());
            default:
                return zob1Var.getValue();
        }
    }

    public z2c1(zob1 zob1Var, no70 no70Var) {
        this.b = zob1Var;
        this.c = no70Var;
    }
}
