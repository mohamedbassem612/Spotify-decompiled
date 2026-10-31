package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wo90 {
    public final String a;

    public wo90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo90) && u890.j(this.a, ((wo90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
