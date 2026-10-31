package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g2z0 extends hab0 implements zu30 {
    public static final g2z0 N0;
    public static final g2z0 O0;
    public static final g2z0 P0;
    public static final g2z0 Q0;
    public static final g2z0 R0;
    public static final g2z0 S0;
    public static final g2z0 T0;
    public static final g2z0 U0;
    public static final g2z0 V0;
    public static final g2z0 W0;
    public static final g2z0 X;
    public static final g2z0 X0;
    public static final g2z0 Y;
    public static final g2z0 Y0;
    public static final g2z0 Z;
    public static final g2z0 Z0;
    public static final g2z0 a1;
    public static final g2z0 b;
    public static final g2z0 b1;
    public static final g2z0 c;
    public static final g2z0 c1;
    public static final g2z0 d;
    public static final g2z0 d1;
    public static final g2z0 e;
    public static final g2z0 e1;
    public static final g2z0 f;
    public static final g2z0 g;
    public static final g2z0 h;
    public static final g2z0 i;
    public static final g2z0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new g2z0(i2, (byte) 0);
        c = new g2z0(i2, (byte) 1);
        d = new g2z0(i2, (byte) 2);
        e = new g2z0(i2, (byte) 3);
        f = new g2z0(i2, (byte) 4);
        g = new g2z0(i2, (byte) 5);
        h = new g2z0(i2, (byte) 6);
        i = new g2z0(i2, (byte) 7);
        t = new g2z0(i2, (byte) 8);
        X = new g2z0(i2, (byte) 9);
        Y = new g2z0(i2, (byte) 10);
        Z = new g2z0(i2, (byte) 11);
        N0 = new g2z0(i2, (byte) 12);
        O0 = new g2z0(i2, (byte) 13);
        P0 = new g2z0(i2, (byte) 14);
        Q0 = new g2z0(i2, (byte) 15);
        R0 = new g2z0(i2, (byte) 16);
        S0 = new g2z0(i2, (byte) 17);
        T0 = new g2z0(i2, (byte) 18);
        U0 = new g2z0(i2, (byte) 19);
        V0 = new g2z0(i2, (byte) 20);
        W0 = new g2z0(i2, (byte) 21);
        X0 = new g2z0(i2, (byte) 22);
        Y0 = new g2z0(i2, (byte) 23);
        Z0 = new g2z0(i2, (byte) 24);
        a1 = new g2z0(i2, (byte) 25);
        b1 = new g2z0(i2, (byte) 26);
        c1 = new g2z0(i2, (byte) 27);
        d1 = new g2z0(i2, (byte) 28);
        e1 = new g2z0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2z0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x036d  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        Object obj5;
        String strY0;
        String str2;
        List list;
        mq70 mq70Var;
        up70 up70VarA;
        String str3;
        mq70 mq70Var2;
        String str4;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        String str5 = null;
        switch (b2) {
            case 0:
                e2z0 e2z0Var = (e2z0) obj;
                ((Number) obj3).intValue();
                return new ssl0(e2z0Var.c ? 1 : 2, e2z0Var.b.a, (r6h1) obj4);
            case 1:
                ssl0 ssl0Var = (ssl0) obj;
                if (!(((d2z0) obj4) instanceof c2z0)) {
                    return null;
                }
                x6h1 x6h1VarC = ssl0Var.b.c();
                x6h1VarC.i.add(new a7h1("sources_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), ssl0Var.a, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                return new tsl0((r6h1) obj4);
            case 3:
                tsl0 tsl0Var = (tsl0) obj;
                p3z0 p3z0Var = (p3z0) obj3;
                o3z0 o3z0Var = (o3z0) obj4;
                r6h1 r6h1Var = tsl0Var.a;
                y6h1 y6h1Var = tsl0Var.b;
                oho1 oho1Var = p3z0Var.h;
                String str6 = p3z0Var.a;
                if (o3z0Var.equals(n3z0.a)) {
                    if (oho1Var instanceof z1z0) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("thumbs_up_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str6 != null ? str6 : "")), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("thumbs_up_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str6 != null ? str6 : "")), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else if (o3z0Var.equals(m3z0.a)) {
                    if (oho1Var instanceof x1z0) {
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("thumbs_down_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str6 != null ? str6 : "")), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("thumbs_down_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str6 != null ? str6 : "")), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else if (o3z0Var.equals(h3z0.a)) {
                    x6h1 x6h1VarC6 = y6h1Var.c();
                    x6h1VarC6.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                } else if (o3z0Var.equals(j3z0.a)) {
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!o3z0Var.equals(i3z0.a)) {
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var.c();
                    x6h1VarC8.i.add(new a7h1("finish_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 4:
                d4z0 d4z0Var = (d4z0) obj;
                int iIntValue = ((Number) obj3).intValue();
                g5l0 g5l0Var = new g5l0(Integer.valueOf(d4z0Var.b), d4z0Var.a, (r6h1) obj4);
                f4z0 f4z0Var = d4z0Var.c;
                if (f4z0Var instanceof f4z0) {
                    str = f4z0Var.a;
                } else {
                    if (!(f4z0Var instanceof g4z0)) {
                        eg.o();
                        return null;
                    }
                    str = "custom-response";
                }
                return new o9l0(g5l0Var, str, Integer.valueOf(iIntValue));
            case 5:
                o9l0 o9l0Var = (o9l0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), o9l0Var.a, o9l0Var.b.b, System.currentTimeMillis());
            case 6:
                ((Number) obj3).intValue();
                return new qil0((r6h1) obj4);
            case 7:
                qil0 qil0Var = (qil0) obj;
                String str7 = nik1.w1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), qil0Var.b, qil0Var.a, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new yrl0((r6h1) obj4);
            case 9:
                yrl0 yrl0Var = (yrl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "addsongs view")), yrl0Var.b, yrl0Var.a, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return new bsl0((r6h1) obj4);
            case 11:
                bsl0 bsl0Var = (bsl0) obj;
                boolean z = ((gaz0) obj3).b;
                char c2 = z ? (char) 2 : (char) 1;
                char c3 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str8 = "off";
                if (c2 == 1) {
                    obj5 = "off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str8 = "on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str8)})), bsl0Var.b, bsl0Var.a, System.currentTimeMillis());
            case 12:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                ((Number) obj3).intValue();
                return new csl0((r6h1) obj4);
            case 13:
                csl0 csl0Var = (csl0) obj;
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), csl0Var.b, csl0Var.a, System.currentTimeMillis());
            case 14:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                mtl mtlVar = (mtl) obj3;
                hll hllVar = (hll) obj4;
                io70 io70Var = jo70Var.e;
                String str9 = jo70Var.a;
                String str10 = !ihc1.y0(str9) ? str9 : null;
                o3r o3rVar = mcz0.a;
                if ((mtlVar != null ? mtlVar.a : null) != ktl.c) {
                    List list2 = jo70Var.d;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ho70) it.next()).a);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : arrayList) {
                        if (!ihc1.y0((String) obj6)) {
                            arrayList2.add(obj6);
                        }
                    }
                    ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                    if (arrayList3 != null) {
                        strY0 = o7h.y0(arrayList3, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                    } else if (io70Var == null || (strY0 = io70Var.a) == null || ihc1.y0(strY0)) {
                        strY0 = null;
                    }
                } else if (io70Var == null || (strY0 = io70Var.a) == null || ihc1.y0(strY0)) {
                    strY0 = null;
                }
                String str11 = strY0;
                vp70 vp70Var = vp70.c;
                if (xkk1Var == null || (mq70Var2 = xkk1Var.a) == null) {
                    str2 = null;
                } else {
                    up70 up70VarA2 = mq70Var2.a(vp70Var);
                    if (up70VarA2 == null || (str4 = up70VarA2.a.a) == null || ihc1.y0(str4)) {
                        str4 = null;
                    }
                    str2 = str4;
                }
                if (xkk1Var != null && (mq70Var = xkk1Var.b) != null && (up70VarA = mq70Var.a(vp70Var)) != null && (str3 = up70VarA.a.a) != null && !ihc1.y0(str3)) {
                    str5 = str3;
                }
                return new kcz0(str10, str11, str2, str5, (hllVar == null || (list = hllVar.d) == null || !list.contains(fll.c)) ? false : true);
            case 15:
                ((Number) obj3).intValue();
                return new esl0();
            case 16:
                return null;
            case 17:
                ((Number) obj3).intValue();
                return new lsl0((r6h1) obj4);
            case 18:
                lsl0 lsl0Var = (lsl0) obj;
                riz0 riz0Var = (riz0) obj4;
                r6h1 r6h1Var2 = lsl0Var.a;
                y6h1 y6h1Var2 = lsl0Var.b;
                if (riz0Var.equals(oiz0.a)) {
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (riz0Var.equals(piz0.a)) {
                        return null;
                    }
                    if (!(riz0Var instanceof qiz0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA = x6h1VarC10.a();
                    boolean z2 = ((qiz0) riz0Var).a;
                    if (z2) {
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (z2) {
                            eg.o();
                            return null;
                        }
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                    }
                }
                return w7h1Var2;
            case 19:
                ((Number) obj3).intValue();
                return new msl0((r6h1) obj4);
            case 20:
                return null;
            case 21:
                vsl0 vsl0Var = (vsl0) obj;
                ekz0 ekz0Var = (ekz0) obj2;
                if (!((ckz0) obj4).equals(ckz0.a)) {
                    eg.o();
                    return null;
                }
                String str12 = ekz0Var.a;
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                x7h1 x7h1Var = new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str12));
                y6h1 y6h1Var3 = vsl0Var.a;
                vsl0Var.b.getClass();
                return new w7h1("", "", z7h1Var2, x7h1Var, y6h1Var3, r6h1.c, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new atl0(((dlz0) obj).a);
            case 23:
                clz0 clz0Var = (clz0) obj4;
                y6h1 y6h1Var4 = ((atl0) obj).a;
                if (!(clz0Var instanceof blz0)) {
                    if (clz0Var instanceof alz0) {
                        return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var4, r6h1.c, System.currentTimeMillis());
                    }
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC11 = y6h1Var4.c();
                x6h1VarC11.i.add(new a7h1("sources_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA2 = x6h1VarC11.a();
                String str13 = ((blz0) clz0Var).a;
                x6h1 x6h1VarC12 = y6h1VarA2.c();
                x6h1VarC12.i.add(new a7h1("source_item", (String) null, (Integer) null, str13, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                return new usl0((r6h1) obj4);
            case 25:
                return null;
            case 26:
                ((Number) obj3).intValue();
                return new hsl0(((jrz0) obj).a);
            case 27:
                x6h1 x6h1VarC13 = ((hsl0) obj).a.c();
                x6h1VarC13.i.add(new a7h1("submit_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
            case 28:
                ((Number) obj3).intValue();
                return new btl0((r6h1) obj4);
            default:
                btl0 btl0Var = (btl0) obj;
                if (etz0.a[((usz0) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), btl0Var.b, btl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
        }
    }
}
