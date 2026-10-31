package p;

import android.content.Context;
import android.view.KeyEvent;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Connection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class v6a extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6a(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 2;
        boolean zA = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                y6a y6aVar = (y6a) ((lyc) this).receiver;
                c921.y(y6aVar.c, (o8n) null, 0, new k53((z7a) obj, y6aVar, null, b2), 3);
                return rih1Var;
            case 1:
                gdy.y((gdy) ((lyc) this).receiver, (ady) obj);
                return rih1Var;
            case 2:
                s940 s940Var = (s940) ((lyc) this).receiver;
                return (zob1) s940Var.t.computeIfAbsent((omd) obj, new d4k(s940Var, (byte) 3));
            case 3:
                KeyEvent keyEventB = ((cpa0) obj).b();
                ao60 ao60Var = (ao60) ((lyc) this).receiver;
                ao60Var.getClass();
                if (crn1.m(ern1.t(keyEventB), 2)) {
                    long jR = ern1.r(keyEventB);
                    int i = toa0.P;
                    if (toa0.a(jR, qqn1.R())) {
                        zA = true;
                        if (!((dz20) ao60Var.a).i(ern1.w(keyEventB) ? (byte) 2 : (byte) 1, true)) {
                            ao60Var.a(ern1.w(keyEventB) ? 33 : 130);
                        }
                    } else if (toa0.a(jR, qqn1.t())) {
                        zA = ao60Var.a(130);
                    } else if (toa0.a(jR, qqn1.w())) {
                        zA = ao60Var.a(33);
                    }
                }
                return Boolean.valueOf(zA);
            case 4:
                return ga90.a((ga90) ((lyc) this).receiver, (lnm) obj);
            case 5:
                Set set = (Set) obj;
                ec90 ec90Var = (ec90) ((lyc) this).receiver;
                ReentrantLock reentrantLock = ec90Var.d;
                reentrantLock.lock();
                try {
                    List listL1 = o7h.l1(ec90Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = listL1.iterator();
                    while (it.hasNext()) {
                        ((vjp0) it.next()).b(set);
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 6:
                ((iaa0) ((lyc) this).receiver).l((Throwable) obj);
                return rih1Var;
            case 7:
                ((Connection) ((lyc) this).receiver).accept(obj);
                return rih1Var;
            case 8:
                ((vw11) ((lyc) this).receiver).l((qnc0) obj);
                return rih1Var;
            case 9:
                hd81 hd81Var = (hd81) ((lyc) this).receiver;
                hd81Var.getClass();
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.ASPECT_FILL);
                hd81Var.Z.b(videoSurfaceView);
                return videoSurfaceView;
            default:
                ((h8h1) ((lyc) this).receiver).getClass();
                return h8h1.a((s2j0) obj);
        }
    }
}
