package p;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w2k1 {
    public final y22 a = new y22(this, (byte) 23);
    public final ArrayList b = new ArrayList();
    public final LinkedHashSet c = new LinkedHashSet();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public boolean e;
    public boolean f;
    public boolean g;

    public final void a(VideoSurfaceView videoSurfaceView) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(videoSurfaceView)) {
            return;
        }
        arrayList.add(0, videoSurfaceView);
        if (arrayList.size() > 1) {
            r7h.f0(arrayList, new epj1((byte) 5));
        }
        videoSurfaceView.setUseExoPlayerSubtitleViewStyling(this.g);
        if (this.e) {
            videoSurfaceView.setUseSurfaceView(this.f);
        }
        e(videoSurfaceView);
        LinkedHashSet linkedHashSet = this.c;
        ArrayList arrayList2 = new ArrayList(q7h.U(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((u2k1) it.next()).a(videoSurfaceView);
            arrayList2.add(rih1.a);
        }
        videoSurfaceView.setOnPredicateChangedListener(new ezb1(this, (byte) 21));
        videoSurfaceView.addOnAttachStateChangeListener(this.a);
    }

    public final VideoSurfaceView b(m0u0 m0u0Var) {
        Object next;
        boolean zC;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
            boolean z = videoSurfaceView.useSurfaceView;
            if (!(z && videoSurfaceView.c == null) && (z || videoSurfaceView.a != null)) {
                gvt0 gvt0Var = videoSurfaceView.h;
                zC = gvt0Var != null ? gvt0Var.c(m0u0Var) : true;
            } else {
                zC = false;
            }
            if (zC) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!c((VideoSurfaceView) next));
        VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) next;
        return videoSurfaceView2 == null ? (VideoSurfaceView) o7h.s0(arrayList) : videoSurfaceView2;
    }

    public final boolean c(VideoSurfaceView videoSurfaceView) {
        SurfaceView c = videoSurfaceView.getC();
        SurfaceHolder holder = c != null ? c.getHolder() : null;
        v2k1 v2k1Var = (v2k1) this.d.get(videoSurfaceView);
        if (v2k1Var == null) {
            return true;
        }
        v2k1 v2k1Var2 = v2k1Var.b() == holder ? v2k1Var : null;
        if (v2k1Var2 != null) {
            return v2k1Var2.c();
        }
        return true;
    }

    public final void d(VideoSurfaceView videoSurfaceView) {
        if (videoSurfaceView != null) {
            LinkedHashSet linkedHashSet = this.c;
            ArrayList arrayList = new ArrayList(q7h.U(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((u2k1) it.next()).b();
                arrayList.add(rih1.a);
            }
        }
    }

    public final void e(VideoSurfaceView videoSurfaceView) {
        SurfaceHolder holder;
        SurfaceView c = videoSurfaceView.getC();
        if (c == null || (holder = c.getHolder()) == null) {
            return;
        }
        bug bugVar = new bug(this, videoSurfaceView, (byte) 1);
        Surface surface = holder.getSurface();
        this.d.put(videoSurfaceView, new v2k1(holder, bugVar, surface != null && surface.isValid()));
        holder.addCallback(bugVar);
    }

    public final void f(VideoSurfaceView videoSurfaceView) {
        if (this.b.remove(videoSurfaceView)) {
            v2k1 v2k1Var = (v2k1) this.d.remove(videoSurfaceView);
            if (v2k1Var != null) {
                v2k1Var.b().removeCallback(v2k1Var.a());
            }
            videoSurfaceView.setOnPredicateChangedListener(null);
            videoSurfaceView.removeOnAttachStateChangeListener(this.a);
            LinkedHashSet linkedHashSet = this.c;
            ArrayList arrayList = new ArrayList(q7h.U(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((u2k1) it.next()).c(videoSurfaceView);
                arrayList.add(rih1.a);
            }
        }
    }

    public final void g(VideoSurfaceView videoSurfaceView, SurfaceHolder surfaceHolder, boolean z) {
        v2k1 v2k1Var = (v2k1) this.d.get(videoSurfaceView);
        if ((v2k1Var != null ? v2k1Var.b() : null) == surfaceHolder) {
            SurfaceView c = videoSurfaceView.getC();
            if ((c != null ? c.getHolder() : null) == surfaceHolder && v2k1Var.c() != z) {
                v2k1Var.d(z);
                d(videoSurfaceView);
            }
        }
    }

    public final void h(boolean z) {
        if (this.e && this.f == z) {
            return;
        }
        this.e = true;
        this.f = z;
        for (VideoSurfaceView videoSurfaceView : o7h.l1(this.b)) {
            boolean zC = c(videoSurfaceView);
            v2k1 v2k1Var = (v2k1) this.d.remove(videoSurfaceView);
            if (v2k1Var != null) {
                v2k1Var.b().removeCallback(v2k1Var.a());
            }
            videoSurfaceView.setUseSurfaceView(z);
            e(videoSurfaceView);
            if (zC != c(videoSurfaceView)) {
                d(videoSurfaceView);
            }
        }
    }
}
