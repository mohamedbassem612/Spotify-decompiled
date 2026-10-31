package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fat extends iat {
    public final String a;

    public fat(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fat) && u890.j(this.a, ((fat) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
