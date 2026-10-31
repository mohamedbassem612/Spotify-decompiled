package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mx90 extends hab0 implements zu30 {
    public static final mx90 N0;
    public static final mx90 O0;
    public static final mx90 P0;
    public static final mx90 Q0;
    public static final mx90 R0;
    public static final mx90 S0;
    public static final mx90 T0;
    public static final mx90 U0;
    public static final mx90 V0;
    public static final mx90 W0;
    public static final mx90 X;
    public static final mx90 X0;
    public static final mx90 Y;
    public static final mx90 Y0;
    public static final mx90 Z;
    public static final mx90 Z0;
    public static final mx90 a1;
    public static final mx90 b;
    public static final mx90 b1;
    public static final mx90 c;
    public static final mx90 c1;
    public static final mx90 d;
    public static final mx90 d1;
    public static final mx90 e;
    public static final mx90 e1;
    public static final mx90 f;
    public static final mx90 g;
    public static final mx90 h;
    public static final mx90 i;
    public static final mx90 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new mx90(i2, (byte) 0);
        c = new mx90(i2, (byte) 1);
        d = new mx90(i2, (byte) 2);
        e = new mx90(i2, (byte) 3);
        f = new mx90(i2, (byte) 4);
        g = new mx90(i2, (byte) 5);
        h = new mx90(i2, (byte) 6);
        i = new mx90(i2, (byte) 7);
        t = new mx90(i2, (byte) 8);
        X = new mx90(i2, (byte) 9);
        Y = new mx90(i2, (byte) 10);
        Z = new mx90(i2, (byte) 11);
        N0 = new mx90(i2, (byte) 12);
        O0 = new mx90(i2, (byte) 13);
        P0 = new mx90(i2, (byte) 14);
        Q0 = new mx90(i2, (byte) 15);
        R0 = new mx90(i2, (byte) 16);
        S0 = new mx90(i2, (byte) 17);
        T0 = new mx90(i2, (byte) 18);
        U0 = new mx90(i2, (byte) 19);
        V0 = new mx90(i2, (byte) 20);
        W0 = new mx90(i2, (byte) 21);
        X0 = new mx90(i2, (byte) 22);
        Y0 = new mx90(i2, (byte) 23);
        Z0 = new mx90(i2, (byte) 24);
        a1 = new mx90(i2, (byte) 25);
        b1 = new mx90(i2, (byte) 26);
        c1 = new mx90(i2, (byte) 27);
        d1 = new mx90(i2, (byte) 28);
        e1 = new mx90(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx90(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        int i2;
        int i3;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        w7h1 w7h1Var7;
        byte b2 = this.a;
        int i4 = 2;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var8 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new qbl0(((ex90) obj).a);
            case 1:
                qbl0 qbl0Var = (qbl0) obj;
                ex90 ex90Var = (ex90) obj2;
                dx90 dx90Var = (dx90) obj4;
                r6h1 r6h1Var = qbl0Var.a;
                y6h1 y6h1Var = qbl0Var.b;
                if (dx90Var instanceof zw90) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("invite_friends_to_jam_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (dx90Var instanceof bx90) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("remove_participant_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str = ((bx90) dx90Var).a;
                    String str2 = ex90Var.a;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str == null) {
                        str = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("remove_participant", 1, sqg0.J(new mmr0[]{new mmr0("participant_id", str), new mmr0("session_id", str2 != null ? str2 : "")})), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else if (dx90Var instanceof yw90) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("end_jam_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop_hosting_social_listening_session", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else if (dx90Var instanceof cx90) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("guest_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    String str3 = nik1.u5.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(dx90Var instanceof ax90)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("leave_jam_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_social_listening_session", 1, b7xVar), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                py90 py90Var = (py90) obj;
                ((Number) obj3).intValue();
                String str4 = py90Var.b.g;
                int i5 = py90Var.c;
                qbl0 qbl0Var2 = new qbl0(py90Var.a);
                int iC = l1d.C(py90Var.d);
                if (iC == 0) {
                    return new obl0(qbl0Var2, Integer.valueOf(i5), str4);
                }
                if (iC == 1) {
                    return new mbl0(qbl0Var2, Integer.valueOf(i5), str4);
                }
                eg.o();
                return null;
            case 3:
                n8h1 n8h1Var = (n8h1) obj;
                py90 py90Var2 = (py90) obj2;
                if (!((oy90) obj4).equals(oy90.a)) {
                    eg.o();
                    return null;
                }
                String str5 = py90Var2.b.g;
                if (n8h1Var instanceof obl0) {
                    obl0 obl0Var = (obl0) n8h1Var;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), obl0Var.a, obl0Var.b.a, System.currentTimeMillis());
                }
                if (!(n8h1Var instanceof mbl0)) {
                    return null;
                }
                mbl0 mbl0Var = (mbl0) n8h1Var;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), mbl0Var.a, mbl0Var.b.a, System.currentTimeMillis());
            case 4:
                cz90 cz90Var = (cz90) obj2;
                ((Number) obj3).intValue();
                az90 az90Var = cz90Var instanceof az90 ? (az90) cz90Var : null;
                return new tbl0(az90Var != null ? az90Var.a : null);
            case 5:
                tbl0 tbl0Var = (tbl0) obj;
                cz90 cz90Var2 = (cz90) obj3;
                zy90 zy90Var = (zy90) obj4;
                r6h1 r6h1Var2 = tbl0Var.a;
                y6h1 y6h1Var2 = tbl0Var.b;
                if (!(cz90Var2 instanceof az90)) {
                    return null;
                }
                int iOrdinal = zy90Var.ordinal();
                if (iOrdinal == 0) {
                    boolean z = ((az90) cz90Var2).c;
                    int i6 = z ? 2 : 1;
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("volume_setting_toggle", (String) null, (Integer) null, (String) null, z9l0.b(i6)));
                    x6h1VarC6.j = true;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", z9l0.d(z ? 2 : 1)), new mmr0("state_after_toggle", z9l0.c(z ? 1 : 2))})), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        return null;
                    }
                    boolean z2 = ((az90) cz90Var2).d;
                    int i7 = z2 ? 1 : 2;
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("playback_setting_toggle", (String) null, (Integer) null, (String) null, z9l0.f(i7)));
                    x6h1VarC7.j = true;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", z9l0.h(z2 ? 1 : 2)), new mmr0("state_after_toggle", z9l0.g(z2 ? 2 : 1))})), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                ((Number) obj3).intValue();
                return new wtl0(2, (r6h1) obj4);
            case 7:
                wtl0 wtl0Var = (wtl0) obj;
                j0a0 j0a0Var = (l0a0) obj4;
                if (j0a0Var instanceof j0a0) {
                    x6h1 x6h1VarC8 = wtl0Var.b.c();
                    x6h1VarC8.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", j0a0Var.a)), x6h1VarC8.a(), wtl0Var.a, System.currentTimeMillis());
                }
                if (j0a0Var instanceof k0a0) {
                    return null;
                }
                eg.o();
                return null;
            case 8:
                ((Number) obj3).intValue();
                return new pbl0(new qbl0(((s0a0) obj).a));
            case 9:
                pbl0 pbl0Var = (pbl0) obj;
                s0a0 s0a0Var = (s0a0) obj2;
                String str6 = s0a0Var.b;
                String str7 = s0a0Var.a;
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                if (str6 == null) {
                    str6 = "";
                }
                return new w7h1("", "", z7h1Var2, new x7h1("remove_participant", 1, sqg0.J(new mmr0[]{new mmr0("participant_id", str6), new mmr0("session_id", str7 != null ? str7 : "")})), pbl0Var.a, pbl0Var.b.a, System.currentTimeMillis());
            case 10:
                k5a0 k5a0Var = (k5a0) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                return k5a0Var instanceof i5a0 ? new gyk0(new wqk0(r6h1Var3, (byte) 8), ((i5a0) k5a0Var).a) : new hyk0(new wqk0(r6h1Var3, (byte) 8));
            case 11:
                n8h1 n8h1Var2 = (n8h1) obj;
                if (!((g5a0) obj4).equals(g5a0.a)) {
                    eg.o();
                    return null;
                }
                if (n8h1Var2 instanceof gyk0) {
                    gyk0 gyk0Var = (gyk0) n8h1Var2;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), gyk0Var.a, gyk0Var.b.b, System.currentTimeMillis());
                }
                if (!(n8h1Var2 instanceof hyk0)) {
                    return null;
                }
                hyk0 hyk0Var = (hyk0) n8h1Var2;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), hyk0Var.a, hyk0Var.b.b, System.currentTimeMillis());
            case 12:
                w5a0 w5a0Var = (w5a0) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                String str8 = w5a0Var.a;
                boolean z3 = w5a0Var.b;
                if (!z3) {
                    if (z3) {
                        eg.o();
                        return null;
                    }
                    i4 = 1;
                }
                return new dbl0(i4, str8, r6h1Var4);
            case 13:
                dbl0 dbl0Var = (dbl0) obj;
                boolean z4 = ((v5a0) obj4).a;
                if (z4) {
                    i2 = 2;
                } else {
                    if (z4) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                int iC2 = l1d.C(i2);
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 1;
                }
                return dbl0Var.h(i4, i2);
            case 14:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                boolean z5 = ((d6a0) obj).a;
                if (!z5) {
                    if (z5) {
                        eg.o();
                        return null;
                    }
                    i4 = 1;
                }
                return new dbl0(i4, null, r6h1Var5);
            case 15:
                dbl0 dbl0Var2 = (dbl0) obj;
                boolean z6 = ((c6a0) obj4).a;
                if (z6) {
                    i3 = 2;
                } else {
                    if (z6) {
                        eg.o();
                        return null;
                    }
                    i3 = 1;
                }
                int iC3 = l1d.C(i3);
                if (iC3 != 0) {
                    if (iC3 != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 1;
                }
                return dbl0Var2.h(i4, i3);
            case 16:
                ((Number) obj3).intValue();
                r6h1 r6h1Var6 = r6h1.c;
                return new val0(new bbl0(), ((hba0) obj).a.a);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                val0 val0Var = (val0) obj;
                gba0 gba0Var = (gba0) obj4;
                bbl0 bbl0Var = val0Var.b;
                y6h1 y6h1Var3 = val0Var.a;
                if (gba0Var instanceof bba0) {
                    String str9 = nba0.a[l1d.C(((bba0) gba0Var).a.a)] == 1 ? "listen-and-control" : "control";
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("join_button", str9, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC9.a(), bbl0Var.a, System.currentTimeMillis());
                } else {
                    if (gba0Var instanceof dba0) {
                        return null;
                    }
                    if (gba0Var instanceof eba0) {
                        x6h1 x6h1VarC10 = y6h1Var3.c();
                        x6h1VarC10.i.add(new a7h1("explore_premium", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC10.a();
                        String str10 = nik1.b2.a;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10 != null ? str10 : "")), y6h1VarA3, bbl0Var.a, System.currentTimeMillis());
                    } else if (gba0Var instanceof cba0) {
                        x6h1 x6h1VarC11 = y6h1Var3.c();
                        x6h1VarC11.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), bbl0Var.a, System.currentTimeMillis());
                    } else {
                        if (!(gba0Var instanceof fba0)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC12 = y6h1Var3.c();
                        x6h1VarC12.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), bbl0Var.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                return new jbl0(((hba0) obj).a.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                gba0 gba0Var2 = (gba0) obj4;
                y6h1 y6h1Var4 = ((jbl0) obj).a;
                if (gba0Var2 instanceof bba0) {
                    boolean z7 = ((bba0) gba0Var2).a.b.a;
                    if (z7) {
                        x6h1 x6h1VarC13 = y6h1Var4.c();
                        x6h1VarC13.i.add(new a7h1("ask_to_join_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (z7) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC14 = y6h1Var4.c();
                    x6h1VarC14.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(gba0Var2 instanceof dba0)) {
                    if ((gba0Var2 instanceof eba0) || (gba0Var2 instanceof cba0) || (gba0Var2 instanceof fba0)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                int iC4 = l1d.C(((dba0) gba0Var2).a.a);
                if (iC4 == 0 || iC4 == 1) {
                    x6h1 x6h1VarC15 = y6h1Var4.c();
                    x6h1VarC15.i.add(new a7h1("join_jam_device_selection", (String) null, (Integer) null, (String) null, "host_device"));
                    x6h1VarC15.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iC4 != 2) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC16 = y6h1Var4.c();
                x6h1VarC16.i.add(new a7h1("join_jam_device_selection", (String) null, (Integer) null, (String) null, "local_device"));
                x6h1VarC16.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ral0 ral0Var = (ral0) obj;
                tca0 tca0Var = (tca0) obj4;
                bbl0 bbl0Var2 = ral0Var.b;
                y6h1 y6h1Var5 = ral0Var.a;
                if (tca0Var instanceof pca0) {
                    return null;
                }
                if (tca0Var instanceof oca0) {
                    x6h1 x6h1VarC17 = y6h1Var5.c();
                    x6h1VarC17.i.add(new a7h1("ask_to_join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC17.a(), bbl0Var2.a, System.currentTimeMillis());
                } else if (tca0Var instanceof qca0) {
                    x6h1 x6h1VarC18 = y6h1Var5.c();
                    x6h1VarC18.i.add(new a7h1("learn_more_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC18.a();
                    String str11 = nik1.x5.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11 != null ? str11 : "")), y6h1VarA4, bbl0Var2.a, System.currentTimeMillis());
                } else {
                    if (tca0Var instanceof rca0) {
                        return null;
                    }
                    if (!(tca0Var instanceof sca0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC19 = y6h1Var5.c();
                    x6h1VarC19.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC19.a(), bbl0Var2.a, System.currentTimeMillis());
                }
                return w7h1Var4;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                wal0 wal0Var = (wal0) obj;
                tca0 tca0Var2 = (tca0) obj4;
                bbl0 bbl0Var3 = wal0Var.b;
                y6h1 y6h1Var6 = wal0Var.a;
                if (tca0Var2 instanceof pca0) {
                    x6h1 x6h1VarC20 = y6h1Var6.c();
                    x6h1VarC20.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC20.a(), bbl0Var3.a, System.currentTimeMillis());
                } else {
                    if (tca0Var2 instanceof oca0) {
                        return null;
                    }
                    if (tca0Var2 instanceof qca0) {
                        x6h1 x6h1VarC21 = y6h1Var6.c();
                        x6h1VarC21.i.add(new a7h1("learn_more_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        y6h1 y6h1VarA5 = x6h1VarC21.a();
                        String str12 = nik1.x5.a;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str12 != null ? str12 : "")), y6h1VarA5, bbl0Var3.a, System.currentTimeMillis());
                    } else if (tca0Var2 instanceof rca0) {
                        x6h1 x6h1VarC22 = y6h1Var6.c();
                        x6h1VarC22.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC22.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC22.a(), bbl0Var3.a, System.currentTimeMillis());
                    } else {
                        if (!(tca0Var2 instanceof sca0)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC23 = y6h1Var6.c();
                        x6h1VarC23.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC23.a(), bbl0Var3.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var5;
            case 22:
                sal0 sal0Var = (sal0) obj;
                sda0 sda0Var = (sda0) obj4;
                bbl0 bbl0Var4 = sal0Var.b;
                y6h1 y6h1Var7 = sal0Var.a;
                if (sda0Var instanceof oda0) {
                    return null;
                }
                if (sda0Var instanceof mda0) {
                    x6h1 x6h1VarC24 = y6h1Var7.c();
                    x6h1VarC24.i.add(new a7h1("ask_to_join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC24.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC24.a(), bbl0Var4.a, System.currentTimeMillis());
                } else {
                    if (sda0Var instanceof rda0) {
                        x6h1 x6h1VarC25 = y6h1Var7.c();
                        x6h1VarC25.i.add(new a7h1("take_over_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC25.a(), bbl0Var4.a, System.currentTimeMillis());
                    }
                    if ((sda0Var instanceof nda0) || (sda0Var instanceof pda0)) {
                        return null;
                    }
                    if (!(sda0Var instanceof qda0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC26 = y6h1Var7.c();
                    x6h1VarC26.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC26.a(), bbl0Var4.a, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 23:
                zal0 zal0Var = (zal0) obj;
                sda0 sda0Var2 = (sda0) obj4;
                bbl0 bbl0Var5 = zal0Var.b;
                y6h1 y6h1Var8 = zal0Var.a;
                if (sda0Var2 instanceof oda0) {
                    x6h1 x6h1VarC27 = y6h1Var8.c();
                    x6h1VarC27.i.add(new a7h1("join_session_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC27.j = false;
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC27.a(), bbl0Var5.a, System.currentTimeMillis());
                } else {
                    if (sda0Var2 instanceof mda0) {
                        return null;
                    }
                    if (sda0Var2 instanceof rda0) {
                        x6h1 x6h1VarC28 = y6h1Var8.c();
                        x6h1VarC28.i.add(new a7h1("take_over_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC28.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC28.a(), bbl0Var5.a, System.currentTimeMillis());
                    }
                    if (sda0Var2 instanceof nda0) {
                        x6h1 x6h1VarC29 = y6h1Var8.c();
                        x6h1VarC29.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC29.j = false;
                        w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC29.a(), bbl0Var5.a, System.currentTimeMillis());
                    } else {
                        if (sda0Var2 instanceof pda0) {
                            return null;
                        }
                        if (!(sda0Var2 instanceof qda0)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC30 = y6h1Var8.c();
                        x6h1VarC30.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC30.j = false;
                        w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC30.a(), bbl0Var5.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var7;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                return new rnl0(new fjl0((r6h1) obj4, (byte) 18));
            case 25:
                rnl0 rnl0Var = (rnl0) obj;
                gea0 gea0Var = (gea0) obj2;
                if (jea0.a[((fea0) obj4).ordinal()] == 1) {
                    String str13 = gea0Var.a;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_user_a_playlist_collaborator", 1, sqg0.J(new mmr0[]{new mmr0("playlist", str13 != null ? str13 : ""), new mmr0("user_to_be_made_collaborator", l1d.m("spotify:user:", gea0Var.b))})), rnl0Var.a, rnl0Var.b.b, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var8;
            case 26:
                ((Number) obj3).intValue();
                return new j6l0();
            case 27:
                j6l0 j6l0Var = (j6l0) obj;
                if (((ana0) obj4).equals(ana0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:kallax:track-select?reason=playlist_entry_point")), j6l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 28:
                jvl0 jvl0Var = (n8h1) obj;
                rna0 rna0Var = (rna0) obj4;
                String str14 = ((sna0) obj2).a;
                if (rna0Var instanceof qna0) {
                    if (jvl0Var instanceof jvl0) {
                        return jvl0Var.a(str14);
                    }
                    if (jvl0Var instanceof wvl0) {
                        return ((wvl0) jvl0Var).a(str14);
                    }
                    return null;
                }
                if (!(rna0Var instanceof pna0)) {
                    eg.o();
                    return null;
                }
                if (jvl0Var instanceof jvl0) {
                    return jvl0Var.j();
                }
                if (jvl0Var instanceof wvl0) {
                    return ((wvl0) jvl0Var).i();
                }
                return null;
            default:
                ((Number) obj3).intValue();
                return new ifl0(n3p1.o(((ura0) obj).c));
        }
    }
}
