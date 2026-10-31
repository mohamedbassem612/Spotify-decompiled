package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vs31 extends hab0 implements zu30 {
    public static final vs31 N0;
    public static final vs31 O0;
    public static final vs31 P0;
    public static final vs31 Q0;
    public static final vs31 R0;
    public static final vs31 S0;
    public static final vs31 T0;
    public static final vs31 U0;
    public static final vs31 V0;
    public static final vs31 W0;
    public static final vs31 X;
    public static final vs31 X0;
    public static final vs31 Y;
    public static final vs31 Y0;
    public static final vs31 Z;
    public static final vs31 Z0;
    public static final vs31 a1;
    public static final vs31 b;
    public static final vs31 b1;
    public static final vs31 c;
    public static final vs31 c1;
    public static final vs31 d;
    public static final vs31 d1;
    public static final vs31 e;
    public static final vs31 e1;
    public static final vs31 f;
    public static final vs31 g;
    public static final vs31 h;
    public static final vs31 i;
    public static final vs31 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new vs31(i2, (byte) 0);
        c = new vs31(i2, (byte) 1);
        d = new vs31(i2, (byte) 2);
        e = new vs31(i2, (byte) 3);
        f = new vs31(i2, (byte) 4);
        g = new vs31(i2, (byte) 5);
        h = new vs31(i2, (byte) 6);
        i = new vs31(i2, (byte) 7);
        t = new vs31(i2, (byte) 8);
        X = new vs31(i2, (byte) 9);
        Y = new vs31(i2, (byte) 10);
        Z = new vs31(i2, (byte) 11);
        N0 = new vs31(i2, (byte) 12);
        O0 = new vs31(i2, (byte) 13);
        P0 = new vs31(i2, (byte) 14);
        Q0 = new vs31(i2, (byte) 15);
        R0 = new vs31(i2, (byte) 16);
        S0 = new vs31(i2, (byte) 17);
        T0 = new vs31(i2, (byte) 18);
        U0 = new vs31(i2, (byte) 19);
        V0 = new vs31(i2, (byte) 20);
        W0 = new vs31(i2, (byte) 21);
        X0 = new vs31(i2, (byte) 22);
        Y0 = new vs31(i2, (byte) 23);
        Z0 = new vs31(i2, (byte) 24);
        a1 = new vs31(i2, (byte) 25);
        b1 = new vs31(i2, (byte) 26);
        c1 = new vs31(i2, (byte) 27);
        d1 = new vs31(i2, (byte) 28);
        e1 = new vs31(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs31(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        String str;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        e251 e251Var = e251.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                ((Number) obj4).intValue();
                return rih1Var;
            case 1:
                return null;
            case 2:
                hu31 hu31Var = (hu31) obj3;
                zt31 zt31Var = (zt31) obj4;
                y6h1 y6h1Var = ((j5l0) obj).a;
                ftv ftvVar = ((fu31) obj2).b;
                if (zt31Var instanceof vt31) {
                    return null;
                }
                if (zt31Var instanceof xt31) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else if (zt31Var instanceof st31) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else if (zt31Var instanceof ut31) {
                    w7h1Var = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else if (zt31Var instanceof tt31) {
                    w7h1Var = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else if (zt31Var instanceof rt31) {
                    String str2 = ftvVar.b;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", str2 != null ? str2 : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else {
                    if (zt31Var instanceof wt31) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        String str3 = ftvVar.b;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                    }
                    if (!(zt31Var instanceof yt31)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    uiw0 uiw0Var = hu31Var.e;
                    siw0 siw0Var = uiw0Var instanceof siw0 ? (siw0) uiw0Var : null;
                    Integer numValueOf = siw0Var != null ? Integer.valueOf((int) siw0Var.c) : null;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf != null ? strValueOf : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 3:
                ((Number) obj3).intValue();
                return new h5l0((r6h1) obj4);
            case 4:
                h5l0 h5l0Var = (h5l0) obj;
                r6h1 r6h1Var = h5l0Var.a;
                y6h1 y6h1Var2 = h5l0Var.b;
                int iOrdinal = ((s841) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("save_and_continue_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 5:
                r6h1 r6h1Var2 = (r6h1) obj4;
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                ck3 ck3Var = ((s941) obj).a;
                if (ck3Var instanceof ck3) {
                    str = ck3Var.a;
                } else {
                    if (!(ck3Var instanceof bk3)) {
                        eg.o();
                        return null;
                    }
                    str = "spotify:collection";
                }
                return new zwl0(numValueOf2, str, r6h1Var2);
            case 6:
                zwl0 zwl0Var = (zwl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), zwl0Var.b, zwl0Var.a, System.currentTimeMillis());
            case 7:
                ((Number) obj3).intValue();
                return new qkl0((r6h1) obj4);
            case 8:
                qkl0 qkl0Var = (qkl0) obj;
                String str4 = ((bc41) obj2).b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str4 != null ? str4 : "")), qkl0Var.b, qkl0Var.a, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                return new rkl0((r6h1) obj4);
            case 10:
                rkl0 rkl0Var = (rkl0) obj;
                dh41 dh41Var = (dh41) obj2;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", dj20.e(dh41Var.a, dh41Var.b))), rkl0Var.b, rkl0Var.a, System.currentTimeMillis());
            case 11:
                ((Number) obj3).intValue();
                return new jkl0((r6h1) obj4);
            case 12:
                jkl0 jkl0Var = (jkl0) obj;
                hh41 hh41Var = (hh41) obj2;
                if (((fh41) obj4).equals(fh41.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:page-match:outbound-scan:".concat(hh41Var.a))), jkl0Var.b, jkl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 13:
                ((Number) obj3).intValue();
                return new s9l0(((kl41) obj).a, (r6h1) obj4);
            case 14:
                s9l0 s9l0Var = (s9l0) obj;
                if (((ul41) obj4).equals(ol41.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), s9l0Var.b, s9l0Var.a, System.currentTimeMillis());
                }
                return null;
            case 15:
                return new njl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 16:
                njl0 njl0Var = (njl0) obj;
                fwh fwhVar = (hwh) obj4;
                r6h1 r6h1Var3 = njl0Var.a;
                y6h1 y6h1Var3 = njl0Var.b;
                if (fwhVar instanceof fwh) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("companion_content_items", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
                    String str5 = fwhVar.a;
                    x6h1 x6h1VarC6 = y6h1VarA3.c();
                    x6h1VarC6.i.add(new a7h1("image_item", (String) null, 0, str5, (String) null));
                    x6h1VarC6.j = true;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(fwhVar instanceof gwh)) {
                        eg.o();
                        return null;
                    }
                    if (!((gwh) fwhVar).a) {
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("companion_content_items", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var3;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj3).intValue();
                return new e3m0((r6h1) obj4);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                e3m0 e3m0Var = (e3m0) obj;
                nu41 nu41Var = (nu41) obj4;
                r6h1 r6h1Var4 = e3m0Var.a;
                y6h1 y6h1Var4 = e3m0Var.b;
                mn41 mn41Var = new mn41((ru41) obj3, (byte) 3);
                if (nu41Var instanceof mu41) {
                    w7h1Var4 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(nu41Var instanceof ku41)) {
                        if (nu41Var instanceof lu41) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    ku41 ku41Var = (ku41) nu41Var;
                    boolean z = ku41Var.b;
                    float f2 = ku41Var.a;
                    if (z) {
                        Integer num = (Integer) mn41Var.invoke(Float.valueOf(f2));
                        z7h1 z7h1Var2 = new z7h1("drag", 1, b7xVar);
                        String strValueOf2 = String.valueOf(num.intValue());
                        w7h1Var4 = new w7h1("", "", z7h1Var2, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf2 != null ? strValueOf2 : "")), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                    } else {
                        Integer num2 = (Integer) mn41Var.invoke(Float.valueOf(f2));
                        z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                        String strValueOf3 = String.valueOf(num2.intValue());
                        w7h1Var4 = new w7h1("", "", z7h1Var3, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf3 != null ? strValueOf3 : "")), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                    }
                }
                return w7h1Var4;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return new lhl0();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x6h1 x6h1VarC8 = ((lhl0) obj).a.c();
                x6h1VarC8.i.add(new a7h1("search_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA4 = x6h1VarC8.a();
                String str6 = nik1.z1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                return new oyl0(new qyl0(r6h1.c));
            case 23:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = r6h1.c;
                return new vuk0(new wuk0());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                r6h1 r6h1Var6 = r6h1.c;
                return new suk0();
            case 25:
                ((Number) obj3).intValue();
                return new k8l0(new h7l0((byte) 13));
            case 26:
                i251 i251Var = (i251) obj4;
                y6h1 y6h1Var5 = ((k8l0) obj).a;
                if (i251Var instanceof f251) {
                    x6h1 x6h1VarC9 = y6h1Var5.c();
                    x6h1VarC9.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC9.a();
                    String str7 = ((f251) i251Var).a;
                    return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", str7 != null ? str7 : "")), y6h1VarA5, r6h1.c, System.currentTimeMillis());
                }
                if (i251Var instanceof g251) {
                    return null;
                }
                if (!i251Var.equals(e251Var)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC10 = y6h1Var5.c();
                x6h1VarC10.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
            case 27:
                t8l0 t8l0Var = (t8l0) obj;
                i251 i251Var2 = (i251) obj4;
                g5l0 g5l0Var = t8l0Var.b;
                y6h1 y6h1Var6 = t8l0Var.a;
                if (i251Var2 instanceof f251) {
                    x6h1 x6h1VarC11 = y6h1Var6.c();
                    x6h1VarC11.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC11.a();
                    String str8 = ((f251) i251Var2).a;
                    return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", str8 != null ? str8 : "")), y6h1VarA6, g5l0Var.b, System.currentTimeMillis());
                }
                if (i251Var2 instanceof g251) {
                    return null;
                }
                if (!i251Var2.equals(e251Var)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC12 = y6h1Var6.c();
                x6h1VarC12.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC12.a(), g5l0Var.b, System.currentTimeMillis());
            case 28:
                ((Number) obj3).intValue();
                return new v4l0((r6h1) obj4);
            default:
                v4l0 v4l0Var = (v4l0) obj;
                f451 f451Var = (f451) obj2;
                ncv ncvVar = (vcv) obj4;
                r6h1 r6h1Var7 = v4l0Var.a;
                y6h1 y6h1Var7 = v4l0Var.b;
                if (ncvVar instanceof ncv) {
                    String str9 = ncvVar.a;
                    if (u890.j(str9, f451Var.a) || str9.length() <= 0) {
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var7.c();
                    x6h1VarC13.i.add(new a7h1("text_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC13.a(), r6h1Var7, System.currentTimeMillis());
                } else {
                    if (!(ncvVar instanceof tcv)) {
                        return null;
                    }
                    x6h1 x6h1VarC14 = y6h1Var7.c();
                    x6h1VarC14.i.add(new a7h1("sort_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), r6h1Var7, System.currentTimeMillis());
                }
                return w7h1Var5;
        }
    }
}
