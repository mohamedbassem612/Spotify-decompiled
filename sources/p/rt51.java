package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rt51 {
    public final boolean a;
    public final crb b;

    public rt51(boolean z, crb crbVar) {
        this.a = z;
        this.b = crbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt51)) {
            return false;
        }
        rt51 rt51Var = (rt51) obj;
        return this.a == rt51Var.a && this.b.equals(rt51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
