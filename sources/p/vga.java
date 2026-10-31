package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vga {
    public final String a;
    public final int b;
    public final zax c;

    public vga(String str) {
        zax zaxVar = new zax(63, null, null);
        this.a = str;
        this.b = 1;
        this.c = zaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vga)) {
            return false;
        }
        vga vgaVar = (vga) obj;
        return this.a.equals(vgaVar.a) && this.b == vgaVar.b && this.c.equals(vgaVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + cy30.f(cy30.f((this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31, 120L, 31), 2L, 961);
    }
}
