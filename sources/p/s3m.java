package p;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3m implements h0r0 {
    public final qyj a;
    public final hs3 b;
    public final p1m c;
    public final gw70 d;
    public final grk0 e;
    public final rzo0 f;
    public final n8p g;
    public final edr0 h;
    public final a2r0 i;
    public final cbr0 j;

    public s3m(qyj qyjVar, hs3 hs3Var, p1m p1mVar, gw70 gw70Var, grk0 grk0Var, rzo0 rzo0Var, n8p n8pVar, edr0 edr0Var, a2r0 a2r0Var, q7r0 q7r0Var) {
        this.a = qyjVar;
        this.b = hs3Var;
        this.c = p1mVar;
        this.d = gw70Var;
        this.e = grk0Var;
        this.f = rzo0Var;
        this.g = n8pVar;
        this.h = edr0Var;
        this.i = a2r0Var;
        zo41 zo41Var = ((ls3) ((ks3) hs3Var).e.a.getValue()).b.c;
        if (zo41Var instanceof ro41) {
            ro41 ro41Var = (ro41) zo41Var;
            if (p1mVar.i == null) {
                MobiusLoop mobiusLoopG = l1d.g(Mobius.d(new drm1((byte) 7), RxConnectables.a(p1mVar.a.a(new o1m(p1mVar, (byte) 1))))).d(new kba(p1mVar, (byte) 25)).b(new ps7(p1mVar, (byte) 28)).g(ro41Var);
                mobiusLoopG.b(new o1m(p1mVar, (byte) 0));
                p1mVar.i = mobiusLoopG;
            }
        } else {
            n57.e("ContentPicker page created for screen: ".concat(zo41Var.S()));
        }
        x8c0 lifecycle = q7r0Var.d.c.getLifecycle();
        lifecycle.a(new zh0(lifecycle, p1mVar, (byte) 3));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.j = new cbr0(new dbr0[]{new bn70(yon1.G1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, qm3.b), new lik1("spotify:internal:allboarding:origin:default"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.j;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1563757364, new q3m(this, (byte) 4), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var;
        Object af0Var;
        s3m s3mVar;
        s3m s3mVar2 = this;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1425684124);
        int i2 = i | (x340Var2.i(s3mVar2) ? 4 : 2);
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            p1m p1mVar = s3mVar2.c;
            ven0 ven0VarH = rwq.h(p1mVar.e, x340Var2, 0);
            boolean zI = x340Var2.i(s3mVar2) | x340Var2.i(ven0VarH);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new gmj(s3mVar2, ven0VarH, (byte) 24);
                x340Var2.s0(objT);
            }
            qxd0.S((Function0) objT, x340Var2);
            Resources resources = ((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b)).getResources();
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object[] objArr = new Object[0];
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = aok.W0;
                x340Var2.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) k5p1.s(objArr, (Function0) objT4, x340Var2, 48);
            Object[] objArr2 = new Object[0];
            df41 df41Var = l591.c;
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = aok.X0;
                x340Var2.s0(objT5);
            }
            ven0 ven0VarV = k5p1.v(objArr2, df41Var, (Function0) objT5, x340Var2, 384);
            boolean zI2 = x340Var2.i(s3mVar2) | x340Var2.i(ven0Var) | x340Var2.i(ven0Var2) | x340Var2.i(resources) | x340Var2.i(ven0Var3) | x340Var2.i(ven0VarV);
            Object objT6 = x340Var2.T();
            if (zI2 || objT6 == m4cVar) {
                af0Var = new af0(this, resources, ven0Var, ven0Var2, ven0Var3, ven0VarV, (lnm) null, (byte) 7);
                s3mVar = this;
                x340Var2.s0(af0Var);
            } else {
                s3mVar = s3mVar2;
                af0Var = objT6;
            }
            qxd0.t(rih1.a, x340Var2, (vu30) af0Var);
            l591 l591Var = (l591) ven0VarV.getValue();
            if (l591Var == null) {
                x340Var2.i0(377401813);
                x340Var2.r(false);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(377401814);
                p791 p791Var = l591Var.b;
                String str = l591Var.a;
                boolean zI3 = x340Var2.i(ven0VarV) | x340Var2.i(s3mVar);
                Object objT7 = x340Var2.T();
                if (zI3 || objT7 == m4cVar) {
                    objT7 = new gmj(s3mVar, ven0VarV, (byte) 25);
                    x340Var2.s0(objT7);
                }
                Function0 function0 = (Function0) objT7;
                boolean zI4 = x340Var2.i(ven0VarV);
                Object objT8 = x340Var2.T();
                if (zI4 || objT8 == m4cVar) {
                    objT8 = new hnf(ven0VarV, (byte) 8);
                    x340Var2.s0(objT8);
                }
                x340Var = x340Var2;
                acq0.a(p791Var, str, s3mVar.i, function0, (Function0) objT8, x340Var, 0);
                x340Var.r(false);
            }
            SearchConfiguration searchConfiguration = (SearchConfiguration) ven0Var3.getValue();
            if (searchConfiguration != null) {
                x340Var.i0(377770528);
                boolean zI5 = x340Var.i(ven0Var3);
                Object objT9 = x340Var.T();
                if (zI5 || objT9 == m4cVar) {
                    objT9 = new hnf(ven0Var3, (byte) 9);
                    x340Var.s0(objT9);
                }
                s3mVar.e(searchConfiguration, (Function0) objT9, x340Var, (i2 << 6) & 896);
                x340Var.r(false);
                s3mVar2 = s3mVar;
            } else {
                x340Var.i0(377880206);
                boolean zI6 = x340Var.i(p1mVar);
                Object objT10 = x340Var.T();
                if (zI6 || objT10 == m4cVar) {
                    l1k l1kVar = new l1k(0, p1mVar, p1m.class, "onBackPressed", "onBackPressed()V", 0, (byte) 4);
                    x340Var.s0(l1kVar);
                    objT10 = l1kVar;
                }
                q3p1.b(0, 1, (Function0) objT10, x340Var, false);
                ro41 ro41Var = (ro41) ven0VarH.getValue();
                Integer num = (Integer) ven0Var.getValue();
                String str2 = (String) ven0Var2.getValue();
                boolean zI7 = x340Var.i(ven0Var);
                Object objT11 = x340Var.T();
                if (zI7 || objT11 == m4cVar) {
                    objT11 = new hnf(ven0Var, (byte) 10);
                    x340Var.s0(objT11);
                }
                s3mVar2 = s3mVar;
                s3mVar2.d(ro41Var, num, str2, (Function0) objT11, x340Var, 57344 & (i2 << 12));
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3m(s3mVar2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0401  */
    /* JADX WARN: Code duplicated, block: B:119:0x0406  */
    /* JADX WARN: Code duplicated, block: B:124:0x044c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0475  */
    /* JADX WARN: Code duplicated, block: B:128:0x0479  */
    /* JADX WARN: Code duplicated, block: B:131:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:132:0x04af  */
    /* JADX WARN: Code duplicated, block: B:135:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x04bc  */
    public final void d(ro41 ro41Var, Integer num, String str, Function0 function0, b0k b0kVar, int i) {
        int i2;
        boolean z;
        p1m p1mVar;
        Object xws0Var;
        grk0 grk0Var;
        byte b;
        Function0 function1;
        Object obj;
        m20 m20Var;
        String str2;
        String str3;
        m20 m20Var2;
        boolean zI;
        Object objT;
        String str4;
        m20 m20Var3;
        String str5;
        ro41 ro41Var2 = ro41Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(284539796);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(ro41Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.g(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(this) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Resources resources = ((Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b)).getResources();
            wat watVar = (wat) b0kVar2.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            int i3 = lhc.g(b0kVar2).f.e().b;
            int i4 = lhc.g(b0kVar2).e.e().d;
            int iI0 = watVar.i0(56.0f) + i3;
            Object[] objArr = new Object[0];
            df41 df41Var = ozg.d;
            Object objT2 = b0kVar2.T();
            Object obj2 = fkj0.X;
            if (objT2 == obj2) {
                objT2 = aok.Y0;
                b0kVar2.s0(objT2);
            }
            ozg ozgVar = (ozg) k5p1.u(objArr, df41Var, (Function0) objT2, b0kVar2, 384);
            Object objT3 = b0kVar2.T();
            if (objT3 == obj2) {
                z = false;
                objT3 = bb00.h(0, b0kVar2);
            } else {
                z = false;
            }
            err0 err0Var = (hdn0) objT3;
            SearchConfiguration searchConfiguration = ro41Var2.e;
            List list = ro41Var2.c;
            m20 m20Var4 = ro41Var2.f;
            List list2 = ro41Var2.i;
            boolean z2 = searchConfiguration != null ? true : z;
            String placeholder = searchConfiguration != null ? searchConfiguration.getPlaceholder() : null;
            if (placeholder == null) {
                placeholder = "";
            }
            String str6 = placeholder;
            grk0 grk0Var2 = this.e;
            boolean zG = b0kVar2.g(grk0Var2);
            Object objT4 = b0kVar2.T();
            p1m p1mVar2 = this.c;
            if (zG || objT4 == obj2) {
                p1mVar = p1mVar2;
                objT4 = new dxs0(new r3m(this, (byte) 3), new l1k(0, p1mVar, p1m.class, "onSearchClicked", "onSearchClicked()V", 0, (byte) 10), new ptj(1, p1mVar, p1m.class, "onTagClicked", "onTagClicked(Lcom/spotify/allboarding/allboardingdomain/model/PickerTag;)V", 0, (byte) 12), new q3m(this, (byte) 3));
                b0kVar2.s0(objT4);
            } else {
                p1mVar = p1mVar2;
            }
            dxs0 dxs0Var = (dxs0) objT4;
            boolean zG2 = b0kVar2.g(grk0Var2);
            Object objT5 = b0kVar2.T();
            if (zG2 || objT5 == obj2) {
                grk0Var = grk0Var2;
                b = 1;
                xws0Var = new xws0(new r3m(this, (byte) 2), new l1k(0, p1mVar, p1m.class, "onSearchClicked", "onSearchClicked()V", 0, (byte) 8), new ptj(1, p1mVar, p1m.class, "onTagClicked", "onTagClicked(Lcom/spotify/allboarding/allboardingdomain/model/PickerTag;)V", 0, (byte) 11), new q3m(this, (byte) 2), new l1k(0, ozgVar, ozg.class, "expand", "expand()V", 0, (byte) 9), function0);
                b0kVar2.s0(xws0Var);
            } else {
                grk0Var = grk0Var2;
                b = 1;
                xws0Var = objT5;
            }
            xws0 xws0Var2 = (xws0) xws0Var;
            boolean zG3 = b0kVar2.g(grk0Var);
            Object objT6 = b0kVar2.T();
            if (zG3 || objT6 == obj2) {
                objT6 = new iws0(this.d, new r3m(this, b), new j1(2, p1mVar, p1m.class, "onItemClicked", "onItemClicked(Lcom/spotify/allboarding/allboardingdomain/model/PickerItem$Picker;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 20), new kjk(this, ozgVar, (byte) 14), new l1k(0, p1mVar, p1m.class, "onPrimaryButtonPressed", "onPrimaryButtonPressed()V", 0, (byte) 7), new q3m(this, b));
                b0kVar2.s0(objT6);
            }
            iws0 iws0Var = (iws0) objT6;
            boolean zG4 = b0kVar2.g(grk0Var);
            Object objT7 = b0kVar2.T();
            if (zG4 || objT7 == obj2) {
                int i5 = 0;
                int i6 = 0;
                Class<p1m> cls = p1m.class;
                objT7 = new nvs0(new r3m(this, (byte) 0), new l1k(i6, p1mVar, cls, "onPrimaryButtonPressed", "onPrimaryButtonPressed()V", i5, (byte) 5), new l1k(i6, p1mVar, cls, "onSecondaryButtonPressed", "onSecondaryButtonPressed()V", i5, (byte) 6));
                b0kVar2.s0(objT7);
            }
            nvs0 nvs0Var = (nvs0) objT7;
            txs0 txs0VarM = wpo1.m(ro41Var2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarL = bmq0.L(dug.f(qim0VarD, cbx.a(b0kVar2).a.c, d4o1.a), ozgVar.c, (g6o0) null);
            boolean z3 = (i2 & 896) == 256;
            Object objT8 = b0kVar2.T();
            if (z3 || objT8 == obj2) {
                objT8 = new kak(str, (byte) 15);
                b0kVar2.s0(objT8);
            }
            qim0 qim0VarB = s161.b(qim0VarL, false, (iu30) objT8);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z4 = ((x340) b0kVar2).S;
            Function0 function2 = hmb0.t1;
            if (z4) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarD2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            boolean z5 = z2;
            eqn1.a(dxs0Var, ozgVar, ro41Var2.b, z5, str6, ro41Var2.i, iI0, b0kVar2, 8);
            b0kVar2 = b0kVar2;
            otw.c(xws0Var2, new vws0(z5, str6, list2, num), (qim0) null, (ipb1) null, b0kVar2, 72, 12);
            qim0 qim0VarH = kx40.h(1.0f, u291.f(nim0Var, 1.0f), true);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarH);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function1 = function2;
                b0kVar2.l(function1);
            } else {
                function1 = function2;
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            boolean zG5 = b0kVar2.g(list) | b0kVar2.g(txs0VarM);
            Object objT9 = b0kVar2.T();
            if (zG5) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objT9 == obj) {
                }
                List list3 = (List) objT9;
                int integer = resources.getInteger(2131492867);
                int integer2 = resources.getInteger(2131492868);
                Integer num2 = ro41Var.Y;
                int iS = err0Var.s();
                if (wpo1.u(ro41Var) || m20Var4 == null) {
                    m20Var = m20Var4;
                    str2 = null;
                } else {
                    m20Var = m20Var4;
                    str2 = m20Var.a;
                }
                if (txs0VarM != null) {
                    str3 = txs0VarM.b;
                } else {
                    str3 = null;
                }
                m20Var2 = m20Var;
                Object obj3 = obj;
                otw.c(iws0Var, new fws0(list3, integer, integer2, num2, iS, false, str2, str3), u291.d(nim0Var, 1.0f), (ipb1) null, b0kVar2, 72, 8);
                b0kVar2.r(true);
                b0kVar2.r(true);
                qim0 qim0VarF = u291.f(h2c.a.a(nim0Var, een.X), 1.0f);
                zI = b0kVar2.i(err0Var);
                objT = b0kVar2.T();
                if (zI || objT == obj3) {
                    objT = new tu9(err0Var, (byte) 5);
                    b0kVar2.s0(objT);
                }
                qim0 qim0VarU = lrn1.u(qim0VarF, (iu30) objT);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarU);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC3, b0kVar2, lljVar);
                nko1.H(xos0VarM4, b0kVar2, lljVar2);
                x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, lljVar4);
                int iO = wpo1.o(ro41Var);
                int iP = wpo1.p(ro41Var);
                boolean z6 = !list2.isEmpty();
                ro41Var2 = ro41Var;
                boolean z7 = ro41Var2.X;
                boolean zU = wpo1.u(ro41Var2);
                if (m20Var2 != null) {
                    str4 = m20Var2.a;
                } else {
                    str4 = null;
                }
                m20Var3 = ro41Var2.g;
                if (m20Var3 != null) {
                    str5 = m20Var3.a;
                } else {
                    str5 = null;
                }
                otw.c(nvs0Var, new ovs0(iO, iP, z6, z7, zU, str4, str5, i4), (qim0) null, (ipb1) null, b0kVar2, 8, 12);
                b0kVar2.r(true);
                b0kVar2.r(true);
            }
            objT9 = cyo1.o(list, wpo1.m(ro41Var));
            b0kVar2.s0(objT9);
            List list4 = (List) objT9;
            int integer3 = resources.getInteger(2131492867);
            int integer4 = resources.getInteger(2131492868);
            Integer num3 = ro41Var.Y;
            int iS2 = err0Var.s();
            if (wpo1.u(ro41Var)) {
                m20Var = m20Var4;
                str2 = null;
            } else {
                m20Var = m20Var4;
                str2 = null;
            }
            if (txs0VarM != null) {
                str3 = txs0VarM.b;
            } else {
                str3 = null;
            }
            m20Var2 = m20Var;
            Object obj4 = obj;
            otw.c(iws0Var, new fws0(list4, integer3, integer4, num3, iS2, false, str2, str3), u291.d(nim0Var, 1.0f), (ipb1) null, b0kVar2, 72, 8);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0 qim0VarF2 = u291.f(h2c.a.a(nim0Var, een.X), 1.0f);
            zI = b0kVar2.i(err0Var);
            objT = b0kVar2.T();
            if (zI) {
                objT = new tu9(err0Var, (byte) 5);
                b0kVar2.s0(objT);
            } else {
                objT = new tu9(err0Var, (byte) 5);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarU2 = lrn1.u(qim0VarF2, (iu30) objT);
            gfh0 gfh0VarC4 = t1c.c(graVar, false);
            int iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM5 = b0kVar2.m();
            qim0 qim0VarE5 = zr7.E(b0kVar2, qim0VarU2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC4, b0kVar2, lljVar);
            nko1.H(xos0VarM5, b0kVar2, lljVar2);
            x0d.q(iHashCode5, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE5, b0kVar2, lljVar4);
            int iO2 = wpo1.o(ro41Var);
            int iP2 = wpo1.p(ro41Var);
            boolean z8 = !list2.isEmpty();
            ro41Var2 = ro41Var;
            boolean z9 = ro41Var2.X;
            boolean zU2 = wpo1.u(ro41Var2);
            if (m20Var2 != null) {
                str4 = m20Var2.a;
            } else {
                str4 = null;
            }
            m20Var3 = ro41Var2.g;
            if (m20Var3 != null) {
                str5 = m20Var3.a;
            } else {
                str5 = null;
            }
            otw.c(nvs0Var, new ovs0(iO2, iP2, z8, z9, zU2, str4, str5, i4), (qim0) null, (ipb1) null, b0kVar2, 8, 12);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(this, ro41Var2, num, str, function0, i);
        }
    }

    public final void e(SearchConfiguration searchConfiguration, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(725254455);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(searchConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(this) ? 256 : 128;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = aok.Z0;
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, b0kVar3, 48);
            boolean zG = b0kVar3.g(searchConfiguration);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                function1 = function0;
                objT2 = this.g.a(new bt3(new jjk(this, function0, (byte) 15), function0, function0, new f4g(ven0Var, (byte) 25), we3.e1));
                b0kVar3.s0(objT2);
            } else {
                function1 = function0;
            }
            q3p1.b(i3 & 112, 1, function1, b0kVar3, false);
            b0kVar2 = b0kVar3;
            otw.c((ft3) objT2, new ct3(searchConfiguration.getUrl(), searchConfiguration.getPlaceholder(), searchConfiguration.getInitialText(), (String) ven0Var.getValue(), z6x.a), (qim0) null, (ipb1) null, b0kVar2, 72, 12);
        } else {
            function1 = function0;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, searchConfiguration, function1, i, (byte) 6);
        }
    }
}
