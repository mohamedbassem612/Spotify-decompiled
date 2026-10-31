package p;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import j$.net.URLDecoder;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y6w0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6w0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strK;
        boolean zB;
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 5;
        nim0 nim0Var = nim0.a;
        String strDecode = null;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        byte b4 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m8w0 m8w0Var = (m8w0) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (m8w0Var instanceof j8w0) {
                    x340Var2.i0(-1195147515);
                    nln.c(cwl1.o0(x340Var2, xto.w(m8w0Var)), x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1195051942);
                    String strO0 = cwl1.o0(x340Var2, xto.w(m8w0Var));
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var2).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                h8w0 h8w0Var = (h8w0) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e8w0 e8w0Var = h8w0Var.a.e;
                    if (e8w0Var == null) {
                        u890.C("model");
                        throw null;
                    }
                    smp0 smp0Var = h8w0Var.c;
                    f8w0 f8w0Var = h8w0Var.d;
                    boolean zI = x340Var4.i(f8w0Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == m4cVar) {
                        nsm0 nsm0Var = new nsm0(2, f8w0Var, f8w0.class, "navigateToPreset", "navigateToPreset(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 10);
                        x340Var4.s0(nsm0Var);
                        objT = nsm0Var;
                    }
                    vu30 vu30Var = (vu30) objT;
                    boolean zI2 = x340Var4.i(h8w0Var);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new z6v0(h8w0Var, (byte) 15);
                        x340Var4.s0(objT2);
                    }
                    pqo.d(e8w0Var, smp0Var, vu30Var, (Function0) objT2, (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                fiw0.b((giw0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                hiw0 hiw0Var = (hiw0) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (hiw0Var.e) {
                        strK = x0d.k(x340Var6, 940331834, 2131960408, x340Var6, false);
                    } else {
                        x340Var6.i0(940334366);
                        x340Var6.r(false);
                        strK = hiw0Var.b;
                    }
                    uwo1.e(strK, e9k.n(63, nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2044);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                k4m k4mVar = (k4m) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var8).g;
                    qim0 qim0VarV = u291.v(nim0Var, 16.0f);
                    zov0 zov0Var2 = cbx.b(x340Var8).g;
                    qim0 qim0VarH = u291.h(qim0VarV, 16.0f);
                    boolean zE = x340Var8.e(k4mVar.ordinal());
                    Object objT3 = x340Var8.T();
                    if (zE || objT3 == fkj0.X) {
                        objT3 = new q2c(k4mVar, (byte) 2);
                        x340Var8.s0(objT3);
                    }
                    dm5.a((iu30) objT3, qim0VarH, (iu30) null, x340Var8, 0, 4);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var10).g;
                    hdh1 hdh1Var = (hdh1) obj3;
                    w0h1.a(hdh1Var.c, new jsl(cwl1.o0(x340Var10, hdh1Var.d)), u291.r(nim0Var, 48.0f), 0L, 0L, false, x340Var10, 8, 56);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                mpw0 mpw0Var = (mpw0) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean z2 = mpw0Var.b.a;
                    yeu0 yeu0Var = mpw0Var.e;
                    boolean zI3 = x340Var12.i(mpw0Var);
                    Object objT4 = x340Var12.T();
                    if (zI3 || objT4 == fkj0.X) {
                        objT4 = new mwv0(mpw0Var, (byte) 12);
                        x340Var12.s0(objT4);
                    }
                    rqg0.l(z2, yeu0Var, (iu30) objT4, (qim0) null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((wpw0) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 8:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    vpb1.f(((r7x0) obj3).b, x340Var14, 48);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwo1.e(((rlx0) obj3).g, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2046);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 10:
                String str = (String) obj2;
                cpx0 cpx0Var = (cpx0) obj3;
                cpx0Var.g.a(str).subscribe();
                cpx0Var.h.a(str, new g1x0(cpx0Var, str, b2));
                return rih1Var;
            case 11:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                mpx0 mpx0Var = (mpx0) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tbr0 tbr0VarC = ((cir0) x340Var18.k(k2r0.a)).c();
                    opx0 opx0Var = mpx0Var.b;
                    z = opx0Var.c == 2;
                    String str2 = opx0Var.b;
                    int i = z ? 2131960594 : 2131960591;
                    int i2 = z ? 2131960592 : 2131960585;
                    int i3 = z ? 2131960593 : 2131960586;
                    int i4 = z ? 2131960595 : 2131960589;
                    boolean zI4 = x340Var18.i(mpx0Var) | x340Var18.i(tbr0VarC);
                    Object objT5 = x340Var18.T();
                    if (zI4 || objT5 == m4cVar2) {
                        objT5 = new glu0((Object) mpx0Var, (Object) tbr0VarC, (lnm) strDecode, (byte) 16);
                        x340Var18.s0(objT5);
                    }
                    vu30 vu30Var2 = (vu30) objT5;
                    boolean zI5 = x340Var18.i(mpx0Var) | x340Var18.i(tbr0VarC);
                    Object objT6 = x340Var18.T();
                    if (zI5 || objT6 == m4cVar2) {
                        objT6 = new g1x0(mpx0Var, tbr0VarC, (byte) 8);
                        x340Var18.s0(objT6);
                    }
                    bqn1.p(str2, vu30Var2, (Function0) objT6, (qim0) null, i, i2, i3, i4, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 12:
                fux0 fux0Var = (fux0) obj3;
                hux0 hux0Var = fux0Var.a;
                return new qux0(hux0Var.a, hux0Var.b, hux0Var.d, hux0Var.e, hux0Var.f, fux0Var.c);
            case 13:
                Intent intent = (Intent) obj;
                if (!((kiu0) ((b72) obj3).b).b.h()) {
                    intent = null;
                }
                if (intent != null) {
                    Set set = s4b1.f;
                    String strI = uic.x(intent.getDataString()).i(2);
                    if (strI != null) {
                        strDecode = URLDecoder.decode(strI, "UTF-8");
                    }
                }
                return new hux0(60, null, strDecode, null, null, false, false);
            case 14:
                g0y0 g0y0Var = (g0y0) obj3;
                return new aso(f6o1.A(new kpg0(new pt((kly0) g0y0Var.b, (tzr0) g0y0Var.c, (n0v0) g0y0Var.d, new bsn(g0y0Var, (byte) 4), (lwp) g0y0Var.f), xox0.Y0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ewq0((Object) g0y0Var, (byte) 20));
            case 15:
                m0y0 m0y0Var = (m0y0) obj3;
                o860 o860Var = m0y0Var.a;
                return new jpg0(zu70.a((zu70) o860Var.d, new epb1((zob1) obj), (kly0) o860Var.b, (hjc) o860Var.c, (lo60) o860Var.e, new tbo0((byte) 3), 3520), new l0y0(m0y0Var, b4));
            case 16:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    cir0 cir0Var = (cir0) x340Var20.k(k2r0.a);
                    o4y0 o4y0Var = (o4y0) obj3;
                    List list = o4y0Var.b.a;
                    ngs0 ngs0Var = o4y0Var.c;
                    boolean zI6 = x340Var20.i(cir0Var);
                    Object objT7 = x340Var20.T();
                    if (zI6 || objT7 == fkj0.X) {
                        objT7 = new ndl(cir0Var, (byte) 1);
                        x340Var20.s0(objT7);
                    }
                    uyn1.k(list, ngs0Var, (Function0) objT7, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                return (jh5) obj3;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                eo01 eo01Var = (eo01) obj;
                j3r j3rVarA = ((ms31) obj2).a(0);
                j3r j3rVar = j3rVarA instanceof j3r ? j3rVarA : null;
                Object obj4 = j3rVar != null ? j3rVar.a : null;
                u7y0 u7y0Var = obj4 instanceof u7y0 ? (u7y0) obj4 : null;
                if (u7y0Var != null) {
                    z7y0 z7y0Var = (z7y0) obj3;
                    int iOrdinal = u7y0Var.a.ordinal();
                    if (iOrdinal == 0) {
                        zB = false;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        zB = do01.b(new co01(eo01Var.d, eo01Var.a, eo01Var.b), u890.j(eo01Var.e.get("track_source"), "PROMPT_GENERATED"), z7y0Var.c.b(), u7y0Var.b);
                    }
                    if (zB) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                jzn1.i((f7y0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var22).b;
                    kby0 kby0Var = (kby0) obj3;
                    ozn1.h(kby0Var.e, kby0Var.f, kby0Var.g, uyn1.z(12.0f, 0.0f, 2, nim0Var), x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                jbi0 jbi0Var = (jbi0) obj3;
                return new aso(f6o1.A(new kpg0(new cm0((kly0) jbi0Var.b, (l0x0) jbi0Var.c, new bsn(jbi0Var, (byte) 5), (lwp) jbi0Var.e, (lo60) jbi0Var.f, (gw70) jbi0Var.g, (uu00) jbi0Var.h), ucy0.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ewq0((Object) jbi0Var, (byte) 26));
            case 22:
                yqy0 yqy0Var = ((bry0) obj3).c;
                boolean z3 = ((k5l1) obj).a;
                Boolean bool = yqy0Var.c.a;
                return bool != null ? new zqy0(bool.booleanValue()) : new zqy0(z3);
            case 23:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    eqr0.b(0, 2, ((nhf1) obj3).a, x340Var24, (qim0) null);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    eio1.e(x340Var26, 0);
                    ewe eweVar = (ewe) obj3;
                    gio1.g((i4z0) eweVar.d, (p40) eweVar.e, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    otw.c(((q9z0) obj3).d, new f3l(16.0f, 2887, false), (qim0) null, (ipb1) null, x340Var28, 64, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                sbz0 sbz0Var = (sbz0) obj3;
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    View view = (View) sbz0Var.c.c.getValue();
                    if (view == null) {
                        x340Var30.i0(857938836);
                        x340Var30.r(false);
                    } else {
                        x340Var30.i0(857938837);
                        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var30, 0);
                        int iHashCode = Long.hashCode(x340Var30.T);
                        xos0 xos0VarM = x340Var30.m();
                        qim0 qim0VarE = zr7.E(x340Var30, nim0Var);
                        hzj.A.getClass();
                        if (x340Var30.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var30.m0();
                        if (x340Var30.S) {
                            x340Var30.l(hmb0.t1);
                        } else {
                            x340Var30.v0();
                        }
                        nko1.H(mbhVarA, x340Var30, y580.O0);
                        nko1.H(xos0VarM, x340Var30, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var30, y580.R0);
                        nko1.F(x340Var30);
                        nko1.H(qim0VarE, x340Var30, y580.Y);
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        zen0 zen0Var = sbz0Var.l;
                        uwr uwrVar5 = cbx.a;
                        xpv0 xpv0Var = cbx.c(x340Var30).c;
                        n8b1 n8b1VarK = xpv0.k();
                        Object objT8 = x340Var30.T();
                        if (objT8 == fkj0.X) {
                            objT8 = v9z0.g;
                            x340Var30.s0(objT8);
                        }
                        bby bbyVarO = xay.o(n8b1VarK, (iu30) objT8);
                        xpv0 xpv0Var2 = cbx.c(x340Var30).c;
                        fq7.c(zen0Var, qim0VarF, bbyVarO.a(xay.e(2, xpv0.k())), (ln00) null, (String) null, apo.r(-1178630871, new hov0(sbz0Var, view, b3), x340Var30), x340Var30, 1572870);
                        t1c.a(voo1.y(dug.f(u291.f(nim0Var, 1.0f), cbx.a(x340Var30).a.a.a(), d4o1.a), voo1.g), x340Var30, 0);
                        x340Var30.r(true);
                        x340Var30.r(false);
                    }
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 27:
                tv80 tv80Var = (tv80) obj2;
                if (((z8z0) obj).equals(new i8z0(2))) {
                    ((ccz0) obj3).c.invoke(tv80Var);
                }
                return rih1Var;
            case 28:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                qcz0 qcz0Var = (qcz0) obj3;
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    nl70.c(i3o1.n(qcz0Var.b, x340Var32, 0), (String) null, anm1.N("QueueUpsellIcon", nim0Var), upo1.C(true, x340Var32), x340Var32, 56, 0);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            default:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                tcz0 tcz0Var = (tcz0) obj3;
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    otw.c((maa) tcz0Var.c.get(), new rcz0(tcz0Var.b.a), (qim0) null, (ipb1) null, x340Var34, 0, 12);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6w0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
