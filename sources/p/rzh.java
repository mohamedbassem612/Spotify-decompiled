package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rzh {
    public final int a;
    public final Integer b;
    public final dlb c;

    public rzh(int i, Integer num, dlb dlbVar) {
        this.a = i;
        this.b = num;
        this.c = dlbVar;
    }

    public final dlb a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzh)) {
            return false;
        }
        rzh rzhVar = (rzh) obj;
        return this.a == rzhVar.a && u890.j(this.b, rzhVar.b) && this.c.equals(rzhVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
