package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ve21 extends hab0 implements zu30 {
    public static final ve21 N0;
    public static final ve21 O0;
    public static final ve21 P0;
    public static final ve21 Q0;
    public static final ve21 R0;
    public static final ve21 S0;
    public static final ve21 T0;
    public static final ve21 U0;
    public static final ve21 V0;
    public static final ve21 W0;
    public static final ve21 X;
    public static final ve21 X0;
    public static final ve21 Y;
    public static final ve21 Y0;
    public static final ve21 Z;
    public static final ve21 Z0;
    public static final ve21 a1;
    public static final ve21 b;
    public static final ve21 b1;
    public static final ve21 c;
    public static final ve21 c1;
    public static final ve21 d;
    public static final ve21 d1;
    public static final ve21 e;
    public static final ve21 e1;
    public static final ve21 f;
    public static final ve21 g;
    public static final ve21 h;
    public static final ve21 i;
    public static final ve21 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new ve21(i2, (byte) 0);
        c = new ve21(i2, (byte) 1);
        d = new ve21(i2, (byte) 2);
        e = new ve21(i2, (byte) 3);
        f = new ve21(i2, (byte) 4);
        g = new ve21(i2, (byte) 5);
        h = new ve21(i2, (byte) 6);
        i = new ve21(i2, (byte) 7);
        t = new ve21(i2, (byte) 8);
        X = new ve21(i2, (byte) 9);
        Y = new ve21(i2, (byte) 10);
        Z = new ve21(i2, (byte) 11);
        N0 = new ve21(i2, (byte) 12);
        O0 = new ve21(i2, (byte) 13);
        P0 = new ve21(i2, (byte) 14);
        Q0 = new ve21(i2, (byte) 15);
        R0 = new ve21(i2, (byte) 16);
        S0 = new ve21(i2, (byte) 17);
        T0 = new ve21(i2, (byte) 18);
        U0 = new ve21(i2, (byte) 19);
        V0 = new ve21(i2, (byte) 20);
        W0 = new ve21(i2, (byte) 21);
        X0 = new ve21(i2, (byte) 22);
        Y0 = new ve21(i2, (byte) 23);
        Z0 = new ve21(i2, (byte) 24);
        a1 = new ve21(i2, (byte) 25);
        b1 = new ve21(i2, (byte) 26);
        c1 = new ve21(i2, (byte) 27);
        d1 = new ve21(i2, (byte) 28);
        e1 = new ve21(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve21(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                sil0 sil0Var = (sil0) obj;
                int iC = l1d.C(((ue21) obj3).d);
                if (iC == 0) {
                    return sil0Var.e();
                }
                if (iC == 1) {
                    return sil0Var.h();
                }
                if (iC == 2) {
                    return sil0Var.i();
                }
                eg.o();
                return null;
            case 1:
                return new n2o((Context) obj2, (iu30) obj4, (byte) 1);
            case 2:
                ((Number) obj3).intValue();
                return new usk0(new bqk0(((wf21) obj).a, (byte) 10));
            case 3:
                usk0 usk0Var = (usk0) obj;
                wf21 wf21Var = (wf21) obj2;
                xf21 xf21Var = (xf21) obj3;
                if (!((vf21) obj4).equals(tf21.a)) {
                    return null;
                }
                char c2 = xf21Var.a ? (char) 2 : (char) 1;
                x6h1 x6h1VarC = usk0Var.a.c();
                if (c2 == 1) {
                    str = "keep_later";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "mark_later_as_unplayed";
                }
                x6h1VarC.i.add(new a7h1("play_button", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str2 = wf21Var.b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new avl0((r6h1) obj4);
            case 5:
                avl0 avl0Var = (avl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "https://artists.spotify.com/help/article/song-credits")), avl0Var.b, avl0Var.a, System.currentTimeMillis());
            case 6:
                return new vh((Context) obj2, (ViewGroup) obj3, (iu30) obj4);
            case 7:
                ((Number) obj3).intValue();
                return new f8l0(new h7l0(3, ((pn21) obj).b));
            case 8:
                f8l0 f8l0Var = (f8l0) obj;
                if (((on21) obj4).equals(on21.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), f8l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 9:
                return new cr21((xkk1) obj, (ydk) obj2, (m6k) obj3, (jo70) obj4);
            case 10:
                ((Number) obj3).intValue();
                return new z7l0((r6h1) obj4);
            case 11:
                z7l0 z7l0Var = (z7l0) obj;
                vx21 vx21Var = (vx21) obj4;
                y6h1 y6h1Var = z7l0Var.b;
                if (vx21Var.equals(tx21.a)) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("approve_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC2.a(), z7l0Var.a, System.currentTimeMillis());
                } else {
                    if (!vx21Var.equals(ux21.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("decline_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC3.a(), z7l0Var.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 12:
                ((Number) obj3).intValue();
                return new xpl0(new tdl0((byte) 24));
            case 13:
                k431 k431Var = (k431) obj4;
                y6h1 y6h1Var2 = ((xpl0) obj).a;
                if (k431Var instanceof j431) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(k431Var instanceof i431)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 14:
                x731 x731Var = (x731) obj;
                ((Number) obj3).intValue();
                return new b4m0(Integer.valueOf(x731Var.f.a), x731Var.a, (r6h1) obj4);
            case 15:
                b4m0 b4m0Var = (b4m0) obj;
                x731 x731Var2 = (x731) obj2;
                if (((t731) obj4).equals(t731.a)) {
                    return b4m0Var.a(x731Var2.f.b);
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new cvl0(((oc31) obj).c, (r6h1) obj4);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                cvl0 cvl0Var = (cvl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), cvl0Var.b, cvl0Var.a, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str3 = ((ne31) obj2).d;
                return str3 == null ? new z8s((byte) 6) : new ctk0(str3, r6h1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ctk0 ctk0Var = (n8h1) obj;
                me31 me31Var = (me31) obj4;
                String str4 = ((ne31) obj3).d;
                if (str4 == null) {
                    return null;
                }
                if (me31Var.equals(me31.a)) {
                    return ctk0Var.a(str4);
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                kuk0 kuk0Var = (kuk0) obj;
                cf31 cf31Var = (cf31) obj3;
                we31 we31Var = (we31) obj4;
                if (we31Var.equals(ue31.a)) {
                    return kuk0Var.a(cf31Var.i);
                }
                if (we31Var.equals(ve31.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), kuk0Var.b, kuk0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                String str5 = ((ef31) obj).a;
                return new dvl0(str5, "", str5, (r6h1) obj4);
            case 22:
                dvl0 dvl0Var = (dvl0) obj;
                ef31 ef31Var = (ef31) obj2;
                if (((df31) obj4).equals(df31.a)) {
                    return dvl0Var.a(ef31Var.a);
                }
                eg.o();
                return null;
            case 23:
                vnb1 vnb1Var = (vnb1) obj4;
                return new gf31((jo70) obj, (xkk1) obj2, (myv0) obj3, vnb1Var != null ? Boolean.valueOf(vnb1Var.a) : null);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                gg31 gg31Var = (gg31) obj;
                ((Number) obj3).intValue();
                String str6 = gg31Var.j;
                String str7 = gg31Var.b;
                ppl pplVar = gg31Var.a;
                if (pplVar instanceof wol) {
                    return new kvk0(new uvk0(pcf.d(6, str7, (String) null)), str6);
                }
                if (pplVar instanceof ppl) {
                    return new pvk0(new uvk0(pcf.d(6, str7, (String) null)), str6, pplVar.b.size() != 1 ? 1 : 2);
                }
                if (pplVar instanceof mpl) {
                    return new qvk0(new uvk0(pcf.d(6, str7, (String) null)), str6);
                }
                eg.o();
                return null;
            case 25:
                ((Number) obj).intValue();
                ((Boolean) obj2).getClass();
                ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(627331190);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = mno1.a(-2, 0, 6);
                    x340Var.s0(objT);
                }
                jfe jfeVar = (jfe) objT;
                boolean zI = x340Var.i(jfeVar);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new zw11(jfeVar, (byte) 16);
                    x340Var.s0(objT2);
                }
                qxd0.i(rih1.a, (iu30) objT2, x340Var);
                x340Var.r(false);
                return jfeVar;
            case 26:
                tk31 tk31Var = (tk31) obj;
                ((Number) obj3).intValue();
                return new b4m0(Integer.valueOf(tk31Var.f.a), tk31Var.a, (r6h1) obj4);
            case 27:
                b4m0 b4m0Var2 = (b4m0) obj;
                tk31 tk31Var2 = (tk31) obj2;
                if (((pk31) obj4).equals(pk31.a)) {
                    return b4m0Var2.a(tk31Var2.f.b);
                }
                eg.o();
                return null;
            case 28:
                gl31 gl31Var = (gl31) obj;
                ((Number) obj3).intValue();
                return new b4m0(Integer.valueOf(gl31Var.h.a), gl31Var.a, (r6h1) obj4);
            default:
                b4m0 b4m0Var3 = (b4m0) obj;
                gl31 gl31Var2 = (gl31) obj2;
                if (((dl31) obj4).equals(dl31.a)) {
                    return b4m0Var3.a(gl31Var2.h.b);
                }
                eg.o();
                return null;
        }
    }
}
