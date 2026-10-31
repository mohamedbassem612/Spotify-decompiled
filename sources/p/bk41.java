package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bk41 {
    public final String a;
    public final List b;
    public final qk41 c;

    public bk41(String str, List list) {
        this.a = str;
        this.b = list;
        List list2 = list;
        ArrayList<qk41> arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qj41) it.next()).getDuration());
        }
        nk41 nk41Var = nk41.a;
        qk41 qk41Var = nk41Var;
        for (qk41 qk41Var2 : arrayList) {
            qk41 ok41Var = pk41.a;
            if (!u890.j(qk41Var, ok41Var)) {
                if (u890.j(qk41Var, nk41Var)) {
                    qk41Var = qk41Var2;
                } else {
                    if (!(qk41Var instanceof ok41)) {
                        eg.o();
                        throw null;
                    }
                    if (!u890.j(qk41Var2, ok41Var)) {
                        if (u890.j(qk41Var2, nk41Var)) {
                            continue;
                        } else {
                            if (!(qk41Var2 instanceof ok41)) {
                                eg.o();
                                throw null;
                            }
                            ok41Var = new ok41(((ok41) qk41Var).a + ((ok41) qk41Var2).a);
                        }
                    }
                }
            }
            qk41Var = ok41Var;
        }
        this.c = qk41Var;
    }

    public final void a(i2c i2cVar, rk41 rk41Var, int i, b0k b0kVar, int i2) {
        int i3;
        int i4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-799715280);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.i(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar2.g(rk41Var) : b0kVar2.i(rk41Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= b0kVar2.e(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? b0kVar2.g(this) : b0kVar2.i(this) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String str = this.a;
            boolean zG = b0kVar2.g(str) | ((i3 & 896) == 256);
            Object objT = b0kVar2.T();
            if (zG || objT == m4cVar) {
                objT = bb00.h(0, b0kVar2);
            }
            err0 err0Var = (hdn0) objT;
            err0 err0Var2 = err0Var;
            b0kVar2.f0(272769129, b0kVar2.K(str, Integer.valueOf(err0Var2.s())));
            int iS = err0Var2.s();
            List list = this.b;
            if (iS < list.size()) {
                b0kVar2.i0(-134022585);
                qj41 qj41Var = (qj41) list.get(err0Var2.s());
                boolean zI = b0kVar2.i(err0Var);
                Object objT2 = b0kVar2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new xh6(err0Var, (byte) 4);
                    b0kVar2.s0(objT2);
                }
                qj41Var.a(i2cVar, i4, rk41Var, (Function0) objT2, b0kVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896));
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-133858254);
                b0kVar2.r(false);
            }
            b0kVar2.r(false);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(this, i2cVar, rk41Var, i, i2, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        zj41 zj41Var;
        Iterator it;
        int i;
        if (onmVar instanceof zj41) {
            zj41Var = (zj41) onmVar;
            int i2 = zj41Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zj41Var.e = i2 - Integer.MIN_VALUE;
            } else {
                zj41Var = new zj41(this, onmVar);
            }
        } else {
            zj41Var = new zj41(this, onmVar);
        }
        Object obj = zj41Var.c;
        int i3 = zj41Var.e;
        if (i3 == 0) {
            hm5.M(obj);
            it = this.b.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = zj41Var.b;
            it = zj41Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            qj41 qj41Var = (qj41) it.next();
            zj41Var.a = it;
            zj41Var.b = i;
            zj41Var.e = 1;
            Object objC = qj41Var.c(zj41Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        ak41 ak41Var;
        Iterator it;
        int i;
        if (onmVar instanceof ak41) {
            ak41Var = (ak41) onmVar;
            int i2 = ak41Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ak41Var.e = i2 - Integer.MIN_VALUE;
            } else {
                ak41Var = new ak41(this, onmVar);
            }
        } else {
            ak41Var = new ak41(this, onmVar);
        }
        Object obj = ak41Var.c;
        int i3 = ak41Var.e;
        if (i3 == 0) {
            hm5.M(obj);
            it = this.b.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ak41Var.b;
            it = ak41Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            qj41 qj41Var = (qj41) it.next();
            ak41Var.a = it;
            ak41Var.b = i;
            ak41Var.e = 1;
            Object objB = qj41Var.b(ak41Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
