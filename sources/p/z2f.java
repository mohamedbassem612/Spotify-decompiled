package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z2f implements q3f {
    public final String a;
    public final apl b;
    public final long c;

    public z2f(String str, apl aplVar, long j) {
        this.a = str;
        this.b = aplVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2f)) {
            return false;
        }
        z2f z2fVar = (z2f) obj;
        return u890.j(this.a, z2fVar.a) && u890.j(this.b, z2fVar.b) && this.c == z2fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
