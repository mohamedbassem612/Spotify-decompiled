package p;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.coreimpl.NativeApplicationScopeImpl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a6n implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6n(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewD;
        int width;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                b6n b6nVar = (b6n) obj;
                NativeApplicationScopeImpl nativeApplicationScopeImpl = b6nVar.g;
                if (nativeApplicationScopeImpl == null) {
                    u890.C("nativeCoreApplicationScopeImpl");
                    throw null;
                }
                nativeApplicationScopeImpl.prepareForShutdown();
                NativeApplicationScopeImpl nativeApplicationScopeImpl2 = b6nVar.g;
                if (nativeApplicationScopeImpl2 != null) {
                    nativeApplicationScopeImpl2.destroy();
                    return;
                } else {
                    u890.C("nativeCoreApplicationScopeImpl");
                    throw null;
                }
            case 1:
                rzq rzqVar = (rzq) obj;
                rzqVar.u.set(false);
                rzqVar.p();
                return;
            case 2:
                l6p1.n(l6p1.m("", (JSONObject) obj));
                return;
            case 3:
                ((ujr) obj).x1 = null;
                return;
            case 4:
                elr elrVar = (elr) obj;
                try {
                    b3e.b(elrVar.a, elrVar.b).l(elrVar.c, new n4b(elrVar, (byte) 28));
                    return;
                } catch (Exception e) {
                    Logger.d("CastBasic->%s", new Object[]{l1d.m("initializeCastContext() threw: ", e.getMessage())});
                    elrVar.e.y0(e);
                    return;
                }
            case 5:
                uw0 uw0Var = ((lxr) obj).g;
                ((TextView) uw0Var.h).setVisibility(8);
                ((View) uw0Var.i).setVisibility(8);
                return;
            case 6:
                ((ssm) obj).invoke();
                return;
            case 7:
                ((RecyclerView) ((phi0) ((mfs) obj).c).c).setVisibility(8);
                return;
            case 8:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(0);
                    return;
                }
                return;
            case 9:
                ryn1.z(((wyr) obj).a().c);
                return;
            case 10:
                ((mus) obj).e();
                return;
            case 11:
                ((k1t) obj).O0.invoke();
                return;
            case 12:
                t2u t2uVar = (t2u) obj;
                t2uVar.I1.onDismiss(t2uVar.Q1);
                return;
            case 13:
                Iterator it = ((CopyOnWriteArraySet) ((sun) obj).b).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            case 14:
                suu suuVar = (suu) obj;
                String strT = pro1.t("videoPodcastsDownloadAudioOnly");
                suuVar.d.h(strT);
                suuVar.e.a(new fx7(strT));
                return;
            case 15:
                ((rwu) obj).a.e();
                return;
            case 16:
                l8v l8vVar = (l8v) obj;
                m8v m8vVar = l8vVar.f;
                int i = l8vVar.d.o;
                byte b2 = l8vVar.c;
                boolean z = b2 == 3;
                if (z) {
                    viewD = m8vVar.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i;
                } else {
                    viewD = m8vVar.d(5);
                    width = m8vVar.getWidth() - i;
                }
                if (viewD != null) {
                    if (((!z || viewD.getLeft() >= width) && (z || viewD.getLeft() <= width)) || m8vVar.f(viewD) != 0) {
                        return;
                    }
                    j8v layoutParams = viewD.getLayoutParams();
                    l8vVar.d.r(viewD, width, viewD.getTop());
                    layoutParams.c = true;
                    m8vVar.invalidate();
                    View viewD2 = m8vVar.d(b2 == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        m8vVar.b(viewD2);
                    }
                    if (m8vVar.T0) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = m8vVar.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        m8vVar.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    m8vVar.T0 = true;
                    return;
                }
                return;
            case 17:
                m9v m9vVar = (m9v) obj;
                m9vVar.O0 = null;
                m9vVar.drawableStateChanged();
                return;
            case 18:
                s700 s700Var = (s700) obj;
                uny unyVar = s700Var.Y1;
                if (unyVar != null) {
                    unyVar.E(s700Var.Z1);
                    return;
                } else {
                    u890.C("viewBinder");
                    throw null;
                }
            case 19:
                ((cc00) obj).invoke();
                return;
            case 20:
                el00 el00Var = (el00) obj;
                el00Var.T0.setItemAnimator(el00Var.d1);
                return;
            case 21:
                kl10 kl10Var = (kl10) obj;
                ValueAnimator valueAnimator = kl10Var.Z0;
                byte b3 = kl10Var.a1;
                if (b3 == 1) {
                    valueAnimator.cancel();
                } else if (b3 != 2) {
                    return;
                }
                kl10Var.a1 = (byte) 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 22:
                ((f710) obj).invoke();
                return;
            case 23:
                zf30 zf30Var = (zf30) obj;
                if (zf30Var.m1 != null) {
                    zf30Var.e0();
                    return;
                }
                return;
            case 24:
                ((th30) obj).A(true);
                return;
            case 25:
                ((n8d0) obj).cancel(true);
                return;
            case 26:
                t740 t740Var = (t740) obj;
                ((f0i) t740Var.a).a.a(new i83(t740Var, (byte) 7));
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ds50.c((ohd) obj);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                lc20 lc20Var = (lc20) obj;
                is50 is50Var = (is50) lc20Var.d;
                if (is50Var.a.getAndSet(null) != null) {
                    ((Handler) lc20Var.b).removeCallbacks(is50Var);
                    return;
                }
                return;
            default:
                ((InAppBrowserLauncherActivity) obj).finish();
                return;
        }
    }
}
