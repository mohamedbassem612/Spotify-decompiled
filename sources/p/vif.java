package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vif {
    public final int a;
    public final int b;
    public final boolean c;

    public vif(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static vif a(vif vifVar, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = vifVar.a;
        }
        if ((i3 & 2) != 0) {
            i2 = vifVar.b;
        }
        if ((i3 & 4) != 0) {
            z = vifVar.c;
        }
        return new vif(i, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vif)) {
            return false;
        }
        vif vifVar = (vif) obj;
        return this.a == vifVar.a && this.b == vifVar.b && this.c == vifVar.c;
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        int i2 = this.b;
        return Boolean.hashCode(this.c) + ((iC + (i2 != 0 ? l1d.C(i2) : 0)) * 31);
    }
}
