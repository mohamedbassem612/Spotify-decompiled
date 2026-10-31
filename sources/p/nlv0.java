package p;

import com.spotify.localfiles.localfilesapi.LocalFilesApi;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nlv0 implements mlv0 {
    public final io80 a;
    public final io80 b;
    public final io80 c;
    public final io80 d;
    public final io80 e;
    public final nx9 f;
    public final ui8 g;

    public nlv0(io80 io80Var, io80 io80Var2, io80 io80Var3, io80 io80Var4, io80 io80Var5, nx9 nx9Var, ui8 ui8Var) {
        this.a = io80Var;
        this.b = io80Var2;
        this.c = io80Var3;
        this.d = io80Var4;
        this.e = io80Var5;
        this.f = nx9Var;
        this.g = ui8Var;
    }

    @Override // p.mlv0
    public final nx9 a() {
        return this.f;
    }

    @Override // p.mlv0
    public final b5n b() {
        return (b5n) this.c.a();
    }

    @Override // p.mlv0
    public final ui8 c() {
        return this.g;
    }

    @Override // p.mlv0
    public final LocalFilesApi d() {
        return (LocalFilesApi) this.d.a();
    }

    @Override // p.mlv0
    public final ph61 e() {
        return (ph61) this.b.a();
    }

    @Override // p.mlv0
    public final qz11 f() {
        return (qz11) this.e.a();
    }

    @Override // p.mlv0
    public final ncl g() {
        return (ncl) this.a.a();
    }
}
