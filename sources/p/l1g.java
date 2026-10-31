package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l1g implements m1g {
    public final String a;

    public l1g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1g) && u890.j(this.a, ((l1g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
