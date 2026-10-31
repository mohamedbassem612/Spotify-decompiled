package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cta {
    public final String a;

    public cta(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cta) && this.a.equals(((cta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
