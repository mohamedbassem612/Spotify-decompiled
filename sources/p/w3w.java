package p;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w3w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3w(mbx mbxVar, y570 y570Var, ifl1 ifl1Var) {
        super(1);
        this.a = (byte) 15;
        this.b = y570Var;
        this.c = ifl1Var;
    }

    private final Object a(Object obj) {
        boolean z;
        w7h1 w7h1Var;
        acy acyVar = (ccy) obj;
        qpy qpyVar = (qpy) this.b;
        dny dnyVar = (dny) this.c;
        boolean z2 = dnyVar.g;
        t64 t64Var = qpyVar.U0;
        i8h1 i8h1Var = qpyVar.T0;
        String str = qpyVar.R0;
        boolean z3 = acyVar instanceof acy;
        b7x b7xVar = b7x.a;
        if (z3) {
            py9 py9VarI = qpyVar.i();
            if (py9VarI != null) {
                r6h1 r6h1Var = py9VarI.b;
                y6h1 y6h1Var = py9VarI.c;
                j80 j80Var = acyVar.d;
                String str2 = j80Var.a;
                if (z2) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    z = z2;
                    x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("play_button", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str2 != null ? str2 : "")), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    z = z2;
                    if (dnyVar.h) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("play_button", (String) null, (Integer) null, str2, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str2 != null ? str2 : "")), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("play_button", (String) null, (Integer) null, str2, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2 != null ? str2 : "")), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                    }
                }
                tv80 tv80VarM = i8h1Var.m(w7h1Var, (xj61) null);
                t64Var.a(w7h1Var, tv80VarM.a);
                MobiusLoop mobiusLoop = qpyVar.Z0;
                if (z) {
                    if (mobiusLoop == null) {
                        u890.C("mobiusLoop");
                        throw null;
                    }
                    mym.l(mobiusLoop, new qfy(acyVar, str, tv80VarM));
                } else {
                    if (mobiusLoop == null) {
                        u890.C("mobiusLoop");
                        throw null;
                    }
                    mym.l(mobiusLoop, new tfy(j80Var, str, tv80VarM));
                }
            }
        } else {
            if (!(acyVar instanceof bcy)) {
                eg.o();
                return null;
            }
            py9 py9VarI2 = qpyVar.i();
            if (py9VarI2 != null) {
                x6h1 x6h1VarC7 = py9VarI2.c.c();
                x6h1VarC7.i.add(new a7h1("shuffle_play_item", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                y6h1 y6h1VarA = x6h1VarC7.a();
                String str3 = ((bcy) acyVar).d.a;
                w7h1 w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str3 != null ? str3 : "")), y6h1VarA, py9VarI2.b, System.currentTimeMillis());
                tv80 tv80VarM2 = i8h1Var.m(w7h1Var2, (xj61) null);
                t64Var.a(w7h1Var2, tv80VarM2.a);
                MobiusLoop mobiusLoop2 = qpyVar.Z0;
                if (mobiusLoop2 == null) {
                    u890.C("mobiusLoop");
                    throw null;
                }
                mym.l(mobiusLoop2, new qfy(acyVar, str, tv80VarM2));
            }
        }
        return rih1.a;
    }

    public final Object invoke(Object obj) {
        Boolean boolA;
        Object value;
        rih1 rih1Var;
        xzo1 ggt0Var;
        w7h1 w7h1Var;
        sly slyVar;
        String strF;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = 0;
        rih1 rih1Var2 = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ((ven0) obj2).setValue(Boolean.TRUE);
                y7e1 y7e1Var = (y7e1) obj3;
                h4e1 h4e1VarH = y7e1Var.h();
                try {
                    h4e1VarH.append(str);
                    u2p1.p(h4e1VarH);
                    y7e1Var.a(h4e1VarH);
                    return rih1Var2;
                } finally {
                    y7e1Var.c();
                }
            case 1:
                cqw cqwVar = (cqw) obj3;
                cqwVar.b((String) obj2);
                cqwVar.a(true);
                return new k6r(cqwVar, (byte) 1);
            case 2:
                ((vu30) obj3).invoke((rm70) obj2, (List) obj);
                return rih1Var2;
            case 3:
                z2s z2sVar = (z2s) obj;
                esw eswVar = (esw) obj3;
                iu30 iu30Var = (wao0) obj2;
                z2sVar.R(dvl.class, eswVar.e.a(iu30Var), orw.b, orw.Z, rrw.b1, false, srw.f);
                z2sVar.R(xvl.class, eswVar.f.a(iu30Var), orw.X0, prw.e, trw.i, false, srw.Q0);
                tlp tlpVar = eswVar.g;
                xsr0 xsr0Var = xsr0.d;
                z2sVar.R(wvl.class, tlpVar.a(xsr0Var, iu30Var), prw.O0, prw.Z0, trw.T0, false, srw.b1);
                z2sVar.R(rvl.class, eswVar.h.a(iu30Var), rrw.g, rrw.R0, trw.e1, false, urw.i);
                z2sVar.R(qvl.class, eswVar.i.a(iu30Var), rrw.V0, z6w.V0, vrw.f, false, fdv.Z0);
                z2sVar.R(bvl.class, eswVar.q.a(iu30Var), z6w.W0, z6w.X0, rrw.W0, false, fdv.a1);
                z2sVar.R(hvl.class, f6o1.A(eswVar.r.a(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), z6w.Y0, z6w.Z0, rrw.X0, false, fdv.b1);
                z2sVar.R(avl.class, eswVar.s.a(xsr0Var, iu30Var), z6w.a1, z6w.b1, rrw.Y0, false, fdv.c1);
                z2sVar.R(oul.class, eswVar.l.a(iu30Var), z6w.c1, z6w.d1, rrw.Z0, false, fdv.d1);
                z2sVar.R(kvl.class, eswVar.n.a(iu30Var), z6w.e1, orw.c, rrw.a1, false, fdv.e1);
                z2sVar.R(lvl.class, eswVar.o.a(iu30Var), orw.d, orw.e, rrw.c1, false, srw.b);
                z2sVar.R(bwl.class, eswVar.f3p.a(iu30Var), orw.f, orw.g, rrw.d1, false, srw.c);
                z2sVar.R(jul.class, eswVar.j.a(iu30Var), orw.h, orw.i, rrw.e1, false, srw.d);
                z2sVar.R(iul.class, eswVar.k.a(xsr0Var, iu30Var), orw.t, orw.X, trw.b, false, srw.e);
                z2sVar.R(ovl.class, eswVar.t.a(iu30Var), orw.Y, orw.N0, trw.c, false, srw.g);
                z2sVar.R(nvl.class, eswVar.u.a(xsr0Var, iu30Var), orw.O0, orw.P0, trw.d, false, srw.h);
                z2sVar.R(hul.class, eswVar.v.a(iu30Var), orw.Q0, orw.R0, trw.e, false, srw.i);
                z2sVar.R(gul.class, eswVar.w.a(xsr0Var, iu30Var), orw.S0, orw.T0, trw.f, false, srw.t);
                z2sVar.R(zul.class, eswVar.x.a(iu30Var), orw.U0, orw.V0, trw.g, false, srw.X);
                z2sVar.R(yul.class, eswVar.y.a(xsr0Var, iu30Var), orw.W0, orw.Y0, trw.h, false, srw.Y);
                z2sVar.R(lul.class, eswVar.z.a(iu30Var), orw.Z0, orw.a1, trw.t, false, srw.Z);
                z2sVar.R(kul.class, eswVar.A.a(xsr0Var, iu30Var), orw.b1, orw.c1, trw.X, false, srw.N0);
                z2sVar.R(vvl.class, eswVar.B.a(iu30Var), orw.d1, orw.e1, trw.Y, false, srw.O0);
                z2sVar.R(uvl.class, eswVar.C.a(xsr0Var, iu30Var), prw.b, prw.c, trw.Z, false, srw.P0);
                z2sVar.R(mvl.class, eswVar.D.a(iu30Var), prw.d, prw.f, trw.N0, false, srw.R0);
                z2sVar.R(tvl.class, (z331) eswVar.E.get(), prw.g, prw.h, trw.O0, false, srw.S0);
                z2sVar.R(pul.class, eswVar.F.a(iu30Var), prw.i, prw.t, trw.P0, false, srw.T0);
                y2o1.p(z2sVar, awl.class, new qrw(eswVar, iu30Var, (byte) 0), prw.X, prw.Y, prw.Z, (s2c0) null, 224);
                z2sVar.R(ivl.class, (l9e0) eswVar.J.get(), prw.N0, prw.P0, trw.Q0, false, srw.U0);
                z2sVar.R(mul.class, f6o1.A(eswVar.K.a(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), prw.Q0, prw.R0, trw.R0, false, srw.V0);
                z2sVar.R(nul.class, f6o1.A(eswVar.L.a(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), prw.S0, prw.T0, trw.S0, false, srw.W0);
                z2sVar.R(cvl.class, f6o1.A(eswVar.M.a(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), prw.U0, prw.V0, trw.U0, false, srw.X0);
                z2sVar.R(uul.class, eswVar.N.a(iu30Var), prw.W0, prw.X0, trw.V0, false, srw.Y0);
                fnp fnpVar = eswVar.O;
                em0 em0Var = eswVar.Q;
                z2sVar.R(vul.class, fnpVar.a(em0Var, new ysr0(1), iu30Var), prw.Y0, prw.a1, trw.W0, false, srw.Z0);
                z2sVar.R(tul.class, fnpVar.a(em0Var, new ysr0(3), iu30Var), prw.b1, prw.c1, trw.X0, false, srw.a1);
                z2sVar.R(wul.class, f6o1.A(eswVar.c(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), prw.d1, prw.e1, trw.Y0, false, srw.c1);
                z2sVar.R(gvl.class, f6o1.A(eswVar.e(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.b, rrw.c, trw.Z0, false, srw.d1);
                z2sVar.R(svl.class, f6o1.A(eswVar.a0.a(eswVar.b0.a(iu30Var)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.d, rrw.e, trw.a1, false, srw.e1);
                z2sVar.R(fvl.class, f6o1.A(eswVar.d(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.f, rrw.h, trw.b1, false, urw.b);
                z2sVar.R(qul.class, f6o1.A(eswVar.W.a(xsr0Var, iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.i, rrw.t, trw.c1, false, urw.c);
                z2sVar.R(zvl.class, f6o1.A(eswVar.X.a(xsr0Var, iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.X, rrw.Y, trw.d1, false, urw.d);
                z2sVar.R(rul.class, f6o1.A(eswVar.a(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.Z, rrw.N0, vrw.b, false, urw.e);
                z2sVar.R(sul.class, f6o1.A(eswVar.b(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.O0, rrw.P0, vrw.c, false, urw.f);
                z2sVar.R(pvl.class, f6o1.A(eswVar.c0.a(iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.Q0, rrw.S0, vrw.d, false, urw.g);
                z2sVar.R(yvl.class, f6o1.A(eswVar.d0.a(new ysr0(4), iu30Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rrw.T0, rrw.U0, vrw.e, true, urw.h);
                return rih1Var2;
            case 4:
                px20 px20Var = (px20) obj3;
                i6r0 i6r0Var = (i6r0) obj2;
                boolean zBooleanValue = (i6r0Var == null || (boolA = i6r0Var.a()) == null) ? i6r0Var == null : boolA.booleanValue();
                if (px20Var.b != zBooleanValue) {
                    px20Var.b = zBooleanValue;
                    px20Var.a();
                }
                return new k6r(i6r0Var != null ? i6r0Var.b(px20Var) : null, (byte) 3);
            case 5:
                ((ven0) obj2).setValue(obj);
                ((q811) obj3).a = obj;
                return rih1Var2;
            case 6:
                Function0 function0 = (Function0) obj2;
                hd41 hd41Var = (ipb1) obj3;
                hd41 hd41Var2 = hd41Var instanceof hd41 ? hd41Var : null;
                if (hd41Var2 != null) {
                    hd41Var2.c = function0;
                }
                return new ht0(function0, hd41Var, (byte) 18);
            case 7:
                ((k40) obj3).invoke((ptw) obj2, Integer.valueOf(((Number) obj).intValue()));
                return rih1Var2;
            case 8:
                int iIntValue = ((Number) obj).intValue();
                p811 p811Var = (p811) obj3;
                Integer num = (Integer) p811Var.a;
                if (num == null || iIntValue != num.intValue()) {
                    p811Var.a = Integer.valueOf(iIntValue);
                    ((d3u0) obj2).invoke(Integer.valueOf(iIntValue));
                }
                return rih1Var2;
            case 9:
                ((ven0) obj2).setValue((String) obj);
                bpb1 bpb1Var = ((wvw) obj3).g;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, vvw.a((vvw) value, true, false, svw.a, (nvw) null, 10)));
                return rih1Var2;
            case 10:
                ad80 ad80Var = (g0x) obj2;
                ((y3o0) ((ffe1) ((pzw) obj3).e).c).invoke(new kdn(((Boolean) obj).booleanValue() || ad80Var.j, ad80Var.c));
                return rih1Var2;
            case 11:
                b5x b5xVar = new b5x((Context) obj);
                b5xVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                b5xVar.setRecentEmojiProvider((cm01) obj3);
                b5xVar.setOnEmojiPickedListener(new ae0((iu30) obj2, (byte) 3));
                return b5xVar;
            case 12:
                v9z v9zVar = (v9z) obj;
                rxr rxrVar = (rxr) ((otu) obj3).b;
                unm unmVar = (unm) obj2;
                String str2 = unmVar.b;
                if (v9zVar.equals(v9z.b)) {
                    rxrVar.c(new hgt0(str2, unmVar.j, unmVar.k, unmVar.i, unmVar.g, unmVar.o, false));
                } else if (v9zVar.equals(v9z.c)) {
                    String str3 = unmVar.a;
                    int i2 = unmVar.k;
                    boolean z = unmVar.l;
                    boolean z2 = unmVar.m;
                    rxrVar.getClass();
                    rxrVar.a(new ldm(str3, str2, true, i2, z, z2));
                } else {
                    if (!v9zVar.equals(v9z.a)) {
                        eg.o();
                        return null;
                    }
                    rxrVar.b(new yqg0(str2, unmVar.k));
                }
                return rih1Var2;
            case 13:
                p9z p9zVar = (p9z) obj;
                g1v g1vVar = g1v.e;
                rxr rxrVar2 = (rxr) ((w0d) obj3).d;
                dlg1 dlg1Var = rxrVar2.g;
                jbz jbzVar = (jbz) obj2;
                poz0 poz0Var = jbzVar.l;
                String str4 = jbzVar.a;
                d1z d1zVar = jbzVar.q;
                int i3 = jbzVar.o;
                h131 h131Var = jbzVar.B;
                String str5 = jbzVar.f13p;
                if (!(p9zVar instanceof m9z)) {
                    rih1Var = rih1Var2;
                    if (p9zVar.equals(l9z.a)) {
                        if (jbzVar.y) {
                            String str6 = jbzVar.c;
                            String str7 = str6 == null ? "" : str6;
                            String str8 = jbzVar.d;
                            String str9 = str8 == null ? "" : str8;
                            String str10 = jbzVar.e;
                            ggt0Var = new ggt0(str5, str7, str9, str10 == null ? "" : str10, jbzVar.o, jbzVar.I, h131Var);
                        } else if (jbzVar.D) {
                            ggt0Var = new igt0(jbzVar.C, str5, jbzVar.o, jbzVar.m, jbzVar.I, h131Var, d1zVar == d1z.a);
                        } else {
                            ggt0Var = new hgt0(str5, jbzVar.s, jbzVar.o, jbzVar.m, jbzVar.I, h131Var, d1zVar == d1z.a);
                        }
                        rxrVar2.c(ggt0Var);
                    } else if (p9zVar.equals(n9z.a)) {
                        rxrVar2.b.h(str5);
                        bpl0 bpl0VarL = dlg1Var.l();
                        Integer numValueOf = Integer.valueOf(i3);
                        x6h1 x6h1VarC = bpl0VarL.b.c();
                        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str5, (String) null));
                        x6h1VarC.j = false;
                        ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null);
                    } else {
                        if (!p9zVar.equals(o9z.a)) {
                            eg.o();
                            return null;
                        }
                        rxrVar2.a(new ldm(str4, str5, !poz0Var.equals(g1vVar), jbzVar.o, jbzVar.u, jbzVar.y));
                    }
                    return rih1Var;
                }
                yaz yazVar = ((m9z) p9zVar).a;
                i8h1 i8h1Var = (i8h1) dlg1Var.a;
                rih1Var = rih1Var2;
                if (yazVar instanceof vaz) {
                    xwp0 xwp0Var = jbzVar.t;
                    boolean z3 = jbzVar.H;
                    tjq tjqVar = rxrVar2.c;
                    if (z3) {
                        ((drp0) tjqVar.e).g(5, str5);
                    } else {
                        muu muuVar = (muu) tjqVar.a;
                        muuVar.d.b(muuVar.a.b(str5, d1zVar == d1z.a).firstOrError().observeOn(muuVar.c).subscribe(new y43(muuVar, xwp0Var, new rvr(tjqVar, str5, i3), new rvr(tjqVar, str5, i3), (byte) 4)));
                    }
                } else if (yazVar instanceof uaz) {
                    rxrVar2.a(new ldm(str4, str5, !poz0Var.equals(g1vVar), jbzVar.o, jbzVar.u, jbzVar.y));
                } else if (yazVar instanceof waz) {
                    rxrVar2.b(new yqg0(str5, i3));
                } else if (yazVar instanceof taz) {
                    boolean z4 = jbzVar.w instanceof mz1;
                    bpl0 bpl0VarL2 = dlg1Var.l();
                    Integer numValueOf2 = Integer.valueOf(i3);
                    x6h1 x6h1VarC2 = bpl0VarL2.b.c();
                    x6h1VarC2.i.add(new a7h1("episode_card_container", (String) null, numValueOf2, str5, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("add_episode_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    if (z4) {
                        String str11 = nik1.F1.a;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (str11 == null) {
                            str11 = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11)), y6h1VarA, bpl0VarL2.a, System.currentTimeMillis());
                    } else {
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str5)), y6h1VarA, bpl0VarL2.a, System.currentTimeMillis());
                    }
                    rxrVar2.i.c(Collections.singletonList(str5), rxrVar2.h.a, "", z4, new gj3(27, i8h1Var.m(w7h1Var, (xj61) null))).subscribe();
                } else {
                    if (!(yazVar instanceof xaz)) {
                        tw20.s(yazVar, " doesn't have a supported action handling");
                        return null;
                    }
                    fjl0 fjl0Var = (fjl0) dlg1Var.c;
                    x6h1 x6h1VarC5 = fjl0Var.c.c();
                    x6h1VarC5.i.add(new a7h1("button_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    xh71.b((xh71) rxrVar2.f.b, new wa71(str5, null, null, null, null, null, null, 126), (Bundle) null, new vm71("episode-row-quick-action"), i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null), (List) null, 18);
                }
                return rih1Var;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                iu30 iu30Var2 = (iu30) obj2;
                nix nixVar = ((v820) obj3).a;
                if (!(nixVar instanceof nix)) {
                    if (!(nixVar instanceof oix)) {
                        eg.o();
                        return null;
                    }
                    if (zBooleanValue2) {
                        iu30Var2.invoke(new lix((oix) nixVar));
                    } else {
                        iu30Var2.invoke(new kix((oix) nixVar));
                    }
                } else if (zBooleanValue2) {
                    iu30Var2.invoke(new jix(nixVar));
                } else {
                    iu30Var2.invoke(new iix(nixVar));
                }
                return rih1Var2;
            case 15:
                ifl1 ifl1Var = (ifl1) obj2;
                y570 y570Var = (y570) obj3;
                int iOrdinal = ((gxf1) obj).ordinal();
                gg11 gg11Var = gg11.g;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 1:
                        if (((j570) y570Var.j().get("click")) != null) {
                            ifl1Var.d(new u570("click", y570Var, gg11Var));
                        }
                        break;
                    case 3:
                        if (((j570) y570Var.j().get("showMoreClick")) != null) {
                            ifl1Var.d(new u570("showMoreClick", y570Var, gg11Var));
                        }
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return rih1Var2;
            case 16:
                ((vu30) ((ven0) obj2).getValue()).invoke((String) obj, (nrs0) obj3);
                return rih1Var2;
            case 17:
                String str12 = (String) obj;
                muo muoVar = (muo) obj3;
                if (muoVar != null && !str12.equals(((a5y) obj2).c)) {
                    muoVar.a.a(dtm0.a);
                }
                return rih1Var2;
            case 18:
                yjq yjqVar = ((a8y) obj3).c;
                int iOrdinal2 = ((e640) obj).ordinal();
                if (iOrdinal2 == 0) {
                    z7y z7yVar = (z7y) obj2;
                    String str13 = z7yVar.a;
                    String str14 = z7yVar.h;
                    jut jutVar = (jut) yjqVar.c;
                    if (str14 != null) {
                        x6h1 x6h1VarC7 = ((xok0) jutVar.b).b.c();
                        x6h1VarC7.i.add(new a7h1("engage_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        ((i8h1) jutVar.c).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("engage_with_paywall", 1, sqg0.J(new mmr0[]{new mmr0("entity_uri", str13), new mmr0("engagement_type", str14)})), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    vku vkuVar = (vku) yjqVar.f;
                    rmr rmrVar = (rmr) yjqVar.d;
                    Set set = s4b1.f;
                    vkuVar.a(((h8y) rmrVar.b).a(new d8y(uic.x(str13).h(), str14)).observeOn((Scheduler) yjqVar.b).subscribe(new lgr(yjqVar, str13, (byte) 15), new cfs(yjqVar, (byte) 21)));
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    jut jutVar2 = (jut) yjqVar.c;
                    x6h1 x6h1VarC8 = ((xok0) jutVar2.b).b.c();
                    x6h1VarC8.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    ((i8h1) jutVar2.c).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    a8y a8yVar = (a8y) yjqVar.e;
                    if (a8yVar == null) {
                        u890.C("viewBinder");
                        throw null;
                    }
                    a8yVar.f.e();
                }
                return rih1Var2;
            case 19:
                zby zbyVar = ((EntityActionView) obj3).b;
                if (zbyVar != null) {
                    ((iu30) obj2).invoke(new yby(zbyVar.a));
                }
                return rih1Var2;
            case 20:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, ((String) obj3) + ". " + ((af5) obj2).b);
                b261.x(e261Var, 0);
                return rih1Var2;
            case 21:
                xiw0 xiw0Var = (xiw0) obj;
                lqr lqrVar = ((mmy) obj2).T0;
                wiw0 wiw0Var = wiw0.e;
                wiw0 wiw0Var2 = wiw0.d;
                wiw0 wiw0Var3 = wiw0.c;
                iu30 iu30Var3 = (iu30) obj3;
                if (xiw0Var.equals(wiw0.a)) {
                    slyVar = sly.c;
                } else if (xiw0Var.equals(wiw0.b)) {
                    slyVar = sly.d;
                } else if (xiw0Var.equals(wiw0Var3)) {
                    slyVar = tly.a;
                } else if (xiw0Var.equals(wiw0Var2)) {
                    slyVar = sly.e;
                } else {
                    if (!xiw0Var.equals(wiw0Var)) {
                        eg.o();
                        return null;
                    }
                    slyVar = sly.f;
                }
                iu30Var3.invoke(slyVar);
                if (xiw0Var.equals(wiw0Var2)) {
                    lqrVar.f().setAlpha(0.3f);
                } else if (xiw0Var.equals(wiw0Var3) || xiw0Var.equals(wiw0Var)) {
                    lqrVar.f().setAlpha(0.54f);
                }
                return rih1Var2;
            case 22:
                return new q98(((dzy) obj).a, (hv4) obj3, (yqg) obj2);
            case 23:
                return a(obj);
            case 24:
                ((ji50) obj).b.put(uq30.class, new r3r(new xzq(new ar30(((sqy) obj3).g, (lzn0) obj2), yoy.b1), lgx.X0, 4));
                return rih1Var2;
            case 25:
                qv00 qv00Var = (qv00) obj;
                String str15 = (String) obj3;
                qv00Var.a(str15, jo70.class, false);
                qv00Var.a(str15, xkk1.class, false);
                qv00Var.a(str15, hzy.class, false);
                qv00Var.a(str15, mtl.class, false);
                if (((vbs) ((goq) obj2).e).h) {
                    Set set2 = s4b1.f;
                    if (uic.h(str15, new blc0[]{blc0.ti, blc0.ui}) && (strF = fno1.f(str15)) != null) {
                        qv00Var.a(strF, dxc0.class, false);
                    }
                }
                return rih1Var2;
            case 26:
                qv00 qv00Var2 = (qv00) obj;
                String str16 = (String) obj3;
                qv00Var2.a(str16, jo70.class, false);
                if (((fdc) obj2).b) {
                    qv00Var2.a(str16, mtl.class, false);
                }
                return rih1Var2;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                rtb0 rtb0Var = (rtb0) obj;
                j2i j2iVar = (j2i) obj2;
                for (Object obj4 : (c380) obj3) {
                    int i4 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str17 = (String) obj4;
                    rtb0.c(rtb0Var, str17, new j2i(-1986075602, new zo7(j2iVar, i, str17, (byte) 2), true), 2);
                    i = i4;
                }
                return rih1Var2;
            case 28:
                rtb0.c((rtb0) obj, (Object) null, new j2i(1744866750, new cex((res) obj3, (mty) obj2, (byte) 4), true), 3);
                return rih1Var2;
            default:
                rtb0 rtb0Var2 = (rtb0) obj;
                ((iu30) obj3).invoke(rtb0Var2);
                jyo1.l(rtb0Var2, (q1d0) obj2);
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3w(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3w(byte b, Object obj, ven0 ven0Var) {
        super(1);
        this.a = b;
        this.c = ven0Var;
        this.b = obj;
    }
}
