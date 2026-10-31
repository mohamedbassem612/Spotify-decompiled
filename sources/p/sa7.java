package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sa7 implements za7 {
    public final String a;

    public sa7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa7) && u890.j(this.a, ((sa7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
