package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class elg extends dlg {
    public final int a;
    public final String b;

    public elg(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elg)) {
            return false;
        }
        elg elgVar = (elg) obj;
        return this.a == elgVar.a && this.b.equals(elgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
