package p;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eej0 extends hab0 implements zu30 {
    public static final eej0 N0;
    public static final eej0 O0;
    public static final eej0 P0;
    public static final eej0 Q0;
    public static final eej0 R0;
    public static final eej0 S0;
    public static final eej0 T0;
    public static final eej0 U0;
    public static final eej0 V0;
    public static final eej0 W0;
    public static final eej0 X;
    public static final eej0 X0;
    public static final eej0 Y;
    public static final eej0 Y0;
    public static final eej0 Z;
    public static final eej0 Z0;
    public static final eej0 a1;
    public static final eej0 b;
    public static final eej0 b1;
    public static final eej0 c;
    public static final eej0 c1;
    public static final eej0 d;
    public static final eej0 d1;
    public static final eej0 e;
    public static final eej0 e1;
    public static final eej0 f;
    public static final eej0 g;
    public static final eej0 h;
    public static final eej0 i;
    public static final eej0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new eej0(i2, (byte) 0);
        c = new eej0(i2, (byte) 1);
        d = new eej0(i2, (byte) 2);
        e = new eej0(i2, (byte) 3);
        f = new eej0(i2, (byte) 4);
        g = new eej0(i2, (byte) 5);
        h = new eej0(i2, (byte) 6);
        i = new eej0(i2, (byte) 7);
        t = new eej0(i2, (byte) 8);
        X = new eej0(i2, (byte) 9);
        Y = new eej0(i2, (byte) 10);
        Z = new eej0(i2, (byte) 11);
        N0 = new eej0(i2, (byte) 12);
        O0 = new eej0(i2, (byte) 13);
        P0 = new eej0(i2, (byte) 14);
        Q0 = new eej0(i2, (byte) 15);
        R0 = new eej0(i2, (byte) 16);
        S0 = new eej0(i2, (byte) 17);
        T0 = new eej0(i2, (byte) 18);
        U0 = new eej0(i2, (byte) 19);
        V0 = new eej0(i2, (byte) 20);
        W0 = new eej0(i2, (byte) 21);
        X0 = new eej0(i2, (byte) 22);
        Y0 = new eej0(i2, (byte) 23);
        Z0 = new eej0(i2, (byte) 24);
        a1 = new eej0(i2, (byte) 25);
        b1 = new eej0(i2, (byte) 26);
        c1 = new eej0(i2, (byte) 27);
        d1 = new eej0(i2, (byte) 28);
        e1 = new eej0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eej0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x08a7  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        String str;
        String str2;
        String str3;
        mq70 mq70Var;
        up70 up70VarA;
        io70 io70Var;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        switch (b2) {
            case 0:
                tnl0 tnl0Var = (tnl0) obj;
                y6h1 y6h1Var = tnl0Var.b;
                int iOrdinal = ((cej0) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), tnl0Var.a, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), tnl0Var.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                ((Number) obj3).intValue();
                return new z4l0(new py9((r6h1) obj4, (byte) 28));
            case 2:
                z4l0 z4l0Var = (z4l0) obj;
                r6h1 r6h1Var = z4l0Var.b.b;
                y6h1 y6h1Var2 = z4l0Var.a;
                int iOrdinal2 = ((gej0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 3:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(5), (r6h1) obj4);
            case 4:
                tnl0 tnl0Var2 = (tnl0) obj;
                if (lej0.a[((jej0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC5 = tnl0Var2.b.c();
                x6h1VarC5.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), tnl0Var2.a, System.currentTimeMillis());
            case 5:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(7), (r6h1) obj4);
            case 6:
                tnl0 tnl0Var3 = (tnl0) obj;
                if (pej0.a[((nej0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC6 = tnl0Var3.b.c();
                x6h1VarC6.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), tnl0Var3.a, System.currentTimeMillis());
            case 7:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(10), (r6h1) obj4);
            case 8:
                tnl0 tnl0Var4 = (tnl0) obj;
                y6h1 y6h1Var3 = tnl0Var4.b;
                int iOrdinal3 = ((rej0) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), tnl0Var4.a, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), tnl0Var4.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 9:
                ((Number) obj3).intValue();
                return new vjl0((r6h1) obj4);
            case 10:
                vjl0 vjl0Var = (vjl0) obj;
                r6h1 r6h1Var2 = vjl0Var.a;
                y6h1 y6h1Var4 = vjl0Var.b;
                int iOrdinal4 = ((wej0) obj4).ordinal();
                if (iOrdinal4 == 0) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("shuffle_anyway_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal4 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("turn_off_shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "shuffle"), new mmr0("selected_mode", "linear")})), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 11:
                jo70 jo70Var = (jo70) obj;
                hll hllVar = (hll) obj2;
                xkk1 xkk1Var = (xkk1) obj3;
                pjw0 pjw0Var = (pjw0) obj4;
                String str4 = jo70Var.a;
                String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, hvi0.V0, 30);
                String str5 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
                List list = hllVar.b;
                if (pjw0Var != null) {
                    o3r o3rVar = qjj0.a;
                    ljw0 ljw0Var = pjw0Var.b;
                    ljw0 ljw0Var2 = ljw0Var instanceof ljw0 ? ljw0Var : null;
                    if (ljw0Var2 == null || (str3 = ljw0Var2.a.a.a.a) == null || str3.length() == 0) {
                        str3 = null;
                    }
                    str = str3;
                } else {
                    str = null;
                }
                io70 io70Var2 = jo70Var.e;
                if (io70Var2 != null) {
                    String str6 = io70Var2.b;
                    if (ihc1.y0(str6)) {
                        str2 = null;
                    } else {
                        str2 = str6;
                    }
                } else {
                    str2 = null;
                }
                return new hw00(str4, str5, strY0, str, str2, list);
            case 12:
                jo70 jo70Var2 = (jo70) obj;
                hzy hzyVar = (hzy) obj2;
                l1z l1zVar = (l1z) obj3;
                v740 v740Var = (v740) obj4;
                Boolean boolValueOf = hzyVar != null ? Boolean.valueOf(hzyVar.a == 6) : null;
                String str7 = (jo70Var2 == null || (io70Var = jo70Var2.e) == null) ? null : io70Var.b;
                Boolean bool = Boolean.TRUE;
                if (u890.j(boolValueOf, bool)) {
                    l1zVar = null;
                }
                return new p740(str7, l1zVar, u890.j(boolValueOf, bool) ? null : v740Var);
            case 13:
                km61 km61Var = (km61) obj;
                Integer num = (Integer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                boolean z2 = num != null && iIntValue > num.intValue();
                if (z2 && iIntValue == 6) {
                    km61.a(km61Var, "internalQualityCellularWarning", (Bundle) null, false, 6);
                    return Boolean.FALSE;
                }
                boolean z3 = iIntValue == 5;
                if (z2 && z3) {
                    km61.a(km61Var, "losslessCellularWarning", (Bundle) null, false, 6);
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ((Number) obj3).intValue();
                return new wfl0((r6h1) obj4);
            case 15:
                wfl0 wfl0Var = (wfl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((ttj0) obj3).a)), wfl0Var.b, wfl0Var.a, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new ckl0(new dkl0((r6h1) obj4));
            case 17:
                ckl0 ckl0Var = (ckl0) obj;
                if (gvj0.a[((dvj0) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ckl0Var.a, ckl0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 18:
                ((Number) obj3).intValue();
                return new ckl0(new dkl0((r6h1) obj4));
            case 19:
                ckl0 ckl0Var2 = (ckl0) obj;
                kvj0 kvj0Var = (kvj0) obj4;
                if (!(kvj0Var instanceof jvj0)) {
                    if (kvj0Var.equals(ivj0.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                jvj0 jvj0Var = (jvj0) kvj0Var;
                String strValueOf = String.valueOf(jvj0Var.a);
                Integer numValueOf = Integer.valueOf(jvj0Var.b);
                x6h1 x6h1VarC11 = ckl0Var2.a.c();
                x6h1VarC11.i.add(new a7h1("bar_button", strValueOf, numValueOf, (String) null, (String) null));
                x6h1VarC11.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC11.a(), ckl0Var2.b.a, System.currentTimeMillis());
            case 20:
                ((Number) obj3).intValue();
                return new wjl0((r6h1) obj4);
            case 21:
                wjl0 wjl0Var = (wjl0) obj;
                vvj0 vvj0Var = (vvj0) obj2;
                uvj0 uvj0Var = (uvj0) obj4;
                r6h1 r6h1Var3 = wjl0Var.a;
                y6h1 y6h1Var5 = wjl0Var.b;
                if (uvj0Var instanceof tvj0) {
                    x6h1 x6h1VarC12 = y6h1Var5.c();
                    x6h1VarC12.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA = x6h1VarC12.a();
                    tvj0 tvj0Var = (tvj0) uvj0Var;
                    String strT = flo1.t(tvj0Var.a.name());
                    Integer numValueOf2 = Integer.valueOf(tvj0Var.b);
                    x6h1 x6h1VarC13 = y6h1VarA.c();
                    x6h1VarC13.i.add(new a7h1("volume_curve_button", strT, numValueOf2, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC13.a(), r6h1Var3, System.currentTimeMillis());
                } else if (uvj0Var instanceof qvj0) {
                    x6h1 x6h1VarC14 = y6h1Var5.c();
                    x6h1VarC14.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC14.a();
                    Integer numValueOf3 = Integer.valueOf(((qvj0) uvj0Var).a);
                    x6h1 x6h1VarC15 = y6h1VarA2.c();
                    x6h1VarC15.i.add(new a7h1("volume_curve_button", "custom", numValueOf3, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC15.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (uvj0Var instanceof nvj0) {
                        r6h1 r6h1VarB = wjl0Var.b();
                        y6h1 y6h1Var6 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-overlap-edit-page-waves";
                        x6h1VarI.f = "2.3.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1 x6h1VarC16 = x6h1VarI.a().c();
                        x6h1VarC16.i.add(new a7h1("bars_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC16.a();
                        nvj0 nvj0Var = (nvj0) uvj0Var;
                        String strValueOf2 = String.valueOf(nvj0Var.a);
                        Integer numValueOf4 = Integer.valueOf(nvj0Var.b);
                        x6h1 x6h1VarC17 = y6h1VarA3.c();
                        x6h1VarC17.i.add(new a7h1("bar_button", strValueOf2, numValueOf4, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC17.a(), r6h1VarB, System.currentTimeMillis());
                    }
                    if (uvj0Var instanceof svj0) {
                        x6h1 x6h1VarC18 = y6h1Var5.c();
                        x6h1VarC18.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC18.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC18.a();
                        svj0 svj0Var = (svj0) uvj0Var;
                        String strT2 = flo1.t(svj0Var.a.name());
                        Integer numValueOf5 = Integer.valueOf(svj0Var.b);
                        x6h1 x6h1VarC19 = y6h1VarA4.c();
                        x6h1VarC19.i.add(new a7h1("filter_button", strT2, numValueOf5, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC19.a(), r6h1Var3, System.currentTimeMillis());
                    } else if (uvj0Var instanceof pvj0) {
                        x6h1 x6h1VarC20 = y6h1Var5.c();
                        x6h1VarC20.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        y6h1 y6h1VarA5 = x6h1VarC20.a();
                        Integer numValueOf6 = Integer.valueOf(((pvj0) uvj0Var).a);
                        x6h1 x6h1VarC21 = y6h1VarA5.c();
                        x6h1VarC21.i.add(new a7h1("filter_button", "custom", numValueOf6, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC21.a(), r6h1Var3, System.currentTimeMillis());
                    } else if (uvj0Var instanceof rvj0) {
                        x6h1 x6h1VarC22 = y6h1Var5.c();
                        x6h1VarC22.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC22.j = false;
                        y6h1 y6h1VarA6 = x6h1VarC22.a();
                        rvj0 rvj0Var = (rvj0) uvj0Var;
                        String strT3 = flo1.t(rvj0Var.a.name());
                        Integer numValueOf7 = Integer.valueOf(rvj0Var.b);
                        x6h1 x6h1VarC23 = y6h1VarA6.c();
                        x6h1VarC23.i.add(new a7h1("eq_button", strT3, numValueOf7, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC23.a(), r6h1Var3, System.currentTimeMillis());
                    } else if (uvj0Var instanceof ovj0) {
                        x6h1 x6h1VarC24 = y6h1Var5.c();
                        x6h1VarC24.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        y6h1 y6h1VarA7 = x6h1VarC24.a();
                        Integer numValueOf8 = Integer.valueOf(((ovj0) uvj0Var).a);
                        x6h1 x6h1VarC25 = y6h1VarA7.c();
                        x6h1VarC25.i.add(new a7h1("eq_button", "custom", numValueOf8, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC25.a(), r6h1Var3, System.currentTimeMillis());
                    } else {
                        if (!uvj0Var.equals(mvj0.a)) {
                            eg.o();
                            return null;
                        }
                        azb azbVar = vvj0Var.a;
                        if (azbVar instanceof zyb) {
                            x6h1 x6h1VarC26 = y6h1Var5.c();
                            x6h1VarC26.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC26.j = false;
                            w7h1Var5 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC26.a(), r6h1Var3, System.currentTimeMillis());
                        } else if (azbVar instanceof syb) {
                            x6h1 x6h1VarC27 = y6h1Var5.c();
                            x6h1VarC27.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC27.j = false;
                            w7h1Var5 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC27.a(), r6h1Var3, System.currentTimeMillis());
                        } else if (azbVar instanceof tyb) {
                            x6h1 x6h1VarC28 = y6h1Var5.c();
                            x6h1VarC28.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC28.j = false;
                            w7h1Var5 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC28.a(), r6h1Var3, System.currentTimeMillis());
                        } else {
                            if (!(azbVar instanceof uyb)) {
                                return null;
                            }
                            x6h1 x6h1VarC29 = y6h1Var5.c();
                            x6h1VarC29.i.add(new a7h1("effects_selector", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC29.j = false;
                            w7h1Var5 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC29.a(), r6h1Var3, System.currentTimeMillis());
                        }
                    }
                }
                return w7h1Var5;
            case 22:
                bml0 bml0Var = (bml0) obj;
                mwj0 mwj0Var = (mwj0) obj4;
                Boolean bool2 = ((owj0) obj3).a.a;
                if (mwj0Var instanceof ewj0) {
                    Boolean bool3 = Boolean.TRUE;
                    return bml0Var.h(u890.j(bool2, bool3) ? 2 : 1, u890.j(bool2, bool3) ? 1 : 2);
                }
                if (mwj0Var instanceof iwj0) {
                    return bml0Var.h(1, 2);
                }
                if (mwj0Var instanceof fwj0) {
                    return bml0Var.h(2, 1);
                }
                if (mwj0Var instanceof lwj0) {
                    return bml0Var.h(1, 1);
                }
                if ((mwj0Var instanceof kwj0) || (mwj0Var instanceof dwj0) || (mwj0Var instanceof hwj0) || (mwj0Var instanceof jwj0) || (mwj0Var instanceof cwj0) || (mwj0Var instanceof gwj0)) {
                    return null;
                }
                eg.o();
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new dkl0((r6h1) obj4);
            case 24:
                dkl0 dkl0Var = (dkl0) obj;
                if (ayj0.a[((xxj0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC30 = dkl0Var.b.c();
                x6h1VarC30.i.add(new a7h1("curves_edit_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC30.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC30.a(), dkl0Var.a, System.currentTimeMillis());
            case 25:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(3), (r6h1) obj4);
            case 26:
                ((Number) obj3).intValue();
                return new yjl0((r6h1) obj4);
            case 27:
                yjl0 yjl0Var = (yjl0) obj;
                o6k0 o6k0Var = (o6k0) obj2;
                r6h1 r6h1Var4 = yjl0Var.a;
                y6h1 y6h1Var7 = yjl0Var.b;
                switch (((n6k0) obj4).ordinal()) {
                    case 0:
                        x6h1 x6h1VarC31 = y6h1Var7.c();
                        x6h1VarC31.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC31.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC31.a(), r6h1Var4, System.currentTimeMillis());
                        break;
                    case 1:
                        if (!o6k0Var.b) {
                            x6h1 x6h1VarC32 = y6h1Var7.c();
                            x6h1VarC32.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC32.j = false;
                            w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC32.a(), r6h1Var4, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC33 = y6h1Var7.c();
                            x6h1VarC33.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC33.j = false;
                            w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC33.a(), r6h1Var4, System.currentTimeMillis());
                        }
                        break;
                    case 2:
                        x6h1 x6h1VarC34 = y6h1Var7.c();
                        x6h1VarC34.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC34.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC34.a(), r6h1Var4, System.currentTimeMillis());
                        break;
                    case 3:
                        x6h1 x6h1VarC35 = y6h1Var7.c();
                        x6h1VarC35.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC35.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC35.a(), r6h1Var4, System.currentTimeMillis());
                        break;
                    case 4:
                        x6h1 x6h1VarC36 = y6h1Var7.c();
                        x6h1VarC36.i.add(new a7h1("education_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC36.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC36.a(), r6h1Var4, System.currentTimeMillis());
                        break;
                    case 5:
                    case 6:
                        return null;
                    default:
                        eg.o();
                        return null;
                }
                return w7h1Var6;
            case 28:
                Boolean bool4 = (Boolean) obj2;
                return new k7k0((qxc0) obj, bool4 != null ? bool4.booleanValue() : false, (String) obj3, (String) obj4);
            default:
                ((Number) obj3).intValue();
                return new akl0(new bkl0(((r7k0) obj).a, (r6h1) obj4));
        }
    }
}
