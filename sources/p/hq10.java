package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hq10 {
    public final String a;

    public hq10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq10) && u890.j(this.a, ((hq10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
