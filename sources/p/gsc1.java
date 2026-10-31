package p;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gsc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc1(uqe1 uqe1Var, gdx gdxVar) {
        super(2);
        this.a = (byte) 17;
        this.b = uqe1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        List listM;
        int i;
        String str;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                hsc1 hsc1Var = (hsc1) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q7r0 q7r0VarG = ((cir0) x340Var2.k(k2r0.a)).g();
                    d0r d0rVarC = cwl1.C(q7r0VarG);
                    ssc1 ssc1Var = hsc1Var.b;
                    lsc1 lsc1Var = new lsc1(ssc1Var.d, ssc1Var.e, ssc1Var.a, ssc1Var.b, ssc1Var.c);
                    uw0 uw0Var = (uw0) hsc1Var.c.a.c;
                    axo axoVar = (axo) ((jly0) uw0Var.f).get();
                    jly0 jly0Var = (jly0) uw0Var.g;
                    isc1 isc1Var = (isc1) uw0Var.d;
                    i1o1.e(new tva1(axoVar, (bxo) jly0Var.get(), (jsq) ((jly0) uw0Var.i).get(), (ksq) ((jly0) uw0Var.c).get(), (cxo) ((jly0) uw0Var.Y).get(), (hlp) ((jly0) uw0Var.Z).get(), (uep) ((jly0) uw0Var.b).get(), (mwm1) isc1Var.f.get(), (peq) isc1Var.l.get(), (qeq) isc1Var.m.get(), uw0Var.z(), d0rVarC, q7r0VarG), lsc1Var, d0rVarC, (qim0) null, (ipb1) null, xlj.a, apo.r(443312617, new xw91(q7r0VarG, hsc1Var, (byte) 9), x340Var2), 0, (xu30) null, x340Var2, 1769472, 204);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                mtc1 mtc1Var = (mtc1) obj2;
                rrk0 rrk0Var = (rrk0) ((ngs0) obj3).d;
                Integer numValueOf = Integer.valueOf(mtc1Var.b);
                String str2 = mtc1Var.a;
                x6h1 x6h1VarC = rrk0Var.b.c();
                x6h1VarC.i.add(new a7h1("prompt_content", (String) null, numValueOf, (String) null, str2));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                dv51 dv51Var = (dv51) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    qim0 qim0VarN = anm1.N("checkbox", u291.r(nim0Var, 24.0f));
                    boolean z = dv51Var.b;
                    boolean zI = x340Var4.i(dv51Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new qwc1(dv51Var, (byte) 0);
                        x340Var4.s0(objT);
                    }
                    aex.b(z, (iu30) objT, qim0VarN, (String) null, 0, (idn0) null, (ga80) null, x340Var4, 0, 120);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Uri uri = Uri.parse(((fod1) obj3).b);
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var6).g;
                    eso1.e(uri, isl.a, (qim0) null, new p3v(24.0f), (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var6, 221232, 0, 3972);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mpd1.a((lpd1) obj3, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                md5 md5Var = (md5) obj3;
                return new aso(f6o1.A(new kpg0(new tr21(((kpd1) md5Var.b).a, (byte) 1), pod1.g), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new qd81(md5Var, (byte) 24));
            case 6:
                ((Number) obj2).intValue();
                vvd1.a((qvd1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                zvd1 zvd1Var = (zvd1) obj3;
                m4c m4cVar = fkj0.X;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI2 = x340Var10.i(zvd1Var);
                    Object objT2 = x340Var10.T();
                    if (zI2 || objT2 == m4cVar) {
                        nda1 nda1Var = new nda1(0, zvd1Var, zvd1.class, "acknowledge", "acknowledge()V", 0, (byte) 21);
                        x340Var10.s0(nda1Var);
                        objT2 = nda1Var;
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zI3 = x340Var10.i(zvd1Var);
                    Object objT3 = x340Var10.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new qwc1(zvd1Var, (byte) 13);
                        x340Var10.s0(objT3);
                    }
                    n1p1.i(0, function0, x340Var10, (iu30) objT3);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj;
                x340Var11.i0(968662072);
                uwr uwrVar3 = cbx.a;
                gmt gmtVar = (gmt) zex.a.c;
                xex xexVar = (xex) gmtVar.b;
                hct0 hct0Var = (hct0) obj3;
                if (hct0Var instanceof fct0) {
                    listM = p7h.M(new u7h[]{new u7h(xexVar.l), new u7h(xexVar.p)});
                } else {
                    if (!u890.j(hct0Var, ect0.a)) {
                        eg.o();
                        return null;
                    }
                    listM = p7h.M(new u7h[]{new u7h(xexVar.y), new u7h(((wex) gmtVar.c).g)});
                }
                mic0 mic0VarS = v9c.s(listM, 0.0f, 0.0f, 14);
                x340Var11.r(false);
                return mic0VarS;
            case 9:
                x340 x340Var12 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nwd1 nwd1Var = (nwd1) obj3;
                    qwd1 qwd1Var = nwd1Var.c;
                    int i2 = qwd1Var.a;
                    hct0 hct0Var2 = qwd1Var.b;
                    boolean zI4 = x340Var13.i(nwd1Var);
                    Object objT4 = x340Var13.T();
                    if (zI4 || objT4 == fkj0.X) {
                        nda1 nda1Var2 = new nda1(0, nwd1Var, nwd1.class, "acknowledge", "acknowledge()V", 0, (byte) 22);
                        x340Var13.s0(nda1Var2);
                        objT4 = nda1Var2;
                    }
                    p1p1.t(i2, hct0Var2, (Function0) objT4, x340Var13, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(((txd1) obj3).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2046);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var16 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c(((qyd1) obj3).b, myd1.a, (qim0) null, (ipb1) null, x340Var17, 48, 12);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var18 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                chf0 chf0Var = (chf0) obj3;
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    int iOrdinal = chf0Var.ordinal();
                    if (iOrdinal == 0) {
                        i = 2131955522;
                    } else if (iOrdinal == 1) {
                        i = 2131955525;
                    } else if (iOrdinal == 2) {
                        i = 2131955523;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        i = 2131955524;
                    }
                    String strO0 = cwl1.o0(x340Var19, i);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strO0, (qim0) null, lee1.a(dsa0.s(chf0Var, cbx.d(x340Var19).f, x340Var19), 0L, cbx.b(x340Var19).a.c, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2042);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 13:
                u1e1 u1e1Var = (u1e1) obj;
                o1e1 o1e1Var = (o1e1) obj2;
                Long l = u1e1Var.c;
                List list = u1e1Var.b;
                if (!(o1e1Var instanceof m1e1)) {
                    if (o1e1Var.equals(l1e1.a)) {
                        return Next.h(u1e1.a(u1e1Var, p1e1.a));
                    }
                    if (o1e1Var.equals(n1e1.a)) {
                        return Next.i(u1e1.a(u1e1Var, r1e1.a), Collections.singleton(new k1e1(new a1e1(u1e1Var.a, list, l))));
                    }
                    eg.o();
                    return null;
                }
                m1e1 m1e1Var = (m1e1) o1e1Var;
                t1e1 t1e1Var = m1e1Var.a;
                llg llgVar = m1e1Var.b;
                xid xidVar = (xid) obj3;
                jo70 jo70Var = t1e1Var.a;
                io70 io70Var = jo70Var.e;
                String str3 = io70Var != null ? io70Var.a : null;
                String str4 = str3 != null ? str3 : "";
                wkk1 wkk1VarP = ucp1.p(t1e1Var.b);
                String strY0 = o7h.y0(list, "\n", (String) null, (String) null, vxd1.i, 30);
                String str5 = wkk1VarP.b;
                if (llgVar == null || (str = llgVar.b) == null) {
                    str = jo70Var.a;
                }
                return Next.h(u1e1.a(u1e1Var, new q1e1(strY0, str5, str4, str, str4, wkk1VarP.d, l != null ? xidVar.n(llgVar, l.longValue(), t1e1Var.c, jo70Var.b) : null)));
            case 14:
                x340 x340Var20 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    yhe1 yhe1Var = ((bie1) obj3).b;
                    boolean z2 = yhe1Var instanceof yhe1;
                    isl islVar = isl.a;
                    if (z2) {
                        x340Var21.i0(1777977658);
                        boolean zG = x340Var21.g(yhe1Var.a);
                        Object objT5 = x340Var21.T();
                        if (zG || objT5 == fkj0.X) {
                            objT5 = yv91.a(new fjc1(yhe1Var, (byte) 22));
                            x340Var21.s0(objT5);
                        }
                        eso1.e((Uri) ((tob1) objT5).getValue(), islVar, anm1.N("image", u291.d(nim0Var, 1.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var21, 197040, 0, 4056);
                        x340Var21.r(false);
                    } else {
                        if (!(yhe1Var instanceof zhe1)) {
                            throw p3d1.k(x340Var21, -2020857195, false);
                        }
                        x340Var21.i0(-2020843997);
                        qim0 qim0VarN2 = anm1.N("video", u291.d(nim0Var, 1.0f));
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        int iHashCode = Long.hashCode(x340Var21.T);
                        xos0 xos0VarM = x340Var21.m();
                        qim0 qim0VarE = zr7.E(x340Var21, qim0VarN2);
                        hzj.A.getClass();
                        if (x340Var21.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var21.m0();
                        if (x340Var21.S) {
                            x340Var21.l(hmb0.t1);
                        } else {
                            x340Var21.v0();
                        }
                        nko1.H(gfh0VarC, x340Var21, y580.O0);
                        nko1.H(xos0VarM, x340Var21, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var21, y580.R0);
                        nko1.F(x340Var21);
                        nko1.H(qim0VarE, x340Var21, y580.Y);
                        xtx xtxVar = xtx.c;
                        uwr uwrVar5 = cbx.a;
                        w0h1.a(xtxVar, islVar, (qim0) null, ((yex) zex.a.d).f, 0L, false, x340Var21, xtx.d | 48, 52);
                        x340Var21.r(true);
                        x340Var21.r(false);
                    }
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String str6 = ((mte1) obj3).a;
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(str6, (qim0) null, cbx.d(x340Var23).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var23, 0, 0, 2042);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                rje1.d((tue1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var24 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    rje1.f((uqe1) obj3, 16.0f, x340Var25, 8);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 18:
                hav0 hav0Var = (hav0) obj;
                fke1 fke1Var = (fke1) obj3;
                fke1Var.W0 = Float.intBitsToFloat((int) (((Offset) obj2).a >> 32)) + fke1Var.W0;
                fke1Var.e1.a(hav0Var.b, hav0Var.c);
                xab1 xab1Var = fke1Var.a1;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                fn31.T(fke1Var.v1(), (o8n) null, 0, new eke1(fke1Var, (lnm) null, (byte) 1), 3);
                fke1Var.Z0 = fke1Var.K1();
                dio1.z(fke1Var);
                return rih1Var;
            case 19:
                x340 x340Var26 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                ble1 ble1Var = (ble1) obj3;
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    maa maaVar = (maa) ble1Var.c.get();
                    dle1 dle1Var = ble1Var.a;
                    Set set = s4b1.f;
                    String strZ = uic.B(dle1Var.b).z();
                    otw.c(maaVar, new wke1(strZ != null ? strZ : ""), (qim0) null, (ipb1) null, x340Var27, 0, 12);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var28 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    otw.c((maa) ((gle1) obj3).a.get(), new jvf1(), (qim0) null, (ipb1) null, x340Var29, 0, 12);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var30 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    otw.c((maa) ((mle1) obj3).b.get(), new jle1(), (qim0) null, (ipb1) null, x340Var31, 0, 12);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                x340 x340Var32 = (b0k) obj;
                x340Var32.i0(1578447612);
                jia jiaVar = (jia) ((kia) obj3).d.getValue();
                x340Var32.r(false);
                return jiaVar;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var33 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    bin.m((s6f1) obj3, (qim0) null, (Function0) null, x340Var34, 0, 6);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                x340 x340Var35 = (b0k) obj;
                x340Var35.i0(-2145498091);
                vnr0 vnr0VarA = shy0.a(((SceneTemplate.TopAlbumsContent.List) obj3).r(), x340Var35);
                x340Var35.r(false);
                return vnr0VarA;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                pc8 pc8Var = (pc8) obj3;
                g9p g9pVar = (g9p) pc8Var.b;
                epb1 epb1Var = new epb1((zob1) obj);
                g9pVar.getClass();
                u9p u9pVar = (u9p) g9pVar.a.c;
                gw70 gw70VarE = ((i1o) u9pVar.C).e();
                c8o.l(gw70VarE);
                return new sma1(new jpg0(f6o1.A(new b9f1(epb1Var, gw70VarE, (lzn0) u9pVar.G.get()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new qwc1(pc8Var, (byte) 29)), new rma1((Integer) null, 2131167033, (Integer) null, 13));
            case 26:
                ((Number) obj2).intValue();
                x340 x340Var36 = (b0k) obj;
                x340Var36.i0(1942817544);
                wi90 wi90Var = (wi90) obj3;
                vnr0 vnr0Var = (vnr0) wi90Var.e.invoke(x340Var36, 0);
                if (vnr0Var == null) {
                    x340Var36.i0(-1263112942);
                    vnr0Var = (vnr0) wi90Var.a.invoke(x340Var36, 0);
                } else {
                    x340Var36.i0(-1263113872);
                }
                x340Var36.r(false);
                x340Var36.r(false);
                return vnr0Var;
            case 27:
                ((Number) obj2).intValue();
                x340 x340Var37 = (b0k) obj;
                x340Var37.i0(845476650);
                vnr0 vnr0VarA2 = shy0.a(((SceneTemplate.TopFivePodcastsContent.Card1) obj3).p(), x340Var37);
                x340Var37.r(false);
                return vnr0VarA2;
            case 28:
                ((Number) obj2).intValue();
                x340 x340Var38 = (b0k) obj;
                x340Var38.i0(-977453854);
                vnr0 vnr0VarA3 = shy0.a(((SceneTemplate.TopFiveSongsContent.Card1) obj3).q(), x340Var38);
                x340Var38.r(false);
                return vnr0VarA3;
            default:
                ((Number) obj2).intValue();
                x340 x340Var39 = (b0k) obj;
                x340Var39.i0(-1428936006);
                vnr0 vnr0VarA4 = shy0.a(((SceneTemplate.TopGenreContent.Card2) obj3).s(), x340Var39);
                x340Var39.r(false);
                return vnr0VarA4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsc1(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsc1(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
