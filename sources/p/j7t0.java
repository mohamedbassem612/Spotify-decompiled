package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j7t0 extends m7t0 {
    public final String a;

    public j7t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7t0) && this.a.equals(((j7t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
