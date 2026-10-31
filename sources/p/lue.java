package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lue implements vue {
    public final String a;

    public lue(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lue) && this.a.equals(((lue) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
