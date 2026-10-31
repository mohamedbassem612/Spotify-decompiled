package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uv41 {
    public final String a;

    public uv41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uv41) && u890.j(this.a, ((uv41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
