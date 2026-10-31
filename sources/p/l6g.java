package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l6g implements p6g {
    public final String a;

    public l6g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6g) && u890.j(this.a, ((l6g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
