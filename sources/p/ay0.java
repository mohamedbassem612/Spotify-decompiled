package p;

import com.spotify.base.java.logging.Logger;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ay0 {
    public final jx0 a;
    public final me91 b;
    public final be91 c;
    public final qr20 d;
    public final q8n e;
    public final bpb1 f;
    public ayh g;
    public faa0 h;
    public final xe01 i;

    public ay0(jx0 jx0Var, me91 me91Var, be91 be91Var, qr20 qr20Var, q8n q8nVar) {
        this.a = jx0Var;
        this.b = me91Var;
        this.c = be91Var;
        this.d = qr20Var;
        this.e = q8nVar;
        bpb1 bpb1VarB = gio1.b(ox0.a);
        this.f = bpb1VarB;
        this.g = sap1.a();
        this.i = d5p1.h(bpb1VarB);
    }

    public static Object b(ay0 ay0Var, Map map, onm onmVar, int i) {
        if ((i & 1) != 0) {
            map = b7x.a;
        }
        return c(ay0Var, map, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(ay0 ay0Var, Map map, onm onmVar) {
        vx0 vx0Var;
        if (onmVar instanceof vx0) {
            vx0Var = (vx0) onmVar;
            int i = vx0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx0Var.d = i - Integer.MIN_VALUE;
            } else {
                vx0Var = new vx0(onmVar);
            }
        } else {
            vx0Var = new vx0(onmVar);
        }
        Object objA = vx0Var.c;
        int i2 = vx0Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            vx0Var.a = ay0Var;
            vx0Var.b = map;
            vx0Var.d = 1;
            objA = ay0Var.a(vx0Var);
            if (objA != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objA);
                return objA;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        map = vx0Var.b;
        ay0Var = vx0Var.a;
        hm5.M(objA);
        Map map2 = map;
        if (!((Boolean) objA).booleanValue()) {
            return new nc91(l1d.m("awaitInitialization fail for slot ", ay0Var.a.a));
        }
        Logger.g(f4i1.f("Performing immediate fetch for slot ", ay0Var.a.a, "."), new Object[0]);
        be91 be91Var = ay0Var.c;
        jx0 jx0Var = ay0Var.a;
        vx0Var.a = null;
        vx0Var.b = null;
        vx0Var.d = 2;
        Object objH = c921.H(be91Var.e, new uk71(jx0Var, map2, be91Var, (lnm) null, (byte) 16), vx0Var);
        return objH == d9nVar ? d9nVar : objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        ux0 ux0Var;
        if (onmVar instanceof ux0) {
            ux0Var = (ux0) onmVar;
            int i = ux0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ux0Var.c = i - Integer.MIN_VALUE;
            } else {
                ux0Var = new ux0(this, onmVar);
            }
        } else {
            ux0Var = new ux0(this, onmVar);
        }
        Object objP = ux0Var.a;
        int i2 = ux0Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            ytw0 ytw0Var = jfv.b;
            long jL0 = fdg1.l0(30L, ngv.e);
            sx0 sx0Var = new sx0(this, (lnm) null, (byte) 2);
            ux0Var.c = 1;
            objP = rc2.P(jL0, sx0Var, ux0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        Boolean bool = (Boolean) objP;
        return yah0.m(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00ab, please report this as an issue */
    public final Object d(qc91 qc91Var, Map map, onm onmVar) {
        wx0 wx0Var;
        qc91 qc91Var2;
        Map map2;
        Object objA;
        qc91 qc91Var3;
        rc91 rc91Var;
        jx0 jx0Var = this.a;
        String str = jx0Var.a;
        if (onmVar instanceof wx0) {
            wx0Var = (wx0) onmVar;
            int i = wx0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wx0Var.e = i - Integer.MIN_VALUE;
            } else {
                wx0Var = new wx0(this, onmVar);
            }
        } else {
            wx0Var = new wx0(this, onmVar);
        }
        wx0 wx0Var2 = wx0Var;
        Object objA2 = wx0Var2.c;
        int i2 = wx0Var2.e;
        rih1 rih1Var = rih1.a;
        ox0 ox0Var = ox0.a;
        bpb1 bpb1Var = this.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA2);
            qc91Var2 = qc91Var;
            wx0Var2.a = qc91Var2;
            map2 = map;
            wx0Var2.b = map2;
            wx0Var2.e = 1;
            objA = a(wx0Var2);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            map2 = wx0Var2.b;
            qc91 qc91Var4 = wx0Var2.a;
            hm5.M(objA2);
            objA = objA2;
            qc91Var2 = qc91Var4;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qc91Var3 = wx0Var2.a;
            hm5.M(objA2);
        }
        rc91Var = (tc91) objA2;
        if (rc91Var instanceof rc91) {
            Logger.g("Failed to perform " + qc91Var3 + " on slot " + str + ". Error: " + rc91Var.a(), new Object[0]);
            bpb1Var.m((Object) null, ox0Var);
        }
        return rih1Var;
        if (!((Boolean) objA).booleanValue()) {
            bpb1Var.m((Object) null, ox0Var);
            return rih1Var;
        }
        Logger.g("Performing " + qc91Var2 + " for slot " + str + ".", new Object[0]);
        wx0Var2.a = qc91Var2;
        wx0Var2.b = null;
        wx0Var2.e = 2;
        qc91 qc91Var5 = qc91Var2;
        objA2 = be91.a(this.c, jx0Var, qc91Var5, map2, wx0Var2, 8);
        if (objA2 != d9nVar) {
            qc91Var3 = qc91Var5;
            rc91Var = (tc91) objA2;
            if (rc91Var instanceof rc91) {
                Logger.g("Failed to perform " + qc91Var3 + " on slot " + str + ". Error: " + rc91Var.a(), new Object[0]);
                bpb1Var.m((Object) null, ox0Var);
            }
            return rih1Var;
        }
        return d9nVar;
    }

    public final Object e(onm onmVar) {
        Object objD = d(qc91.NOW, b7x.a, onmVar);
        return objD == d9n.a ? objD : rih1.a;
    }

    public final void f() {
        faa0 faa0Var = this.h;
        lnm lnmVar = null;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.g = sap1.a();
        this.h = c921.y(smo1.e(this.e), (o8n) null, 0, new zx0(this, lnmVar, (byte) 0), 3);
    }

    public final void g() {
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.f.m((Object) null, ox0.a);
    }
}
