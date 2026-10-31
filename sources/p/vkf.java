package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vkf {
    public final String a;
    public final ugf b;
    public final boolean c;
    public final d4f d;

    public vkf(String str, ugf ugfVar, boolean z, d4f d4fVar) {
        this.a = str;
        this.b = ugfVar;
        this.c = z;
        this.d = d4fVar;
    }

    public static vkf a(vkf vkfVar, ugf ugfVar, boolean z, d4f d4fVar, int i) {
        String str = vkfVar.a;
        if ((i & 2) != 0) {
            ugfVar = vkfVar.b;
        }
        if ((i & 4) != 0) {
            z = vkfVar.c;
        }
        vkfVar.getClass();
        return new vkf(str, ugfVar, z, d4fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkf)) {
            return false;
        }
        vkf vkfVar = (vkf) obj;
        return u890.j(this.a, vkfVar.a) && this.b == vkfVar.b && this.c == vkfVar.c && this.d.equals(vkfVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
