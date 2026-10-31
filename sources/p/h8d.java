package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h8d implements p8d {
    public final String a;
    public final o8d b;

    public h8d(String str, o8d o8dVar) {
        this.a = str;
        this.b = o8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8d)) {
            return false;
        }
        h8d h8dVar = (h8d) obj;
        return u890.j(this.a, h8dVar.a) && u890.j(this.b, h8dVar.b);
    }

    @Override // p.p8d
    public final o8d getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
