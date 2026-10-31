package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ruh1 extends hab0 implements zu30 {
    public static final ruh1 N0;
    public static final ruh1 O0;
    public static final ruh1 P0;
    public static final ruh1 Q0;
    public static final ruh1 R0;
    public static final ruh1 S0;
    public static final ruh1 T0;
    public static final ruh1 U0;
    public static final ruh1 V0;
    public static final ruh1 W0;
    public static final ruh1 X;
    public static final ruh1 X0;
    public static final ruh1 Y;
    public static final ruh1 Y0;
    public static final ruh1 Z;
    public static final ruh1 Z0;
    public static final ruh1 a1;
    public static final ruh1 b;
    public static final ruh1 b1;
    public static final ruh1 c;
    public static final ruh1 c1;
    public static final ruh1 d;
    public static final ruh1 d1;
    public static final ruh1 e;
    public static final ruh1 e1;
    public static final ruh1 f;
    public static final ruh1 g;
    public static final ruh1 h;
    public static final ruh1 i;
    public static final ruh1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new ruh1(i2, (byte) 0);
        c = new ruh1(i2, (byte) 1);
        d = new ruh1(i2, (byte) 2);
        e = new ruh1(i2, (byte) 3);
        f = new ruh1(i2, (byte) 4);
        g = new ruh1(i2, (byte) 5);
        h = new ruh1(i2, (byte) 6);
        i = new ruh1(i2, (byte) 7);
        t = new ruh1(i2, (byte) 8);
        X = new ruh1(i2, (byte) 9);
        Y = new ruh1(i2, (byte) 10);
        Z = new ruh1(i2, (byte) 11);
        N0 = new ruh1(i2, (byte) 12);
        O0 = new ruh1(i2, (byte) 13);
        P0 = new ruh1(i2, (byte) 14);
        Q0 = new ruh1(i2, (byte) 15);
        R0 = new ruh1(i2, (byte) 16);
        S0 = new ruh1(i2, (byte) 17);
        T0 = new ruh1(i2, (byte) 18);
        U0 = new ruh1(i2, (byte) 19);
        V0 = new ruh1(i2, (byte) 20);
        W0 = new ruh1(i2, (byte) 21);
        X0 = new ruh1(i2, (byte) 22);
        Y0 = new ruh1(i2, (byte) 23);
        Z0 = new ruh1(i2, (byte) 24);
        a1 = new ruh1(i2, (byte) 25);
        b1 = new ruh1(i2, (byte) 26);
        c1 = new ruh1(i2, (byte) 27);
        d1 = new ruh1(i2, (byte) 28);
        e1 = new ruh1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruh1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                frl0 frl0Var = (frl0) obj;
                luh1 luh1Var = (luh1) obj3;
                if (((juh1) obj4) instanceof duh1) {
                    return (luh1Var.c || luh1Var.d) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), frl0Var.b, frl0Var.a, System.currentTimeMillis()) : frl0Var.h();
                }
                return null;
            case 1:
                ((Number) obj3).intValue();
                return new zp80(!(((wwh1) obj2).a instanceof yk7), (r6h1) obj4);
            case 2:
                zp80 zp80Var = (zp80) obj;
                vwh1 vwh1Var = (vwh1) obj4;
                y6h1 y6h1Var = zp80Var.b.a;
                if (vwh1Var instanceof uwh1) {
                    return zp80Var.c.a("spotify:internal:bluejay-upload-pdf");
                }
                if (vwh1Var instanceof qwh1) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("remove_upload_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (vwh1Var instanceof swh1) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("upload_choose_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("upload_file", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (!(vwh1Var instanceof rwh1)) {
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("upload_cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 3:
                w6l0 w6l0Var = (n8h1) obj;
                if (w6l0Var instanceof w6l0) {
                    return w6l0Var.h();
                }
                if (w6l0Var instanceof v6l0) {
                    return ((v6l0) w6l0Var).h();
                }
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new j4l0(((tyh1) obj).a.i);
            case 5:
                tyh1 tyh1Var = (tyh1) obj2;
                y6h1 y6h1Var2 = ((j4l0) obj).a;
                int iOrdinal = ((syh1) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    String str = tyh1Var.a.g;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1.c, System.currentTimeMillis());
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                ((Number) obj3).intValue();
                return new a7l0(new txk0(((mzh1) obj).e, (byte) 17));
            case 7:
                mzh1 mzh1Var = (mzh1) obj2;
                lzh1 lzh1Var = (lzh1) obj4;
                y6h1 y6h1Var3 = ((a7l0) obj).a;
                if (lzh1Var.equals(kzh1.a)) {
                    String str2 = mzh1Var.d;
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("cta_button", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC6.a();
                    String str3 = mzh1Var.d;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                if (!lzh1Var.equals(jzh1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC7 = y6h1Var3.c();
                x6h1VarC7.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
            case 8:
                e6i1 e6i1Var = (e6i1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                z5i1 z5i1VarA = ((i6i1) obj2).a();
                t5i1 t5i1Var = z5i1VarA instanceof t5i1 ? (t5i1) z5i1VarA : null;
                return new qcl0(t5i1Var != null ? t5i1Var.a : null, e6i1Var.a, r6h1Var);
            case 9:
                qcl0 qcl0Var = (qcl0) obj;
                i6i1 i6i1Var = (i6i1) obj3;
                r5i1 r5i1Var = (r5i1) obj4;
                if (r5i1Var instanceof q5i1) {
                    z5i1 z5i1VarA2 = i6i1Var.a();
                    return z5i1VarA2 instanceof t5i1 ? qcl0Var.a(((t5i1) z5i1VarA2).a) : qcl0Var.h(((q5i1) r5i1Var).a);
                }
                if (!(r5i1Var instanceof n5i1)) {
                    return null;
                }
                x6h1 x6h1VarC8 = qcl0Var.b.c();
                x6h1VarC8.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), qcl0Var.a, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return new x2m0(((cei1) obj).b, (r6h1) obj4);
            case 11:
                x2m0 x2m0Var = (x2m0) obj;
                return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), x2m0Var.b, x2m0Var.a, System.currentTimeMillis());
            case 12:
                return new rdl0(Integer.valueOf(((Number) obj3).intValue()), ((kvi1) obj).a, (r6h1) obj4);
            case 13:
                rdl0 rdl0Var = (rdl0) obj;
                kvi1 kvi1Var = (kvi1) obj2;
                if (((ivi1) obj4).equals(ivi1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", kvi1Var.a)), rdl0Var.b, rdl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 14:
                if (obj != null) {
                    throw new ClassCastException();
                }
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((Number) obj3).intValue();
                throw null;
            case 15:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 16:
                return ((bwl0) obj).a(((svi1) obj2).a);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((wvl0) obj).a(((svi1) obj2).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                return new oxk0((r6h1) obj4);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                oxk0 oxk0Var = (oxk0) obj;
                zxi1 zxi1Var = (zxi1) obj2;
                if (((yxi1) obj4).equals(yxi1.a)) {
                    String str4 = zxi1Var.c;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), oxk0Var.b, oxk0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                return new sdl0((r6h1) obj4);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                return new egl0((r6h1) obj4);
            case 22:
                egl0 egl0Var = (egl0) obj;
                e2j1 e2j1Var = (e2j1) obj4;
                r6h1 r6h1Var2 = egl0Var.a;
                y6h1 y6h1Var4 = egl0Var.b;
                if (e2j1Var.equals(c2j1.a)) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC9.a();
                    String str5 = nik1.d0.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                }
                if (!e2j1Var.equals(d2j1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC10 = y6h1Var4.c();
                x6h1VarC10.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
            case 23:
                ((Number) obj3).intValue();
                return new agl0((r6h1) obj4);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (!((n2j1) obj4).equals(n2j1.a)) {
                    eg.o();
                }
                return null;
            case 25:
                ((Number) obj3).intValue();
                return new dgl0((r6h1) obj4);
            case 26:
                return null;
            case 27:
                h3j1 h3j1Var = (h3j1) obj;
                i3j1 i3j1Var = (i3j1) obj2;
                int iIntValue = ((Number) obj3).intValue();
                y6h1 y6h1Var5 = (y6h1) o7h.s0(((r6h1) obj4).a);
                return new z3l0(new txk0(y6h1Var5 != null ? y6h1Var5.h.b : null, h3j1Var.a, (byte) 5), h0p1.x(i3j1Var.b), Integer.valueOf(iIntValue));
            case 28:
                z3l0 z3l0Var = (z3l0) obj;
                i3j1 i3j1Var2 = (i3j1) obj3;
                f3j1 f3j1Var = (g3j1) obj4;
                String str6 = ((h3j1) obj2).a;
                if (f3j1Var instanceof c3j1) {
                    return z3l0Var.h();
                }
                if (f3j1Var instanceof d3j1) {
                    y6h1 y6h1Var6 = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI.f = "0.0.1";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.d = str6;
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "artist");
                    x6h1VarR.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(f3j1Var instanceof f3j1)) {
                        if (!(f3j1Var instanceof e3j1)) {
                            eg.o();
                        }
                        return null;
                    }
                    y6h1 y6h1Var7 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI2.f = "0.0.1";
                    x6h1VarI2.g = "22.0.0";
                    x6h1VarI2.d = str6;
                    y6h1 y6h1VarA4 = x6h1VarI2.a();
                    Collections.singletonList("artist");
                    int iW = h0p1.w(i3j1Var2.b);
                    x6h1 x6h1VarC11 = y6h1VarA4.c();
                    x6h1VarC11.i.add(new a7h1("badge_card", v8i0.g(iW), 0, (String) null, (String) null));
                    x6h1VarC11.j = true;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("learn_more_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", f3j1Var.a)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            default:
                h3j1 h3j1Var2 = (h3j1) obj;
                i3j1 i3j1Var3 = (i3j1) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                y6h1 y6h1Var8 = (y6h1) o7h.s0(((r6h1) obj4).a);
                return new z3l0(new txk0(y6h1Var8 != null ? y6h1Var8.h.b : null, h3j1Var2.a, (byte) 5), h0p1.x(i3j1Var3.b), Integer.valueOf(iIntValue2));
        }
    }
}
