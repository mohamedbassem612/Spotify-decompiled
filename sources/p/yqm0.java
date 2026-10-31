package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yqm0 implements tyq {
    public final lzn0 a;
    public final gw70 b;
    public final d0r c;
    public final fod0 d;
    public final js20 e = z0o1.j(new vqm0(this, 0), new fhk0(this, (byte) 4), new vqm0(this, 1), 4);
    public final ia00 f = n3o1.q(this).a(new wqm0(this, (byte) 0), new wqm0(this, (byte) 1));
    public final psw g;

    public yqm0(lzn0 lzn0Var, gw70 gw70Var, d0r d0rVar, fod0 fod0Var) {
        this.a = lzn0Var;
        this.b = gw70Var;
        this.c = d0rVar;
        this.d = fod0Var;
        j2i j2iVar = new j2i(-858890004, new hmk0(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final d0r e() {
        return this.c;
    }

    public final String f() {
        w6b1 w6b1VarA = f7b1.a(blc0.Bb);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str != null) {
            return str;
        }
        bhn0.g(this, "No uri found for ");
        return null;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return i13.r;
    }
}
