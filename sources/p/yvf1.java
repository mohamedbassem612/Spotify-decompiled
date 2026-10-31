package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import io.reactivex.rxjava3.core.Single;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yvf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvf1(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        String strA;
        int i;
        List listK;
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        String str2;
        String str3;
        byte b = this.a;
        long jLongValue = 0;
        rih1 rih1Var = rih1.a;
        boolean zBooleanValue = true;
        switch (b) {
            case 0:
                cob1 cob1Var = (cob1) obj;
                if (cob1Var == null) {
                    return null;
                }
                int iOrdinal = cob1Var.ordinal();
                if (iOrdinal == 0) {
                    return rrt0.b;
                }
                if (iOrdinal == 1) {
                    return rrt0.c;
                }
                if (iOrdinal == 2) {
                    return rrt0.a;
                }
                eg.o();
                return null;
            case 1:
                return kox0.f((kzf1) obj, (kcz0) null);
            case 2:
                return new vcg1(((dbg1) obj).a, 2);
            case 3:
                return ((jy21) obj) instanceof by21 ? new im81((zah1) null) : new gm81((zah1) null);
            case 4:
                String strH = m6i1.h((e6i1) obj);
                if (strH == null || !z6b1.b(strH) || z6b1.c(strH)) {
                    return null;
                }
                return strH;
            case 5:
                String strH2 = m6i1.h((e6i1) obj);
                if (strH2 != null && z6b1.b(strH2) && z6b1.c(strH2)) {
                    return strH2;
                }
                return null;
            case 6:
                return mno1.h(new mmr0[]{new mmr0("video.chapter.format.share.card.key", (Parcelable) obj)});
            case 7:
                return (Parcelable) jhc1.t((Bundle) obj, "video.chapter.format.share.card.key", rhj1.class);
            case 8:
                return new uhj1(z6k0.a(((cxc0) obj).f.q));
            case 9:
                return new rpj1(false);
            case 10:
                hwq hwqVar = (hwq) obj;
                j7e0 j7e0Var = hwqVar.g;
                if (!(j7e0Var instanceof j7e0)) {
                    return new bxj1(axj1.a, hwqVar);
                }
                zuc0 zuc0Var = j7e0Var.a;
                Map map = zuc0Var.g;
                tu00 tu00Var = zuc0Var.q;
                k1z k1zVar = zuc0Var.p;
                k1z k1zVar2 = k1zVar instanceof k1z ? k1zVar : null;
                String str4 = zuc0Var.c;
                int i2 = hwqVar.a;
                xkk1 xkk1VarA = tu00Var.a(xkk1.class);
                if (xkk1VarA == null || (mq70Var = xkk1VarA.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (strA = up70VarA.a.a) == null) {
                    strA = zuc0Var.a(1);
                }
                Uri uri = Uri.parse(strA);
                if (hwqVar.c) {
                    i = 3;
                } else {
                    i = hwqVar.b ? 2 : 1;
                }
                boolean zF = zuc0Var.f();
                hll hllVarA = tu00Var.a(hll.class);
                if (hllVarA == null || (listK = hllVarA.b) == null) {
                    smc0 smc0VarN = k4p1.n();
                    if (zuc0Var.c()) {
                        smc0VarN.add(ell.d);
                    }
                    if (zuc0Var.k) {
                        smc0VarN.add(ell.b);
                    }
                    listK = k4p1.k(smc0VarN);
                }
                if (listK == null) {
                    listK = z6x.a;
                }
                c380 c380VarA = mqo1.A(listK);
                String str5 = (String) map.get("title");
                if (str5 == null) {
                    str5 = zuc0Var.i;
                }
                String str6 = str5;
                String str7 = (String) map.get("subtitle");
                if (str7 != null) {
                    str = str7;
                } else {
                    Object obj2 = k1zVar2 != null ? k1zVar2.b : null;
                    if (obj2 == null) {
                        str7 = "";
                        str = str7;
                    } else {
                        str = obj2;
                    }
                }
                return new bxj1(new zwj1(str4, i2, str6, str, uri, zF, zuc0Var, i, c380VarA), hwqVar);
            case 11:
                ((View) obj).setTag(2131427776, Boolean.TRUE);
                return rih1Var;
            case 12:
                return mno1.h(new mmr0[]{new mmr0("video.content.format.share.card.key", (Parcelable) obj)});
            case 13:
                return (Parcelable) jhc1.t((Bundle) obj, "video.content.format.share.card.key", s5k1.class);
            case 14:
                dhl dhlVar = (dhl) obj;
                xid xidVar = dhlVar.f;
                ihl ihlVar = dhlVar.c;
                xid.r(xidVar, ihlVar.f, 8.0f, 4);
                dhl.b(dhlVar, ihlVar);
                return rih1Var;
            case 15:
                return n0o.f((j7l1) obj);
            case 16:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 17:
                return null;
            case 18:
                return ((uv11) obj).a;
            case 19:
                a1q a1qVarA = a1q.a((fzq) ((fzq) obj).freeze());
                vzq vzqVar = (vzq) a1qVarA.c;
                HashMap map2 = vzqVar.a;
                HashMap map3 = vzqVar.a;
                Object obj3 = map2.get("com.spotify.wear.coaching.toggle.uri");
                if (obj3 == null) {
                    str2 = null;
                } else {
                    try {
                        str2 = (String) obj3;
                    } catch (ClassCastException unused) {
                        str2 = null;
                    }
                }
                if (str2 == null || str2.length() == 0) {
                    return null;
                }
                Uri uri2 = (Uri) a1qVarA.b;
                Object obj4 = map3.get("com.spotify.wear.coaching.toggle.enabled");
                if (obj4 != null) {
                    try {
                        zBooleanValue = ((Boolean) obj4).booleanValue();
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                boolean z = zBooleanValue;
                Object obj5 = map3.get("com.spotify.wear.coaching.toggle.timestamp");
                if (obj5 != null) {
                    try {
                        jLongValue = ((Long) obj5).longValue();
                        break;
                    } catch (ClassCastException unused3) {
                    }
                }
                return new vvg(uri2, str2, z, jLongValue);
            case 20:
                a1q a1qVarA2 = a1q.a((fzq) ((fzq) obj).freeze());
                vzq vzqVar2 = (vzq) a1qVarA2.c;
                HashMap map4 = vzqVar2.a;
                HashMap map5 = vzqVar2.a;
                Object obj6 = map4.get("com.spotify.wear.workout.toggle.uri");
                if (obj6 == null) {
                    str3 = null;
                } else {
                    try {
                        str3 = (String) obj6;
                    } catch (ClassCastException unused4) {
                        str3 = null;
                    }
                }
                if (str3 == null || str3.length() == 0) {
                    return null;
                }
                Uri uri3 = (Uri) a1qVarA2.b;
                Object obj7 = map5.get("com.spotify.wear.workout.toggle.enabled");
                if (obj7 != null) {
                    try {
                        zBooleanValue = ((Boolean) obj7).booleanValue();
                        break;
                    } catch (ClassCastException unused5) {
                    }
                }
                boolean z2 = zBooleanValue;
                Object obj8 = map5.get("com.spotify.wear.workout.toggle.timestamp");
                if (obj8 != null) {
                    try {
                        jLongValue = ((Long) obj8).longValue();
                        break;
                    } catch (ClassCastException unused6) {
                    }
                }
                return new syl1(uri3, str3, z2, jLongValue);
            case 21:
                cdm1 cdm1Var = (cdm1) obj;
                return new mmr0(cdm1Var, Float.valueOf((-(Float.intBitsToFloat((int) (cdm1Var.b >> 32)) - 0.5f)) * 1.5707964f));
            case 22:
                return Single.just(((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3));
            case 23:
                return ((jy21) obj) instanceof ey21 ? new ajo(1) : new ajo(3);
            case 24:
                chy chyVar = (chy) ((mhy) obj);
                String str8 = chyVar.a;
                String str9 = chyVar.b;
                String str10 = chyVar.e;
                String str11 = chyVar.c;
                String str12 = chyVar.d;
                String str13 = chyVar.f;
                Integer num = chyVar.i;
                return new og60(str8, str9, str11, str12, str10, str13, chyVar.h, chyVar.g, num != null ? (mg60) o7h.t0(num.intValue(), mg60.b) : null);
            case 25:
                ghy ghyVar = (ghy) ((mhy) obj);
                int i3 = ghyVar.a;
                return new gbq0(i3, ghyVar.b, new ebq0(i3 == 1), ghyVar.c);
            case 26:
                ghy ghyVar2 = (ghy) ((mhy) obj);
                int i4 = ghyVar2.a;
                return new ggq0(i4, ghyVar2.b, new egq0(i4 == 1), ghyVar2.c);
            default:
                lhy lhyVar = (lhy) ((mhy) obj);
                return new zia1(lhyVar.a, lhyVar.b, lhyVar.c, lhyVar.d, lhyVar.e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvf1(int i, byte b) {
        super(i);
        this.a = b;
    }
}
