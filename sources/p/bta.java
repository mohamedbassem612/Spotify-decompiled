package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bta {
    public final String a;

    public bta(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bta) && this.a.equals(((bta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
