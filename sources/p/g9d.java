package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g9d implements i9d {
    public final String a;

    public g9d(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9d) && u890.j(this.a, ((g9d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
