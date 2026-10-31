package p;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsDetailsResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zso1 implements uax, z1k {
    public static b180 a;

    public static void A(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static final ru7 B(uw0 uw0Var) {
        asn asnVar = new asn();
        asnVar.a = uw0Var;
        asnVar.b = new ewo(asnVar, 0, (byte) 10);
        asnVar.c = new ewo(asnVar, 1, (byte) 10);
        fnh0 fnh0Var = (fnh0) uw0Var.g;
        c8o.l(fnh0Var);
        inh0 inh0Var = (inh0) uw0Var.Z;
        c8o.l(inh0Var);
        v5u0 v5u0Var = (v5u0) uw0Var.h;
        c8o.l(v5u0Var);
        c3s c3sVar = (c3s) uw0Var.f;
        c8o.l(c3sVar);
        x6o0 x6o0Var = new x6o0(c3sVar, (byte) 3);
        ynb0 ynb0VarA = xqu.a((ewo) asnVar.b);
        ynb0 ynb0VarA2 = xqu.a((ewo) asnVar.c);
        Flowable flowable = (Flowable) uw0Var.X;
        c8o.l(flowable);
        Scheduler scheduler = (Scheduler) uw0Var.c;
        c8o.l(scheduler);
        Set set = (Set) uw0Var.d;
        c8o.l(set);
        Set set2 = set;
        Observable observable = (Observable) uw0Var.b;
        c8o.l(observable);
        sf0 sf0Var = (sf0) uw0Var.N0;
        c8o.l(sf0Var);
        m54 m54Var = (m54) uw0Var.O0;
        c8o.l(m54Var);
        mw7 mw7Var = (mw7) uw0Var.e;
        c8o.l(mw7Var);
        RxRouter rxRouter = (RxRouter) uw0Var.Y;
        c8o.l(rxRouter);
        return new ru7(fnh0Var, inh0Var, v5u0Var, x6o0Var, ynb0VarA, ynb0VarA2, flowable, scheduler, set2, observable, sf0Var, m54Var, mw7Var, new v6a0(new be(new CosmosTransport(new opy0(rxRouter, (byte) 2)))));
    }

    public static void C() {
        eps0 eps0Var = eps0.d;
    }

    public static final u9c0 H(x8c0 x8c0Var) {
        AtomicReference atomicReference = (AtomicReference) x8c0Var.a.b;
        while (true) {
            u9c0 u9c0Var = (u9c0) atomicReference.get();
            if (u9c0Var != null) {
                return u9c0Var;
            }
            j0d1 j0d1VarB = guo1.B();
            fns fnsVar = igu.a;
            u9c0 u9c0Var2 = new u9c0(x8c0Var, flo1.l(j0d1VarB, pyf0.a.f));
            do {
                if (atomicReference.compareAndSet(null, u9c0Var2)) {
                    fns fnsVar2 = igu.a;
                    fn31.T(u9c0Var2, pyf0.a.f, 0, new e9c0(u9c0Var2, (lnm) null, (byte) 1), 2);
                    return u9c0Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static List K() {
        return Collections.singletonList(rc11.a.b(xa20.class));
    }

    public static void M(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!V(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !V(b3) && !V(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.a();
    }

    public static void N(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (V(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || V(b3)))) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void Q(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || V(b2)) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static final go80 T(klm klmVar, qbp0 qbp0Var) {
        return klmVar.a("BluetoothPowerStateDaemon", new nap0(qbp0Var, (byte) 10));
    }

    public static boolean V(byte b) {
        return b > -65;
    }

    public static final void X(StatsDetailsResponse statsDetailsResponse, ArrayList arrayList) {
        oxc1 oxc1Var;
        d761 d761VarA = b761.a(statsDetailsResponse.q());
        d761 d761VarA2 = statsDetailsResponse.w() ? b761.a(statsDetailsResponse.u()) : null;
        String subtitle = statsDetailsResponse.getSubtitle();
        subtitle.getClass();
        String str = subtitle.length() > 0 ? subtitle : null;
        int iT = statsDetailsResponse.t();
        if (iT == 0) {
            oxc1Var = null;
        } else {
            oxc1Var = iT > 0 ? new oxc1(iT, 2131963623, 2131104257, 2131233993) : new oxc1(iT, 2131963622, 2131104256, 2131233992);
        }
        String strR = statsDetailsResponse.r();
        strR.getClass();
        arrayList.add(new qxc1(d761VarA, d761VarA2, str, strR.length() > 0 ? strR : null, oxc1Var, (Integer) null, 32));
        if (statsDetailsResponse.p() == 3 || statsDetailsResponse.getSubtitle().length() <= 0) {
            return;
        }
        arrayList.add(emu.a);
    }

    public static final idn0 Y(b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        if (!((Boolean) x340Var.k(ny20.a)).booleanValue()) {
            x340Var.i0(-636354276);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            x340Var.r(false);
            return idn0Var;
        }
        x340Var.i0(-636406666);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new cz3();
            x340Var.s0(objT2);
        }
        cz3 cz3Var = (cz3) objT2;
        x340Var.r(false);
        return cz3Var;
    }

    public static Float b0(String str, Set set) {
        if (set.contains(str)) {
            return Float.valueOf(10.0f);
        }
        Set set2 = set;
        boolean z = set2 instanceof Collection;
        if (!z || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (nhc1.Y((String) it.next(), str, false)) {
                    return Float.valueOf(5.0f);
                }
            }
        }
        if (z && set2.isEmpty()) {
            return null;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (ihc1.h0((String) it2.next(), str, false)) {
                return Float.valueOf(1.0f);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final op80 c0(tfr0 tfr0Var, op80 op80Var) {
        k3h1 k3h1Var;
        k3h1 k3h1Var2 = q6x.b;
        Integer num = tfr0Var.a;
        if (num != null) {
            k3h1Var = new k3h1(num.intValue());
            if (k3h1Var.equals(k3h1Var2)) {
                k3h1Var = k3h1Var2;
            }
        } else {
            k3h1Var = k3h1Var2;
        }
        y6h1 y6h1Var = tfr0Var.b;
        if (y6h1Var != null) {
            h3h1 h3h1Var = new h3h1(new q3o(op80Var, y6h1Var, (byte) 0));
            if (k3h1Var.equals(k3h1Var2) && h3h1Var.equals(k3h1Var2)) {
                return k3h1Var2;
            }
            if (k3h1Var.equals(k3h1Var2)) {
                return h3h1Var;
            }
            if (!h3h1Var.equals(k3h1Var2)) {
                return new wch(k3h1Var, h3h1Var);
            }
        }
        return k3h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:236:0x0382  */
    /* JADX WARN: Code duplicated, block: B:333:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:337:0x06e3  */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v42 */
    public static final void f(uef uefVar, iu30 iu30Var, d0r d0rVar, String str, quc0 quc0Var, bzi0 bzi0Var, boolean z, r171 r171Var, y0f y0fVar, ymq0 ymq0Var, ahs0 ahs0Var, f5f f5fVar, u7i1 u7i1Var, asf asfVar, j780 j780Var, h7f h7fVar, ig31 ig31Var, i2j0 i2j0Var, njf njfVar, hn50 hn50Var, h001 h001Var, xif xifVar, bqm bqmVar, yyh yyhVar, ysd1 ysd1Var, gv2 gv2Var, zlp0 zlp0Var, cbd0 cbd0Var, bgd0 bgd0Var, tvu0 tvu0Var, uuu0 uuu0Var, onu0 onu0Var, znb0 znb0Var, ynb0 ynb0Var, res resVar, rwj rwjVar, qim0 qim0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z17;
        u85 u85VarS;
        List list;
        jkr0 jkr0Var;
        boolean z18;
        ?? r5;
        boolean z19;
        m4c m4cVar;
        boolean z20;
        Object objT;
        int i2;
        jkr0 jkr0Var2;
        uef uefVar2 = uefVar;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar2 = fkj0.X;
        cso1 cso1Var = uefVar2.a;
        h5f h5fVar = uefVar2.n;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(753893721);
        int i3 = i | (b0kVar3.g(uefVar2) ? 4 : 2) | (b0kVar3.i(iu30Var2) ? 32 : 16) | (b0kVar3.i(d0rVar) ? 256 : 128) | (b0kVar3.g(str) ? 2048 : 1024) | (b0kVar3.i(quc0Var) ? 16384 : 8192) | (b0kVar3.i(bzi0Var) ? 131072 : 65536) | (b0kVar3.h(z) ? 1048576 : 524288) | (b0kVar3.i(r171Var) ? 8388608 : 4194304) | (b0kVar3.i(y0fVar) ? 67108864 : 33554432) | (b0kVar3.i(ymq0Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((((0 | (b0kVar3.i(ahs0Var) ? (char) 4 : (char) 2)) | (b0kVar3.i(f5fVar) ? 32 : 16)) | (b0kVar3.i(u7i1Var) ? 256 : 128)) | (b0kVar3.i(asfVar) ? 2048 : 1024)) | (b0kVar3.i(j780Var) ? 16384 : 8192)) | (b0kVar3.i(h7fVar) ? 131072 : 65536)) | (b0kVar3.i(ig31Var) ? 1048576 : 524288)) | (b0kVar3.i(i2j0Var) ? 8388608 : 4194304)) | (b0kVar3.i(njfVar) ? 67108864 : 33554432)) | (b0kVar3.i(hn50Var) ? 536870912 : 268435456)) & 306783379) == 306783378 && (((((((((((b0kVar3.i(h001Var) ? (char) 4 : (char) 2) | (b0kVar3.i(xifVar) ? ' ' : (char) 16)) | (b0kVar3.i(bqmVar) ? 256 : 128)) | (b0kVar3.i(yyhVar) ? 2048 : 1024)) | (b0kVar3.i(ysd1Var) ? 16384 : 8192)) | (b0kVar3.i(gv2Var) ? 131072 : 65536)) | (b0kVar3.i(zlp0Var) ? 1048576 : 524288)) | (b0kVar3.i(cbd0Var) ? 8388608 : 4194304)) | (b0kVar3.i(bgd0Var) ? 67108864 : 33554432)) | (b0kVar3.i(tvu0Var) ? 536870912 : 268435456)) & 306783379) == 306783378 && (((((((((((b0kVar3.i(uuu0Var) ? (char) 4 : (char) 2) | (b0kVar3.i(onu0Var) ? ' ' : (char) 16)) | (b0kVar3.i(znb0Var) ? 256 : 128)) | (b0kVar3.i(ynb0Var) ? 2048 : 1024)) | (b0kVar3.i(resVar) ? 16384 : 8192)) | (b0kVar3.i(rwjVar) ? 131072 : 65536)) | 1572864) | (b0kVar3.h(z2) ? 8388608 : 4194304)) | (b0kVar3.h(z3) ? 67108864 : 33554432)) | (b0kVar3.h(z4) ? 536870912 : 268435456)) & 306783379) == 306783378 && (((((((((((b0kVar3.h(z5) ? (char) 4 : (char) 2) | (b0kVar3.h(z6) ? ' ' : (char) 16)) | (b0kVar3.h(z7) ? (char) 256 : (char) 128)) | (b0kVar3.h(z8) ? (char) 2048 : (char) 1024)) | (b0kVar3.h(z9) ? (char) 16384 : (char) 8192)) | (b0kVar3.h(z10) ? (char) 0 : (char) 0)) | (b0kVar3.h(z11) ? (char) 0 : (char) 0)) | (b0kVar3.h(z12) ? (char) 0 : (char) 0)) | (b0kVar3.h(z13) ? (char) 0 : (char) 0)) | (b0kVar3.h(z14) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && (((b0kVar3.h(z15) ? (char) 4 : (char) 2) | (b0kVar3.h(z16) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            qf4 qf4Var = ((add) b0kVar3.k(ade0.c)).a;
            boolean z21 = qf4Var.h() && qf4Var.M();
            if (z21 || !z) {
                z17 = false;
            } else {
                ctf ctfVar = uefVar2.c;
                if ((ctfVar instanceof atf) || (ctfVar instanceof btf)) {
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            boolean z22 = z21 && z;
            b0kVar3.i0(-1243211649);
            if (Build.VERSION.SDK_INT >= 30) {
                b0kVar3.i0(-1015138750);
                WeakHashMap weakHashMap = osl1.x;
                u85VarS = lhc.g(b0kVar3).c;
                b0kVar3.r(false);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1015107037);
                b0kVar3.r(false);
                View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
                wat watVar = (wat) b0kVar3.k(t4k.h);
                Object objT3 = b0kVar3.T();
                if (objT3 == m4cVar2) {
                    objT3 = bb00.h(0, b0kVar3);
                }
                err0 err0Var = (hdn0) objT3;
                boolean zI = b0kVar3.i(view);
                Object objT4 = b0kVar3.T();
                if (zI || objT4 == m4cVar2) {
                    objT4 = new w9f(view, err0Var, (byte) 6);
                    b0kVar3.s0(objT4);
                }
                qxd0.i(view, (iu30) objT4, b0kVar3);
                u85VarS = poo1.s(watVar.M0(err0Var.s()), 7);
                b0kVar3.r(false);
            }
            List listA = mqo1.A(uefVar2.o);
            dts dtsVar = null;
            if (listA.size() > 1) {
                b0kVar3.i0(867012816);
                boolean z23 = (i3 & 112) == 32;
                Object objT5 = b0kVar3.T();
                if (z23 || objT5 == m4cVar2) {
                    objT5 = new c5a(iu30Var2, (byte) 17);
                    b0kVar3.s0(objT5);
                }
                iu30 iu30Var3 = (iu30) objT5;
                if (listA.isEmpty()) {
                    hhg1.n("Chat tabs cannot be empty");
                    return;
                }
                int iIndexOf = listA.indexOf(h5fVar);
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                ven0 ven0VarS = v8r.s(listA, b0kVar3);
                boolean zG = b0kVar3.g(ven0VarS);
                Object objT6 = b0kVar3.T();
                if (zG || objT6 == m4cVar2) {
                    i2 = 2;
                    objT6 = new hnf(ven0VarS, (byte) 2);
                    b0kVar3.s0(objT6);
                } else {
                    i2 = 2;
                }
                jkr0 jkr0VarB = lkr0.b(iIndexOf, (Function0) objT6, b0kVar3, 0, i2);
                ven0 ven0VarS2 = v8r.s(h5fVar, b0kVar3);
                ven0 ven0VarS3 = v8r.s(iu30Var3, b0kVar3);
                boolean zG2 = b0kVar3.g(jkr0VarB) | b0kVar3.g(ven0VarS) | b0kVar3.g(ven0VarS2) | b0kVar3.g(ven0VarS3);
                Object objT7 = b0kVar3.T();
                if (zG2 || objT7 == m4cVar2) {
                    objT7 = new x4c(jkr0VarB, ven0VarS, ven0VarS2, ven0VarS3, (lnm) null, (byte) 8);
                    b0kVar3.s0(objT7);
                }
                qxd0.t(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04b5: INVOKE (r37v24 p.jkr0), (r3v1 'b0kVar3' p.b0k), (wrap p.vu30:0x04b3: CHECK_CAST (p.vu30) (r2v25 'objT7' java.lang.Object)) STATIC call: p.qxd0.t(java.lang.Object, p.b0k, p.vu30):void A[MD:(java.lang.Object, p.b0k, p.vu30):void (m)] (LINE:65) in method: p.zso1.f(p.uef, p.iu30, p.d0r, java.lang.String, p.quc0, p.bzi0, boolean, p.r171, p.y0f, p.ymq0, p.ahs0, p.f5f, p.u7i1, p.asf, p.j780, p.h7f, p.ig31, p.i2j0, p.njf, p.hn50, p.h001, p.xif, p.bqm, p.yyh, p.ysd1, p.gv2, p.zlp0, p.cbd0, p.bgd0, p.tvu0, p.uuu0, p.onu0, p.znb0, p.ynb0, p.res, p.rwj, p.qim0, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r37v24 p.jkr0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1961
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.zso1.f(p.uef, p.iu30, p.d0r, java.lang.String, p.quc0, p.bzi0, boolean, p.r171, p.y0f, p.ymq0, p.ahs0, p.f5f, p.u7i1, p.asf, p.j780, p.h7f, p.ig31, p.i2j0, p.njf, p.hn50, p.h001, p.xif, p.bqm, p.yyh, p.ysd1, p.gv2, p.zlp0, p.cbd0, p.bgd0, p.tvu0, p.uuu0, p.onu0, p.znb0, p.ynb0, p.res, p.rwj, p.qim0, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, p.b0k, int):void");
            }

            public static final void m(y0f y0fVar, b0k b0kVar, int i) {
                y0f y0fVar2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1961242876);
                j06 j06Var = x340Var.a;
                int i2 = (x340Var.i(y0fVar) ? 4 : 2) | i;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    boolean z = x340Var.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = mia.d;
                        x340Var.s0(objT);
                    }
                    rih1 rih1Var = rih1.a;
                    t1c.a(f8d1.b(qim0VarD2, rih1Var, (PointerInputEventHandler) objT), x340Var, 0);
                    qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarX = uyn1.x(qim0VarD3, 8.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.X, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    int i3 = (i2 & 14) | 48;
                    y0fVar2 = y0fVar;
                    otw.c(y0fVar2, rih1Var, (qim0) null, (ipb1) null, x340Var, i3, 12);
                    x340Var.r(true);
                    x340Var.r(true);
                } else {
                    y0fVar2 = y0fVar;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qff(y0fVar2, i, (byte) 1);
                }
            }

            public static final void n(b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-511990020);
                if (x340Var.Y(i & 1, i != 0)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = mia.e;
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB = f8d1.b(qim0VarF, rih1.a, (PointerInputEventHandler) objT);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    xto1.e(u291.B(nim0Var, (gra) null, 3), 6, 0L, 0L, x340Var, 54, 12);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qza((byte) 12, i, false);
                }
            }

            public static final void o(qim0 qim0Var, b0k b0kVar, int i) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1518930734);
                int i2 = i | 6;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    qim0Var2 = nim0.a;
                    qim0 qim0VarC = u291.c(u291.f(qim0Var2, 1.0f), 1.0f);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = z7i0.h;
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarX = bin.x(qim0VarC, false, null, null, null, (Function0) objT, 15);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarN = anm1.N("member-details-progress-indicator", dug.f(qim0VarX, u7h.b(cbx.a(x340Var).a.c, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    xto1.e(null, 5, 0L, 0L, x340Var, 48, 13);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new one0(qim0Var2, i, (byte) 9);
                }
            }

            public static final void p(b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1916565525);
                if (x340Var.Y(i & 1, i != 0)) {
                    az20.a((az20) x340Var.k(t4k.i));
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var);
                    }
                    idn0 idn0Var = (idn0) objT;
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = xrc.a1;
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarV = bin.v(qim0VarF, idn0Var, null, false, null, null, (Function0) objT2, 28);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = nve.T0;
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT3);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    xto1.e(h2c.a.a(u291.B(nim0Var, (gra) null, 3), een.h), 4, 0L, 0L, x340Var, 48, 12);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qza((byte) 13, i, false);
                }
            }

            public static final void q(iu30 iu30Var, boolean z, fli0 fli0Var, lzn0 lzn0Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1946447293);
                int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(fli0Var) ? 256 : 128) | (x340Var.i(lzn0Var) ? 2048 : 1024);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    k2t0 k2t0VarV = kkn.v(ti5.g(x340Var), x340Var);
                    xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = yv91.a(new nxb0(xtb0VarA, (byte) 11));
                        x340Var.s0(objT);
                    }
                    tob1 tob1Var = (tob1) objT;
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = yv91.a(new nxb0(xtb0VarA, (byte) 13));
                        x340Var.s0(objT2);
                    }
                    tob1 tob1Var2 = (tob1) objT2;
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = yv91.a(new nxb0(xtb0VarA, (byte) 12));
                        x340Var.s0(objT3);
                    }
                    tob1 tob1Var3 = (tob1) objT3;
                    float fMax = 1.0f;
                    if (((Number) tob1Var.getValue()).intValue() <= 0 && !((Boolean) tob1Var3.getValue()).booleanValue()) {
                        fMax = Math.max(0.0f, Math.min(1.0f, (((Number) tob1Var2.getValue()).intValue() - 200.0f) / 150.0f));
                    }
                    qim0 qim0VarL = bmq0.L(nim0.a, k2t0VarV.c, (g6o0) null);
                    WeakHashMap weakHashMap = osl1.x;
                    irn1.u(qim0VarL, apo.r(2016381110, new ys(fli0Var, fMax, k2t0VarV, lzn0Var), x340Var), null, new bgc0(lhc.g(x340Var).g, 32), apo.r(-1169295620, new o3(z, (Object) xtb0VarA, (Object) iu30Var, (byte) 29), x340Var), x340Var, 24624, 4);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qy90((Object) iu30Var, z, (Object) fli0Var, (Object) lzn0Var, i, (byte) 14);
                }
            }

            public static final void t(uef uefVar, w4i1 w4i1Var, f5f f5fVar, yyh yyhVar, boolean z, b0k b0kVar, int i) {
                c5f b5fVar;
                w4i1 w4i1Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(564838335);
                int i2 = i | (x340Var.g(uefVar) ? 4 : 2) | (x340Var.g(w4i1Var) ? 32 : 16) | (x340Var.i(f5fVar) ? 256 : 128) | (x340Var.i(yyhVar) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
                if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, nim0.a);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
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
                    otw.c(yyhVar, rih1.a, (qim0) null, (ipb1) null, x340Var, ((i2 >> 9) & 14) | 48, 12);
                    if (z) {
                        x340Var.i0(1811416538);
                        btf btfVar = uefVar.c;
                        List list = uefVar.h;
                        if (btfVar instanceof btf) {
                            btf btfVar2 = btfVar;
                            b5fVar = new c5f(btfVar2.a, !btfVar2.b.isEmpty(), uefVar.f, list);
                        } else if (!u890.j(btfVar, atf.a)) {
                            eg.o();
                            return;
                        } else if (w4i1Var != null) {
                            b5fVar = new a5f(w4i1Var);
                        } else {
                            jwm jwmVar = (jwm) o7h.s0(list);
                            if (jwmVar == null || (w4i1Var2 = jwmVar.a) == null) {
                                w4i1Var2 = w4i1.f;
                            }
                            b5fVar = new b5f(w4i1Var2);
                        }
                        otw.c(f5fVar, b5fVar, (qim0) null, (ipb1) null, x340Var, (i2 >> 6) & 14, 12);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1812111341);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ey((Object) uefVar, (Object) w4i1Var, (Object) f5fVar, (Object) yyhVar, z, i, (byte) 8);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Multi-variable type inference failed */
            public static final void u(uef uefVar, iu30 iu30Var, vzq0 vzq0Var, d0r d0rVar, bzi0 bzi0Var, r171 r171Var, f5f f5fVar, ig31 ig31Var, i2j0 i2j0Var, h001 h001Var, bqm bqmVar, yyh yyhVar, ysd1 ysd1Var, gv2 gv2Var, znb0 znb0Var, bgd0 bgd0Var, tvu0 tvu0Var, uuu0 uuu0Var, onu0 onu0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, iu30 iu30Var2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                byte b;
                Object obj;
                Object objN;
                m4c m4cVar = fkj0.X;
                cso1 cso1Var = uefVar.a;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(322662497);
                int i2 = i | (x340Var.g(uefVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(vzq0Var) ? 256 : 128) | (x340Var.i(d0rVar) ? 2048 : 1024) | (x340Var.i(bzi0Var) ? 16384 : 8192) | (x340Var.i(r171Var) ? 131072 : 65536) | (x340Var.i(f5fVar) ? 1048576 : 524288) | (x340Var.i(ig31Var) ? 8388608 : 4194304) | (x340Var.i(i2j0Var) ? 67108864 : 33554432) | (x340Var.i(h001Var) ? 536870912 : 268435456);
                int i3 = (x340Var.i(bqmVar) ? 4 : 2) | (x340Var.i(yyhVar) ? 32 : 16) | (x340Var.i(ysd1Var) ? 256 : 128) | (x340Var.i(gv2Var) ? 2048 : 1024) | (x340Var.i(znb0Var) ? 16384 : 8192) | (x340Var.i(bgd0Var) ? 131072 : 65536) | (x340Var.i(tvu0Var) ? 1048576 : 524288) | (x340Var.i(uuu0Var) ? 8388608 : 4194304) | (x340Var.i(onu0Var) ? 67108864 : 33554432) | (x340Var.h(z) ? 536870912 : 268435456);
                int i4 = 12582912 | (x340Var.h(z2) ? 4 : 2) | (x340Var.h(z3) ? 32 : 16) | (x340Var.h(z4) ? 256 : 128) | (x340Var.h(z5) ? 2048 : 1024) | (x340Var.h(z6) ? 16384 : 8192) | (x340Var.h(z7) ? 131072 : 65536) | (x340Var.h(z8) ? 1048576 : 524288);
                if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
                    az20 az20Var = (az20) x340Var.k(t4k.i);
                    Integer num = uefVar.d;
                    xtb0 xtb0VarA = aub0.a(num != null ? num.intValue() : 0, x340Var, 2);
                    vgo1.f((tl7) x340Var.k(rce0.a), xtb0VarA, true, x340Var, 384, 0);
                    if (cso1Var.equals(ief.b) || cso1Var.equals(tef.b)) {
                        x340Var.i0(841067301);
                        x340Var.r(false);
                    } else {
                        if (!(cso1Var instanceof hef) && !(cso1Var instanceof gef) && !(cso1Var instanceof sef)) {
                            throw p3d1.k(x340Var, 841069653, false);
                        }
                        x340Var.i0(303481236);
                        boolean zI = x340Var.i(az20Var);
                        Object objT = x340Var.T();
                        if (zI || objT == m4cVar) {
                            b = 0;
                            lgf lgfVar = new lgf(az20Var, b);
                            x340Var.s0(lgfVar);
                            obj = lgfVar;
                        } else {
                            b = 0;
                            obj = objT;
                        }
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarB = f8d1.b(nim0Var, rih1.a, (PointerInputEventHandler) obj);
                        b2j0 b2j0Var = uefVar.g;
                        boolean z9 = b;
                        j2i j2iVarR = apo.r(1296596042, new bk0(uefVar, f5fVar, yyhVar, z, (byte) 14), x340Var);
                        boolean z10 = (i2 & 112) == 32 ? true : z9 ? 1 : 0;
                        Object objT2 = x340Var.T();
                        Object obj2 = objT2;
                        if (z10 || objT2 == m4cVar) {
                            c5a c5aVar = new c5a(iu30Var, (byte) 18);
                            x340Var.s0(c5aVar);
                            obj2 = c5aVar;
                        }
                        int i5 = i2 >> 6;
                        int i6 = ((i2 >> 9) & 14) | 24576 | (i5 & 896) | (i5 & 7168) | (i5 & 458752) | 2097152 | (3670016 & i5) | (i5 & 29360128) | ((i3 << 24) & 234881024) | ((i3 << 18) & 1879048192);
                        int i7 = i3 >> 12;
                        two1.g(d0rVar, b2j0Var, bzi0Var, r171Var, j2iVarR, ig31Var, i2j0Var, h001Var, bqmVar, gv2Var, ysd1Var, bgd0Var, tvu0Var, uuu0Var, onu0Var, znb0Var, xtb0VarA, qim0VarB, vzq0Var, z2, z3, z4, z5, z6, z7, z8, (iu30) obj2, iu30Var2, x340Var, i6, ((i3 >> 6) & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | ((i3 << 3) & 458752) | ((i2 << 18) & 234881024) | ((i4 << 27) & 1879048192), ((i4 >> 3) & 524286) | 12582912);
                        x340Var = x340Var;
                        if ((cso1Var instanceof sef) && (((sef) cso1Var).b instanceof oef)) {
                            x340Var.i0(841183002);
                            nlv nlvVar = ((oef) ((sef) cso1Var).b).c;
                            if (nlvVar == null) {
                                x340Var.i0(306707095);
                                x340Var.r(z9);
                                nlvVar = null;
                            } else {
                                x340Var.i0(306707096);
                                qf4 qf4Var = ((add) x340Var.k(ade0.c)).a;
                                if (!qf4Var.h() || !qf4Var.n() || !nlvVar.equals(nlv.a)) {
                                    nlvVar = null;
                                }
                                x340Var.r(z9);
                            }
                            if (nlvVar == null) {
                                x340Var.i0(306869287);
                                x340Var.r(z9);
                            } else {
                                x340Var.i0(306869288);
                                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                                uwr uwrVar = cbx.a;
                                qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                                Object objT3 = x340Var.T();
                                if (objT3 == m4cVar) {
                                    objN = objT3;
                                    objN = ktd.n(x340Var);
                                }
                                objN = objT3;
                                idn0 idn0Var = (idn0) objN;
                                Object objT4 = x340Var.T();
                                Object obj3 = objT4;
                                if (objT4 == m4cVar) {
                                    xrc xrcVar = xrc.b1;
                                    x340Var.s0(xrcVar);
                                    obj3 = xrcVar;
                                }
                                qim0 qim0VarV = bin.v(qim0VarF, idn0Var, null, false, null, null, (Function0) obj3, 28);
                                Object objT5 = x340Var.T();
                                Object obj4 = objT5;
                                if (objT5 == m4cVar) {
                                    nve nveVar = nve.U0;
                                    x340Var.s0(nveVar);
                                    obj4 = nveVar;
                                }
                                qim0 qim0VarB2 = s161.b(qim0VarV, z9, (iu30) obj4);
                                gfh0 gfh0VarC = t1c.c(een.d, z9);
                                int iHashCode = Long.hashCode(x340Var.T);
                                xos0 xos0VarM = x340Var.m();
                                qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
                                hzj.A.getClass();
                                if (x340Var.a == null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(gfh0VarC, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                f.a(mqo1.A(p7h.M(new String[]{"🎄", "🎅", "🎁", "❄️", "✨"})), (qim0) null, x340Var, z9 ? 1 : 0);
                                x340Var.r(true);
                                x340Var.r(z9);
                            }
                            x340Var.r(z9);
                        } else {
                            x340Var.i0(307424033);
                            x340Var.r(z9);
                        }
                        x340Var.r(z9);
                    }
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mgf(uefVar, iu30Var, vzq0Var, d0rVar, bzi0Var, r171Var, f5fVar, ig31Var, i2j0Var, h001Var, bqmVar, yyhVar, ysd1Var, gv2Var, znb0Var, bgd0Var, tvu0Var, uuu0Var, onu0Var, z, z2, z3, z4, z5, z6, z7, z8, iu30Var2, i);
                }
            }

            public static final void w(xuj1 xuj1Var, wj31 wj31Var, iu30 iu30Var, Function0 function0, iu30 iu30Var2, qim0 qim0Var, Function0 function1, ksl kslVar, b0k b0kVar, int i) {
                int i2;
                Function0 function2;
                x340 x340Var;
                qim0 qim0Var2;
                List list;
                xuj1 xuj1Var2 = xuj1Var;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(458992254);
                if ((i & 6) == 0) {
                    i2 = (x340Var2.i(xuj1Var2) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var2.i(wj31Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var2.i(iu30Var) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    function2 = function0;
                    i2 |= x340Var2.i(function2) ? 2048 : 1024;
                } else {
                    function2 = function0;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var2.i(iu30Var2) ? 16384 : 8192;
                }
                int i3 = i2 | 196608;
                if ((1572864 & i) == 0) {
                    i3 |= x340Var2.i(function1) ? 1048576 : 524288;
                }
                if ((12582912 & i) == 0) {
                    i3 |= x340Var2.g(kslVar) ? 8388608 : 4194304;
                }
                if (x340Var2.Y(i3 & 1, (4793491 & i3) != 4793490)) {
                    boolean z = !u890.j(xuj1Var2.a, ruj1.a);
                    bm31 bm31Var = xuj1Var2.b;
                    if (bm31Var == null || (list = bm31Var.b) == null) {
                        list = z6x.a;
                    }
                    List list2 = list;
                    jsl jslVar = kslVar instanceof jsl ? (jsl) kslVar : null;
                    String str = jslVar != null ? jslVar.a : null;
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                    boolean zI = ((i3 & 3670016) == 1048576) | x340Var2.i(xuj1Var2) | ((i3 & 896) == 256);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new d4v0(xuj1Var2, iu30Var, function1, (byte) 14);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarX = bin.x(qim0VarD, false, null, null, null, (Function0) objT, 15);
                    boolean zG = x340Var2.g(str);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new q4z0(str, (byte) 10);
                        x340Var2.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT2);
                    gra graVar = een.h;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    x340Var2.i0(996251470);
                    xuj1Var2 = xuj1Var;
                    Function0 function3 = function2;
                    qim0Var2 = qim0Var3;
                    ((zj31) wj31Var).b(new jj31(z, 0, u291.d(qim0Var3, 1.0f), 2, (jfe) null, list2, (Map) null, xuj1Var2.f, false, function3, iu30Var2, 720), x340Var2, 8);
                    x340Var2.r(false);
                    hm5.a(xuj1Var2.a, (qim0) null, (iu30) null, graVar, "play_pause_overlay", (iu30) null, wbj.b, x340Var2, 1597440, 38);
                    x340Var = x340Var2;
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new f1c(xuj1Var2, wj31Var, iu30Var, function0, iu30Var2, qim0Var2, function1, kslVar, i);
                }
            }

            public static boolean x(byte b) {
                return b >= 0;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void E(h661 h661Var, int i, boolean z) throws SerializationException {
                D(h661Var, i);
                P(z);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void F(Object obj) throws SerializationException {
                StringBuilder sb = new StringBuilder("Non-serializable ");
                Class<?> cls = obj.getClass();
                jd11 jd11Var = rc11.a;
                sb.append(jd11Var.b(cls));
                sb.append(" is not supported by ");
                sb.append(jd11Var.b(getClass()));
                sb.append(" encoder");
                throw new SerializationException(sb.toString());
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void G(h661 h661Var, int i, String str) throws SerializationException {
                D(h661Var, i);
                h0(str);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void I(inw0 inw0Var, int i, byte b) throws SerializationException {
                D(inw0Var, i);
                j(b);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void J() throws SerializationException {
                throw new SerializationException("'null' is not supported by default");
            }

            public uax L(inw0 inw0Var, int i) {
                D(inw0Var, i);
                return v(inw0Var.g(i));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void O(short s) throws SerializationException {
                F(Short.valueOf(s));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void P(boolean z) throws SerializationException {
                F(Boolean.valueOf(z));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void S(float f) throws SerializationException {
                F(Float.valueOf(f));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void U(char c) throws SerializationException {
                F(Character.valueOf(c));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void Z(h661 h661Var, int i, float f) throws SerializationException {
                D(h661Var, i);
                S(f);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void a0(int i) throws SerializationException {
                F(Integer.valueOf(i));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void e(int i, int i2, h661 h661Var) throws SerializationException {
                D(h661Var, i);
                a0(i2);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void f0(inw0 inw0Var, int i, char c) throws SerializationException {
                D(inw0Var, i);
                U(c);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void g(h661 h661Var, int i, double d) throws SerializationException {
                D(h661Var, i);
                h(d);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void h(double d) throws SerializationException {
                F(Double.valueOf(d));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void h0(String str) throws SerializationException {
                F(str);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void j(byte b) throws SerializationException {
                F(Byte.valueOf(b));
            }

            public void k(h661 h661Var, int i, nma0 nma0Var, Object obj) {
                D(h661Var, i);
                i(nma0Var, obj);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void l(h661 h661Var, int i, long j) throws SerializationException {
                D(h661Var, i);
                z(j);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void r(h661 h661Var, int i) throws SerializationException {
                F(Integer.valueOf(i));
            }

            public void s(h661 h661Var, int i, nma0 nma0Var, Object obj) {
                D(h661Var, i);
                W(nma0Var, obj);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void y(inw0 inw0Var, int i, short s) throws SerializationException {
                D(inw0Var, i);
                O(s);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
            public void z(long j) throws SerializationException {
                F(Long.valueOf(j));
            }

            public void a(h661 h661Var) {
            }

            public z1k b(h661 h661Var) {
                return this;
            }

            public uax v(h661 h661Var) {
                return this;
            }

            public void D(h661 h661Var, int i) {
            }
        }
