package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class olo implements mko, is80 {
    public final gjo a;
    public final glo b = new glo(this, (byte) 2);

    public olo(qlw qlwVar, String str) {
        this.a = new gjo(qlwVar.a((String) null, new m95(str, (lnm) null, (byte) 1)), "Browse Collection State Machine");
    }

    public final void a(Set set) {
        this.a.b(set);
    }

    public final kko b() {
        return this.b;
    }

    @Override // p.is80
    public final r4u d(List list) {
        return r4u.d(new ilo(list, (byte) 0), r4u.a(new uq8(this, (byte) 23)));
    }

    @Override // p.is80
    public final void dispose() {
        this.a.a();
    }

    @Override // p.is80
    public final void start() {
        this.a.c();
    }

    public final void stop() {
    }
}
