package p;

import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class deo1 extends vmo1 {
    public final /* synthetic */ byte m = 0;
    public final WeakReference n;
    public final WeakReference o;

    public deo1(HashMap map, Object obj, kho1 kho1Var) {
        super(kho1Var);
        this.n = new WeakReference(map);
        this.o = new WeakReference(obj);
    }

    @Override // p.wan1
    public final void h1(Status status) {
        switch (this.m) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map map = (Map) this.n.get();
                Object obj = this.o.get();
                status.getClass();
                if (!status.j() && map != null && obj != null) {
                    synchronized (map) {
                        try {
                            gro1 gro1Var = (gro1) map.remove(obj);
                            if (gro1Var != null) {
                                gro1Var.b1();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                i1(status);
                return;
            default:
                Map map2 = (Map) this.n.get();
                Object obj2 = this.o.get();
                status.getClass();
                if (status.a == 4002 && map2 != null && obj2 != null) {
                    synchronized (map2) {
                        try {
                            gro1 gro1Var2 = (gro1) map2.remove(obj2);
                            if (gro1Var2 != null) {
                                gro1Var2.b1();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                i1(status);
                return;
        }
    }

    public deo1(HashMap map, Object obj, kho1 kho1Var, byte b) {
        super(kho1Var);
        this.n = new WeakReference(map);
        this.o = new WeakReference(obj);
    }
}
