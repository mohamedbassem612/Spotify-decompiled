package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubb implements vbb {
    public final String a;

    public ubb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubb) && u890.j(this.a, ((ubb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
