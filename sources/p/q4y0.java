package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q4y0 {
    public final String a;

    public q4y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4y0) && this.a.equals(((q4y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
