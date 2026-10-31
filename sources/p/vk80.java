package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vk80 implements vzq0 {
    public final erl1 b;
    public final wat c;

    public vk80(erl1 erl1Var, wat watVar) {
        this.b = erl1Var;
        this.c = watVar;
    }

    public final float a() {
        erl1 erl1Var = this.b;
        wat watVar = this.c;
        return watVar.M0(erl1Var.d(watVar));
    }

    public final float b(flb0 flb0Var) {
        erl1 erl1Var = this.b;
        wat watVar = this.c;
        return watVar.M0(erl1Var.b(watVar, flb0Var));
    }

    public final float c(flb0 flb0Var) {
        erl1 erl1Var = this.b;
        wat watVar = this.c;
        return watVar.M0(erl1Var.a(watVar, flb0Var));
    }

    public final float d() {
        erl1 erl1Var = this.b;
        wat watVar = this.c;
        return watVar.M0(erl1Var.c(watVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk80)) {
            return false;
        }
        vk80 vk80Var = (vk80) obj;
        return u890.j(this.b, vk80Var.b) && u890.j(this.c, vk80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.b + ", density=" + this.c + ")";
    }
}
