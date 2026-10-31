package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo9 implements yo9 {
    public final f8n a;
    public final f8n b;

    public uo9(f8n f8nVar, f8n f8nVar2) {
        this.a = f8nVar;
        this.b = f8nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo9)) {
            return false;
        }
        uo9 uo9Var = (uo9) obj;
        return this.a == uo9Var.a && this.b == uo9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
