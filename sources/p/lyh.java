package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lyh {
    public final Object a;
    public final bgd b;
    public final xu30 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ lyh(Object obj, bgd bgdVar, xu30 xu30Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : bgdVar, (i & 4) != 0 ? null : xu30Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static lyh a(lyh lyhVar, bgd bgdVar, Throwable th, int i) {
        Object obj = lyhVar.a;
        if ((i & 2) != 0) {
            bgdVar = lyhVar.b;
        }
        bgd bgdVar2 = bgdVar;
        xu30 xu30Var = lyhVar.c;
        Object obj2 = lyhVar.d;
        if ((i & 16) != 0) {
            th = lyhVar.e;
        }
        return new lyh(obj, bgdVar2, xu30Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyh)) {
            return false;
        }
        lyh lyhVar = (lyh) obj;
        return u890.j(this.a, lyhVar.a) && u890.j(this.b, lyhVar.b) && u890.j(this.c, lyhVar.c) && u890.j(this.d, lyhVar.d) && u890.j(this.e, lyhVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        bgd bgdVar = this.b;
        int iHashCode2 = (iHashCode + (bgdVar == null ? 0 : bgdVar.hashCode())) * 31;
        xu30 xu30Var = this.c;
        int iHashCode3 = (iHashCode2 + (xu30Var == null ? 0 : xu30Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public lyh(Object obj, bgd bgdVar, xu30 xu30Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = bgdVar;
        this.c = xu30Var;
        this.d = obj2;
        this.e = th;
    }
}
