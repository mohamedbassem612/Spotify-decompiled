package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m261 extends hp51 {
    public final /* synthetic */ AtomicReferenceArray h;

    public m261(long j, m261 m261Var, int i) {
        super(j, m261Var, i);
        this.h = new AtomicReferenceArray(l261.f);
    }

    @Override // p.hp51
    public final int g() {
        return l261.f;
    }

    @Override // p.hp51
    public final void h(int i, o8n o8nVar) {
        this.h.set(i, l261.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
