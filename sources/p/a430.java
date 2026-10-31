package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a430 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ p330 c;

    public /* synthetic */ a430(vr20 vr20Var, p330 p330Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = p330Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        z330 z330Var;
        b430 b430Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p330 p330Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof z330) {
                    z330Var = (z330) lnmVar;
                    int i = z330Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z330Var.b = i - Integer.MIN_VALUE;
                    } else {
                        z330Var = new z330(this, lnmVar);
                    }
                } else {
                    z330Var = new z330(this, lnmVar);
                }
                Object obj2 = z330Var.a;
                int i2 = z330Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                f7h f7hVar = (f7h) ((Map) obj).get(p330Var.a);
                Boolean boolValueOf = Boolean.valueOf(f7hVar != null ? f7hVar.b : false);
                z330Var.b = 1;
                return vr20Var.emit(boolValueOf, z330Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof b430) {
                    b430Var = (b430) lnmVar;
                    int i3 = b430Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b430Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        b430Var = new b430(this, lnmVar);
                    }
                } else {
                    b430Var = new b430(this, lnmVar);
                }
                Object obj3 = b430Var.a;
                int i4 = b430Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(((ijo) obj).a.contains(p330Var.a));
                    b430Var.b = 1;
                    return vr20Var.emit(boolValueOf2, b430Var) == d9nVar ? d9nVar : rih1Var;
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
