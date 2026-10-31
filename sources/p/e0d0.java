package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e0d0 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ boolean b;

    public e0d0(vr20 vr20Var, boolean z) {
        this.a = vr20Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        d0d0 d0d0Var;
        if (lnmVar instanceof d0d0) {
            d0d0Var = (d0d0) lnmVar;
            int i = d0d0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0d0Var.b = i - Integer.MIN_VALUE;
            } else {
                d0d0Var = new d0d0(this, lnmVar);
            }
        } else {
            d0d0Var = new d0d0(this, lnmVar);
        }
        Object obj2 = d0d0Var.a;
        int i2 = d0d0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Set) obj) {
                orc0 orc0Var = (orc0) obj3;
                if (!(orc0Var instanceof jrc0) || this.b) {
                    if (!(orc0Var instanceof wqc0)) {
                        arrayList.add(obj3);
                    }
                }
            }
            Set setP1 = o7h.p1(arrayList);
            d0d0Var.b = 1;
            Object objEmit = this.a.emit(setP1, d0d0Var);
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
