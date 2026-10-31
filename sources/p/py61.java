package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class py61 {
    public final String a;

    public py61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py61) && u890.j(this.a, ((py61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
