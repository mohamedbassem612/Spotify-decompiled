package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q6t implements s6t {
    public final String a;

    public q6t(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6t) && u890.j(this.a, ((q6t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
