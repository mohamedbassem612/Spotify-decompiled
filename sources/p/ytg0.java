package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ytg0 extends hab0 implements zu30 {
    public static final ytg0 N0;
    public static final ytg0 O0;
    public static final ytg0 P0;
    public static final ytg0 Q0;
    public static final ytg0 R0;
    public static final ytg0 S0;
    public static final ytg0 T0;
    public static final ytg0 U0;
    public static final ytg0 V0;
    public static final ytg0 W0;
    public static final ytg0 X;
    public static final ytg0 X0;
    public static final ytg0 Y;
    public static final ytg0 Y0;
    public static final ytg0 Z;
    public static final ytg0 Z0;
    public static final ytg0 a1;
    public static final ytg0 b;
    public static final ytg0 b1;
    public static final ytg0 c;
    public static final ytg0 c1;
    public static final ytg0 d;
    public static final ytg0 d1;
    public static final ytg0 e;
    public static final ytg0 e1;
    public static final ytg0 f;
    public static final ytg0 g;
    public static final ytg0 h;
    public static final ytg0 i;
    public static final ytg0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new ytg0(i2, (byte) 0);
        c = new ytg0(i2, (byte) 1);
        d = new ytg0(i2, (byte) 2);
        e = new ytg0(i2, (byte) 3);
        f = new ytg0(i2, (byte) 4);
        g = new ytg0(i2, (byte) 5);
        h = new ytg0(i2, (byte) 6);
        i = new ytg0(i2, (byte) 7);
        t = new ytg0(i2, (byte) 8);
        X = new ytg0(i2, (byte) 9);
        Y = new ytg0(i2, (byte) 10);
        Z = new ytg0(i2, (byte) 11);
        N0 = new ytg0(i2, (byte) 12);
        O0 = new ytg0(i2, (byte) 13);
        P0 = new ytg0(i2, (byte) 14);
        Q0 = new ytg0(i2, (byte) 15);
        R0 = new ytg0(i2, (byte) 16);
        S0 = new ytg0(i2, (byte) 17);
        T0 = new ytg0(i2, (byte) 18);
        U0 = new ytg0(i2, (byte) 19);
        V0 = new ytg0(i2, (byte) 20);
        W0 = new ytg0(i2, (byte) 21);
        X0 = new ytg0(i2, (byte) 22);
        Y0 = new ytg0(i2, (byte) 23);
        Z0 = new ytg0(i2, (byte) 24);
        a1 = new ytg0(i2, (byte) 25);
        b1 = new ytg0(i2, (byte) 26);
        c1 = new ytg0(i2, (byte) 27);
        d1 = new ytg0(i2, (byte) 28);
        e1 = new ytg0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ytg0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        String str;
        boolean z;
        String str2;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        awg0 awg0Var = awg0.a;
        cwg0 cwg0Var = cwg0.a;
        zvg0 zvg0Var = zvg0.a;
        bwg0 bwg0Var = bwg0.a;
        xvg0 xvg0Var = xvg0.a;
        yvg0 yvg0Var = yvg0.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return null;
            case 1:
                ewg0 ewg0Var = (ewg0) obj;
                ((Number) obj3).intValue();
                String str3 = ewg0Var.a;
                if (str3.length() == 0) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    str3 = yon1.M2().c;
                }
                return new hfl0(str3, ewg0Var.j);
            case 2:
                ewg0 ewg0Var2 = (ewg0) obj2;
                fwg0 fwg0Var = (fwg0) obj3;
                dwg0 dwg0Var = (dwg0) obj4;
                y6h1 y6h1Var = ((hfl0) obj).a;
                String str4 = ewg0Var2.k;
                String str5 = ewg0Var2.j;
                if (dwg0Var.equals(yvg0Var)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str5 == null) {
                        str5 = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var.equals(xvg0Var)) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str5 == null) {
                        str5 = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var.equals(bwg0Var)) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var.equals(zvg0Var)) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var.equals(cwg0Var)) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("whats_this_link_text", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!dwg0Var.equals(awg0Var)) {
                        if (!dwg0Var.equals(wvg0.a) && !dwg0Var.equals(vvg0.a)) {
                            eg.o();
                        }
                        return null;
                    }
                    if (fwg0Var.o) {
                        x6h1 x6h1VarC6 = y6h1Var.c();
                        x6h1VarC6.i.add(new a7h1("like_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str4 == null ? "" : str4)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC7 = y6h1Var.c();
                        x6h1VarC7.i.add(new a7h1("like_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str4 == null ? "" : str4)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 3:
                ewg0 ewg0Var3 = (ewg0) obj;
                ((Number) obj3).intValue();
                String str6 = ewg0Var3.a;
                if (str6.length() == 0) {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    str6 = yon1.M2().c;
                }
                return new hfl0(str6, ewg0Var3.j);
            case 4:
                ewg0 ewg0Var4 = (ewg0) obj2;
                fwg0 fwg0Var2 = (fwg0) obj3;
                dwg0 dwg0Var2 = (dwg0) obj4;
                y6h1 y6h1Var2 = ((hfl0) obj).a;
                String str7 = ewg0Var4.k;
                String str8 = ewg0Var4.j;
                if (dwg0Var2.equals(yvg0Var)) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC8.a();
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (str8 == null) {
                        str8 = "";
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var3, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var2.equals(xvg0Var)) {
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC9.a();
                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                    if (str8 == null) {
                        str8 = "";
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var4, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var2.equals(bwg0Var)) {
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var2.equals(zvg0Var)) {
                    x6h1 x6h1VarC11 = y6h1Var2.c();
                    x6h1VarC11.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                } else if (dwg0Var2.equals(cwg0Var)) {
                    x6h1 x6h1VarC12 = y6h1Var2.c();
                    x6h1VarC12.i.add(new a7h1("whats_this_link_text", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!dwg0Var2.equals(awg0Var)) {
                        if (!dwg0Var2.equals(wvg0.a) && !dwg0Var2.equals(vvg0.a)) {
                            eg.o();
                        }
                        return null;
                    }
                    if (fwg0Var2.o) {
                        x6h1 x6h1VarC13 = y6h1Var2.c();
                        x6h1VarC13.i.add(new a7h1("like_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str7 == null ? "" : str7)), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC14 = y6h1Var2.c();
                        x6h1VarC14.i.add(new a7h1("like_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str7 == null ? "" : str7)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var2;
            case 5:
                return new kfl0(Integer.valueOf(((Number) obj3).intValue()), ((uyg0) obj2).a, (r6h1) obj4);
            case 6:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((drk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 7:
                ((Number) obj3).intValue();
                return new nvk0(new ovk0(new uvk0(pcf.d(6, ((qjh0) obj).c, (String) null))));
            case 8:
                qjh0 qjh0Var = (qjh0) obj2;
                njh0 njh0Var = (njh0) obj4;
                y6h1 y6h1Var3 = ((nvk0) obj).a;
                if (njh0Var instanceof ljh0) {
                    String str9 = nik1.f5.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(njh0Var instanceof mjh0)) {
                        eg.o();
                        return null;
                    }
                    Iterator it = qjh0Var.a.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (!u890.j(((pjh0) it.next()).a, ((mjh0) njh0Var).a)) {
                            i2++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    x6h1 x6h1VarC15 = y6h1Var3.c();
                    x6h1VarC15.i.add(new a7h1("media_item", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 9:
                vvk0 vvk0Var = (vvk0) obj;
                if (((coh0) obj4).equals(coh0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), vvk0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 10:
                m4l0 m4l0Var = (m4l0) obj;
                gsh0 gsh0Var = (gsh0) obj3;
                fsh0 fsh0Var = (fsh0) obj4;
                r6h1 r6h1Var = m4l0Var.a;
                y6h1 y6h1Var4 = m4l0Var.b;
                if (fsh0Var instanceof esh0) {
                    x6h1 x6h1VarC16 = y6h1Var4.c();
                    x6h1VarC16.i.add(new a7h1("confirm_selection_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC16.a(), r6h1Var, System.currentTimeMillis());
                } else if (fsh0Var instanceof trh0) {
                    List list = gsh0Var.e;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                            } else if (((xoh0) it2.next()).a == ((trh0) fsh0Var).a.a) {
                                z = true;
                            }
                        }
                    }
                    Iterator it3 = gsh0Var.b.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i3 = -1;
                        } else if (((xoh0) it3.next()).a != ((trh0) fsh0Var).a.a) {
                            i3++;
                        }
                    }
                    char c2 = z ? (char) 2 : (char) 1;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    x6h1 x6h1VarC17 = y6h1Var4.c();
                    if (c2 == 1) {
                        str2 = "selected";
                    } else {
                        if (c2 != 2) {
                            throw null;
                        }
                        str2 = "unselected";
                    }
                    x6h1VarC17.i.add(new a7h1("media_item", (String) null, numValueOf2, (String) null, str2));
                    x6h1VarC17.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC17.a(), r6h1Var, System.currentTimeMillis());
                } else if (fsh0Var instanceof wrh0) {
                    x6h1 x6h1VarC18 = y6h1Var4.c();
                    x6h1VarC18.i.add(new a7h1("view_library_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), r6h1Var, System.currentTimeMillis());
                } else if (fsh0Var instanceof mrh0) {
                    char c3 = jsh0.a[l1d.C(gsh0Var.a)] == 1 ? (char) 1 : (char) 2;
                    x6h1 x6h1VarC19 = y6h1Var4.c();
                    if (c3 == 1) {
                        str = "denied";
                    } else {
                        if (c3 != 2) {
                            throw null;
                        }
                        str = "not_determined";
                    }
                    x6h1VarC19.i.add(new a7h1("media_access_button", (String) null, (Integer) null, (String) null, str));
                    x6h1VarC19.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC19.a(), r6h1Var, System.currentTimeMillis());
                } else if (fsh0Var instanceof srh0) {
                    x6h1 x6h1VarC20 = y6h1Var4.c();
                    x6h1VarC20.i.add(new a7h1("media_access_button", (String) null, (Integer) null, (String) null, "denied"));
                    x6h1VarC20.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1Var, System.currentTimeMillis());
                } else if (fsh0Var instanceof bsh0) {
                    x6h1 x6h1VarC21 = y6h1Var4.c();
                    x6h1VarC21.i.add(new a7h1("media_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = true;
                    x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                    x6h1VarC22.i.add(new a7h1("allow_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_allow", 1, Collections.singletonMap("permission_id", "media_library")), x6h1VarC22.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(fsh0Var instanceof ash0)) {
                        if (fsh0Var.equals(nrh0.a) || fsh0Var.equals(orh0.a) || fsh0Var.equals(prh0.a) || fsh0Var.equals(qrh0.a) || fsh0Var.equals(rrh0.a) || (fsh0Var instanceof xrh0) || fsh0Var.equals(urh0.a) || fsh0Var.equals(vrh0.a) || (fsh0Var instanceof zrh0) || fsh0Var.equals(csh0.a) || fsh0Var.equals(dsh0.a) || (fsh0Var instanceof yrh0)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC23 = y6h1Var4.c();
                    x6h1VarC23.i.add(new a7h1("media_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = true;
                    x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                    x6h1VarC24.i.add(new a7h1("deny_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC24.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_deny", 1, Collections.singletonMap("permission_id", "media_library")), x6h1VarC24.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 11:
                ((Number) obj3).intValue();
                return new uhl0((r6h1) obj4);
            case 12:
                uhl0 uhl0Var = (uhl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), uhl0Var.b, uhl0Var.a, System.currentTimeMillis());
            case 13:
                ((Number) obj3).intValue();
                return new pfl0(((n5i0) obj).b);
            case 14:
                pfl0 pfl0Var = (pfl0) obj;
                if (!((m5i0) obj4).equals(w4i0.a)) {
                    return null;
                }
                x6h1 x6h1VarC25 = pfl0Var.a.c();
                x6h1VarC25.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = false;
                x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                x6h1VarC26.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC26.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC26.a(), r6h1.c, System.currentTimeMillis());
            case 15:
                myl0 myl0Var = (myl0) obj;
                v7i0 v7i0Var = (v7i0) obj4;
                if (v7i0Var instanceof u7i0) {
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.P2().a)), myl0Var.a, myl0Var.b.b, System.currentTimeMillis());
                }
                if (v7i0Var instanceof t7i0) {
                    return null;
                }
                eg.o();
                return null;
            case 16:
                return upo1.t((obw0) obj, (hob1) obj3, (c700) obj4, ((mey0) obj2).d, 8);
            case 17:
                mey0 mey0Var = (mey0) obj;
                return new yz7(new rsk0(((iob1) obj2).v ? 4 : 3, Integer.valueOf(((Number) obj3).intValue()), mey0Var.c, (r6h1) obj4, (byte) 0));
            case 18:
                return upo1.r((mey0) obj, (hob1) obj2, ((Number) obj3).intValue(), (r6h1) obj4, 24);
            case 19:
                return upo1.t((obw0) obj, (hob1) obj3, (c700) obj4, (String) null, 12);
            case 20:
                b5l0 b5l0Var = (b5l0) obj;
                mdi0 mdi0Var = (mdi0) obj4;
                String str10 = ((ndi0) obj2).c;
                if (mdi0Var.equals(kdi0.a)) {
                    return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), b5l0Var.b, b5l0Var.a, System.currentTimeMillis());
                }
                if (mdi0Var.equals(jdi0.a)) {
                    return b5l0Var.a(str10);
                }
                if (mdi0Var.equals(ldi0.a)) {
                    return b5l0Var.a(str10);
                }
                eg.o();
                return null;
            case 21:
                return upo1.t((obw0) obj, (hob1) obj3, (c700) obj4, (String) null, 12);
            case 22:
                return upo1.t((obw0) obj, (hob1) obj3, (c700) obj4, (String) null, 12);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new hpl0((r6h1) obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                hpl0 hpl0Var = (hpl0) obj;
                if (((vji0) obj4).equals(vji0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), hpl0Var.b, hpl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 26:
                ((Number) obj3).intValue();
                return new yul0((r6h1) obj4);
            case 27:
                yul0 yul0Var = (yul0) obj;
                hoi0 hoi0Var = (hoi0) obj4;
                r6h1 r6h1Var2 = yul0Var.a;
                y6h1 y6h1Var5 = yul0Var.b;
                if (hoi0Var.equals(foi0.a)) {
                    x6h1 x6h1VarC27 = y6h1Var5.c();
                    x6h1VarC27.i.add(new a7h1("close_page_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC27.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC27.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(hoi0Var instanceof goi0)) {
                        eg.o();
                        return null;
                    }
                    String str11 = ((goi0) hoi0Var).a.c;
                    x6h1 x6h1VarC28 = y6h1Var5.c();
                    x6h1VarC28.i.add(new a7h1("remove_member_button", str11, (Integer) null, (String) null, (String) null));
                    x6h1VarC28.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_account", 1, b7xVar), x6h1VarC28.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 28:
                ((Number) obj3).intValue();
                return new cwk0(new jpk0(new ksk0((byte) 1)), Integer.valueOf(((tpi0) obj).a));
            default:
                cwk0 cwk0Var = (cwk0) obj;
                tpi0 tpi0Var = (tpi0) obj2;
                spi0 spi0Var = (spi0) obj4;
                y6h1 y6h1Var6 = cwk0Var.a;
                ksk0 ksk0Var = cwk0Var.b.c;
                if (spi0Var.equals(qpi0.a)) {
                    x6h1 x6h1VarC29 = y6h1Var6.c();
                    x6h1VarC29.i.add(new a7h1("member_context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC29.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC29.a(), ksk0Var.b, System.currentTimeMillis());
                } else {
                    if (!spi0Var.equals(rpi0.a)) {
                        eg.o();
                        return null;
                    }
                    String str12 = tpi0Var.d.a.e;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str12 != null ? str12 : "")), y6h1Var6, ksk0Var.b, System.currentTimeMillis());
                }
                return w7h1Var6;
        }
    }
}
