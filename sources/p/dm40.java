package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dm40 {
    public final nvm a;
    public final lqm b;
    public final Integer c;

    public dm40(nvm nvmVar, lqm lqmVar, Integer num) {
        this.a = nvmVar;
        this.b = lqmVar;
        this.c = num;
    }

    public final lqm a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final nvm c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm40)) {
            return false;
        }
        dm40 dm40Var = (dm40) obj;
        return u890.j(this.a, dm40Var.a) && u890.j(this.b, dm40Var.b) && u890.j(this.c, dm40Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
