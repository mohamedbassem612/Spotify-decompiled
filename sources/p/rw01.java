package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rw01 extends hab0 implements zu30 {
    public static final rw01 N0;
    public static final rw01 O0;
    public static final rw01 P0;
    public static final rw01 Q0;
    public static final rw01 R0;
    public static final rw01 S0;
    public static final rw01 T0;
    public static final rw01 U0;
    public static final rw01 V0;
    public static final rw01 W0;
    public static final rw01 X;
    public static final rw01 X0;
    public static final rw01 Y;
    public static final rw01 Y0;
    public static final rw01 Z;
    public static final rw01 Z0;
    public static final rw01 a1;
    public static final rw01 b;
    public static final rw01 b1;
    public static final rw01 c;
    public static final rw01 c1;
    public static final rw01 d;
    public static final rw01 d1;
    public static final rw01 e;
    public static final rw01 e1;
    public static final rw01 f;
    public static final rw01 g;
    public static final rw01 h;
    public static final rw01 i;
    public static final rw01 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new rw01(i2, (byte) 0);
        c = new rw01(i2, (byte) 1);
        d = new rw01(i2, (byte) 2);
        e = new rw01(i2, (byte) 3);
        f = new rw01(i2, (byte) 4);
        g = new rw01(i2, (byte) 5);
        h = new rw01(i2, (byte) 6);
        i = new rw01(i2, (byte) 7);
        t = new rw01(i2, (byte) 8);
        X = new rw01(i2, (byte) 9);
        Y = new rw01(i2, (byte) 10);
        Z = new rw01(i2, (byte) 11);
        N0 = new rw01(i2, (byte) 12);
        O0 = new rw01(i2, (byte) 13);
        P0 = new rw01(i2, (byte) 14);
        Q0 = new rw01(i2, (byte) 15);
        R0 = new rw01(i2, (byte) 16);
        S0 = new rw01(i2, (byte) 17);
        T0 = new rw01(i2, (byte) 18);
        U0 = new rw01(i2, (byte) 19);
        V0 = new rw01(i2, (byte) 20);
        W0 = new rw01(i2, (byte) 21);
        X0 = new rw01(i2, (byte) 22);
        Y0 = new rw01(i2, (byte) 23);
        Z0 = new rw01(i2, (byte) 24);
        a1 = new rw01(i2, (byte) 25);
        b1 = new rw01(i2, (byte) 26);
        c1 = new rw01(i2, (byte) 27);
        d1 = new rw01(i2, (byte) 28);
        e1 = new rw01(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw01(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var2 = null;
        switch (b2) {
            case 0:
                uvl0 uvl0Var = (uvl0) obj;
                qw01 qw01Var = (qw01) obj2;
                if (((pw01) obj4).equals(pw01.a)) {
                    return uvl0Var.a(qw01Var.a);
                }
                eg.o();
                return null;
            case 1:
                return null;
            case 2:
                nx01 nx01Var = (nx01) obj;
                ((Number) obj3).intValue();
                return new hnl0(Integer.valueOf(nx01Var.c), nx01Var.a, (r6h1) obj4);
            case 3:
                hnl0 hnl0Var = (hnl0) obj;
                nx01 nx01Var2 = (nx01) obj2;
                if (px01.a[((mx01) obj4).ordinal()] == 1) {
                    String str = nx01Var2.a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), hnl0Var.b, hnl0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var2;
            case 4:
                return new wgl0(Integer.valueOf(((Number) obj3).intValue()), (String) obj, (r6h1) obj4);
            case 5:
                wgl0 wgl0Var = (wgl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((wx01) obj4).a)), wgl0Var.b, wgl0Var.a, System.currentTimeMillis());
            case 6:
                j6m0 j6m0Var = (j6m0) obj;
                g211 g211Var = (g211) obj3;
                d211 d211Var = (d211) obj4;
                y6h1 y6h1Var = j6m0Var.a;
                r6h1 r6h1Var = j6m0Var.b.a;
                String str2 = ((f211) obj2).e;
                if (d211Var.equals(c211.a)) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else if (d211Var.equals(y111.a)) {
                    int iC = l1d.C(g211Var.b);
                    if (iC == 0) {
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str2 != null ? str2 : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str2 != null ? str2 : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                    }
                } else {
                    if (!(d211Var instanceof z111)) {
                        return null;
                    }
                    if (j211.a[l1d.C(g211Var.c)] == 1) {
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str2 != null ? str2 : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                    } else {
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2 != null ? str2 : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 7:
                ((Number) obj3).intValue();
                return new erl0((r6h1) obj4);
            case 8:
                erl0 erl0Var = (erl0) obj;
                x6h1 x6h1VarC = erl0Var.b.c();
                x6h1VarC.i.add(new a7h1("citation_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((z411) obj4).a)), x6h1VarC.a(), erl0Var.a, System.currentTimeMillis());
            case 9:
                w2m0 w2m0Var = (w2m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:site:wwwreferrals")), w2m0Var.a, w2m0Var.b.b, System.currentTimeMillis());
            case 10:
                wtl0 wtl0Var = (wtl0) obj;
                pey0 pey0Var = (pey0) obj2;
                f700 f700Var = (f700) obj4;
                y6h1 y6h1Var2 = wtl0Var.b;
                if (f700Var.equals(cxz.a)) {
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), wtl0Var.a, System.currentTimeMillis());
                }
                if (!f700Var.equals(sxz.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = y6h1Var2.c();
                x6h1VarC3.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pey0Var.e)), x6h1VarC3.a(), wtl0Var.a, System.currentTimeMillis());
            case 11:
                ((Number) obj3).intValue();
                return new dml0(new fjl0((r6h1) obj4, (byte) 5));
            case 12:
                ((Number) obj3).intValue();
                return new r9l0(((ka11) obj).a, (r6h1) obj4);
            case 13:
                r9l0 r9l0Var = (r9l0) obj;
                if (((bxz) obj4).equals(bxz.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), r9l0Var.b, r9l0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 14:
                return new aul0(Integer.valueOf(((Number) obj3).intValue()), ((cd11) obj).c, (r6h1) obj4);
            case 15:
                aul0 aul0Var = (aul0) obj;
                x6h1 x6h1VarC4 = aul0Var.b.c();
                x6h1VarC4.i.add(new a7h1("share_reflection_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC4.a(), aul0Var.a, System.currentTimeMillis());
            case 16:
                onl0 onl0Var = (onl0) obj;
                if (((be11) obj4).equals(be11.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), onl0Var.a, onl0Var.b.c.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 17:
                ((Number) obj3).intValue();
                return new bul0();
            case 18:
                return null;
            case 19:
                ((Number) obj3).intValue();
                return new sil0((r6h1) obj4);
            case 20:
                sil0 sil0Var = (sil0) obj;
                int iC2 = l1d.C(((ii11) obj3).a.d);
                if (iC2 == 0) {
                    return sil0Var.e();
                }
                if (iC2 == 1) {
                    return sil0Var.h();
                }
                if (iC2 == 2) {
                    return sil0Var.i();
                }
                eg.o();
                return null;
            case 21:
                ((Number) obj3).intValue();
                return new pil0((r6h1) obj4);
            case 22:
                pil0 pil0Var = (pil0) obj;
                ni11 ni11Var = (ni11) obj3;
                b0g1 b0g1Var = (e0g1) obj4;
                if (b0g1Var instanceof b0g1) {
                    return pil0Var.e(Integer.valueOf((int) b0g1Var.a), Integer.valueOf((int) ni11Var.a.b));
                }
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new yil0((r6h1) obj4);
            case 24:
                l691 l691Var = (l691) obj3;
                String str3 = l691Var.a;
                fvf1 fvf1Var = l691Var.c;
                return ((yil0) obj).e(Integer.valueOf((int) fvf1Var.a), str3, Integer.valueOf((int) fvf1Var.b));
            case 25:
                ((Number) obj3).intValue();
                return new zil0((r6h1) obj4);
            case 26:
                zi11 zi11Var = (zi11) obj3;
                String str4 = zi11Var.a;
                fvf1 fvf1Var2 = zi11Var.c;
                return ((zil0) obj).e(Integer.valueOf((int) fvf1Var2.a), str4, Integer.valueOf((int) fvf1Var2.b));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                lk11 lk11Var = (lk11) obj;
                ((Number) obj3).intValue();
                return new pul0(Integer.valueOf(lk11Var.b), lk11Var.a, (r6h1) obj4);
            case 28:
                pul0 pul0Var = (pul0) obj;
                hk11 hk11Var = (hk11) obj3;
                ek11 ek11Var = (ek11) obj4;
                if (hk11Var instanceof gk11) {
                    return null;
                }
                if (hk11Var instanceof fk11) {
                    return pul0Var.a(ek11Var.a);
                }
                eg.o();
                return null;
            default:
                lk11 lk11Var2 = (lk11) obj;
                ((Number) obj3).intValue();
                return new pul0(Integer.valueOf(lk11Var2.b), lk11Var2.a, (r6h1) obj4);
        }
    }
}
