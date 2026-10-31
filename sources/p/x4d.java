package p;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class x4d implements dkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4d(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                rts rtsVar = (rts) obj3;
                d4d1 d4d1Var = (d4d1) obj2;
                d4d1Var.close();
                Surface surface = (Surface) rtsVar.h.remove(d4d1Var);
                if (surface != null) {
                    xmm0 xmm0Var = rtsVar.a;
                    hy30.d((AtomicBoolean) xmm0Var.c, true);
                    hy30.c((Thread) xmm0Var.e);
                    xmm0Var.n(surface, true);
                }
                break;
            default:
                hev hevVar = (hev) obj3;
                d4d1 d4d1Var2 = (d4d1) obj2;
                d4d1Var2.close();
                Surface surface2 = (Surface) hevVar.h.remove(d4d1Var2);
                if (surface2 != null) {
                    fev fevVar = hevVar.a;
                    hy30.d((AtomicBoolean) fevVar.c, true);
                    hy30.c((Thread) fevVar.e);
                    fevVar.n(surface2, true);
                }
                break;
        }
    }
}
