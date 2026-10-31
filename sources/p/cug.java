package p;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cug {
    public final w2k1 a;
    public final Handler b;
    public final LinkedHashMap c;
    public lo9 d;
    public VideoSurfaceView e;
    public SurfaceHolder f;
    public bug g;
    public boolean h;
    public boolean i;
    public final aug j;

    public cug(w2k1 w2k1Var) {
        xtg xtgVar = xtg.a;
        this.a = w2k1Var;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new LinkedHashMap();
        this.j = new aug(this);
    }

    public static wsg c(SurfaceHolder surfaceHolder, VideoSurfaceView videoSurfaceView, int i, int i2) {
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            surface = null;
        }
        if (surface == null) {
            i = 0;
        }
        if (surface == null) {
            i2 = 0;
        }
        if (surface == null) {
            videoSurfaceView = null;
        }
        return new wsg(surface, i, i2, videoSurfaceView);
    }

    public static /* synthetic */ wsg d(cug cugVar, SurfaceHolder surfaceHolder, VideoSurfaceView videoSurfaceView) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        int iWidth = surfaceFrame != null ? surfaceFrame.width() : 0;
        Rect surfaceFrame2 = surfaceHolder.getSurfaceFrame();
        int iHeight = surfaceFrame2 != null ? surfaceFrame2.height() : 0;
        cugVar.getClass();
        return c(surfaceHolder, videoSurfaceView, iWidth, iHeight);
    }

    public final void a() {
        SurfaceHolder surfaceHolder;
        VideoSurfaceView videoSurfaceView = this.e;
        if (videoSurfaceView != null) {
            videoSurfaceView.setKeepScreenOn(false);
        }
        bug bugVar = this.g;
        if (bugVar != null && (surfaceHolder = this.f) != null) {
            surfaceHolder.removeCallback(bugVar);
        }
        this.g = null;
        this.f = null;
        this.e = null;
    }

    public final void b(VideoSurfaceView videoSurfaceView) {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(videoSurfaceView)) {
            return;
        }
        ztg ztgVar = new ztg(this, videoSurfaceView);
        linkedHashMap.put(videoSurfaceView, ztgVar);
        videoSurfaceView.addOnLayoutChangeListener(ztgVar.b);
        videoSurfaceView.getViewTreeObserver().addOnScrollChangedListener(ztgVar.c);
    }

    public final void e(VideoSurfaceView videoSurfaceView) {
        ztg ztgVar = (ztg) this.c.remove(videoSurfaceView);
        if (ztgVar != null) {
            VideoSurfaceView videoSurfaceView2 = ztgVar.a;
            videoSurfaceView2.removeOnLayoutChangeListener(ztgVar.b);
            ViewTreeObserver viewTreeObserver = videoSurfaceView2.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(ztgVar.c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    public final void f(boolean z) {
        Object next;
        VideoSurfaceView videoSurfaceView;
        SurfaceView surfaceView;
        if (this.h) {
            ArrayList arrayList = this.a.b;
            xtg xtgVar = xtg.a;
            ArrayList<VideoSurfaceView> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((VideoSurfaceView) obj).getSupportsSurfaceView()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            for (VideoSurfaceView videoSurfaceView2 : arrayList2) {
                arrayList3.add(new mmr0(videoSurfaceView2, xtgVar.invoke(videoSurfaceView2)));
            }
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((mmr0) next).b).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((mmr0) next2).b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            mmr0 mmr0Var = (mmr0) next;
            if (mmr0Var == null) {
                videoSurfaceView = null;
            } else {
                if (((Number) mmr0Var.b).intValue() <= 0) {
                    mmr0Var = null;
                }
                if (mmr0Var != null) {
                    videoSurfaceView = (VideoSurfaceView) mmr0Var.a;
                } else {
                    videoSurfaceView = null;
                }
            }
            if (videoSurfaceView != this.e || this.f == null) {
                a();
                this.e = videoSurfaceView;
                if (videoSurfaceView != null) {
                    videoSurfaceView.setKeepScreenOn(this.i);
                }
                SurfaceHolder holder = (videoSurfaceView == null || (surfaceView = videoSurfaceView.getSurfaceView()) == null) ? null : surfaceView.getHolder();
                byte b = 0;
                if (holder == null) {
                    lo9 lo9Var = this.d;
                    if (lo9Var != null) {
                        lo9Var.q(new wsg((Surface) null, 0, 0, (VideoSurfaceView) null));
                    }
                    if (videoSurfaceView == null || !z) {
                        return;
                    }
                    this.b.post(new s10(this, (byte) 24));
                    return;
                }
                bug bugVar = new bug(this, videoSurfaceView, b);
                this.f = holder;
                this.g = bugVar;
                holder.addCallback(bugVar);
                lo9 lo9Var2 = this.d;
                if (lo9Var2 != null) {
                    lo9Var2.q(d(this, holder, videoSurfaceView));
                }
            }
        }
    }
}
