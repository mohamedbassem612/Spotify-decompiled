package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Messenger;
import android.view.View;
import android.widget.EditText;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.connectivity.pubsubsetupv2impl.NativePubSubSetupV2Impl;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import com.spotify.premiumdestination.destination.elementimpl.PremiumPageListElementImpl;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class an90 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ an90(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02ab  */
    @Override // java.lang.Runnable
    public final void run() {
        int iH;
        boolean z = true;
        int iH2 = 0;
        switch (this.a) {
            case 0:
                fn90 fn90Var = (fn90) this.b;
                dn90 dn90Var = fn90Var.Y;
                if (fn90Var.c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = fn90Var.a1;
                    long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                    a layoutManager = fn90Var.Q0.getLayoutManager();
                    Rect rect = fn90Var.Z0;
                    if (rect == null) {
                        rect = new Rect();
                        fn90Var.Z0 = rect;
                    }
                    layoutManager.p(rect, fn90Var.c.a);
                    if (layoutManager.q()) {
                        int i = (int) (fn90Var.i + fn90Var.g);
                        iH = (i - fn90Var.Z0.left) - fn90Var.Q0.getPaddingLeft();
                        float f = fn90Var.g;
                        if ((f >= 0.0f || iH >= 0) && (f <= 0.0f || (iH = ((fn90Var.c.a.getWidth() + i) + fn90Var.Z0.right) - (fn90Var.Q0.getWidth() - fn90Var.Q0.getPaddingRight())) <= 0)) {
                            iH = 0;
                        }
                    } else {
                        iH = 0;
                    }
                    if (layoutManager.r()) {
                        int i2 = (int) (fn90Var.t + fn90Var.h);
                        int paddingTop = (i2 - fn90Var.Z0.top) - fn90Var.Q0.getPaddingTop();
                        float f2 = fn90Var.h;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((fn90Var.c.a.getHeight() + i2) + fn90Var.Z0.bottom) - (fn90Var.Q0.getHeight() - fn90Var.Q0.getPaddingBottom())) > 0)) {
                            iH2 = paddingTop;
                        }
                    }
                    if (iH != 0) {
                        RecyclerView recyclerView = fn90Var.Q0;
                        int width = fn90Var.c.a.getWidth();
                        fn90Var.Q0.getWidth();
                        iH = dn90Var.h(recyclerView, width, iH, j2);
                    }
                    int i3 = iH;
                    if (iH2 != 0) {
                        RecyclerView recyclerView2 = fn90Var.Q0;
                        int height = fn90Var.c.a.getHeight();
                        fn90Var.Q0.getHeight();
                        iH2 = dn90Var.h(recyclerView2, height, iH2, j2);
                    }
                    if (i3 == 0 && iH2 == 0) {
                        fn90Var.a1 = Long.MIN_VALUE;
                        return;
                    }
                    if (fn90Var.a1 == Long.MIN_VALUE) {
                        fn90Var.a1 = jCurrentTimeMillis;
                    }
                    fn90Var.Q0.scrollBy(i3, iH2);
                    w611 w611Var = fn90Var.c;
                    if (w611Var != null) {
                        fn90Var.q(w611Var);
                    }
                    fn90Var.Q0.removeCallbacks(fn90Var.R0);
                    RecyclerView recyclerView3 = fn90Var.Q0;
                    WeakHashMap weakHashMap = b8k1.a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                i9a0 i9a0Var = (i9a0) this.b;
                i9a0Var.m = i9a0Var.p;
                i9a0Var.p = null;
                i9a0Var.c(new z8a0(i9a0Var, new a9a0(i9a0Var, (byte) 1), (byte) 2), "fireOpenConnection");
                return;
            case 2:
                ((uy81) this.b).b();
                return;
            case 3:
                LibraryChipsScrollView libraryChipsScrollView = (LibraryChipsScrollView) this.b;
                libraryChipsScrollView.fullScroll(libraryChipsScrollView.a ? 66 : 17);
                return;
            case 4:
                suc0 suc0Var = (suc0) this.b;
                suc0Var.b = null;
                suc0Var.a = null;
                return;
            case 5:
                fnd0 fnd0Var = (fnd0) this.b;
                if (fnd0Var.d) {
                    fnd0Var.b.k(fnd0Var);
                    fnd0Var.d = false;
                }
                fnd0Var.f = null;
                return;
            case 6:
                mrd0 mrd0Var = (mrd0) this.b;
                mrd0Var.e();
                mrd0Var.h().b();
                return;
            case 7:
                ((e7p0) ((d2d0) this.b).d).c();
                return;
            case 8:
                ((g9e0) this.b).l();
                return;
            case 9:
                zhh0 zhh0Var = (zhh0) this.b;
                zhh0Var.g.d.remove(((Messenger) zhh0Var.d.b).getBinder());
                return;
            case 10:
                ArrayList arrayList = ((wph0) this.b).e;
                List listL1 = o7h.l1(arrayList);
                arrayList.clear();
                Iterator it = listL1.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                return;
            case 11:
                ((MotionLayout) this.b).N1.a();
                return;
            case 12:
                ((i1n0) this.b).a.h(k1n0.a);
                return;
            case 13:
                ((kmn0) this.b).a().destroy();
                return;
            case 14:
                NowPlayingScrollView nowPlayingScrollView = (NowPlayingScrollView) this.b;
                nowPlayingScrollView.C(0 - nowPlayingScrollView.getScrollX(), 0 - nowPlayingScrollView.getScrollY(), false);
                return;
            case 15:
                ((Context) ((rzo0) this.b).b).startActivity(new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(gz40.a).addFlags(268435456));
                return;
            case 16:
                ((rok0) this.b).i();
                return;
            case 17:
                ((OverlayHidingFrameLayout) this.b).a(true);
                return;
            case 18:
                izm0 izm0Var = ((xar0) this.b).b;
                if (izm0Var != null) {
                    for (mzb1 mzb1Var : ((LinkedHashMap) izm0Var.c).values()) {
                        if (mzb1Var.f) {
                            mzb1Var.g.j((Object) null);
                            mzb1Var.e = null;
                        }
                    }
                    return;
                }
                return;
            case 19:
                PeekScrollView peekScrollView = (PeekScrollView) this.b;
                peekScrollView.C(0 - peekScrollView.getScrollX(), 0 - peekScrollView.getScrollY(), false);
                return;
            case 20:
                for (EditText editText : (List) ((b14) this.b).e) {
                    editText.setGravity(8388611);
                    editText.setGravity(17);
                }
                return;
            case 21:
                p3u0 p3u0Var = (p3u0) this.b;
                q590 q590Var = p3u0Var.c;
                boolean zA = p3u0Var.b.a();
                if (!p3u0Var.X0 && !zA) {
                    z = false;
                }
                q590Var.T(z);
                return;
            case 22:
                ((kks0) this.b).invoke();
                return;
            case 23:
                rrv0 rrv0Var = (rrv0) this.b;
                synchronized (rrv0Var) {
                    rrv0Var.h("unresolved", false);
                    rrv0Var.i("unresolved", false);
                }
                return;
            case 24:
                PremiumPageListElementImpl.ui.1.1.layoutManager.1 r15 = ((zuv0) this.b).N0;
                r15.g1 = r15.g1() < r15.R() - 1;
                return;
            case 25:
                lrw0 lrw0Var = (lrw0) this.b;
                lrw0Var.a.getLifecycle().a(lrw0Var);
                return;
            case 26:
                ((g1x0) this.b).invoke();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                NativePubSubSetupV2Impl nativePubSubSetupV2Impl = ((pmy0) this.b).e;
                if (nativePubSubSetupV2Impl != null) {
                    nativePubSubSetupV2Impl.destroy();
                    return;
                } else {
                    u890.C("nativePubSubSetup");
                    throw null;
                }
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                obz0 obz0Var = (obz0) this.b;
                RecyclerView recyclerView4 = obz0Var.Z;
                if (recyclerView4 != null) {
                    recyclerView4.setItemAnimator(obz0Var.N0);
                    return;
                }
                return;
            default:
                ccz0 ccz0Var = (ccz0) this.b;
                int height2 = ((View) ccz0Var.Z.c).getHeight();
                RecyclerView recyclerView5 = ccz0Var.a.c;
                if (recyclerView5.getPaddingBottom() != height2) {
                    recyclerView5.setPadding(recyclerView5.getPaddingLeft(), recyclerView5.getPaddingTop(), recyclerView5.getPaddingRight(), height2);
                    return;
                }
                return;
        }
    }
}
