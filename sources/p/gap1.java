package p;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gap1 implements Function, Predicate, hx30, h5a {
    public static final gap1 c;
    public static final gap1 d;
    public static final gap1 e;
    public static final gap1 f;
    public static final gap1 g;
    public final /* synthetic */ byte a;
    public String b;

    static {
        byte b = 0;
        c = new gap1("UNKNOWN_KEYMATERIAL", b);
        d = new gap1("SYMMETRIC", b);
        e = new gap1("ASYMMETRIC_PRIVATE", b);
        f = new gap1("ASYMMETRIC_PUBLIC", b);
        g = new gap1("REMOTE", b);
    }

    public gap1(Context context) {
        this.a = (byte) 1;
        this.b = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public static void a(st60 st60Var, at61 at61Var) {
        String str = at61Var.a;
        if (str != null) {
            st60Var.x("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        st60Var.x("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        st60Var.x("X-CRASHLYTICS-API-CLIENT-VERSION", "19.3.0");
        st60Var.x("Accept", "application/json");
        st60Var.x("X-CRASHLYTICS-DEVICE-MODEL", at61Var.b);
        String str2 = at61Var.c;
        if (str2 != null) {
            st60Var.x("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = at61Var.d;
        if (str3 != null) {
            st60Var.x("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = at61Var.e.c().a;
        if (str4 != null) {
            st60Var.x("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap c(at61 at61Var) {
        HashMap map = new HashMap();
        map.put("build_version", at61Var.h);
        map.put("display_version", at61Var.g);
        map.put("source", Integer.toString(at61Var.i));
        String str = at61Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public Object apply(Object obj) {
        pp70 pp70Var;
        mq70 mq70Var;
        pp70 pp70Var2;
        mq70 mq70Var2;
        pp70 pp70Var3;
        afx afxVar = null;
        boolean z = false;
        switch (this.a) {
            case 3:
                return this.b;
            case 4:
                hll hllVar = ((uv00) obj).a(hll.class, this.b).b;
                if (hllVar == null) {
                    hllVar = new hll(0L, 15);
                }
                return Boolean.valueOf(hllVar.d.contains(fll.f));
            case 5:
                String str = this.b;
                bi90 bi90VarK = ekb.k((mh90) obj, str);
                if (bi90VarK != null) {
                    return bi90VarK;
                }
                hhg1.f("Not found V8 category with categoryKey = ".concat(str));
                return null;
            case 6:
                be60 be60Var = ((uv00) obj).a(be60.class, this.b).b;
                if (be60Var != null && be60Var.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
            case 8:
            case 9:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            default:
                f7h f7hVar = (f7h) ((Map) obj).get(this.b);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 10:
                xkk1 xkk1Var = ((uv00) obj).a(xkk1.class, this.b).b;
                if (xkk1Var == null || (mq70Var2 = xkk1Var.a) == null || (pp70Var3 = mq70Var2.b) == null) {
                    afx afxVar2 = (xkk1Var == null || (mq70Var = xkk1Var.b) == null || (pp70Var2 = mq70Var.b) == null) ? null : pp70Var2.c;
                    if (afxVar2 != null) {
                        afxVar = afxVar2;
                    } else if (xkk1Var != null && (pp70Var = xkk1Var.d) != null) {
                        afxVar = pp70Var.c;
                    }
                } else {
                    afxVar = pp70Var3.c;
                }
                if (afxVar == null) {
                    return new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true);
                }
                icx icxVar = afxVar.a;
                yxx yxxVar = afxVar.b;
                return new bff0(z4p1.G(icxVar.c), z4p1.G(icxVar.b.a()), z4p1.G(yxxVar.a), z4p1.G(yxxVar.b), z4p1.G(yxxVar.c), true);
            case grn1.d /* 12 */:
                Throwable th = (Throwable) obj;
                Logger.e(th, l1d.m("Failed to load metadata for entity, uri: ", this.b), new Object[0]);
                return new wae0(th);
            case 13:
                t8p0 t8p0Var = ((uv00) obj).a(t8p0.class, this.b).b;
                return t8p0Var == null ? new t8p0() : t8p0Var;
            case 14:
                Object obj2 = ((Map) obj).get(this.b);
                obj2.getClass();
                return (g281) obj2;
            case 15:
                Logger.e((Throwable) obj, "Error on storyUserRequestsEventSource for feature ".concat(this.b), new Object[0]);
                return Observable.empty();
        }
    }

    public m09 b() {
        String str = this.b;
        if (str != null) {
            return new m09(str);
        }
        eg.m("Missing required properties: identifier");
        return null;
    }

    public void d(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null identifier");
        }
    }

    public af5 g(x340 x340Var) {
        x340Var.i0(-545278290);
        String str = this.b;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        int length = str.length();
        uwr uwrVar = cbx.a;
        arrayListM.add(new xe5(0, length, 8, new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).h.a.c, cbx.d(x340Var).h.a.d, (FontSynthesis) null, cbx.d(x340Var).h.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490), (String) null));
        sb.append(str);
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
        }
        af5 af5Var = new af5(string, arrayList);
        x340Var.r(false);
        return af5Var;
    }

    public void onFailure(Throwable th) {
        oon1.I("custom command " + this.b + " produced an error: " + th.getMessage(), th);
    }

    public void onSuccess(Object obj) {
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return ((kdn) obj).b.equals(this.b);
            default:
                return u890.j(((PlayerState) obj).contextUri(), this.b);
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

    public /* synthetic */ gap1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public gap1(d8e d8eVar, String str) {
        this.a = (byte) 5;
        this.b = str;
    }

    public /* synthetic */ gap1(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
    }

    public gap1() {
        this.a = (byte) 2;
    }
}
