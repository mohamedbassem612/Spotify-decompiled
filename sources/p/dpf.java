package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dpf {
    public final String a;
    public final long b;

    public dpf(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpf)) {
            return false;
        }
        dpf dpfVar = (dpf) obj;
        return u890.j(this.a, dpfVar.a) && this.b == dpfVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
