package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mi91 extends mod {
    public final int e;
    public final d7e f;
    public final Integer g;

    public mi91(int i, d7e d7eVar, Integer num) {
        this.e = i;
        this.f = d7eVar;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi91)) {
            return false;
        }
        mi91 mi91Var = (mi91) obj;
        return this.e == mi91Var.e && this.f.equals(mi91Var.f) && u890.j(this.g, mi91Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + (Integer.hashCode(this.e) * 31)) * 31;
        Integer num = this.g;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
