package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class skf0 implements ukf0 {
    public final a9h a;

    public skf0(a9h a9hVar) {
        this.a = a9hVar;
    }

    public final a9h a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skf0) && u890.j(this.a, ((skf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
