package p;

import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.promptablesection.PromptableSectionListAttributes;
import com.spotify.promptablesection.SectionError;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ewq0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ewq0(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    public final Object invoke(Object obj) {
        PromptableSectionListAttributes promptableSectionListAttributesT;
        Object s0y0Var;
        byte b = this.a;
        int i = 0;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return new df41(new ewq0((xnn0) obj, b2), new afm0((byte) 29, 2, false));
            case 1:
                return new mwq0(svq0.a, new bw91());
            case 2:
                Map map = (Map) obj;
                Object obj2 = map.get("ids");
                List list = obj2 instanceof List ? (List) obj2 : null;
                if (list != null) {
                    Object obj3 = map.get("targets");
                    List list2 = obj3 instanceof List ? (List) obj3 : null;
                    if (list2 != null) {
                        List list3 = list2;
                        df41 df41Var = j2h1.b;
                        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            Object objInvoke = df41Var.b.invoke(it.next());
                            if (objInvoke != null) {
                                arrayList.add(objInvoke);
                            }
                        }
                        List list4 = list;
                        Iterator it2 = list4.iterator();
                        Iterator it3 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(q7h.U(list4, 10), q7h.U(arrayList, 10)));
                        while (it2.hasNext() && it3.hasNext()) {
                            arrayList2.add(new kwq0((UUID) it2.next(), it3.next()));
                        }
                        Object obj4 = map.get("overlayMode");
                        svq0 svq0Var = obj4 instanceof svq0 ? (svq0) obj4 : null;
                        if (svq0Var != null) {
                            return new mwq0(svq0Var, arrayList2);
                        }
                    }
                }
                return null;
            case 3:
                return eyr0.f((wxr0) obj, j1r.a, (ayr0) null);
            case 4:
                c2s0 c2s0Var = (c2s0) obj;
                return mno1.h(new mmr0[]{new mmr0("externalState", new a2s0(c2s0Var.e, c2s0Var.f, c2s0Var.g))});
            case 5:
                wrs0 wrs0Var = (xrs0) obj;
                if (wrs0Var instanceof wrs0) {
                    return new zrs0(wrs0Var.a);
                }
                if (wrs0Var.equals(vrs0.a)) {
                    return yrs0.a;
                }
                eg.o();
                return null;
            case 6:
                eqc eqcVar = (eqc) obj;
                float fH = eqcVar.h() * 10.0f;
                char c = ' ';
                n511 n511Var = new n511(0.0f, 0.0f, Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)));
                tw4 tw4VarA = ww4.a();
                tw4VarA.p(1);
                u8s0.c(tw4VarA, n511Var.i(eqcVar.h() * w6t0.c));
                tw4VarA.e(ila0.h((((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L), n511Var), 1);
                tw4 tw4VarA2 = ww4.a();
                tw4VarA2.e(ila0.h((((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L), n511Var), 1);
                List<v6t0> list5 = w6t0.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
                for (v6t0 v6t0Var : list5) {
                    float fH2 = eqcVar.h() * v6t0Var.d;
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setColor(i);
                    float fH3 = eqcVar.h() * v6t0Var.c;
                    if (fH3 > 0.0f) {
                        paint.setShadowLayer(fH3, 0.0f, v6t0Var.b * eqcVar.h(), z4p1.G(v6t0Var.a));
                    }
                    arrayList3.add(new q9v(paint, n511Var.i(fH2), fH2 + fH));
                    c = c;
                    i = 0;
                }
                char c2 = c;
                v6t0 v6t0Var2 = w6t0.b;
                float f = v6t0Var2.d;
                long j = v6t0Var2.a;
                float fH4 = eqcVar.h() * f;
                tw4 tw4VarA3 = ww4.a();
                tw4VarA3.p(1);
                tw4VarA3.e(ila0.h((((long) Float.floatToRawIntBits(fH)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH)) << c2), n511Var), 1);
                float f2 = fH - fH4;
                tw4VarA3.e(ila0.h((((long) Float.floatToRawIntBits(f2)) << c2) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), n511Var.i(-fH4)), 1);
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setColor(z4p1.G(j));
                paint2.setShadowLayer(eqcVar.h() * v6t0Var2.c, 0.0f, eqcVar.h() * v6t0Var2.b, z4p1.G(j));
                return eqcVar.a(new tjf0(tw4VarA, tw4VarA2, arrayList3, tw4VarA3, paint2, (byte) 9));
            case 7:
                kd31 kd31Var = (kd31) obj;
                kd31Var.p(15.0f);
                kd31Var.E((-(kd31Var.T0.h() * 56.0f)) * 0.7f);
                return rih1Var;
            case 8:
                return Single.just(((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3));
            case 9:
                return ((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3);
            case 10:
                ow50 ow50Var = ((btv0) obj).a;
                b2 = ow50Var.d == 1 ? (byte) 1 : (byte) 2;
                String str = ow50Var.b;
                String str2 = ow50Var.f;
                q7t0.d.getClass();
                int iE = lfb.e(str2);
                return new jtv0(b2, iE == q7t0.e.b ? null : Integer.valueOf(iE), str);
            case 11:
                ktv0 ktv0Var = ((mtv0) obj).a;
                String str3 = ktv0Var.c;
                htv0 htv0Var = ktv0Var.o;
                htv0 htv0Var2 = ktv0Var.n;
                String str4 = ktv0Var.d;
                String str5 = ktv0Var.e;
                String str6 = ktv0Var.f;
                String str7 = ktv0Var.g;
                List<anp0> list6 = ktv0Var.j;
                ArrayList arrayList4 = new ArrayList(q7h.U(list6, 10));
                for (anp0 anp0Var : list6) {
                    arrayList4.add(new ttv0(anp0Var.a, anp0Var.b, anp0Var.c));
                }
                String str8 = ktv0Var.k;
                String str9 = htv0Var2 != null ? htv0Var2.a : null;
                String str10 = htv0Var2 != null ? htv0Var2.b.b : null;
                String str11 = htv0Var != null ? htv0Var.a : null;
                String str12 = htv0Var != null ? htv0Var.b.b : null;
                lfb lfbVar = q7t0.d;
                String str13 = ktv0Var.l;
                lfbVar.getClass();
                return new vtv0(str3, str4, str5, str6, str7, arrayList4, str8, str9, str10, str11, str12, lfb.e(str13), htv0Var2 != null ? htv0Var2.c : false, htv0Var2 != null ? htv0Var2.d : null, htv0Var != null ? htv0Var.d : null);
            case 12:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 13:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 14:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 15:
                ((View) obj).setTag(2131427776, Boolean.TRUE);
                return rih1Var;
            case 16:
                if (d8x0.a[((fk51) obj).ordinal()] == 1) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                sgx0 sgx0Var = (sgx0) obj;
                qgx0 qgx0Var = sgx0Var instanceof qgx0 ? (qgx0) sgx0Var : null;
                if (qgx0Var != null) {
                    return qgx0Var.a;
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                sgx0 sgx0Var2 = (sgx0) obj;
                rgx0 rgx0Var = sgx0Var2 instanceof rgx0 ? (rgx0) sgx0Var2 : null;
                if (rgx0Var != null) {
                    return rgx0Var.a;
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String str14 = ((pnx0) obj).c;
                if (nhc1.Z(str14, "spotify:episode:") || nhc1.Z(str14, "spotify:show:")) {
                    return str14;
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar = wsc0Var.f;
                Map map2 = kbyVar.q;
                int i2 = q0y0.a;
                String str15 = (String) map2.get("promptable_section_attributes");
                if (str15 != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str15, 0);
                        bArrDecode.getClass();
                        promptableSectionListAttributesT = PromptableSectionListAttributes.t(bArrDecode);
                    } catch (IllegalArgumentException unused) {
                        n57.e("PromptableSectionDataSource: Error parsing proto field for key 'promptable_section_attributes'");
                        promptableSectionListAttributesT = null;
                    }
                    break;
                } else {
                    promptableSectionListAttributesT = null;
                }
                pi51 pi51VarR = promptableSectionListAttributesT != null ? promptableSectionListAttributesT.r() : null;
                int i3 = pi51VarR == null ? -1 : n0y0.a[pi51VarR.ordinal()];
                if (i3 == 1) {
                    SectionError sectionErrorN = promptableSectionListAttributesT.n();
                    if (sectionErrorN == null || ihc1.y0(sectionErrorN.q())) {
                        return r0y0.a;
                    }
                    s0y0Var = new s0y0(n0y0.b[sectionErrorN.p().ordinal()] != 1 ? (byte) 1 : (byte) 2, sectionErrorN.q(), sectionErrorN.o());
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalArgumentException("Unsupported state: " + (promptableSectionListAttributesT != null ? promptableSectionListAttributesT.r() : null));
                        }
                        String strP = promptableSectionListAttributesT.p();
                        strP.getClass();
                        String str16 = !ihc1.y0(strP) ? strP : null;
                        aj51 aj51VarQ = promptableSectionListAttributesT.q();
                        String prompt = promptableSectionListAttributesT.getPrompt();
                        String strO = promptableSectionListAttributesT.o();
                        if (n0y0.c[aj51VarQ.ordinal()] != 1) {
                            hhg1.g(aj51VarQ, "Unsupported section type: ");
                            return null;
                        }
                        String str17 = kbyVar.b;
                        String str18 = kbyVar.c;
                        if (str18 == null) {
                            str18 = "";
                        }
                        String str19 = str18;
                        List list7 = wsc0Var.e;
                        ArrayList arrayList5 = new ArrayList(q7h.U(list7, 10));
                        Iterator it4 = list7.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(((zuc0) it4.next()).c);
                        }
                        return new u0y0(new k0y0(prompt, strO, str17, str19, str16, arrayList5), promptableSectionListAttributesT.getPrompt(), promptableSectionListAttributesT.o(), str16);
                    }
                    String prompt2 = promptableSectionListAttributesT.getPrompt();
                    String strP2 = promptableSectionListAttributesT.p();
                    strP2.getClass();
                    s0y0Var = new t0y0(prompt2, !ihc1.y0(strP2) ? strP2 : null);
                }
                return s0y0Var;
            case 22:
                return mno1.h(new mmr0[]{new mmr0("prompted.playlist.format.share.card.key", (Parcelable) obj)});
            case 23:
                return (Parcelable) jhc1.t((Bundle) obj, "prompted.playlist.format.share.card.key", qay0.class);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return mno1.h(new mmr0[]{new mmr0("prompted.playlist.standard.share.card.bundle.key", (Parcelable) obj)});
            case 25:
                return (Parcelable) jhc1.t((Bundle) obj, "prompted.playlist.standard.share.card.bundle.key", mby0.class);
            case 26:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 27:
                return new fuy0(ydr0.c);
            case 28:
                return new huz(rwj.r(), (byte) 10);
            default:
                return rwj.r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ewq0(int i, byte b) {
        super(i);
        this.a = b;
    }
}
