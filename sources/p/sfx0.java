package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sfx0 {
    public final dt71 a;
    public final dt71 b;
    public final bpb1 c;
    public final bpb1 d;

    public sfx0() {
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.a = dt71VarE;
        this.b = dt71VarE;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.c = bpb1VarB;
        this.d = bpb1VarB;
    }

    public final Object a(rfx0 rfx0Var, a8d1 a8d1Var) {
        boolean z = rfx0Var instanceof pfx0;
        bpb1 bpb1Var = this.c;
        if (z) {
            bpb1Var.m((Object) null, Boolean.TRUE);
        } else if (rfx0Var instanceof ofx0) {
            bpb1Var.m((Object) null, Boolean.FALSE);
        } else if (!(rfx0Var instanceof qfx0)) {
            eg.o();
            return null;
        }
        Object objEmit = this.a.emit(rfx0Var, a8d1Var);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }
}
