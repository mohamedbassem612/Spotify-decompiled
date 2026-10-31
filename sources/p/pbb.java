package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pbb implements vbb {
    public final String a;

    public pbb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbb) && this.a.equals(((pbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
