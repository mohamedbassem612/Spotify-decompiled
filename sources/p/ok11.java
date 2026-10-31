package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ok11 extends hab0 implements zu30 {
    public static final ok11 N0;
    public static final ok11 O0;
    public static final ok11 P0;
    public static final ok11 Q0;
    public static final ok11 R0;
    public static final ok11 S0;
    public static final ok11 T0;
    public static final ok11 U0;
    public static final ok11 V0;
    public static final ok11 W0;
    public static final ok11 X;
    public static final ok11 X0;
    public static final ok11 Y;
    public static final ok11 Y0;
    public static final ok11 Z;
    public static final ok11 Z0;
    public static final ok11 a1;
    public static final ok11 b;
    public static final ok11 b1;
    public static final ok11 c;
    public static final ok11 c1;
    public static final ok11 d;
    public static final ok11 d1;
    public static final ok11 e;
    public static final ok11 e1;
    public static final ok11 f;
    public static final ok11 g;
    public static final ok11 h;
    public static final ok11 i;
    public static final ok11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new ok11(i2, (byte) 0);
        c = new ok11(i2, (byte) 1);
        d = new ok11(i2, (byte) 2);
        e = new ok11(i2, (byte) 3);
        f = new ok11(i2, (byte) 4);
        g = new ok11(i2, (byte) 5);
        h = new ok11(i2, (byte) 6);
        i = new ok11(i2, (byte) 7);
        t = new ok11(i2, (byte) 8);
        X = new ok11(i2, (byte) 9);
        Y = new ok11(i2, (byte) 10);
        Z = new ok11(i2, (byte) 11);
        N0 = new ok11(i2, (byte) 12);
        O0 = new ok11(i2, (byte) 13);
        P0 = new ok11(i2, (byte) 14);
        Q0 = new ok11(i2, (byte) 15);
        R0 = new ok11(i2, (byte) 16);
        S0 = new ok11(i2, (byte) 17);
        T0 = new ok11(i2, (byte) 18);
        U0 = new ok11(i2, (byte) 19);
        V0 = new ok11(i2, (byte) 20);
        W0 = new ok11(i2, (byte) 21);
        X0 = new ok11(i2, (byte) 22);
        Y0 = new ok11(i2, (byte) 23);
        Z0 = new ok11(i2, (byte) 24);
        a1 = new ok11(i2, (byte) 25);
        b1 = new ok11(i2, (byte) 26);
        c1 = new ok11(i2, (byte) 27);
        d1 = new ok11(i2, (byte) 28);
        e1 = new ok11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x03bd  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        String strValueOf;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        boolean z = false;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return ((pul0) obj).a(((mk11) obj4).a);
            case 1:
                return new oul0(Integer.valueOf(((Number) obj3).intValue()), ((wk11) obj).a, (r6h1) obj4);
            case 2:
                return null;
            case 3:
                return new nul0(Integer.valueOf(((Number) obj3).intValue()), ((bl11) obj).a, (r6h1) obj4);
            case 4:
                return null;
            case 5:
                return new fsl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 6:
                fsl0 fsl0Var = (fsl0) obj;
                zl11 zl11Var = (zl11) obj3;
                vl11 vl11Var = (xl11) obj4;
                r6h1 r6h1Var = fsl0Var.a;
                y6h1 y6h1Var = fsl0Var.b;
                String str2 = zl11Var.a;
                if (vl11Var.equals(ul11.a)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str2 != null ? str2 : "")), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (vl11Var instanceof vl11) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    int i3 = (int) vl11Var.a;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf2 = String.valueOf(i3);
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf2 != null ? strValueOf2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!vl11Var.equals(wl11.a)) {
                        eg.o();
                        return null;
                    }
                    if (zl11Var.i) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("add_to_library_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str2 != null ? str2 : "")), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("add_to_library_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str2 != null ? str2 : "")), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 7:
                ((Number) obj3).intValue();
                return new mul0(((ley0) obj).a, (r6h1) obj4);
            case 8:
                mul0 mul0Var = (mul0) obj;
                String str3 = ((ley0) obj2).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), mul0Var.b, mul0Var.a, System.currentTimeMillis());
            case 9:
                return new syl0(Integer.valueOf(((Number) obj3).intValue()), "more_by", "unranked", (r6h1) obj4);
            case 10:
                return null;
            case 11:
                dwl0 dwl0Var = (dwl0) obj;
                String str4 = ((sm11) obj2).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), dwl0Var.a, r6h1.c, System.currentTimeMillis());
            case 12:
                kxk0 kxk0Var = (kxk0) obj;
                zm11 zm11Var = (zm11) obj2;
                if (((xm11) obj4) instanceof xm11) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", zm11Var.a)), kxk0Var.b, kxk0Var.a, System.currentTimeMillis());
                }
                return null;
            case 13:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 14:
                ill0 ill0Var = (ill0) obj;
                xr11 xr11Var = (xr11) obj3;
                kr11 kr11Var = (kr11) obj4;
                String str5 = ((qr11) obj2).a;
                if (kr11Var instanceof ir11) {
                    return ill0Var.e(str5);
                }
                boolean z2 = kr11Var instanceof jr11;
                if (z2 && (xr11Var instanceof wr11)) {
                    return ill0Var.i(str5);
                }
                if (z2 && (xr11Var instanceof sr11)) {
                    return ill0Var.l();
                }
                if (z2 && (xr11Var instanceof tr11)) {
                    return ill0Var.j(str5);
                }
                if (z2) {
                    return ill0Var.h(str5);
                }
                return null;
            case 15:
                return new nyk0(Integer.valueOf(((Number) obj3).intValue()), ((uv11) obj).a, (r6h1) obj4);
            case 16:
                return new rul0(Integer.valueOf(((Number) obj3).intValue()), ((gt11) obj).a, (r6h1) obj4);
            case 17:
                rul0 rul0Var = (rul0) obj;
                gt11 gt11Var = (gt11) obj2;
                if (((et11) obj4) == et11.a) {
                    return rul0Var.a(gt11Var.a);
                }
                eg.o();
                return null;
            case 18:
                km61 km61Var = (km61) obj;
                Integer num = (Integer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                boolean z3 = num != null && iIntValue > num.intValue();
                boolean z4 = iIntValue == 5;
                if (z3 && z4) {
                    km61.a(km61Var, "losslessRemoteWarning", null, false, 6);
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = r6h1.c;
                return new sul0(new qgl0(new qrl0((byte) 2)), Integer.valueOf(((x121) obj).a));
            case 20:
                x121 x121Var = (x121) obj2;
                y6h1 y6h1Var2 = ((sul0) obj).a;
                String str6 = x121Var.b;
                m0u m0uVar = x121Var.c;
                rw21 rw21Var = m0uVar.d;
                ept eptVar = m0uVar.c;
                int iC = l1d.C(rw21Var.b);
                if (iC == 0) {
                    str = eptVar.c;
                    strValueOf = String.valueOf((int) eptVar.b.a);
                    String strValueOf3 = String.valueOf(eptVar.e);
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str6 == null) {
                        str6 = "";
                    }
                    mmr0 mmr0Var = new mmr0("item_to_download", str6);
                    if (str == null) {
                        str = "";
                    }
                    mmr0 mmr0Var2 = new mmr0("remote_device_id", str);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var2, new x7h1("download_to_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("remote_device_type", strValueOf), new mmr0("remote_client_platform", strValueOf3 != null ? strValueOf3 : "")})), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else if (iC == 1 || iC == 2 || iC == 3) {
                    String str7 = eptVar.c;
                    String strValueOf4 = String.valueOf((int) eptVar.b.a);
                    String strValueOf5 = String.valueOf(eptVar.e);
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (str6 == null) {
                        str6 = "";
                    }
                    mmr0 mmr0Var3 = new mmr0("item_to_stop_download", str6);
                    if (str7 == null) {
                        str7 = "";
                    }
                    mmr0 mmr0Var4 = new mmr0("remote_device_id", str7);
                    if (strValueOf4 == null) {
                        strValueOf4 = "";
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var3, new x7h1("stop_download_to_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("remote_device_type", strValueOf4), new mmr0("remote_client_platform", strValueOf5 != null ? strValueOf5 : "")})), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else if (iC != 4) {
                    if (iC != 5) {
                        eg.o();
                        return null;
                    }
                    str = eptVar.c;
                    strValueOf = String.valueOf((int) eptVar.b.a);
                    String strValueOf6 = String.valueOf(eptVar.e);
                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                    if (str6 == null) {
                        str6 = "";
                    }
                    mmr0 mmr0Var5 = new mmr0("item_to_download", str6);
                    if (str == null) {
                        str = "";
                    }
                    mmr0 mmr0Var6 = new mmr0("remote_device_id", str);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var4, new x7h1("download_to_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var5, mmr0Var6, new mmr0("remote_device_type", strValueOf), new mmr0("remote_client_platform", strValueOf6 != null ? strValueOf6 : "")})), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 21:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 22:
                ((Number) obj3).intValue();
                return new jol0(new fjl0((r6h1) obj4, (byte) 22));
            case 23:
                ((Number) obj3).intValue();
                z7l0 z7l0Var = new z7l0((r6h1) obj4);
                int iOrdinal = ((c621) obj).b.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                return new y7l0(z7l0Var, i2);
            case 24:
                y7l0 y7l0Var = (y7l0) obj;
                if (((b621) obj4).equals(b621.a)) {
                    return y7l0Var.e();
                }
                eg.o();
                return null;
            case 25:
                ((Number) obj3).intValue();
                return new ril0((r6h1) obj4);
            case 26:
                ril0 ril0Var = (ril0) obj;
                r6h1 r6h1Var3 = ril0Var.a;
                y6h1 y6h1Var3 = ril0Var.b;
                String str8 = ((q621) obj3).a;
                int iOrdinal2 = ((n621) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1Var3, System.currentTimeMillis());
                } else if (iOrdinal2 == 1) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str8)), y6h1Var3, r6h1Var3, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str8)), y6h1Var3, r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var3;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                xul0 xul0Var = (xul0) obj;
                x821 x821Var = (x821) obj3;
                v821 v821Var = (v821) obj4;
                r6h1 r6h1Var4 = xul0Var.a;
                y6h1 y6h1Var4 = xul0Var.b;
                String str9 = x821Var.b;
                if (v821Var instanceof u821) {
                    if (x821Var.h != null) {
                        x6h1 x6h1VarC5 = y6h1Var4.c();
                        x6h1VarC5.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var4, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC6 = y6h1Var4.c();
                        x6h1VarC6.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", str9 != null ? str9 : "")), x6h1VarC6.a(), r6h1Var4, System.currentTimeMillis());
                    }
                } else if (v821Var instanceof r821) {
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("confirm_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", str9 != null ? str9 : "")), x6h1VarC8.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(v821Var instanceof q821)) {
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("confirm_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 28:
                ((Number) obj3).intValue();
                return new p7l0((r6h1) obj4);
            default:
                ((Number) obj3).intValue();
                return new sil0((r6h1) obj4);
        }
    }
}
