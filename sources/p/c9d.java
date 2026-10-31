package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c9d implements e9d {
    public final apl a;

    public c9d(apl aplVar) {
        this.a = aplVar;
    }

    public final apl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9d) && u890.j(this.a, ((c9d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
