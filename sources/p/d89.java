package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d89 implements i0u0, a4l {
    public final dfs a;

    public d89(dfs dfsVar) {
        this.a = dfsVar;
    }

    @Override // p.a4l
    public final void a() {
        this.a.b.remove(this);
    }

    @Override // p.a4l
    public final void b() {
        this.a.b.add(this);
    }

    @Override // p.i0u0
    public final String c() {
        return "AutomotivePlaybackGrabbingException";
    }

    @Override // p.i0u0
    public final l650 d(k650 k650Var) {
        return k650Var.c().getType() == f0u.Z ? l650.b : l650.c;
    }
}
