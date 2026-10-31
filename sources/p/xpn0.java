package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xpn0 implements wqn0 {
    public final String a;
    public final String b;

    public xpn0(String str) {
        this.a = str;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = yon1.G1("GENRE", "genre", 604, "genre").c;
    }

    @Override // p.wqn0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpn0) && u890.j(this.a, ((xpn0) obj).a);
    }

    @Override // p.wqn0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
