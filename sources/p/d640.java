package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d640 extends hab0 implements zu30 {
    public static final d640 N0;
    public static final d640 O0;
    public static final d640 P0;
    public static final d640 Q0;
    public static final d640 R0;
    public static final d640 S0;
    public static final d640 T0;
    public static final d640 U0;
    public static final d640 V0;
    public static final d640 W0;
    public static final d640 X;
    public static final d640 X0;
    public static final d640 Y;
    public static final d640 Y0;
    public static final d640 Z;
    public static final d640 Z0;
    public static final d640 a1;
    public static final d640 b;
    public static final d640 b1;
    public static final d640 c;
    public static final d640 c1;
    public static final d640 d;
    public static final d640 d1;
    public static final d640 e;
    public static final d640 e1;
    public static final d640 f;
    public static final d640 g;
    public static final d640 h;
    public static final d640 i;
    public static final d640 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new d640(i2, (byte) 0);
        c = new d640(i2, (byte) 1);
        d = new d640(i2, (byte) 2);
        e = new d640(i2, (byte) 3);
        f = new d640(i2, (byte) 4);
        g = new d640(i2, (byte) 5);
        h = new d640(i2, (byte) 6);
        i = new d640(i2, (byte) 7);
        t = new d640(i2, (byte) 8);
        X = new d640(i2, (byte) 9);
        Y = new d640(i2, (byte) 10);
        Z = new d640(i2, (byte) 11);
        N0 = new d640(i2, (byte) 12);
        O0 = new d640(i2, (byte) 13);
        P0 = new d640(i2, (byte) 14);
        Q0 = new d640(i2, (byte) 15);
        R0 = new d640(i2, (byte) 16);
        S0 = new d640(i2, (byte) 17);
        T0 = new d640(i2, (byte) 18);
        U0 = new d640(i2, (byte) 19);
        V0 = new d640(i2, (byte) 20);
        W0 = new d640(i2, (byte) 21);
        X0 = new d640(i2, (byte) 22);
        Y0 = new d640(i2, (byte) 23);
        Z0 = new d640(i2, (byte) 24);
        a1 = new d640(i2, (byte) 25);
        b1 = new d640(i2, (byte) 26);
        c1 = new d640(i2, (byte) 27);
        d1 = new d640(i2, (byte) 28);
        e1 = new d640(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d640(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b2 = this.a;
        int i2 = 4;
        int i3 = 0;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                kjl0 kjl0Var = (kjl0) obj;
                y540 y540Var = (y540) obj2;
                if (!((a640) obj4).equals(a640.a)) {
                    eg.o();
                    return null;
                }
                String str = y540Var.a;
                x6h1 x6h1VarC = kjl0Var.b.c();
                x6h1VarC.i.add(new a7h1("explore_now_button", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), kjl0Var.a, System.currentTimeMillis());
            case 1:
                ((Number) obj3).intValue();
                return new dpl0((r6h1) obj4);
            case 2:
                dpl0 dpl0Var = (dpl0) obj;
                tnb1 tnb1Var = (tnb1) obj3;
                if (!((zwz) obj4).equals(zwz.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = dpl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("gated_content_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String str2 = tnb1Var.c;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, dpl0Var.a, System.currentTimeMillis());
            case 3:
                ((Number) obj3).intValue();
                return new frl0(2, (r6h1) obj4);
            case 4:
                frl0 frl0Var = (frl0) obj;
                if (((xd40) obj4).equals(ud40.a)) {
                    return frl0Var.h();
                }
                return null;
            case 5:
                ((Number) obj3).intValue();
                return new yql0(2, (r6h1) obj4);
            case 6:
                yql0 yql0Var = (yql0) obj;
                if (((lg40) obj4).equals(lg40.a)) {
                    return yql0Var.a("spotify:internal:magpie:update-generation-mode");
                }
                eg.o();
                return null;
            case 7:
                bwl0 bwl0Var = (bwl0) obj;
                ri40 ri40Var = (ri40) obj2;
                o940 o940Var = ri40Var.j;
                return (o940Var == null || !o940Var.a()) ? bwl0Var.a(ri40Var.a) : bwl0Var.i();
            case 8:
                wvl0 wvl0Var = (wvl0) obj;
                ri40 ri40Var2 = (ri40) obj2;
                o940 o940Var2 = ri40Var2.j;
                return (o940Var2 == null || !o940Var2.a()) ? wvl0Var.a(ri40Var2.a) : wvl0Var.i();
            case 9:
                jvl0 jvl0Var = (jvl0) obj;
                ej40 ej40Var = (ej40) obj2;
                o940 o940Var3 = ej40Var.h;
                return (o940Var3 == null || !o940Var3.a()) ? jvl0Var.a(ej40Var.a) : jvl0Var.j();
            case 10:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = r6h1.c;
                return new dxl0(new qrl0((byte) 4));
            case 11:
                dxl0 dxl0Var = (dxl0) obj;
                String str3 = my40.f;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), dxl0Var.a, r6h1.c, System.currentTimeMillis());
            case 12:
                ((Number) obj3).intValue();
                return new rcl0();
            case 13:
                rcl0 rcl0Var = (rcl0) obj;
                bz40 bz40Var = (bz40) obj3;
                az40 az40Var = (az40) obj4;
                if (az40Var.equals(zy40.a)) {
                    Set set = s4b1.f;
                    String strZ = uic.C(bz40Var.a, (String) null).z();
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ != null ? strZ : "")), rcl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                if (az40Var.equals(yy40.a)) {
                    return null;
                }
                eg.o();
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new m7l0(new o7l0());
            case 15:
                x6h1 x6h1VarC3 = ((m7l0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("view_request_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                String str4 = cfm0.i("spotify:graduation:view-request:", ((ea50) obj2).a.a, nik1.j4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new v9l0(((uc50) obj).a, (r6h1) obj4);
            case 17:
                ((Number) obj3).intValue();
                return new w9l0((r6h1) obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                w9l0 w9l0Var = (w9l0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), w9l0Var.b, w9l0Var.a, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((tf50) obj2).j)), ((bfl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 20:
                ((Number) obj3).intValue();
                return new dfl0(new tdl0((byte) 3), Integer.valueOf(((jg50) obj).e));
            case 21:
                y6h1 y6h1Var = ((dfl0) obj).a;
                return ((jg50) obj2).c ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                String str5 = ((si50) obj).a;
                Set set2 = pcf.a;
                return new bvk0(new nqk0(new bqk0("spotify:chat-details:".concat(str5), (byte) 22), (char) 0));
            case 23:
                bvk0 bvk0Var = (bvk0) obj;
                si50 si50Var = (si50) obj2;
                if (((ri50) obj4) != ri50.a) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = bvk0Var.a.c();
                x6h1VarC4.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pcf.l(si50Var.a))), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                String str6 = ((xi50) obj).a;
                Set set3 = pcf.a;
                return new zuk0(new avk0(new nqk0(new bqk0("spotify:chat-details:".concat(str6), (byte) 22), (char) 0)));
            case 25:
                zuk0 zuk0Var = (zuk0) obj;
                yi50 yi50Var = (yi50) obj3;
                if (((wi50) obj4).equals(wi50.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yi50Var.b)), zuk0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 26:
                nl50 nl50Var = (nl50) obj2;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                if ((nl50Var instanceof ml50) || (nl50Var instanceof ll50)) {
                    i2 = 1;
                } else {
                    if (!(nl50Var instanceof kl50)) {
                        eg.o();
                        return null;
                    }
                    List list = ((kl50) nl50Var).c;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            yk50 yk50Var = ((jl50) it.next()).e;
                            if (((yk50Var != null ? yk50Var.c : null) instanceof gl50) && (i3 = i3 + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    if (i3 > 1) {
                        i2 = 3;
                    } else if (i3 != 1) {
                        i2 = 2;
                    }
                }
                return new lcl0(i2, Integer.valueOf(iIntValue), nl50Var.i1(), r6h1Var2);
            case 27:
                lcl0 lcl0Var = (lcl0) obj;
                nl50 nl50Var2 = (nl50) obj3;
                dl50 dl50Var = (dl50) obj4;
                if (dl50Var instanceof zk50) {
                    if (!(nl50Var2 instanceof kl50)) {
                        return null;
                    }
                    String str7 = ((kl50) nl50Var2).b;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), lcl0Var.b, lcl0Var.a, System.currentTimeMillis());
                }
                if ((dl50Var instanceof cl50) || (dl50Var instanceof bl50) || (dl50Var instanceof al50)) {
                    return null;
                }
                eg.o();
                return null;
            case 28:
                ((Number) obj3).intValue();
                return new y9l0(((cm50) obj2).d.length() <= 0 ? 1 : 2, (r6h1) obj4);
            default:
                y9l0 y9l0Var = (y9l0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y9l0Var.b, y9l0Var.a, System.currentTimeMillis());
        }
    }
}
