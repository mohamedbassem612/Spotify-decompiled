package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zm30 {
    public final phx a;
    public final phx b;

    public zm30(phx phxVar, phx phxVar2) {
        this.a = phxVar;
        this.b = phxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm30)) {
            return false;
        }
        zm30 zm30Var = (zm30) obj;
        return this.a.equals(zm30Var.a) && this.b.equals(zm30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
