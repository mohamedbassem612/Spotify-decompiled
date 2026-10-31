package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s4i1 implements b5i1 {
    public final String a;

    public s4i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4i1) && u890.j(this.a, ((s4i1) obj).a);
    }

    @Override // p.b5i1
    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
