package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class le1 {
    public final String a;

    public le1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le1) && u890.j(this.a, ((le1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
