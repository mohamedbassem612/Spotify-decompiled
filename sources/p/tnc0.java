package p;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tnc0 implements q0r {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ ssw0 c;
    public final /* synthetic */ vnc0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ l811 f;
    public final /* synthetic */ LinkedHashSet g;

    public tnc0(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, ssw0 ssw0Var, vnc0 vnc0Var, Object obj, l811 l811Var, LinkedHashSet linkedHashSet) {
        this.a = atomicBoolean;
        this.b = atomicBoolean2;
        this.c = ssw0Var;
        this.d = vnc0Var;
        this.e = obj;
        this.f = l811Var;
        this.g = linkedHashSet;
    }

    @Override // p.q0r
    public final void a(Set set) {
        ss90.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, set);
    }

    @Override // p.q0r
    public final void b() {
        ss90.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
    }
}
