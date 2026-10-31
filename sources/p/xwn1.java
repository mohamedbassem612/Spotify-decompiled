package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.comscore.streaming.WindowState;
import com.spotify.authentication.login5.Login5Configuration;
import com.spotify.authentication.login5setupimpl.NativeLogin5SetupImpl;
import com.spotify.base.java.logging.Logger;
import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.TimerManagerThreadScheduler;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.connectivitysdkcredentialsstorage.PrefsCredentialsStorage;
import com.spotify.connectivity.connectivitysdkpolicyimpl.DefaultConnectionTypeProvider;
import com.spotify.connectivity.connectivitysdkpolicyimpl.DefaultConnectivityPolicyProvider;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.trafficsetupimpl.NativeTrafficSetupImpl;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.fileaccess.fileio.NativeFileIO;
import com.spotify.prefs.prefsimpl.NativePrefs;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xwn1 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public /* synthetic */ xwn1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:193:0x0580  */
    @Override // java.lang.Runnable
    public final void run() {
        y550 y550VarF;
        Throwable thD;
        Object next;
        int iE;
        int i;
        int i2;
        int i3 = 0;
        try {
            switch (this.a) {
                case 0:
                    fqn1 fqn1Var = (fqn1) this.c;
                    nvn1 nvn1Var = (gyn1) this.b;
                    if ((nvn1Var instanceof nvn1) && (thD = nvn1Var.d()) != null) {
                        fqn1Var.e(thD);
                        return;
                    }
                    try {
                        if (!nvn1Var.isDone()) {
                            throw new IllegalStateException(y4o1.x("Future was expected to be done: %s", new Object[]{nvn1Var}));
                        }
                        boolean z = false;
                        while (true) {
                            try {
                                Object obj = nvn1Var.get();
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                Integer num = (Integer) obj;
                                int iIntValue = num.intValue();
                                axn1 axn1Var = (axn1) fqn1Var.d;
                                if (iIntValue <= 0) {
                                    ((sl21) fqn1Var.c).run();
                                    return;
                                }
                                iua iuaVarA = iyn1.a(num.intValue(), "Billing override value was set by a license tester.");
                                axn1Var.d0(93, 7, iuaVarA);
                                ((uh30) fqn1Var.b).accept(iuaVarA);
                                return;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                    } catch (ExecutionException e) {
                        fqn1Var.e(e.getCause());
                        return;
                    } catch (Throwable th2) {
                        fqn1Var.e(th2);
                        return;
                    }
                    break;
                case 1:
                    ((xg0) this.b).a = this.c;
                    return;
                case 2:
                    Object obj2 = this.c;
                    Object obj3 = this.b;
                    try {
                        Method method = yg0.d;
                        if (method != null) {
                            method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            yg0.e.invoke(obj3, obj2, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e2) {
                        if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                            throw e2;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                case 3:
                    ec5 ec5Var = (ec5) this.b;
                    zb5 zb5Var = ec5Var.a;
                    tw4 tw4Var = (u8s0) this.c;
                    zb5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (!(tw4Var instanceof tw4)) {
                        hhg1.h("Unable to obtain android.graphics.Path");
                        return;
                    }
                    PathMeasure pathMeasure = new PathMeasure(tw4Var.a, false);
                    float length = pathMeasure.getLength();
                    if (length != 0.0f) {
                        int iP = yoi1.p((int) (length / 2.0f), 50, WindowState.NORMAL);
                        float[] fArr = {0.0f, 0.0f};
                        float[] fArr2 = {0.0f, 0.0f};
                        if (iP >= 0) {
                            int i4 = 0;
                            while (true) {
                                float f = i4 / iP;
                                pathMeasure.getPosTan(f * length, fArr, fArr2);
                                float f2 = -fArr2[1];
                                float f3 = fArr2[0];
                                float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                                float f4 = fSqrt > 0.0f ? f2 / fSqrt : 0.0f;
                                float f5 = fSqrt > 0.0f ? f3 / fSqrt : 0.0f;
                                arrayList.add(Float.valueOf(fArr[0]));
                                arrayList.add(Float.valueOf(fArr[1]));
                                arrayList.add(Float.valueOf(f));
                                arrayList.add(Float.valueOf(0.0f));
                                arrayList.add(Float.valueOf((f4 * 40.0f) + fArr[0]));
                                arrayList.add(Float.valueOf((f5 * 40.0f) + fArr[1]));
                                arrayList.add(Float.valueOf(f));
                                arrayList.add(Float.valueOf(1.0f));
                                if (i4 != iP) {
                                    i4++;
                                }
                            }
                        }
                        zb5Var.d = arrayList.size() / 4;
                        float[] fArrI1 = o7h.i1(arrayList);
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArrI1.length * 4);
                        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
                        floatBufferAsFloatBuffer.put(fArrI1);
                        floatBufferAsFloatBuffer.position(0);
                        GLES20.glBindBuffer(34962, zb5Var.c);
                        GLES20.glBufferData(34962, fArrI1.length * 4, floatBufferAsFloatBuffer, 35044);
                        GLES20.glBindBuffer(34962, 0);
                    }
                    ec5Var.a();
                    return;
                case 4:
                    ui7 ui7Var = (ui7) this.c;
                    wi7 wi7Var = ui7Var.e;
                    if (wi7Var.g == ui7Var.c) {
                        List list = ui7Var.b;
                        j4u j4uVar = (j4u) this.b;
                        Runnable runnable = ui7Var.d;
                        List list2 = wi7Var.f;
                        wi7Var.e = list;
                        wi7Var.f = Collections.unmodifiableList(list);
                        j4uVar.a(wi7Var.a);
                        wi7Var.a(list2, runnable);
                        return;
                    }
                    return;
                case 5:
                    tl7 tl7Var = (tl7) this.b;
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    tl7Var.g(0, Float.valueOf(iro1.u(recyclerView)), Float.valueOf(iro1.v(recyclerView)), recyclerView.getResources().getDisplayMetrics().density);
                    return;
                case 6:
                    try {
                        ((bqc) this.c).b.put((mn21) this.b);
                        return;
                    } catch (InterruptedException unused3) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                case 7:
                    fmd fmdVar = (fmd) this.b;
                    fmdVar.g = false;
                    if (((Boolean) fmdVar.a.invoke()).booleanValue()) {
                        RecyclerView recyclerView2 = (RecyclerView) this.c;
                        if (recyclerView2.S0.size() == 0) {
                            return;
                        }
                        a aVar = recyclerView2.Q0;
                        if (aVar != null) {
                            aVar.n("Cannot invalidate item decorations during a scroll or layout");
                        }
                        recyclerView2.a0();
                        recyclerView2.requestLayout();
                        return;
                    }
                    return;
                case 8:
                    try {
                        dce dceVar = (dce) this.c;
                        Object objZ = poz0.z((n8d0) this.b);
                        mzc mzcVar = dceVar.b;
                        if (mzcVar != null) {
                            mzcVar.b(objZ);
                        }
                        break;
                    } catch (CancellationException unused4) {
                        ((dce) this.c).cancel(false);
                    } catch (ExecutionException e3) {
                        dce dceVar2 = (dce) this.c;
                        Throwable cause = e3.getCause();
                        mzc mzcVar2 = dceVar2.b;
                        if (mzcVar2 != null) {
                            mzcVar2.c(cause);
                        }
                    }
                    return;
                case 9:
                    ((EditText) this.b).removeTextChangedListener(((jgg) this.c).b.e);
                    return;
                case 10:
                    wtg wtgVar = (wtg) this.b;
                    lag lagVar = wtgVar.e;
                    LinkedHashMap linkedHashMap = wtgVar.f;
                    String str = (String) this.c;
                    ttg ttgVar = (ttg) linkedHashMap.remove(str);
                    if (ttgVar != null) {
                        ttgVar.a(null);
                    }
                    jtg jtgVar = (jtg) lagVar.b;
                    xe01 xe01Var = jtgVar.d;
                    zob1 zob1Var = xe01Var.a;
                    boolean zJ = u890.j(((gtg) xe01Var.a.getValue()).a, str);
                    ((LinkedHashMap) lagVar.e).remove(str);
                    gtg gtgVar = (gtg) zob1Var.getValue();
                    LinkedHashMap linkedHashMap2 = jtgVar.b;
                    linkedHashMap2.remove(str);
                    if (u890.j(((gtg) jtgVar.a.getValue()).a, str)) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            if (((itg) entry.getValue()).c > 0) {
                                linkedHashMap3.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it = linkedHashMap3.entrySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                long j = ((itg) ((Map.Entry) next).getValue()).c;
                                do {
                                    Object next2 = it.next();
                                    long j2 = ((itg) ((Map.Entry) next2).getValue()).c;
                                    if (j < j2) {
                                        j = j2;
                                        next = next2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        jtgVar.a(entry2 != null ? (String) entry2.getKey() : null);
                    }
                    gtg gtgVar2 = (gtg) zob1Var.getValue();
                    if (!u890.j(gtgVar2, gtgVar)) {
                        ((ftg) lagVar.c).a(gtgVar2);
                    }
                    if (zJ) {
                        lagVar.s(((gtg) zob1Var.getValue()).a);
                    }
                    String str2 = ((gtg) zob1Var.getValue()).a;
                    if (u890.j(wtgVar.g, str)) {
                        if (str2 == null) {
                            str2 = (String) o7h.B0(linkedHashMap.keySet());
                        } else {
                            if (!linkedHashMap.containsKey(str2)) {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = (String) o7h.B0(linkedHashMap.keySet());
                            }
                        }
                        wtgVar.g = str2;
                        wtgVar.c();
                    }
                    if (linkedHashMap.isEmpty()) {
                        cug cugVar = wtgVar.a;
                        cugVar.getClass();
                        ame ameVar = new ame(cugVar, (Object) null, (byte) 19);
                        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                            ameVar.invoke();
                        } else {
                            cugVar.b.post(new is3(ameVar, (byte) 3));
                        }
                        wtgVar.h = null;
                        wtgVar.i = 0;
                        wtgVar.t = 0;
                        lagVar.q((ViewGroup) null);
                    }
                    wtgVar.e();
                    wtgVar.d();
                    Logger.g("unregisterPlayback: id=%s", new Object[]{str});
                    return;
                case 11:
                    ((kjh) this.b).R0 = ((ukh) this.c).b;
                    return;
                case 12:
                    ((zf30) ((kph) this.b)).s1.a((cqh) this.c);
                    return;
                case 13:
                    zln0 zln0Var = NativeConnectivityManager.Companion;
                    SharedCosmosRouterApi sharedCosmosRouterApi = (SharedCosmosRouterApi) this.b;
                    NativeRouter nativeRouter = sharedCosmosRouterApi.getNativeRouter();
                    mcl mclVar = (mcl) this.c;
                    d8n d8nVar = mclVar.b;
                    TimerManagerThreadScheduler timerManagerThreadScheduler = new TimerManagerThreadScheduler(d8nVar.c);
                    AnalyticsDelegate analyticsDelegate = mclVar.a;
                    zln0Var.getClass();
                    NativeConnectivityManager nativeConnectivityManagerCreate = NativeConnectivityManager.create(nativeRouter, timerManagerThreadScheduler, analyticsDelegate, true);
                    qov0 qov0Var = PrefsCredentialsStorage.Companion;
                    NativePrefs nativePrefs = mclVar.d.a;
                    ApplicationScopeConfiguration applicationScopeConfiguration = mclVar.e;
                    String deviceId = applicationScopeConfiguration.getDeviceId();
                    if (deviceId == null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    qov0Var.getClass();
                    NativeCredentialsStorage nativeCredentialsStorageCreate = PrefsCredentialsStorage.create(nativePrefs, deviceId);
                    DefaultConnectionTypeProvider.Companion.getClass();
                    NativeConnectionTypeProvider nativeConnectionTypeProviderCreate = DefaultConnectionTypeProvider.create(nativeConnectivityManagerCreate);
                    DefaultConnectivityPolicyProvider.Companion.getClass();
                    NativeConnectivityPolicyProvider nativeConnectivityPolicyProviderCreate = DefaultConnectivityPolicyProvider.create(nativeConnectivityManagerCreate);
                    wln0 wln0Var = NativeApplicationScope.Companion;
                    NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = d8nVar.a;
                    NativeRouter nativeRouter2 = sharedCosmosRouterApi.getNativeRouter();
                    AnalyticsDelegate analyticsDelegate2 = mclVar.a;
                    ApplicationScopeConfiguration applicationScopeConfiguration2 = mclVar.e;
                    sz4 sz4Var = mclVar.g.a;
                    NativeTrafficSetupImpl nativeTrafficSetupImpl = mclVar.f.b;
                    if (nativeTrafficSetupImpl == null) {
                        u890.C("nativeTrafficSetup");
                        throw null;
                    }
                    NativeFileIO nativeFileIO = mclVar.i.a;
                    wln0Var.getClass();
                    NativeApplicationScope nativeApplicationScopeCreate = NativeApplicationScope.create(nativeTimerManagerThreadImpl, nativeRouter2, analyticsDelegate2, nativeConnectionTypeProviderCreate, nativeConnectivityPolicyProviderCreate, nativeCredentialsStorageCreate, applicationScopeConfiguration2, sz4Var, nativeTrafficSetupImpl, nativeFileIO);
                    fmn0 fmn0Var = NativeLogin5SetupImpl.Companion;
                    Login5Configuration login5Configuration = new Login5Configuration();
                    String clientId = applicationScopeConfiguration.getClientId();
                    clientId.getClass();
                    login5Configuration.setClientId(clientId);
                    String deviceId2 = applicationScopeConfiguration.getDeviceId();
                    deviceId2.getClass();
                    login5Configuration.setDeviceId(deviceId2);
                    login5Configuration.setProtocolVersion(3);
                    NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl2 = d8nVar.a;
                    fmn0Var.getClass();
                    NativeLogin5SetupImpl nativeLogin5SetupImplCreate = NativeLogin5SetupImpl.create(login5Configuration, nativeTimerManagerThreadImpl2, nativeApplicationScopeCreate);
                    mclVar.t = nativeConnectivityManagerCreate;
                    mclVar.X = nativeCredentialsStorageCreate;
                    mclVar.Y = nativeConnectionTypeProviderCreate;
                    mclVar.Z = nativeConnectivityPolicyProviderCreate;
                    mclVar.N0 = nativeApplicationScopeCreate;
                    mclVar.O0 = nativeLogin5SetupImplCreate;
                    mclVar.P0 = new by60(new SchedulingTransport(mclVar.c.a, mclVar.a().getNativeHostsProviderTransport()));
                    return;
                case 14:
                    ((f0i) ((dg30) ((wdm) this.b).b)).a.a(new ct6((rzq) this.c, (byte) 3));
                    return;
                case 15:
                    p0l p0lVar = (p0l) this.c;
                    mnr mnrVar = (mnr) this.b;
                    if (mnrVar.c.get()) {
                        mnrVar.d.onNext(p0lVar);
                        return;
                    } else {
                        mnrVar.b.add(p0lVar);
                        return;
                    }
                case 16:
                    kp5 kp5Var = (kp5) this.b;
                    ((ke71) kp5Var.c).m();
                    er91 er91Var = new er91((fs91) null, (String) this.c, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                    kt91 kt91Var = (kt91) kp5Var.d;
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                        return;
                    } else {
                        kt91Var.o(er91Var);
                        return;
                    }
                case 17:
                    ((AutoCompleteTextView) this.b).removeTextChangedListener(((jgg) this.c).b.e);
                    return;
                case 18:
                    Object obj4 = this.c;
                    p900 p900Var = (p900) this.b;
                    if (p900Var.c.get()) {
                        p900Var.d.onNext(obj4);
                        return;
                    } else {
                        p900Var.b.add(obj4);
                        return;
                    }
                case 19:
                    ja00 ja00Var = (ja00) this.c;
                    HashMap map = ja00Var.d;
                    String str3 = (String) this.b;
                    if (map.containsKey(str3)) {
                        map.remove(str3);
                        ja00Var.b.invoke(new a2l1(str3));
                        return;
                    }
                    return;
                case 20:
                    RecyclerView recyclerView3 = (RecyclerView) this.c;
                    z511 adapter = recyclerView3.getAdapter();
                    if (adapter == null || (iE = adapter.e()) <= 0) {
                        return;
                    }
                    recyclerView3.u0(iE - 1);
                    recyclerView3.post(new b110(recyclerView3, (byte) 0));
                    return;
                case 21:
                    try {
                        y550VarF = sgc1.F();
                        break;
                    } catch (Throwable th3) {
                        Logger.e(th3, "Failed to read GPU info", new Object[0]);
                        Logger.b("GPU probe failed: %s", new Object[]{th3.getMessage()});
                        y550VarF = jo31.a;
                    }
                    ((AtomicReference) this.b).set(y550VarF);
                    ((ft30) this.c).invoke(y550VarF);
                    return;
                case 22:
                    p410 p410Var = (p410) this.b;
                    ps70 ps70Var = (ps70) this.c;
                    Double d = ps70Var.h;
                    ZoomImageView zoomImageView = (ZoomImageView) p410Var.g;
                    int width = d != null ? (int) (((double) zoomImageView.getWidth()) / d.doubleValue()) : -2;
                    ViewGroup.LayoutParams layoutParams = zoomImageView.getLayoutParams();
                    layoutParams.height = width;
                    zoomImageView.setLayoutParams(layoutParams);
                    zoomImageView.requestLayout();
                    zoomImageView.invalidate();
                    String str4 = ps70Var.d;
                    wx70 wx70Var = (wx70) p410Var.d;
                    Context context = (Context) p410Var.b;
                    ZoomImageView zoomImageView2 = (ZoomImageView) p410Var.g;
                    int width2 = zoomImageView2.getWidth();
                    int height = zoomImageView2.getHeight();
                    wx70Var.getClass();
                    String str5 = "2131232009:" + width2 + "x" + height;
                    HashMap map2 = wx70Var.a;
                    Drawable drawable = (Drawable) map2.get(str5);
                    if (drawable == null) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.drawColor(context.getColor(2131102505));
                        StateListDrawable stateListDrawable = (StateListDrawable) context.getDrawable(2131232009);
                        stateListDrawable.mutate().setTintList(x74.E(context, 2131102507));
                        int i5 = width2 / 3;
                        int i6 = i5 / 2;
                        int i7 = (width2 / 2) - i6;
                        int i8 = (height / 2) - i6;
                        stateListDrawable.setBounds(i7, i8, i7 + i5, i5 + i8);
                        stateListDrawable.draw(canvas);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
                        map2.put(str5, bitmapDrawable);
                        drawable = bitmapDrawable;
                    }
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166180);
                    ixg ixgVarF = ((gw70) p410Var.c).f(str4);
                    ixgVarF.m(drawable);
                    ixgVarF.h();
                    ixgVarF.s(new fr31(Integer.valueOf(dimensionPixelSize)));
                    ixgVarF.k(zoomImageView2, (ird1) null);
                    return;
                case 23:
                    RecyclerView recyclerView4 = (RecyclerView) this.b;
                    recyclerView4.setPadding(recyclerView4.getPaddingLeft(), recyclerView4.getPaddingTop(), recyclerView4.getPaddingRight(), ((View) ((oj80) this.c).b).getHeight());
                    return;
                case 24:
                    while (true) {
                        try {
                            ((Runnable) this.b).run();
                        } catch (Throwable th4) {
                            omo1.p(th4, o6x.a);
                        }
                        try {
                            Runnable runnableN = ((kgc0) this.c).N();
                            if (runnableN == null) {
                                return;
                            }
                            this.b = runnableN;
                            i3++;
                            if (i3 >= 16) {
                                kgc0 kgc0Var = (kgc0) this.c;
                                if (hr80.y(kgc0Var.d, kgc0Var)) {
                                    kgc0 kgc0Var2 = (kgc0) this.c;
                                    hr80.x(kgc0Var2.d, kgc0Var2, this);
                                    return;
                                }
                            }
                        } catch (Throwable th5) {
                            kgc0 kgc0Var3 = (kgc0) this.c;
                            synchronized (kgc0Var3.g) {
                                kgc0.h.decrementAndGet(kgc0Var3);
                                throw th5;
                            }
                        }
                        break;
                    }
                    break;
                case 25:
                    synchronized (((knd0) this.c).c) {
                        try {
                            Object objApply = ((knd0) this.c).d.apply(this.b);
                            knd0 knd0Var = (knd0) this.c;
                            Object obj5 = knd0Var.a;
                            if (obj5 == null && objApply != null) {
                                knd0Var.a = objApply;
                                knd0Var.e.j(objApply);
                            } else if (obj5 != null && !obj5.equals(objApply)) {
                                knd0 knd0Var2 = (knd0) this.c;
                                knd0Var2.a = objApply;
                                knd0Var2.e.j(objApply);
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                        break;
                    }
                    return;
                case 26:
                    ivg0 ivg0Var = (ivg0) this.b;
                    mwg0 mwg0Var = ivg0Var.n;
                    if (mwg0Var != null) {
                        mwg0Var.a1(new dvg0(ivg0Var, (tv80) this.c, (byte) 0));
                        return;
                    } else {
                        u890.C("viewBinder");
                        throw null;
                    }
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    jih0 jih0Var = (jih0) ((ur00) this.c).e;
                    Iterator it2 = ((t36) jih0Var.d.keySet()).iterator();
                    while (true) {
                        t980 t980Var = (t980) it2;
                        if (!t980Var.hasNext()) {
                            return;
                        }
                        zhh0 zhh0Var = (zhh0) jih0Var.d.get((IBinder) t980Var.next());
                        String str6 = (String) this.b;
                        List<nmr0> list3 = (List) zhh0Var.e.get(str6);
                        if (list3 != null) {
                            for (nmr0 nmr0Var : list3) {
                                Bundle bundle = (Bundle) nmr0Var.b;
                                int i9 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                                int i10 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                                if (i9 == -1 || i10 == -1) {
                                    i = 0;
                                    i2 = Integer.MAX_VALUE;
                                } else {
                                    i = i9 * i10;
                                    i2 = (i10 + i) - 1;
                                }
                                if (Integer.MAX_VALUE >= i && i2 >= 0) {
                                    jih0Var.b(str6, zhh0Var, (Bundle) nmr0Var.b);
                                }
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    IBinder binder = ((Messenger) ((d4e0) this.b).b).getBinder();
                    zhh0 zhh0Var2 = (zhh0) ((jih0) ((hod0) this.c).b).d.remove(binder);
                    if (zhh0Var2 != null) {
                        binder.unlinkToDeath(zhh0Var2, 0);
                        return;
                    }
                    return;
                default:
                    PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) this.c;
                    kyh0 kyh0Var = (kyh0) this.b;
                    eyh0 eyh0Var = kyh0Var.i;
                    if (eyh0Var == null) {
                        u890.C("mediaSessionCompat");
                        throw null;
                    }
                    eyh0Var.C(playbackStateCompat);
                    eyh0 eyh0Var2 = kyh0Var.i;
                    if (eyh0Var2 == null) {
                        u890.C("mediaSessionCompat");
                        throw null;
                    }
                    eyh0Var2.D(z6x.a);
                    eyh0 eyh0Var3 = kyh0Var.i;
                    if (eyh0Var3 == null) {
                        u890.C("mediaSessionCompat");
                        throw null;
                    }
                    eyh0Var3.B(new MediaMetadataCompat(new Bundle()));
                    kyh0Var.h.onNext(kyh0.n(playbackStateCompat));
                    return;
            }
        } finally {
            ((dce) this.c).g = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                fqn1 fqn1Var = new fqn1(xwn1.class.getSimpleName());
                fqn1 fqn1Var2 = (fqn1) this.c;
                zxl1 zxl1Var = new zxl1((byte) 16);
                ((zxl1) fqn1Var.d).c = zxl1Var;
                fqn1Var.d = zxl1Var;
                zxl1Var.b = fqn1Var2;
                return fqn1Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xwn1(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
