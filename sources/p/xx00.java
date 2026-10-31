package p;

import android.net.Uri;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xx00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx00(iu30 iu30Var, c950 c950Var, sp00 sp00Var) {
        super(2);
        this.a = (byte) 25;
        this.d = iu30Var;
        this.b = c950Var;
        this.c = sp00Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:163:0x048d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0498  */
    /* JADX WARN: Code duplicated, block: B:173:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:182:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:186:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:189:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:190:0x04df  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:200:0x0521  */
    /* JADX WARN: Code duplicated, block: B:205:0x0534  */
    /* JADX WARN: Code duplicated, block: B:211:0x0549  */
    /* JADX WARN: Code duplicated, block: B:219:0x0565  */
    /* JADX WARN: Code duplicated, block: B:221:0x056b  */
    /* JADX WARN: Code duplicated, block: B:222:0x056e  */
    /* JADX WARN: Code duplicated, block: B:225:0x057c  */
    /* JADX WARN: Code duplicated, block: B:227:0x058a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0591  */
    /* JADX WARN: Code duplicated, block: B:233:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:234:0x05c4  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String str;
        int i;
        boolean z;
        String str2;
        boolean z2;
        int i2;
        boolean z3;
        px3 px3Var;
        boolean z4;
        boolean z5;
        boolean zF;
        dql dqlVar;
        tb51 tb51Var;
        String string;
        boolean z6;
        PlayerState playerState;
        boolean z7;
        int i3;
        dql dqlVar2;
        List listF;
        em20 em20Var;
        em20 em20Var2;
        byte b = this.a;
        byte b2 = 9;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((zx00) obj3).f(0, ((tx00) obj4).b, b0kVar2, (iu30) obj5);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ymc0 ymc0Var = (ymc0) obj5;
                b0k b0kVar4 = (x340) b0kVar3;
                if (b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((vy00) obj3).b.a((qtc1) obj4, ymc0Var != null ? Integer.valueOf(ymc0Var.a) : null, ymc0Var != null ? ymc0Var.b : null, b0kVar4, 0);
                } else {
                    b0kVar4.b0();
                }
                return rih1Var;
            case 2:
                le10 le10Var = (le10) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                re10 re10Var = (re10) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pto1.g(le10Var, (iu30) obj5, (qim0) null, apo.r(-1764671757, new adx(le10Var, re10Var, (byte) 2), x340Var2), apo.r(725919579, new cex(re10Var, le10Var, (byte) 9), x340Var2), x340Var2, 27648);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj5;
                ven0 ven0Var = (ven0) obj4;
                lk10 lk10Var = (lk10) obj3;
                String str3 = lk10Var.e;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int iC = l1d.C(lk10Var.b);
                    if (iC == 0) {
                        x340Var4.i0(474593267);
                        boolean zI = x340Var4.i(ven0Var) | x340Var4.g(iu30Var);
                        Object objT = x340Var4.T();
                        if (zI || objT == fkj0.X) {
                            objT = new wq9(iu30Var, ven0Var, (byte) 16);
                            x340Var4.s0(objT);
                        }
                        guo1.m(lk10Var, iu30Var, (qim0) null, false, (Function0) objT, x340Var4, 0);
                        x340Var4.r(false);
                    } else if (iC == 1) {
                        x340Var4.i0(474605532);
                        guo1.n(0, str3, x340Var4, (qim0) null);
                        x340Var4.r(false);
                    } else if (iC == 2) {
                        x340Var4.i0(474609179);
                        guo1.p(str3, iu30Var, (qim0) null, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        if (iC != 3) {
                            throw p3d1.k(x340Var4, 474591541, false);
                        }
                        x340Var4.i0(1828137167);
                        guo1.k(str3, iu30Var, (qim0) null, lk10Var.f, x340Var4, 0);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                rwo1.d((vzq0) obj3, (qim0) obj4, (j2i) obj5, (b0k) obj, czo1.p(433));
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    bmq0.a(Uri.parse((String) obj3), (qim0) null, hcx.d, (String) null, (String) obj5, bro1.q((Integer) obj4), 0L, false, x340Var6, 384, 202);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((mr10) obj3).e((ve01) obj4, (String) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                tyo1.c((bro1) obj3, (Function0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                h0p1.d((o820) obj3, (Function0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                i0p1.h((k620) obj3, (c380) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                o0p1.e((m920) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                ee21 ee21Var = (ee21) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fux fuxVar = fux.c;
                    jsl jslVar = new jsl(cwl1.n0(2131964138, new Object[]{ee21Var.b}, x340Var8));
                    Object objT2 = x340Var8.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        objT2 = ktd.n(x340Var8);
                    }
                    idn0 idn0Var = (idn0) objT2;
                    pm31 pm31Var = new pm31(0);
                    boolean zI2 = x340Var8.i(ee21Var) | x340Var8.g(iu30Var2);
                    bw91 bw91Var = (bw91) obj4;
                    Object objT3 = x340Var8.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new xvy(bw91Var, iu30Var2, ee21Var, (byte) 8);
                        x340Var8.s0(objT3);
                    }
                    w0h1.a(fuxVar, jslVar, bin.v(nim0.a, idn0Var, (ga80) null, false, (String) null, pm31Var, (Function0) objT3, 12), 0L, 0L, false, x340Var8, fux.d, 56);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                m1p1.f((List) obj3, (iu30) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                p1p1.k((c380) obj3, (uny) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                b2p1.e((sp00) obj3, (ak7) obj4, (lzn0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                k0d0 k0d0Var = (k0d0) obj4;
                sh20 sh20Var = (sh20) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI3 = x340Var10.i(sh20Var) | x340Var10.i(k0d0Var);
                    Object objT4 = x340Var10.T();
                    if (zI3 || objT4 == m4cVar2) {
                        objT4 = new zf10(sh20Var, k0d0Var, (byte) 11);
                        x340Var10.s0(objT4);
                    }
                    iu30 iu30Var3 = (iu30) objT4;
                    d0r d0rVar = (d0r) x340Var10.k(gde0.a);
                    Object objT5 = x340Var10.T();
                    if (objT5 == m4cVar2) {
                        objT5 = (ak7) szq.b(d0rVar, new z77(iu30Var3, d0rVar, (byte) 4));
                        x340Var10.s0(objT5);
                    }
                    b2p1.e((sp00) obj5, (ak7) objT5, sh20Var.l, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 16:
                dm20 dm20Var = (dm20) obj;
                c910 c910Var = (c910) obj2;
                String str4 = dm20Var.n;
                kl20 kl20Var = dm20Var.c;
                String str5 = dm20Var.a;
                boolean z8 = c910Var.c;
                px3 px3Var2 = c910Var.l;
                jtl jtlVar = dm20Var.i;
                an01 an01Var = c910Var.h;
                String str6 = an01Var.a;
                String str7 = an01Var.h;
                boolean z9 = jtlVar.a;
                if (z9 && !jtlVar.a(an01Var)) {
                    str7 = null;
                }
                if (str7 == null) {
                    str7 = "";
                }
                boolean zA = z9 ? jtlVar.a(an01Var) : an01Var.p.equals(xn01.a);
                vdj1 vdj1Var = dm20Var.f;
                um20 um20VarA = vdj1Var != null ? vdj1Var.a(str7, zA) : null;
                boolean z10 = zA;
                int i4 = dm20Var.e.a;
                if (um20VarA != null) {
                    str = str7;
                    boolean z11 = um20VarA.a;
                    if (z9 || !an01Var.t) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    boolean z12 = z11;
                    if (i4 == 3 || !z12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i4 != 1 || str.length() <= 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i4 == 1 && z10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nl20 nl20Var = new nl20(z, str2, z2, i);
                    i2 = an01Var.d;
                    z3 = c910Var.g;
                    boolean z13 = c910Var.e;
                    boolean z14 = c910Var.d;
                    px3Var = px3.b;
                    if (px3Var2 == px3Var) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i2 == 3 && z13) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zF = o0c.F(i2, z14, z8);
                    if (z3) {
                        dqlVar = dql.b;
                    } else if (!z5 && !z4) {
                        dqlVar = eql.b;
                    } else if (zF || z4) {
                        dqlVar = gql.b;
                    } else {
                        dqlVar = fql.b;
                    }
                    String str8 = dm20Var.a;
                    int i5 = c910Var.i;
                    tb51Var = (tb51) obj3;
                    if (jtlVar.a(an01Var)) {
                        string = bmq0.j0(bmq0.j0(tb51Var.a.getResources().getString(2131961527), an01Var.r), an01Var.s).toString();
                    } else {
                        string = an01Var.b;
                    }
                    String str9 = an01Var.c;
                    int i6 = an01Var.d;
                    boolean z15 = c910Var.d;
                    if (z8 || px3Var2 == px3Var) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    boolean zQ = tho1.q(px3Var2, str5, dqlVar);
                    boolean z16 = c910Var.g;
                    playerState = c910Var.b;
                    if (kl20Var != kl20.t || kl20Var == kl20.Y) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (str5.equals(o4p1.o(playerState)) && !(z7 && str5.equals(playerState.contextUri()))) {
                        i3 = 3;
                    } else if (playerState.isPaused()) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    bm20 bm20Var = c910Var.m;
                    int i7 = c910Var.n;
                    Integer num = c910Var.o;
                    if (str4.length() > 0) {
                        dqlVar2 = dqlVar;
                        if (((di4) obj4).f0() != zh4.b) {
                            listF = dgb.f(str6, str4);
                        }
                        ol20 ol20Var = new ol20(str8, str6, i5, string, str9, i6, z15, z6, dqlVar2, zQ, z16, listF, i3, nl20Var, bm20Var, i7, num);
                        boolean z17 = c910Var.f;
                        em20Var = new em20(c910Var.j, c910Var.k);
                        if (kl20Var.c) {
                            em20Var2 = em20Var;
                        } else {
                            em20Var2 = null;
                        }
                        return ((xu30) obj5).invoke(dm20Var, l2p1.g(dm20Var, ol20Var, z17, um20VarA, em20Var2), c910Var.a);
                    }
                    dqlVar2 = dqlVar;
                    listF = z6x.a;
                    ol20 ol20Var2 = new ol20(str8, str6, i5, string, str9, i6, z15, z6, dqlVar2, zQ, z16, listF, i3, nl20Var, bm20Var, i7, num);
                    boolean z18 = c910Var.f;
                    em20Var = new em20(c910Var.j, c910Var.k);
                    if (kl20Var.c) {
                        em20Var2 = em20Var;
                    } else {
                        em20Var2 = null;
                    }
                    return ((xu30) obj5).invoke(dm20Var, l2p1.g(dm20Var, ol20Var2, z18, um20VarA, em20Var2), c910Var.a);
                }
                str = str7;
                if (z9) {
                    i = 1;
                } else {
                    i = 1;
                }
                boolean z19 = z11;
                if (i4 == 3) {
                    z = false;
                } else {
                    z = false;
                }
                if (i4 != 1) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (i4 == 1) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                nl20 nl20Var2 = new nl20(z, str2, z2, i);
                i2 = an01Var.d;
                z3 = c910Var.g;
                boolean z110 = c910Var.e;
                boolean z111 = c910Var.d;
                px3Var = px3.b;
                if (px3Var2 == px3Var) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i2 == 3) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                zF = o0c.F(i2, z111, z8);
                if (z3) {
                    dqlVar = dql.b;
                } else if (!z5) {
                    if (zF) {
                        dqlVar = gql.b;
                    } else {
                        dqlVar = gql.b;
                    }
                } else if (zF) {
                    dqlVar = gql.b;
                } else {
                    dqlVar = gql.b;
                }
                String str10 = dm20Var.a;
                int i8 = c910Var.i;
                tb51Var = (tb51) obj3;
                if (jtlVar.a(an01Var)) {
                    string = bmq0.j0(bmq0.j0(tb51Var.a.getResources().getString(2131961527), an01Var.r), an01Var.s).toString();
                } else {
                    string = an01Var.b;
                }
                String str11 = an01Var.c;
                int i9 = an01Var.d;
                boolean z112 = c910Var.d;
                if (z8) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                boolean zQ2 = tho1.q(px3Var2, str5, dqlVar);
                boolean z113 = c910Var.g;
                playerState = c910Var.b;
                if (kl20Var != kl20.t) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (str5.equals(o4p1.o(playerState))) {
                    if (playerState.isPaused()) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                } else if (playerState.isPaused()) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                bm20 bm20Var2 = c910Var.m;
                int i10 = c910Var.n;
                Integer num2 = c910Var.o;
                if (str4.length() > 0) {
                    dqlVar2 = dqlVar;
                    if (((di4) obj4).f0() != zh4.b) {
                        listF = dgb.f(str6, str4);
                    }
                    ol20 ol20Var3 = new ol20(str10, str6, i8, string, str11, i9, z112, z6, dqlVar2, zQ2, z113, listF, i3, nl20Var2, bm20Var2, i10, num2);
                    boolean z114 = c910Var.f;
                    em20Var = new em20(c910Var.j, c910Var.k);
                    if (kl20Var.c) {
                        em20Var2 = em20Var;
                    } else {
                        em20Var2 = null;
                    }
                    return ((xu30) obj5).invoke(dm20Var, l2p1.g(dm20Var, ol20Var3, z114, um20VarA, em20Var2), c910Var.a);
                }
                dqlVar2 = dqlVar;
                listF = z6x.a;
                ol20 ol20Var4 = new ol20(str10, str6, i8, string, str11, i9, z112, z6, dqlVar2, zQ2, z113, listF, i3, nl20Var2, bm20Var2, i10, num2);
                boolean z115 = c910Var.f;
                em20Var = new em20(c910Var.j, c910Var.k);
                if (kl20Var.c) {
                    em20Var2 = em20Var;
                } else {
                    em20Var2 = null;
                }
                return ((xu30) obj5).invoke(dm20Var, l2p1.g(dm20Var, ol20Var4, z115, um20VarA, em20Var2), c910Var.a);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                j7p1.d((r830) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                n9p1.c((iu30) obj5, (yxa0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c((sc30) obj3, (oc30) obj4, (qim0) null, (ipb1) obj5, x340Var12, 48, 4);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                zod.b((String) obj3, (c380) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                si1.f((zm30) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                lcc.i((zx30) obj3, (qim0) obj4, (iu30) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 23:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    a140 a140Var = (a140) obj4;
                    otw.c((xiz0) obj3, new tiz0(a140Var.d, false, a140Var.f, ((klz0) obj5).a), (qim0) null, (ipb1) null, x340Var14, 8, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    u540 u540Var = (u540) obj4;
                    i1o1.e((t540) obj3, u540Var.b.a, (d0r) obj5, (qim0) null, (ipb1) null, eqi.a, apo.r(-1582130087, new mp20(u540Var, (byte) 16), x340Var16), 0, (xu30) null, x340Var16, 1769472, 204);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var17 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj5;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    cgj1.n((qim0) null, apo.r(-223173459, new d720(iu30Var4, (byte) 8), x340Var18), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(-798702920, new cy00((c950) obj3, (sp00) obj4, iu30Var4, b2), x340Var18), x340Var18, 805306416, 509);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                jhc1.h((dji0) obj3, (Function0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                b0k b0kVar5 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                b0k b0kVar6 = (x340) b0kVar5;
                if (b0kVar6.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarY = voo1.y(x0d.p(lhc.g(b0kVar6).g, 32, qim0VarF), voo1.f);
                    kj50 kj50Var = (kj50) obj3;
                    tob1 tob1Var = (tob1) obj4;
                    vu30 vu30Var = (vu30) obj5;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar6, 0);
                    int iHashCode = Long.hashCode(((x340) b0kVar6).T);
                    xos0 xos0VarM = b0kVar6.m();
                    qim0 qim0VarE = zr7.E(b0kVar6, qim0VarY);
                    hzj.A.getClass();
                    if (((x340) b0kVar6).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar6.m0();
                    if (((x340) b0kVar6).S) {
                        b0kVar6.l(hmb0.t1);
                    } else {
                        b0kVar6.v0();
                    }
                    nko1.H(mbhVarA, b0kVar6, y580.O0);
                    nko1.H(xos0VarM, b0kVar6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar6, y580.R0);
                    nko1.F(b0kVar6);
                    nko1.H(qim0VarE, b0kVar6, y580.Y);
                    kj50Var.b(b0kVar6, 0);
                    if (((c380) tob1Var.getValue()).isEmpty()) {
                        b0kVar6.i0(1142629699);
                        kj50Var.a(b0kVar6, 0);
                        b0kVar6.r(false);
                    } else {
                        b0kVar6.i0(1142683856);
                        bk50 bk50Var = kj50Var.a;
                        c380<eji0> c380Var = (c380) tob1Var.getValue();
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                        for (eji0 eji0Var : c380Var) {
                            arrayList.add(new vj50(eji0Var.e, eji0Var.a, eji0Var.b, eji0Var.c, eji0Var.d));
                        }
                        boolean zI4 = b0kVar6.i(tob1Var) | b0kVar6.g(vu30Var);
                        Object objT6 = b0kVar6.T();
                        if (zI4 || objT6 == fkj0.X) {
                            objT6 = new jj50(tob1Var, vu30Var, (byte) 0);
                            b0kVar6.s0(objT6);
                        }
                        otw.c(bk50Var, new wj50(arrayList, (vu30) objT6), (qim0) null, (ipb1) null, b0kVar6, 0, 12);
                        b0kVar6.r(false);
                    }
                    b0kVar6.r(true);
                } else {
                    b0kVar6.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var19 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj5;
                xj50 xj50Var = (xj50) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    lp10 lp10Var = (lp10) obj3;
                    String str12 = xj50Var.a;
                    ap10 ap10Var = new ap10(xj50Var.b, xj50Var.c, xj50Var.d ? dp10.a : new cp10(xj50Var.e));
                    boolean zG = x340Var20.g(iu30Var5) | x340Var20.i(xj50Var);
                    Object objT7 = x340Var20.T();
                    if (zG || objT7 == fkj0.X) {
                        objT7 = new fz40(iu30Var5, xj50Var, (byte) 8);
                        x340Var20.s0(objT7);
                    }
                    otw.c(lp10Var, new fp10(str12, ap10Var, (iu30) objT7), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            default:
                x340 x340Var21 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                iu30 iu30Var6 = (iu30) obj5;
                b0a0 b0a0Var = (b0a0) ((qj0) obj4).d;
                qo50 qo50Var = (qo50) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    phx phxVar = qo50Var.d;
                    if (qo50Var.b == null || phxVar == null) {
                        x340Var22.i0(1939860429);
                        x340Var22.r(false);
                    } else {
                        x340Var22.i0(1939081058);
                        String str13 = qo50Var.b;
                        c380 c380VarA = mqo1.A(qo50Var.c);
                        int iJ = vno1.j(0.3f, qo50Var.e);
                        boolean z20 = qo50Var.f && ((no4) b0a0Var.a.get()).n();
                        boolean z21 = qo50Var.g && b0a0Var.a();
                        boolean z22 = qo50Var.h;
                        int i11 = b0a0Var.a() ? qo50Var.i : 0;
                        boolean z23 = qo50Var.j && b0a0Var.a();
                        boolean zG2 = x340Var22.g(iu30Var6);
                        Object objT8 = x340Var22.T();
                        if (zG2 || objT8 == fkj0.X) {
                            objT8 = new g850(iu30Var6, (byte) 23);
                            x340Var22.s0(objT8);
                        }
                        lrn1.i(str13, phxVar, c380VarA, iJ, z20, z21, z22, i11, z23, (Function0) objT8, (qim0) null, x340Var22, 64);
                        x340Var22.r(false);
                    }
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx00(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx00(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx00(Object obj, iu30 iu30Var, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx00(byte b, int i, Object obj, Object obj2, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx00(iu30 iu30Var, yxa0 yxa0Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 18;
        this.d = iu30Var;
        this.b = yxa0Var;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx00(tb51 tb51Var, di4 di4Var, dgb dgbVar, xu30 xu30Var) {
        super(2);
        this.a = (byte) 16;
        this.b = tb51Var;
        this.c = di4Var;
        this.d = xu30Var;
    }
}
