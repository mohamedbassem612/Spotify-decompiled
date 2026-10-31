package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class av21 {
    public final g3e a;
    public final q2e b;

    public av21(g3e g3eVar, q2e q2eVar) {
        this.a = g3eVar;
        this.b = q2eVar;
    }

    public final q2e a() {
        return this.b;
    }

    public final g3e b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av21)) {
            return false;
        }
        av21 av21Var = (av21) obj;
        return u890.j(this.a, av21Var.a) && this.b == av21Var.b;
    }

    public final int hashCode() {
        g3e g3eVar = this.a;
        return Boolean.hashCode(true) + ((this.b.hashCode() + ((g3eVar == null ? 0 : g3eVar.hashCode()) * 31)) * 31);
    }
}
