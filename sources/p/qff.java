package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.Next;
import com.spotify.podcastinteractivity.commentssheetimpl.page.CommentsSheetPageParameters;
import com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qff extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qff(xxh xxhVar) {
        super(2);
        this.a = (byte) 24;
        this.b = xxhVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:188:0x0418  */
    /* JADX WARN: Code duplicated, block: B:201:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x0434  */
    /* JADX WARN: Code duplicated, block: B:203:0x0437  */
    /* JADX WARN: Code duplicated, block: B:215:0x0457  */
    /* JADX WARN: Code duplicated, block: B:245:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:286:0x053f  */
    /* JADX WARN: Code duplicated, block: B:293:0x055a  */
    /* JADX WARN: Code duplicated, block: B:398:0x07dc  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        boolean z;
        boolean z2;
        String strD;
        String str;
        String strY0;
        String str2;
        u7h u7hVar;
        u7h u7hVar2;
        pp70 pp70Var;
        mq70 mq70Var;
        pp70 pp70Var2;
        mq70 mq70Var2;
        up70 up70VarA;
        String str3;
        List list;
        List list2;
        ho70 ho70Var;
        String str4;
        String str5;
        long j;
        int i;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        njb0 njb0Var = null;
        njb0 njb0Var2 = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    otw.c((c9f) obj3, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                zso1.m((y0f) obj3, (b0k) obj, czo1.p(1));
                return njb0Var2;
            case 2:
                ekf ekfVar = (ekf) obj;
                gkf gkfVar = (gkf) obj2;
                int i2 = ekfVar.a;
                String str6 = ekfVar.b;
                goe goeVar = ekfVar.c;
                jkf jkfVar = (jkf) obj3;
                if (gkfVar.a == j7d.a) {
                    qf4 qf4Var = jkfVar.b.a;
                    if (qf4Var.h() && qf4Var.b()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return new fkf(i2, str6, goeVar, z, gkfVar.b, ekfVar.d);
            case 3:
                ((Number) obj2).intValue();
                ((smf) obj3).d((b0k) obj, czo1.p(1));
                return njb0Var2;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ev51 ev51Var = (ev51) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    qim0 qim0VarN = anm1.N("checkbox", u291.r(nim0Var, 24.0f));
                    boolean z3 = ev51Var.b;
                    boolean zI = x340Var4.i(ev51Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new m4d(ev51Var, (byte) 28);
                        x340Var4.s0(objT);
                    }
                    aex.b(z3, (iu30) objT, qim0VarN, (String) null, 0, (idn0) null, (ga80) null, x340Var4, 0, 120);
                } else {
                    x340Var4.b0();
                }
                return njb0Var2;
            case 5:
                u1f0 u1f0Var = (u1f0) obj;
                Bundle bundle = (Bundle) obj2;
                njb0 njb0Var3 = bundle != null ? (v1g) jhc1.t(bundle, "child_login_model", v1g.class) : null;
                if (njb0Var3 != null) {
                    return v1g.a(njb0Var3, u1f0Var.b, null, false, false, 251);
                }
                b2g b2gVar = ((x1g) obj3).a;
                return new v1g(b2gVar.a, u1f0Var.c, u1f0Var.b, b2gVar.c, b2gVar.b, pe11.b, false, false);
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vu30 vu30Var = ((yd91) obj3).a;
                    if (vu30Var == null) {
                        x340Var6.i0(348220469);
                        x340Var6.r(false);
                    } else {
                        c13.o(x340Var6, 1812348236, 0, vu30Var, x340Var6);
                        x340Var6.r(false);
                        njb0Var = njb0Var2;
                    }
                    if (njb0Var == null) {
                        x340Var6.i0(1812348624);
                        b5p1.e(x340Var6, 0);
                    } else {
                        x340Var6.i0(1812347477);
                    }
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return njb0Var2;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    eqr0.b(0, 2, ((m4g) obj3).a, x340Var8, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return njb0Var2;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    eqr0.b(0, 2, ((s4g) obj3).a, x340Var10, (qim0) null);
                } else {
                    x340Var10.b0();
                }
                return njb0Var2;
            case 9:
                ((Number) obj2).intValue();
                ((tfg) obj3).a((b0k) obj, czo1.p(1));
                return njb0Var2;
            case 10:
                uog uogVar = (uog) obj;
                wog wogVarJ = (xog) obj2;
                g471 g471VarH = ((drj0) obj3).h(uogVar.c);
                if (wogVarJ instanceof wog) {
                    wog wogVar = wogVarJ;
                    if (!uogVar.a.equals(wogVar.a) || uogVar.b != wogVar.b) {
                        wogVarJ = v1p1.j(uogVar, g471VarH, wogVar.h);
                    }
                }
                return Next.h(wogVarJ);
            case 11:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mqg mqgVar = (mqg) obj3;
                    b2p1.b(mqgVar.b, mqgVar.c, mqgVar.d, (qim0) null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return njb0Var2;
            case 12:
                lag lagVar = (lag) obj3;
                return new jpg0(new r4o(((xf4) lagVar.c).l(), "clips-grid", (iac0) lagVar.b, (oqg) lagVar.d, (zob1) obj, (v7l1) ((heq) lagVar.e).a.d.Ga.get()), tpg.t);
            case 13:
                return ((hf2) obj3).g((weu) obj2);
            case 14:
                h5h h5hVar = (h5h) obj;
                i1r i1rVar = (k1r) obj2;
                boolean z4 = i1rVar instanceof i1r;
                i1r i1rVar2 = z4 ? i1rVar : null;
                y060 y060Var = i1rVar2 != null ? (y060) i1rVar2.a : null;
                jo70 jo70Var = y060Var != null ? y060Var.a : null;
                xkk1 xkk1Var = y060Var != null ? y060Var.b : null;
                dxc0 dxc0Var = y060Var != null ? y060Var.c : null;
                qxc0 qxc0Var = y060Var != null ? y060Var.d : null;
                Map map = qxc0Var != null ? qxc0Var.X : null;
                Map map2 = b7x.a;
                if (map == null) {
                    map = map2;
                }
                Set set = xsf.a;
                Map map3 = dxc0Var != null ? dxc0Var.i : null;
                if (map3 != null) {
                    map2 = map3;
                }
                LinkedHashMap linkedHashMapO = sqg0.O(map2, map);
                if (h5hVar.g) {
                    z2 = true;
                } else {
                    List list3 = qxc0Var != null ? qxc0Var.N0 : null;
                    List list4 = z6x.a;
                    if (list3 == null) {
                        list3 = list4;
                    }
                    List list5 = qxc0Var != null ? qxc0Var.Z : null;
                    if (list5 != null) {
                        list4 = list5;
                    }
                    if (xsf.c(list3, list4, linkedHashMapO)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    String str7 = jo70Var != null ? jo70Var.a : null;
                    if (qxc0Var != null && (str5 = qxc0Var.a) != null) {
                        if (str5.length() <= 0) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            if (dxc0Var != null) {
                                str5 = dxc0Var.a;
                            } else {
                                str5 = null;
                            }
                        }
                    } else if (dxc0Var != null) {
                        str5 = dxc0Var.a;
                    } else {
                        str5 = null;
                    }
                    strD = xsf.d(str7, str5, linkedHashMapO);
                } else {
                    strD = jo70Var != null ? jo70Var.a : null;
                    if (strD == null) {
                        strD = "";
                    }
                }
                String str8 = strD;
                if (dxc0Var != null) {
                    String str9 = dxc0Var.f;
                    if (ihc1.y0(str9)) {
                        str = null;
                    } else {
                        str = str9;
                    }
                } else {
                    str = null;
                }
                String str10 = (jo70Var == null || (list2 = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list2)) == null || (str4 = ho70Var.a) == null || ihc1.y0(str4)) ? null : str4;
                if (jo70Var == null || (list = jo70Var.d) == null) {
                    strY0 = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str11 = ((ho70) it.next()).a;
                        if (ihc1.y0(str11)) {
                            str11 = null;
                        }
                        if (str11 != null) {
                            arrayList.add(str11);
                        }
                    }
                    ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
                    if (arrayList2 != null) {
                        strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, (iu30) null, 62);
                    } else {
                        strY0 = null;
                    }
                }
                me30 me30Var = ((j5h) obj3).b;
                String str12 = dxc0Var != null ? dxc0Var.g : null;
                o3r o3rVar = l5h.a;
                int iOrdinal = me30Var.a(str12).ordinal();
                boolean z5 = iOrdinal == 30 || iOrdinal == 31;
                String str13 = dxc0Var != null ? dxc0Var.h : null;
                boolean z6 = !(str13 == null || ihc1.y0(str13)) || z5;
                String str14 = h5hVar.a;
                int i3 = h5hVar.b;
                c380 c380Var = h5hVar.c;
                y0q0 y0q0Var = h5hVar.d;
                if (xkk1Var == null || (mq70Var2 = xkk1Var.a) == null || (up70VarA = mq70Var2.a(vp70.c)) == null || (str3 = up70VarA.a.a) == null) {
                    str2 = null;
                } else {
                    if (ihc1.y0(str3)) {
                        str3 = null;
                    }
                    str2 = str3;
                }
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var2 = mq70Var.b) == null) {
                    u7hVar = null;
                } else {
                    long j2 = pp70Var2.a.a.c;
                    u7hVar = new u7h(j2);
                    if (u7h.c(j2) <= 0.0f) {
                        u7hVar = null;
                    }
                }
                if (xkk1Var == null || (pp70Var = xkk1Var.d) == null) {
                    u7hVar2 = null;
                } else {
                    long j3 = pp70Var.a.a.c;
                    u7hVar2 = new u7h(j3);
                    if (u7h.c(j3) <= 0.0f) {
                        u7hVar2 = null;
                    }
                }
                return new i5h(str14, i3, str8, str10, str, strY0, z6, z5, c380Var, y0q0Var, str2, u7hVar == null ? u7hVar2 : u7hVar, y060Var != null && y060Var.e, y060Var != null ? y060Var.f : null, !z4, h5hVar.e, h5hVar.f && !z2, z2, h5hVar.h);
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var14).b;
                    q6h q6hVar = (q6h) obj3;
                    c4p1.h(q6hVar.Y, q6hVar.g, q6hVar.h, q6hVar.i, q6hVar.P0, q6hVar.O0, uyn1.z(12.0f, 0.0f, 2, nim0Var), x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return njb0Var2;
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    t1c.a(anm1.N("color.swatch", dug.e(u291.d(nim0Var, 1.0f), v9c.s(((o8d1) obj3).d, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6)), x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return njb0Var2;
            case 17:
                ((gs31) obj3).a((Intent) obj, (th61) obj2);
                return njb0Var2;
            case 18:
                pmh pmhVar = (pmh) obj3;
                return new jpg0(pmhVar.a.a(false, pmhVar.c.c().b(), pmhVar.d.d()), bmh.f);
            case 19:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                vph vphVar = (vph) obj3;
                CommentsSheetPageParameters commentsSheetPageParameters = vphVar.b;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Object objT2 = x340Var18.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        Parcelable.Creator creator = lik1.CREATOR;
                        lik1 lik1Var = new lik1(commentsSheetPageParameters.getViewUri());
                        x340Var18.s0(lik1Var);
                        objT2 = lik1Var;
                    }
                    lik1 lik1Var2 = (lik1) objT2;
                    boolean zG = x340Var18.g(commentsSheetPageParameters);
                    Object objT3 = x340Var18.T();
                    if (zG || objT3 == m4cVar) {
                        String entityUri = commentsSheetPageParameters.getEntityUri();
                        boolean disableInput = commentsSheetPageParameters.getDisableInput();
                        boolean showSensitiveComments = commentsSheetPageParameters.getShowSensitiveComments();
                        LaunchActionParams launchAction = commentsSheetPageParameters.getLaunchAction();
                        unh unhVar = new unh(lik1Var2, entityUri, disableInput, showSensitiveComments, launchAction != null ? launchAction.toDomainLaunchAction() : null);
                        x340Var18.s0(unhVar);
                        objT3 = unhVar;
                    }
                    otw.c(vphVar.c, (unh) objT3, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                } else {
                    x340Var18.b0();
                }
                return njb0Var2;
            case 20:
                ((gu2) obj3).invoke((tsu0) obj);
                return njb0Var2;
            case 21:
                ((gu2) obj3).invoke((zis0) obj);
                return njb0Var2;
            case 22:
                ((Number) obj2).intValue();
                ((ajq0) obj3).a((b0k) obj, czo1.p(1));
                return njb0Var2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new jpg0((laa) ((mwh) ((fxh) obj3).b).invoke((iac0) obj2), ovh.i);
            case 24:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    xxh xxhVar = (xxh) obj3;
                    boolean z7 = xxhVar instanceof wxh;
                    isl islVar = isl.a;
                    if (z7) {
                        x340Var20.i0(1108838851);
                        glx glxVar = glx.c;
                        uwr uwrVar3 = cbx.a;
                        long j4 = cbx.a(x340Var20).b.f;
                        Object objT4 = x340Var20.T();
                        if (objT4 == m4cVar2) {
                            objT4 = ovh.X;
                            x340Var20.s0(objT4);
                        }
                        w0h1.a(glxVar, islVar, anm1.N("comparison-test-tag", s161.b(nim0Var, false, (iu30) objT4)), j4, 0L, false, x340Var20, glx.d | 48, 48);
                        x340Var20.r(false);
                    } else if (xxhVar instanceof txh) {
                        x340Var20.i0(1109146495);
                        elx elxVar = elx.c;
                        uwr uwrVar4 = cbx.a;
                        long j5 = cbx.a(x340Var20).b.d;
                        Object objT5 = x340Var20.T();
                        if (objT5 == m4cVar2) {
                            objT5 = ovh.Y;
                            x340Var20.s0(objT5);
                        }
                        w0h1.a(elxVar, islVar, anm1.N("comparison-test-tag", s161.b(nim0Var, false, (iu30) objT5)), j5, 0L, false, x340Var20, elx.d | 48, 48);
                        x340Var20.r(false);
                    } else {
                        if (!(xxhVar instanceof uxh) && !u890.j(xxhVar, vxh.a)) {
                            throw p3d1.k(x340Var20, -102779574, false);
                        }
                        x340Var20.i0(1109473979);
                        x340Var20.r(false);
                    }
                } else {
                    x340Var20.b0();
                }
                return njb0Var2;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    api.e.invoke((qm70) obj3, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return njb0Var2;
            case 26:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                m4 m4Var = (m4) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    zro1.a(m4Var.b, m4Var.c, m4Var.d, m4Var.e, m4Var.f, z4p1.e(m4Var.g), z4p1.e(m4Var.h), u291.d(nim0Var, 1.0f), x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return njb0Var2;
            case 27:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    wu.c(((ju) obj3).a, (qim0) null, x340Var26, 0, 2);
                } else {
                    x340Var26.b0();
                }
                return njb0Var2;
            case 28:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean z8 = ((ub1) obj3).c;
                    hux huxVar = z8 ? klx.c : irx.c;
                    if (z8) {
                        x340Var28.i0(-1516341854);
                        uwr uwrVar5 = cbx.a;
                        j = cbx.a(x340Var28).c.c;
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(-1516268756);
                        uwr uwrVar6 = cbx.a;
                        j = cbx.a(x340Var28).b.b;
                        x340Var28.r(false);
                    }
                    w0h1.a(huxVar, isl.a, (qim0) null, j, 0L, false, x340Var28, 56, 52);
                } else {
                    x340Var28.b0();
                }
                return njb0Var2;
            default:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    hrx hrxVar = hrx.c;
                    int iOrdinal2 = ((ld1) obj3).b.ordinal();
                    if (iOrdinal2 == 0) {
                        i = 2131951913;
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        i = 2131951923;
                    }
                    w0h1.a(hrxVar, new jsl(cwl1.o0(x340Var30, i)), (qim0) null, 0L, 0L, false, x340Var30, hrx.d, 60);
                } else {
                    x340Var30.b0();
                }
                return njb0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qff(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qff(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qff(m2i m2iVar, qm70 qm70Var) {
        super(2);
        this.a = (byte) 25;
        this.b = qm70Var;
    }
}
