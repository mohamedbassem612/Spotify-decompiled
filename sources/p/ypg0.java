package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ypg0 implements zob1 {
    public final zob1 a;
    public final iu30 b;

    public ypg0(iu30 iu30Var, zob1 zob1Var) {
        this.a = zob1Var;
        this.b = iu30Var;
    }

    public final List c() {
        List listC = this.a.c();
        ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        wpg0 wpg0Var;
        if (lnmVar instanceof wpg0) {
            wpg0Var = (wpg0) lnmVar;
            int i = wpg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wpg0Var.c = i - Integer.MIN_VALUE;
            } else {
                wpg0Var = new wpg0(this, lnmVar);
            }
        } else {
            wpg0Var = new wpg0(this, lnmVar);
        }
        Object obj = wpg0Var.a;
        int i2 = wpg0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            a8d0 a8d0Var = new a8d0(vr20Var, this, (byte) 24);
            wpg0Var.c = 1;
            Object objCollect = this.a.collect(a8d0Var, wpg0Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }

    public final Object getValue() {
        return this.b.invoke(this.a.getValue());
    }
}
