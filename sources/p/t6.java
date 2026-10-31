package p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.animationbanner.impl.events.proto.HomeAnimationBannerDisplayed;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj) throws IOException {
        boolean z;
        String str;
        String str2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        String str3 = "";
        byte b2 = 4;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Object obj5 = ((List) obj4).get(((Number) obj).intValue());
                n700 n700Var = (n700) ((mmr0) obj5).b;
                if (!n700Var.f) {
                    ((yfa) obj3).d.d(n700Var.b, (qd00) obj2);
                }
                return obj5;
            case 1:
                qc40 qc40Var = (qc40) obj;
                if (!qc40Var.equals(oc40.a)) {
                    if (!qc40Var.equals(pc40.a)) {
                        eg.o();
                        return null;
                    }
                    res resVar = (res) obj4;
                    ev evVar = ((ju) obj3).a;
                    Context context = (Context) resVar.d;
                    context.startActivity(dv.a((dv) resVar.e, context, evVar.a, evVar.b, (String) obj2));
                }
                return rih1Var;
            case 2:
                return new hp0(((jp0) obj4).e.c(new gp0((iu30) obj3, (ven0) obj2, (byte) 0)), (byte) 0);
            case 3:
                it0 it0Var = new it0((ven0) obj3, (frr0) obj2, (byte) 0);
                iac0 iac0Var = (iac0) obj4;
                iac0Var.getLifecycle().a(it0Var);
                return new ht0(iac0Var, it0Var, (byte) 0);
            case 4:
                q811 q811Var = (q811) obj4;
                boolean z3 = ((Number) obj).intValue() > 0;
                if (!u890.j(q811Var.a, Boolean.valueOf(z3))) {
                    q811Var.a = Boolean.valueOf(z3);
                    if (z3) {
                        fn31.T((c9n) obj3, (o8n) null, 0, new qm((tm) obj2, (lnm) null, (byte) 6), 3);
                    }
                }
                return rih1Var;
            case 5:
                iw1 iw1Var = (iw1) obj;
                ow1 ow1Var = (ow1) obj2;
                if (iw1Var.equals(hw1.a)) {
                    ((Function0) obj4).invoke();
                } else if (iw1Var.equals(fw1.a)) {
                    ((Function0) obj3).invoke();
                } else if (iw1Var.equals(ew1.a)) {
                    ow1Var.c.invoke();
                } else {
                    if (!iw1Var.equals(gw1.a)) {
                        eg.o();
                        return null;
                    }
                    ow1Var.d.invoke();
                }
                return rih1Var;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                wt1 wt1Var = (wt1) obj4;
                i8h1 i8h1Var = wt1Var.a;
                gpk0 gpk0Var = wt1Var.b;
                Integer numValueOf = Integer.valueOf(iIntValue);
                String str4 = wt1Var.c;
                x6h1 x6h1VarC = gpk0Var.a.c();
                x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, "spotify:new:playlist", str4));
                x6h1VarC.j = false;
                ((xj0) obj2).invoke(new cs1(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 7:
                drr0 drr0Var = (drr0) obj3;
                drr0Var.t((int) (((yr80) obj).a >> 32));
                ((ven0) obj2).setValue(Boolean.valueOf(((float) ((int) (((y9e1) obj4).c >> 32))) > drr0Var.s()));
                return rih1Var;
            case 8:
                List list = ((jy2) obj4).b;
                ((rtb0) obj).e(list.size(), new qf1(list, (byte) 9), new qf1(list, (byte) 10), new j2i(802480018, new rf1((byte) 1, (Function0) obj3, (ycc1) obj2, list), true));
                return rih1Var;
            case 9:
                tka0 tka0Var = dtw.C;
                return mhc.b((Context) obj4, (FrameLayout) obj, ekf1.a((ekf1) ((kly0) ((eyh0) obj3).d).get(), (dvs) obj2), rih1.a, (ipb1) null, 112).w;
            case 10:
                v3t v3tVar = (v3t) obj4;
                v3tVar.a(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)), (c9n) obj3, (n8b1) obj2);
                Object value = v3tVar.a.getValue();
                o95 o95Var = v3tVar.b;
                if (u890.j(value, o95Var != null ? o95Var.e.getValue() : null)) {
                    o95 o95Var2 = v3tVar.b;
                    if (o95Var2 != null) {
                        z = true;
                        if (!o95Var2.f()) {
                        }
                    } else {
                        z = true;
                    }
                    z2 = z;
                }
                return Boolean.valueOf(!z2);
            case 11:
                return new sg((o03) obj4, (ven0) obj3, (ven0) obj2, (byte) 1);
            case 12:
                qv00 qv00Var = (qv00) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                if (((ptk) ((u961) obj4).b).f) {
                    qv00Var.a(str6, yb3.class, false);
                }
                qv00Var.a(str6, xti0.class, false);
                qv00Var.a(str6, mm11.class, false);
                qv00Var.a(str6, s211.class, false);
                qv00Var.a(str6, myv0.class, false);
                if (str5 != null) {
                    qv00Var.a(str5, dde0.class, false);
                    qv00Var.a(str5, zo6.class, false);
                }
                return rih1Var;
            case 13:
                ((qtr) obj).b(new v63((iu30) obj4, (u63) obj3, (zwg) obj2, (lnm) null, (byte) 0));
                return rih1Var;
            case 14:
                s63 s63Var = (s63) obj;
                FlowableMap flowableMapJ = ((f8b) obj3).a(s63Var.g.b).toFlowable(backpressureStrategy).J(j561.f);
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableMapJ);
                String str7 = s63Var.a;
                return rqt0.u(h5p1.s((mr20) obj4, kgeVar, new kge(g7h.d((g7h) ((ne) obj2).c, "", new String[]{str7}).toFlowable(backpressureStrategy).J(new vdn1(str7, (byte) 14)).J(b4x0.h)), new w63(s63Var, (lnm) null, (byte) 0)));
            case 15:
                x83 x83Var = (x83) obj3;
                return new jpg0(cso1.y(f6o1.A(ycm.a((ycm) ((e93) obj4).h), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), x83Var.y, new l83(x83Var, b2)), new cc2((ucm) obj2, x83Var, (byte) 7));
            case 16:
                dnc0 dnc0Var = (dnc0) obj;
                x83 x83Var2 = (x83) obj4;
                w2c1 w2c1Var = (y1c1) obj3;
                lnm lnmVar = null;
                two1.v(dnc0Var, new nf(h4p1.f(new lqv(x83Var2.d.getLifecycle(), w8c0.d, w2c1Var.U(jc91.class), (lnm) null, (byte) 10)), (byte) 9), true, new j83(x83Var2, (byte) 5));
                wto wtoVar = (wto) obj2;
                uto utoVar = (uto) o7h.s0(wtoVar.b);
                u961 u961Var = x83Var2.h;
                String str8 = wtoVar.a;
                String str9 = utoVar != null ? utoVar.a : null;
                two1.v(dnc0Var, new sr0(new x010(hu20.e(new ht20(((yd3) u961Var.d).j, new sd0(2, (lnm) null, (byte) 7)), new m53((Object) u961Var, (Object) str8, (Object) str9, lnmVar, (byte) 0)), ((v8n0) u961Var.c).a(), o53.h, (byte) 1), str8, str9, u961Var, (byte) 2), false, new db(x83Var2, w2c1Var, wtoVar, utoVar, (byte) 8));
                return rih1Var;
            case 17:
                w2c1 w2c1Var2 = (y1c1) obj;
                pvu pvuVar = (pvu) ((e93) obj4).e;
                String str10 = (String) obj3;
                vyo vyoVar = pvuVar.b;
                yxu yxuVar = new yxu(w2c1Var2, (byte) 0);
                zyo zyoVar = pvuVar.f;
                iac0 iac0Var2 = pvuVar.a;
                drp0 drp0VarF = ((hc3) ((ezo) zyoVar.a.c).v).f();
                c8o.l(drp0VarF);
                qtw qtwVarA = f6o1.A(vyo.b(vyoVar, yxuVar, p7h.M(new slq0[]{new xwv0(drp0VarF, str10, iac0Var2), xyo.a(pvuVar.d, cto1.q(iac0Var2), null, gio1.b(new b521(Collections.singletonMap(str10, new xnl(z6x.a)))), 2), pvuVar.e.a(cto1.q(iac0Var2), w2c1Var2.U(qae.class)), new z68(((ezo) pvuVar.c.a.c).e(), Collections.singleton(str10), new elo(w2c1Var2, (byte) 0))})), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                x83 x83Var3 = (x83) obj2;
                return new jpg0(cso1.y(qtwVarA, x83Var3.j, new l83(x83Var3, (byte) 5)), new j83(x83Var3, b2));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x83 x83Var4 = (x83) obj4;
                hc3 hc3Var = x83Var4.c;
                cyp cypVar = x83Var4.f79p;
                e93 e93Var = (e93) obj3;
                return hc3Var.c().j ? fdg1.m0(new xzq(((zwp) e93Var.d).a((d0r) obj2, new tlt0(cypVar.d(), cypVar.a())), q83.Z), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new jpg0((dx0) e93Var.c, q83.N0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                uv11 uv11Var = (uv11) obj;
                return new gcm(uv11Var.a, uv11Var.b, null, new f80((o3r) obj4, (x83) obj3, uv11Var, (qlb) obj2, (byte) 4), 12);
            case 20:
                b1h b1hVar = (b1h) obj3;
                if (kh3.a[((hf3) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                cce cceVar = ((lh3) obj4).X0;
                int i = b1hVar.c;
                String str11 = b1hVar.b.a;
                i8h1 i8h1Var2 = (i8h1) cceVar.b;
                x6h1 x6h1VarC2 = ((bqk0) cceVar.c).b.c();
                x6h1VarC2.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC3 = y6h1VarA.c();
                x6h1VarC3.i.add(new a7h1("album_item", (String) null, numValueOf2, str11, (String) null));
                x6h1VarC3.j = false;
                ((qka) obj2).invoke(new g1h(b1hVar, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 21:
                String str12 = (String) obj3;
                ((vu1) ((oj80) obj4).b).a(Collections.singletonList(str12), str12, str12, (tv80) obj, new dy1((g3d0) obj2), true);
                return rih1Var;
            case 22:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar = wsc0Var.f;
                bl3 bl3Var = (bl3) obj4;
                nk3 nk3Var = (nk3) obj3;
                bl3Var.getClass();
                return (cl3.a.contains(nk3Var) && kbyVar.w.b && (nk3Var != nk3.d || thu0.b(wsc0Var, true))) ? new fk3(kbyVar.b, kbyVar.d.a(1), (String) obj2) : bl3Var.e(nk3Var);
            case 23:
                return new sg((bw91) obj4, obj3, (eb5) obj2, (byte) 2);
            case 24:
                int iIntValue2 = ((Number) obj).intValue();
                ven0 ven0Var = (ven0) obj2;
                if (((Boolean) ven0Var.getValue()).booleanValue() && iIntValue2 > 0) {
                    ld5 ld5Var = (ld5) obj3;
                    t2j0 t2j0Var = (t2j0) ((br0) obj4).c;
                    gn60 gn60VarN = HomeAnimationBannerDisplayed.n();
                    gn60VarN.q(ld5Var.a);
                    int i2 = ld5Var.b;
                    if (i2 == 1) {
                        str = "ALL_CAUGHT_UP";
                    } else {
                        if (i2 != 2) {
                            throw null;
                        }
                        str = "NEW_MUSIC_FRIDAY_CAUGHT_UP";
                    }
                    gn60VarN.n(str);
                    t2j0Var.a(gn60VarN.build());
                    ven0Var.setValue(Boolean.FALSE);
                }
                ven0Var.setValue(Boolean.valueOf(iIntValue2 == 0));
                return rih1Var;
            case 25:
                kd31 kd31Var = (kd31) obj;
                wqz0 wqz0Var = (wqz0) obj3;
                c21 c21Var = (c21) obj2;
                kd31Var.b(((Number) wqz0Var.b.getValue()).floatValue() * ((Number) ((tob1) obj4).getValue()).floatValue() * (c21Var != null ? ((Number) ((tob1) c21Var.b).getValue()).floatValue() : 1.0f));
                kd31Var.q(((Number) wqz0Var.c.getValue()).floatValue());
                kd31Var.r(kd31Var.b);
                kd31Var.i(2);
                return rih1Var;
            case 26:
                e261 e261Var = (e261) obj;
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    vnr0 vnr0Var = (vnr0) obj4;
                    vnr0 vnr0Var2 = (vnr0) obj3;
                    e261Var.b(z161.C, f46.i0(new af5[]{vnr0Var != null ? qgo1.x(vnr0Var) : null, vnr0Var2 != null ? qgo1.x(vnr0Var2) : null}));
                }
                return rih1Var;
            case 27:
                kd31 kd31Var2 = (kd31) obj;
                xd6 xd6Var = (xd6) obj2;
                zjy.m((Number) ((tob1) obj4).getValue(), kd31Var2, 2);
                b4g1 b4g1Var = (b4g1) obj3;
                float fH = kd31Var2.T0.h() * 8.0f * (((Boolean) b4g1Var.b.getValue()).booleanValue() ? -1.0f : 1.0f);
                kd31Var2.C((xd6Var != null ? xd6Var.c.s() : 0.0f) * fH);
                kd31Var2.E((xd6Var != null ? xd6Var.d.s() : 0.0f) * fH);
                kd31Var2.q(dm5.T(1.0f, 0.9f, yoi1.o(Math.abs(b4g1Var.c.s()) / 180.0f, 0.0f, 1.0f)));
                kd31Var2.r(kd31Var2.b);
                return rih1Var;
            case 28:
                ol6 ol6Var = (ol6) obj;
                FlowableMap flowableMapJ2 = g7h.d((g7h) obj4, "", new String[]{ol6Var.a}).toFlowable(backpressureStrategy).J(new x6o0(ol6Var, (byte) 24));
                FlowableMap flowableMapJ3 = ((f8b) obj3).a(ol6Var.h.b).toFlowable(backpressureStrategy).J(drm0.g);
                sd41 sd41Var = (sd41) obj2;
                hl6 hl6Var = ol6Var.l;
                if (hl6Var != null && (str2 = hl6Var.a) != null) {
                    str3 = str2;
                }
                return Flowable.e(flowableMapJ2, flowableMapJ3, sd41Var.c(str3).toFlowable(backpressureStrategy), cq41.g).M(uml1.g).t(Functions.a);
            default:
                l5m l5mVar = (l5m) ((ven0) obj4).getValue();
                iu30 iu30Var = (iu30) ((ven0) obj3).getValue();
                String str13 = l5mVar.e;
                iu30Var.invoke(new qn6(str13, ((em3) obj2).s(new hu80(str13))));
                return rih1Var;
        }
    }
}
