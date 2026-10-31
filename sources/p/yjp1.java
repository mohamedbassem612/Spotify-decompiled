package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.familygatedcontent.v1.GetFeatureRequestDialogResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.signup.signup.v2.proto.ValidateAccountResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.File;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yjp1 implements Function, Function5, Predicate {
    public static final yjp1 c;
    public static final yjp1 d;
    public static final yjp1 e;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new yjp1("SHA256", b);
        d = new yjp1("SHA384", b);
        e = new yjp1("SHA512", b);
    }

    public yjp1(String str) {
        String strC;
        this.a = (byte) 17;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(nne.a));
            raa raaVarH = raa.a;
            if (((qaa) raaVarH).d != null) {
                raaVarH = raaVarH.h(((qaa) raaVarH).c, (Character) null);
            }
            strC = raaVarH.c(bArrDigest, 16);
        } catch (Exception unused) {
            strC = "";
        }
        this.b = strC;
    }

    public Object apply(Object obj) {
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        List list;
        byte b = this.a;
        String str2 = null;
        boolean z = false;
        String str3 = this.b;
        switch (b) {
            case 1:
                uv00 uv00Var = (uv00) obj;
                jo70 jo70Var = uv00Var.a(jo70.class, str3).b;
                if (jo70Var == null || (str = jo70Var.a) == null) {
                    eg.m("Failed to retrieve title");
                    return null;
                }
                xkk1 xkk1Var = uv00Var.a(xkk1.class, str3).b;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    str2 = up70VarA.a.a;
                }
                return new ho8(str3, str, str2);
            case 2:
                f7h f7hVar = (f7h) ((Map) obj).get(str3);
                return f7hVar == null ? new f7h(false, false, false) : f7hVar;
            case 3:
            case 5:
            case 13:
            case 15:
            case 17:
            default:
                w281 w281Var = ((uv00) obj).a(w281.class, str3).b;
                if (w281Var != null && w281Var.c) {
                    z = true;
                }
                if (w281Var == null || (list = w281Var.d) == null) {
                    list = z6x.a;
                }
                return new inc1(list, z);
            case 4:
                return Observable.fromIterable((List) obj).filter(new njp1(str3, (byte) 7)).filter(bbn.X0).filter(ios.X0);
            case 6:
                return bqz.a(str3, (EsPrefs.PrefValues) obj);
            case 7:
                GetFeatureRequestDialogResponse getFeatureRequestDialogResponse = (GetFeatureRequestDialogResponse) obj;
                String strP = getFeatureRequestDialogResponse.p();
                String strO = getFeatureRequestDialogResponse.o();
                int i = jv3.a[getFeatureRequestDialogResponse.q().ordinal()];
                String str4 = this.b;
                return new qu3(strP, strO, i == 1 ? new ou3(str4) : pu3.d, getFeatureRequestDialogResponse.r(), getFeatureRequestDialogResponse.n(), str4);
            case 8:
                q730 q730Var = (q730) ((Map) obj).get(str3);
                return q730Var == null ? new q730(0, 15) : q730Var;
            case 9:
                uv00 uv00Var2 = (uv00) obj;
                w281 w281Var2 = uv00Var2.a(w281.class, str3).b;
                if (w281Var2 != null && w281Var2.c) {
                    return MaybeEmpty.a;
                }
                tlr0 tlr0Var = uv00Var2.a(tlr0.class, str3).b;
                return (tlr0Var == null || tlr0Var.g.length() == 0) ? MaybeEmpty.a : Maybe.e(tlr0Var);
            case 10:
                jo70 jo70Var2 = ((uv00) obj).a(jo70.class, str3).b;
                return jo70Var2 == null ? new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31) : jo70Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused() && u890.j(playerState.contextUri(), str3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case grn1.d /* 12 */:
                try {
                    return Long.valueOf(new File(str3).lastModified());
                } catch (Exception unused) {
                    return 0L;
                }
            case 14:
                f7h f7hVar2 = (f7h) ((Map) obj).get(str3);
                return (f7hVar2 == null || !f7hVar2.a) ? pyt0.b : pyt0.a;
            case 16:
                return ((uv00) obj).a(jo70.class, str3);
            case 18:
                return Boolean.valueOf(lnn1.l(((uv00) obj).a(m1b1.class, str3).b));
            case 19:
                ValidateAccountResponse validateAccountResponse = (ValidateAccountResponse) obj;
                int iO = validateAccountResponse.o();
                int i2 = iO == 0 ? -1 : dr81.b[l1d.C(iO)];
                if (i2 == 1) {
                    return new d320(new tyw(str3));
                }
                if (i2 != 2) {
                    return new d320(new ryw(str3, (String) null));
                }
                int iP = validateAccountResponse.n().p();
                int i3 = iP != 0 ? dr81.a[l1d.C(iP)] : -1;
                if (i3 == 1) {
                    return new d320(new ryw(str3, (String) null));
                }
                if (i3 == 2) {
                    String strY0 = o7h.y0(validateAccountResponse.n().o().o(), "\n", (String) null, (String) null, oa81.e1, 30);
                    return strY0.length() > 0 ? new d320(new ryw(str3, strY0)) : new d320(new syw(str3, -2));
                }
                if (i3 != 3) {
                    return i3 != 4 ? new d320(new ryw(str3, (String) null)) : new d320(new syw(str3, 120));
                }
                return new d320(new syw(str3, 20));
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        er61 er61Var = (er61) obj;
        String str = (String) obj2;
        Boolean bool = (Boolean) obj3;
        Boolean bool2 = (Boolean) obj4;
        m8v0 m8v0Var = (m8v0) obj5;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        bool2.getClass();
        boolean zBooleanValue2 = bool2.booleanValue();
        m8v0Var.getClass();
        g8v0 g8v0Var = new g8v0(er61Var.c);
        f8v0 f8v0Var = new f8v0(er61Var.d, er61Var.e);
        cr61 cr61Var = er61Var.a;
        e8v0 c8v0Var = null;
        if (!(cr61Var instanceof ar61)) {
            if (cr61Var instanceof br61) {
                c8v0Var = d8v0.c;
            } else {
                if (!(cr61Var instanceof cr61)) {
                    eg.o();
                    return null;
                }
                cr61 cr61Var2 = cr61Var;
                c8v0Var = new c8v0(cr61Var2.a, cr61Var2.b, cr61Var2.c);
            }
        }
        return new p8v0(str, this.b, g8v0Var, f8v0Var, c8v0Var, er61Var.b ? new n8v0(zBooleanValue) : o8v0.c, m8v0Var, zBooleanValue2);
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 5:
                d1a1 d1a1Var = (q1a1) obj;
                if (d1a1Var instanceof d1a1) {
                    return u890.j(d1a1Var.a.a, str);
                }
                return d1a1Var instanceof p1a1;
            case 13:
                wv00 wv00Var = (uv00) obj;
                return (wv00Var.f && wv00Var.a(jo70.class, str).b == null) ? false : true;
            case 15:
                PlayerState playerState = (PlayerState) obj;
                return u890.j(playerState.contextUri(), str) && playerState.isPlaying() && !playerState.isPaused();
            default:
                return str.equals(((dvf1) obj).a);
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yjp1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public yjp1(String str, jo8 jo8Var) {
        this.a = (byte) 1;
        this.b = str;
    }

    public /* synthetic */ yjp1(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
    }
}
