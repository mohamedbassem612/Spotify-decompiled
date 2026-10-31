package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.utils.f;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import androidx.work.impl.WorkDatabase;
import com.spotify.interapp.service.IapException;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class m2d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2d(rts rtsVar, liv livVar, mzc mzcVar) {
        this.a = (byte) 4;
        Map map = Collections.EMPTY_MAP;
        this.b = rtsVar;
        this.c = livVar;
        this.d = map;
        this.e = mzcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Throwable th;
        String[] strArrF;
        bufferedWriter = null;
        bufferedWriter = null;
        BufferedWriter bufferedWriter = null;
        byte b = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((b1d) this.b).b).onCaptureCompleted((CameraCaptureSession) this.c, (CaptureRequest) this.d, (TotalCaptureResult) this.e);
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((b1d) this.b).b).onCaptureProgressed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureResult) this.e);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((b1d) this.b).b).onCaptureFailed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureFailure) this.e);
                return;
            case 3:
                gns gnsVar = (gns) this.b;
                s29 s29Var = (s29) this.c;
                String str = s29Var.a;
                log1 log1Var = (log1) this.d;
                s09 s09Var = (s09) this.e;
                gnsVar.getClass();
                Logger logger = gns.f;
                try {
                    r9e r9eVarA = gnsVar.c.a(str);
                    if (r9eVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        log1Var.a(new IllegalArgumentException(str2));
                    } else {
                        gnsVar.e.g(new k65(gnsVar, s29Var, r9eVarA.a(s09Var), (byte) 4));
                        log1Var.a((Exception) null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    log1Var.a(e);
                    return;
                }
            case 4:
                rts rtsVar = (rts) this.b;
                liv livVar = (liv) this.c;
                Map map = Collections.EMPTY_MAP;
                mzc mzcVar = (mzc) this.e;
                try {
                    rtsVar.a.j(livVar);
                    mzcVar.b((Object) null);
                    return;
                } catch (RuntimeException e2) {
                    mzcVar.c(e2);
                    return;
                }
            case 5:
                hev hevVar = (hev) this.b;
                liv livVar2 = (liv) this.c;
                Map map2 = Collections.EMPTY_MAP;
                mzc mzcVar2 = (mzc) this.e;
                try {
                    hevVar.a.j(livVar2);
                    mzcVar2.b((Object) null);
                    return;
                } catch (RuntimeException e3) {
                    mzcVar2.c(e3);
                    return;
                }
            case 6:
                u580 u580Var = (u580) this.b;
                Runnable runnable = (Runnable) this.c;
                b680 b680Var = (b680) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                if (dhn.a.contains(u580.class)) {
                    return;
                }
                try {
                    Class cls = u580Var.e;
                    c680.B(u580Var.b, u580Var.g(), u580Var.i, new Object[]{u580Var.k.m(b680Var, arrayList), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new t580(u580Var, runnable, (byte) 0))});
                    return;
                } catch (Throwable th2) {
                    dhn.a(u580.class, th2);
                    return;
                }
            case 7:
                v580 v580Var = (v580) this.b;
                Runnable runnable2 = (Runnable) this.c;
                b680 b680Var2 = (b680) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (dhn.a.contains(v580.class)) {
                    return;
                }
                try {
                    Class cls2 = v580Var.n;
                    Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new t580(v580Var, new Object[]{runnable2}, (byte) 1));
                    Object objF = v580Var.f(b680Var2, arrayList2);
                    if (objF != null) {
                        c680.B(v580Var.b, v580Var.d(), v580Var.v, new Object[]{objF, objNewProxyInstance});
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    dhn.a(v580.class, th3);
                    return;
                }
            case 8:
                i090 i090Var = (i090) this.b;
                Uri uri = (Uri) this.c;
                h090 h090Var = (h090) this.d;
                pyp0 pyp0Var = (pyp0) this.e;
                i090Var.getClass();
                try {
                    h090Var.d.j(h090Var);
                    return;
                } catch (Exception e4) {
                    com.spotify.base.java.logging.Logger.e(e4, "Exception while trying to load image with uri = \"%s\".", new Object[]{uri});
                    synchronized (i090Var.c) {
                        i090Var.c.remove(h090Var);
                        SingleEmitter singleEmitter = (SingleEmitter) pyp0Var.d;
                        if (singleEmitter.isDisposed()) {
                            return;
                        }
                        singleEmitter.onError(new IapException(new es5("Failed to load image."), "wamp.error"));
                        return;
                    }
                }
            case 9:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                b380 b380Var = (b380) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                em61 em61Var = (em61) this.e;
                if (atomicInteger.incrementAndGet() == b380Var.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (b < arrayList3.size()) {
                        n8d0 n8d0Var = (n8d0) arrayList3.get(b);
                        if (n8d0Var != null) {
                            try {
                                bitmap = (Bitmap) fc11.C(n8d0Var);
                            } catch (CancellationException | ExecutionException e5) {
                                oon1.t("Failed to get bitmap", e5);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList4.add(yzb0.a((yoh0) b380Var.get(b), bitmap));
                        b++;
                    }
                    em61Var.u(arrayList4);
                    return;
                }
                return;
            case 10:
                tph0 tph0Var = (tph0) this.b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo = (MediaSessionManager.RemoteUserInfo) this.c;
                Bundle bundle = (Bundle) this.d;
                String str3 = (String) this.e;
                iqh0 iqh0Var = tph0Var.d;
                v1k v1kVar = tph0Var.c;
                ixh0 ixh0VarO = v1kVar.o(remoteUserInfo);
                if (ixh0VarO != null && v1kVar.w(ixh0VarO, 50001)) {
                    iqh0Var.K(ixh0VarO, str3, yzb0.d(iqh0Var.f, bundle));
                    String str4 = zoi1.a;
                    return;
                }
                return;
            case 11:
                iqh0 iqh0Var2 = (iqh0) this.b;
                f280 f280Var = (f280) this.c;
                ixh0 ixh0Var = (ixh0) this.d;
                String str5 = (String) this.e;
                s7c0 s7c0Var = (s7c0) iqh0.O(f280Var);
                if (s7c0Var == null || s7c0Var.a != 0) {
                    iqh0Var2.N(ixh0Var, str5);
                    return;
                }
                return;
            case 12:
                iqh0 iqh0Var3 = (iqh0) this.b;
                ixh0 ixh0VarJ = (ixh0) this.c;
                String str6 = (String) this.d;
                iph0 iph0Var = (iph0) this.e;
                if (iqh0Var3.B && iqh0Var3.o(ixh0VarJ) && (ixh0VarJ = iqh0Var3.j()) == null) {
                    return;
                }
                iqh0Var3.c(ixh0VarJ, new eqh0(str6, iph0Var, b));
                return;
            case 13:
                yqh0 yqh0Var = (yqh0) this.b;
                yqh0Var.d.execute(new vqh0(yqh0Var, (tkh0) this.e, (String) this.c, (Bundle) this.d));
                return;
            case 14:
                yqh0 yqh0Var2 = (yqh0) this.b;
                xkh0 xkh0Var = (xkh0) this.c;
                xqh0 xqh0Var = (xqh0) this.d;
                kph0 kph0Var = (kph0) this.e;
                try {
                    tkh0 tkh0Var = (tkh0) xkh0Var.get(0L, TimeUnit.MILLISECONDS);
                    if (yqh0Var2.h(kph0Var)) {
                        xqh0Var.a.o(false);
                    }
                    tkh0Var.J(xqh0Var);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    yqh0Var2.a.q(kph0Var);
                    return;
                }
            case 15:
                fzh0 fzh0Var = (fzh0) this.b;
                ixh0 ixh0Var2 = (ixh0) this.c;
                qa61 qa61Var = (qa61) this.d;
                m8u0 m8u0Var = (m8u0) this.e;
                e0i0 e0i0Var = fzh0Var.h;
                v1k v1kVar2 = fzh0Var.g.m;
                if (!v1kVar2.u(ixh0Var2)) {
                    if (ixh0Var2.b == 0) {
                        e0i0Var.a.H(ixh0Var2, qa61Var, m8u0Var);
                        return;
                    }
                    return;
                }
                if (fzh0Var.o(ixh0Var2)) {
                    e0i0Var.k(qa61Var, m8u0Var);
                    ixh0 ixh0VarJ2 = fzh0Var.j();
                    if (ixh0VarJ2 != null) {
                        (ixh0VarJ2.b == 0 ? e0i0Var.a : v1kVar2).H(ixh0VarJ2, qa61Var, m8u0Var);
                    }
                }
                v1kVar2.H(ixh0Var2, qa61Var, m8u0Var);
                v1kVar2.J();
                q8l q8lVar = (q8l) ((y36) v1kVar2.c).get(ixh0Var2);
                m8u0 m8u0Var2 = q8lVar != null ? q8lVar.e : null;
                if (m8u0Var2 != null) {
                    fzh0Var.c(ixh0Var2, new tlh0(qa61Var, m8u0Var2));
                    fzh0Var.c.a(false, false);
                    return;
                }
                return;
            case 16:
                fzh0 fzh0Var2 = (fzh0) this.b;
                it21 it21Var = (it21) this.c;
                try {
                    it21Var.n(fzh0Var2.b((ixh0) this.d, (c8d0) this.e));
                    return;
                } catch (RuntimeException e6) {
                    it21Var.m(e6);
                    return;
                }
            case 17:
                c0i0 c0i0Var = (c0i0) this.b;
                AtomicInteger atomicInteger2 = (AtomicInteger) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                if (atomicInteger2.incrementAndGet() == arrayList5.size()) {
                    ArrayList arrayList7 = new ArrayList();
                    while (i < arrayList6.size()) {
                        n8d0 n8d0Var2 = (n8d0) arrayList6.get(i);
                        if (n8d0Var2 != null) {
                            try {
                                bitmap2 = (Bitmap) fc11.C(n8d0Var2);
                            } catch (CancellationException | ExecutionException e7) {
                                oon1.t("Failed to get bitmap", e7);
                                bitmap2 = null;
                            }
                        } else {
                            bitmap2 = null;
                        }
                        arrayList7.add(new MediaSessionCompat.QueueItem(yzb0.e((yoh0) arrayList5.get(i), bitmap2), i == -1 ? -1L : i));
                        i++;
                        break;
                    }
                    c0i0Var.e.j.setQueue(arrayList7);
                    return;
                }
                return;
            case 18:
                fzh0 fzh0Var3 = (fzh0) this.b;
                em61 em61Var2 = (em61) this.c;
                akl aklVar = (akl) this.d;
                n8d0 n8d0Var3 = (n8d0) this.e;
                if (fzh0Var3.p()) {
                    em61Var2.u((Object) null);
                    return;
                }
                try {
                    aklVar.accept(n8d0Var3);
                    em61Var2.u((Object) null);
                    return;
                } catch (Throwable th4) {
                    em61Var2.v(th4);
                    return;
                }
            case 19:
                fzh0 fzh0Var4 = (fzh0) this.b;
                c2i0 c2i0Var = (c2i0) this.c;
                ixh0 ixh0Var3 = (ixh0) this.d;
                List list = (List) this.e;
                if (fzh0Var4.p()) {
                    return;
                }
                fzh0Var4.C();
                c2i0Var.a(fzh0Var4.t, ixh0Var3, list);
                return;
            case 20:
                h2i0 h2i0Var = (h2i0) this.b;
                fzh0 fzh0Var5 = (fzh0) this.c;
                ixh0 ixh0Var4 = (ixh0) this.d;
                eh70 eh70Var = (eh70) this.e;
                if (fzh0Var5.p()) {
                    h2i0Var.n.remove(ixh0Var4);
                    iqo1.r(eh70Var);
                    return;
                } else {
                    f280 f280VarS = fzh0Var5.s(ixh0Var4);
                    f280VarS.b(new nx30((Object) f280VarS, (Object) new w6e0(h2i0Var, ixh0Var4, fzh0Var5, eh70Var), (byte) 24), new wkh0(h2i0Var, (byte) 6));
                    return;
                }
            case 21:
                String str7 = (String) this.b;
                Function0 function0 = (Function0) this.c;
                kdn0 kdn0Var = (kdn0) this.d;
                mzc mzcVar3 = (mzc) this.e;
                boolean zG = mif1.g();
                if (zG) {
                    try {
                        vhc.b(str7);
                    } catch (Throwable th5) {
                        if (!zG) {
                            throw th5;
                        }
                        Trace.endSection();
                        throw th5;
                    }
                }
                try {
                    function0.invoke();
                    blq0 blq0Var = w4b1.c;
                    kdn0Var.j(blq0Var);
                    mzcVar3.b(blq0Var);
                    break;
                } catch (Throwable th6) {
                    kdn0Var.j(new zkq0(th6));
                    mzcVar3.c(th6);
                    break;
                }
                if (zG) {
                    Trace.endSection();
                    return;
                }
                return;
            case 22:
                x8c0 x8c0Var = (x8c0) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str8 = (String) this.d;
                z321 z321Var = (z321) this.e;
                if (x8c0Var != null && x8c0Var.b().a(w8c0.c)) {
                    f.b(iOnDoneCallback, str8, z321Var);
                    return;
                }
                f.e(iOnDoneCallback, new IllegalStateException("Lifecycle is not at least created when dispatching " + z321Var), str8);
                return;
            case 23:
                zgz0 zgz0Var = (zgz0) this.b;
                Context context = (Context) this.c;
                ObservableEmitter observableEmitter = (ObservableEmitter) this.d;
                v7y v7yVar = (v7y) this.e;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onComplete();
                }
                context.getApplicationContext().unbindService(v7yVar);
                zgz0Var.b = j5.a;
                return;
            case 24:
                List list2 = (List) this.b;
                uvl1 uvl1Var = (uvl1) this.c;
                btk btkVar = (btk) this.d;
                WorkDatabase workDatabase = (WorkDatabase) this.e;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((im41) it.next()).b(uvl1Var.a);
                }
                om41.b(btkVar, workDatabase, list2);
                return;
            case 25:
                hfe1 hfe1Var = (hfe1) this.b;
                Surface surface = (Surface) this.c;
                pzc pzcVar = (pzc) this.d;
                j4d1 j4d1Var = (j4d1) this.e;
                j2h1.o("TextureViewImpl");
                k65 k65Var = hfe1Var.l;
                if (k65Var != null) {
                    k65Var.a();
                    hfe1Var.l = null;
                }
                surface.release();
                if (hfe1Var.g == pzcVar) {
                    hfe1Var.g = null;
                }
                if (hfe1Var.h == j4d1Var) {
                    hfe1Var.h = null;
                    return;
                }
                return;
            case 26:
                oxg1 oxg1Var = (oxg1) this.b;
                pwg1 pwg1Var = (pwg1) this.c;
                syy0 syy0Var = (syy0) this.d;
                gv40 gv40Var = (gv40) this.e;
                wzn wznVar = (wzn) oxg1Var.f;
                if (wznVar == null) {
                    eg.m("mSession is null in launchWhenSessionEstablished");
                    return;
                }
                if (syy0Var == null) {
                    oxg1Var.b(pwg1Var, gv40Var);
                    return;
                }
                vqh0 vqh0Var = new vqh0((Object) oxg1Var, (Object) pwg1Var, (Object) gv40Var, (byte) 16);
                if (!syy0Var.i || syy0Var.f == null) {
                    vqh0Var.run();
                    return;
                }
                if (TextUtils.isEmpty(syy0Var.d)) {
                    vqh0Var.run();
                    return;
                }
                mxa1 mxa1Var = new mxa1(syy0Var.a, syy0Var.f, syy0Var.d, wznVar, syy0Var.h);
                syy0Var.g = mxa1Var;
                mxa1Var.g = new k65(syy0Var, pwg1Var, vqh0Var, (byte) 18);
                ((lxa1) mxa1Var.h).execute(new Void[0]);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                oxg1 oxg1Var2 = (oxg1) this.b;
                ((t8e1) this.c).f((NoAnimLauncherActivity) oxg1Var2.c, (pwg1) this.d, (String) oxg1Var2.d, (gv40) this.e);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                mxa1 mxa1Var2 = (mxa1) this.b;
                String str9 = (String) this.c;
                Map map3 = (Map) this.d;
                List list3 = (List) this.e;
                dij0 dij0Var = (dij0) mxa1Var2.b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mxa1Var2.h;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    dij0Var.i(str9, (String) atomicMarkableReference.getReference());
                }
                if (!map3.isEmpty()) {
                    dij0Var.h(str9, map3, false);
                }
                if (list3.isEmpty()) {
                    return;
                }
                File fileK = dij0Var.a.K(str9, "rollouts-state");
                try {
                    if (list3.isEmpty()) {
                        dij0.g(fileK, "Rollout state is empty for session: " + str9);
                        return;
                    }
                    try {
                        String strE = dij0.e(list3);
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileK), dij0.b));
                        try {
                            bufferedWriter2.write(strE);
                            bufferedWriter2.flush();
                            eth.k(bufferedWriter2);
                        } catch (Exception unused2) {
                            bufferedWriter = bufferedWriter2;
                            dij0.f(fileK);
                            eth.k(bufferedWriter);
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedWriter = bufferedWriter2;
                        }
                    } catch (Exception unused3) {
                    }
                    return;
                } catch (Throwable th8) {
                    th = th8;
                }
                eth.k(bufferedWriter);
                throw th;
            default:
                JSONObject jSONObject = (JSONObject) this.b;
                String str10 = (String) this.c;
                yck1 yck1Var = (yck1) this.d;
                String str11 = (String) this.e;
                if (dhn.a.contains(yck1.class)) {
                    return;
                }
                try {
                    String lowerCase = fpi1.m(wf10.a()).toLowerCase();
                    float[] fArrC = mm10.c(lowerCase, jSONObject);
                    String strE2 = mm10.e(str10, yck1Var.d, lowerCase);
                    if (fArrC != null && (strArrF = dim0.f(2, new float[][]{fArrC}, new String[]{strE2})) != null) {
                        String str12 = strArrF[0];
                        fnv0.a(str11, str12);
                        if (u890.j(str12, "other")) {
                            return;
                        }
                        HashSet hashSet = yck1.e;
                        s9p1.J(str12, str10, fArrC);
                        return;
                    }
                    return;
                } catch (Exception unused4) {
                    return;
                } catch (Throwable th9) {
                    dhn.a(yck1.class, th9);
                    return;
                }
        }
    }

    public /* synthetic */ m2d(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ m2d(byte b, Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = b;
        this.b = serializable;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ m2d(hev hevVar, liv livVar, mzc mzcVar) {
        this.a = (byte) 5;
        Map map = Collections.EMPTY_MAP;
        this.b = hevVar;
        this.c = livVar;
        this.d = map;
        this.e = mzcVar;
    }

    public /* synthetic */ m2d(yqh0 yqh0Var, kph0 kph0Var, String str, Bundle bundle, tkh0 tkh0Var) {
        this.a = (byte) 13;
        this.b = yqh0Var;
        this.c = str;
        this.d = bundle;
        this.e = tkh0Var;
    }
}
