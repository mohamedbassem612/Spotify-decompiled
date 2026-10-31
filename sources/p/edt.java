package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class edt {
    public final cdt a;
    public final cdt b;
    public final cdt c;
    public final cdt d;
    public final cdt e;

    public edt() {
        cdt cdtVar = fdt.a;
        cdt cdtVar2 = fdt.b;
        cdt cdtVar3 = fdt.c;
        cdt cdtVar4 = fdt.d;
        cdt cdtVar5 = fdt.e;
        this.a = cdtVar;
        this.b = cdtVar2;
        this.c = cdtVar3;
        this.d = cdtVar4;
        this.e = cdtVar5;
    }

    public final cdt a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edt)) {
            return false;
        }
        edt edtVar = (edt) obj;
        return u890.j(this.a, edtVar.a) && u890.j(this.b, edtVar.b) && u890.j(this.c, edtVar.c) && u890.j(this.d, edtVar.d) && u890.j(this.e, edtVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DepthEffectLevels(level1=" + this.a + ", level2=" + this.b + ", level3=" + this.c + ", level4=" + this.d + ", level5=" + this.e + ")";
    }
}
