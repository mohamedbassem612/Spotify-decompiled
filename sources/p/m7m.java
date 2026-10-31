package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m7m {
    public final String a;
    public final k7m b;

    public m7m(String str, k7m k7mVar) {
        this.a = str;
        this.b = k7mVar;
    }

    public static m7m a(m7m m7mVar, String str, k7m k7mVar, int i) {
        if ((i & 1) != 0) {
            str = m7mVar.a;
        }
        if ((i & 2) != 0) {
            k7mVar = m7mVar.b;
        }
        return new m7m(str, k7mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7m)) {
            return false;
        }
        m7m m7mVar = (m7m) obj;
        return this.a.equals(m7mVar.a) && u890.j(this.b, m7mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
