package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xiz {
    public final j9a a;
    public final ziz b;
    public final ziz c;

    public xiz(j9a j9aVar, ziz zizVar, ziz zizVar2) {
        this.a = j9aVar;
        this.b = zizVar;
        this.c = zizVar2;
    }

    public final ziz a() {
        return this.b;
    }

    public final ziz b() {
        return this.c;
    }

    public final j9a c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiz)) {
            return false;
        }
        xiz xizVar = (xiz) obj;
        return this.a.equals(xizVar.a) && this.b.equals(xizVar.b) && this.c.equals(xizVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
