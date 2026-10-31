package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yxl1 extends hab0 implements zu30 {
    public static final yxl1 N0;
    public static final yxl1 O0;
    public static final yxl1 P0;
    public static final yxl1 Q0;
    public static final yxl1 R0;
    public static final yxl1 S0;
    public static final yxl1 T0;
    public static final yxl1 U0;
    public static final yxl1 X;
    public static final yxl1 Y;
    public static final yxl1 Z;
    public static final yxl1 b;
    public static final yxl1 c;
    public static final yxl1 d;
    public static final yxl1 e;
    public static final yxl1 f;
    public static final yxl1 g;
    public static final yxl1 h;
    public static final yxl1 i;
    public static final yxl1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new yxl1(i2, (byte) 0);
        c = new yxl1(i2, (byte) 1);
        d = new yxl1(i2, (byte) 2);
        e = new yxl1(i2, (byte) 3);
        f = new yxl1(i2, (byte) 4);
        g = new yxl1(i2, (byte) 5);
        h = new yxl1(i2, (byte) 6);
        i = new yxl1(i2, (byte) 7);
        t = new yxl1(i2, (byte) 8);
        X = new yxl1(i2, (byte) 9);
        Y = new yxl1(i2, (byte) 10);
        Z = new yxl1(i2, (byte) 11);
        N0 = new yxl1(i2, (byte) 12);
        O0 = new yxl1(i2, (byte) 13);
        P0 = new yxl1(i2, (byte) 14);
        Q0 = new yxl1(i2, (byte) 15);
        R0 = new yxl1(i2, (byte) 16);
        S0 = new yxl1(i2, (byte) 17);
        T0 = new yxl1(i2, (byte) 18);
        U0 = new yxl1(i2, (byte) 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxl1(avl1 avl1Var, byte b2) {
        super(4);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        b1 b1Var;
        w7h1 w7h1Var5;
        pp70 pp70Var;
        pp70 pp70Var2;
        byte b2 = this.a;
        int i2 = 5;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var6 = null;
        switch (b2) {
            case 0:
                u3m0 u3m0Var = (u3m0) obj;
                String strI = cgj1.I(((wxl1) obj3).a);
                if (strI == null) {
                    return null;
                }
                x6h1 x6h1VarC = u3m0Var.b.c();
                x6h1VarC.i.add(new a7h1("make_it_yours_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strI)), x6h1VarC.a(), u3m0Var.a, System.currentTimeMillis());
            case 1:
                return new v3m0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 2:
                return null;
            case 3:
                ((Number) obj3).intValue();
                return new w3m0((r6h1) obj4);
            case 4:
                ((Number) obj3).intValue();
                return new x3m0((r6h1) obj4);
            case 5:
                x3m0 x3m0Var = (x3m0) obj;
                q5m1 q5m1Var = (q5m1) obj4;
                if (q5m1Var instanceof p5m1) {
                    return x3m0Var.h(1, 2);
                }
                if (q5m1Var instanceof o5m1) {
                    return x3m0Var.h(2, 1);
                }
                eg.o();
                return null;
            case 6:
                a7m1 a7m1Var = (a7m1) obj;
                r6h1 r6h1Var = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                String str = a7m1Var.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-wrapped-section";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.c = numValueOf;
                y6h1 y6h1VarA = x6h1VarI.a();
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                return new a4m0(a7m1Var.b, new r6h1(arrayList, r6h1Var.b));
            case 7:
                ((Number) obj3).intValue();
                return new m4m0(new c4m0((r6h1) obj4, (byte) 2));
            case 8:
                m4m0 m4m0Var = (m4m0) obj;
                abm1 abm1Var = (abm1) obj2;
                if (((yam1) obj4).equals(yam1.a)) {
                    String str2 = (String) abm1Var.a.q.get("wrapped.globalUri");
                    if (str2 != null) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), m4m0Var.a, m4m0Var.b.b, System.currentTimeMillis());
                    }
                } else {
                    eg.o();
                }
                return null;
            case 9:
                ((Number) obj3).intValue();
                return new o4m0();
            case 10:
                o4m0 o4m0Var = (o4m0) obj;
                gmm1 gmm1Var = (gmm1) obj4;
                y6h1 y6h1Var2 = o4m0Var.a;
                String str3 = ((w9p0) obj3).a;
                r6h1 r6h1VarB = o4m0Var.b();
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-xr-glasses-touch-controls";
                x6h1VarI2.f = "2.1.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                if (gmm1Var.equals(wlm1.a)) {
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str3 != null ? str3 : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!gmm1Var.equals(ulm1.a)) {
                        if (!gmm1Var.equals(dmm1.a)) {
                            if (gmm1Var.equals(fmm1.a)) {
                                x6h1 x6h1VarC3 = y6h1Var2.c();
                                x6h1VarC3.i.add(new a7h1("skip_previous_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC3.j = false;
                                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str3 == null ? "" : str3), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                            }
                            if (gmm1Var.equals(bmm1.a)) {
                                x6h1 x6h1VarC4 = y6h1Var2.c();
                                x6h1VarC4.i.add(new a7h1("skip_next_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC4.j = false;
                                y6h1 y6h1VarA3 = x6h1VarC4.a();
                                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                                String strValueOf = String.valueOf(15000);
                                w7h1Var3 = new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf != null ? strValueOf : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                            } else if (gmm1Var.equals(zlm1.a)) {
                                x6h1 x6h1VarC5 = y6h1Var2.c();
                                x6h1VarC5.i.add(new a7h1("skip_previous_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = false;
                                y6h1 y6h1VarA4 = x6h1VarC5.a();
                                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                                String strValueOf2 = String.valueOf(15000);
                                w7h1Var3 = new w7h1("", "", z7h1Var2, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf2 != null ? strValueOf2 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                            } else {
                                if (!gmm1Var.equals(slm1.a)) {
                                    if (gmm1Var.equals(vlm1.a)) {
                                        x6h1 x6h1VarC6 = y6h1VarA2.c();
                                        x6h1VarC6.i.add(new a7h1("play_pause_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC6.j = false;
                                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str3 != null ? str3 : "")), x6h1VarC6.a(), r6h1VarB, System.currentTimeMillis());
                                    } else if (gmm1Var.equals(tlm1.a)) {
                                        x6h1 x6h1VarC7 = y6h1VarA2.c();
                                        x6h1VarC7.i.add(new a7h1("play_pause_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC7.j = false;
                                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str3 != null ? str3 : "")), x6h1VarC7.a(), r6h1VarB, System.currentTimeMillis());
                                    } else if (gmm1Var.equals(cmm1.a)) {
                                        x6h1 x6h1VarC8 = y6h1VarA2.c();
                                        x6h1VarC8.i.add(new a7h1("skip_next_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC8.j = false;
                                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str3 == null ? "" : str3), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC8.a(), r6h1VarB, System.currentTimeMillis());
                                    } else if (gmm1Var.equals(emm1.a)) {
                                        x6h1 x6h1VarC9 = y6h1VarA2.c();
                                        x6h1VarC9.i.add(new a7h1("skip_previous_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC9.j = false;
                                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str3 == null ? "" : str3), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC9.a(), r6h1VarB, System.currentTimeMillis());
                                    } else if (gmm1Var.equals(amm1.a)) {
                                        x6h1 x6h1VarC10 = y6h1VarA2.c();
                                        x6h1VarC10.i.add(new a7h1("skip_next_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC10.j = false;
                                        y6h1 y6h1VarA5 = x6h1VarC10.a();
                                        z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                                        String strValueOf3 = String.valueOf(15000);
                                        w7h1Var = new w7h1("", "", z7h1Var3, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf3 != null ? strValueOf3 : "")), y6h1VarA5, r6h1VarB, System.currentTimeMillis());
                                    } else {
                                        if (!gmm1Var.equals(ylm1.a)) {
                                            return null;
                                        }
                                        x6h1 x6h1VarC11 = y6h1VarA2.c();
                                        x6h1VarC11.i.add(new a7h1("skip_previous_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC11.j = false;
                                        y6h1 y6h1VarA6 = x6h1VarC11.a();
                                        z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                                        String strValueOf4 = String.valueOf(15000);
                                        w7h1Var = new w7h1("", "", z7h1Var4, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf4 != null ? strValueOf4 : "")), y6h1VarA6, r6h1VarB, System.currentTimeMillis());
                                    }
                                    return w7h1Var;
                                }
                                x6h1 x6h1VarC12 = y6h1Var2.c();
                                x6h1VarC12.i.add(new a7h1("lyrics_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC12.j = false;
                                y6h1 y6h1VarA7 = x6h1VarC12.a();
                                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.G1("XRPROJECTED_LYRICS", "xrprojected/lyrics", 2248, "xrprojected").c)), y6h1VarA7, r6h1.c, System.currentTimeMillis());
                            }
                            return w7h1Var3;
                        }
                        x6h1 x6h1VarC13 = y6h1Var2.c();
                        x6h1VarC13.i.add(new a7h1("skip_next_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        y6h1 y6h1VarA8 = x6h1VarC13.a();
                        z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                        if (str3 == null) {
                            str3 = "";
                        }
                        w7h1Var2 = new w7h1("", "", z7h1Var5, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str3), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), y6h1VarA8, r6h1.c, System.currentTimeMillis());
                        return w7h1Var2;
                    }
                    x6h1 x6h1VarC14 = y6h1Var2.c();
                    x6h1VarC14.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str3 != null ? str3 : "")), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 11:
                aom1 aom1Var = (aom1) obj2;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                if (!(aom1Var instanceof tnm1)) {
                    if (aom1Var instanceof vnm1) {
                        i2 = 4;
                    } else if (aom1Var instanceof snm1) {
                        i2 = 2;
                    } else if (aom1Var instanceof rnm1) {
                        i2 = 1;
                    } else {
                        i2 = aom1Var instanceof unm1 ? 6 : 3;
                    }
                }
                return new mcl0(i2, Integer.valueOf(iIntValue), r6h1Var3);
            case 12:
                mcl0 mcl0Var = (mcl0) obj;
                pnm1 pnm1Var = (pnm1) obj4;
                if ((pnm1Var instanceof mnm1) || (pnm1Var instanceof nnm1) || (pnm1Var instanceof onm1)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), mcl0Var.b, mcl0Var.a, System.currentTimeMillis());
                }
                if ((pnm1Var instanceof jnm1) || (pnm1Var instanceof lnm1) || (pnm1Var instanceof hnm1) || (pnm1Var instanceof knm1) || (pnm1Var instanceof inm1)) {
                    return null;
                }
                eg.o();
                return null;
            case 13:
                ((Number) obj3).intValue();
                return ((gym1) obj).f.a;
            case 14:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return new jgl0(new rrk0(yon1.W2().c, nik1.O2.a, r6h1.c));
            case 15:
                y6h1 y6h1Var4 = ((jgl0) obj).a;
                int iOrdinal = ((v0n1) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC15 = y6h1Var4.c();
                    x6h1VarC15.i.add(new a7h1("empty_view_action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home?facet=music-following-chip")), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC16 = y6h1Var4.c();
                x6h1VarC16.i.add(new a7h1("empty_view_action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home?facet=podcasts-following-chip")), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
            case 16:
                n2n1 n2n1Var = (n2n1) obj;
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                bal0 bal0Var = new bal0(new rrk0(yon1.W2().c, nik1.O2.a, r6h1.c));
                kjo0 kjo0Var = n2n1Var.b;
                return new ngl0(bal0Var, kjo0Var.a, Integer.valueOf(n2n1Var.a), kjo0Var.d.a);
            case 17:
                n2n1 n2n1Var2 = (n2n1) obj2;
                y6h1 y6h1Var5 = ((ngl0) obj).a;
                int i3 = n2n1Var2.a;
                kjo0 kjo0Var2 = n2n1Var2.b;
                int iOrdinal2 = ((m2n1) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    String str4 = kjo0Var2.d.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1Var5, r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal2 == 1) {
                    return null;
                }
                if (iOrdinal2 == 2) {
                    String str5 = kjo0Var2.a;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    x6h1 x6h1VarC17 = y6h1Var5.c();
                    x6h1VarC17.i.add(new a7h1("context_menu_button", str5, numValueOf2, (String) null, (String) null));
                    x6h1VarC17.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal2 != 3) {
                    eg.o();
                    return null;
                }
                String str6 = kjo0Var2.a;
                Integer numValueOf3 = Integer.valueOf(i3);
                x6h1 x6h1VarC18 = y6h1Var5.c();
                x6h1VarC18.i.add(new a7h1("swipe_to_delete", str6, numValueOf3, (String) null, (String) null));
                x6h1VarC18.j = false;
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
            case 18:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                return new lgl0(new rrk0(yon1.W2().c, nik1.O2.a, r6h1.c));
            case 19:
                lgl0 lgl0Var = (lgl0) obj;
                if (d3n1.a[((a3n1) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC19 = lgl0Var.a.c();
                x6h1VarC19.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
            case 20:
                b4l0 b4l0Var = (n8h1) obj;
                c1 c1Var = (c1) obj2;
                h1 h1Var = (h1) obj3;
                f1 f1Var = (f1) obj4;
                b1 b1Var2 = c1Var.d;
                b1 b1Var3 = c1Var.c;
                String str7 = c1Var.a;
                d1 d1Var = d1.a;
                boolean zJ = u890.j(f1Var, d1Var);
                e1 e1Var = e1.a;
                if (zJ) {
                    b1Var = b1Var3;
                } else {
                    if (!u890.j(f1Var, e1Var)) {
                        eg.o();
                        return null;
                    }
                    b1Var = b1Var2;
                }
                String str8 = h1Var.d;
                if ((b1Var instanceof z0) && ihc1.y0(str8)) {
                    return null;
                }
                if (!(b4l0Var instanceof b4l0)) {
                    if (b4l0Var instanceof yyl0) {
                        return ((yyl0) b4l0Var).a(s1.f(b1Var3, str7));
                    }
                    if (b4l0Var instanceof e6l0) {
                        return ((e6l0) b4l0Var).a(s1.f(b1Var3, str7));
                    }
                    return null;
                }
                if (f1Var.equals(d1Var)) {
                    return b4l0Var.a(s1.f(b1Var3, str7));
                }
                if (!f1Var.equals(e1Var)) {
                    eg.o();
                    return null;
                }
                b4l0 b4l0Var2 = b4l0Var;
                x6h1 x6h1VarC20 = b4l0Var2.b.c();
                x6h1VarC20.i.add(new a7h1("description_label", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", s1.f(b1Var2, str7))), x6h1VarC20.a(), b4l0Var2.a, System.currentTimeMillis());
            case 21:
                xpk0 xpk0Var = (xpk0) obj;
                y6h1 y6h1Var6 = xpk0Var.a;
                r6h1 r6h1Var4 = xpk0Var.b.b;
                ji0 ji0Var = ((zr0) obj2).a;
                int iOrdinal3 = ((mdo) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    String str9 = ji0Var.e;
                    Set set = s4b1.f;
                    w7h1Var5 = !uic.u(str9) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str9)), y6h1Var6, r6h1Var4, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9)), y6h1Var6, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    String str10 = ji0Var.h;
                    String str11 = ji0Var.W0;
                    String str12 = ji0Var.b;
                    x6h1 x6h1VarC21 = y6h1Var6.c();
                    x6h1VarC21.i.add(new a7h1("cta_button", str10, (Integer) null, str12, str11));
                    x6h1VarC21.j = false;
                    y6h1 y6h1VarA9 = x6h1VarC21.a();
                    String str13 = ji0Var.e;
                    Set set2 = s4b1.f;
                    w7h1Var5 = !uic.u(str13) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str13)), y6h1VarA9, r6h1Var4, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13)), y6h1VarA9, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 22:
                x6h1 x6h1VarC22 = ((o7l0) obj).a.c();
                x6h1VarC22.i.add(new a7h1("add_to_plan_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = false;
                y6h1 y6h1VarA10 = x6h1VarC22.a();
                String str14 = nik1.c6.b("spotify:internal:add-child-plan-member:".concat(((z71) obj2).a)).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str14 != null ? str14 : "")), y6h1VarA10, r6h1.c, System.currentTimeMillis());
            case 23:
                m8l0 m8l0Var = (m8l0) obj;
                ld1 ld1Var = (ld1) obj2;
                if (((kd1) obj4).equals(kd1.a)) {
                    String strE = md1.e(ld1Var);
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE != null ? strE : "")), m8l0Var.a, m8l0Var.b.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var6;
            case 24:
                ((Number) obj3).intValue();
                return new xll0(new fjl0((r6h1) obj4, (byte) 5), u890.j(((t72) obj2).a, Boolean.TRUE) ? 1 : 2);
            case 25:
                pqk0 pqk0Var = (pqk0) obj;
                if (((j73) obj4).equals(j73.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", bbm.a(2))), pqk0Var.a, pqk0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 26:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                jo70 jo70Var2 = (jo70) obj3;
                xkk1 xkk1Var2 = (xkk1) obj4;
                String str15 = jo70Var != null ? jo70Var.a : null;
                String str16 = jo70Var2 != null ? jo70Var2.a : null;
                w7h1 u7hVar = (xkk1Var == null || (pp70Var2 = xkk1Var.a.b) == null) ? null : new u7h(pp70Var2.c.a.b.a());
                if (xkk1Var2 != null && (pp70Var = xkk1Var2.a.b) != null) {
                    w7h1Var6 = new u7h(pp70Var.c.a.b.a());
                }
                if (u7hVar != null && w7h1Var6 != null) {
                    long j = ((u7h) u7hVar).a;
                    long j2 = ((u7h) w7h1Var6).a;
                    u7hVar = new u7h(z4p1.h((u7h.g(j2) + u7h.g(j)) / 2.0f, (u7h.f(j2) + u7h.f(j)) / 2.0f, (u7h.d(j2) + u7h.d(j)) / 2.0f, (u7h.c(j2) + u7h.c(j)) / 2.0f, 16));
                } else if (u7hVar == null) {
                    u7hVar = w7h1Var6;
                }
                return new hm6(str15, str16, u7hVar);
            case 27:
                idl0 idl0Var = (idl0) obj;
                gx6 gx6Var = (gx6) obj2;
                if (((yw6) obj4).equals(yw6.a)) {
                    String str17 = gx6Var.a;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str17 != null ? str17 : "")), idl0Var.b, idl0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var6;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue2 = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1503112354);
                ven0 ven0VarS = v8r.s((d87) obj2, x340Var);
                boolean zI = x340Var.i(ven0VarS);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new vd2(ven0VarS, (lnm) null, (byte) 2);
                    x340Var.s0(objT);
                }
                jjm0Var.a((zu30) objT, x340Var, (iIntValue2 << 3) & 112);
                d87 d87Var = (d87) ven0VarS.getValue();
                yrd yrdVar = d87Var.a;
                String str18 = yrdVar.a;
                String str19 = yrdVar.e;
                e87 e87Var = new e87(str18, str19, u890.j(str19, d87Var.b));
                x340Var.r(false);
                return e87Var;
            default:
                ((Number) obj4).intValue();
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(-678336908);
                h87 h87VarF = i87.f((g87) v8r.s((g87) obj2, x340Var2).getValue());
                x340Var2.r(false);
                return h87VarF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxl1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
