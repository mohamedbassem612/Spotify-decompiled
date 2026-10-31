package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k63 extends hab0 implements zu30 {
    public static final k63 N0;
    public static final k63 O0;
    public static final k63 P0;
    public static final k63 Q0;
    public static final k63 R0;
    public static final k63 S0;
    public static final k63 T0;
    public static final k63 U0;
    public static final k63 V0;
    public static final k63 W0;
    public static final k63 X;
    public static final k63 X0;
    public static final k63 Y;
    public static final k63 Y0;
    public static final k63 Z;
    public static final k63 Z0;
    public static final k63 a1;
    public static final k63 b;
    public static final k63 b1;
    public static final k63 c;
    public static final k63 c1;
    public static final k63 d;
    public static final k63 d1;
    public static final k63 e;
    public static final k63 e1;
    public static final k63 f;
    public static final k63 g;
    public static final k63 h;
    public static final k63 i;
    public static final k63 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new k63(i2, (byte) 0);
        c = new k63(i2, (byte) 1);
        d = new k63(i2, (byte) 2);
        e = new k63(i2, (byte) 3);
        f = new k63(i2, (byte) 4);
        g = new k63(i2, (byte) 5);
        h = new k63(i2, (byte) 6);
        i = new k63(i2, (byte) 7);
        t = new k63(i2, (byte) 8);
        X = new k63(i2, (byte) 9);
        Y = new k63(i2, (byte) 10);
        Z = new k63(i2, (byte) 11);
        N0 = new k63(i2, (byte) 12);
        O0 = new k63(i2, (byte) 13);
        P0 = new k63(i2, (byte) 14);
        Q0 = new k63(i2, (byte) 15);
        R0 = new k63(i2, (byte) 16);
        S0 = new k63(i2, (byte) 17);
        T0 = new k63(i2, (byte) 18);
        U0 = new k63(i2, (byte) 19);
        V0 = new k63(i2, (byte) 20);
        W0 = new k63(i2, (byte) 21);
        X0 = new k63(i2, (byte) 22);
        Y0 = new k63(i2, (byte) 23);
        Z0 = new k63(i2, (byte) 24);
        a1 = new k63(i2, (byte) 25);
        b1 = new k63(i2, (byte) 26);
        c1 = new k63(i2, (byte) 27);
        d1 = new k63(i2, (byte) 28);
        e1 = new k63(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k63(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        byte b2 = this.a;
        p63 p63Var = p63.a;
        o63 o63Var = o63.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                h63 h63Var = (h63) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str = h63Var.a;
                String str2 = h63Var.c;
                if (str2 == null) {
                    return new qdl0(Integer.valueOf(iIntValue), str, r6h1Var);
                }
                Integer num = h63Var.d;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-shelf-section";
                x6h1VarI.f = "6.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str2;
                x6h1VarI.c = num;
                x6h1VarI.e = null;
                y6h1 y6h1VarA = x6h1VarI.a();
                Integer num2 = h63Var.e;
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                return new qdl0(num2, str, new r6h1(arrayList, r6h1Var.b));
            case 1:
                qdl0 qdl0Var = (qdl0) obj;
                i63 i63Var = (i63) obj3;
                f63 f63Var = (f63) obj4;
                String str3 = i63Var.d;
                if (f63Var.equals(d63.a)) {
                    return qdl0Var.a(str3);
                }
                if (!f63Var.equals(e63.a)) {
                    eg.o();
                    return null;
                }
                if (i63Var.e) {
                    return i63Var.f ? qdl0Var.h(str3) : qdl0Var.i(str3);
                }
                return null;
            case 2:
                bwl0 bwl0Var = (bwl0) obj;
                t63 t63Var = (t63) obj3;
                r63 r63Var = (r63) obj4;
                String str4 = ((s63) obj2).a;
                if (r63Var instanceof q63) {
                    return bwl0Var.a(str4);
                }
                if (r63Var.equals(o63Var)) {
                    qgl0 qgl0Var = new qgl0(bwl0Var);
                    return t63Var.j ? qgl0Var.m(str4) : qgl0Var.l(str4);
                }
                if (!r63Var.equals(p63Var)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = bwl0Var.a.c();
                x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 3:
                wvl0 wvl0Var = (wvl0) obj;
                t63 t63Var2 = (t63) obj3;
                r63 r63Var2 = (r63) obj4;
                String str5 = ((s63) obj2).a;
                if (r63Var2 instanceof q63) {
                    return wvl0Var.a(str5);
                }
                if (r63Var2.equals(o63Var)) {
                    qgl0 qgl0Var2 = new qgl0(wvl0Var);
                    return t63Var2.j ? qgl0Var2.m(str5) : qgl0Var2.l(str5);
                }
                if (!r63Var2.equals(p63Var)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = wvl0Var.a.c();
                x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new pqk0(new py9((r6h1) obj4, (byte) 11));
            case 5:
                return new as0((Context) obj2, (ViewGroup) obj3, (byte) 1);
            case 6:
                ((Number) obj3).intValue();
                return new nll0((r6h1) obj4);
            case 7:
                nll0 nll0Var = (nll0) obj;
                r6h1 r6h1Var3 = nll0Var.a;
                y6h1 y6h1Var2 = nll0Var.b;
                List list = ((t93) obj3).a;
                if (!(((s93) obj4) instanceof s93)) {
                    eg.o();
                    return null;
                }
                if (list.size() == 1) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((r93) o7h.q0(list)).a)), x6h1VarC3.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var;
            case 8:
                return new qqk0(Integer.valueOf(((Number) obj3).intValue()), ((tb3) obj).b, new jpk0(new py9((r6h1) obj4, (byte) 12)));
            case 9:
                qqk0 qqk0Var = (qqk0) obj;
                tb3 tb3Var = (tb3) obj2;
                if (((sb3) obj4).equals(sb3.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", tb3Var.b)), qqk0Var.a, qqk0Var.b.c.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 11:
                ill0 ill0Var = (ill0) obj;
                uc3 uc3Var = (uc3) obj3;
                nc3 nc3Var = (nc3) obj4;
                String str6 = ((pc3) obj2).a;
                if (nc3Var != nc3.a) {
                    eg.o();
                    return null;
                }
                if (uc3Var instanceof rc3) {
                    return ((rc3) uc3Var).a ? ill0Var.k(str6) : ill0Var.h(str6);
                }
                if (uc3Var instanceof tc3) {
                    return ill0Var.e(str6);
                }
                if (uc3Var instanceof sc3) {
                    return ill0Var.i(str6);
                }
                if (uc3Var instanceof qc3) {
                    return ill0Var.l();
                }
                eg.o();
                return null;
            case 12:
                return new wc3((Context) obj2, (iu30) obj4, (byte) 0);
            case 13:
                jvl0 jvl0Var = (jvl0) obj;
                uf3 uf3Var = (uf3) obj3;
                sf3 sf3Var = (sf3) obj4;
                String str7 = ((tf3) obj2).a;
                if (sf3Var instanceof rf3) {
                    return uf3Var.e ? jvl0Var.j() : jvl0Var.a(str7);
                }
                if (sf3Var.equals(qf3.a)) {
                    qgl0 qgl0Var3 = new qgl0(jvl0Var);
                    return uf3Var.g ? qgl0Var3.m(str7) : qgl0Var3.l(str7);
                }
                eg.o();
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new tqk0(new uqk0((r6h1) obj4, (byte) 0));
            case 15:
                ((Number) obj3).intValue();
                return new fcl0((r6h1) obj4);
            case 16:
                fcl0 fcl0Var = (fcl0) obj;
                lr3 lr3Var = (lr3) obj2;
                kr3 kr3Var = (kr3) obj4;
                r6h1 r6h1Var4 = fcl0Var.a;
                y6h1 y6h1Var3 = fcl0Var.b;
                if (kr3Var instanceof ir3) {
                    if (((ir3) kr3Var).a) {
                        x6h1 x6h1VarC5 = y6h1Var3.c();
                        x6h1VarC5.i.add(new a7h1("toggle", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC5.a(), r6h1Var4, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC6 = y6h1Var3.c();
                        x6h1VarC6.i.add(new a7h1("toggle", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), x6h1VarC6.a(), r6h1Var4, System.currentTimeMillis());
                    }
                } else {
                    if (!(kr3Var instanceof jr3)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("view_followers_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", z6b1.a(lr3Var.a).concat(":followers"))), x6h1VarC7.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ut3 ut3Var = (ut3) obj4;
                y6h1 y6h1Var4 = ((krk0) obj).a;
                if (ut3Var.equals(st3.a)) {
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (ut3Var.equals(rt3.a)) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                if (ut3Var instanceof tt3) {
                    return null;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                return new mrk0((r6h1) obj4);
            case 22:
                mrk0 mrk0Var = (mrk0) obj;
                cv3 cv3Var = (cv3) obj2;
                bv3 bv3Var = (bv3) obj4;
                r6h1 r6h1Var5 = mrk0Var.a;
                y6h1 y6h1Var5 = mrk0Var.b;
                if (bv3Var.equals(av3.a)) {
                    String str8 = cv3Var.f;
                    x6h1 x6h1VarC10 = y6h1Var5.c();
                    x6h1VarC10.i.add(new a7h1("request_button", str8, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!bv3Var.equals(zu3.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var5.c();
                    x6h1VarC11.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 23:
                ((Number) obj3).intValue();
                return new v8l0();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ey3 ey3Var = (ey3) obj4;
                y6h1 y6h1Var6 = ((v8l0) obj).a;
                if (ey3Var instanceof dy3) {
                    x6h1 x6h1VarC12 = y6h1Var6.c();
                    x6h1VarC12.i.add(new a7h1("view_approved_content_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((dy3) ey3Var).a)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(ey3Var instanceof cy3)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var6.c();
                    x6h1VarC13.i.add(new a7h1("learn_more_about_explicit_content_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((cy3) ey3Var).a)), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 25:
                ork0 ork0Var = (ork0) obj;
                i04 i04Var = (i04) obj3;
                b04 b04Var = (b04) obj4;
                r6h1 r6h1Var6 = ork0Var.a;
                y6h1 y6h1Var7 = ork0Var.b;
                if (b04Var.equals(b04.a)) {
                    String uri = i04Var.getUri();
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (uri == null) {
                        uri = "";
                    }
                    w7h1Var5 = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri)), y6h1Var7, r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!b04Var.equals(b04.b)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var5 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 26:
                return new qrk0(Integer.valueOf(((Number) obj3).intValue()), ((y24) obj).a, (r6h1) obj4);
            case 27:
                return null;
            case 28:
                ((Number) obj3).intValue();
                return new trk0((r6h1) obj4);
            default:
                return null;
        }
    }
}
