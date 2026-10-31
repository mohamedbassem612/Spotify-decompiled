package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.WindowInsetsAnimation;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class t8e1 implements Function, l3c, BiFunction, log1, hc10, elk1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ t8e1(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation i(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void l(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void n(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void p(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public void a(Exception exc) {
    }

    public Object apply(Object obj, Object obj2) {
        o5e0 o5e0Var = (o5e0) obj;
        o5e0 o5e0Var2 = (o5e0) obj2;
        if (!o5e0Var.h() && !o5e0Var.a()) {
            return o5e0Var2;
        }
        eg.m("mustn't change state again after completing loading");
        return null;
    }

    public void b(JSONObject jSONObject, r3c r3cVar) {
    }

    @Override // p.elk1
    public cgg1 d(af5 af5Var) {
        return new cgg1(af5Var, gyp0.a);
    }

    public Object e(Object obj, Object obj2) {
        qop qopVar = (qop) obj;
        switch (this.a) {
            case 8:
                qopVar.getClass();
                ((pbt) obj2).getClass();
                return new q93((byte) 3);
            case 21:
                qopVar.getClass();
                ((gzu0) obj2).getClass();
                return new ymm((byte) 3);
            default:
                pbt pbtVar = (pbt) obj2;
                qopVar.getClass();
                pbtVar.getClass();
                return new uqg(pbtVar.a, (byte) 7);
        }
    }

    public void f(Context context, pwg1 pwg1Var, String str, gv40 gv40Var) {
        switch (this.a) {
            case 10:
                oql oqlVarA = pwg1Var.b.a();
                Intent intent = (Intent) oqlVarA.b;
                if (str != null) {
                    intent.setPackage(str);
                }
                if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                    intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                }
                oqlVarA.j(context, pwg1Var.a);
                gv40Var.run();
                break;
            default:
                Uri uri = pwg1Var.a;
                nkb0 nkb0VarA = nkb0.a(context);
                int i = zil1.a;
                Intent intent2 = new Intent(context, (Class<?>) zil1.class);
                intent2.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL", uri);
                intent2.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", context.getColor(nkb0VarA.b));
                intent2.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", context.getColor(nkb0VarA.d));
                List list = nkb0VarA.l;
                if (list != null) {
                    intent2.putStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS", new ArrayList<>(list));
                }
                context.startActivity(intent2);
                gv40Var.run();
                break;
        }
    }

    @Override // p.hc10
    public ec10[] g() {
        int i = 0;
        switch (this.a) {
            case 9:
                yve1 yve1Var = new yve1(0L);
                w280 w280Var = b380.b;
                return new ec10[]{new uwg1(1, 1, jqc1.o0, yve1Var, new yxs(i, bg11.e))};
            default:
                return new ec10[]{new cdl1()};
        }
    }

    public Object apply(Object obj) {
        return Observable.never();
    }
}
