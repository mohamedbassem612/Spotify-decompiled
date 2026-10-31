package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sb6 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ y2r0 c;

    public /* synthetic */ sb6(vr20 vr20Var, y2r0 y2r0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = y2r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        rb6 rb6Var;
        ekx0 ekx0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y2r0 y2r0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof rb6) {
                    rb6Var = (rb6) lnmVar;
                    int i = rb6Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rb6Var.b = i - Integer.MIN_VALUE;
                    } else {
                        rb6Var = new rb6(this, lnmVar);
                    }
                } else {
                    rb6Var = new rb6(this, lnmVar);
                }
                Object obj2 = rb6Var.a;
                int i2 = rb6Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Boolean boolValueOf = Boolean.valueOf(u890.j(((Map) obj).get(y2r0Var.a), Boolean.TRUE));
                    rb6Var.b = 1;
                    return vr20Var.emit(boolValueOf, rb6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof ekx0) {
                    ekx0Var = (ekx0) lnmVar;
                    int i3 = ekx0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ekx0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ekx0Var = new ekx0(this, lnmVar);
                    }
                } else {
                    ekx0Var = new ekx0(this, lnmVar);
                }
                Object obj3 = ekx0Var.a;
                int i4 = ekx0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(u890.j(((Map) obj).get(y2r0Var.a), Boolean.TRUE));
                    ekx0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, ekx0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
