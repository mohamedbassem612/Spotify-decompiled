package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wv20 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public wv20(vr20 vr20Var, String str, boolean z) {
        this.a = vr20Var;
        this.b = str;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object emit(Object obj, lnm lnmVar) {
        vv20 vv20Var;
        if (lnmVar instanceof vv20) {
            vv20Var = (vv20) lnmVar;
            int i = vv20Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vv20Var.b = i - Integer.MIN_VALUE;
            } else {
                vv20Var = new vv20(this, lnmVar);
            }
        } else {
            vv20Var = new vv20(this, lnmVar);
        }
        Object obj2 = vv20Var.a;
        int i2 = vv20Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Boolean boolM = yah0.m(yto.k((String) ((Map) obj).get(this.b), this.c));
            vv20Var.b = 1;
            Object objEmit = this.a.emit(boolM, vv20Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
