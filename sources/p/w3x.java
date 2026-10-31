package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class w3x {
    public boolean a;
    public final Object b;
    public final Object c;

    public w3x(boolean z) {
        bpb1 bpb1VarB = gio1.b(Boolean.valueOf(z));
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        this.a = z;
    }

    public void d(boolean z) {
        this.a = z;
        ((bpb1) this.b).m((Object) null, Boolean.valueOf(z));
    }

    public w3x(z3x z3xVar) {
        this.a = false;
        this.c = new i0s();
        this.b = z3xVar;
    }

    public void c() {
    }
}
