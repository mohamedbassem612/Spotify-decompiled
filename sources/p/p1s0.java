package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p1s0 implements s1s0 {
    public final String a;

    public p1s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1s0) && this.a.equals(((p1s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
