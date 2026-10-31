package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z5g implements c6g {
    public final String a;

    public z5g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5g) && u890.j(this.a, ((z5g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
