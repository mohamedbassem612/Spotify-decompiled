package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zby {
    public final vby a;
    public final boolean b;
    public final int c;

    public zby(vby vbyVar, vby0 vby0Var, boolean z, int i) {
        this.a = vbyVar;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zby)) {
            return false;
        }
        zby zbyVar = (zby) obj;
        return this.a.equals(zbyVar.a) && u890.j((Object) null, (Object) null) && this.b == zbyVar.b && this.c == zbyVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(((this.a.hashCode() * 31) + 0) * 31, 31, this.b);
    }
}
