package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k681 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k681(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        boolean z;
        x340 x340Var;
        int i;
        Object uea1Var;
        String str;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        tv80 tv80VarU = null;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                j681 j681Var = (j681) obj;
                n681 n681Var = (n681) obj2;
                tqw tqwVar = (tqw) obj3;
                yup0 yup0Var = (yup0) obj4;
                if (n681Var.equals(l681.a)) {
                    ((m3n) yup0Var.d).invoke(j681Var.a);
                } else {
                    if (!n681Var.equals(m681.a)) {
                        eg.o();
                        return null;
                    }
                    String str2 = j681Var.d;
                    if (str2 != null) {
                        if (ihc1.y0(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            hqn1.q((lzn0) yup0Var.c, str2, tqwVar, (Bundle) null);
                        }
                    }
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = ((j681) obj4).b;
                uwr uwrVar = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, b0kVar, 0, 0, 1778);
                return rih1Var;
            case 2:
                tqw tqwVar2 = (tqw) obj3;
                Bundle bundleG = pzm.g("translation_mode_enabled", false);
                pjf0 pjf0Var = (pjf0) obj4;
                if (tqwVar2 != null) {
                    pjf0Var.a(n3o1.y(tqwVar2), bundleG);
                    return rih1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 3:
                km61 km61Var = (km61) obj;
                tv80 tv80Var = (tv80) obj3;
                vi11 vi11Var = (vi11) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    fn31.T(smo1.e(flo1.l(op71.f(), (q8n) vi11Var.f)), (o8n) null, 0, new uk71(vi11Var, km61Var, tv80Var, (lnm) null, (byte) 6), 3);
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                km61 km61Var2 = (km61) obj;
                tv80 tv80Var2 = (tv80) obj3;
                e821 e821Var = (e821) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    fn31.T(smo1.e(flo1.l(op71.f(), (q8n) e821Var.e)), (o8n) null, 0, new uk71(e821Var, km61Var2, tv80Var2, (lnm) null, (byte) 7), 3);
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 5:
                tqw tqwVar3 = (tqw) obj3;
                pcf.a(((jg81) obj4).a, jg81.f, tqwVar3 != null ? n3o1.y(tqwVar3) : null, (Bundle) null);
                return rih1Var;
            case 6:
                uvx uvxVar = (uvx) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-1186334435);
                uvx uvxVarB = uvx.b(uvxVar, ((wg81) obj4).b ? 2 : 3, (tvx) null, (p3v) null, 27);
                x340Var2.r(false);
                return uvxVarB;
            case 7:
                ((Number) obj3).intValue();
                ((ngs0) obj4).f((b0k) obj2, 0);
                return rih1Var;
            case 8:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                kiv kivVar = jv71.a;
                qim0 qim0VarI = zr7.i(nim0Var, new kk11(3, (byte) 5));
                ti81 ti81Var = (ti81) obj4;
                Uri uri = ti81Var.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                uri2.getClass();
                String str4 = ti81Var.a;
                String str5 = str4 == null ? "" : str4;
                String str6 = ti81Var.c;
                String str7 = str6 == null ? "" : str6;
                u7h u7hVar = ti81Var.d;
                if (u7hVar != null) {
                    j = u7hVar.a;
                } else {
                    uwr uwrVar2 = cbx.a;
                    j = ((yex) zex.a.d).c;
                }
                bmq0.a(uri2, qim0VarI, (hcx) null, str5, str7, j, 0L, false, b0kVar2, 0, 196);
                return rih1Var;
            case 9:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ((otn0) obj4).a(0, 3, x340Var4, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 10:
                tqw tqwVar4 = (tqw) obj3;
                if (((sk81) obj2).equals(sk81.a)) {
                    ((uk81) obj4).a.a(nik1.P3.a, cvl1.d(tqwVar4), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                fw81 fw81Var = (fw81) obj;
                tqw tqwVar5 = (tqw) obj3;
                if (((cw81) obj2) != cw81.a) {
                    eg.o();
                    return null;
                }
                if (tqwVar5 != null) {
                    tv80 tv80VarY = n3o1.y(tqwVar5);
                    rt01 rt01Var = (rt01) obj4;
                    String str8 = fw81Var.f;
                    if (str8 != null) {
                        ((lo60) rt01Var.d).a(str8, tv80VarY, (Bundle) null);
                    }
                }
                return rih1Var;
            case 12:
                ((o191) obj4).b.invoke((ebt0) obj2);
                return rih1Var;
            case 13:
                e591 e591Var = (e591) obj;
                tqw tqwVar6 = (tqw) obj3;
                if (((d591) obj2).equals(d591.a)) {
                    ((zh1) obj4).b.d(dj20.f(e591Var.a, e591Var.b, e591Var.c, e591Var.d, rg90.a), tqwVar6 != null ? n3o1.y(tqwVar6) : null, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 14:
                r591 r591Var = (r591) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var5.e(r591Var.ordinal()) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    nyx.a(2, (wux) null, apo.r(-170912751, new q081((u591) obj4, r591Var, (byte) 12), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                long j2 = ((m991) obj4).b;
                int iU = (int) jfv.u(j2, ngv.g);
                Integer numValueOf = Integer.valueOf(iU);
                if (iU <= 0) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    x340Var = x340Var7;
                    x340Var.i0(1069418990);
                    z = false;
                } else {
                    z = false;
                    x340Var = x340Var7;
                    x340Var.i0(1069418991);
                    int iIntValue3 = numValueOf.intValue();
                    tv80VarU = cwl1.U(2131820636, iIntValue3, new Object[]{Integer.valueOf(iIntValue3)}, x340Var);
                }
                x340Var.r(z);
                if (tv80VarU == null) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(1069531614);
                    int iU2 = (int) jfv.u(j2, ngv.f);
                    tv80VarU = cwl1.U(2131820637, iU2, new Object[]{Integer.valueOf(iU2)}, x340Var8);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(311590104);
                    x340Var9.r(false);
                }
                uwo1.e(tv80VarU, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var7, 0, 0, 1790);
                return rih1Var;
            case 16:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                int iOrdinal = ((s991) obj4).b.ordinal();
                if (iOrdinal == 0) {
                    i = 2131954443;
                } else if (iOrdinal == 1) {
                    i = 2131954441;
                } else if (iOrdinal == 2) {
                    i = 2131954439;
                } else if (iOrdinal == 3) {
                    i = 2131954442;
                } else {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    i = 2131954440;
                }
                uwo1.e(cwl1.o0(b0kVar3, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1790);
                return rih1Var;
            case 17:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                fns fnsVar = igu.a;
                fn31.T(smo1.e(b3s.c), (o8n) null, 0, new oy3((nl51) obj4, zBooleanValue, (lnm) null, (byte) 18), 3);
                return new it61(bool);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = o0c.d(nim0Var, irn1.o0(150, 0, (dlv) null, 6), 2);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(b0kVar4).b;
                atb1 atb1Var = (atb1) obj4;
                mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), een.P0, b0kVar4, 0);
                x340 x340Var10 = (x340) b0kVar4;
                int iHashCode = Long.hashCode(x340Var10.T);
                xos0 xos0VarM = x340Var10.m();
                qim0 qim0VarE = zr7.E(b0kVar4, qim0VarD);
                hzj.A.getClass();
                x340 x340Var11 = (x340) b0kVar4;
                if (x340Var11.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                boolean z3 = x340Var11.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar4, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf2, b0kVar4, lljVar3);
                nko1.F(b0kVar4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar4, lljVar4);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(b0kVar4).b;
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, b0kVar4, 0);
                int iHashCode2 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM2 = x340Var11.m();
                qim0 qim0VarE2 = zr7.E(b0kVar4, qim0VarF);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(jw31VarA, b0kVar4, lljVar);
                nko1.H(xos0VarM2, b0kVar4, lljVar2);
                i3a.l(iHashCode2, b0kVar4, lljVar3, b0kVar4);
                nko1.H(qim0VarE2, b0kVar4, lljVar4);
                String str9 = atb1Var.b;
                d761 d761Var = atb1Var.h;
                uwo1.e(str9, new wnb0(1.0f, true), cbx.d(b0kVar4).m, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar4, 0, 0, 1712);
                plx plxVar = plx.c;
                zov0 zov0Var = cbx.b(b0kVar4).g;
                w0h1.a(plxVar, isl.a, u291.m(nim0Var, 12.0f), cbx.a(b0kVar4).b.b, 0L, false, b0kVar4, plx.d | 48, 48);
                x340Var11.r(true);
                d761 d761Var2 = atb1Var.c;
                d761Var2.getClass();
                qgo1.f(d761Var2.g(new cjc0(1), b0kVar4, 0), (qim0) null, (a0e1) null, 2, false, (iu30) null, b0kVar4, 8, 54);
                if (d761Var != null) {
                    x340Var11.i0(1718534097);
                    qgo1.f(d761Var.g(new cjc0(2), b0kVar4, 0), (qim0) null, (a0e1) null, 2, false, (iu30) null, b0kVar4, 8, 54);
                    x340Var11.r(false);
                } else {
                    x340Var11.i0(1718692662);
                    x340Var11.r(false);
                }
                x340Var11.r(true);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                fba1 fba1Var = (fba1) obj;
                tqw tqwVar7 = (tqw) obj3;
                if (!((eba1) obj2).equals(eba1.a)) {
                    eg.o();
                    return null;
                }
                mjm mjmVar = (mjm) ((ngs0) obj4).d;
                String strM = ngs0.m(fba1Var.a);
                tv80 tv80VarY2 = tqwVar7 != null ? n3o1.y(tqwVar7) : null;
                mjmVar.a("spotify:internal:songdna:search?seedUri=" + Uri.encode(strM), tv80VarY2, (Bundle) null);
                return rih1Var;
            case 20:
                tqw tqwVar8 = (tqw) obj3;
                if (((tba1) obj2).equals(tba1.a)) {
                    ((vba1) obj4).a.invoke(tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 21:
                tqw tqwVar9 = (tqw) obj3;
                ngs0 ngs0Var = (ngs0) obj4;
                pea1 pea1Var = ((mea1) obj).a;
                if (((lea1) obj2).equals(lea1.a)) {
                    boolean z4 = pea1Var instanceof pea1;
                    if (z4) {
                        uea1Var = new vea1(pea1Var.a);
                    } else if (pea1Var instanceof nea1) {
                        uea1Var = new tea1(((nea1) pea1Var).a);
                    } else if (pea1Var instanceof oea1) {
                        oea1 oea1Var = (oea1) pea1Var;
                        uea1Var = new uea1(oea1Var.a, oea1Var.b);
                    } else {
                        eg.o();
                    }
                    xh71 xh71Var = (xh71) ngs0Var.d;
                    if (z4) {
                        str = pea1Var.a;
                    } else if (pea1Var instanceof nea1) {
                        str = ((nea1) pea1Var).a;
                    } else if (pea1Var instanceof oea1) {
                        str = ((oea1) pea1Var).a;
                    } else {
                        eg.o();
                    }
                    xh71Var.a(new wa71(str, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), mno1.h(new mmr0[]{new mmr0("song_dna.loader_type", uea1Var)}), new vm71("song_dna"), tqwVar9 != null ? n3o1.y(tqwVar9) : null, Collections.singletonList(yea1.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                ((dha1) obj4).a.invoke((aha1) obj2);
                return rih1Var;
            case 23:
                String str10 = ((jka1) obj2).a;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str10));
                    intent.addFlags(268435456);
                    ((lka1) obj4).a.startActivity(intent);
                    break;
                } catch (Exception e) {
                    n57.s("Exception in SourceChipsElementImpl for url " + str10 + ": " + e.getMessage());
                }
                return rih1Var;
            case 24:
                ((qqa1) obj4).a.invoke((pqa1) obj2);
                return rih1Var;
            case 25:
                et61 et61Var = ((ita1) obj4).a;
                int iOrdinal2 = ((gta1) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    et61Var.invoke(jsa1.a);
                    return rih1Var;
                }
                if (iOrdinal2 == 1) {
                    et61Var.invoke(ssa1.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                et61 et61Var2 = ((lva1) obj4).a;
                int iOrdinal3 = ((jva1) obj2).ordinal();
                if (iOrdinal3 == 0) {
                    et61Var2.invoke(osa1.a);
                    return rih1Var;
                }
                if (iOrdinal3 == 1) {
                    et61Var2.invoke(qsa1.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 27:
                ((wva1) obj4).a.invoke((uva1) obj2);
                return rih1Var;
            case 28:
                awa1 awa1Var = (cwa1) obj2;
                et61 et61Var3 = ((ewa1) obj4).a;
                if (awa1Var instanceof awa1) {
                    et61Var3.invoke(new isa1(awa1Var.a));
                    return rih1Var;
                }
                if (awa1Var instanceof bwa1) {
                    et61Var3.invoke(new ksa1(((bwa1) awa1Var).a));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                if (((gkb1) obj2).equals(gkb1.a)) {
                    ((hkb1) obj4).a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k681(xpw xpwVar, Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }
}
