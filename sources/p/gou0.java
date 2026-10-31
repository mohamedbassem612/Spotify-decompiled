package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.Poll;
import com.spotify.music.podcastinteractivity.polls.proto.PollOption;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gou0 extends hab0 implements zu30 {
    public static final gou0 N0;
    public static final gou0 O0;
    public static final gou0 P0;
    public static final gou0 Q0;
    public static final gou0 R0;
    public static final gou0 S0;
    public static final gou0 T0;
    public static final gou0 U0;
    public static final gou0 V0;
    public static final gou0 W0;
    public static final gou0 X;
    public static final gou0 X0;
    public static final gou0 Y;
    public static final gou0 Y0;
    public static final gou0 Z;
    public static final gou0 Z0;
    public static final gou0 a1;
    public static final gou0 b;
    public static final gou0 b1;
    public static final gou0 c;
    public static final gou0 c1;
    public static final gou0 d;
    public static final gou0 d1;
    public static final gou0 e;
    public static final gou0 e1;
    public static final gou0 f;
    public static final gou0 g;
    public static final gou0 h;
    public static final gou0 i;
    public static final gou0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new gou0(i2, (byte) 0);
        c = new gou0(i2, (byte) 1);
        d = new gou0(i2, (byte) 2);
        e = new gou0(i2, (byte) 3);
        f = new gou0(i2, (byte) 4);
        g = new gou0(i2, (byte) 5);
        h = new gou0(i2, (byte) 6);
        i = new gou0(i2, (byte) 7);
        t = new gou0(i2, (byte) 8);
        X = new gou0(i2, (byte) 9);
        Y = new gou0(i2, (byte) 10);
        Z = new gou0(i2, (byte) 11);
        N0 = new gou0(i2, (byte) 12);
        O0 = new gou0(i2, (byte) 13);
        P0 = new gou0(i2, (byte) 14);
        Q0 = new gou0(i2, (byte) 15);
        R0 = new gou0(i2, (byte) 16);
        S0 = new gou0(i2, (byte) 17);
        T0 = new gou0(i2, (byte) 18);
        U0 = new gou0(i2, (byte) 19);
        V0 = new gou0(i2, (byte) 20);
        W0 = new gou0(i2, (byte) 21);
        X0 = new gou0(i2, (byte) 22);
        Y0 = new gou0(i2, (byte) 23);
        Z0 = new gou0(i2, (byte) 24);
        a1 = new gou0(i2, (byte) 25);
        b1 = new gou0(i2, (byte) 26);
        c1 = new gou0(i2, (byte) 27);
        d1 = new gou0(i2, (byte) 28);
        e1 = new gou0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gou0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x04da  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        Object obj5;
        w7h1 w7h1Var3;
        int i2;
        Poll pollO;
        h290 h290VarR;
        String m231Var;
        w7h1 w7h1VarE;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new jll0(new fjl0((r6h1) obj4, (byte) 1));
            case 1:
                jll0 jll0Var = (jll0) obj;
                wnu0 wnu0Var = (wnu0) obj4;
                if (wnu0Var instanceof vnu0) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((vnu0) wnu0Var).a)), jll0Var.a, jll0Var.b.b, System.currentTimeMillis());
                }
                if (wnu0Var instanceof unu0) {
                    return null;
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new p1m0(((nqu0) obj).a, (r6h1) obj4);
            case 3:
                p1m0 p1m0Var = (p1m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", ((nqu0) obj2).a)), p1m0Var.b, p1m0Var.a, System.currentTimeMillis());
            case 4:
                asu0 asu0Var = (asu0) obj;
                return new dql0(new cql0(new fql0(asu0Var.a), (byte) 1), Integer.valueOf(((Number) obj3).intValue()), asu0Var.b);
            case 5:
                return new rql0(Integer.valueOf(((Number) obj3).intValue()), ((zru0) obj).a, new mjl0(new sql0()));
            case 6:
                return null;
            case 7:
                jvl0 jvl0Var = (jvl0) obj;
                bsu0 bsu0Var = (bsu0) obj2;
                fsu0 fsu0Var = (fsu0) obj3;
                uru0 uru0Var = (uru0) obj4;
                String str = bsu0Var.a;
                if (uru0Var instanceof pru0) {
                    o940 o940Var = bsu0Var.j;
                    return (o940Var == null || !o940Var.a()) ? jvl0Var.a(str) : jvl0Var.j();
                }
                if (uru0Var instanceof jru0) {
                    qgl0 qgl0Var = new qgl0(jvl0Var);
                    return fsu0Var.b ? qgl0Var.m(str) : qgl0Var.l(str);
                }
                eg.o();
                return null;
            case 8:
                y6h1 y6h1Var = ((rql0) obj).a;
                tsu0 tsu0Var = ((sru0) obj4).a;
                if (tsu0Var.equals(tsu0.c)) {
                    w7h1Var = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!tsu0Var.equals(tsu0.a)) {
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 9:
                return new m5l0(Integer.valueOf(((Number) obj3).intValue()), ((csu0) obj).a, (r6h1) obj4);
            case 10:
                m5l0 m5l0Var = (m5l0) obj;
                csu0 csu0Var = (csu0) obj2;
                vru0 vru0Var = (vru0) obj4;
                r6h1 r6h1Var = m5l0Var.a;
                y6h1 y6h1Var2 = m5l0Var.b;
                if (vru0Var instanceof qru0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
                } else if (vru0Var instanceof mru0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
                } else if (vru0Var instanceof lru0) {
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else if (vru0Var instanceof kru0) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_playlist_on_profile", 1, Collections.singletonMap("playlist_to_be_shown", csu0Var.a)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(vru0Var instanceof rru0)) {
                        if ((vru0Var instanceof nru0) || (vru0Var instanceof oru0)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                ((Number) obj3).intValue();
                return new k5l0((r6h1) obj4);
            case 12:
                k5l0 k5l0Var = (k5l0) obj;
                x6h1 x6h1VarC5 = k5l0Var.b.c();
                x6h1VarC5.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:new:playlist")), x6h1VarC5.a(), k5l0Var.a, System.currentTimeMillis());
            case 13:
                ((Number) obj3).intValue();
                return new o7l0();
            case 14:
                o7l0 o7l0Var = (o7l0) obj;
                a0v0 a0v0Var = (a0v0) obj2;
                zzu0 zzu0Var = (zzu0) obj4;
                if (!(zzu0Var instanceof zzu0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC6 = o7l0Var.a.c();
                x6h1VarC6.i.add(new a7h1("playlists_public_by_default_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA = x6h1VarC6.a();
                char c2 = a0v0Var.a ? (char) 2 : (char) 1;
                char c3 = zzu0Var.a ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str2 = "playlists_public_by_default_off";
                if (c2 == 1) {
                    obj5 = "playlists_public_by_default_off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "playlists_public_by_default_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str2 = "playlists_public_by_default_on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str2)})), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 15:
                jvl0 jvl0Var2 = (n8h1) obj;
                v2v0 v2v0Var = (v2v0) obj3;
                t2v0 t2v0Var = (t2v0) obj4;
                String str3 = ((u2v0) obj2).a;
                boolean z = v2v0Var.l;
                if (o0c.F(v2v0Var.f, v2v0Var.j, v2v0Var.k) || v2v0Var.m) {
                    if (jvl0Var2 instanceof jvl0) {
                        return jvl0Var2.j();
                    }
                    if (jvl0Var2 instanceof wvl0) {
                        return ((wvl0) jvl0Var2).i();
                    }
                    return null;
                }
                if (t2v0Var instanceof s2v0) {
                    if (jvl0Var2 instanceof jvl0) {
                        return jvl0Var2.a(str3);
                    }
                    if (jvl0Var2 instanceof wvl0) {
                        return ((wvl0) jvl0Var2).a(str3);
                    }
                    return null;
                }
                if (!t2v0Var.equals(r2v0.a)) {
                    eg.o();
                    return null;
                }
                if (jvl0Var2 instanceof jvl0) {
                    qgl0 qgl0Var2 = new qgl0(jvl0Var2);
                    return z ? qgl0Var2.r() : qgl0Var2.l(str3);
                }
                if (!(jvl0Var2 instanceof wvl0)) {
                    return null;
                }
                qgl0 qgl0Var3 = new qgl0((wvl0) jvl0Var2);
                return z ? qgl0Var3.r() : qgl0Var3.l(str3);
            case 16:
                ipl0 ipl0Var = (ipl0) obj;
                tbv0 tbv0Var = (tbv0) obj3;
                sbv0 sbv0Var = (sbv0) obj4;
                r6h1 r6h1Var2 = ipl0Var.a;
                y6h1 y6h1Var3 = ipl0Var.b;
                String str4 = tbv0Var.b;
                kcv0 kcv0Var = tbv0Var.a;
                if (sbv0Var.equals(nbv0.a)) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, str4, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    int i3 = -1;
                    if (sbv0Var instanceof obv0) {
                        int i4 = ((obv0) sbv0Var).a;
                        boolean z2 = kcv0Var instanceof kcv0;
                        kcv0 kcv0Var2 = z2 ? kcv0Var : null;
                        if (kcv0Var2 == null || (pollO = kcv0Var2.c.o()) == null || (h290VarR = pollO.r()) == null) {
                            i2 = -1;
                        } else {
                            Iterator it = h290VarR.iterator();
                            i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                } else if (((PollOption) it.next()).o() != i4) {
                                    i2++;
                                }
                            }
                        }
                        if (!z2 || i2 == -1) {
                            return null;
                        }
                        String strValueOf = String.valueOf(kcv0Var.c.o().q());
                        x6h1 x6h1VarC8 = y6h1Var3.c();
                        x6h1VarC8.i.add(new a7h1("multi_select_poll_card", strValueOf, (Integer) null, str4, (String) null));
                        x6h1VarC8.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC8.a();
                        String strValueOf2 = String.valueOf(i4);
                        Integer numValueOf = Integer.valueOf(i2);
                        x6h1 x6h1VarC9 = y6h1VarA2.c();
                        x6h1VarC9.i.add(new a7h1("option_button", strValueOf2, numValueOf, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                    } else if (sbv0Var.equals(nbv0.b)) {
                        x6h1 x6h1VarC10 = y6h1Var3.c();
                        x6h1VarC10.i.add(new a7h1("poll_error_card", (String) null, (Integer) null, str4, (String) null));
                        x6h1VarC10.j = true;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (!(sbv0Var instanceof rbv0)) {
                            if ((sbv0Var instanceof mbv0) || sbv0Var.equals(pbv0.a) || (sbv0Var instanceof qbv0) || sbv0Var.equals(nbv0.c) || sbv0Var.equals(nbv0.d)) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        if (!(kcv0Var instanceof kcv0)) {
                            return null;
                        }
                        ClientPollResponse clientPollResponse = kcv0Var.c;
                        String strValueOf3 = String.valueOf(clientPollResponse.o().q());
                        if (clientPollResponse.o().v() == acv0.c) {
                            int iIntValue = ((Number) o7h.q0(((rbv0) sbv0Var).a)).intValue();
                            Iterator it2 = clientPollResponse.o().r().iterator();
                            int i5 = 0;
                            while (it2.hasNext()) {
                                if (((PollOption) it2.next()).o() == iIntValue) {
                                    i3 = i5;
                                    x6h1 x6h1VarC11 = y6h1Var3.c();
                                    x6h1VarC11.i.add(new a7h1("single_select_poll_card", strValueOf3, (Integer) null, str4, (String) null));
                                    x6h1VarC11.j = true;
                                    y6h1 y6h1VarA3 = x6h1VarC11.a();
                                    String strValueOf4 = String.valueOf(iIntValue);
                                    Integer numValueOf2 = Integer.valueOf(i3);
                                    x6h1 x6h1VarC12 = y6h1VarA3.c();
                                    x6h1VarC12.i.add(new a7h1("option_button", strValueOf4, numValueOf2, (String) null, (String) null));
                                    x6h1VarC12.j = false;
                                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("poll_vote", 2, Collections.singletonMap("poll_id", strValueOf3 != null ? strValueOf3 : "")), x6h1VarC12.a(), r6h1Var2, System.currentTimeMillis());
                                } else {
                                    i5++;
                                }
                            }
                            x6h1 x6h1VarC13 = y6h1Var3.c();
                            x6h1VarC13.i.add(new a7h1("single_select_poll_card", strValueOf3, (Integer) null, str4, (String) null));
                            x6h1VarC13.j = true;
                            y6h1 y6h1VarA4 = x6h1VarC13.a();
                            String strValueOf5 = String.valueOf(iIntValue);
                            Integer numValueOf3 = Integer.valueOf(i3);
                            x6h1 x6h1VarC14 = y6h1VarA4.c();
                            x6h1VarC14.i.add(new a7h1("option_button", strValueOf5, numValueOf3, (String) null, (String) null));
                            x6h1VarC14.j = false;
                            w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("poll_vote", 2, Collections.singletonMap("poll_id", strValueOf3 != null ? strValueOf3 : "")), x6h1VarC14.a(), r6h1Var2, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC15 = y6h1Var3.c();
                            x6h1VarC15.i.add(new a7h1("multi_select_poll_card", strValueOf3, (Integer) null, str4, (String) null));
                            x6h1VarC15.j = true;
                            x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                            x6h1VarC16.i.add(new a7h1("vote_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC16.j = false;
                            w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("poll_vote", 2, Collections.singletonMap("poll_id", strValueOf3 != null ? strValueOf3 : "")), x6h1VarC16.a(), r6h1Var2, System.currentTimeMillis());
                        }
                    }
                }
                return w7h1Var3;
            case 17:
                ((Number) obj3).intValue();
                return new x3l0(((afv0) obj).a, (r6h1) obj4);
            case 18:
                x3l0 x3l0Var = (x3l0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((yev0) obj4).a)), x3l0Var.b, x3l0Var.a, System.currentTimeMillis());
            case 19:
                ((Number) obj3).intValue();
                return new ppl0((r6h1) obj4);
            case 20:
                ((Number) obj3).intValue();
                return new ppl0((r6h1) obj4);
            case 21:
                ppl0 ppl0Var = (ppl0) obj;
                ajv0 ajv0Var = (ajv0) obj3;
                String str5 = ((viv0) obj2).a;
                if (fjv0.a[((qiv0) obj4).ordinal()] == 1) {
                    return ajv0Var.b ? ppl0Var.h(ihc1.V0(str5, ':', str5), str5, str5) : ppl0Var.e(ihc1.V0(str5, ':', str5), str5, str5);
                }
                eg.o();
                return null;
            case 22:
                ppl0 ppl0Var2 = (ppl0) obj;
                wiv0 wiv0Var = (wiv0) obj2;
                yiv0 yiv0Var = (yiv0) obj3;
                String str6 = wiv0Var.a;
                if (gjv0.a[((riv0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                int iC = l1d.C(yiv0Var.c);
                if (iC == 0) {
                    return ppl0Var2.e((String) o7h.A0(ihc1.P0(str6, new char[]{':'}, 6)), str6, str6);
                }
                if (iC == 1) {
                    return ppl0Var2.h((String) o7h.A0(ihc1.P0(str6, new char[]{':'}, 6)), str6, str6);
                }
                if (iC == 2) {
                    return ppl0Var2.a(wiv0Var.b);
                }
                eg.o();
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new ppl0((r6h1) obj4);
            case 24:
                ppl0 ppl0Var3 = (ppl0) obj;
                ziv0 ziv0Var = (ziv0) obj3;
                oiv0 oiv0Var = (oiv0) obj4;
                String str7 = ((uiv0) obj2).a;
                try {
                    m231Var = new y6b1(str7, false).e;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                String str8 = m231Var;
                String str9 = str8 != null ? str8 : "";
                if (!oiv0Var.equals(oiv0.a)) {
                    eg.o();
                    return null;
                }
                int iC2 = l1d.C(ziv0Var.a);
                if (iC2 == 0) {
                    w7h1VarE = ppl0Var3.e(str9, str7, str7);
                } else if (iC2 == 1) {
                    w7h1VarE = ppl0Var3.h(str9, str7, str7);
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    w7h1VarE = ppl0Var3.a(str7);
                }
                return w7h1VarE;
            case 25:
                xiv0 xiv0Var = (xiv0) obj2;
                ((Number) obj3).intValue();
                py9 py9Var = new py9((r6h1) obj4, (byte) 17);
                if (xiv0Var.equals(xiv0.a)) {
                    return new atk0(py9Var, 1);
                }
                if (xiv0Var.equals(xiv0.c)) {
                    return new atk0(py9Var, 2);
                }
                if (xiv0Var.equals(xiv0.b)) {
                    return new zsk0(py9Var);
                }
                eg.o();
                return null;
            case 26:
                return new wc3((Context) obj2, (byte) 9);
            case 27:
                return new wc3((d75) obj, (ViewGroup) obj3);
            case 28:
                rol0 rol0Var = (rol0) obj;
                dwv0 dwv0Var = (dwv0) obj4;
                r6h1 r6h1Var3 = rol0Var.a;
                y6h1 y6h1Var4 = rol0Var.b;
                if (dwv0Var.equals(cwv0.a)) {
                    x6h1 x6h1VarC17 = y6h1Var4.c();
                    x6h1VarC17.i.add(new a7h1("premium_linear_play_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination")), x6h1VarC17.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!dwv0Var.equals(bwv0.a)) {
                        if (dwv0Var.equals(awv0.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC18 = y6h1Var4.c();
                    x6h1VarC18.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination")), x6h1VarC18.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var4;
            default:
                gzv0 gzv0Var = (hzv0) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                if (!(gzv0Var instanceof gzv0)) {
                    return new z8s((byte) 5);
                }
                gzv0 gzv0Var2 = gzv0Var;
                return new ruk0(Integer.valueOf(gzv0Var2.m), gzv0Var2.c, r6h1Var4);
        }
    }
}
