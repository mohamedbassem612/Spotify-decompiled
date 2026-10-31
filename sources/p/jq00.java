package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jq00 extends hab0 implements zu30 {
    public static final jq00 N0;
    public static final jq00 O0;
    public static final jq00 P0;
    public static final jq00 Q0;
    public static final jq00 R0;
    public static final jq00 S0;
    public static final jq00 T0;
    public static final jq00 U0;
    public static final jq00 V0;
    public static final jq00 W0;
    public static final jq00 X;
    public static final jq00 X0;
    public static final jq00 Y;
    public static final jq00 Y0;
    public static final jq00 Z;
    public static final jq00 Z0;
    public static final jq00 a1;
    public static final jq00 b;
    public static final jq00 b1;
    public static final jq00 c;
    public static final jq00 c1;
    public static final jq00 d;
    public static final jq00 d1;
    public static final jq00 e;
    public static final jq00 e1;
    public static final jq00 f;
    public static final jq00 g;
    public static final jq00 h;
    public static final jq00 i;
    public static final jq00 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new jq00(i2, (byte) 0);
        c = new jq00(i2, (byte) 1);
        d = new jq00(i2, (byte) 2);
        e = new jq00(i2, (byte) 3);
        f = new jq00(i2, (byte) 4);
        g = new jq00(i2, (byte) 5);
        h = new jq00(i2, (byte) 6);
        i = new jq00(i2, (byte) 7);
        t = new jq00(i2, (byte) 8);
        X = new jq00(i2, (byte) 9);
        Y = new jq00(i2, (byte) 10);
        Z = new jq00(i2, (byte) 11);
        N0 = new jq00(i2, (byte) 12);
        O0 = new jq00(i2, (byte) 13);
        P0 = new jq00(i2, (byte) 14);
        Q0 = new jq00(i2, (byte) 15);
        R0 = new jq00(i2, (byte) 16);
        S0 = new jq00(i2, (byte) 17);
        T0 = new jq00(i2, (byte) 18);
        U0 = new jq00(i2, (byte) 19);
        V0 = new jq00(i2, (byte) 20);
        W0 = new jq00(i2, (byte) 21);
        X0 = new jq00(i2, (byte) 22);
        Y0 = new jq00(i2, (byte) 23);
        Z0 = new jq00(i2, (byte) 24);
        a1 = new jq00(i2, (byte) 25);
        b1 = new jq00(i2, (byte) 26);
        c1 = new jq00(i2, (byte) 27);
        d1 = new jq00(i2, (byte) 28);
        e1 = new jq00(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq00(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        Object obj5;
        int i2;
        int i3;
        int i4;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        char c2;
        String str;
        w7h1 w7h1Var4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new sml0(new fjl0((r6h1) obj4, (byte) 10));
            case 1:
                sml0 sml0Var = (sml0) obj;
                hq00 hq00Var = (hq00) obj4;
                r6h1 r6h1Var = sml0Var.b.b;
                y6h1 y6h1Var = sml0Var.a;
                if (hq00Var instanceof fq00) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (hq00Var instanceof eq00) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("see_less_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(hq00Var instanceof gq00)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("external_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((gq00) hq00Var).a)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new p7l0((r6h1) obj4);
            case 3:
                p7l0 p7l0Var = (p7l0) obj;
                rr00 rr00Var = (rr00) obj4;
                if (!(rr00Var instanceof rr00)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = p7l0Var.b.c();
                x6h1VarC4.i.add(new a7h1("play_explicit_content_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                boolean z = rr00Var.a;
                char c3 = z ? (char) 1 : (char) 2;
                char c4 = z ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str2 = "explicit_content_off";
                if (c3 == 1) {
                    obj5 = "explicit_content_off";
                } else {
                    if (c3 != 2) {
                        throw null;
                    }
                    obj5 = "explicit_content_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c4 != 1) {
                    if (c4 != 2) {
                        throw null;
                    }
                    str2 = "explicit_content_on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str2)})), y6h1VarA, p7l0Var.a, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 5:
                return new us00(new ss00((jo70) obj, (xkk1) obj2), new ts00((xkk1) obj3, (pjw0) obj4));
            case 6:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                vs00 vs00Var = ((ws00) obj2).a;
                return new n3m0(vs00Var.b, numValueOf, vs00Var.c, vs00Var.a, (r6h1) obj4);
            case 7:
                n3m0 n3m0Var = (n3m0) obj;
                ws00 ws00Var = (ws00) obj3;
                if (((rs00) obj4).equals(rs00.a)) {
                    return n3m0Var.a((String) ihc1.Q0(ws00Var.a.d, new String[]{"?"}, 0, 6).get(0));
                }
                eg.o();
                return null;
            case 8:
                px00 px00Var = (px00) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                yw00 yw00VarA = ((tx00) obj2).a();
                yw00 yw00Var = yw00VarA instanceof yw00 ? yw00VarA : null;
                return new qcl0(yw00Var != null ? yw00Var.a : null, px00Var.a, r6h1Var2);
            case 9:
                return jy00.b.a((pnl0) obj, (dhm0) obj3, (t600) obj4);
            case 10:
                return new u110((k1r) obj, (k1r) obj2, (k1r) obj3, (k1r) obj4);
            case 11:
                return new zm0((Context) obj2, (ViewGroup) obj3);
            case 12:
                lk10 lk10Var = (lk10) obj2;
                ((Number) obj3).intValue();
                int iC = l1d.C(((wj10) obj).c);
                if (iC == 0) {
                    i2 = 2;
                } else if (iC == 1) {
                    i2 = 1;
                } else if (iC == 2) {
                    i2 = 3;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i2 = 4;
                }
                txk0 txk0Var = new txk0(i2);
                int iA = fuo1.A(lk10Var);
                int iB = fuo1.B(lk10Var);
                x6h1 x6h1VarC5 = txk0Var.b.c();
                x6h1VarC5.i.add(new a7h1("redemption_state", z0l0.b(iA), (Integer) null, (String) null, z0l0.c(iB)));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = txk0Var.c;
                return new mk10(txk0Var, r6h1Var4, k7h1Var.a());
            case 13:
                ((Number) obj3).intValue();
                return new k6l0(((sk10) obj).a, (r6h1) obj4);
            case 14:
                k6l0 k6l0Var = (k6l0) obj;
                vk10 vk10Var = (vk10) obj3;
                if (!((rk10) obj4).equals(rk10.a)) {
                    eg.o();
                } else {
                    if (vk10Var instanceof uk10) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((uk10) vk10Var).b)), k6l0Var.b, k6l0Var.a, System.currentTimeMillis());
                    }
                    if (!vk10Var.equals(tk10.a)) {
                        eg.o();
                    }
                }
                return null;
            case 15:
                hrr0 hrr0VarQ = v8r.q((Object) null);
                ComposeView composeView = new ComposeView((Context) obj2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                composeView.setContent(new j2i(-422849295, new gm10(hrr0VarQ, (iu30) obj4, (byte) 1), true));
                return new yet(composeView, hrr0VarQ, (byte) 1);
            case 16:
                ro10 ro10Var = (ro10) obj;
                so10 so10Var = (vo10) obj2;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                if (so10Var instanceof so10) {
                    qo10 qo10Var = so10Var.t;
                    if (!(qo10Var instanceof po10)) {
                        if (qo10Var instanceof oo10) {
                            i3 = 2;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    i3 = 3;
                } else {
                    i3 = 1;
                }
                mo10 mo10Var = ro10Var.d;
                if (mo10Var instanceof lo10) {
                    i4 = 2;
                } else {
                    if (!(mo10Var instanceof ko10)) {
                        eg.o();
                        return null;
                    }
                    i4 = 1;
                }
                return new kcl0(i3, Integer.valueOf(iIntValue), i4, ro10Var.a, r6h1Var5);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                kcl0 kcl0Var = (kcl0) obj;
                ro10 ro10Var2 = (ro10) obj2;
                so10 so10Var2 = (vo10) obj3;
                jo10 jo10Var = (jo10) obj4;
                if (jo10Var instanceof go10) {
                    if (so10Var2 instanceof so10) {
                        String str3 = so10Var2.b;
                        x6h1 x6h1VarC6 = kcl0Var.b.c();
                        x6h1VarC6.i.add(new a7h1("entity", (String) null, (Integer) null, str3, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC6.a();
                        String str4 = ro10Var2.a;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA3, kcl0Var.a, System.currentTimeMillis());
                    }
                } else if (!(jo10Var instanceof io10) && !(jo10Var instanceof ho10)) {
                    eg.o();
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new tcl0(Integer.valueOf(((Number) obj3).intValue()), z6b1.a(((fp10) obj).a), (r6h1) obj4);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                tcl0 tcl0Var = (tcl0) obj;
                fp10 fp10Var = (fp10) obj2;
                if (!((bp10) obj4).equals(bp10.a)) {
                    eg.o();
                    return null;
                }
                Set set = s4b1.f;
                String strZ = uic.w(fp10Var.a).z();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ != null ? strZ : "")), tcl0Var.b, tcl0Var.a, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                fr10 fr10Var = (fr10) obj;
                ((Number) obj3).intValue();
                return new oyk0(fr10Var.a, fr10Var.f, (r6h1) obj4);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                int iIntValue2 = ((Number) obj3).intValue();
                brl0 brl0Var = new brl0((byte) 13);
                sv10 sv10Var = ((vv10) obj).a;
                n2m0 n2m0Var = new n2m0(brl0Var, sv10Var.a());
                if (sv10Var instanceof sv10) {
                    return new m2m0(n2m0Var, sv10Var.a, Integer.valueOf(iIntValue2));
                }
                if (sv10Var instanceof tv10) {
                    return new l2m0(n2m0Var);
                }
                eg.o();
                return null;
            case 22:
                h3j1 h3j1Var = (h3j1) obj;
                int iIntValue3 = ((Number) obj3).intValue();
                y6h1 y6h1Var2 = (y6h1) o7h.s0(((r6h1) obj4).a);
                return new z3l0(new txk0(y6h1Var2 != null ? y6h1Var2.h.b : null, h3j1Var.a, (byte) 5), 3, Integer.valueOf(iIntValue3));
            case 23:
                z3l0 z3l0Var = (z3l0) obj;
                f3j1 f3j1Var = (g3j1) obj4;
                String str5 = ((h3j1) obj2).a;
                z2a z2aVar = ((m120) obj3).c;
                if (f3j1Var instanceof c3j1) {
                    return z3l0Var.h();
                }
                if (f3j1Var instanceof d3j1) {
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI.f = "0.0.1";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.d = str5;
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "artist");
                    x6h1VarR.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR.a(), r6h1.c, System.currentTimeMillis());
                } else if (f3j1Var instanceof f3j1) {
                    y6h1 y6h1Var4 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI2.f = "0.0.1";
                    x6h1VarI2.g = "22.0.0";
                    x6h1VarI2.d = str5;
                    y6h1 y6h1VarA4 = x6h1VarI2.a();
                    Collections.singletonList("artist");
                    int iW = h0p1.w(z2aVar);
                    x6h1 x6h1VarC7 = y6h1VarA4.c();
                    x6h1VarC7.i.add(new a7h1("badge_card", v8i0.g(iW), 0, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("learn_more_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", f3j1Var.a)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(f3j1Var instanceof e3j1)) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var5 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI3.f = "0.0.1";
                    x6h1VarI3.g = "22.0.0";
                    x6h1VarI3.d = str5;
                    y6h1 y6h1VarA5 = x6h1VarI3.a();
                    Collections.singletonList("artist");
                    Integer numValueOf2 = Integer.valueOf(!(z2aVar instanceof w2a) ? 1 : 0);
                    x6h1 x6h1VarC9 = y6h1VarA5.c();
                    x6h1VarC9.i.add(new a7h1("badge_card", "fresh_finds_forward", numValueOf2, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("explore_link", (String) null, (Integer) null, "spotify:genre:0JQ5DAqbMKFImHYGo3eTSg", (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:genre:0JQ5DAqbMKFImHYGo3eTSg")), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                return new q6l0();
            case 25:
                ((Number) obj3).intValue();
                return new o6l0((r6h1) obj4);
            case 26:
                o6l0 o6l0Var = (o6l0) obj;
                if (((i720) obj4).equals(i720.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), o6l0Var.b, o6l0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 27:
                q820 q820Var = (r820) obj4;
                y6h1 y6h1Var6 = ((lsk0) obj).a;
                if (q820Var instanceof q820) {
                    q820 q820Var2 = q820Var;
                    switch (q820Var2.a.ordinal()) {
                        case 0:
                            c2 = '\n';
                            break;
                        case 1:
                            c2 = '\t';
                            break;
                        case 2:
                            c2 = 11;
                            break;
                        case 3:
                            c2 = 1;
                            break;
                        case 4:
                            c2 = 2;
                            break;
                        case 5:
                            c2 = 4;
                            break;
                        case 6:
                            c2 = 5;
                            break;
                        case 7:
                            c2 = 3;
                            break;
                        case 8:
                            c2 = 7;
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    Integer numValueOf3 = Integer.valueOf(q820Var2.b);
                    x6h1 x6h1VarC11 = y6h1Var6.c();
                    switch (c2) {
                        case 1:
                            str = "albums";
                            break;
                        case 2:
                            str = "artists";
                            break;
                        case 3:
                            str = "audiobooks";
                            break;
                        case 4:
                            str = "episodes";
                            break;
                        case 5:
                            str = "playlists";
                            break;
                        case 6:
                            str = "playlists_by_spotify";
                            break;
                        case 7:
                            str = "playlists_by_you";
                            break;
                        case '\b':
                            str = "playlists_mixed";
                            break;
                        case '\t':
                            str = "shows";
                            break;
                        case '\n':
                            str = "top";
                            break;
                        case 11:
                            str = "tracks";
                            break;
                        default:
                            throw null;
                    }
                    x6h1VarC11.i.add(new a7h1("filter_button", str, numValueOf3, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(q820Var instanceof p820)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC12 = y6h1Var6.c();
                    x6h1VarC12.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 28:
                ((Number) obj3).intValue();
                return new qul0((r6h1) obj4);
            default:
                qul0 qul0Var = (qul0) obj;
                kd20 kd20Var = (pd20) obj4;
                r6h1 r6h1Var6 = qul0Var.a;
                y6h1 y6h1Var7 = qul0Var.b;
                Set set2 = ((rd20) obj2).a;
                if (kd20Var instanceof kd20) {
                    yc20 yc20Var = kd20Var.a;
                    String str6 = yc20Var.c;
                    Iterator it = set2.iterator();
                    int i9 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (i9 < 0) {
                                p7h.T();
                                throw null;
                            }
                            if (u890.j(((m620) next).a, yc20Var.c)) {
                                i8 = i9;
                            } else {
                                i9++;
                            }
                        } else {
                            i8 = -1;
                        }
                    }
                    Integer numValueOf4 = Integer.valueOf(i8);
                    x6h1 x6h1VarC13 = y6h1Var7.c();
                    x6h1VarC13.i.add(new a7h1("filter_chip", str6, numValueOf4, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC13.a(), r6h1Var6, System.currentTimeMillis());
                } else if (kd20Var instanceof jd20) {
                    yc20 yc20Var2 = ((jd20) kd20Var).a;
                    String str7 = yc20Var2.c;
                    Iterator it2 = set2.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (i10 < 0) {
                                p7h.T();
                                throw null;
                            }
                            if (u890.j(((m620) next2).a, yc20Var2.c)) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        } else {
                            i7 = -1;
                        }
                    }
                    Integer numValueOf5 = Integer.valueOf(i7);
                    x6h1 x6h1VarC14 = y6h1Var7.c();
                    x6h1VarC14.i.add(new a7h1("filter_chip", str7, numValueOf5, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC14.a(), r6h1Var6, System.currentTimeMillis());
                } else if (kd20Var instanceof nd20) {
                    nd20 nd20Var = (nd20) kd20Var;
                    zc20 zc20Var = nd20Var.b;
                    String str8 = zc20Var.c;
                    ListIterator listIterator = nd20Var.a.f.listIterator(0);
                    int i11 = 0;
                    while (true) {
                        if (!listIterator.hasNext()) {
                            i6 = -1;
                        } else if (u890.j(((zc20) listIterator.next()).c, zc20Var.c)) {
                            i6 = i11;
                        } else {
                            i11++;
                        }
                    }
                    Integer numValueOf6 = Integer.valueOf(i6 + 1);
                    x6h1 x6h1VarC15 = y6h1Var7.c();
                    x6h1VarC15.i.add(new a7h1("filter_chip", str8, numValueOf6, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC15.a(), r6h1Var6, System.currentTimeMillis());
                } else if (kd20Var instanceof md20) {
                    md20 md20Var = (md20) kd20Var;
                    zc20 zc20Var2 = md20Var.b;
                    String str9 = zc20Var2.c;
                    ListIterator listIterator2 = md20Var.a.f.listIterator(0);
                    int i12 = 0;
                    while (true) {
                        if (!listIterator2.hasNext()) {
                            i5 = -1;
                        } else if (u890.j(((zc20) listIterator2.next()).c, zc20Var2.c)) {
                            i5 = i12;
                        } else {
                            i12++;
                        }
                    }
                    Integer numValueOf7 = Integer.valueOf(i5 + 1);
                    x6h1 x6h1VarC16 = y6h1Var7.c();
                    x6h1VarC16.i.add(new a7h1("filter_chip", str9, numValueOf7, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC16.a(), r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!kd20Var.equals(ld20.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC17 = y6h1Var7.c();
                    x6h1VarC17.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC17.a(), r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var4;
        }
    }
}
