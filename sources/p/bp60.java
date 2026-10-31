package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bp60 {
    public final c9n a;
    public final dt0 b;
    public final Object c = new Object();
    public final bpb1 d;
    public final xe01 e;
    public ArrayList f;
    public int g;
    public xab1 h;
    public boolean i;

    public bp60(c9n c9nVar, dt0 dt0Var) {
        this.a = c9nVar;
        this.b = dt0Var;
        bpb1 bpb1VarB = gio1.b(null);
        this.d = bpb1VarB;
        this.e = d5p1.h(bpb1VarB);
        fn31.T(c9nVar, (o8n) null, 0, new j020(this, (lnm) null, (byte) 24), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, onm onmVar) {
        ap60 ap60Var;
        String str;
        Object next;
        if (onmVar instanceof ap60) {
            ap60Var = (ap60) onmVar;
            int i2 = ap60Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ap60Var.d = i2 - Integer.MIN_VALUE;
            } else {
                ap60Var = new ap60(this, onmVar);
            }
        } else {
            ap60Var = new ap60(this, onmVar);
        }
        Object objInvoke = ap60Var.b;
        d9n d9nVar = d9n.a;
        int i3 = ap60Var.d;
        if (i3 == 0) {
            hm5.M(objInvoke);
            dt0 dt0Var = this.b;
            ap60Var.a = i;
            ap60Var.d = 1;
            objInvoke = dt0Var.invoke(ap60Var);
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ap60Var.a;
            hm5.M(objInvoke);
        }
        l2n l2nVar = objInvoke instanceof l2n ? (l2n) objInvoke : null;
        if (l2nVar == null) {
            return rih1.a;
        }
        ArrayList arrayList = l2nVar.a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Iterator it2 = ((zs80) it.next()).c.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (ihc1.y0(((iys0) next).e));
            iys0 iys0Var = (iys0) next;
            str = iys0Var != null ? iys0Var.e : null;
        } while (str == null);
        if (str == null) {
            return rih1.a;
        }
        synchronized (this.c) {
            if (i != this.g) {
                return rih1.a;
            }
            this.f = arrayList;
            bpb1 bpb1Var = this.d;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, str);
            return rih1.a;
        }
    }

    public final xe01 b() {
        return this.e;
    }

    public final void c() {
        synchronized (this.c) {
            if (((Number) this.d.j().getValue()).intValue() == 0) {
                this.i = true;
                return;
            }
            this.i = false;
            int i = this.g + 1;
            this.g = i;
            xab1 xab1Var = this.h;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.h = fn31.T(this.a, (o8n) null, 0, new cy9(this, i, (lnm) null, (byte) 7), 3);
        }
    }
}
