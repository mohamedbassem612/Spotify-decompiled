package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eb30 {
    public final String a;

    public eb30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb30) && u890.j(this.a, ((eb30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
