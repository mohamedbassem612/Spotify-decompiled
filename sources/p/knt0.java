package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class knt0 implements tyq {
    public final d0r a;
    public final i4r b;
    public final qgg1 c;
    public final jsw d;
    public final rgg1 e;

    public knt0(jg51 jg51Var, el9 el9Var, aft0 aft0Var) {
        this.a = el9Var.e();
        this.b = a4p1.o(el9Var.getData());
        kpg0 kpg0VarH = t3k1.H(jg51Var, aft0Var);
        this.c = kpg0VarH.getBehavior();
        this.d = kpg0VarH.a.c();
        this.e = kpg0VarH.a();
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.d;
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
