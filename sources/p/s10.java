package p;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.animation.AnimationUtils;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import app.p000rive.runtime.kotlin.R;
import com.spotify.authentication.login5setupimpl.NativeLogin5SetupImpl;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.coremediarenderer.videosinkimpl.NativeVideoSinkImpl;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x03c5  */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        ArrayList arrayList;
        int actionMasked;
        int i;
        a layoutManager;
        a layoutManager2;
        x8c0 x8c0Var;
        w8c0 w8c0VarB;
        rl7 rl7Var = null;
        switch (this.a) {
            case 0:
                t10 t10Var = (t10) this.b;
                t10Var.c = false;
                ViewGroup viewGroup = t10Var.a;
                Object tag = viewGroup.getTag(R.id.tag_accessibility_actions);
                ArrayList arrayList2 = tag instanceof ArrayList ? (ArrayList) tag : null;
                if (arrayList2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        fg fgVar = obj instanceof fg ? (fg) obj : null;
                        if (fgVar != null) {
                            arrayList.add(fgVar);
                        }
                    }
                } else {
                    arrayList = z6x.a;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b8k1.l(viewGroup, ((fg) it.next()).a());
                    b8k1.h(viewGroup, 0);
                }
                if (!viewGroup.isEnabled()) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (!(i2 < viewGroup.getChildCount())) {
                        List<xe> list = t10Var.b;
                        if (list != null) {
                            for (xe xeVar : list) {
                                b8k1.a(viewGroup, xeVar.a, xeVar.b);
                            }
                            return;
                        }
                        return;
                    }
                    int i3 = i2 + 1;
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt == null) {
                        tw20.p();
                        return;
                    } else {
                        t10Var.a(childAt);
                        i2 = i3;
                    }
                }
                break;
            case 1:
                ((AdsOverlayControlsLayout) this.b).a(true);
                return;
            case 2:
                ((gga1) this.b).invoke();
                return;
            case 3:
                h54 h54Var = (h54) this.b;
                h54Var.d.await();
                t57 t57Var = (t57) h54Var.b.get();
                File[] fileArrListFiles = ((File) t57Var.a.get()).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!t57Var.b.containsKey(file.getName())) {
                            file.delete();
                        }
                    }
                    return;
                }
                return;
            case 4:
                ha4 ha4Var = (ha4) this.b;
                ha4Var.removeCallbacks(this);
                MotionEvent motionEvent = ha4Var.N1;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked == 7) {
                    i = 7;
                } else if (actionMasked == 8) {
                    i = 9;
                } else if (actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                ha4Var.K(motionEvent, i, ha4Var.O1, false);
                return;
            case 5:
                lb5 lb5Var = (lb5) this.b;
                if (lb5Var.getCollapsed()) {
                    lb5Var.b.invoke();
                    return;
                }
                return;
            case 6:
                ec5 ec5Var = (ec5) this.b;
                EGLDisplay eGLDisplay = ec5Var.b;
                if (eGLDisplay != null) {
                    zb5 zb5Var = ec5Var.a;
                    int i4 = zb5Var.c;
                    if (i4 != 0) {
                        GLES20.glDeleteBuffers(1, new int[]{i4}, 0);
                        zb5Var.c = 0;
                    }
                    int i5 = zb5Var.a;
                    if (i5 != 0) {
                        GLES20.glDeleteProgram(i5);
                        zb5Var.a = 0;
                    }
                    int i6 = zb5Var.b;
                    if (i6 != 0) {
                        GLES20.glDeleteProgram(i6);
                        zb5Var.b = 0;
                    }
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGLSurface eGLSurface2 = ec5Var.d;
                    if (eGLSurface2 != null) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
                    }
                    EGLContext eGLContext = ec5Var.c;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    }
                    EGL14.eglTerminate(eGLDisplay);
                }
                ec5Var.b = null;
                ec5Var.c = null;
                ec5Var.d = null;
                HandlerThread handlerThread = ec5Var.e;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    return;
                }
                return;
            case 7:
                ((AtomicLong) ((m1d) this.b).c).compareAndSet(-1L, SystemClock.uptimeMillis());
                return;
            case 8:
                ((vo5) this.b).e = false;
                return;
            case 9:
                h47 imageLoaderColorCallback = ((ArtworkView) this.b).getImageLoaderColorCallback();
                if (imageLoaderColorCallback != null) {
                    imageLoaderColorCallback.b.invoke(new b07((Integer) null));
                    return;
                }
                return;
            case 10:
                he7 he7Var = (he7) this.b;
                Parcelable parcelable = (Parcelable) he7Var.X;
                if (parcelable != null && (layoutManager = ((RecyclerView) he7Var.i).getLayoutManager()) != null) {
                    layoutManager.w0(parcelable);
                }
                he7Var.X = null;
                return;
            case 11:
                mg7 mg7Var = (mg7) this.b;
                Parcelable parcelable2 = mg7Var.S0;
                if (parcelable2 != null && (layoutManager2 = mg7Var.i.getLayoutManager()) != null) {
                    layoutManager2.w0(parcelable2);
                }
                mg7Var.S0 = null;
                return;
            case 12:
                Object obj2 = ((mmr0) this.b).b;
                bma1 bma1Var = kt8.e;
                int iL = ((dma1) obj2).l(bma1Var, 0) + 1;
                hma1 hma1VarEdit = ((dma1) obj2).edit();
                hma1VarEdit.b(bma1Var, iL);
                hma1VarEdit.h();
                return;
            case 13:
                q5d0 q5d0Var = (q5d0) this.b;
                m9v m9vVar = q5d0Var.c;
                ex8 ex8Var = q5d0Var.a;
                if (q5d0Var.N0) {
                    if (q5d0Var.Y) {
                        q5d0Var.Y = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        ex8Var.e = jCurrentAnimationTimeMillis;
                        ex8Var.g = -1L;
                        ex8Var.f = jCurrentAnimationTimeMillis;
                        ex8Var.h = 0.5f;
                    }
                    if ((ex8Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > ex8Var.g + ((long) ex8Var.i)) || !q5d0Var.e()) {
                        q5d0Var.N0 = false;
                        return;
                    }
                    if (q5d0Var.Z) {
                        q5d0Var.Z = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        m9vVar.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (ex8Var.f == 0) {
                        jah.g("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = ex8Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - ex8Var.f;
                    ex8Var.f = jCurrentAnimationTimeMillis2;
                    q5d0Var.P0.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * ex8Var.d));
                    WeakHashMap weakHashMap = b8k1.a;
                    m9vVar.postOnAnimation(this);
                    return;
                }
                return;
            case 14:
                ((jj11) this.b).h();
                return;
            case 15:
                ((fda) this.b).a.c(3);
                return;
            case 16:
                View view = (z6b) this.b;
                rl7 parent = view.getParent();
                rl7Var = parent instanceof ViewManager ? (ViewManager) parent : null;
                if (rl7Var != null) {
                    rl7Var.removeView(view);
                    return;
                }
                return;
            case 17:
                gjb gjbVar = (gjb) this.b;
                if (gjbVar.h) {
                    return;
                }
                gjbVar.h = true;
                gjbVar.b();
                return;
            case 18:
                ((i6b) this.b).b = UnicastSubject.f(1, this).c();
                return;
            case 19:
                gbe gbeVar = (gbe) this.b;
                jen0 jen0Var = (jen0) gbeVar.f;
                int i7 = gbeVar.b;
                if (i7 == 0) {
                    return;
                }
                gbeVar.b = 0;
                if (gbeVar.a != 2) {
                    return;
                }
                int iC = l1d.C(i7);
                if (iC == 0) {
                    gbeVar.f(gbeVar.a(jen0Var.c()));
                    return;
                }
                if (iC != 1) {
                    eg.o();
                    return;
                }
                rl7 rl7Var2 = (rl7) gbeVar.d;
                if (rl7Var2 != null && gbeVar.c(rl7Var2)) {
                    rl7Var = rl7Var2;
                }
                gbeVar.f(gbeVar.e(rl7Var, jen0Var));
                return;
            case 20:
                ((CircularVideoPreviewView) this.b).a.setVisibility(8);
                return;
            case 21:
                qdg qdgVar = (qdg) this.b;
                ((lzn0) qdgVar.b).h(((cdg) qdgVar.c).a);
                return;
            case 22:
                qsg qsgVar = (qsg) this.b;
                qsgVar.a.release();
                EGLDisplay eGLDisplay2 = qsgVar.b;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eGLDisplay2, qsgVar.d);
                EGL14.eglDestroyContext(eGLDisplay2, qsgVar.c);
                EGL14.eglTerminate(eGLDisplay2);
                qsgVar.e.quitSafely();
                return;
            case 23:
                wtg wtgVar = (wtg) this.b;
                LinkedHashMap linkedHashMap = wtgVar.f;
                if (wtgVar.Z) {
                    wtgVar.Z = false;
                    wtgVar.c.a();
                    NativeVideoSinkImpl.nativeSetVsyncTiming(0L, 0L);
                }
                lag lagVar = wtgVar.e;
                ((LinkedHashMap) lagVar.e).clear();
                lag lagVar2 = (lag) lagVar.d;
                lagVar2.d = null;
                ViewGroup viewGroup2 = (ViewGroup) lagVar2.b;
                etg etgVar = (etg) lagVar2.c;
                if (viewGroup2 != null) {
                    viewGroup2.removeOnLayoutChangeListener((eg7) lagVar2.e);
                    if (etgVar != null) {
                        viewGroup2.getOverlay().remove(etgVar);
                    }
                }
                lagVar2.b = null;
                lagVar2.c = null;
                jtg jtgVar = (jtg) lagVar.b;
                gtg gtgVar = (gtg) jtgVar.d.a.getValue();
                jtgVar.b.clear();
                jtgVar.c = 0L;
                jtgVar.a.m((Object) null, new gtg());
                gtg gtgVar2 = (gtg) jtgVar.d.a.getValue();
                if (!u890.j(gtgVar2, gtgVar)) {
                    ((ftg) lagVar.c).a(gtgVar2);
                }
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((ttg) it2.next()).a(null);
                }
                linkedHashMap.clear();
                wtgVar.g = null;
                wtgVar.h = null;
                wtgVar.i = 0;
                wtgVar.t = 0;
                qsg qsgVar2 = wtgVar.X;
                if (qsgVar2 != null) {
                    qsgVar2.release();
                }
                wtgVar.X = null;
                return;
            case 24:
                ((cug) this.b).f(false);
                return;
            case 25:
                f8l f8lVar = (f8l) this.b;
                tac0 tac0Var = f8lVar.d;
                if (!f8lVar.a || (x8c0Var = f8lVar.b) == null || (w8c0VarB = x8c0Var.b()) == null) {
                    return;
                }
                if (w8c0VarB.compareTo(tac0Var.i) < 0) {
                    tac0Var.i(w8c0VarB);
                }
                if (w8c0VarB == w8c0.a && f8lVar.a) {
                    f8lVar.c.removeCallbacksAndMessages(null);
                    x8c0 x8c0Var2 = f8lVar.b;
                    if (x8c0Var2 != null) {
                        x8c0Var2.d(f8lVar.e);
                    }
                    f8lVar.b = null;
                    f8lVar.a = false;
                    return;
                }
                return;
            case 26:
                mcl mclVar = (mcl) this.b;
                mclVar.a().prepareForShutdown();
                NativeLogin5SetupImpl nativeLogin5SetupImpl = mclVar.O0;
                if (nativeLogin5SetupImpl == null) {
                    u890.C("nativeLogin5Setup");
                    throw null;
                }
                nativeLogin5SetupImpl.destroy();
                mclVar.a().destroy();
                NativeConnectivityPolicyProvider nativeConnectivityPolicyProvider = mclVar.Z;
                if (nativeConnectivityPolicyProvider == null) {
                    u890.C("nativeConnectivityPolicyProvider");
                    throw null;
                }
                nativeConnectivityPolicyProvider.destroy();
                NativeConnectionTypeProvider nativeConnectionTypeProvider = mclVar.Y;
                if (nativeConnectionTypeProvider == null) {
                    u890.C("nativeConnectionTypeProvider");
                    throw null;
                }
                nativeConnectionTypeProvider.destroy();
                NativeCredentialsStorage nativeCredentialsStorage = mclVar.X;
                if (nativeCredentialsStorage == null) {
                    u890.C("nativeCredentialsStorage");
                    throw null;
                }
                nativeCredentialsStorage.destroy();
                NativeConnectivityManager nativeConnectivityManager = mclVar.t;
                if (nativeConnectivityManager != null) {
                    nativeConnectivityManager.destroy();
                    return;
                } else {
                    u890.C("nativeConnectivityManager");
                    throw null;
                }
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                NativeAuthenticatedScope nativeAuthenticatedScope = ((ncl) this.b).t;
                if (nativeAuthenticatedScope != null) {
                    nativeAuthenticatedScope.destroy();
                    return;
                } else {
                    u890.C("authenticatedScope");
                    throw null;
                }
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((gmj) this.b).invoke();
                return;
            default:
                ((d5n) this.b).d();
                return;
        }
    }
}
