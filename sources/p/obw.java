package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class obw implements hiw {
    public final String a;

    public obw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obw) && u890.j(this.a, ((obw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
