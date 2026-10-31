package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6g implements p6g {
    public final String a;

    public j6g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6g) && u890.j(this.a, ((j6g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
