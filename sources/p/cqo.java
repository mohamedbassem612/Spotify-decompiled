package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cqo extends kln1 {
    public final String b;

    public cqo(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqo) && u890.j(this.b, ((cqo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
