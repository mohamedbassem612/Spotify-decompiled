package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jjk1 extends ue30 {
    public final String b;
    public int c;

    public jjk1(l3d l3dVar) {
        super(l3dVar);
        this.b = "virtual-" + l3dVar.b() + "-" + UUID.randomUUID().toString();
    }

    @Override // p.ue30, p.l3d
    public final int a() {
        return j(0);
    }

    @Override // p.ue30, p.l3d
    public final String b() {
        return this.b;
    }

    @Override // p.ue30, p.l3d
    public final int j(int i) {
        return pfg1.f(this.a.j(i) - this.c);
    }
}
