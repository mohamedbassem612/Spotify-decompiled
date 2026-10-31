package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q451 implements s451 {
    public final String a;

    public q451(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q451) && this.a.equals(((q451) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
