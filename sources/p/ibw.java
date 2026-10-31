package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ibw {
    public final String a;

    public ibw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibw) && u890.j(this.a, ((ibw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
