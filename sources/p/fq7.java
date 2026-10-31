package p;

import android.content.Intent;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class fq7 {
    public static b180 a;
    public static b180 b;

    public static luk0 A(Integer num, r6h1 r6h1Var) {
        return new luk0(num, r6h1Var);
    }

    public static final f1r B(uyl uylVar) {
        f4r data;
        f1r f1rVarA;
        if (uylVar instanceof aak1) {
            throw null;
        }
        if (!(uylVar instanceof fuj)) {
            return null;
        }
        fuj fujVar = (fuj) uylVar;
        maa maaVar = fujVar.a;
        wul1 wul1Var = maaVar instanceof wul1 ? (wul1) maaVar : null;
        return (f1r) o7h.s0((wul1Var == null || (data = wul1Var.getData()) == null || (f1rVarA = data.a(fujVar.c)) == null) ? z6x.a : Collections.singletonList(f1rVarA));
    }

    public static final Single C(xov0 xov0Var) {
        return xov0Var.a().map(zov0.b);
    }

    public static final Maybe D(xov0 xov0Var) {
        return xov0Var.a().flatMapMaybe(va20.c1);
    }

    public static final boolean E(kc91 kc91Var, b0k b0kVar) {
        tob1 tob1VarH;
        zob1 zob1VarA = kc91Var.a();
        x340 x340Var = (x340) b0kVar;
        if (zob1VarA == null) {
            x340Var.i0(394917935);
            x340Var.r(false);
            tob1VarH = null;
        } else {
            x340Var.i0(1952401938);
            tob1VarH = rwq.h(zob1VarA, x340Var, 0);
            x340Var.r(false);
        }
        return (tob1VarH == null || ((Boolean) tob1VarH.getValue()).booleanValue()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F(d0r d0rVar, o3r o3rVar, vp7 vp7Var, onm onmVar) {
        bq7 bq7Var;
        if (onmVar instanceof bq7) {
            bq7Var = (bq7) onmVar;
            int i = bq7Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq7Var.b = i - Integer.MIN_VALUE;
            } else {
                bq7Var = new bq7(onmVar);
            }
        } else {
            bq7Var = new bq7(onmVar);
        }
        Object objJ = bq7Var.a;
        int i2 = bq7Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, vp7Var);
            s4 s4Var = new s4(2, (lnm) null, (byte) 17);
            bq7Var.b = 1;
            objJ = b5p1.j(ay8VarF, s4Var, bq7Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (u890.j(i1rVar, j1r.a) || (i1rVar instanceof h1r)) {
            return null;
        }
        if (i1rVar instanceof i1r) {
            return i1rVar.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object G(d0r d0rVar, wh41 wh41Var, gq7 gq7Var, onm onmVar) {
        cq7 cq7Var;
        d0r d0rVar2;
        gq7 gq7Var2;
        wh41 wh41Var2;
        io70 io70Var;
        if (onmVar instanceof cq7) {
            cq7Var = (cq7) onmVar;
            int i = cq7Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cq7Var.e = i - Integer.MIN_VALUE;
            } else {
                cq7Var = new cq7(onmVar);
            }
        } else {
            cq7Var = new cq7(onmVar);
        }
        Object objF = cq7Var.d;
        int i2 = cq7Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            o3r o3rVar = sq7.g;
            vp7 vp7Var = gq7Var.a;
            cq7Var.a = d0rVar;
            cq7Var.b = wh41Var;
            cq7Var.c = gq7Var;
            cq7Var.e = 1;
            objF = F(d0rVar, o3rVar, vp7Var, cq7Var);
            if (objF != d9nVar) {
                d0rVar2 = d0rVar;
                gq7Var2 = gq7Var;
                wh41Var2 = wh41Var;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objF);
                return objF;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gq7 gq7Var3 = cq7Var.c;
        wh41 wh41Var3 = cq7Var.b;
        d0r d0rVar3 = cq7Var.a;
        hm5.M(objF);
        gq7Var2 = gq7Var3;
        wh41Var2 = wh41Var3;
        d0rVar2 = d0rVar3;
        jo70 jo70Var = (jo70) objF;
        if (jo70Var == null || (io70Var = jo70Var.e) == null) {
            return iq7.a;
        }
        sh6 sh6Var = new sh6((byte) 1, jo70Var, d0rVar2, gq7Var2, io70Var.b, wh41Var2, (lnm) null);
        cq7Var.a = null;
        cq7Var.b = null;
        cq7Var.c = null;
        cq7Var.e = 2;
        Object objS = smo1.s(sh6Var, cq7Var);
        return objS == d9nVar ? d9nVar : objS;
    }

    public static final String H(String str, Intent intent) {
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null && stringExtra.length() != 0) {
            return stringExtra;
        }
        hhg1.f("V2 share page missing intent extra: ".concat(str));
        return null;
    }

    public static final pay I(mhg1 mhg1Var, iu30 iu30Var, Object obj, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.f0(-422486566, mhg1Var);
        boolean zG = mhg1Var.g();
        k9 k9Var = mhg1Var.a;
        pay payVar = pay.c;
        pay payVar2 = pay.b;
        pay payVar3 = pay.a;
        if (zG) {
            x340Var.i0(-212166497);
            x340Var.r(false);
            if (((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                payVar = payVar2;
            } else if (!((Boolean) iu30Var.invoke(k9Var.P0())).booleanValue()) {
                payVar = payVar3;
            }
        } else {
            x340Var.i0(-211886815);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object value = mhg1Var.e.getValue();
            if (((Boolean) iu30Var.invoke(k9Var.P0())).booleanValue() || (value != null && ((Boolean) iu30Var.invoke(value)).booleanValue())) {
                ven0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                payVar = payVar2;
            } else if ((value != null && ((Boolean) iu30Var.invoke(value)).booleanValue()) || !((Boolean) ven0Var.getValue()).booleanValue()) {
                payVar = payVar3;
            }
            x340Var.r(false);
        }
        x340Var.r(false);
        return payVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object J(wkt wktVar, p371 p371Var, iu30 iu30Var, iu30 iu30Var2, String str, s7q0 s7q0Var, n3o1 n3o1Var, onm onmVar) {
        xkt xktVar;
        wkt wktVar2;
        p371 p371Var2;
        String str2;
        o571 o571Var;
        wkt wktVar3;
        Object obj;
        s4b1 s4b1Var;
        s7q0 s7q0Var2;
        n3o1 n3o1Var2;
        o571 o571Var2;
        ou80 ou80Var;
        p371 p371Var3;
        n3o1 n3o1Var3 = n3o1Var;
        if (onmVar instanceof xkt) {
            xktVar = (xkt) onmVar;
            int i = xktVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xktVar.i = i - Integer.MIN_VALUE;
            } else {
                xktVar = new xkt(onmVar);
            }
        } else {
            xktVar = new xkt(onmVar);
        }
        Object obj2 = xktVar.h;
        int i2 = xktVar.i;
        if (i2 != 0) {
            if (i2 == 1) {
                ou80 ou80Var2 = xktVar.g;
                s4b1 s4b1Var2 = (s4b1) xktVar.f;
                n3o1 n3o1Var4 = xktVar.e;
                p371 p371Var4 = xktVar.d;
                o571 o571Var3 = xktVar.c;
                s7q0 s7q0Var3 = xktVar.b;
                wkt wktVar4 = xktVar.a;
                hm5.M(obj2);
                ou80Var = ou80Var2;
                wktVar3 = wktVar4;
                n3o1Var2 = n3o1Var4;
                o571Var2 = o571Var3;
                s4b1Var = s4b1Var2;
                obj = obj2;
                p371Var3 = p371Var4;
                s7q0Var2 = s7q0Var3;
                return new tmt(o571Var2, p371Var3, n3o1Var2, s4b1Var, ou80Var, (wgf) obj, s7q0Var2, ((vkt) wktVar3).d);
            }
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = (String) xktVar.f;
            n3o1 n3o1Var5 = xktVar.e;
            p371 p371Var5 = xktVar.d;
            o571Var = xktVar.c;
            wkt wktVar5 = xktVar.a;
            hm5.M(obj2);
            n3o1Var3 = n3o1Var5;
            p371Var2 = p371Var5;
            str2 = str3;
            wktVar2 = wktVar5;
            return new smt(o571Var, p371Var2, n3o1Var3, str2, (bkc0) obj2, ((ukt) wktVar2).c);
        }
        hm5.M(obj2);
        boolean z = wktVar instanceof vkt;
        d9n d9nVar = d9n.a;
        if (z) {
            vkt vktVar = (vkt) wktVar;
            o571 o571Var4 = vktVar.a;
            s4b1 s4b1Var3 = vktVar.b;
            ou80 ou80Var3 = vktVar.c;
            xktVar.a = wktVar;
            xktVar.b = s7q0Var;
            xktVar.c = o571Var4;
            xktVar.d = p371Var;
            xktVar.e = n3o1Var3;
            xktVar.f = s4b1Var3;
            xktVar.g = ou80Var3;
            xktVar.i = 1;
            Object objInvoke = iu30Var.invoke(xktVar);
            if (objInvoke != d9nVar) {
                wktVar3 = wktVar;
                obj = objInvoke;
                s4b1Var = s4b1Var3;
                s7q0Var2 = s7q0Var;
                n3o1Var2 = n3o1Var3;
                o571Var2 = o571Var4;
                ou80Var = ou80Var3;
                p371Var3 = p371Var;
                return new tmt(o571Var2, p371Var3, n3o1Var2, s4b1Var, ou80Var, (wgf) obj, s7q0Var2, ((vkt) wktVar3).d);
            }
        } else {
            if (!(wktVar instanceof ukt)) {
                eg.o();
                return null;
            }
            o571 o571Var5 = ((ukt) wktVar).a;
            xktVar.a = wktVar;
            xktVar.b = null;
            xktVar.c = o571Var5;
            xktVar.d = p371Var;
            xktVar.e = n3o1Var3;
            xktVar.f = str;
            xktVar.i = 2;
            Object objInvoke2 = iu30Var2.invoke(xktVar);
            if (objInvoke2 != d9nVar) {
                wktVar2 = wktVar;
                p371Var2 = p371Var;
                str2 = str;
                o571Var = o571Var5;
                obj2 = objInvoke2;
                return new smt(o571Var, p371Var2, n3o1Var3, str2, (bkc0) obj2, ((ukt) wktVar2).c);
            }
        }
        return d9nVar;
    }

    public static /* synthetic */ Object K(wkt wktVar, p371 p371Var, iu30 iu30Var, iu30 iu30Var2, n7q0 n7q0Var, n3o1 n3o1Var, onm onmVar, int i) {
        if ((i & 16) != 0) {
            n7q0Var = null;
        }
        n7q0 n7q0Var2 = n7q0Var;
        if ((i & 32) != 0) {
            n3o1Var = tsd.c;
        }
        return J(wktVar, p371Var, iu30Var, iu30Var2, "", n7q0Var2, n3o1Var, onmVar);
    }

    public static final us2 L(tv80 tv80Var) {
        String str = tv80Var.a.a;
        if (str.length() <= 0) {
            str = null;
        }
        Boolean boolValueOf = Boolean.valueOf(tv80Var.c);
        String str2 = tv80Var.X;
        if (str2.length() <= 0) {
            str2 = null;
        }
        int i = tv80Var.Y;
        return new us2(str, boolValueOf, str2, i != 0 ? Integer.valueOf(i) : null);
    }

    public static Next M(kak0 kak0Var) {
        return x1p1.t(x1p1.C(x1p1.D(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, kak0Var.h, (String) null, (String) null, (lhg1) null, j8w0.a, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4456449, 1048575)))), 3);
    }

    /* JADX WARN: Code duplicated, block: B:215:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:218:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:220:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:224:0x0512  */
    /* JADX WARN: Code duplicated, block: B:226:0x051e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0536  */
    /* JADX WARN: Code duplicated, block: B:230:0x0544  */
    /* JADX WARN: Code duplicated, block: B:232:0x0550  */
    /* JADX WARN: Code duplicated, block: B:234:0x0568  */
    /* JADX WARN: Code duplicated, block: B:248:0x058d  */
    /* JADX WARN: Code duplicated, block: B:250:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:269:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:272:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:274:0x060a  */
    /* JADX WARN: Code duplicated, block: B:276:0x062b  */
    /* JADX WARN: Code duplicated, block: B:278:0x0645  */
    /* JADX WARN: Code duplicated, block: B:280:0x0651  */
    /* JADX WARN: Code duplicated, block: B:282:0x066a  */
    /* JADX WARN: Code duplicated, block: B:284:0x067c  */
    /* JADX WARN: Code duplicated, block: B:285:0x0699  */
    /* JADX WARN: Code duplicated, block: B:291:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:295:0x0704  */
    /* JADX WARN: Code duplicated, block: B:299:0x072a  */
    /* JADX WARN: Code duplicated, block: B:302:0x077a  */
    /* JADX WARN: Code duplicated, block: B:303:0x0785  */
    /* JADX WARN: Code duplicated, block: B:306:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:308:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:309:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:312:0x07e2  */
    public static final void a(mhg1 mhg1Var, iu30 iu30Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, vu30 vu30Var, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        eg41 eg41Var;
        boolean z;
        eb91 eb91Var;
        cfe cfeVar;
        oig1 oig1Var;
        mhg1 mhg1Var2;
        boolean z2;
        boolean z3;
        tzg1 tzg1Var;
        mhg1 mhg1Var3;
        zgg1 zgg1Var;
        zgg1 zgg1Var2;
        zgg1 zgg1Var3;
        boolean z4;
        je31 je31Var;
        nui1 nui1Var;
        nui1 nui1Var2;
        boolean z5;
        boolean z6;
        tzg1 tzg1Var2;
        zgg1 zgg1Var4;
        boolean z7;
        zgg1 zgg1Var5;
        zgg1 zgg1VarN;
        boolean zI;
        Object objT;
        bby bbyVar2;
        ln00 ln00Var2;
        boolean zI2;
        Object objT2;
        boolean zH;
        Object objT3;
        Object objT4;
        dd5 dd5Var;
        jb5 jb5Var;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z8;
        Object objT5;
        Object objT6;
        Object objT7;
        Object objT8;
        Object objT9;
        Object objT10;
        pay payVarI;
        qim0 qim0Var2 = qim0Var;
        xu30 xu30Var2 = xu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1310802509);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mhg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(bbyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(ln00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vu30Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= x340Var.i((Object) null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= x340Var.i(xu30Var2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            hrr0 hrr0Var = mhg1Var.e;
            hrr0 hrr0Var2 = mhg1Var.d;
            k9 k9Var = mhg1Var.a;
            Object value = hrr0Var.getValue();
            Object objT11 = x340Var.T();
            Object obj = fkj0.X;
            if (objT11 == obj) {
                objT11 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT11);
            }
            ven0 ven0Var = (ven0) objT11;
            Object objT12 = x340Var.T();
            if (objT12 == obj) {
                objT12 = new ma0(ven0Var, (byte) 15);
                x340Var.s0(objT12);
            }
            int i5 = i4 & 14;
            int i6 = i5 | 48;
            xay.a(mhg1Var, (Function0) objT12, x340Var, i6);
            if (value != null && ((Boolean) iu30Var.invoke(value)).booleanValue()) {
                ven0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) iu30Var.invoke(hrr0Var2.getValue())).booleanValue() || ((Boolean) iu30Var.invoke(k9Var.P0())).booleanValue() || ((value != null && ((Boolean) iu30Var.invoke(value)).booleanValue()) || ((((Boolean) ven0Var.getValue()).booleanValue() && !u890.j(k9Var.P0(), hrr0Var2.getValue())) || mhg1Var.g() || mhg1Var.d()))) {
                x340Var.i0(-273709037);
                int i7 = i6 & 14;
                boolean z9 = ((i7 ^ 6) > 4 && x340Var.g(mhg1Var)) || (i6 & 6) == 4;
                Object objT13 = x340Var.T();
                if (z9 || objT13 == obj) {
                    objT13 = k9Var.P0();
                    x340Var.s0(objT13);
                }
                if (mhg1Var.g()) {
                    objT13 = k9Var.P0();
                }
                x340Var.i0(2016262395);
                pay payVarI2 = I(mhg1Var, iu30Var, objT13, x340Var);
                x340Var.r(false);
                Object value2 = hrr0Var2.getValue();
                x340Var.i0(2016262395);
                pay payVarI3 = I(mhg1Var, iu30Var, value2, x340Var);
                x340Var.r(false);
                mhg1 mhg1VarM = bno1.m(mhg1Var, payVarI2, payVarI3, "EnterExitTransition", x340Var, i7 | 3072);
                x340Var = x340Var;
                if (mhg1Var.g()) {
                    x340Var.i0(782538635);
                    x340Var.r(false);
                } else {
                    x340Var.i0(782386797);
                    Object value3 = mhg1Var.e.getValue();
                    if (value3 == null) {
                        x340Var.i0(782437481);
                        x340Var.r(false);
                        payVarI = null;
                    } else {
                        x340Var.i0(782437482);
                        x340Var.i0(2016262395);
                        payVarI = I(mhg1Var, iu30Var, value3, x340Var);
                        x340Var.r(false);
                        x340Var.r(false);
                    }
                    mhg1VarM.q(payVarI);
                    x340Var.r(false);
                }
                boolean zG = x340Var.g(mhg1VarM);
                Object objT14 = x340Var.T();
                if (zG || objT14 == obj) {
                    objT14 = xto.t(bbyVar);
                    x340Var.s0(objT14);
                }
                ven0 ven0Var2 = (ven0) objT14;
                k9 k9Var2 = mhg1VarM.a;
                hrr0 hrr0Var3 = mhg1VarM.d;
                Object objP0 = k9Var2.P0();
                Object value4 = hrr0Var3.getValue();
                pay payVar = pay.c;
                pay payVar2 = pay.b;
                if (objP0 == value4 && mhg1VarM.a.P0() == payVar2) {
                    if (mhg1VarM.g()) {
                        ven0Var2.setValue(bbyVar);
                    } else {
                        bby bbyVar3 = bby.b;
                        d9y0.s();
                        ven0Var2.setValue(bby.b);
                    }
                } else if (hrr0Var3.getValue() != payVar) {
                    ven0Var2.setValue(((bby) ven0Var2.getValue()).a(bbyVar));
                }
                bby bbyVar4 = (bby) ven0Var2.getValue();
                hrr0 hrr0Var4 = mhg1VarM.d;
                k9 k9Var3 = mhg1VarM.a;
                boolean zG2 = x340Var.g(mhg1VarM);
                Object objT15 = x340Var.T();
                if (zG2 || objT15 == obj) {
                    objT15 = xto.t(ln00Var);
                    x340Var.s0(objT15);
                }
                ven0 ven0Var3 = (ven0) objT15;
                if (k9Var3.P0() == hrr0Var4.getValue() && k9Var3.P0() == payVar2) {
                    x340Var.i0(-505142498);
                    x340Var.r(false);
                    if (mhg1VarM.g()) {
                        ven0Var3.setValue(ln00Var);
                    } else {
                        ln00 ln00Var3 = ln00.b;
                        fza.d();
                        ven0Var3.setValue(ln00.b);
                    }
                } else if (hrr0Var4.getValue() != payVar2) {
                    x340Var.i0(-504838512);
                    qg10 qg10Var = ((ln00) ven0Var3.getValue()).a.a;
                    qg10 qg10Var2 = qg10Var != null ? new qg10(1.0f, qg10Var.b) : null;
                    eg41 eg41Var2 = ((ln00) ven0Var3.getValue()).a.d;
                    if (eg41Var2 != null) {
                        long j = eg41Var2.b;
                        ni20 ni20Var = eg41Var2.c;
                        eg41Var2.getClass();
                        eg41Var = new eg41(1.0f, j, ni20Var);
                    } else {
                        eg41Var = null;
                    }
                    eb91 eb91Var2 = ((ln00) ven0Var3.getValue()).a.b;
                    if (eb91Var2 == null) {
                        x340Var.i0(-504119809);
                        x340Var.r(false);
                        z = false;
                        eb91Var = null;
                    } else {
                        x340Var.i0(-708998590);
                        Object objT16 = x340Var.T();
                        if (objT16 == obj) {
                            objT16 = vay.f;
                            x340Var.s0(objT16);
                        }
                        ni20 ni20Var2 = eb91Var2.b;
                        eb91Var2.getClass();
                        eb91 eb91Var3 = new eb91(ni20Var2, (iu30) objT16);
                        z = false;
                        x340Var.r(false);
                        eb91Var = eb91Var3;
                    }
                    cfe cfeVar2 = ((ln00) ven0Var3.getValue()).a.c;
                    if (cfeVar2 == null) {
                        x340Var.i0(-504024174);
                        x340Var.r(z);
                        cfeVar = null;
                    } else {
                        x340Var.i0(-708995505);
                        Object objT17 = x340Var.T();
                        if (objT17 == obj) {
                            objT17 = vay.g;
                            x340Var.s0(objT17);
                        }
                        cfe cfeVar3 = new cfe(cfeVar2.a, (iu30) objT17, cfeVar2.c, cfeVar2.d);
                        x340Var.r(false);
                        cfeVar = cfeVar3;
                    }
                    oig1 oig1Var2 = ((ln00) ven0Var3.getValue()).a;
                    ven0Var3.setValue(new ln00(new oig1(qg10Var2, eb91Var, cfeVar, eg41Var, (LinkedHashMap) null, 96)).a(ln00Var));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-503833306);
                    x340Var.r(false);
                }
                ln00 ln00Var4 = (ln00) ven0Var3.getValue();
                ven0 ven0VarS = v8r.s(vu30Var, x340Var);
                Object objInvoke = vu30Var.invoke(k9Var3.P0(), hrr0Var4.getValue());
                boolean zG3 = x340Var.g(mhg1VarM) | x340Var.g(ven0VarS);
                Object objT18 = x340Var.T();
                if (zG3 || objT18 == obj) {
                    objT18 = new wc5((Object) mhg1VarM, (Object) ven0VarS, (lnm) null, (byte) 0);
                    x340Var.s0(objT18);
                }
                ven0 ven0VarQ = yto.q(objInvoke, x340Var, (vu30) objT18);
                if (k9Var3.P0() == payVar && hrr0Var4.getValue() == payVar && ((Boolean) ven0VarQ.getValue()).booleanValue()) {
                    x340Var.i0(-270520625);
                    z8 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-272022668);
                    boolean z10 = i5 == 4;
                    Object objT19 = x340Var.T();
                    if (z10 || objT19 == obj) {
                        objT19 = new dd5(mhg1VarM);
                        x340Var.s0(objT19);
                    }
                    dd5 dd5Var2 = (dd5) objT19;
                    ft71 ft71Var = dd5Var2.c;
                    Object objT20 = x340Var.T();
                    if (objT20 == obj) {
                        objT20 = df.S0;
                        x340Var.s0(objT20);
                    }
                    Function0 function0 = (Function0) objT20;
                    x340Var.i0(-1491182875);
                    x340Var.r(false);
                    x340Var.i0(-1491180092);
                    x340Var.r(false);
                    x340Var.i0(-31257052);
                    x340Var.r(false);
                    ft71Var.o(mhg1VarM.e.getValue() != null);
                    boolean zI3 = x340Var.i(ft71Var);
                    Object objT21 = x340Var.T();
                    if (zI3 || objT21 == obj) {
                        objT21 = new v7v(ft71Var, (byte) 29);
                        x340Var.s0(objT21);
                    }
                    xay.a(mhg1VarM, (Function0) objT21, x340Var, 0);
                    oig1 oig1Var3 = bbyVar4.a;
                    oig1 oig1Var4 = ln00Var4.a;
                    cfe cfeVar4 = oig1Var4.c;
                    boolean zB = z4h1.b(ft71Var.f, u7h.j);
                    eb91 eb91Var4 = oig1Var3.b;
                    cfe cfeVar5 = oig1Var3.c;
                    if (eb91Var4 == null && oig1Var4.b == null) {
                        oig1Var = oig1Var3;
                        mhg1Var2 = mhg1VarM;
                        if (qr80.b(ft71Var.j, 0L)) {
                            z2 = false;
                        }
                        if (cfeVar5 == null || cfeVar4 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        tzg1Var = rno1.g;
                        if (z2) {
                            x340Var.i0(1018653691);
                            objT10 = x340Var.T();
                            if (objT10 == obj) {
                                objT10 = "Built-in slide";
                                x340Var.s0("Built-in slide");
                            }
                            String str = (String) objT10;
                            mhg1Var3 = mhg1Var2;
                            zgg1 zgg1VarN2 = bno1.n(mhg1Var3, tzg1Var, str, x340Var, 384, 0);
                            x340Var.r(false);
                            zgg1Var = zgg1VarN2;
                        } else {
                            mhg1Var3 = mhg1Var2;
                            x340Var.i0(1018759494);
                            x340Var.r(false);
                            zgg1Var = null;
                        }
                        if (z3) {
                            x340Var.i0(1018851285);
                            objT9 = x340Var.T();
                            if (objT9 == obj) {
                                objT9 = "Built-in shrink/expand";
                                x340Var.s0("Built-in shrink/expand");
                            }
                            zgg1 zgg1VarN3 = bno1.n(mhg1Var3, rno1.h, (String) objT9, x340Var, 384, 0);
                            x340Var.r(false);
                            zgg1Var2 = zgg1VarN3;
                        } else {
                            x340Var.i0(1018962109);
                            x340Var.r(false);
                            zgg1Var2 = null;
                        }
                        if (z3) {
                            x340Var.i0(1019035735);
                            objT8 = x340Var.T();
                            if (objT8 == obj) {
                                objT8 = "Built-in InterruptionHandlingOffset";
                                x340Var.s0("Built-in InterruptionHandlingOffset");
                            }
                            zgg1 zgg1VarN4 = bno1.n(mhg1Var3, tzg1Var, (String) objT8, x340Var, 384, 0);
                            x340Var.r(false);
                            zgg1Var3 = zgg1VarN4;
                        } else {
                            x340Var.i0(1019206141);
                            x340Var.r(false);
                            zgg1Var3 = null;
                        }
                        z4 = (cfeVar5 == null && !cfeVar5.d) || !((
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r10v3 'z4' boolean) = ((((r10v1 'cfeVar5' p.cfe) == (null p.cfe) && !((wrap boolean:0x0576: IGET (r10v1 'cfeVar5' p.cfe) A[WRAPPED] (LINE:1399) p.cfe.d boolean) == true)) || !((((r18v5 ?? I:??[OBJECT, ARRAY]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char]) || (wrap boolean:0x057d: IGET (r4v52 'cfeVar4' p.cfe) A[WRAPPED] (LINE:1406) p.cfe.d boolean) == true) && (r20v2 'z3' boolean) == true)))) ? true : false in method: p.fq7.a(p.mhg1, p.iu30, p.qim0, p.bby, p.ln00, p.vu30, p.xu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes11.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v5 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 2055
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.fq7.a(p.mhg1, p.iu30, p.qim0, p.bby, p.ln00, p.vu30, p.xu30, p.b0k, int):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
                    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
                    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
                    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:56:0x009c A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
                    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
                    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
                    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
                    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
                    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
                    public static final void b(nbh nbhVar, boolean z, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, b0k b0kVar, int i, int i2) {
                        int i3;
                        qim0 qim0Var2;
                        int i4;
                        bby bbyVar2;
                        int i5;
                        int i6;
                        ln00 ln00Var2;
                        int i7;
                        int i8;
                        boolean z2;
                        String str2;
                        bby bbyVar3;
                        ln00 ln00Var3;
                        h311 h311VarV;
                        qim0 qim0Var3;
                        bby bbyVarA;
                        ln00 ln00VarA;
                        Object objT;
                        int i9;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1799879339);
                        if ((i & 48) == 0) {
                            i3 = (x340Var.h(z) ? 32 : 16) | i;
                        } else {
                            i3 = i;
                        }
                        int i10 = i2 & 2;
                        if (i10 == 0) {
                            if ((i & 384) == 0) {
                                qim0Var2 = qim0Var;
                                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
                            }
                            i4 = i2 & 4;
                            if (i4 != 0) {
                                if ((i & 3072) == 0) {
                                    bbyVar2 = bbyVar;
                                    if (x340Var.g(bbyVar2)) {
                                        i5 = 2048;
                                    } else {
                                        i5 = 1024;
                                    }
                                    i3 |= i5;
                                }
                                i6 = i2 & 8;
                                if (i6 != 0) {
                                    if ((i & 24576) == 0) {
                                        ln00Var2 = ln00Var;
                                        if (x340Var.g(ln00Var2)) {
                                            i7 = 16384;
                                        } else {
                                            i7 = 8192;
                                        }
                                        i3 |= i7;
                                    }
                                    i8 = i3 | 196608;
                                    if ((1572864 & i) == 0) {
                                        if (x340Var.i(j2iVar)) {
                                            i9 = 1048576;
                                        } else {
                                            i9 = 524288;
                                        }
                                        i8 |= i9;
                                    }
                                    if ((599185 & i8) != 599184) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (x340Var.Y(i8 & 1, z2)) {
                                        if (i10 != 0) {
                                            qim0Var3 = nim0.a;
                                        } else {
                                            qim0Var3 = qim0Var2;
                                        }
                                        if (i4 != 0) {
                                            bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                        } else {
                                            bbyVarA = bbyVar2;
                                        }
                                        if (i6 != 0) {
                                            ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                        } else {
                                            ln00VarA = ln00Var2;
                                        }
                                        bjg1 bjg1VarY = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                        objT = x340Var.T();
                                        if (objT == fkj0.X) {
                                            objT = k74.Q0;
                                            x340Var.s0(objT);
                                        }
                                        qim0 qim0Var4 = qim0Var3;
                                        i(bjg1VarY, (iu30) objT, qim0Var4, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                        str2 = "AnimatedVisibility";
                                        qim0Var2 = qim0Var4;
                                        bbyVar3 = bbyVarA;
                                        ln00Var3 = ln00VarA;
                                    } else {
                                        x340Var.b0();
                                        str2 = str;
                                        bbyVar3 = bbyVar2;
                                        ln00Var3 = ln00Var2;
                                    }
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                                    }
                                }
                                i3 |= 24576;
                                ln00Var2 = ln00Var;
                                i8 = i3 | 196608;
                                if ((1572864 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i9 = 1048576;
                                    } else {
                                        i9 = 524288;
                                    }
                                    i8 |= i9;
                                }
                                if ((599185 & i8) != 599184) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var3 = nim0.a;
                                    } else {
                                        qim0Var3 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    bjg1 bjg1VarY2 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.Q0;
                                        x340Var.s0(objT);
                                    }
                                    qim0 qim0Var5 = qim0Var3;
                                    i(bjg1VarY2, (iu30) objT, qim0Var5, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                    str2 = "AnimatedVisibility";
                                    qim0Var2 = qim0Var5;
                                    bbyVar3 = bbyVarA;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    str2 = str;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                                }
                            }
                            i3 |= 3072;
                            bbyVar2 = bbyVar;
                            i6 = i2 & 8;
                            if (i6 != 0) {
                                if ((i & 24576) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i7 = 16384;
                                    } else {
                                        i7 = 8192;
                                    }
                                    i3 |= i7;
                                }
                                i8 = i3 | 196608;
                                if ((1572864 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i9 = 1048576;
                                    } else {
                                        i9 = 524288;
                                    }
                                    i8 |= i9;
                                }
                                if ((599185 & i8) != 599184) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var3 = nim0.a;
                                    } else {
                                        qim0Var3 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    bjg1 bjg1VarY3 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.Q0;
                                        x340Var.s0(objT);
                                    }
                                    qim0 qim0Var6 = qim0Var3;
                                    i(bjg1VarY3, (iu30) objT, qim0Var6, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                    str2 = "AnimatedVisibility";
                                    qim0Var2 = qim0Var6;
                                    bbyVar3 = bbyVarA;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    str2 = str;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                                }
                            }
                            i3 |= 24576;
                            ln00Var2 = ln00Var;
                            i8 = i3 | 196608;
                            if ((1572864 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i8 |= i9;
                            }
                            if ((599185 & i8) != 599184) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                bjg1 bjg1VarY4 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.Q0;
                                    x340Var.s0(objT);
                                }
                                qim0 qim0Var7 = qim0Var3;
                                i(bjg1VarY4, (iu30) objT, qim0Var7, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                str2 = "AnimatedVisibility";
                                qim0Var2 = qim0Var7;
                                bbyVar3 = bbyVarA;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                str2 = str;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                            }
                        }
                        i3 |= 384;
                        qim0Var2 = qim0Var;
                        i4 = i2 & 4;
                        if (i4 != 0) {
                            if ((i & 3072) == 0) {
                                bbyVar2 = bbyVar;
                                if (x340Var.g(bbyVar2)) {
                                    i5 = 2048;
                                } else {
                                    i5 = 1024;
                                }
                                i3 |= i5;
                            }
                            i6 = i2 & 8;
                            if (i6 != 0) {
                                if ((i & 24576) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i7 = 16384;
                                    } else {
                                        i7 = 8192;
                                    }
                                    i3 |= i7;
                                }
                                i8 = i3 | 196608;
                                if ((1572864 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i9 = 1048576;
                                    } else {
                                        i9 = 524288;
                                    }
                                    i8 |= i9;
                                }
                                if ((599185 & i8) != 599184) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var3 = nim0.a;
                                    } else {
                                        qim0Var3 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    bjg1 bjg1VarY5 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.Q0;
                                        x340Var.s0(objT);
                                    }
                                    qim0 qim0Var8 = qim0Var3;
                                    i(bjg1VarY5, (iu30) objT, qim0Var8, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                    str2 = "AnimatedVisibility";
                                    qim0Var2 = qim0Var8;
                                    bbyVar3 = bbyVarA;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    str2 = str;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                                }
                            }
                            i3 |= 24576;
                            ln00Var2 = ln00Var;
                            i8 = i3 | 196608;
                            if ((1572864 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i8 |= i9;
                            }
                            if ((599185 & i8) != 599184) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                bjg1 bjg1VarY6 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.Q0;
                                    x340Var.s0(objT);
                                }
                                qim0 qim0Var9 = qim0Var3;
                                i(bjg1VarY6, (iu30) objT, qim0Var9, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                str2 = "AnimatedVisibility";
                                qim0Var2 = qim0Var9;
                                bbyVar3 = bbyVarA;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                str2 = str;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                            }
                        }
                        i3 |= 3072;
                        bbyVar2 = bbyVar;
                        i6 = i2 & 8;
                        if (i6 != 0) {
                            if ((i & 24576) == 0) {
                                ln00Var2 = ln00Var;
                                if (x340Var.g(ln00Var2)) {
                                    i7 = 16384;
                                } else {
                                    i7 = 8192;
                                }
                                i3 |= i7;
                            }
                            i8 = i3 | 196608;
                            if ((1572864 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i8 |= i9;
                            }
                            if ((599185 & i8) != 599184) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                bjg1 bjg1VarY7 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.Q0;
                                    x340Var.s0(objT);
                                }
                                qim0 qim0Var10 = qim0Var3;
                                i(bjg1VarY7, (iu30) objT, qim0Var10, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                str2 = "AnimatedVisibility";
                                qim0Var2 = qim0Var10;
                                bbyVar3 = bbyVarA;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                str2 = str;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                            }
                        }
                        i3 |= 24576;
                        ln00Var2 = ln00Var;
                        i8 = i3 | 196608;
                        if ((1572864 & i) == 0) {
                            if (x340Var.i(j2iVar)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i8 |= i9;
                        }
                        if ((599185 & i8) != 599184) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i8 & 1, z2)) {
                            if (i10 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                            } else {
                                bbyVarA = bbyVar2;
                            }
                            if (i6 != 0) {
                                ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                            } else {
                                ln00VarA = ln00Var2;
                            }
                            bjg1 bjg1VarY8 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = k74.Q0;
                                x340Var.s0(objT);
                            }
                            qim0 qim0Var11 = qim0Var3;
                            i(bjg1VarY8, (iu30) objT, qim0Var11, bbyVarA, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                            str2 = "AnimatedVisibility";
                            qim0Var2 = qim0Var11;
                            bbyVar3 = bbyVarA;
                            ln00Var3 = ln00VarA;
                        } else {
                            x340Var.b0();
                            str2 = str;
                            bbyVar3 = bbyVar2;
                            ln00Var3 = ln00Var2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new zc5(nbhVar, z, qim0Var2, bbyVar3, ln00Var3, str2, j2iVar, i, i2);
                        }
                    }

                    public static final void c(zen0 zen0Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, b0k b0kVar, int i) {
                        ln00 ln00Var2;
                        String str2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1238803325);
                        int i2 = i | (x340Var.g(zen0Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.g(bbyVar) ? 2048 : 1024) | 221184;
                        if (x340Var.Y(i2 & 1, (599185 & i2) != 599184)) {
                            ln00 ln00VarA = xay.l(15, (ni20) null).a(xay.f(3, (ni20) null));
                            mhg1 mhg1VarU = bno1.u(zen0Var, "AnimatedVisibility", x340Var, ((i2 >> 3) & 14) | 48, 0);
                            Object objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = k74.O0;
                                x340Var.s0(objT);
                            }
                            i(mhg1VarU, (iu30) objT, qim0Var, bbyVar, ln00VarA, j2iVar, x340Var, (i2 & 7168) | (i2 & 896) | 48 | 1597440, 32);
                            ln00Var2 = ln00VarA;
                            str2 = "AnimatedVisibility";
                        } else {
                            x340Var.b0();
                            ln00Var2 = ln00Var;
                            str2 = str;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new k40(zen0Var, qim0Var, bbyVar, ln00Var2, str2, j2iVar, i);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
                    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
                    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
                    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
                    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0099 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
                    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
                    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
                    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
                    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
                    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
                    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
                    public static final void d(zen0 zen0Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, b0k b0kVar, int i, int i2) {
                        int i3;
                        qim0 qim0Var2;
                        int i4;
                        ln00 ln00Var2;
                        int i5;
                        int i6;
                        boolean z;
                        qim0 qim0Var3;
                        ln00 ln00Var3;
                        String str2;
                        h311 h311VarV;
                        qim0 qim0Var4;
                        ln00 ln00VarA;
                        Object objT;
                        int i7;
                        int i8;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(657024243);
                        if ((i & 6) == 0) {
                            i3 = ((i & 8) == 0 ? x340Var.g(zen0Var) : x340Var.i(zen0Var) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        int i9 = i2 & 2;
                        if (i9 == 0) {
                            if ((i & 48) == 0) {
                                qim0Var2 = qim0Var;
                                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
                            }
                            if ((i & 384) == 0) {
                                if (x340Var.g(bbyVar)) {
                                    i8 = 256;
                                } else {
                                    i8 = 128;
                                }
                                i3 |= i8;
                            }
                            i4 = i2 & 8;
                            if (i4 != 0) {
                                if ((i & 3072) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i5 = 2048;
                                    } else {
                                        i5 = 1024;
                                    }
                                    i3 |= i5;
                                }
                                i6 = i3 | 24576;
                                if ((196608 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i7 = 131072;
                                    } else {
                                        i7 = 65536;
                                    }
                                    i6 |= i7;
                                }
                                if ((74899 & i6) != 74898) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (x340Var.Y(i6 & 1, z)) {
                                    if (i9 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.k());
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    mhg1 mhg1VarU = bno1.u(zen0Var, "AnimatedVisibility", x340Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.R0;
                                        x340Var.s0(objT);
                                    }
                                    int i10 = i6 << 3;
                                    i(mhg1VarU, (iu30) objT, qim0Var4, bbyVar, ln00VarA, j2iVar, x340Var, (i10 & 896) | 48 | (i10 & 7168) | (57344 & i10) | (i10 & 3670016), 32);
                                    str2 = "AnimatedVisibility";
                                    qim0Var3 = qim0Var4;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new xc5(zen0Var, qim0Var3, bbyVar, ln00Var3, str2, j2iVar, i, i2, (byte) 1);
                                }
                            }
                            i3 |= 3072;
                            ln00Var2 = ln00Var;
                            i6 = i3 | 24576;
                            if ((196608 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i7 = 131072;
                                } else {
                                    i7 = 65536;
                                }
                                i6 |= i7;
                            }
                            if ((74899 & i6) != 74898) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i6 & 1, z)) {
                                if (i9 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.k());
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                mhg1 mhg1VarU2 = bno1.u(zen0Var, "AnimatedVisibility", x340Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.R0;
                                    x340Var.s0(objT);
                                }
                                int i11 = i6 << 3;
                                i(mhg1VarU2, (iu30) objT, qim0Var4, bbyVar, ln00VarA, j2iVar, x340Var, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016), 32);
                                str2 = "AnimatedVisibility";
                                qim0Var3 = qim0Var4;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new xc5(zen0Var, qim0Var3, bbyVar, ln00Var3, str2, j2iVar, i, i2, (byte) 1);
                            }
                        }
                        i3 |= 48;
                        qim0Var2 = qim0Var;
                        if ((i & 384) == 0) {
                            if (x340Var.g(bbyVar)) {
                                i8 = 256;
                            } else {
                                i8 = 128;
                            }
                            i3 |= i8;
                        }
                        i4 = i2 & 8;
                        if (i4 != 0) {
                            if ((i & 3072) == 0) {
                                ln00Var2 = ln00Var;
                                if (x340Var.g(ln00Var2)) {
                                    i5 = 2048;
                                } else {
                                    i5 = 1024;
                                }
                                i3 |= i5;
                            }
                            i6 = i3 | 24576;
                            if ((196608 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i7 = 131072;
                                } else {
                                    i7 = 65536;
                                }
                                i6 |= i7;
                            }
                            if ((74899 & i6) != 74898) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i6 & 1, z)) {
                                if (i9 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.k());
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                mhg1 mhg1VarU3 = bno1.u(zen0Var, "AnimatedVisibility", x340Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.R0;
                                    x340Var.s0(objT);
                                }
                                int i12 = i6 << 3;
                                i(mhg1VarU3, (iu30) objT, qim0Var4, bbyVar, ln00VarA, j2iVar, x340Var, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016), 32);
                                str2 = "AnimatedVisibility";
                                qim0Var3 = qim0Var4;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new xc5(zen0Var, qim0Var3, bbyVar, ln00Var3, str2, j2iVar, i, i2, (byte) 1);
                            }
                        }
                        i3 |= 3072;
                        ln00Var2 = ln00Var;
                        i6 = i3 | 24576;
                        if ((196608 & i) == 0) {
                            if (x340Var.i(j2iVar)) {
                                i7 = 131072;
                            } else {
                                i7 = 65536;
                            }
                            i6 |= i7;
                        }
                        if ((74899 & i6) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i6 & 1, z)) {
                            if (i9 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                ln00VarA = xay.f(3, (ni20) null).a(xay.k());
                            } else {
                                ln00VarA = ln00Var2;
                            }
                            mhg1 mhg1VarU4 = bno1.u(zen0Var, "AnimatedVisibility", x340Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = k74.R0;
                                x340Var.s0(objT);
                            }
                            int i13 = i6 << 3;
                            i(mhg1VarU4, (iu30) objT, qim0Var4, bbyVar, ln00VarA, j2iVar, x340Var, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016), 32);
                            str2 = "AnimatedVisibility";
                            qim0Var3 = qim0Var4;
                            ln00Var3 = ln00VarA;
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            ln00Var3 = ln00Var2;
                            str2 = str;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xc5(zen0Var, qim0Var3, bbyVar, ln00Var3, str2, j2iVar, i, i2, (byte) 1);
                        }
                    }

                    public static final void e(bjg1 bjg1Var, iu30 iu30Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, j2i j2iVar, b0k b0kVar, int i) {
                        int i2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1699747442);
                        if ((i & 6) == 0) {
                            i2 = (x340Var.g(bjg1Var) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(iu30Var) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= x340Var.g(qim0Var) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= x340Var.g(bbyVar) ? 2048 : 1024;
                        }
                        if ((i & 24576) == 0) {
                            i2 |= x340Var.g(ln00Var) ? 16384 : 8192;
                        }
                        if ((i & 196608) == 0) {
                            i2 |= x340Var.i(j2iVar) ? 131072 : 65536;
                        }
                        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
                            i(bjg1Var, iu30Var, qim0Var, bbyVar, ln00Var, j2iVar, x340Var, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 3) & 3670016), 0);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new wc0(bjg1Var, iu30Var, qim0Var, bbyVar, ln00Var, j2iVar, i);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
                    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
                    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
                    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:56:0x009c A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
                    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
                    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
                    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
                    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
                    public static final void f(boolean z, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, b0k b0kVar, int i, int i2) {
                        int i3;
                        qim0 qim0Var2;
                        int i4;
                        bby bbyVar2;
                        int i5;
                        int i6;
                        ln00 ln00Var2;
                        int i7;
                        int i8;
                        boolean z2;
                        qim0 qim0Var3;
                        bby bbyVar3;
                        ln00 ln00Var3;
                        String str2;
                        h311 h311VarV;
                        qim0 qim0Var4;
                        bby bbyVarA;
                        ln00 ln00VarA;
                        Object objT;
                        int i9;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(234057107);
                        if ((i & 48) == 0) {
                            i3 = (x340Var.h(z) ? 32 : 16) | i;
                        } else {
                            i3 = i;
                        }
                        int i10 = i2 & 2;
                        if (i10 == 0) {
                            if ((i & 384) == 0) {
                                qim0Var2 = qim0Var;
                                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
                            }
                            i4 = i2 & 4;
                            if (i4 != 0) {
                                if ((i & 3072) == 0) {
                                    bbyVar2 = bbyVar;
                                    if (x340Var.g(bbyVar2)) {
                                        i5 = 2048;
                                    } else {
                                        i5 = 1024;
                                    }
                                    i3 |= i5;
                                }
                                i6 = i2 & 8;
                                if (i6 != 0) {
                                    if ((i & 24576) == 0) {
                                        ln00Var2 = ln00Var;
                                        if (x340Var.g(ln00Var2)) {
                                            i7 = 16384;
                                        } else {
                                            i7 = 8192;
                                        }
                                        i3 |= i7;
                                    }
                                    i8 = i3 | 196608;
                                    if ((1572864 & i) == 0) {
                                        if (x340Var.i(j2iVar)) {
                                            i9 = 1048576;
                                        } else {
                                            i9 = 524288;
                                        }
                                        i8 |= i9;
                                    }
                                    if ((599185 & i8) != 599184) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (x340Var.Y(i8 & 1, z2)) {
                                        if (i10 != 0) {
                                            qim0Var4 = nim0.a;
                                        } else {
                                            qim0Var4 = qim0Var2;
                                        }
                                        if (i4 != 0) {
                                            bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                        } else {
                                            bbyVarA = bbyVar2;
                                        }
                                        if (i6 != 0) {
                                            ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                        } else {
                                            ln00VarA = ln00Var2;
                                        }
                                        str2 = "AnimatedVisibility";
                                        bjg1 bjg1VarY = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                        objT = x340Var.T();
                                        if (objT == fkj0.X) {
                                            objT = k74.P0;
                                            x340Var.s0(objT);
                                        }
                                        bby bbyVar4 = bbyVarA;
                                        i(bjg1VarY, (iu30) objT, qim0Var4, bbyVar4, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                        qim0Var3 = qim0Var4;
                                        bbyVar3 = bbyVar4;
                                        ln00Var3 = ln00VarA;
                                    } else {
                                        x340Var.b0();
                                        qim0Var3 = qim0Var2;
                                        bbyVar3 = bbyVar2;
                                        ln00Var3 = ln00Var2;
                                        str2 = str;
                                    }
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                                    }
                                }
                                i3 |= 24576;
                                ln00Var2 = ln00Var;
                                i8 = i3 | 196608;
                                if ((1572864 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i9 = 1048576;
                                    } else {
                                        i9 = 524288;
                                    }
                                    i8 |= i9;
                                }
                                if ((599185 & i8) != 599184) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    str2 = "AnimatedVisibility";
                                    bjg1 bjg1VarY2 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.P0;
                                        x340Var.s0(objT);
                                    }
                                    bby bbyVar5 = bbyVarA;
                                    i(bjg1VarY2, (iu30) objT, qim0Var4, bbyVar5, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                    qim0Var3 = qim0Var4;
                                    bbyVar3 = bbyVar5;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                                }
                            }
                            i3 |= 3072;
                            bbyVar2 = bbyVar;
                            i6 = i2 & 8;
                            if (i6 != 0) {
                                if ((i & 24576) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i7 = 16384;
                                    } else {
                                        i7 = 8192;
                                    }
                                    i3 |= i7;
                                }
                                i8 = i3 | 196608;
                                if ((1572864 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i9 = 1048576;
                                    } else {
                                        i9 = 524288;
                                    }
                                    i8 |= i9;
                                }
                                if ((599185 & i8) != 599184) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    str2 = "AnimatedVisibility";
                                    bjg1 bjg1VarY3 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.P0;
                                        x340Var.s0(objT);
                                    }
                                    bby bbyVar6 = bbyVarA;
                                    i(bjg1VarY3, (iu30) objT, qim0Var4, bbyVar6, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                    qim0Var3 = qim0Var4;
                                    bbyVar3 = bbyVar6;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                                }
                            }
                            i3 |= 24576;
                            ln00Var2 = ln00Var;
                            i8 = i3 | 196608;
                            if ((1572864 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i8 |= i9;
                            }
                            if ((599185 & i8) != 599184) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                str2 = "AnimatedVisibility";
                                bjg1 bjg1VarY4 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.P0;
                                    x340Var.s0(objT);
                                }
                                bby bbyVar7 = bbyVarA;
                                i(bjg1VarY4, (iu30) objT, qim0Var4, bbyVar7, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                qim0Var3 = qim0Var4;
                                bbyVar3 = bbyVar7;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                            }
                        }
                        i3 |= 384;
                        qim0Var2 = qim0Var;
                        i4 = i2 & 4;
                        if (i4 != 0) {
                            if ((i & 3072) == 0) {
                                bbyVar2 = bbyVar;
                                if (x340Var.g(bbyVar2)) {
                                    i5 = 2048;
                                } else {
                                    i5 = 1024;
                                }
                                i3 |= i5;
                            }
                            i6 = i2 & 8;
                            if (i6 != 0) {
                                if ((i & 24576) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i7 = 16384;
                                    } else {
                                        i7 = 8192;
                                    }
                                    i3 |= i7;
                                }
                                i8 = i3 | 196608;
                                if ((1572864 & i) == 0) {
                                    if (x340Var.i(j2iVar)) {
                                        i9 = 1048576;
                                    } else {
                                        i9 = 524288;
                                    }
                                    i8 |= i9;
                                }
                                if ((599185 & i8) != 599184) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    str2 = "AnimatedVisibility";
                                    bjg1 bjg1VarY5 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.P0;
                                        x340Var.s0(objT);
                                    }
                                    bby bbyVar8 = bbyVarA;
                                    i(bjg1VarY5, (iu30) objT, qim0Var4, bbyVar8, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                    qim0Var3 = qim0Var4;
                                    bbyVar3 = bbyVar8;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                                }
                            }
                            i3 |= 24576;
                            ln00Var2 = ln00Var;
                            i8 = i3 | 196608;
                            if ((1572864 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i8 |= i9;
                            }
                            if ((599185 & i8) != 599184) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                str2 = "AnimatedVisibility";
                                bjg1 bjg1VarY6 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.P0;
                                    x340Var.s0(objT);
                                }
                                bby bbyVar9 = bbyVarA;
                                i(bjg1VarY6, (iu30) objT, qim0Var4, bbyVar9, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                qim0Var3 = qim0Var4;
                                bbyVar3 = bbyVar9;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                            }
                        }
                        i3 |= 3072;
                        bbyVar2 = bbyVar;
                        i6 = i2 & 8;
                        if (i6 != 0) {
                            if ((i & 24576) == 0) {
                                ln00Var2 = ln00Var;
                                if (x340Var.g(ln00Var2)) {
                                    i7 = 16384;
                                } else {
                                    i7 = 8192;
                                }
                                i3 |= i7;
                            }
                            i8 = i3 | 196608;
                            if ((1572864 & i) == 0) {
                                if (x340Var.i(j2iVar)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i8 |= i9;
                            }
                            if ((599185 & i8) != 599184) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                str2 = "AnimatedVisibility";
                                bjg1 bjg1VarY7 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.P0;
                                    x340Var.s0(objT);
                                }
                                bby bbyVar10 = bbyVarA;
                                i(bjg1VarY7, (iu30) objT, qim0Var4, bbyVar10, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                                qim0Var3 = qim0Var4;
                                bbyVar3 = bbyVar10;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                            }
                        }
                        i3 |= 24576;
                        ln00Var2 = ln00Var;
                        i8 = i3 | 196608;
                        if ((1572864 & i) == 0) {
                            if (x340Var.i(j2iVar)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i8 |= i9;
                        }
                        if ((599185 & i8) != 599184) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i8 & 1, z2)) {
                            if (i10 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
                            } else {
                                bbyVarA = bbyVar2;
                            }
                            if (i6 != 0) {
                                ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
                            } else {
                                ln00VarA = ln00Var2;
                            }
                            str2 = "AnimatedVisibility";
                            bjg1 bjg1VarY8 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = k74.P0;
                                x340Var.s0(objT);
                            }
                            bby bbyVar11 = bbyVarA;
                            i(bjg1VarY8, (iu30) objT, qim0Var4, bbyVar11, ln00VarA, j2iVar, x340Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                            qim0Var3 = qim0Var4;
                            bbyVar3 = bbyVar11;
                            ln00Var3 = ln00VarA;
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            bbyVar3 = bbyVar2;
                            ln00Var3 = ln00Var2;
                            str2 = str;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, (xu30) j2iVar, i, i2, (byte) 1);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
                    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
                    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
                    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:56:0x009a A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
                    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
                    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
                    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
                    /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
                    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
                    public static final void g(boolean z, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, xu30 xu30Var, b0k b0kVar, int i, int i2) {
                        int i3;
                        qim0 qim0Var2;
                        int i4;
                        bby bbyVar2;
                        int i5;
                        int i6;
                        ln00 ln00Var2;
                        int i7;
                        int i8;
                        boolean z2;
                        qim0 qim0Var3;
                        bby bbyVar3;
                        ln00 ln00Var3;
                        String str2;
                        h311 h311VarV;
                        qim0 qim0Var4;
                        bby bbyVarA;
                        ln00 ln00VarA;
                        Object objT;
                        int i9;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1448730565);
                        if ((i & 6) == 0) {
                            i3 = (x340Var.h(z) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        int i10 = i2 & 2;
                        if (i10 == 0) {
                            if ((i & 48) == 0) {
                                qim0Var2 = qim0Var;
                                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
                            }
                            i4 = i2 & 4;
                            if (i4 != 0) {
                                if ((i & 384) == 0) {
                                    bbyVar2 = bbyVar;
                                    if (x340Var.g(bbyVar2)) {
                                        i5 = 256;
                                    } else {
                                        i5 = 128;
                                    }
                                    i3 |= i5;
                                }
                                i6 = i2 & 8;
                                if (i6 != 0) {
                                    if ((i & 3072) == 0) {
                                        ln00Var2 = ln00Var;
                                        if (x340Var.g(ln00Var2)) {
                                            i7 = 2048;
                                        } else {
                                            i7 = 1024;
                                        }
                                        i3 |= i7;
                                    }
                                    i8 = i3 | 24576;
                                    if ((196608 & i) == 0) {
                                        if (x340Var.i(xu30Var)) {
                                            i9 = 131072;
                                        } else {
                                            i9 = 65536;
                                        }
                                        i8 |= i9;
                                    }
                                    if ((74899 & i8) != 74898) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (x340Var.Y(i8 & 1, z2)) {
                                        if (i10 != 0) {
                                            qim0Var4 = nim0.a;
                                        } else {
                                            qim0Var4 = qim0Var2;
                                        }
                                        if (i4 != 0) {
                                            bby bbyVarE = xay.e(3, (ni20) null);
                                            n511 n511Var = ckk1.a;
                                            bbyVarA = bbyVarE.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                        } else {
                                            bbyVarA = bbyVar2;
                                        }
                                        if (i6 != 0) {
                                            ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                        } else {
                                            ln00VarA = ln00Var2;
                                        }
                                        str2 = "AnimatedVisibility";
                                        bjg1 bjg1VarY = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                        objT = x340Var.T();
                                        if (objT == fkj0.X) {
                                            objT = k74.N0;
                                            x340Var.s0(objT);
                                        }
                                        int i11 = i8 << 3;
                                        bby bbyVar4 = bbyVarA;
                                        i(bjg1VarY, (iu30) objT, qim0Var4, bbyVar4, ln00VarA, xu30Var, x340Var, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016), 32);
                                        qim0Var3 = qim0Var4;
                                        bbyVar3 = bbyVar4;
                                        ln00Var3 = ln00VarA;
                                    } else {
                                        x340Var.b0();
                                        qim0Var3 = qim0Var2;
                                        bbyVar3 = bbyVar2;
                                        ln00Var3 = ln00Var2;
                                        str2 = str;
                                    }
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                                    }
                                }
                                i3 |= 3072;
                                ln00Var2 = ln00Var;
                                i8 = i3 | 24576;
                                if ((196608 & i) == 0) {
                                    if (x340Var.i(xu30Var)) {
                                        i9 = 131072;
                                    } else {
                                        i9 = 65536;
                                    }
                                    i8 |= i9;
                                }
                                if ((74899 & i8) != 74898) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bby bbyVarE2 = xay.e(3, (ni20) null);
                                        n511 n511Var2 = ckk1.a;
                                        bbyVarA = bbyVarE2.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    str2 = "AnimatedVisibility";
                                    bjg1 bjg1VarY2 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.N0;
                                        x340Var.s0(objT);
                                    }
                                    int i12 = i8 << 3;
                                    bby bbyVar5 = bbyVarA;
                                    i(bjg1VarY2, (iu30) objT, qim0Var4, bbyVar5, ln00VarA, xu30Var, x340Var, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016), 32);
                                    qim0Var3 = qim0Var4;
                                    bbyVar3 = bbyVar5;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                                }
                            }
                            i3 |= 384;
                            bbyVar2 = bbyVar;
                            i6 = i2 & 8;
                            if (i6 != 0) {
                                if ((i & 3072) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i7 = 2048;
                                    } else {
                                        i7 = 1024;
                                    }
                                    i3 |= i7;
                                }
                                i8 = i3 | 24576;
                                if ((196608 & i) == 0) {
                                    if (x340Var.i(xu30Var)) {
                                        i9 = 131072;
                                    } else {
                                        i9 = 65536;
                                    }
                                    i8 |= i9;
                                }
                                if ((74899 & i8) != 74898) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bby bbyVarE3 = xay.e(3, (ni20) null);
                                        n511 n511Var3 = ckk1.a;
                                        bbyVarA = bbyVarE3.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    str2 = "AnimatedVisibility";
                                    bjg1 bjg1VarY3 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.N0;
                                        x340Var.s0(objT);
                                    }
                                    int i13 = i8 << 3;
                                    bby bbyVar6 = bbyVarA;
                                    i(bjg1VarY3, (iu30) objT, qim0Var4, bbyVar6, ln00VarA, xu30Var, x340Var, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016), 32);
                                    qim0Var3 = qim0Var4;
                                    bbyVar3 = bbyVar6;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                                }
                            }
                            i3 |= 3072;
                            ln00Var2 = ln00Var;
                            i8 = i3 | 24576;
                            if ((196608 & i) == 0) {
                                if (x340Var.i(xu30Var)) {
                                    i9 = 131072;
                                } else {
                                    i9 = 65536;
                                }
                                i8 |= i9;
                            }
                            if ((74899 & i8) != 74898) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bby bbyVarE4 = xay.e(3, (ni20) null);
                                    n511 n511Var4 = ckk1.a;
                                    bbyVarA = bbyVarE4.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                str2 = "AnimatedVisibility";
                                bjg1 bjg1VarY4 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.N0;
                                    x340Var.s0(objT);
                                }
                                int i14 = i8 << 3;
                                bby bbyVar7 = bbyVarA;
                                i(bjg1VarY4, (iu30) objT, qim0Var4, bbyVar7, ln00VarA, xu30Var, x340Var, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016), 32);
                                qim0Var3 = qim0Var4;
                                bbyVar3 = bbyVar7;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                            }
                        }
                        i3 |= 48;
                        qim0Var2 = qim0Var;
                        i4 = i2 & 4;
                        if (i4 != 0) {
                            if ((i & 384) == 0) {
                                bbyVar2 = bbyVar;
                                if (x340Var.g(bbyVar2)) {
                                    i5 = 256;
                                } else {
                                    i5 = 128;
                                }
                                i3 |= i5;
                            }
                            i6 = i2 & 8;
                            if (i6 != 0) {
                                if ((i & 3072) == 0) {
                                    ln00Var2 = ln00Var;
                                    if (x340Var.g(ln00Var2)) {
                                        i7 = 2048;
                                    } else {
                                        i7 = 1024;
                                    }
                                    i3 |= i7;
                                }
                                i8 = i3 | 24576;
                                if ((196608 & i) == 0) {
                                    if (x340Var.i(xu30Var)) {
                                        i9 = 131072;
                                    } else {
                                        i9 = 65536;
                                    }
                                    i8 |= i9;
                                }
                                if ((74899 & i8) != 74898) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i8 & 1, z2)) {
                                    if (i10 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        bby bbyVarE5 = xay.e(3, (ni20) null);
                                        n511 n511Var5 = ckk1.a;
                                        bbyVarA = bbyVarE5.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                    } else {
                                        bbyVarA = bbyVar2;
                                    }
                                    if (i6 != 0) {
                                        ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                    } else {
                                        ln00VarA = ln00Var2;
                                    }
                                    str2 = "AnimatedVisibility";
                                    bjg1 bjg1VarY5 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                    objT = x340Var.T();
                                    if (objT == fkj0.X) {
                                        objT = k74.N0;
                                        x340Var.s0(objT);
                                    }
                                    int i15 = i8 << 3;
                                    bby bbyVar8 = bbyVarA;
                                    i(bjg1VarY5, (iu30) objT, qim0Var4, bbyVar8, ln00VarA, xu30Var, x340Var, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016), 32);
                                    qim0Var3 = qim0Var4;
                                    bbyVar3 = bbyVar8;
                                    ln00Var3 = ln00VarA;
                                } else {
                                    x340Var.b0();
                                    qim0Var3 = qim0Var2;
                                    bbyVar3 = bbyVar2;
                                    ln00Var3 = ln00Var2;
                                    str2 = str;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                                }
                            }
                            i3 |= 3072;
                            ln00Var2 = ln00Var;
                            i8 = i3 | 24576;
                            if ((196608 & i) == 0) {
                                if (x340Var.i(xu30Var)) {
                                    i9 = 131072;
                                } else {
                                    i9 = 65536;
                                }
                                i8 |= i9;
                            }
                            if ((74899 & i8) != 74898) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bby bbyVarE6 = xay.e(3, (ni20) null);
                                    n511 n511Var6 = ckk1.a;
                                    bbyVarA = bbyVarE6.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                str2 = "AnimatedVisibility";
                                bjg1 bjg1VarY6 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.N0;
                                    x340Var.s0(objT);
                                }
                                int i16 = i8 << 3;
                                bby bbyVar9 = bbyVarA;
                                i(bjg1VarY6, (iu30) objT, qim0Var4, bbyVar9, ln00VarA, xu30Var, x340Var, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016), 32);
                                qim0Var3 = qim0Var4;
                                bbyVar3 = bbyVar9;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                            }
                        }
                        i3 |= 384;
                        bbyVar2 = bbyVar;
                        i6 = i2 & 8;
                        if (i6 != 0) {
                            if ((i & 3072) == 0) {
                                ln00Var2 = ln00Var;
                                if (x340Var.g(ln00Var2)) {
                                    i7 = 2048;
                                } else {
                                    i7 = 1024;
                                }
                                i3 |= i7;
                            }
                            i8 = i3 | 24576;
                            if ((196608 & i) == 0) {
                                if (x340Var.i(xu30Var)) {
                                    i9 = 131072;
                                } else {
                                    i9 = 65536;
                                }
                                i8 |= i9;
                            }
                            if ((74899 & i8) != 74898) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i8 & 1, z2)) {
                                if (i10 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    bby bbyVarE7 = xay.e(3, (ni20) null);
                                    n511 n511Var7 = ckk1.a;
                                    bbyVarA = bbyVarE7.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                                } else {
                                    bbyVarA = bbyVar2;
                                }
                                if (i6 != 0) {
                                    ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                                } else {
                                    ln00VarA = ln00Var2;
                                }
                                str2 = "AnimatedVisibility";
                                bjg1 bjg1VarY7 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = k74.N0;
                                    x340Var.s0(objT);
                                }
                                int i17 = i8 << 3;
                                bby bbyVar10 = bbyVarA;
                                i(bjg1VarY7, (iu30) objT, qim0Var4, bbyVar10, ln00VarA, xu30Var, x340Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016), 32);
                                qim0Var3 = qim0Var4;
                                bbyVar3 = bbyVar10;
                                ln00Var3 = ln00VarA;
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                                bbyVar3 = bbyVar2;
                                ln00Var3 = ln00Var2;
                                str2 = str;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                            }
                        }
                        i3 |= 3072;
                        ln00Var2 = ln00Var;
                        i8 = i3 | 24576;
                        if ((196608 & i) == 0) {
                            if (x340Var.i(xu30Var)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i8 |= i9;
                        }
                        if ((74899 & i8) != 74898) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i8 & 1, z2)) {
                            if (i10 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                bby bbyVarE8 = xay.e(3, (ni20) null);
                                n511 n511Var8 = ckk1.a;
                                bbyVarA = bbyVarE8.a(xay.c(irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1), een.Y, x0y.c1));
                            } else {
                                bbyVarA = bbyVar2;
                            }
                            if (i6 != 0) {
                                ln00VarA = xay.k().a(xay.f(3, (ni20) null));
                            } else {
                                ln00VarA = ln00Var2;
                            }
                            str2 = "AnimatedVisibility";
                            bjg1 bjg1VarY8 = bno1.y(Boolean.valueOf(z), "AnimatedVisibility", x340Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = k74.N0;
                                x340Var.s0(objT);
                            }
                            int i18 = i8 << 3;
                            bby bbyVar11 = bbyVarA;
                            i(bjg1VarY8, (iu30) objT, qim0Var4, bbyVar11, ln00VarA, xu30Var, x340Var, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016), 32);
                            qim0Var3 = qim0Var4;
                            bbyVar3 = bbyVar11;
                            ln00Var3 = ln00VarA;
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            bbyVar3 = bbyVar2;
                            ln00Var3 = ln00Var2;
                            str2 = str;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yc5(z, qim0Var3, bbyVar3, ln00Var3, str2, xu30Var, i, i2, (byte) 0);
                        }
                    }

                    public static final void h(zen0 zen0Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, b0k b0kVar, int i, int i2) {
                        qim0 qim0Var2;
                        int i3;
                        String str2;
                        qim0 qim0Var3;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1763490971);
                        int i4 = (x340Var.g(zen0Var) ? 32 : 16) | i;
                        int i5 = i2 & 2;
                        if (i5 != 0) {
                            i3 = i4 | 384;
                            qim0Var2 = qim0Var;
                        } else {
                            qim0Var2 = qim0Var;
                            i3 = i4 | (x340Var.g(qim0Var2) ? 256 : 128);
                        }
                        if ((i & 3072) == 0) {
                            i3 |= x340Var.g(bbyVar) ? 2048 : 1024;
                        }
                        if ((i & 24576) == 0) {
                            i3 |= x340Var.g(ln00Var) ? 16384 : 8192;
                        }
                        int i6 = i3 | 196608;
                        if (x340Var.Y(i6 & 1, (599185 & i6) != 599184)) {
                            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
                            mhg1 mhg1VarU = bno1.u(zen0Var, "AnimatedVisibility", x340Var, ((i6 >> 3) & 14) | 48, 0);
                            Object objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = k74.S0;
                                x340Var.s0(objT);
                            }
                            i(mhg1VarU, (iu30) objT, qim0Var4, bbyVar, ln00Var, j2iVar, x340Var, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | 1572864, 32);
                            str2 = "AnimatedVisibility";
                            qim0Var3 = qim0Var4;
                        } else {
                            x340Var.b0();
                            str2 = str;
                            qim0Var3 = qim0Var2;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new xc5(zen0Var, qim0Var3, bbyVar, ln00Var, str2, j2iVar, i, i2, (byte) 0);
                        }
                    }

                    public static final void i(mhg1 mhg1Var, iu30 iu30Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, xu30 xu30Var, b0k b0kVar, int i, int i2) {
                        int i3;
                        bby bbyVar2;
                        ln00 ln00Var2;
                        xu30 xu30Var2;
                        m4c m4cVar = fkj0.X;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-497872534);
                        if ((i & 6) == 0) {
                            i3 = (x340Var.g(mhg1Var) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        if ((i & 48) == 0) {
                            i3 |= x340Var.i(iu30Var) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i3 |= x340Var.g(qim0Var) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            bbyVar2 = bbyVar;
                            i3 |= x340Var.g(bbyVar2) ? 2048 : 1024;
                        } else {
                            bbyVar2 = bbyVar;
                        }
                        if ((i & 24576) == 0) {
                            ln00Var2 = ln00Var;
                            i3 |= x340Var.g(ln00Var2) ? 16384 : 8192;
                        } else {
                            ln00Var2 = ln00Var;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= x340Var.i((Object) null) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            xu30Var2 = xu30Var;
                            i3 |= x340Var.i(xu30Var2) ? 1048576 : 524288;
                        } else {
                            xu30Var2 = xu30Var;
                        }
                        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
                            int i4 = i3 & 112;
                            int i5 = i3 & 14;
                            boolean z = (i4 == 32) | (i5 == 4);
                            Object objT = x340Var.T();
                            if (z || objT == m4cVar) {
                                objT = new wf(iu30Var, mhg1Var, (byte) 16);
                                x340Var.s0(objT);
                            }
                            qim0 qim0VarX = j9k1.x(qim0Var, (xu30) objT);
                            Object objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = ad5.b;
                                x340Var.s0(objT2);
                            }
                            int i6 = i5 | 196608 | i4 | (i3 & 7168) | (57344 & i3);
                            int i7 = i3 << 6;
                            a(mhg1Var, iu30Var, qim0VarX, bbyVar2, ln00Var2, (vu30) objT2, xu30Var2, x340Var, i6 | (29360128 & i7) | (i7 & 234881024));
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new bd5(mhg1Var, iu30Var, qim0Var, bbyVar, ln00Var, xu30Var, i, i2, (byte) 0);
                        }
                    }

                    public static final void j(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                        int i2;
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1739039765);
                        if ((i & 6) == 0) {
                            i2 = (x340Var.g(str) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(function0) ? 32 : 16;
                        }
                        int i3 = i2 | 384;
                        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                            qim0 qim0Var3 = nim0.a;
                            c97.a(cwl1.o0(x340Var, 2131952076), cwl1.n0(2131952075, new Object[]{str}, x340Var), qim0Var3, (String) null, (String) null, (String) null, (Function0) null, cwl1.o0(x340Var, 2131952085), function0, (Function0) null, x340Var, (i3 & 896) | ((i3 << 21) & 234881024), 632);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new o82(str, function0, qim0Var2, i, (byte) 1);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
                    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
                    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
                    public static final void k(String str, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i, int i2) {
                        String str2;
                        int i3;
                        qim0 qim0Var2;
                        boolean z;
                        b0k b0kVar2;
                        h311 h311VarV;
                        qim0 qim0Var3;
                        b0k b0kVar3 = (x340) b0kVar;
                        b0kVar3.k0(-514934192);
                        if ((i & 6) == 0) {
                            str2 = str;
                            i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
                        } else {
                            str2 = str;
                            i3 = i;
                        }
                        if ((i & 48) == 0) {
                            i3 |= b0kVar3.i(function0) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i3 |= b0kVar3.i(function1) ? 256 : 128;
                        }
                        int i4 = i2 & 8;
                        if (i4 == 0) {
                            if ((i & 3072) == 0) {
                                qim0Var2 = qim0Var;
                                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
                            }
                            if ((i3 & 1171) != 1170) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i3 & 1, z)) {
                                if (i4 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                b0kVar2 = b0kVar3;
                                c97.a(cwl1.o0(b0kVar3, 2131952079), cwl1.n0(2131952077, new Object[]{str2}, b0kVar3), qim0Var3, cwl1.n0(2131952078, new Object[]{str2}, b0kVar3), cwl1.o0(b0kVar3, 2131952093), cwl1.o0(b0kVar3, 2131952092), function0, (String) null, (Function0) null, function1, b0kVar2, ((i3 >> 3) & 896) | ((i3 << 15) & 3670016) | ((i3 << 21) & 1879048192), 384);
                                qim0Var2 = qim0Var3;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new nj2(str2, function0, function1, qim0Var2, i, i2, (byte) 0);
                            }
                        }
                        i3 |= 3072;
                        qim0Var2 = qim0Var;
                        if ((i3 & 1171) != 1170) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i3 & 1, z)) {
                            if (i4 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            b0kVar2 = b0kVar3;
                            c97.a(cwl1.o0(b0kVar3, 2131952079), cwl1.n0(2131952077, new Object[]{str2}, b0kVar3), qim0Var3, cwl1.n0(2131952078, new Object[]{str2}, b0kVar3), cwl1.o0(b0kVar3, 2131952093), cwl1.o0(b0kVar3, 2131952092), function0, (String) null, (Function0) null, function1, b0kVar2, ((i3 >> 3) & 896) | ((i3 << 15) & 3670016) | ((i3 << 21) & 1879048192), 384);
                            qim0Var2 = qim0Var3;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new nj2(str2, function0, function1, qim0Var2, i, i2, (byte) 0);
                        }
                    }

                    public static final void l(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                        int i2;
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1490204322);
                        if ((i & 6) == 0) {
                            i2 = (x340Var.g(str) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(function0) ? 32 : 16;
                        }
                        int i3 = i2 | 384;
                        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                            qim0 qim0Var3 = nim0.a;
                            c97.a(cwl1.o0(x340Var, 2131952083), cwl1.n0(2131952081, new Object[]{str}, x340Var), qim0Var3, (String) null, (String) null, (String) null, (Function0) null, cwl1.o0(x340Var, 2131952085), function0, (Function0) null, x340Var, (i3 & 896) | ((i3 << 21) & 234881024), 632);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new o82(str, function0, qim0Var2, i, (byte) 2);
                        }
                    }

                    public static final void m(String str, t51 t51Var, t51 t51Var2, qim0 qim0Var, b0k b0kVar, int i) {
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(46933095);
                        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(t51Var) ? 32 : 16) | (x340Var.i(t51Var2) ? 256 : 128) | 3072;
                        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                            int i3 = i2 << 21;
                            qim0 qim0Var3 = nim0.a;
                            c97.a(cwl1.o0(x340Var, 2131952083), cwl1.n0(2131952082, new Object[]{str}, x340Var), qim0Var3, (String) null, (String) null, (String) null, (Function0) null, cwl1.o0(x340Var, 2131952084), t51Var, t51Var2, x340Var, (234881024 & i3) | 384 | (i3 & 1879048192), 120);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new x2(i, str, t51Var, t51Var2, qim0Var2, (byte) 20);
                        }
                    }

                    public static final void n(qyl qylVar, vu30 vu30Var, b0k b0kVar, int i) {
                        int i2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-241170829);
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? x340Var.g(qylVar) : x340Var.i(qylVar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(vu30Var) ? 32 : 16;
                        }
                        boolean z = false;
                        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(qylVar))) {
                                z = true;
                            }
                            Object objT = x340Var.T();
                            if (z || objT == fkj0.X) {
                                objT = new xzj(qylVar);
                                x340Var.s0(objT);
                            }
                            Function0 function0 = (Function0) objT;
                            int i3 = (i2 << 3) & 896;
                            if (!(x340Var.a instanceof wzj)) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(qylVar, x340Var, trj.c1);
                            us71.j((i3 >> 6) & 14, vu30Var, x340Var, true);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new bkh(qylVar, vu30Var, i, (byte) 4);
                        }
                    }

                    public static final void o(uyl uylVar, uyl uylVar2, qyl qylVar, vu30 vu30Var, b0k b0kVar, int i) {
                        int i2;
                        m4c m4cVar = fkj0.X;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1290021450);
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? x340Var.g(uylVar) : x340Var.i(uylVar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= (i & 64) == 0 ? x340Var.g(uylVar2) : x340Var.i(uylVar2) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= (i & 512) == 0 ? x340Var.g(qylVar) : x340Var.i(qylVar) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= x340Var.i(vu30Var) ? 2048 : 1024;
                        }
                        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                            int i3 = i2 & 112;
                            int i4 = i2 & 14;
                            boolean z = (i3 == 32 || ((i2 & 64) != 0 && x340Var.g(uylVar2))) | (i4 == 4 || ((i2 & 8) != 0 && x340Var.g(uylVar)));
                            Object objT = x340Var.T();
                            if (z || objT == m4cVar) {
                                objT = (uylVar == null && uylVar2 == null) ? oyl.a : new kl90(new q0g0(uylVar, uylVar2, (byte) 7));
                                x340Var.s0(objT);
                            }
                            qyl qylVarA = ((qyl) objT).a(qylVar);
                            boolean zI = (i4 == 4 || ((i2 & 8) != 0 && x340Var.i(uylVar))) | x340Var.i(qylVarA) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(uylVar2)));
                            Object objT2 = x340Var.T();
                            if (zI || objT2 == m4cVar) {
                                objT2 = new xzj(qylVarA, uylVar, uylVar2);
                                x340Var.s0(objT2);
                            }
                            Function0 function0 = (Function0) objT2;
                            int i5 = (i2 >> 3) & 896;
                            if (!(x340Var.a instanceof wzj)) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(uylVar, x340Var, trj.d1);
                            nko1.H(uylVar2, x340Var, trj.e1);
                            nko1.H(qylVarA, x340Var, yzj.b);
                            us71.j((i5 >> 6) & 14, vu30Var, x340Var, true);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new c2i(i, uylVar, uylVar2, qylVar, vu30Var, (byte) 5);
                        }
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public static final void p(qyl qylVar, uyl uylVar, uyl uylVar2, uyl uylVar3, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                        int i2;
                        m4c m4cVar = fkj0.X;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1268450237);
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? x340Var.g(qylVar) : x340Var.i(qylVar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= (i & 64) == 0 ? x340Var.g(uylVar) : x340Var.i(uylVar) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= (i & 512) == 0 ? x340Var.g(uylVar2) : x340Var.i(uylVar2) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= (i & 4096) == 0 ? x340Var.g(uylVar3) : x340Var.i(uylVar3) ? 2048 : 1024;
                        }
                        boolean z = true;
                        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                            qyl qylVarA = qylVar.a((qyl) ((Function0) x340Var.k(fq80.a)).invoke());
                            boolean zG = ((i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var.g(uylVar2))) | x340Var.g(qylVarA);
                            if ((i2 & 7168) != 2048 && ((i2 & 4096) == 0 || !x340Var.g(uylVar3))) {
                                z = false;
                            }
                            boolean z2 = zG | z;
                            Object objT = x340Var.T();
                            if (z2 || objT == m4cVar) {
                                objT = ((uylVar2 == null && uylVar3 == null) ? oyl.a : new kl90(new q0g0(uylVar2, uylVar3, (byte) 7))).a(qylVarA);
                                x340Var.s0(objT);
                            }
                            qyl qylVar2 = (qyl) objT;
                            boolean zG2 = x340Var.g(qylVar2);
                            Object objT2 = x340Var.T();
                            nwb0 nwb0Var = nwb0.a;
                            owb0 owb0Var = owb0.a;
                            if (zG2 || objT2 == m4cVar) {
                                ArrayList arrayList = new ArrayList();
                                p811 p811Var = new p811();
                                p811 p811Var2 = new p811();
                                l811 l811Var = new l811();
                                l811 l811Var2 = new l811();
                                qylVar2.foldIn(rih1.a, new cb60(l811Var, arrayList, p811Var, p811Var2, l811Var2));
                                if (l811Var2.a) {
                                    objT2 = owb0Var;
                                } else {
                                    objT2 = !l811Var.a ? nwb0Var : new mwb0(new lwb0(arrayList, (xu30) p811Var.a, (vu30) p811Var2.a));
                                }
                                x340Var.s0(objT2);
                            }
                            pwb0 pwb0Var = (pwb0) objT2;
                            if (u890.j(pwb0Var, nwb0Var)) {
                                x340Var.i0(-790017478);
                                v(uylVar, null, x340Var, (i2 >> 3) & 14, 2);
                                x340Var.r(false);
                            } else if (pwb0Var instanceof mwb0) {
                                x340Var.i0(-790014279);
                                v(uylVar, ((mwb0) pwb0Var).a, x340Var, (i2 >> 3) & 14, 0);
                                x340Var.r(false);
                            } else {
                                if (!u890.j(pwb0Var, owb0Var)) {
                                    throw p3d1.k(x340Var, -790020214, false);
                                }
                                x340Var.i0(-790006020);
                                int i3 = i2 >> 6;
                                o(uylVar2, uylVar3, qylVarA, apo.r(-1007131332, new zzj(uylVar, (byte) 0), x340Var), x340Var, (i3 & 112) | (i3 & 14) | 3072);
                                x340Var.r(false);
                            }
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new c2i(i, qylVar, uylVar, uylVar2, uylVar3, (byte) 6);
                        }
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public static final void q(uyl uylVar, uyl uylVar2, uyl uylVar3, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(690091060);
                        oyl oylVar = oyl.a;
                        int i2 = (x340Var.g(oylVar) ? 4 : 2) | i | (x340Var.g(uylVar) ? 32 : 16) | (x340Var.g(uylVar2) ? 256 : 128) | (x340Var.g(uylVar3) ? 2048 : 1024);
                        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                            p(oylVar, uylVar, uylVar2, uylVar3, x340Var, i2 & 8190);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new mzj(uylVar, uylVar2, uylVar3, i, (byte) 1);
                        }
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public static final void r(qyl qylVar, uyl uylVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                        int i2;
                        qyl qylVar2;
                        uyl uylVar2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1492101964);
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? x340Var.g(qylVar) : x340Var.i(qylVar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= (i & 64) == 0 ? x340Var.g(uylVar) : x340Var.i(uylVar) ? 32 : 16;
                        }
                        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                            qylVar2 = qylVar;
                            uylVar2 = uylVar;
                            p(qylVar2, uylVar2, null, null, x340Var, (i2 & 14) | 3456 | (i2 & 112));
                        } else {
                            qylVar2 = qylVar;
                            uylVar2 = uylVar;
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new bkh(qylVar2, uylVar2, i, (byte) 5);
                        }
                    }

                    public static final void s(t51 t51Var, t51 t51Var2, qim0 qim0Var, b0k b0kVar, int i) {
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-311484540);
                        int i2 = i | (x340Var.i(t51Var) ? 4 : 2) | (x340Var.i(t51Var2) ? 32 : 16) | 384;
                        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                            qim0 qim0Var3 = nim0.a;
                            c97.a(cwl1.o0(x340Var, 2131952087), cwl1.o0(x340Var, 2131952086), qim0Var3, (String) null, cwl1.o0(x340Var, 2131952074), (String) null, t51Var, (String) null, (Function0) null, t51Var2, x340Var, 384 | ((i2 << 18) & 3670016) | ((i2 << 24) & 1879048192), 424);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new q1(t51Var, t51Var2, qim0Var2, i, (byte) 29);
                        }
                    }

                    public static final void t(t51 t51Var, t51 t51Var2, qim0 qim0Var, b0k b0kVar, int i) {
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-172729461);
                        int i2 = i | (x340Var.i(t51Var) ? 4 : 2) | (x340Var.i(t51Var2) ? 32 : 16) | 384;
                        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                            int i3 = i2 << 24;
                            qim0 qim0Var3 = nim0.a;
                            c97.a(cwl1.o0(x340Var, 2131952089), cwl1.o0(x340Var, 2131952088), qim0Var3, (String) null, (String) null, (String) null, (Function0) null, cwl1.o0(x340Var, 2131952084), t51Var, t51Var2, x340Var, 384 | (234881024 & i3) | (i3 & 1879048192), 120);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new oj2(t51Var, t51Var2, qim0Var2, i, (byte) 0);
                        }
                    }

                    public static final void u(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
                        int i2;
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1743931692);
                        if ((i & 6) == 0) {
                            i2 = i | (x340Var.i(function0) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(function1) ? 32 : 16;
                        }
                        int i3 = i2 | 384;
                        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                            qim0 qim0Var3 = nim0.a;
                            c97.a(cwl1.o0(x340Var, 2131952091), cwl1.o0(x340Var, 2131952090), qim0Var3, (String) null, cwl1.o0(x340Var, 2131952074), (String) null, function0, cwl1.o0(x340Var, 2131952085), function1, (Function0) null, x340Var, (i3 & 896) | ((i3 << 18) & 3670016) | ((i3 << 21) & 234881024), 552);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new pj2(function0, function1, qim0Var2, i, (byte) 0);
                        }
                    }

                    public static final void v(uyl uylVar, lwb0 lwb0Var, b0k b0kVar, int i, int i2) {
                        int i3;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(2012350396);
                        if ((i & 6) == 0) {
                            i3 = ((i & 8) == 0 ? x340Var.g(uylVar) : x340Var.i(uylVar) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        int i4 = i2 & 2;
                        if (i4 != 0) {
                            i3 |= 48;
                        } else if ((i & 48) == 0) {
                            i3 |= x340Var.g(lwb0Var) ? 32 : 16;
                        }
                        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
                            if (i4 != 0) {
                                lwb0Var = null;
                            }
                            d0r d0rVar = (d0r) x340Var.k(gde0.a);
                            boolean zI = ((i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(uylVar))) | x340Var.i(d0rVar) | ((i3 & 112) == 32);
                            Object objT = x340Var.T();
                            if (zI || objT == fkj0.X) {
                                objT = new d1c(uylVar, d0rVar, lwb0Var, (byte) 24);
                                x340Var.s0(objT);
                            }
                            Function0 function0 = (Function0) objT;
                            if (!(x340Var.a instanceof wzj)) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(uylVar, x340Var, new zzj(uylVar, (byte) 1));
                            nko1.H(lwb0Var, x340Var, yzj.c);
                            x340Var.r(true);
                        } else {
                            x340Var.b0();
                        }
                        lwb0 lwb0Var2 = lwb0Var;
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ux1(uylVar, lwb0Var2, i, i2, (byte) 2);
                        }
                    }

                    public static final void w(gt40 gt40Var, b0k b0kVar, int i) {
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1033328181);
                        int i2 = i | 6;
                        byte b2 = 2;
                        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                            long j = ((s3v) x340Var.k(p4k.a)).a;
                            float fB = s3v.b(j) - 16.0f;
                            float fA = s3v.a(j) - 16.0f;
                            float f = oe91.c + 8.0f;
                            int iMin = Math.min(4, (int) ((fB + 8.0f) / f));
                            int iMin2 = Math.min(4, (int) ((fA + 8.0f) / f));
                            if (iMin < 2 || iMin2 < 2) {
                                h311 h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new t491(i, b2);
                                    return;
                                }
                                return;
                            }
                            gt40 gt40Var2 = et40.a;
                            j2h1.b(eqr0.E(ila0.l(dm5.I(gt40Var2), abh.a), 8.0f), ql3.g, apo.r(-1175268695, new d681((byte) 1, iMin2, iMin), x340Var), x340Var, 384, 0);
                            gt40Var = gt40Var2;
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV2 = x340Var.v();
                        if (h311VarV2 != null) {
                            h311VarV2.d = new m7x(gt40Var, i, (byte) 1);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
                    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
                    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
                    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
                    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0085 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
                    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
                    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
                    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
                    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
                    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
                    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
                    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
                    public static final void x(xu30 xu30Var, float f, qim0 qim0Var, xu30 xu30Var2, xu30 xu30Var3, b0k b0kVar, int i, int i2) {
                        int i3;
                        qim0 qim0Var2;
                        xu30 xu30Var4;
                        boolean z;
                        qim0 qim0Var3;
                        h311 h311VarV;
                        Object objT;
                        mbh mbhVarA;
                        int iHashCode;
                        xos0 xos0VarM;
                        qim0 qim0VarE;
                        int i4;
                        int i5;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1497774435);
                        if ((i & 6) == 0) {
                            i3 = (x340Var.i(xu30Var) ? 4 : 2) | i;
                        } else {
                            i3 = i;
                        }
                        if ((i & 48) == 0) {
                            i3 |= x340Var.d(f) ? 32 : 16;
                        }
                        int i6 = i2 & 4;
                        if (i6 == 0) {
                            if ((i & 384) == 0) {
                                qim0Var2 = qim0Var;
                                i3 |= x340Var.i(qim0Var2) ? 256 : 128;
                            }
                            if ((i & 3072) == 0) {
                                if (x340Var.i(xu30Var2)) {
                                    i5 = 2048;
                                } else {
                                    i5 = 1024;
                                }
                                i3 |= i5;
                            }
                            if ((i & 24576) == 0) {
                                xu30Var4 = xu30Var3;
                                if (x340Var.i(xu30Var4)) {
                                    i4 = 16384;
                                } else {
                                    i4 = 8192;
                                }
                                i3 |= i4;
                            } else {
                                xu30Var4 = xu30Var3;
                            }
                            if ((i3 & 9363) != 9362) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i3 & 1, z)) {
                                if (i6 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = nhe1.P0;
                                    x340Var.s0(objT);
                                }
                                qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
                                mbhVarA = jbh.a(new d36(f, true, new um5(false)), een.P0, x340Var, 0);
                                iHashCode = Long.hashCode(x340Var.T);
                                xos0VarM = x340Var.m();
                                qim0VarE = zr7.E(x340Var, qim0VarB);
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(mbhVarA, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                uwr uwrVar = cbx.a;
                                cwl1.d((i3 >> 9) & 14, 14, cbx.a(x340Var).b.b, (tl3) null, x340Var, xu30Var2, (qim0) null, cbx.d(x340Var).j);
                                cwl1.e((i3 << 15) & 458752, 31, 0L, (tl3) null, x340Var, xu30Var, (qim0) null, (lee1) null);
                                cwl1.d((i3 >> 12) & 14, 14, cbx.a(x340Var).b.b, (tl3) null, x340Var, xu30Var4, (qim0) null, cbx.d(x340Var).j);
                                x340Var.r(true);
                            } else {
                                x340Var.b0();
                                qim0Var3 = qim0Var2;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fst(xu30Var, f, qim0Var3, xu30Var2, xu30Var3, i, i2);
                            }
                        }
                        i3 |= 384;
                        qim0Var2 = qim0Var;
                        if ((i & 3072) == 0) {
                            if (x340Var.i(xu30Var2)) {
                                i5 = 2048;
                            } else {
                                i5 = 1024;
                            }
                            i3 |= i5;
                        }
                        if ((i & 24576) == 0) {
                            xu30Var4 = xu30Var3;
                            if (x340Var.i(xu30Var4)) {
                                i4 = 16384;
                            } else {
                                i4 = 8192;
                            }
                            i3 |= i4;
                        } else {
                            xu30Var4 = xu30Var3;
                        }
                        if ((i3 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i3 & 1, z)) {
                            if (i6 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = nhe1.P0;
                                x340Var.s0(objT);
                            }
                            qim0 qim0VarB2 = s161.b(qim0Var3, false, (iu30) objT);
                            mbhVarA = jbh.a(new d36(f, true, new um5(false)), een.P0, x340Var, 0);
                            iHashCode = Long.hashCode(x340Var.T);
                            xos0VarM = x340Var.m();
                            qim0VarE = zr7.E(x340Var, qim0VarB2);
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(mbhVarA, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            uwr uwrVar2 = cbx.a;
                            cwl1.d((i3 >> 9) & 14, 14, cbx.a(x340Var).b.b, (tl3) null, x340Var, xu30Var2, (qim0) null, cbx.d(x340Var).j);
                            cwl1.e((i3 << 15) & 458752, 31, 0L, (tl3) null, x340Var, xu30Var, (qim0) null, (lee1) null);
                            cwl1.d((i3 >> 12) & 14, 14, cbx.a(x340Var).b.b, (tl3) null, x340Var, xu30Var4, (qim0) null, cbx.d(x340Var).j);
                            x340Var.r(true);
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fst(xu30Var, f, qim0Var3, xu30Var2, xu30Var3, i, i2);
                        }
                    }

                    public static final void y(xj61 xj61Var, k980 k980Var, Set set, boolean z) {
                        if (z || set.contains(k980Var)) {
                            xj61Var.add(k980Var);
                        }
                    }

                    public static eeh z(String str) {
                        return new eeh(2, cy30.g("com.spotify.music.extra.ERROR", str));
                    }
                }
