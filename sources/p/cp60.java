package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cp60 {
    public final boolean a;
    public final boolean b;
    public final l2e c;
    public final ice0 d;

    public cp60(boolean z, boolean z2, l2e l2eVar, ice0 ice0Var) {
        this.a = z;
        this.b = z2;
        this.c = l2eVar;
        this.d = ice0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp60)) {
            return false;
        }
        cp60 cp60Var = (cp60) obj;
        return this.a == cp60Var.a && this.b == cp60Var.b && u890.j(this.c, cp60Var.c) && this.d == cp60Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
