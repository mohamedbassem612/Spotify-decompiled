package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.idj.v1.MicPermissionPageResponse;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mbj0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbj0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        ou80 ou80Var;
        ou80 ou80Var2;
        Uri uri;
        String str;
        Object obj6;
        x340 x340Var;
        lee1 lee1Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        tv80 tv80Var = null;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                w4i1 w4i1Var = (w4i1) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                obj0 obj0Var = (obj0) obj7;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var2.g(w4i1Var) : x340Var2.i(w4i1Var) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    WeakHashMap weakHashMap = osl1.x;
                    boolean zF = lhc.g(x340Var3).c.f();
                    Boolean boolValueOf = Boolean.valueOf(zF);
                    boolean zH = x340Var3.h(zF) | x340Var3.i(obj0Var);
                    Object objT = x340Var3.T();
                    if (zH || objT == fkj0.X) {
                        obj4 = objT;
                        uug0 uug0Var = new uug0(zF, obj0Var, (lnm) null);
                        x340Var3.s0(uug0Var);
                        obj4 = uug0Var;
                    }
                    obj4 = objT;
                    qxd0.t(boolValueOf, x340Var3, (vu30) obj4);
                    ldo ldoVar = obj0Var.c;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    otw.c(ldoVar, w4i1Var, (qim0) null, (ipb1) null, x340Var3, (iIntValue << 3) & 112, 12);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 1:
                tqw tqwVar = (tqw) obj3;
                ((fej0) obj7).a.invoke((cej0) obj2, tqwVar != null ? n3o1.y(tqwVar) : null);
                return rih1Var;
            case 2:
                tqw tqwVar2 = (tqw) obj3;
                ((iej0) obj7).a.invoke((gej0) obj2, tqwVar2 != null ? n3o1.y(tqwVar2) : null);
                return rih1Var;
            case 3:
                if (kej0.a[((jej0) obj2).ordinal()] == 1) {
                    ((mej0) obj7).a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                if (oej0.a[((nej0) obj2).ordinal()] == 1) {
                    ((qej0) obj7).a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                MicPermissionPageResponse micPermissionPageResponse = (MicPermissionPageResponse) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                arj0 arj0Var = (arj0) obj7;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var4.g(micPermissionPageResponse) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (!x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var5.b0();
                    return rih1Var;
                }
                gms0 gms0Var = arj0Var.k;
                drj0 drj0Var = arj0Var.h;
                i8h1 i8h1Var = (i8h1) drj0Var.b;
                bqk0 bqk0Var = (bqk0) drj0Var.c;
                if (gms0Var == gms0.d) {
                    x6h1 x6h1VarC = bqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("declined_mic_access_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = bqk0Var.c;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    if (arj0.c(micPermissionPageResponse)) {
                        x6h1 x6h1VarC2 = bqk0Var.b.c();
                        x6h1VarC2.i.add(new a7h1("declined_mic_access_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = true;
                        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                        x6h1VarC3.i.add(new a7h1("voice_data_storage_label", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC3.a();
                        k7h1 k7h1Var2 = new k7h1();
                        ((xjn) k7h1Var2).a = y6h1VarA2;
                        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                        k7h1Var2.e = bqk0Var.c;
                        i8h1Var.f(k7h1Var2.a(), (Set) null);
                    }
                } else {
                    x6h1 x6h1VarC4 = bqk0Var.b.c();
                    x6h1VarC4.i.add(new a7h1("allow_mic_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA3;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var3.e = bqk0Var.c;
                    i8h1Var.f(k7h1Var3.a(), (Set) null);
                    if (arj0.c(micPermissionPageResponse)) {
                        x6h1 x6h1VarC5 = bqk0Var.b.c();
                        x6h1VarC5.i.add(new a7h1("allow_mic_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = true;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("voice_data_storage_label", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = true;
                        y6h1 y6h1VarA4 = x6h1VarC6.a();
                        k7h1 k7h1Var4 = new k7h1();
                        ((xjn) k7h1Var4).a = y6h1VarA4;
                        ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                        k7h1Var4.e = bqk0Var.c;
                        i8h1Var.f(k7h1Var4.a(), (Set) null);
                    }
                }
                boolean zI = x340Var5.i(arj0Var);
                Object objT2 = x340Var5.T();
                if (zI || objT2 == fkj0.X) {
                    obj5 = objT2;
                    yqj0 yqj0Var = new yqj0(arj0Var, (byte) 0);
                    x340Var5.s0(yqj0Var);
                    obj5 = yqj0Var;
                }
                obj5 = objT2;
                qxd0.i(rih1Var, (iu30) obj5, x340Var5);
                mod.b(oi7.a.a(arj0Var.g), apo.r(-1985854827, new loi0(micPermissionPageResponse, arj0Var, (byte) 4), x340Var5), x340Var5, 56);
                return rih1Var;
            case 6:
                evj0 evj0Var = (evj0) obj;
                ArrayList arrayList = evj0Var.c;
                int i2 = evj0Var.a;
                if (fvj0.a[((dvj0) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                boolean z = evj0Var.d;
                r7j0 r7j0Var = ((hvj0) obj7).b;
                if (z) {
                    r7j0Var.invoke(new z1k0(i2, arrayList));
                } else {
                    r7j0Var.invoke(new s3k0(new ryb(i2, arrayList)));
                }
                return rih1Var;
            case 7:
                kvj0 kvj0Var = (kvj0) obj2;
                r7j0 r7j0Var2 = ((hvj0) obj7).b;
                if (kvj0Var instanceof jvj0) {
                    r7j0Var2.invoke(new f2k0(((jvj0) kvj0Var).a));
                } else {
                    if (!kvj0Var.equals(ivj0.a)) {
                        eg.o();
                        return null;
                    }
                    r7j0Var2.invoke(a2k0.a);
                }
                return rih1Var;
            case 8:
                if (zxj0.a[((xxj0) obj2).ordinal()] == 1) {
                    ((hvj0) obj7).b.invoke(p2k0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                dyj0 dyj0Var = (dyj0) obj;
                tqw tqwVar3 = (tqw) obj3;
                r7j0 r7j0Var3 = (r7j0) ((et90) obj7).c;
                giq0 giq0Var = dyj0Var.b;
                s3u s3uVar = dyj0Var.a;
                int iOrdinal = ((cyj0) obj2).ordinal();
                n3k0 n3k0Var = n3k0.a;
                r3u r3uVar = r3u.a;
                p3u p3uVar = p3u.a;
                k3u k3uVar = k3u.a;
                m3u m3uVar = m3u.a;
                l3u l3uVar = l3u.a;
                if (iOrdinal == 0) {
                    if (s3uVar.equals(l3uVar)) {
                        r7j0Var3.invoke(new e2k0(2, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    } else if (s3uVar instanceof s3u) {
                        if (!giq0Var.a()) {
                            r7j0Var3.invoke(new o3k0(s3uVar.a, 1, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                        }
                    } else if (s3uVar.equals(m3uVar)) {
                        if (giq0Var != giq0.b) {
                            r7j0Var3.invoke(new r2k0(1, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                        }
                    } else if (s3uVar.equals(k3uVar)) {
                        r7j0Var3.invoke(new s1k0(1, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    } else if (s3uVar.equals(p3uVar)) {
                        r7j0Var3.invoke(new i3k0(1, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    } else {
                        if (!s3uVar.equals(r3uVar)) {
                            eg.o();
                            return null;
                        }
                        r7j0Var3.invoke(n3k0Var);
                    }
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    if (s3uVar.equals(l3uVar)) {
                        r7j0Var3.invoke(new e2k0(1, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    } else if (s3uVar instanceof s3u) {
                        r7j0Var3.invoke(new o3k0(s3uVar.a, 2, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    } else if (s3uVar.equals(m3uVar)) {
                        r7j0Var3.invoke(new r2k0());
                    } else if (s3uVar.equals(k3uVar)) {
                        r7j0Var3.invoke(new s1k0());
                    } else if (s3uVar.equals(p3uVar)) {
                        r7j0Var3.invoke(new i3k0());
                    } else {
                        if (!s3uVar.equals(r3uVar)) {
                            eg.o();
                            return null;
                        }
                        r7j0Var3.invoke(n3k0Var);
                    }
                    return rih1Var;
                }
                if (iOrdinal == 2) {
                    if (s3uVar.equals(l3uVar)) {
                        r7j0Var3.invoke(new e2k0(2, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    } else if (s3uVar instanceof s3u) {
                        r7j0Var3.invoke(new o3k0(s3uVar.a, 2, null));
                    } else if (s3uVar.equals(m3uVar)) {
                        r7j0Var3.invoke(new r2k0());
                    } else if (s3uVar.equals(k3uVar)) {
                        r7j0Var3.invoke(new s1k0());
                    } else if (s3uVar.equals(p3uVar)) {
                        r7j0Var3.invoke(new i3k0());
                    } else if (s3uVar.equals(r3uVar)) {
                        r7j0Var3.invoke(n3k0Var);
                    } else {
                        eg.o();
                    }
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                p6k0 p6k0Var = (p6k0) obj7;
                mbh mbhVarA = jbh.a(f36Var, een.Q0, x340Var6, 48);
                x340 x340Var7 = x340Var6;
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var6, nim0Var);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(mbhVarA, x340Var6, y580.O0);
                nko1.H(xos0VarM, x340Var6, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                nko1.F(x340Var6);
                nko1.H(qim0VarE, x340Var6, y580.Y);
                String strO0 = cwl1.o0(x340Var6, 2131958683);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, (qim0) null, cbx.d(x340Var6).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, new px8(cbx.d(x340Var6).n.a.b, cbx.d(x340Var6).h.a.b, fc11.G(1), (mx8) null, 8), x340Var6, 1572864, 8, 698);
                if (p6k0Var.a.d) {
                    x340Var8.i0(-1239288405);
                    op71.g(x340Var6, u291.h(nim0Var, 4.0f));
                    p9p1.b(anm1.N("mixing_header_beta_tag", nim0Var), 0, ef.c(x340Var6).a().compareTo(af.e) >= 0 ? 1 : 2, x340Var6, 6, 2);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-1238799256);
                    x340Var8.r(false);
                }
                x340Var8.r(true);
                return rih1Var;
            case 11:
                tqw tqwVar4 = (tqw) obj3;
                r7j0 r7j0Var4 = ((hvj0) obj7).b;
                int iOrdinal2 = ((tak0) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    r7j0Var4.invoke(new f3k0(1, tqwVar4 != null ? n3o1.y(tqwVar4) : null));
                    return rih1Var;
                }
                if (iOrdinal2 == 1) {
                    r7j0Var4.invoke(new f3k0(2, tqwVar4 != null ? n3o1.y(tqwVar4) : null));
                    return rih1Var;
                }
                if (iOrdinal2 == 2) {
                    r7j0Var4.invoke(new f3k0(1, null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                tqw tqwVar5 = (tqw) obj3;
                r7j0 r7j0Var5 = ((hvj0) obj7).b;
                int iOrdinal3 = ((lbk0) obj2).ordinal();
                if (iOrdinal3 == 0) {
                    if (tqwVar5 != null && (ou80Var = n3o1.y(tqwVar5).a) != null) {
                        tv80Var = ou80Var.a;
                    }
                    r7j0Var5.invoke(new j3k0(tv80Var));
                    return rih1Var;
                }
                if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar5 != null && (ou80Var2 = n3o1.y(tqwVar5).a) != null) {
                    tv80Var = ou80Var2.a;
                }
                r7j0Var5.invoke(new t3k0(tv80Var));
                return rih1Var;
            case 13:
                ((odk0) obj7).a.invoke((mdk0) obj2);
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                xkk1 xkk1Var = (xkk1) obj7;
                x340 x340Var9 = (b0k) obj2;
                if (xkk1Var == null) {
                    x340Var9.i0(1350372443);
                    x340Var9.r(false);
                } else {
                    x340Var9.i0(1350372444);
                    as80 as80Var = mif1.P0;
                    cbx.a.getClass();
                    ecx ecxVarA = uwr.a();
                    up70 up70VarA = xkk1Var.a.a(vp70.c);
                    if (up70VarA == null || (str = up70VarA.a.a) == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                    uri.getClass();
                    fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var9, ltx.d, 30);
                    eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var9, 1073741872, 0, 3484);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 15:
                udk0 udk0Var = (udk0) obj2;
                tqw tqwVar6 = (tqw) obj3;
                if (udk0Var instanceof tdk0) {
                    ((jek0) obj7).a.invoke(udk0Var, tqwVar6 != null ? n3o1.y(tqwVar6) : null);
                }
                return rih1Var;
            case 16:
                tqw tqwVar7 = (tqw) obj3;
                ((sek0) obj7).a.invoke((qek0) obj2, tqwVar7 != null ? n3o1.y(tqwVar7) : null);
                return rih1Var;
            case 17:
                ffk0 ffk0Var = (ffk0) obj2;
                tqw tqwVar8 = (tqw) obj3;
                if (ffk0Var instanceof efk0) {
                    ((pfk0) obj7).a.invoke(ffk0Var, tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                }
                return rih1Var;
            case 18:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                hkc1 hkc1Var = (hkc1) obj7;
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strO1 = cwl1.o0(x340Var11, 2131958669);
                    boolean z2 = hkc1Var.b;
                    boolean zI2 = x340Var11.i(hkc1Var);
                    Object objT3 = x340Var11.T();
                    if (zI2 || objT3 == fkj0.X) {
                        obj6 = objT3;
                        z8i0 z8i0Var = new z8i0(hkc1Var, (byte) 27);
                        x340Var11.s0(z8i0Var);
                        obj6 = z8i0Var;
                    }
                    obj6 = objT3;
                    t3p1.p(0, strO1, hkc1Var.i, (Function0) obj6, x340Var11, (qim0) null, z2);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 19:
                smk0 smk0Var = (smk0) obj;
                mmk0 mmk0Var = (rmk0) obj2;
                r7j0 r7j0Var6 = (r7j0) ((res) obj7).h;
                int i3 = smk0Var.d;
                if ((mmk0Var instanceof qmk0) || (mmk0Var instanceof lmk0)) {
                    r7j0Var6.invoke(y3k0.a);
                    return rih1Var;
                }
                if (mmk0Var instanceof pmk0) {
                    if (i3 < 0) {
                        return rih1Var;
                    }
                    r7j0Var6.invoke(new b4k0(i3));
                    return rih1Var;
                }
                if (mmk0Var instanceof mmk0) {
                    int i4 = mmk0Var.a;
                    if (i3 == i4) {
                        i4 = -1;
                    }
                    r7j0Var6.invoke(new a4k0(smk0Var.b, false, i4));
                    return rih1Var;
                }
                if ((mmk0Var instanceof nmk0) || (mmk0Var instanceof omk0)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                ((evm0) obj7).c.invoke((ebt0) obj2);
                return rih1Var;
            case 21:
                ((fvm0) obj7).c.invoke((ebt0) obj2);
                return rih1Var;
            case 22:
                ((lvm0) obj7).a.invoke((ebt0) obj2);
                return rih1Var;
            case 23:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var12 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var12.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    k2r0.c(6, apo.r(-675608856, new loi0((t1n0) obj7, vu30Var, (byte) 18), x340Var13), x340Var13);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (p3v.b(((i2c) obj).d(), 160.0f) < 0) {
                    x340Var = x340Var14;
                    x340Var.i0(1814058707);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(x340Var).h;
                } else {
                    x340Var = x340Var14;
                    x340Var.i0(1814059919);
                    uwr uwrVar3 = cbx.a;
                    lee1Var = cbx.d(x340Var).e;
                }
                x340Var.r(false);
                zma1 zma1VarA = zma1.a(lee1Var.a, ((xex) ((gmt) zex.a.c).b).i, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
                u5n0 u5n0Var = (u5n0) obj7;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var14, 0);
                x340 x340Var15 = x340Var14;
                int iHashCode2 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM2 = x340Var15.m();
                qim0 qim0VarE2 = zr7.E(x340Var14, nim0Var);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(mbhVarA2, x340Var14, y580.O0);
                nko1.H(xos0VarM2, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE2, x340Var14, y580.Y);
                String str2 = u5n0Var.b;
                se11 se11Var = lzj.a;
                ye5 ye5Var = new ye5();
                nh40 nh40Var = new nh40(se11.b(lzj.a, str2));
                while (nh40Var.hasNext()) {
                    mbh0 mbh0Var = (mbh0) nh40Var.next();
                    ye5Var.g(str2.substring(i, ((rr80) mbh0Var.b()).a));
                    int iO = ye5Var.o(zma1VarA);
                    try {
                        ye5Var.g((String) mbh0Var.a().get(1));
                        ye5Var.k(iO);
                        i = ((rr80) mbh0Var.b()).b + 1;
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                }
                if (i < str2.length()) {
                    ye5Var.g(str2.substring(i));
                }
                af5 af5VarP = ye5Var.p();
                uwr uwrVar4 = cbx.a;
                uwo1.d(af5VarP, cbx.a(x340Var14).b.a, anm1.N("QuizCardTitle", nim0Var), lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var14, 0, 0, 4080);
                x340Var16.r(true);
                return rih1Var;
            case 25:
                wto wtoVar = (wto) obj;
                p1f0 p1f0Var = ((can0) obj7).f;
                wp20 wp20Var = (wp20) p1f0Var.a;
                llj0 llj0Var = new llj0(yj20.e, (iqy) null, (Function0) null, new blj0(0, new vjj0(new j9n0(wp20Var, wtoVar.a, (byte) 2)), new vjj0(new j9n0(wp20Var, rcm.a, (byte) 1)), (vjj0) null, (vjj0) null, (vjj0) null, new klj0(false, new vjj0(new ban0(wp20Var, wtoVar))), (vjj0) null, (vjj0) null, 441), (hlj0) null, new vjj0(new ban0(wtoVar, wp20Var)), (vjj0) null, ((Context) wp20Var.a).getString(2131959054), new flj0(new clj0(3), 1), new jlj0(510, (String) null, false, false, false), lx50.a, 18142);
                loi0 loi0Var = new loi0(p1f0Var, (d0r) obj2, (byte) 20);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new mlj0(llj0Var, (vjj0) null, (up11) null, loi0Var, yon1.G1("PRERELEASE_MUSIC_VIDEO", "prerelease/music-video", 1561, "prerelease"), 1, false, (xe01) null, 3614);
            case 26:
                ((Boolean) obj2).getClass();
                ((dp60) ((kqi0) obj7).d).a(true);
                return Boolean.TRUE;
            case 27:
                uhn0 uhn0Var = (whn0) obj2;
                abh0 abh0Var = ((yhn0) obj7).a;
                if (uhn0Var instanceof uhn0) {
                    abh0Var.invoke(uhn0Var.a);
                    return rih1Var;
                }
                if (uhn0Var instanceof thn0) {
                    abh0Var.invoke((Object) null);
                    return rih1Var;
                }
                if (uhn0Var.equals(vhn0.a)) {
                    abh0Var.invoke((Object) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 28:
                xxr0 xxr0Var = (xxr0) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? x340Var17.g(xxr0Var) : x340Var17.i(xxr0Var) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    otw.c((tyq) obj7, xxr0Var.a, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            default:
                tqw tqwVar9 = (tqw) obj3;
                lzn0 lzn0Var = ((fkn0) obj7).a;
                vvm1 vvm1Var = ((ekn0) obj).b;
                if (!((dkn0) obj2).equals(dkn0.a)) {
                    eg.o();
                    return null;
                }
                if (!(vvm1Var instanceof bkn0)) {
                    return rih1Var;
                }
                if (tqwVar9 != null) {
                    lzn0Var.a(fkn0.e(((bkn0) vvm1Var).c), n3o1.y(tqwVar9), (Bundle) null);
                    return rih1Var;
                }
                lzn0Var.h(fkn0.e(((bkn0) vvm1Var).c));
                return rih1Var;
        }
    }
}
