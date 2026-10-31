package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c7g implements q7g {
    public final String a;

    public c7g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7g) && u890.j(this.a, ((c7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
