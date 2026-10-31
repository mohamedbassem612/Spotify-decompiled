package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yle {
    public final String a;
    public final c380 b;

    public yle(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final c380 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yle)) {
            return false;
        }
        yle yleVar = (yle) obj;
        return u890.j(this.a, yleVar.a) && u890.j(this.b, yleVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
