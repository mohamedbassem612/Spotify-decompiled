package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class adv implements cdv {
    public final fcv a;
    public final fcv b;
    public final gcv c;

    public adv(fcv fcvVar, fcv fcvVar2, gcv gcvVar) {
        this.a = fcvVar;
        this.b = fcvVar2;
        this.c = gcvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adv)) {
            return false;
        }
        adv advVar = (adv) obj;
        return this.a == advVar.a && this.b == advVar.b && this.c == advVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
