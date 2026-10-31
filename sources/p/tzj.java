package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public class tzj implements vzj {
    public final List a;
    public z2k b;
    public final err0 c;
    public final err0 d;
    public int e;
    public qyl f;
    public final hrr0 g;

    public tzj(qyl qylVar, int i) {
        qylVar = (i & 1) != 0 ? oyl.a : qylVar;
        this.a = new ArrayList();
        this.c = new err0(0);
        this.d = new err0(0);
        this.f = qylVar;
        this.g = v8r.q(w7x.a);
    }

    @Override // p.vzj
    public final List a() {
        return this.a;
    }

    public final Set c() {
        return (Set) this.g.getValue();
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d.s();
    }

    public final int f() {
        return this.c.s();
    }

    public final void g(z2k z2kVar) {
        this.b = z2kVar;
    }

    @Override // p.vzj
    public final void b(vzj vzjVar) {
    }
}
