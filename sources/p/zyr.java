package p;

import android.content.Context;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zyr extends hab0 implements zu30 {
    public static final zyr N0;
    public static final zyr O0;
    public static final zyr P0;
    public static final zyr Q0;
    public static final zyr R0;
    public static final zyr S0;
    public static final zyr T0;
    public static final zyr U0;
    public static final zyr V0;
    public static final zyr W0;
    public static final zyr X;
    public static final zyr X0;
    public static final zyr Y;
    public static final zyr Y0;
    public static final zyr Z;
    public static final zyr Z0;
    public static final zyr a1;
    public static final zyr b;
    public static final zyr b1;
    public static final zyr c;
    public static final zyr c1;
    public static final zyr d;
    public static final zyr d1;
    public static final zyr e;
    public static final zyr e1;
    public static final zyr f;
    public static final zyr g;
    public static final zyr h;
    public static final zyr i;
    public static final zyr t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new zyr(i2, (byte) 0);
        c = new zyr(i2, (byte) 1);
        d = new zyr(i2, (byte) 2);
        e = new zyr(i2, (byte) 3);
        f = new zyr(i2, (byte) 4);
        g = new zyr(i2, (byte) 5);
        h = new zyr(i2, (byte) 6);
        i = new zyr(i2, (byte) 7);
        t = new zyr(i2, (byte) 8);
        X = new zyr(i2, (byte) 9);
        Y = new zyr(i2, (byte) 10);
        Z = new zyr(i2, (byte) 11);
        N0 = new zyr(i2, (byte) 12);
        O0 = new zyr(i2, (byte) 13);
        P0 = new zyr(i2, (byte) 14);
        Q0 = new zyr(i2, (byte) 15);
        R0 = new zyr(i2, (byte) 16);
        S0 = new zyr(i2, (byte) 17);
        T0 = new zyr(i2, (byte) 18);
        U0 = new zyr(i2, (byte) 19);
        V0 = new zyr(i2, (byte) 20);
        W0 = new zyr(i2, (byte) 21);
        X0 = new zyr(i2, (byte) 22);
        Y0 = new zyr(i2, (byte) 23);
        Z0 = new zyr(i2, (byte) 24);
        a1 = new zyr(i2, (byte) 25);
        b1 = new zyr(i2, (byte) 26);
        c1 = new zyr(i2, (byte) 27);
        d1 = new zyr(i2, (byte) 28);
        e1 = new zyr(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyr(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        int i2;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        a3t0 a3t0Var;
        int i3;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                y920 y920Var = (y920) obj;
                ((Number) obj3).intValue();
                return new g5m0(1, Integer.valueOf(y920Var.b), y920Var.a.a, (r6h1) obj4);
            case 1:
                g5m0 g5m0Var = (g5m0) obj;
                int iOrdinal = ((x920) obj4).ordinal();
                if (iOrdinal == 0) {
                    return g5m0Var.h();
                }
                if (iOrdinal == 1) {
                    return g5m0Var.h();
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new xqk0((r6h1) obj4);
            case 3:
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new o5m0((r6h1) obj4);
            case 5:
                ((Number) obj3).intValue();
                return new m5m0(new c4m0((r6h1) obj4, (byte) 5));
            case 6:
                m5m0 m5m0Var = (m5m0) obj;
                d960 d960Var = (d960) obj3;
                if (y0s.a[((a960) obj4).ordinal()] == 1) {
                    String str = d960Var.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("hide_entity", 1, Collections.singletonMap("entity_to_hide", str != null ? str : "")), m5m0Var.a, m5m0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 7:
                return new b5m0(Integer.valueOf(((Number) obj3).intValue()), ((og60) obj).a, (r6h1) obj4);
            case 8:
                b5m0 b5m0Var = (b5m0) obj;
                og60 og60Var = (og60) obj2;
                r6h1 r6h1Var = b5m0Var.a;
                y6h1 y6h1Var = b5m0Var.b;
                int iOrdinal2 = ((ng60) obj4).ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("call_to_action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str2 = og60Var.b;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 9:
                ((Number) obj3).intValue();
                c4m0 c4m0Var = new c4m0((r6h1) obj4, (byte) 4);
                switch (((dhy) obj2).b.a.ordinal()) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 9;
                        break;
                    case 2:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 10;
                        break;
                    case 6:
                        i2 = 11;
                        break;
                    case 7:
                        i2 = 4;
                        break;
                    case 8:
                        i2 = 5;
                        break;
                    case 9:
                        i2 = 7;
                        break;
                    case 10:
                        i2 = 8;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return new i5m0(c4m0Var, i2);
            case 10:
                i5m0 i5m0Var = (i5m0) obj;
                o6a o6aVar = (o6a) obj4;
                r6h1 r6h1Var2 = i5m0Var.b.b;
                y6h1 y6h1Var2 = i5m0Var.a;
                n6c0 n6c0Var = ((dhy) obj3).b;
                if (o6aVar instanceof l6a) {
                    return null;
                }
                if (o6aVar instanceof m6a) {
                    sco scoVar = n6c0Var.d;
                    String str3 = scoVar != null ? scoVar.b : null;
                    switch (n6c0Var.a.ordinal()) {
                        case 0:
                            return null;
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            sco scoVar2 = n6c0Var.d;
                            int i4 = scoVar2 != null ? scoVar2.c : 0;
                            int i5 = i4 == 0 ? -1 : m5s.a[l1d.C(i4)];
                            if (i5 == -1) {
                                x6h1 x6h1VarC3 = y6h1Var2.c();
                                x6h1VarC3.i.add(new a7h1("review_details_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC3.j = false;
                                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                            } else if (i5 == 1) {
                                x6h1 x6h1VarC4 = y6h1Var2.c();
                                x6h1VarC4.i.add(new a7h1("review_details_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC4.j = false;
                                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                            } else {
                                if (i5 != 2) {
                                    eg.o();
                                    return null;
                                }
                                x6h1 x6h1VarC5 = y6h1Var2.c();
                                x6h1VarC5.i.add(new a7h1("review_details_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = false;
                                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                            }
                            break;
                        case 2:
                            x6h1 x6h1VarC6 = y6h1Var2.c();
                            x6h1VarC6.i.add(new a7h1("try_another_import_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                } else if (o6aVar instanceof n6a) {
                    int iOrdinal3 = n6c0Var.a.ordinal();
                    if (iOrdinal3 == 8 || iOrdinal3 == 10) {
                        x6h1 x6h1VarC7 = y6h1Var2.c();
                        x6h1VarC7.i.add(new a7h1("dont_show_this_again_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC8 = y6h1Var2.c();
                        x6h1VarC8.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else {
                    if (!(o6aVar instanceof k6a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                wwi0 wwi0Var = (wwi0) obj4;
                y6h1 y6h1Var3 = ((eyk0) obj).a;
                if (wwi0Var.equals(twi0.a)) {
                    x6h1 x6h1VarC10 = y6h1Var3.c();
                    x6h1VarC10.i.add(new a7h1("recommended_action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = true;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!wwi0Var.equals(uwi0.a)) {
                        if (!wwi0Var.equals(vwi0.a)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC11 = y6h1Var3.c();
                        x6h1VarC11.i.add(new a7h1("expand_collapse_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = true;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC12 = y6h1Var3.c();
                    x6h1VarC12.i.add(new a7h1("dismiss_message_box", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = true;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 12:
                ((Number) obj3).intValue();
                String requestId = ((o8j0) obj).a.getRequestId();
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-in-app-message";
                x6h1VarI.f = "11.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = requestId;
                y6h1 y6h1VarA2 = x6h1VarI.a();
                Collections.singletonList("inappmessage");
                r6h1 r6h1Var3 = r6h1.c;
                return new jal0(new r6h1(kk0.l(y6h1VarA2), (u8h1) null));
            case 13:
                ((Number) obj3).intValue();
                return new cal0(((y8j0) obj).a.getRequestId());
            case 14:
                ((Number) obj3).intValue();
                return new kal0(((fbj0) obj).a.getRequestId());
            case 15:
                ((Number) obj3).intValue();
                String requestId2 = ((lbj0) obj).a.getRequestId();
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-in-app-message";
                x6h1VarI2.f = "11.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.e = requestId2;
                y6h1 y6h1VarA3 = x6h1VarI2.a();
                Collections.singletonList("inappmessage");
                r6h1 r6h1Var4 = r6h1.c;
                return new ial0(new r6h1(kk0.l(y6h1VarA3), (u8h1) null));
            case 16:
                ((Number) obj3).intValue();
                return new lal0(((jdj0) obj).a.getRequestId());
            case 17:
                ((Number) obj3).intValue();
                String requestId3 = ((pfj0) obj).a.getRequestId();
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-in-app-message";
                x6h1VarI3.f = "11.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.e = requestId3;
                y6h1 y6h1VarA4 = x6h1VarI3.a();
                Collections.singletonList("inappmessage");
                r6h1 r6h1Var5 = r6h1.c;
                return new mal0(new r6h1(kk0.l(y6h1VarA4), (u8h1) null));
            case 18:
                ((Number) obj3).intValue();
                String requestId4 = ((zfj0) obj).a.getRequestId();
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-in-app-message";
                x6h1VarI4.f = "11.0.0";
                x6h1VarI4.g = "22.0.0";
                x6h1VarI4.e = requestId4;
                y6h1 y6h1VarA5 = x6h1VarI4.a();
                Collections.singletonList("inappmessage");
                r6h1 r6h1Var6 = r6h1.c;
                return new nal0(new r6h1(kk0.l(y6h1VarA5), (u8h1) null));
            case 19:
                return new b14((Context) obj2, (iu30) obj4);
            case 20:
                ((Number) obj3).intValue();
                return new oal0(((thj0) obj).a.getRequestId());
            case 21:
                lhj0 lhj0Var = (lhj0) obj4;
                String requestId5 = ((thj0) obj2).a.getRequestId();
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-in-app-message-webview";
                x6h1VarI5.f = "2.0.0";
                x6h1VarI5.g = "22.0.0";
                x6h1VarI5.e = requestId5;
                y6h1 y6h1VarA6 = x6h1VarI5.a();
                Collections.singletonList("inappmessage/webview");
                if (lhj0Var.equals(chj0.a)) {
                    x6h1 x6h1VarC13 = y6h1VarA6.c();
                    x6h1VarC13.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (lhj0Var.equals(ghj0.a)) {
                        x6h1 x6h1VarC14 = y6h1VarA6.c();
                        x6h1VarC14.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (lhj0Var.equals(ahj0.a)) {
                        x6h1 x6h1VarC15 = y6h1VarA6.c();
                        x6h1VarC15.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!(lhj0Var instanceof jhj0)) {
                            return null;
                        }
                        x6h1 x6h1VarC16 = y6h1VarA6.c();
                        x6h1VarC16.i.add(new a7h1("close_url", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var4;
            case 22:
                ((Number) obj3).intValue();
                return new n5m0((r6h1) obj4);
            case 23:
                n5m0 n5m0Var = (n5m0) obj;
                dom0 dom0Var = (dom0) obj4;
                r6h1 r6h1Var7 = n5m0Var.a;
                y6h1 y6h1Var9 = n5m0Var.b;
                if (dom0Var.equals(bom0.a)) {
                    x6h1 x6h1VarC17 = y6h1Var9.c();
                    x6h1VarC17.i.add(new a7h1("create_folder", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1Var7, System.currentTimeMillis());
                } else {
                    if (!(dom0Var instanceof com0)) {
                        eg.o();
                        return null;
                    }
                    com0 com0Var = (com0) dom0Var;
                    Integer numValueOf = Integer.valueOf(com0Var.c);
                    String str4 = com0Var.a;
                    x6h1 x6h1VarC18 = y6h1Var9.c();
                    x6h1VarC18.i.add(new a7h1("folder_item", (String) null, numValueOf, str4, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC18.a(), r6h1Var7, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 24:
                ((Number) obj3).intValue();
                return new n5m0((r6h1) obj4);
            case 25:
                n5m0 n5m0Var2 = (n5m0) obj;
                wom0 wom0Var = (xom0) obj4;
                r6h1 r6h1Var8 = n5m0Var2.a;
                y6h1 y6h1Var10 = n5m0Var2.b;
                if (wom0Var instanceof tom0) {
                    tom0 tom0Var = (tom0) wom0Var;
                    Integer numValueOf2 = Integer.valueOf(tom0Var.c);
                    String str5 = tom0Var.a;
                    x6h1 x6h1VarC19 = y6h1Var10.c();
                    x6h1VarC19.i.add(new a7h1("folder_item", (String) null, numValueOf2, str5, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC19.a(), r6h1Var8, System.currentTimeMillis());
                } else if (wom0Var instanceof wom0) {
                    String str6 = wom0Var.a;
                    x6h1 x6h1VarC20 = y6h1Var10.c();
                    x6h1VarC20.i.add(new a7h1("folder_item", (String) null, 0, str6, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC20.a(), r6h1Var8, System.currentTimeMillis());
                } else {
                    if (!wom0Var.equals(som0.a)) {
                        if (wom0Var.equals(rom0.a) || wom0Var.equals(vom0.a) || wom0Var.equals(uom0.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC21 = y6h1Var10.c();
                    x6h1VarC21.i.add(new a7h1("create_folder", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1Var8, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 26:
                ((Number) obj3).intValue();
                return new y6l0(new g5l0((r6h1) obj4, (byte) 5), ((j3n0) obj).e ? 1 : 2);
            case 27:
                y6l0 y6l0Var = (y6l0) obj;
                x6h1 x6h1VarC22 = y6l0Var.a.c();
                x6h1VarC22.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = false;
                y6h1 y6h1VarA7 = x6h1VarC22.a();
                String str7 = ((i3n0) obj4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), y6h1VarA7, y6l0Var.b.b, System.currentTimeMillis());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                x2t0 x2t0Var = (x2t0) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var9 = (r6h1) obj4;
                v2t0 v2t0Var = x2t0Var instanceof v2t0 ? (v2t0) x2t0Var : null;
                if (v2t0Var == null || (a3t0Var = v2t0Var.b) == null) {
                    a3t0Var = a3t0.b;
                }
                int iOrdinal4 = a3t0Var.ordinal();
                if (iOrdinal4 == 0) {
                    i3 = 3;
                } else if (iOrdinal4 == 1) {
                    i3 = 2;
                } else {
                    if (iOrdinal4 != 2) {
                        eg.o();
                        return null;
                    }
                    i3 = 1;
                }
                return new p5m0(i3, r6h1Var9);
            default:
                p5m0 p5m0Var = (p5m0) obj;
                t2t0 t2t0Var = (t2t0) obj4;
                if (t2t0Var.equals(s2t0.a)) {
                    x6h1 x6h1VarC23 = p5m0Var.b.c();
                    x6h1VarC23.i.add(new a7h1("layout_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), p5m0Var.a, System.currentTimeMillis());
                }
                if (t2t0Var.equals(r2t0.a)) {
                    return null;
                }
                eg.o();
                return null;
        }
    }
}
