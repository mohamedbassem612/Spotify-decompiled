package p;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zq70 extends ye30 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public zq70(zx70 zx70Var, ar70 ar70Var) {
        super(zx70Var);
        this.e = new WeakReference(ar70Var);
        a(new yq70(this, (byte) 0));
    }

    @Override // p.ye30, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public zq70(zx70 zx70Var) {
        super(zx70Var);
        this.e = new AtomicBoolean(false);
    }
}
