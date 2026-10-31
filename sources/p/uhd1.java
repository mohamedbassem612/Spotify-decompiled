package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uhd1 implements rdo0 {
    public final c380 a;
    public final hrr0 b;
    public final hrr0 c;
    public final mdt d;
    public p9m e;
    public final xq81 f;

    public uhd1(Object obj, c380 c380Var) {
        this.a = c380Var;
        if (c380Var.isEmpty()) {
            hhg1.n("Tab set cannot be empty");
            throw null;
        }
        if (!c380Var.contains(obj)) {
            bhn0.l("Initial tab '", obj, "' not in tab set: ", c380Var);
            throw null;
        }
        if (c380Var.size() != o7h.p1(c380Var).size()) {
            bhn0.s(c380Var, "Tab set contains duplicates: ");
            throw null;
        }
        hrr0 hrr0VarQ = v8r.q(obj);
        this.b = hrr0VarQ;
        this.c = hrr0VarQ;
        this.d = yv91.a(new fjc1(this, (byte) 11));
        this.e = smg1.a;
        this.f = new xq81(this, (byte) 16);
    }

    public final mdt a() {
        return this.d;
    }

    public final p9m b() {
        return this.e;
    }

    public final void dispose() {
    }
}
