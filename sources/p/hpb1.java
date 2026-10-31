package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hpb1 extends ca {
    public final AtomicReference a = new AtomicReference(null);

    @Override // p.ca
    public final boolean a(ba baVar) {
        AtomicReference atomicReference = this.a;
        if (s110.j(atomicReference) != null) {
            return false;
        }
        s110.n(atomicReference, gio1.a);
        return true;
    }

    @Override // p.ca
    public final lnm[] b(ba baVar) {
        s110.n(this.a, (Object) null);
        return si1.a;
    }
}
