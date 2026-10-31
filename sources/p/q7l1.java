package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q7l1 implements uv50 {
    public final String a;
    public final bvq b;
    public final bpb1 c;
    public final o3r d;
    public final avm e;
    public final yd91 f;
    public final bpb1 g;

    public q7l1(String str, bvq bvqVar) {
        this.a = str;
        this.b = bvqVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.c = bpb1VarB;
        this.d = w3p1.o(new l4r(new xv00(rc11.a.b(f7l1.class)), 2, v5l1.O0, new j4r(new tak1(this, (byte) 14)), v5l1.P0), v5l1.Z);
        this.e = new avm(this);
        this.f = new yd91(3, new bkk1(this, (byte) 9));
        this.g = bpb1VarB;
    }

    @Override // p.t17
    public final mr20 b() {
        return this.g;
    }

    public final l381 c() {
        return this.e;
    }

    public final yd91 d() {
        return this.f;
    }
}
