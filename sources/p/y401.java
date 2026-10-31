package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y401 implements f501 {
    public final String a;

    public y401(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y401) && this.a.equals(((y401) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
