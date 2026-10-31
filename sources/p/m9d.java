package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m9d implements o9d {
    public final String a;

    public m9d(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9d) && u890.j(this.a, ((m9d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
