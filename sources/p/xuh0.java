package p;

import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xuh0 extends mvh0 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public gvh0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ bvh0 f146p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final gv40 m = new gv40(this, (byte) 17);
    public int n = -1;

    public xuh0(bvh0 bvh0Var, MediaRouter2.RoutingController routingController, String str) {
        this.f146p = bvh0Var;
        this.g = routingController;
        this.f = str;
        Messenger messengerI = bvh0.i(routingController);
        this.h = messengerI;
        this.i = messengerI == null ? null : new Messenger((Handler) new nj7(this));
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // p.nvh0
    public final boolean d(Intent intent, hwh0 hwh0Var) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return false;
        }
        int andIncrement = this.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 9;
        messageObtain.arg1 = andIncrement;
        messageObtain.obj = intent;
        messageObtain.replyTo = this.i;
        try {
            messenger.send(messageObtain);
            if (hwh0Var == null) {
                return true;
            }
            this.j.put(andIncrement, hwh0Var);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // p.nvh0
    public final void e() {
        this.g.release();
    }

    @Override // p.nvh0
    public final void g(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        gv40 gv40Var = this.m;
        handler.removeCallbacks(gv40Var);
        handler.postDelayed(gv40Var, 1000L);
    }

    @Override // p.nvh0
    public final void j(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.g.getVolumeMax()));
        this.n = iMax;
        this.g.setVolume(iMax);
        Handler handler = this.k;
        gv40 gv40Var = this.m;
        handler.removeCallbacks(gv40Var);
        handler.postDelayed(gv40Var, 1000L);
    }

    @Override // p.mvh0
    public final void l(String str) {
        MediaRoute2Info mediaRoute2InfoJ;
        if (str == null || str.isEmpty() || (mediaRoute2InfoJ = this.f146p.j(str)) == null) {
            return;
        }
        this.g.selectRoute(mediaRoute2InfoJ);
    }

    @Override // p.mvh0
    public final void m(String str) {
        MediaRoute2Info mediaRoute2InfoJ;
        if (str == null || str.isEmpty() || (mediaRoute2InfoJ = this.f146p.j(str)) == null) {
            return;
        }
        this.g.deselectRoute(mediaRoute2InfoJ);
    }

    @Override // p.mvh0
    public final void n(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        bvh0 bvh0Var = this.f146p;
        MediaRoute2Info mediaRoute2InfoJ = bvh0Var.j(str);
        if (mediaRoute2InfoJ == null) {
            return;
        }
        bvh0Var.i.transferTo(mediaRoute2InfoJ);
    }

    public final String p() {
        gvh0 gvh0Var = this.o;
        return gvh0Var != null ? gvh0Var.g() : this.g.getId();
    }

    public final void q(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    public final void r(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null || routingController.isReleased() || (messenger = this.h) == null) {
            return;
        }
        int andIncrement = this.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
