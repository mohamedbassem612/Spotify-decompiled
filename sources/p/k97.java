package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k97 {
    public final String a;

    public k97(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k97) && u890.j(this.a, ((k97) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
