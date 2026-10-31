package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pbw {
    public final String a;

    public pbw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbw) && u890.j(this.a, ((pbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
