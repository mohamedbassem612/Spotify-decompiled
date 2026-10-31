package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rcz0 {
    public final String a;

    public rcz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcz0) && u890.j(this.a, ((rcz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
