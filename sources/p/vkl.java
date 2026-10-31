package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vkl implements zkl {
    public final int a;
    public final int b;
    public final String c;

    public vkl(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkl)) {
            return false;
        }
        vkl vklVar = (vkl) obj;
        return this.a == vklVar.a && this.b == vklVar.b && this.c.equals(vklVar.c);
    }

    public final int hashCode() {
        return cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
