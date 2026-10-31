package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sz50 {
    public final String a;

    public sz50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz50) && u890.j(this.a, ((sz50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
