package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fdv extends hab0 implements vu30 {
    public static final fdv N0;
    public static final fdv O0;
    public static final fdv P0;
    public static final fdv Q0;
    public static final fdv R0;
    public static final fdv S0;
    public static final fdv T0;
    public static final fdv U0;
    public static final fdv V0;
    public static final fdv W0;
    public static final fdv X;
    public static final fdv X0;
    public static final fdv Y;
    public static final fdv Y0;
    public static final fdv Z;
    public static final fdv Z0;
    public static final fdv a1;
    public static final fdv b;
    public static final fdv b1;
    public static final fdv c;
    public static final fdv c1;
    public static final fdv d;
    public static final fdv d1;
    public static final fdv e;
    public static final fdv e1;
    public static final fdv f;
    public static final fdv g;
    public static final fdv h;
    public static final fdv i;
    public static final fdv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new fdv(i2, (byte) 0);
        c = new fdv(i2, (byte) 1);
        d = new fdv(i2, (byte) 2);
        e = new fdv(i2, (byte) 3);
        f = new fdv(i2, (byte) 4);
        g = new fdv(i2, (byte) 5);
        h = new fdv(i2, (byte) 6);
        i = new fdv(i2, (byte) 7);
        t = new fdv(i2, (byte) 8);
        X = new fdv(i2, (byte) 9);
        Y = new fdv(i2, (byte) 10);
        Z = new fdv(i2, (byte) 11);
        N0 = new fdv(i2, (byte) 12);
        O0 = new fdv(i2, (byte) 13);
        P0 = new fdv(i2, (byte) 14);
        Q0 = new fdv(i2, (byte) 15);
        R0 = new fdv(i2, (byte) 16);
        S0 = new fdv(i2, (byte) 17);
        T0 = new fdv(i2, (byte) 18);
        U0 = new fdv(i2, (byte) 19);
        V0 = new fdv(i2, (byte) 20);
        W0 = new fdv(i2, (byte) 21);
        X0 = new fdv(i2, (byte) 22);
        Y0 = new fdv(i2, (byte) 23);
        Z0 = new fdv(i2, (byte) 24);
        a1 = new fdv(i2, (byte) 25);
        b1 = new fdv(i2, (byte) 26);
        c1 = new fdv(i2, (byte) 27);
        d1 = new fdv(i2, (byte) 28);
        e1 = new fdv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        String str2;
        mq70 mq70Var2;
        up70 up70VarA2;
        String str3 = null;
        switch (this.a) {
            case 0:
                rdv rdvVar = (rdv) obj2;
                return First.c(rdvVar, Collections.singleton(sgc1.E(rdvVar)));
            case 1:
                return new ufv((sfv) obj, (iix0) obj2);
            case 2:
                return new ufv((sfv) obj, (iix0) obj2);
            case 3:
                return (whv) obj2;
            case 4:
                return new wnb1((jo70) obj, (xkk1) obj2, (hll) null, (hzy) null, (iix0) null, (h2v) null, (zoy0) null, (w281) null, 508);
            case 5:
                return new qkv(((okv) obj).a, (String) obj2);
            case 6:
                return null;
            case 7:
                return Next.j();
            case 8:
                return (bov) obj2;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return new k3h1(((lpw0) obj).c);
            case 12:
                c2w c2wVar = (c2w) obj;
                return new c2w(c2wVar.b, c2wVar.a, c2wVar.c, ((Boolean) obj2).booleanValue());
            case 13:
                List list = (List) obj2;
                return list.isEmpty() ? s4w.a : new t4w(list);
            case 14:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                if (jo70Var == null) {
                    return r6g1.a;
                }
                String strF = jo70Var.b;
                if (strF.length() > 0) {
                    strF = ((Object) String.valueOf(strF.charAt(0)).toUpperCase(Locale.ROOT)) + strF.substring(1);
                }
                ho70 ho70Var = (ho70) o7h.s0(jo70Var.d);
                if (ho70Var == null || (str = ho70Var.a) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    strF = f4i1.f(strF, " · ", str);
                }
                xn70 xn70Var = new xn70(strF, (String) null, 6, (String) null);
                String str4 = jo70Var.a;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    str3 = up70VarA.a.a;
                }
                return new q6g1(xn70Var, new bv11(str4, (String) null, (Long) null, (Long) null, (u380) null, 0, false, (c380) null, (h540) null, (vno1) null, (c380) null, new sz6(str3), false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67106814));
            case 15:
                d5w d5wVar = (d5w) obj;
                q810 q810Var = (q810) obj2;
                String str5 = d5wVar.a;
                x4i1 x4i1Var = d5wVar.c;
                return new e5w(str5, x4i1Var != null ? x4i1Var.a : null, q810Var.a, q810Var.b);
            case 16:
                List list2 = (List) obj2;
                return list2.isEmpty() ? l5w.a : new m5w(list2);
            case 17:
                return (d6w) obj2;
            case 18:
                jo70 jo70Var2 = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                if (jo70Var2 == null || (str2 = jo70Var2.a) == null || str2.length() == 0) {
                    str2 = null;
                }
                if (xkk1Var2 != null && (mq70Var2 = xkk1Var2.a) != null && (up70VarA2 = mq70Var2.a(vp70.b)) != null) {
                    str3 = up70VarA2.a.a;
                }
                return new t2o(str2, str3);
            case 19:
                return null;
            case 20:
                return (f7w) obj2;
            case 21:
                return new g1g1((jo70) obj, (xkk1) obj2);
            case 22:
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return null;
            case 24:
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return null;
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                return null;
            default:
                return null;
        }
    }
}
