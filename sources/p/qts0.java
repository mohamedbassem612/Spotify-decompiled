package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qts0 implements tts0 {
    public final String a;
    public final long b;

    public qts0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qts0)) {
            return false;
        }
        qts0 qts0Var = (qts0) obj;
        return this.a.equals(qts0Var.a) && this.b == qts0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
