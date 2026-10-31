package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q1j1 implements s1j1 {
    public final String a;

    public q1j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1j1) && this.a.equals(((q1j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
