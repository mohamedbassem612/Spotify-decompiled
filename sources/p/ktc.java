package p;

import android.content.ComponentName;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ktc implements m111 {
    public final zhq0 a;
    public final mih0 b;
    public final sp00 c;
    public s2t d;
    public final xgn0 e = ygn0.a();

    public ktc(zhq0 zhq0Var, mih0 mih0Var, sp00 sp00Var) {
        this.a = zhq0Var;
        this.b = mih0Var;
        this.c = sp00Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.m111
    public final Object a(onm onmVar) throws Throwable {
        htc htcVar;
        vgn0 vgn0Var;
        int i;
        Throwable th;
        vgn0 vgn0Var2;
        s2t s2tVar;
        Object objS;
        l111 m231Var;
        l2t l2tVar;
        Object objE;
        if (onmVar instanceof htc) {
            htcVar = (htc) onmVar;
            int i2 = htcVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                htcVar.e = i2 - Integer.MIN_VALUE;
            } else {
                htcVar = new htc(this, onmVar);
            }
        } else {
            htcVar = new htc(this, onmVar);
        }
        Object obj = htcVar.c;
        int i3 = htcVar.e;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                vgn0Var = this.e;
                htcVar.a = vgn0Var;
                i = 0;
                htcVar.b = 0;
                htcVar.e = 1;
                if (vgn0Var.a(htcVar) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = htcVar.a;
                try {
                    hm5.M(obj);
                    l2t l2tVar2 = (l2t) obj;
                    vgn0Var = vgn0Var2;
                    l2tVar = l2tVar2;
                    l2tVar = s2tVar;
                    vgn0Var.c(null);
                    htcVar.a = null;
                    htcVar.e = 3;
                    objE = l2tVar.E(htcVar);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    return objE;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c(null);
                    throw th;
                }
            }
            i = htcVar.b;
            vgn0 vgn0Var3 = htcVar.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            s2tVar = this.d;
            if (s2tVar == null) {
                ry5 ry5Var = new ry5(this, (lnm) null, (byte) 29);
                htcVar.a = vgn0Var;
                htcVar.b = i;
                htcVar.e = 2;
                objS = smo1.s(ry5Var, htcVar);
                if (objS != d9nVar) {
                    vgn0 vgn0Var4 = vgn0Var;
                    obj = objS;
                    vgn0Var2 = vgn0Var4;
                    l2t l2tVar3 = (l2t) obj;
                    vgn0Var = vgn0Var2;
                    l2tVar = l2tVar3;
                    l2tVar = s2tVar;
                    vgn0Var.c(null);
                    htcVar.a = null;
                    htcVar.e = 3;
                    objE = l2tVar.E(htcVar);
                    if (objE == d9nVar) {
                        return objE;
                    }
                }
            } else {
                if (!s2tVar.isActive()) {
                    if (s2tVar.v() && !s2tVar.isCancelled()) {
                        try {
                            l2tVar = s2tVar;
                            m231Var = (l111) s2tVar.Z();
                        } catch (Throwable th3) {
                            m231Var = new m231(th3);
                        }
                        if (!(m231Var instanceof m231)) {
                            l2tVar = s2tVar;
                        }
                    }
                    l2tVar = s2tVar;
                    l2tVar = s2tVar;
                    this.d = null;
                    ry5 ry5Var2 = new ry5(this, (lnm) null, (byte) 29);
                    htcVar.a = vgn0Var;
                    htcVar.b = i;
                    htcVar.e = 2;
                    objS = smo1.s(ry5Var2, htcVar);
                    if (objS != d9nVar) {
                        vgn0 vgn0Var5 = vgn0Var;
                        obj = objS;
                        vgn0Var2 = vgn0Var5;
                        l2t l2tVar4 = (l2t) obj;
                        vgn0Var = vgn0Var2;
                        l2tVar = l2tVar4;
                    }
                }
                l2tVar = s2tVar;
                vgn0Var.c(null);
                htcVar.a = null;
                htcVar.e = 3;
                objE = l2tVar.E(htcVar);
                if (objE == d9nVar) {
                    return objE;
                }
            }
            return d9nVar;
        } catch (Throwable th4) {
            vgn0 vgn0Var6 = vgn0Var;
            th = th4;
            vgn0Var2 = vgn0Var6;
            vgn0Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        itc itcVar;
        if (onmVar instanceof itc) {
            itcVar = (itc) onmVar;
            int i = itcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                itcVar.c = i - Integer.MIN_VALUE;
            } else {
                itcVar = new itc(this, onmVar);
            }
        } else {
            itcVar = new itc(this, onmVar);
        }
        Object objU = itcVar.a;
        int i2 = itcVar.c;
        if (i2 == 0) {
            hm5.M(objU);
            itcVar.c = 1;
            objU = this.c.u(itcVar);
            Object obj = d9n.a;
            if (objU == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        return new l111((List) objU, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ComponentName componentName, onm onmVar) {
        jtc jtcVar;
        List list;
        if (onmVar instanceof jtc) {
            jtcVar = (jtc) onmVar;
            int i = jtcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtcVar.d = i - Integer.MIN_VALUE;
            } else {
                jtcVar = new jtc(this, onmVar);
            }
        } else {
            jtcVar = new jtc(this, onmVar);
        }
        Object objP = jtcVar.b;
        int i2 = jtcVar.d;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                long jA = ltc.a();
                hsc hscVar = new hsc(this, componentName, (lnm) null, (byte) 1);
                jtcVar.d = 1;
                objP = rc2.P(jA, hscVar, jtcVar);
                if (objP == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                } else if (i2 == 3 || i2 == 4) {
                    List list2 = jtcVar.a;
                } else {
                    if (i2 != 5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = jtcVar.a;
                    hm5.M(objP);
                }
                hm5.M(objP);
                return objP;
            }
            hm5.M(objP);
            return new l111(list, 1);
            List list3 = (List) objP;
            if (list3 == null) {
                jtcVar.a = null;
                jtcVar.d = 3;
                Object objB = b(jtcVar);
                if (objB != d9nVar) {
                    return objB;
                }
            } else if (list3.isEmpty()) {
                jtcVar.a = null;
                jtcVar.d = 4;
                Object objB2 = b(jtcVar);
                if (objB2 != d9nVar) {
                    return objB2;
                }
            } else {
                jtcVar.a = list3;
                jtcVar.d = 5;
                if (this.c.z(list3, jtcVar) != d9nVar) {
                    list = list3;
                    return new l111(list, 1);
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            jtcVar.a = null;
            jtcVar.d = 2;
            Object objB3 = b(jtcVar);
            if (objB3 != d9nVar) {
                return objB3;
            }
        }
        return d9nVar;
    }
}
