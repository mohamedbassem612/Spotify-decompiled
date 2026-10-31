package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t1h implements v1h {
    public final boolean a;
    public final Integer b;
    public final e1h c;
    public final tv80 d;
    public final boolean e;

    public t1h(boolean z, Integer num, e1h e1hVar, tv80 tv80Var, boolean z2) {
        this.a = z;
        this.b = num;
        this.c = e1hVar;
        this.d = tv80Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1h)) {
            return false;
        }
        t1h t1hVar = (t1h) obj;
        return this.a == t1hVar.a && u890.j(this.b, t1hVar.b) && this.c.equals(t1hVar.c) && u890.j(this.d, t1hVar.d) && this.e == t1hVar.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
    }
}
