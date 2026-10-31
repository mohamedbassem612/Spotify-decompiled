package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m7d implements v7d {
    public final String a;
    public final t7d b;

    public m7d(String str, t7d t7dVar) {
        this.a = str;
        this.b = t7dVar;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7d)) {
            return false;
        }
        m7d m7dVar = (m7d) obj;
        return u890.j(this.a, m7dVar.a) && this.b == m7dVar.b;
    }

    public final t7d getStatus() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
