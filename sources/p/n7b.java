package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n7b implements o7b {
    public final String a;

    public n7b(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7b) && u890.j(this.a, ((n7b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
