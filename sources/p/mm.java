package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mm {
    public final boolean a;
    public final spq0 b;
    public final spq0 c;

    public mm(boolean z, spq0 spq0Var, spq0 spq0Var2) {
        this.a = z;
        this.b = spq0Var;
        this.c = spq0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return this.a == mmVar.a && this.b.equals(mmVar.b) && this.c.equals(mmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
