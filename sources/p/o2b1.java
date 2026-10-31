package p;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.TimeoutCancellationException;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o2b1 implements l3c, Function, s2k1, qiw, sh, SingleOnSubscribe, SingleTransformer, ya, q4t, FlowableOnSubscribe, y4l1, WebViewStartUpCallbackBoundaryInterface {
    public final /* synthetic */ byte a;
    public final Object b;

    public o2b1(so1 so1Var) {
        this.a = (byte) 19;
        this.b = new brh1(so1Var, (byte) 0);
    }

    public void a() {
        ((CountDownLatch) this.b).countDown();
    }

    public boolean accept(Object obj) {
        return ((drp0) this.b).a();
    }

    public Object apply(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                return ((PlayerState) obj).isPaused() ? Single.just(new k5l1(false)) : ((g0c1) obj2).b.a(new e9u0(PauseCommand.builder().pauseOrigin(PauseResumeOrigin.create("android-puffin-setup-flow")).options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(true).build()).build())).toObservable().flatMapCompletable(h2x0.Q0).e(Single.just(new k5l1(true)));
            case 6:
                wec1 wec1Var = (wec1) obj2;
                wec1Var.V((StatusResponseOuterClass.StatusResponse) obj, 4);
                wec1Var.P0 = null;
                wec1Var.O0 = false;
                return CompletableEmpty.a;
            case 8:
                List list = (List) obj;
                ctc1 ctc1Var = (ctc1) obj2;
                return Collections.singletonMap(ctc1Var.i.a, new v491(new ivd(list, !list.isEmpty(), null, w7x.a, ctc1Var.e)));
            case 12:
                Map map = (Map) obj;
                String str = (String) ((fip0) obj2).b;
                if (map.get(str) == null) {
                    return new f7h(false, false, false);
                }
                Object obj3 = map.get(str);
                obj3.getClass();
                return (f7h) obj3;
            case 22:
                hce1 hce1Var = (hce1) obj2;
                return cwl1.e0((q8n) hce1Var.d, new k6g1(hce1Var, (vn3) obj, lnmVar, (byte) 25));
            default:
                v0l1 v0l1Var = (v0l1) obj;
                String str2 = v0l1Var.b;
                String str3 = v0l1Var.c;
                CommandOptions commandOptions = j1l1.x;
                return ((j1l1) obj2).h.e(2, str2, str3).flatMap(njx0.X0).onErrorReturn(w1x0.c1).toObservable();
        }
    }

    public void b(JSONObject jSONObject, r3c r3cVar) {
        yt91 yt91Var = (yt91) this.b;
        if (((w62) yt91Var.b).k((Intent) yt91Var.c, true, jSONObject, r3cVar != null ? r3cVar.a : null)) {
            return;
        }
        ((ptb) yt91Var.d).invoke();
    }

    public Single c(Single single) {
        return single.map(new y281((ffe1) this.b, (byte) 27));
    }

    public void d() {
        uoa uoaVar = ((d9c1) this.b).f;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    public void e() {
        uoa uoaVar = ((d9c1) this.b).f;
        if (uoaVar != null) {
            uoaVar.l();
        }
    }

    public void f(m8b0 m8b0Var) {
        String strD = (m8b0Var.a.size() < 3 || TextUtils.isEmpty(m8b0Var.d(2))) ? "wamp.error.system_shutdown" : m8b0Var.d(2);
        p1f0 p1f0Var = (p1f0) ((s24) this.b).e;
        aos aosVar = (aos) p1f0Var.a;
        aosVar.b(strD);
        ((Disposable) p1f0Var.h).dispose();
        AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) p1f0Var.d;
        appProtocolRemoteService.e1.post(new iv5(appProtocolRemoteService, aosVar, (byte) 1));
        mj61 mj61Var = (mj61) p1f0Var.c;
        mj61Var.getClass();
        int i = aosVar.e;
        ConcurrentHashMap concurrentHashMap = mj61Var.a;
        concurrentHashMap.remove(Integer.valueOf(i));
        mj61Var.b.onNext(new ArrayList(concurrentHashMap.values()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, onm onmVar) throws Throwable {
        gdg1 gdg1Var;
        Boolean m231Var;
        if (onmVar instanceof gdg1) {
            gdg1Var = (gdg1) onmVar;
            int i = gdg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdg1Var.c = i - Integer.MIN_VALUE;
            } else {
                gdg1Var = new gdg1(this, onmVar);
            }
        } else {
            gdg1Var = new gdg1(this, onmVar);
        }
        Object objJ = gdg1Var.a;
        int i2 = gdg1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleB = lag1.b((lag1) this.b, str, 0L);
                gdg1Var.c = 1;
                objJ = fc11.j(singleB, gdg1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = Boolean.valueOf(((hag1) objJ).h);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
            return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
        }
        throw thA;
    }

    public void i(String str) {
        Logger.g("Start Waze feature by %s", new Object[]{str});
        Intent intent = new Intent(str);
        yt91 yt91Var = ((nrd) this.b).a;
        ((HashMap) yt91Var.d).put(intent.getAction(), intent);
        ((zce0) yt91Var.c).c(intent);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        ArrayList arrayList = null;
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) (invocationHandler == null ? null : WebViewStartUpResultBoundaryInterface.class.cast(Proxy.newProxyInstance(t0c.class.getClassLoader(), new Class[]{WebViewStartUpResultBoundaryInterface.class}, invocationHandler)));
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList2 = new ArrayList();
        for (Throwable th : blockingStartUpLocations) {
            arrayList2.add(new nbc((byte) 29));
        }
        if (bjl1.c.a()) {
            List<Throwable> asyncStartUpLocations = webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations();
            ArrayList arrayList3 = new ArrayList();
            for (Throwable th2 : asyncStartUpLocations) {
                arrayList3.add(new nbc((byte) 29));
            }
            arrayList = arrayList3;
        }
        ((iyh1) this.b).b(new bih1(arrayList2, arrayList, webViewStartUpResultBoundaryInterface));
    }

    public boolean r(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                if (!swipeDismissBehavior.t(view)) {
                    return false;
                }
                WeakHashMap weakHashMap = b8k1.a;
                boolean z = view.getLayoutDirection() == 1;
                byte b2 = swipeDismissBehavior.d;
                view.offsetLeftAndRight((!(b2 == 0 && z) && (b2 != 1 || z)) ? view.getWidth() : -view.getWidth());
                view.setAlpha(0.0f);
                jc9 jc9Var = swipeDismissBehavior.b;
                if (jc9Var == null) {
                    return true;
                }
                jc9Var.p(view);
                return true;
            default:
                ((qvs) obj).invoke(fzf1.t);
                return true;
        }
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        ViewTreeObserver.OnWindowFocusChangeListener zqi1Var = new zqi1(flowableEmitter, (byte) 1);
        View view = (View) this.b;
        flowableEmitter.onNext(Boolean.valueOf(view.hasWindowFocus()));
        view.getViewTreeObserver().addOnWindowFocusChangeListener(zqi1Var);
        flowableEmitter.setCancellable(new zak1(view, zqi1Var));
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                u4c1 u4c1Var = (u4c1) obj;
                he7 he7Var = (he7) obj2;
                View view = (View) he7Var.f;
                View view2 = he7Var.b;
                if (u4c1Var instanceof r4c1) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else if (u4c1Var instanceof s4c1) {
                    view2.setVisibility(0);
                    view.setVisibility(8);
                } else if (u4c1Var instanceof q4c1) {
                    view2.setVisibility(8);
                    view.setVisibility(0);
                } else if (!(u4c1Var instanceof t4c1)) {
                    eg.o();
                } else {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                    ((g4c1) he7Var.h).setVisibility(0);
                    he7Var.g.setVisibility(0);
                }
                break;
            default:
                ((j5g1) obj2).Y.f((y5g1) obj);
                break;
        }
    }

    public /* synthetic */ o2b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void g() {
    }

    public void subscribe(SingleEmitter singleEmitter) {
        dxg1 dxg1Var = (dxg1) this.b;
        dxg1Var.b = singleEmitter;
        singleEmitter.setCancellable(new ci0(dxg1Var, (byte) 10));
        if (dxg1Var.c) {
            return;
        }
        singleEmitter.onSuccess(Boolean.TRUE);
    }
}
