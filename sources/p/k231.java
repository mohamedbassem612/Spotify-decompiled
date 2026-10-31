package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k231 extends g331 {
    public final String a;

    public k231(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k231) && u890.j(this.a, ((k231) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
