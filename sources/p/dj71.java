package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dj71 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj71(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        af5 af5VarP;
        int i;
        byte b = this.a;
        int i2 = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((ej71) obj3).a((b0k) obj, czo1.p(7));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((sm71) obj3).c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                i2p1.f((rm71) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d3p1.s(((dp71) obj3).b, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                return Next.h(new dp71(fg91.b, ((cp71) obj).a, 1, false, ((kp71) obj3).b.d()));
            case 5:
                vp71 vp71Var = (wp71) obj;
                idd1 idd1Var = ((yp71) obj3).Z;
                if (vp71Var instanceof up71) {
                    qyl0 qyl0Var = (qyl0) idd1Var.getValue();
                    qyl0Var.getClass();
                    x6h1 x6h1VarC = qyl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("existing_chats", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    up71 up71Var = (up71) vp71Var;
                    Integer numValueOf = Integer.valueOf(up71Var.a);
                    String str = up71Var.g;
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("chat_row", (String) null, numValueOf, str, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).b = qyl0Var.a;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var.a();
                }
                if (!(vp71Var instanceof vp71)) {
                    eg.o();
                    return null;
                }
                qyl0 qyl0Var2 = (qyl0) idd1Var.getValue();
                qyl0Var2.getClass();
                x6h1 x6h1VarC3 = qyl0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("suggested_chats", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                vp71 vp71Var2 = vp71Var;
                Integer numValueOf2 = Integer.valueOf(vp71Var2.a);
                String str2 = vp71Var2.f;
                x6h1 x6h1VarC4 = y6h1VarA3.c();
                x6h1VarC4.i.add(new a7h1("chat_row", (String) null, numValueOf2, str2, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA4;
                ((xjn) k7h1Var2).b = qyl0Var2.a;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                er71 er71Var = (er71) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ArrayList arrayList = er71Var.a;
                    if (arrayList.size() == 1) {
                        x340Var4.i0(-791836592);
                        String str3 = ((phx) o7h.q0(arrayList)).c;
                        ye5 ye5VarO = kk0.o(245579079, x340Var4);
                        ye5VarO.g(cwl1.o0(x340Var4, 2131953431));
                        ye5VarO.g(" ");
                        int iO = ye5VarO.o(l3p1.q(x340Var4));
                        try {
                            ye5VarO.g(str3);
                            ye5VarO.k(iO);
                            af5VarP = ye5VarO.p();
                            x340Var4.r(false);
                            x340Var4.r(false);
                        } catch (Throwable th) {
                            ye5VarO.k(iO);
                            throw th;
                        }
                    } else {
                        x340Var4.i0(-791754628);
                        int size = arrayList.size();
                        x340Var4.i0(848689301);
                        ye5 ye5Var = new ye5();
                        ye5Var.g(cwl1.o0(x340Var4, 2131953431));
                        ye5Var.g(" ");
                        x340Var4.i0(848692461);
                        int iO2 = ye5Var.o(l3p1.q(x340Var4));
                        try {
                            ye5Var.g(cwl1.U(2131820601, size, new Object[]{Integer.valueOf(size)}, x340Var4));
                            ye5Var.k(iO2);
                            x340Var4.r(false);
                            af5VarP = ye5Var.p();
                            x340Var4.r(false);
                            x340Var4.r(false);
                        } catch (Throwable th2) {
                            ye5Var.k(iO2);
                            throw th2;
                        }
                    }
                    af5 af5Var = af5VarP;
                    uwr uwrVar = cbx.a;
                    uwo1.f(af5Var, (qim0) null, cbx.d(x340Var4).j, (x9h) null, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (cqs0) null, x340Var4, 1572864, 0, 3770);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    eqr0.b(0, 2, cwl1.o0(x340Var6, ((ew71) obj3).a), x340Var6, (qim0) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m861 m861Var = (m861) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG = x340Var8.g(m861Var);
                    Object objT = x340Var8.T();
                    if (zG || objT == fkj0.X) {
                        objT = new qv61(m861Var, (byte) 18);
                        x340Var8.s0(objT);
                    }
                    poo1.e(new gbx(z50.c, (Function0) objT), pex.b, yoo1.z(x340Var8), (qim0) null, 0, (String) null, (max) null, ihj.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, (vu30) null, x340Var8, 12582912, 0, 16248);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                m081 m081Var = (m081) obj;
                h081 h081Var = (h081) obj2;
                vgm vgmVar = ((p081) obj3).e;
                String str4 = m081Var.d;
                return new n081(m081Var.b, m081Var.c, str4, m081Var.e, h081Var.a, h081Var.b, str4.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq"), h081Var.c, vgm.a(vgmVar, str4));
            case 10:
                return w5p1.n((b181) obj2, (e181) obj, ((i181) obj3).g);
            case 11:
                tv80 tv80Var = (tv80) obj2;
                r961 r961Var = (r961) obj3;
                int iOrdinal = ((rn91) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                r961Var.C(new xi91(i2, tv80Var));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((dea0) obj3).g((b0k) obj, czo1.p(7));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((jg81) obj3).e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((lg81) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((ngs0) obj3).f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                Bundle bundle = (Bundle) obj;
                si81 si81Var = (si81) obj2;
                pt ptVar = (pt) obj3;
                String string = bundle.getString("username");
                Uri uri = (Uri) jhc1.t(bundle, "imageUri", Uri.class);
                String string2 = bundle.getString("displayName");
                int i3 = bundle.getInt("backgroundColor");
                Integer numValueOf3 = Integer.valueOf(i3);
                if (i3 == 0) {
                    numValueOf3 = null;
                }
                return pt.K(ptVar, si81Var, string, uri, string2, numValueOf3 != null ? new u7h(z4p1.e(numValueOf3.intValue())) : null, 48);
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int iC = l1d.C(((m4d1) obj3).a);
                    if (iC == 0) {
                        i = 2131962478;
                    } else if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i = 2131962478;
                    } else {
                        i = 2131962479;
                    }
                    int i4 = i;
                    uwr uwrVar2 = cbx.a;
                    i9p1.o(i4, 0, 0, cbx.a(x340Var10).b.c, x340Var10, k1o1.n(nim0.a));
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                y3u y3uVar = (y3u) obj3;
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j0f0 j0f0Var = (j0f0) rwq.h(y3uVar.h, x340Var12, 0).getValue();
                    if (j0f0Var == null) {
                        x340Var12.i0(-1695819417);
                    } else {
                        x340Var12.i0(-1695819416);
                        boolean zI = x340Var12.i(y3uVar);
                        Object objT2 = x340Var12.T();
                        if (zI || objT2 == fkj0.X) {
                            y52 y52Var = new y52(0, y3uVar, y3u.class, "dismiss", "dismiss()V", 0, (byte) 22);
                            x340Var12.s0(y52Var);
                            objT2 = y52Var;
                        }
                        yoi1.e(j0f0Var, (Function0) objT2, 0, x340Var12, 8);
                    }
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 19:
                dbk dbkVar = (dbk) obj3;
                return new jpg0(new rt01(new egx(((xfx) dbkVar.b).b, (byte) 5), (lo60) dbkVar.c), er81.d);
            case 20:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                u7q0 u7q0Var = ((y5q0) obj3).a;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Uri uri2 = u7q0Var.a;
                    if (uri2 == null) {
                        uri2 = Uri.EMPTY;
                    }
                    Uri uri3 = uri2;
                    uri3.getClass();
                    bmq0.a(uri3, (qim0) null, hcx.e, u7q0Var.b, u7q0Var.c, bro1.q(u7q0Var.d), 0L, false, x340Var14, 384, 194);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                d691 d691Var = (d691) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c((maa) d691Var.c.get(), new c691(d691Var.b.a), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((ybx0) obj3).c((b0k) obj, czo1.p(7));
                return rih1Var;
            case 23:
                return new b991(((h991) ((ngs0) obj3).d).c.D());
            case 24:
                return new m991(((n991) obj3).a.c.E(), ((l991) obj).a.a);
            case 25:
                return new s991(((t991) obj3).a.c.E(), ((r991) obj).a.a);
            case 26:
                return ((x991) obj3).e((v991) obj);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return f6o1.A(new kpg0(new ngs0((cd91) ((md5) obj3).b), fe91.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 28:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((kc91) obj3).c(x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                zr7.g((ef91) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj71(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
