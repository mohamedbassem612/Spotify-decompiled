package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j5h implements tyq {
    public final d0r a;
    public final me30 b;
    public final js20 c;
    public final eih1 d = new eih1();
    public final psw e;
    public final i13 f;

    public j5h(d0r d0rVar, String str, me30 me30Var) {
        this.a = d0rVar;
        this.b = me30Var;
        this.c = z0o1.k(d3p1.F(d0rVar, l5h.a, str), new qff(this, (byte) 14), (iu30) null, 12);
        j2i j2iVar = new j2i(-762059346, new rxg(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = i13.h;
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.c;
    }

    public final f4r getData() {
        return this.f;
    }
}
