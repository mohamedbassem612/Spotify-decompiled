package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dnd extends ind {
    public final String a;
    public final cnd b;
    public final String c;

    public dnd(String str, cnd cndVar, String str2) {
        this.a = str;
        this.b = cndVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnd)) {
            return false;
        }
        dnd dndVar = (dnd) obj;
        return this.a.equals(dndVar.a) && this.b.equals(dndVar.b) && this.c.equals(dndVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
