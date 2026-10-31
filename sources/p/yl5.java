package p;

import android.app.Application;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.android.installreferrer.api.InstallReferrerClient;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class yl5 implements jly0 {
    public static String A(ozo ozoVar) {
        String settingsPath = ((ApplicationScopeConfiguration) ozoVar.e.get()).getSettingsPath();
        if (settingsPath != null) {
            return settingsPath;
        }
        eg.m("Required value was null.");
        return null;
    }

    public static dma1 B(Context context, ut71 ut71Var) {
        dma1 dma1VarA = ut71Var.a(context);
        c8o.m(dma1VarA);
        return dma1VarA;
    }

    public static e0f1 C(ozo ozoVar) {
        return new e0f1(ozoVar.h);
    }

    public static Observable D(ozo ozoVar) {
        Observable observable = (Observable) ozoVar.k.get();
        c8o.m(observable);
        return observable;
    }

    public static v2 a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        v2 v2Var = new v2((byte) 13);
        v2Var.b = ynb0Var;
        v2Var.c = ynb0Var2;
        return v2Var;
    }

    public static pt0 b(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 13);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static io5 c(r7q r7qVar, r7q r7qVar2, r7q r7qVar3, caq caqVar, kly0 kly0Var) {
        io5 io5Var = new io5();
        io5Var.a = r7qVar;
        io5Var.b = kly0Var;
        io5Var.c = r7qVar2;
        io5Var.d = caqVar;
        io5Var.e = r7qVar3;
        return io5Var;
    }

    public static mz5 d(g5t g5tVar, jo80 jo80Var, caq caqVar, caq caqVar2, caq caqVar3, r7q r7qVar, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var) {
        mz5 mz5Var = new mz5();
        mz5Var.a = g5tVar;
        mz5Var.b = jo80Var;
        mz5Var.c = caqVar;
        mz5Var.d = caqVar2;
        mz5Var.e = caqVar3;
        mz5Var.f = r7qVar;
        mz5Var.g = caqVar4;
        mz5Var.h = caqVar5;
        mz5Var.i = caqVar6;
        mz5Var.j = caqVar7;
        mz5Var.k = r7qVar2;
        mz5Var.l = r7qVar3;
        mz5Var.m = kly0Var;
        return mz5Var;
    }

    public static Observable e(hx5 hx5Var) {
        return hx5Var.b;
    }

    public static mr20 f(hx5 hx5Var) {
        return rqt0.u(yoi1.g(hx5Var.b));
    }

    public static String g(Application application) {
        return application.getPackageName();
    }

    public static jn7 h(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 0)));
    }

    public static Handler i() {
        HandlerThread handlerThread = new HandlerThread("backgroundHandler");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static Observable j(ozo ozoVar) {
        return eth.X((xm41) ((kly0) ozoVar.a.d).get()).map(wdu0.X);
    }

    public static ContentResolver k(Application application) {
        ContentResolver contentResolver = application.getContentResolver();
        c8o.m(contentResolver);
        return contentResolver;
    }

    public static joo l(ozo ozoVar) {
        joo jooVar = (joo) ozoVar.l.get();
        c8o.m(jooVar);
        return jooVar;
    }

    public static String m(l7m0 l7m0Var) {
        return Locale.forLanguageTag((String) o7h.q0(ihc1.Q0(yoi1.A(((Application) l7m0Var.b).getResources().getConfiguration()).a.a.toLanguageTags(), new String[]{","}, 0, 6))).toLanguageTag();
    }

    public static DisplayMetrics n(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static wpu o() {
        return new wpu();
    }

    public static Handler p(Looper looper) {
        return new Handler(looper);
    }

    public static InstallReferrerClient q(Context context) {
        return InstallReferrerClient.newBuilder(context).build();
    }

    public static peb0 r(RetrofitMaker retrofitMaker) {
        return (peb0) retrofitMaker.createWebgateService(peb0.class, "android-language-applanguagesettingsimpl");
    }

    public static jqk0 s() {
        return new jqk0();
    }

    public static zce0 t(Application application) {
        return zce0.a(application);
    }

    public static NotificationManager u(Application application) {
        NotificationManager notificationManager = (NotificationManager) application.getSystemService("notification");
        c8o.m(notificationManager);
        return notificationManager;
    }

    public static BehaviorSubject v(ozo ozoVar) {
        BehaviorSubject behaviorSubject = (BehaviorSubject) ozoVar.b.get();
        c8o.m(behaviorSubject);
        return behaviorSubject;
    }

    public static byy0 w(ozo ozoVar) {
        return new byy0(ozoVar.a.p());
    }

    public static Random x(ozo ozoVar) {
        Random random = (Random) ozoVar.i.get();
        c8o.m(random);
        return random;
    }

    public static iz11 y(ozo ozoVar) {
        return new iz11(ozoVar.a.p());
    }

    public static fu61 z(ozo ozoVar) {
        zl5 zl5Var = ozoVar.a;
        return new fu61(zl5Var.p(), (xs80) ozoVar.g.get(), (fqw0) ((kly0) zl5Var.y).get());
    }
}
