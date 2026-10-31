package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fda0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ haa0 c;

    public /* synthetic */ fda0(vr20 vr20Var, haa0 haa0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = haa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        eda0 eda0Var;
        hda0 hda0Var;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        haa0 haa0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof eda0) {
                    eda0Var = (eda0) lnmVar;
                    int i2 = eda0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        eda0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        eda0Var = new eda0(this, lnmVar);
                    }
                } else {
                    eda0Var = new eda0(this, lnmVar);
                }
                Object obj2 = eda0Var.a;
                int i3 = eda0Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!(((m4o0) obj) instanceof l4o0) && ((no4) ((b0a0) haa0Var.d).a.get()).A());
                    eda0Var.b = 1;
                    return vr20Var.emit(boolValueOf, eda0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof hda0) {
                    hda0Var = (hda0) lnmVar;
                    int i4 = hda0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        hda0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        hda0Var = new hda0(this, lnmVar);
                    }
                } else {
                    hda0Var = new hda0(this, lnmVar);
                }
                Object obj3 = hda0Var.a;
                int i5 = hda0Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    m4o0 m4o0Var = (m4o0) obj;
                    if (m4o0Var instanceof h4o0) {
                        i = 2131962080;
                    } else if (m4o0Var instanceof i4o0) {
                        i = 2131962078;
                    } else if ((m4o0Var instanceof j4o0) || (m4o0Var instanceof l4o0)) {
                        i = 2131962079;
                    } else {
                        eg.o();
                    }
                    String string = ((Context) haa0Var.b).getString(i);
                    hda0Var.b = 1;
                    return vr20Var.emit(string, hda0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
