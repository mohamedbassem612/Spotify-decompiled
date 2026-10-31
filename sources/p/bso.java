package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bso implements syq {
    public final d0r a;
    public final f4r b;
    public final mqw c;
    public final rqw d;
    public final osw e;
    public final String f;

    public bso(syq syqVar, iu30 iu30Var) {
        this.a = syqVar.e();
        this.b = syqVar.getData();
        this.c = syqVar.getBehavior();
        this.d = syqVar.a();
        this.e = kyo1.m(syqVar.c(), iu30Var);
        this.f = syqVar.b();
    }

    public final rqw a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final rsw c() {
        return this.e;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.c;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.b;
    }
}
