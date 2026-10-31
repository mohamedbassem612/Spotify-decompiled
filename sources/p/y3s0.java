package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y3s0 implements e4s0 {
    public final String a;

    public y3s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3s0) && this.a.equals(((y3s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
