package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j7l extends k7l {
    public final String a;
    public final l7l b;

    public j7l(String str, l7l l7lVar) {
        this.a = str;
        this.b = l7lVar;
    }

    public final l7l a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7l)) {
            return false;
        }
        j7l j7lVar = (j7l) obj;
        return u890.j(this.a, j7lVar.a) && this.b == j7lVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
