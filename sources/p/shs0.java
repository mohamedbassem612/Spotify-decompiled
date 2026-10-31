package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class shs0 {
    public final String a;

    public shs0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shs0) && u890.j(this.a, ((shs0) obj).a);
    }

    public final int hashCode() {
        return skg.c.hashCode() + ab80.k(5, this.a.hashCode() * 31, 31);
    }
}
