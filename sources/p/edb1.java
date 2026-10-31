package p;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class edb1 implements s160 {
    public final eq4 N0;
    public final o3r O0;
    public final ay8 P0;
    public final z9k0 Q0;
    public final ywv0 R0;
    public final smc0 S0;
    public final o3r T0;
    public final r2a1 U0;
    public final yd91 V0;
    public final h9k0 X;
    public final zwp Y;
    public final yeq Z;
    public final c9c0 a;
    public final d0r b;
    public final yzc0 c;
    public final String d;
    public final kqi0 e;
    public final kt91 f;
    public final g0l g;
    public final rxj0 h;
    public final e7p0 i;
    public final jyo t;

    public edb1(c9c0 c9c0Var, d0r d0rVar, yzc0 yzc0Var, String str, z6k0 z6k0Var, kqi0 kqi0Var, kt91 kt91Var, g0l g0lVar, rxj0 rxj0Var, kmj1 kmj1Var, h5q h5qVar, e7p0 e7p0Var, jyo jyoVar, b9q b9qVar, boolean z, h9k0 h9k0Var, zwp zwpVar, yeq yeqVar, eq4 eq4Var) {
        this.a = c9c0Var;
        this.b = d0rVar;
        this.c = yzc0Var;
        this.d = str;
        this.e = kqi0Var;
        this.f = kt91Var;
        this.g = g0lVar;
        this.h = rxj0Var;
        this.i = e7p0Var;
        this.t = jyoVar;
        this.X = h9k0Var;
        this.Y = zwpVar;
        this.Z = yeqVar;
        this.N0 = eq4Var;
        this.O0 = kmj1Var.a(str);
        this.P0 = vxo1.l(d0rVar, str);
        this.Q0 = b9qVar.a(r6h1.c);
        this.R0 = h5qVar.a((muz) null);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(dlc0.d);
        smc0VarN.add(dlc0.g);
        smc0VarN.add(dlc0.h);
        smc0VarN.add(dlc0.a);
        smc0VarN.add(dlc0.t);
        smc0VarN.add(dlc0.f);
        if (z) {
            smc0VarN.add(dlc0.b);
        }
        this.S0 = k4p1.k(smc0VarN);
        this.T0 = w3p1.n(new l4r(pwc0.b, 1, xcb1.d, new j4r(new l5b1(this, (byte) 10)), xcb1.e), new l4r(jd0.x, 2, xcb1.b, new j4r(v3b1.c1), xcb1.c), nva1.h);
        this.U0 = new r2a1(this);
        this.V0 = new yd91(3, new gga1(this, (byte) 15));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        wcb1 wcb1Var;
        if (onmVar instanceof wcb1) {
            wcb1Var = (wcb1) onmVar;
            int i = wcb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcb1Var.c = i - Integer.MIN_VALUE;
            } else {
                wcb1Var = new wcb1(this, onmVar);
            }
        } else {
            wcb1Var = new wcb1(this, onmVar);
        }
        Object objI = wcb1Var.a;
        int i2 = wcb1Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            jha1 jha1Var = new jha1(this.P0, (byte) 6);
            wcb1Var.c = 1;
            objI = b5p1.i(jha1Var, wcb1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        orc0 orc0Var = new orc0[]{nrc0.a}[0];
        Set set = (Set) objI;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = false;
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((orc0) it.next()).getClass() == orc0Var.getClass()) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object b(yzc0 yzc0Var, tv80 tv80Var, onm onmVar) {
        cdb1 cdb1Var;
        boolean zBooleanValue;
        tv80 tv80Var2;
        if (onmVar instanceof cdb1) {
            cdb1Var = (cdb1) onmVar;
            int i = cdb1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdb1Var.e = i - Integer.MIN_VALUE;
            } else {
                cdb1Var = new cdb1(this, onmVar);
            }
        } else {
            cdb1Var = new cdb1(this, onmVar);
        }
        Object objC = cdb1Var.c;
        int i2 = cdb1Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            cdb1Var.a = yzc0Var;
            cdb1Var.b = tv80Var;
            cdb1Var.e = 1;
            objC = this.R0.c(this.d, cdb1Var);
            if (objC != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            tv80Var = cdb1Var.b;
            yzc0Var = cdb1Var.a;
            hm5.M(objC);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80Var2 = cdb1Var.b;
            hm5.M(objC);
        }
        zBooleanValue = ((Boolean) objC).booleanValue();
        e7p0.d(this.i, tv80Var2.a);
        return Boolean.valueOf(zBooleanValue);
        ndj1 ndj1Var = (ndj1) objC;
        if (u890.j(ndj1Var, ndj1.c)) {
            yjp1 yjp1Var = tjy0.a;
            cdb1Var.a = null;
            cdb1Var.b = tv80Var;
            cdb1Var.e = 2;
            objC = yzc0Var.b(tv80Var, yjp1Var, cdb1Var);
            if (objC != d9nVar) {
                tv80Var2 = tv80Var;
                zBooleanValue = ((Boolean) objC).booleanValue();
                e7p0.d(this.i, tv80Var2.a);
            }
            return d9nVar;
        }
        if (u890.j(ndj1Var, ndj1.b)) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963769});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            this.f.k(new er91((fs91) null, "", 2131963769, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else if (!u890.j(ndj1Var, ndj1.a)) {
            eg.o();
            return null;
        }
        zBooleanValue = false;
        return Boolean.valueOf(zBooleanValue);
    }

    public final l381 c() {
        return this.U0;
    }

    public final yd91 d() {
        return this.V0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(p9n0 p9n0Var, onm onmVar) {
        ddb1 ddb1Var;
        if (onmVar instanceof ddb1) {
            ddb1Var = (ddb1) onmVar;
            int i = ddb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ddb1Var.c = i - Integer.MIN_VALUE;
            } else {
                ddb1Var = new ddb1(this, onmVar);
            }
        } else {
            ddb1Var = new ddb1(this, onmVar);
        }
        Object objK = ddb1Var.a;
        int i2 = ddb1Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            mr20 mr20Var = p9n0Var.b;
            ddb1Var.c = 1;
            objK = b5p1.k(mr20Var, ddb1Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        Boolean bool = (Boolean) objK;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
