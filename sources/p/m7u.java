package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7u {
    public final String a;

    public m7u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7u) && u890.j(this.a, ((m7u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
