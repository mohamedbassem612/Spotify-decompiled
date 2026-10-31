package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ah1 extends hab0 implements vu30 {
    public static final ah1 N0;
    public static final ah1 O0;
    public static final ah1 P0;
    public static final ah1 Q0;
    public static final ah1 R0;
    public static final ah1 S0;
    public static final ah1 T0;
    public static final ah1 U0;
    public static final ah1 V0;
    public static final ah1 W0;
    public static final ah1 X;
    public static final ah1 X0;
    public static final ah1 Y;
    public static final ah1 Y0;
    public static final ah1 Z;
    public static final ah1 Z0;
    public static final ah1 a1;
    public static final ah1 b;
    public static final ah1 b1;
    public static final ah1 c;
    public static final ah1 c1;
    public static final ah1 d;
    public static final ah1 d1;
    public static final ah1 e;
    public static final ah1 e1;
    public static final ah1 f;
    public static final ah1 g;
    public static final ah1 h;
    public static final ah1 i;
    public static final ah1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ah1(i2, (byte) 0);
        c = new ah1(i2, (byte) 1);
        d = new ah1(i2, (byte) 2);
        e = new ah1(i2, (byte) 3);
        f = new ah1(i2, (byte) 4);
        g = new ah1(i2, (byte) 5);
        h = new ah1(i2, (byte) 6);
        i = new ah1(i2, (byte) 7);
        t = new ah1(i2, (byte) 8);
        X = new ah1(i2, (byte) 9);
        Y = new ah1(i2, (byte) 10);
        Z = new ah1(i2, (byte) 11);
        N0 = new ah1(i2, (byte) 12);
        O0 = new ah1(i2, (byte) 13);
        P0 = new ah1(i2, (byte) 14);
        Q0 = new ah1(i2, (byte) 15);
        R0 = new ah1(i2, (byte) 16);
        S0 = new ah1(i2, (byte) 17);
        T0 = new ah1(i2, (byte) 18);
        U0 = new ah1(i2, (byte) 19);
        V0 = new ah1(i2, (byte) 20);
        W0 = new ah1(i2, (byte) 21);
        X0 = new ah1(i2, (byte) 22);
        Y0 = new ah1(i2, (byte) 23);
        Z0 = new ah1(i2, (byte) 24);
        a1 = new ah1(i2, (byte) 25);
        b1 = new ah1(i2, (byte) 26);
        c1 = new ah1(i2, (byte) 27);
        d1 = new ah1(i2, (byte) 28);
        e1 = new ah1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jC;
        ahm0 ahm0Var;
        hoj0 hoj0VarC;
        goj0 goj0VarA;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        boolean z = false;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str2 = null;
        switch (this.a) {
            case 0:
                return (yg1) obj;
            case 1:
                k1r k1rVar = (k1r) obj2;
                return new rh1((uho) obj, k1rVar instanceof i1r ? ((qh1) u890.k(k1rVar, (d0r) null, (n4r) null)).a : null, ((qh1) u890.k(k1rVar, (d0r) null, (n4r) null)).b);
            case 2:
                fj1 fj1Var = (fj1) obj;
                return Next.i(new gj1(fj1Var.a, 1, fj1Var.b, w4i1.f, ((ij1) obj2).b(), fj1Var.c, fj1Var.d, b7x.a, z6x.a, false), Effects.a(new vi1[]{new ui1(fj1Var.a)}));
            case 3:
                return new mmr0((vnb1) obj, (qp31) obj2);
            case 4:
                kl3 kl3Var = (kl3) obj2;
                return new zl1(kl3Var.b, kl3Var.c, kl3Var.e, kl3Var.d, kl3Var.f, kl3Var.g, 4);
            case 5:
                am1 am1Var = (am1) obj;
                fm1 fm1Var = (fm1) obj2;
                boolean z2 = am1Var.d;
                String str3 = am1Var.a;
                String str4 = am1Var.c;
                String str5 = fm1Var.a;
                Boolean bool = fm1Var.b;
                return new cm1(str4, str3, str5, fm1Var.c, z2, bool != null ? bool.booleanValue() : false);
            case 6:
                return (bm1) obj;
            case 7:
                vnb1 vnb1Var = (vnb1) obj;
                jo70 jo70Var = (jo70) obj2;
                return new gm1(jo70Var != null ? jo70Var.a : null, vnb1Var != null ? Boolean.valueOf(vnb1Var.a) : null);
            case 8:
                sm1 sm1Var = (sm1) obj;
                ugz ugzVar = (ugz) obj2;
                return new tm1(sm1Var.a, sm1Var.b, ugzVar.a, ugzVar.b);
            case 9:
                mu1 mu1Var = (mu1) obj;
                nu1 nu1Var = (nu1) obj2;
                nu1 nu1VarA = nu1.a(nu1Var, null, mu1Var.b, mu1Var.c, 1);
                return nu1VarA.equals(nu1Var) ? Next.j() : Next.h(nu1VarA);
            case 10:
                mu1 mu1Var2 = (mu1) obj;
                return First.b(nu1.a((nu1) obj2, null, mu1Var2.b, mu1Var2.c, 1));
            case 11:
                ww1 ww1Var = (ww1) obj2;
                mj11 mj11Var = ((vw1) obj).a;
                return mj11Var == ww1Var.b ? Next.j() : Next.h(new ww1(ww1Var.a, mj11Var));
            case 12:
                yxx yxxVar = ((afx) obj).b;
                long j = yxxVar.a;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        j = yxxVar.b;
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(j);
            case 13:
                ixx ixxVar = ((afx) obj).a.b;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    jC = ixxVar.c();
                } else if (iOrdinal2 == 1) {
                    jC = ixxVar.b();
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    jC = ixxVar.a();
                }
                return new u7h(jC);
            case 14:
                return new u7h(((afx) obj).a.c);
            case 15:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return new t72(bool2);
            case 16:
                ahm0 ahm0Var2 = (ahm0) obj;
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (ahm0Var = (ahm0) jhc1.t(bundle, "age_assurance_parental_consent_model", ahm0.class)) == null) ? ahm0Var2 : ahm0Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                td2 td2Var = (td2) obj2;
                return new ud2((uqo) obj, td2Var.a, td2Var.b, td2Var.c);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Next.h((zg2) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return First.b((zg2) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                pw2 pw2Var = (pw2) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                String str6 = pw2Var.a;
                String str7 = pw2Var.b;
                String str8 = pw2Var.c;
                if (str7 != null && (hoj0VarC = ioj0Var.c(xkk1.class, str7)) != null && (goj0VarA = hoj0VarC.a()) != null && (xkk1Var = (xkk1) goj0VarA.a) != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.b)) != null) {
                    str2 = up70VarA.a.a;
                }
                return new rw2(str6, str7, str8, str2, pw2Var.d);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (ox2) obj2;
            case 22:
                Locale locale = (Locale) ((px2) obj2).c.getValue();
                if (locale != null) {
                    return locale.toLanguageTag();
                }
                return null;
            case 23:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(225336812);
                in20 in20VarS = poo1.s(0.0f, 14);
                x340Var.r(false);
                return in20VarS;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new u7h(u7h.j);
            case 25:
                return new c63((jo70) obj, (xkk1) obj2);
            case 26:
                h63 h63Var = (h63) obj;
                g63 g63Var = (g63) obj2;
                jo70 jo70Var2 = g63Var.a;
                String str9 = jo70Var2.a;
                String str10 = jo70Var2.c;
                up70 up70VarA2 = g63Var.b.a.a(vp70.e);
                if (up70VarA2 == null || (str = up70VarA2.a.a) == null) {
                    str = "";
                }
                return new i63(h63Var.b, str9, str10, str, h63Var.a, true, g63Var.c);
            case 27:
                s63 s63Var = (s63) obj;
                i910 i910Var = (i910) obj2;
                return new t63(s63Var.a, s63Var.b, s63Var.c, s63Var.d, s63Var.e, s63Var.f, s63Var.g, s63Var.h, s63Var.i, i910Var.b, i910Var.a, i910Var.c, s63Var.k, s63Var.l, s63Var.m);
            case 28:
                z1g1 z1g1Var = (z1g1) obj2;
                if (u890.j((String) obj, "free") && z1g1Var != null && poz0.D(z1g1Var)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return new ka10((String) obj, ((Boolean) obj2).booleanValue());
        }
    }
}
