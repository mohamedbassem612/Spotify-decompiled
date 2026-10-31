package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dsy implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ Map c;

    public /* synthetic */ dsy(vr20 vr20Var, Map map, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = map;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final Object emit(Object obj, lnm lnmVar) {
        cut0 cut0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Map map = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                Object objEmit = vr20Var.emit(sqg0.O(map, (Map) obj), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            default:
                if (lnmVar instanceof cut0) {
                    cut0Var = (cut0) lnmVar;
                    int i = cut0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cut0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        cut0Var = new cut0(this, lnmVar);
                    }
                } else {
                    cut0Var = new cut0(this, lnmVar);
                }
                Object obj2 = cut0Var.a;
                int i2 = cut0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    xtt0 xtt0Var = new xtt0(map, (Map) obj);
                    cut0Var.b = 1;
                    return vr20Var.emit(xtt0Var, cut0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
