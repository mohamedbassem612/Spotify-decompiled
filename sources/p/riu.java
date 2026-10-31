package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class riu extends hab0 implements zu30 {
    public static final riu N0;
    public static final riu O0;
    public static final riu P0;
    public static final riu Q0;
    public static final riu R0;
    public static final riu S0;
    public static final riu T0;
    public static final riu U0;
    public static final riu V0;
    public static final riu W0;
    public static final riu X;
    public static final riu X0;
    public static final riu Y;
    public static final riu Y0;
    public static final riu Z;
    public static final riu Z0;
    public static final riu a1;
    public static final riu b;
    public static final riu b1;
    public static final riu c;
    public static final riu c1;
    public static final riu d;
    public static final riu d1;
    public static final riu e;
    public static final riu e1;
    public static final riu f;
    public static final riu g;
    public static final riu h;
    public static final riu i;
    public static final riu t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new riu(i2, (byte) 0);
        c = new riu(i2, (byte) 1);
        d = new riu(i2, (byte) 2);
        e = new riu(i2, (byte) 3);
        f = new riu(i2, (byte) 4);
        g = new riu(i2, (byte) 5);
        h = new riu(i2, (byte) 6);
        i = new riu(i2, (byte) 7);
        t = new riu(i2, (byte) 8);
        X = new riu(i2, (byte) 9);
        Y = new riu(i2, (byte) 10);
        Z = new riu(i2, (byte) 11);
        N0 = new riu(i2, (byte) 12);
        O0 = new riu(i2, (byte) 13);
        P0 = new riu(i2, (byte) 14);
        Q0 = new riu(i2, (byte) 15);
        R0 = new riu(i2, (byte) 16);
        S0 = new riu(i2, (byte) 17);
        T0 = new riu(i2, (byte) 18);
        U0 = new riu(i2, (byte) 19);
        V0 = new riu(i2, (byte) 20);
        W0 = new riu(i2, (byte) 21);
        X0 = new riu(i2, (byte) 22);
        Y0 = new riu(i2, (byte) 23);
        Z0 = new riu(i2, (byte) 24);
        a1 = new riu(i2, (byte) 25);
        b1 = new riu(i2, (byte) 26);
        c1 = new riu(i2, (byte) 27);
        d1 = new riu(i2, (byte) 28);
        e1 = new riu(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ riu(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        w7h1 w7h1Var7;
        w7h1 w7h1Var8;
        w7h1 w7h1Var9;
        byte b2 = this.a;
        tw50 tw50Var = tw50.a;
        tr70 tr70Var = tr70.a;
        txc txcVar = txc.a;
        osd osdVar = osd.a;
        b7x b7xVar = b7x.a;
        int i2 = 1;
        switch (b2) {
            case 0:
                ppk0 ppk0Var = (ppk0) obj;
                liu liuVar = (liu) obj4;
                r6h1 r6h1Var = ppk0Var.a;
                y6h1 y6h1Var = ppk0Var.b;
                String strG = ((diu) obj2).d.b.g();
                if (liuVar.equals(osdVar)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG != null ? strG : "")), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (liuVar.equals(txcVar)) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG != null ? strG : "")), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else if (liuVar.equals(tw50Var)) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG != null ? strG : "")), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                } else if (liuVar.equals(tr70Var)) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("ad_image", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG != null ? strG : "")), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!liuVar.equals(ys21.a)) {
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("ad_image", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("resize_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resize_image", 1, b7xVar), x6h1VarC9.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                ((Number) obj3).intValue();
                fq0 fq0Var = ((diu) obj).a;
                return new qpk0(fq0Var.k(), gq0.e(fq0Var.a()), (r6h1) obj4);
            case 2:
                qpk0 qpk0Var = (qpk0) obj;
                liu liuVar2 = (liu) obj4;
                r6h1 r6h1Var2 = qpk0Var.a;
                y6h1 y6h1Var2 = qpk0Var.b;
                String strG2 = ((diu) obj2).d.b.g();
                if (liuVar2.equals(tr70Var) || liuVar2.equals(osdVar)) {
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG2 != null ? strG2 : "")), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
                } else if (liuVar2.equals(hrg.a)) {
                    x6h1 x6h1VarC11 = y6h1Var2.c();
                    x6h1VarC11.i.add(new a7h1("card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!liuVar2.equals(txcVar)) {
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var2.c();
                    x6h1VarC13.i.add(new a7h1("card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG2 != null ? strG2 : "")), x6h1VarC14.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 3:
                r6h1 r6h1Var3 = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                fq0 fq0Var2 = ((diu) obj).a;
                String strE = gq0.e(fq0Var2.a());
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-ad-section";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = strE;
                x6h1VarI.c = numValueOf;
                y6h1 y6h1VarA = x6h1VarI.a();
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var3.a);
                arrayList.add(y6h1VarA);
                return new wpk0(fq0Var2.k(), gq0.e(fq0Var2.a()), new r6h1(arrayList, r6h1Var3.b));
            case 4:
                wpk0 wpk0Var = (wpk0) obj;
                liu liuVar3 = (liu) obj4;
                y6h1 y6h1Var4 = wpk0Var.b;
                String strG3 = ((diu) obj2).d.b.g();
                if (liuVar3.equals(osdVar)) {
                    x6h1 x6h1VarC15 = y6h1Var4.c();
                    x6h1VarC15.i.add(new a7h1("ad_footer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG3 != null ? strG3 : "")), x6h1VarC15.a(), wpk0Var.a, System.currentTimeMillis());
                } else if (liuVar3.equals(txcVar)) {
                    x6h1 x6h1VarC16 = y6h1Var4.c();
                    x6h1VarC16.i.add(new a7h1("ad_footer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                    x6h1VarC17.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG3 != null ? strG3 : "")), x6h1VarC17.a(), wpk0Var.a, System.currentTimeMillis());
                } else if (liuVar3.equals(tw50Var)) {
                    x6h1 x6h1VarC18 = y6h1Var4.c();
                    x6h1VarC18.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG3 != null ? strG3 : "")), x6h1VarC18.a(), wpk0Var.a, System.currentTimeMillis());
                } else {
                    if (!liuVar3.equals(tr70Var)) {
                        return null;
                    }
                    x6h1 x6h1VarC19 = y6h1Var4.c();
                    x6h1VarC19.i.add(new a7h1("ad_image", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG3 != null ? strG3 : "")), x6h1VarC19.a(), wpk0Var.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 5:
                ((Number) obj3).intValue();
                return new upl0(new tdl0((byte) 24));
            case 6:
                vju vjuVar = (vju) obj4;
                y6h1 y6h1Var5 = ((upl0) obj).a;
                if (vjuVar instanceof tju) {
                    x6h1 x6h1VarC20 = y6h1Var5.c();
                    x6h1VarC20.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(vjuVar instanceof uju)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC21 = y6h1Var5.c();
                    x6h1VarC21.i.add(new a7h1("user_display_name_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_display_name", 1, b7xVar), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 7:
                ((Number) obj3).intValue();
                return new hkl0((r6h1) obj4);
            case 8:
                hkl0 hkl0Var = (hkl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), hkl0Var.b, hkl0Var.a, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                return new c5l0((r6h1) obj4);
            case 10:
                c5l0 c5l0Var = (c5l0) obj;
                euu euuVar = (euu) obj3;
                auu auuVar = (auu) obj4;
                r6h1 r6h1Var5 = c5l0Var.a;
                y6h1 y6h1Var6 = c5l0Var.b;
                String str = euuVar.b;
                if (auuVar.equals(xtu.a)) {
                    String str2 = euuVar.b;
                    x6h1 x6h1VarC22 = y6h1Var6.c();
                    x6h1VarC22.i.add(new a7h1("download_button", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str != null ? str : "")), x6h1VarC22.a(), r6h1Var5, System.currentTimeMillis());
                } else if (auuVar instanceof ytu) {
                    String str3 = euuVar.b;
                    x6h1 x6h1VarC23 = y6h1Var6.c();
                    x6h1VarC23.i.add(new a7h1("download_button", (String) null, (Integer) null, str3, (String) null));
                    x6h1VarC23.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", str != null ? str : "")), x6h1VarC23.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(auuVar instanceof ztu)) {
                        eg.o();
                        return null;
                    }
                    String str4 = euuVar.b;
                    x6h1 x6h1VarC24 = y6h1Var6.c();
                    x6h1VarC24.i.add(new a7h1("download_button", (String) null, (Integer) null, str4, (String) null));
                    x6h1VarC24.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str != null ? str : "")), x6h1VarC24.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 11:
                ((Number) obj3).intValue();
                return new c5l0((r6h1) obj4);
            case 12:
                c5l0 c5l0Var2 = (c5l0) obj;
                ivu ivuVar = (ivu) obj3;
                dvu dvuVar = (dvu) obj4;
                r6h1 r6h1Var6 = c5l0Var2.a;
                y6h1 y6h1Var7 = c5l0Var2.b;
                String str5 = ivuVar.c;
                if (dvuVar.equals(yuu.a)) {
                    String str6 = ivuVar.c;
                    x6h1 x6h1VarC25 = y6h1Var7.c();
                    x6h1VarC25.i.add(new a7h1("download_button", (String) null, (Integer) null, str6, (String) null));
                    x6h1VarC25.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str5 != null ? str5 : "")), x6h1VarC25.a(), r6h1Var6, System.currentTimeMillis());
                } else if (dvuVar instanceof zuu) {
                    String str7 = ivuVar.c;
                    x6h1 x6h1VarC26 = y6h1Var7.c();
                    x6h1VarC26.i.add(new a7h1("download_button", (String) null, (Integer) null, str7, (String) null));
                    x6h1VarC26.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", str5 != null ? str5 : "")), x6h1VarC26.a(), r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!(dvuVar instanceof avu)) {
                        eg.o();
                        return null;
                    }
                    String str8 = ivuVar.c;
                    x6h1 x6h1VarC27 = y6h1Var7.c();
                    x6h1VarC27.i.add(new a7h1("download_button", (String) null, (Integer) null, str8, (String) null));
                    x6h1VarC27.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str5 != null ? str5 : "")), x6h1VarC27.a(), r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 13:
                ((Number) obj3).intValue();
                return new lml0(new fjl0((r6h1) obj4, (byte) 8));
            case 14:
                vml0 vml0Var = (vml0) obj;
                y6h1 y6h1Var8 = vml0Var.a;
                yml0 yml0Var = vml0Var.b;
                ai90 ai90Var = ((fvu) obj2).d;
                int iOrdinal = ((cvu) obj4).ordinal();
                if (iOrdinal == 0) {
                    String strC = ai90Var.c();
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", strC != null ? strC : "")), y6h1Var8, yml0Var.a, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    String strC2 = ai90Var.c();
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", strC2 != null ? strC2 : "")), y6h1Var8, yml0Var.a, System.currentTimeMillis());
                }
                return w7h1Var7;
            case 15:
                lml0 lml0Var = (lml0) obj;
                y6h1 y6h1Var9 = lml0Var.a;
                fjl0 fjl0Var = lml0Var.b;
                kby kbyVar = ((evu) obj2).a;
                int iOrdinal2 = ((bvu) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    String str9 = kbyVar.a;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("download", 1, Collections.singletonMap("item_to_download", str9 != null ? str9 : "")), y6h1Var9, fjl0Var.b, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    String str10 = kbyVar.a;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str10 != null ? str10 : "")), y6h1Var9, fjl0Var.b, System.currentTimeMillis());
                }
                return w7h1Var8;
            case 16:
                ((Number) obj4).intValue();
                return new vml0((yml0) obj);
            case 17:
                zyu zyuVar = (zyu) obj;
                ((Number) obj3).intValue();
                String str11 = zyuVar.a;
                String str12 = zyuVar.b;
                r6h1 r6h1Var7 = r6h1.c;
                return new qyk0(new yok0(str11, str12, (byte) 11));
            case 18:
                String strT = pro1.t("downloadOver3g");
                x6h1 x6h1VarC28 = ((qyk0) obj).a.c();
                x6h1VarC28.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC28.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strT)), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis());
            case 19:
                ((Number) obj3).intValue();
                return new d5l0();
            case 20:
                lhb1 lhb1Var = (lhb1) obj4;
                y6h1 y6h1Var10 = ((d5l0) obj).a;
                if (lhb1Var.equals(jhb1.a)) {
                    x6h1 x6h1VarC29 = y6h1Var10.c();
                    x6h1VarC29.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC29.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC29.a();
                    String str13 = m2v.g;
                    w7h1Var9 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13 != null ? str13 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!lhb1Var.equals(khb1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC30 = y6h1Var10.c();
                    x6h1VarC30.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC30.j = false;
                    w7h1Var9 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var9;
            case 21:
                ((Number) obj3).intValue();
                int iOrdinal3 = ((rdv) obj2).k.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = 3;
                } else if (iOrdinal3 == 1) {
                    i2 = 2;
                } else if (iOrdinal3 != 2) {
                    eg.o();
                    return null;
                }
                return new t4l0(i2);
            case 22:
                t4l0 t4l0Var = (t4l0) obj;
                if (!(((vcv) obj4) instanceof icv)) {
                    return null;
                }
                x6h1 x6h1VarC31 = t4l0Var.a.c();
                x6h1VarC31.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC31.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC31.a(), r6h1.c, System.currentTimeMillis());
            case 23:
                ((Number) obj3).intValue();
                return new yll0(new fjl0((r6h1) obj4, (byte) 5));
            case 24:
                yll0 yll0Var = (yll0) obj;
                if (((xev) obj4).equals(xev.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), yll0Var.a, yll0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 25:
                return new as0((Context) obj2, (byte) 12);
            case 26:
                ((Number) obj3).intValue();
                return new rxl0((r6h1) obj4);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((rxl0) obj).a(nik1.n2.a);
            case 28:
                return new as0((Context) obj2, (iu30) obj4, (byte) 14);
            default:
                return new wnb1((jo70) obj, (xkk1) obj2, (hll) null, (hzy) obj3, (iix0) null, (h2v) obj4, (zoy0) null, (w281) null, 468);
        }
    }
}
