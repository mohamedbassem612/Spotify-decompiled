package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qan {
    public final long a;
    public final long b;
    public final int c;
    public final san d;

    public qan(long j, long j2, int i, san sanVar) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = sanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qan)) {
            return false;
        }
        qan qanVar = (qan) obj;
        return this.a == qanVar.a && this.b == qanVar.b && this.c == qanVar.c && this.d.equals(qanVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31);
    }
}
