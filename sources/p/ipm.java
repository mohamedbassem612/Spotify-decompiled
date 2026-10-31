package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ipm {
    public final nvm a;
    public final lqm b;
    public final Object c;

    public ipm(nvm nvmVar, lqm lqmVar, Object obj) {
        this.a = nvmVar;
        this.b = lqmVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipm)) {
            return false;
        }
        ipm ipmVar = (ipm) obj;
        return u890.j(this.a, ipmVar.a) && u890.j(this.b, ipmVar.b) && u890.j(this.c, ipmVar.c);
    }

    public final int hashCode() {
        return e331.b(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
