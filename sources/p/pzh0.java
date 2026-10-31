package p;

import android.os.RemoteException;
import androidx.media3.session.legacy.MediaSessionManager;
import com.comscore.streaming.ContentMediaFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pzh0 implements hx30 {
    public final /* synthetic */ MediaSessionManager.RemoteUserInfo a;
    public final /* synthetic */ ixh0 b;
    public final /* synthetic */ e0i0 c;

    public pzh0(e0i0 e0i0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, a0i0 a0i0Var, ixh0 ixh0Var) {
        this.c = e0i0Var;
        this.a = remoteUserInfo;
        this.b = ixh0Var;
    }

    public final void onFailure(Throwable th) {
        e0i0 e0i0Var = this.c;
        y36 y36Var = e0i0Var.b;
        MediaSessionManager.RemoteUserInfo remoteUserInfo = this.a;
        e0i0Var.c.remove(remoteUserInfo);
    }

    public final void onSuccess(Object obj) {
        gxh0 gxh0Var = (gxh0) obj;
        List list = (List) this.c.c.remove(this.a);
        if (this.c.d.p() || gxh0Var == null || !gxh0Var.a) {
            return;
        }
        v1k v1kVar = this.c.a;
        ixh0 ixh0Var = this.b;
        v1kVar.b(ixh0Var.a, ixh0Var, gxh0Var.b, gxh0Var.c);
        this.c.d.w(this.b);
        e0i0 e0i0Var = this.c;
        zzh0 zzh0Var = e0i0Var.g;
        ixh0 ixh0Var2 = this.b;
        long j = e0i0Var.o;
        zzh0Var.removeMessages(ContentMediaFormat.FULL_CONTENT_GENERIC, ixh0Var2);
        zzh0Var.sendMessageDelayed(zzh0Var.obtainMessage(ContentMediaFormat.FULL_CONTENT_GENERIC, ixh0Var2), j);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((d0i0) it.next()).a(this.b);
                } catch (RemoteException e) {
                    oon1.I("Exception in " + this.b, e);
                }
            }
        }
    }
}
