package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tbb implements vbb {
    public final String a;

    public tbb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbb) && u890.j(this.a, ((tbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
