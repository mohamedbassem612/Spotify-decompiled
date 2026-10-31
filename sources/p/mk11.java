package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mk11 {
    public final String a;

    public mk11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk11) && u890.j(this.a, ((mk11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
