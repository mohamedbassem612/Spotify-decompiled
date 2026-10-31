package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class weo0 {
    public final du41 a;
    public final vu30 b;
    public wat c;
    public boolean d;
    public final jut e = new jut((byte) 1);

    public weo0(du41 du41Var, vu30 vu30Var, wat watVar) {
        this.a = du41Var;
        this.b = vu30Var;
        this.c = watVar;
    }

    public static void a(bav0 bav0Var) {
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((hav0) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(vu30 vu30Var, onm onmVar) {
        veo0 veo0Var;
        if (onmVar instanceof veo0) {
            veo0Var = (veo0) onmVar;
            int i = veo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                veo0Var.c = i - Integer.MIN_VALUE;
            } else {
                veo0Var = new veo0(this, onmVar);
            }
        } else {
            veo0Var = new veo0(this, onmVar);
        }
        Object obj = veo0Var.a;
        int i2 = veo0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            this.d = true;
            m3n0 m3n0Var = new m3n0(this, vu30Var, (lnm) null, (byte) 20);
            veo0Var.c = 1;
            Object objH = guo1.H(m3n0Var, veo0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.d = false;
        return rih1.a;
    }
}
