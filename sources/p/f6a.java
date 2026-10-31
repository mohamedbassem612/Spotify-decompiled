package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f6a {
    public final z7a a;

    public f6a(z7a z7aVar) {
        this.a = z7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6a) && u890.j(this.a, ((f6a) obj).a);
    }

    public final int hashCode() {
        z7a z7aVar = this.a;
        if (z7aVar == null) {
            return 0;
        }
        return z7aVar.hashCode();
    }
}
