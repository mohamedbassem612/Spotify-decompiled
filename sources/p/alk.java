package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class alk extends vlk {
    public final String a;
    public final tv80 b;
    public final long c;

    public alk(long j, String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alk)) {
            return false;
        }
        alk alkVar = (alk) obj;
        return u890.j(this.a, alkVar.a) && u890.j(this.b, alkVar.b) && this.c == alkVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
