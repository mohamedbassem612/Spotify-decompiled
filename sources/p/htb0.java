package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class htb0 implements trb0 {
    public final iu30 a;
    public final iu30 b;
    public final j2i c;

    public htb0(iu30 iu30Var, iu30 iu30Var2, j2i j2iVar) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = j2iVar;
    }

    @Override // p.trb0
    public final iu30 getKey() {
        return this.a;
    }

    @Override // p.trb0
    public final iu30 getType() {
        return this.b;
    }
}
