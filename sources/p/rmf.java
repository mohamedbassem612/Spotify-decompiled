package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rmf extends hab0 implements iu30 {
    public static final rmf N0;
    public static final rmf O0;
    public static final rmf P0;
    public static final rmf Q0;
    public static final rmf R0;
    public static final rmf S0;
    public static final rmf T0;
    public static final rmf U0;
    public static final rmf V0;
    public static final rmf W0;
    public static final rmf X;
    public static final rmf X0;
    public static final rmf Y;
    public static final rmf Y0;
    public static final rmf Z;
    public static final rmf Z0;
    public static final rmf a1;
    public static final rmf b;
    public static final rmf b1;
    public static final rmf c;
    public static final rmf c1;
    public static final rmf d;
    public static final rmf d1;
    public static final rmf e;
    public static final rmf e1;
    public static final rmf f;
    public static final rmf g;
    public static final rmf h;
    public static final rmf i;
    public static final rmf t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rmf(i2, (byte) 0);
        c = new rmf(i2, (byte) 1);
        d = new rmf(i2, (byte) 2);
        e = new rmf(i2, (byte) 3);
        f = new rmf(i2, (byte) 4);
        g = new rmf(i2, (byte) 5);
        h = new rmf(i2, (byte) 6);
        i = new rmf(i2, (byte) 7);
        t = new rmf(i2, (byte) 8);
        X = new rmf(i2, (byte) 9);
        Y = new rmf(i2, (byte) 10);
        Z = new rmf(i2, (byte) 11);
        N0 = new rmf(i2, (byte) 12);
        O0 = new rmf(i2, (byte) 13);
        P0 = new rmf(i2, (byte) 14);
        Q0 = new rmf(i2, (byte) 15);
        R0 = new rmf(i2, (byte) 16);
        S0 = new rmf(i2, (byte) 17);
        T0 = new rmf(i2, (byte) 18);
        U0 = new rmf(i2, (byte) 19);
        V0 = new rmf(i2, (byte) 20);
        W0 = new rmf(i2, (byte) 21);
        X0 = new rmf(i2, (byte) 22);
        Y0 = new rmf(i2, (byte) 23);
        Z0 = new rmf(i2, (byte) 24);
        a1 = new rmf(i2, (byte) 25);
        b1 = new rmf(i2, (byte) 26);
        c1 = new rmf(i2, (byte) 27);
        d1 = new rmf(i2, (byte) 28);
        e1 = new rmf(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmf(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                return new enf(false, true, false);
            case 2:
                return mno1.h(new mmr0[]{new mmr0("chat_share_step", ((eof) obj).c)});
            case 3:
                String str2 = ((qof) obj).a;
                Set set = pcf.a;
                return f4i1.f("spotify:chat-members:", str2, ":add");
            case 4:
                return Integer.valueOf(((Number) obj).intValue());
            case 5:
                return Integer.valueOf(-((Number) obj).intValue());
            case 6:
                return Integer.valueOf(-((Number) obj).intValue());
            case 7:
                return Integer.valueOf(((Number) obj).intValue());
            case 8:
                xa5 xa5Var = (xa5) obj;
                if ((xa5Var.e() instanceof iof) && (xa5Var.b() instanceof hof)) {
                    return hm5.P(xay.n(1, f), xay.r(1, g));
                }
                return ((xa5Var.e() instanceof hof) && (xa5Var.b() instanceof iof)) ? hm5.P(xay.n(1, h), xay.r(1, i)) : hm5.P(bby.b, ln00.b);
            case 9:
                wpf wpfVar = (wpf) obj;
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("shares", new ArrayList<>(wpfVar.d));
                bundle.putBoolean("hasReachedEnd", wpfVar.f);
                return bundle;
            case 10:
                Bundle bundle2 = (Bundle) obj;
                List listU = jhc1.u(bundle2, "shares", vpf.class);
                boolean z2 = bundle2.getBoolean("hasReachedEnd", false);
                zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                if (listU == null) {
                    listU = z6x.a;
                }
                return new wpf("", 0, zzq0Var, listU, z2, false, 80);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return rih1Var;
            case grn1.d /* 12 */:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                ((Number) obj).floatValue();
                return Float.valueOf(0.0f);
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                return ((w4i1) obj).b;
            case 19:
                return (String) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (String) obj;
            case 21:
                return xsf.a((String) obj);
            case 22:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 24:
                if (!(obj instanceof dxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (dxc0) obj;
            case 26:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 28:
                quf qufVar = (quf) obj;
                qufVar.getClass();
                Bundle bundle3 = new Bundle();
                yuf yufVar = qufVar.c;
                if (yufVar.equals(vuf.a)) {
                    str = "ask_to_join";
                } else if (yufVar.equals(xuf.a)) {
                    str = "waiting_for_host";
                } else {
                    if (!yufVar.equals(wuf.a)) {
                        eg.o();
                        return null;
                    }
                    str = "failed";
                }
                bundle3.putString("check_in_state", str);
                return bundle3;
            default:
                return rih1Var;
        }
    }
}
