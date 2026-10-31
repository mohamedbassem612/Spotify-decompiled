package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vxy {
    public final yxy a;
    public final ayy b;
    public final boolean c;

    public vxy(yxy yxyVar, ayy ayyVar, zxy zxyVar, boolean z) {
        this.a = yxyVar;
        this.b = ayyVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxy)) {
            return false;
        }
        vxy vxyVar = (vxy) obj;
        return this.a.equals(vxyVar.a) && this.b == vxyVar.b && u890.j((Object) null, (Object) null) && this.c == vxyVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((xxy.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961);
    }
}
