package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gt11 {
    public final String a;

    public gt11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt11) && u890.j(this.a, ((gt11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
