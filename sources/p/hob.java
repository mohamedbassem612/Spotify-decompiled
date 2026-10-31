package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hob implements iob {
    public final i861 a;
    public final String b;

    public hob(i861 i861Var, String str) {
        this.a = i861Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hob)) {
            return false;
        }
        hob hobVar = (hob) obj;
        return this.a.equals(hobVar.a) && this.b.equals(hobVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
