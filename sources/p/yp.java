package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class yp implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final Object emit(Object obj, lnm lnmVar) {
        xp xpVar;
        switch (this.a) {
            case 0:
                if (lnmVar instanceof xp) {
                    xpVar = (xp) lnmVar;
                    int i = xpVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xpVar.b = i - Integer.MIN_VALUE;
                    } else {
                        xpVar = new xp(this, lnmVar);
                    }
                } else {
                    xpVar = new xp(this, lnmVar);
                }
                Object obj2 = xpVar.a;
                d9n d9nVar = d9n.a;
                int i2 = xpVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    vr20 vr20Var = (vr20) this.b;
                    Object obj3 = ((aa80) obj).b;
                    xpVar.b = 1;
                    if (vr20Var.emit(obj3, xpVar) == d9nVar) {
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
            default:
                ((cs) this.b).m = Boolean.valueOf(!((List) obj).isEmpty());
                return rih1.a;
        }
    }
}
