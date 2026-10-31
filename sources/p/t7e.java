package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t7e extends x7e {
    public final int a;
    public final kfe b;
    public final boolean c;
    public final rh90 d;

    public t7e(int i, kfe kfeVar, rh90 rh90Var, boolean z) {
        this.a = i;
        this.b = kfeVar;
        this.c = z;
        this.d = rh90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7e)) {
            return false;
        }
        t7e t7eVar = (t7e) obj;
        return this.a == t7eVar.a && this.b == t7eVar.b && this.c == t7eVar.c && u890.j(this.d, t7eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }
}
