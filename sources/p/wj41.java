package p;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wj41 {
    public final List a;
    public final qk41 b;
    public final AtomicBoolean c;
    public final bpb1 d;
    public final bpb1 e;
    public final bpb1 f;
    public final xe01 g;

    public wj41(List list) {
        qk41 qk41Var;
        this.a = list;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            qk41 qk41Var2 = ((bk41) it.next()).c;
            while (it.hasNext()) {
                qk41 qk41Var3 = ((bk41) it.next()).c;
                if (qk41Var2.compareTo(qk41Var3) < 0) {
                    qk41Var2 = qk41Var3;
                }
            }
            qk41Var = qk41Var2;
        } else {
            qk41Var = null;
        }
        this.b = qk41Var;
        this.c = new AtomicBoolean(false);
        Boolean bool = Boolean.FALSE;
        this.d = gio1.b(bool);
        this.e = gio1.b(bool);
        bpb1 bpb1VarB = gio1.b(Integer.MIN_VALUE);
        this.f = bpb1VarB;
        this.g = d5p1.h(bpb1VarB);
    }

    public final void a(i2c i2cVar, ycl1 ycl1Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(454881001);
        i2c i2cVar2 = i2cVar;
        int i2 = (i & 6) == 0 ? (b0kVar2.i(i2cVar2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar2.g(ycl1Var) : b0kVar2.i(ycl1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(this) ? 256 : 128;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarH = rwq.h(this.d, b0kVar2, 0);
            ven0 ven0VarH2 = rwq.h(this.e, b0kVar2, 0);
            ven0 ven0VarH3 = rwq.h(this.f, b0kVar2, 0);
            for (bk41 bk41Var : this.a) {
                b0kVar2.i0(-946013645);
                bk41Var.a(i2cVar2, new rk41(((Boolean) ven0VarH.getValue()).booleanValue(), ((Boolean) ven0VarH2.getValue()).booleanValue(), ycl1Var), ((Number) ven0VarH3.getValue()).intValue(), b0kVar2, i2 & 14);
                b0kVar2.r(false);
                i2cVar2 = i2cVar;
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, i2cVar, ycl1Var, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        uj41 uj41Var;
        Iterator it;
        int i;
        if (onmVar instanceof uj41) {
            uj41Var = (uj41) onmVar;
            int i2 = uj41Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uj41Var.e = i2 - Integer.MIN_VALUE;
            } else {
                uj41Var = new uj41(this, onmVar);
            }
        } else {
            uj41Var = new uj41(this, onmVar);
        }
        Object obj = uj41Var.c;
        int i3 = uj41Var.e;
        if (i3 == 0) {
            hm5.M(obj);
            if (this.c.getAndSet(false)) {
                it = this.a.iterator();
                i = 0;
            }
            return rih1.a;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = uj41Var.b;
        it = uj41Var.a;
        hm5.M(obj);
        while (it.hasNext()) {
            bk41 bk41Var = (bk41) it.next();
            uj41Var.a = it;
            uj41Var.b = i;
            uj41Var.e = 1;
            Object objB = bk41Var.b(uj41Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        vj41 vj41Var;
        Iterator it;
        int i;
        if (onmVar instanceof vj41) {
            vj41Var = (vj41) onmVar;
            int i2 = vj41Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vj41Var.e = i2 - Integer.MIN_VALUE;
            } else {
                vj41Var = new vj41(this, onmVar);
            }
        } else {
            vj41Var = new vj41(this, onmVar);
        }
        Object obj = vj41Var.c;
        int i3 = vj41Var.e;
        if (i3 == 0) {
            hm5.M(obj);
            if (this.c.getAndSet(true)) {
                eg.m("Composition is already initialized");
                return null;
            }
            it = this.a.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = vj41Var.b;
            it = vj41Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            bk41 bk41Var = (bk41) it.next();
            vj41Var.a = it;
            vj41Var.b = i;
            vj41Var.e = 1;
            Object objC = bk41Var.c(vj41Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
