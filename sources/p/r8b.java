package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r8b {
    public final String a;
    public final t8b b;

    public r8b(String str, t8b t8bVar) {
        this.a = str;
        this.b = t8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8b)) {
            return false;
        }
        r8b r8bVar = (r8b) obj;
        return this.a.equals(r8bVar.a) && this.b.equals(r8bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
