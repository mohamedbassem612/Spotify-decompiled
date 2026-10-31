package p;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xue0 implements gp80 {
    @Override // p.gp80
    public final long c() {
        return System.currentTimeMillis();
    }

    @Override // p.gp80
    public final void d(tfh0 tfh0Var) {
        Iterator it = tfh0Var.d.iterator();
        while (it.hasNext()) {
            String str = ((sfh0) it.next()).a;
        }
        Objects.toString(tfh0Var.e);
    }

    @Override // p.gp80
    public final void a(String str) {
    }

    @Override // p.gp80
    public final void b(String str) {
    }
}
