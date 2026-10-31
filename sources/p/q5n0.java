package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q5n0 implements s5n0 {
    public final String a;

    public q5n0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5n0) && this.a.equals(((q5n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
