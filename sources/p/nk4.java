package p;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nk4 implements ComponentCallbacks2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nk4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        byte b = this.a;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                break;
            default:
                mxa1 mxa1Var = (mxa1) this.b;
                if (((AtomicReference) ((utw0) mxa1Var.f).a).get() == null) {
                    mxa1Var.x();
                    break;
                }
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i >= 40) {
                    ok4 ok4Var = (ok4) obj;
                    em3 em3Var = ok4Var.e;
                    if (em3Var != null) {
                        em3Var.i();
                    }
                    ok4Var.e = null;
                }
                break;
            default:
                mxa1 mxa1Var = (mxa1) obj;
                if (((AtomicReference) ((utw0) mxa1Var.f).a).get() == null) {
                    mxa1Var.x();
                    break;
                }
                break;
        }
    }

    private final void c() {
    }

    private final void a(Configuration configuration) {
    }

    private final void b(Configuration configuration) {
    }
}
