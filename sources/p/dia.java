package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dia implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final eia d;

    public dia(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, eia eiaVar) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = eiaVar;
    }

    public final eia a() {
        return this.d;
    }

    public final n900 b() {
        return this.c;
    }

    public final i3i0 c() {
        return this.a;
    }

    public final xcu0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dia)) {
            return false;
        }
        dia diaVar = (dia) obj;
        return this.a.equals(diaVar.a) && this.b.equals(diaVar.b) && this.c.equals(diaVar.c) && this.d.equals(diaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
