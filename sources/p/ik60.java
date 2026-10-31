package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ik60 extends pba {
    public final List e;
    public final long f;
    public final String g;

    public ik60(String str, long j, List list) {
        super(0L, list.size() - 1);
        this.g = str;
        this.f = j;
        this.e = list;
    }

    @Override // p.vjh0
    public final long a() {
        d();
        return this.f + ((zk60) this.e.get((int) this.d)).e;
    }

    @Override // p.vjh0
    public final long b() {
        d();
        zk60 zk60Var = (zk60) this.e.get((int) this.d);
        return this.f + zk60Var.e + zk60Var.c;
    }

    @Override // p.vjh0
    public final n3r c() {
        d();
        zk60 zk60Var = (zk60) this.e.get((int) this.d);
        return new n3r(pno1.q(this.g, zk60Var.a), zk60Var.i, zk60Var.t);
    }
}
