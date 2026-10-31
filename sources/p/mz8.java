package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mz8 extends rin {
    public final long a;
    public final String b;
    public final lin c;
    public final min d;
    public final nin e;
    public final qin f;

    public mz8(long j, String str, lin linVar, min minVar, nin ninVar, qin qinVar) {
        this.a = j;
        this.b = str;
        this.c = linVar;
        this.d = minVar;
        this.e = ninVar;
        this.f = qinVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rin) {
            mz8 mz8Var = (mz8) ((rin) obj);
            if (this.a == mz8Var.a && this.b.equals(mz8Var.b) && this.c.equals(mz8Var.c) && this.d.equals(mz8Var.d)) {
                nin ninVar = mz8Var.e;
                nin ninVar2 = this.e;
                if (ninVar2 != null ? ninVar2.equals(ninVar) : ninVar == null) {
                    qin qinVar = mz8Var.f;
                    qin qinVar2 = this.f;
                    if (qinVar2 != null ? qinVar2.equals(qinVar) : qinVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        nin ninVar = this.e;
        int iHashCode2 = (iHashCode ^ (ninVar == null ? 0 : ninVar.hashCode())) * 1000003;
        qin qinVar = this.f;
        return iHashCode2 ^ (qinVar != null ? qinVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
