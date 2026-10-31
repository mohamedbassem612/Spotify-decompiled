package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vto {
    public final String a;
    public final String b;

    public vto(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vto)) {
            return false;
        }
        vto vtoVar = (vto) obj;
        return this.a.equals(vtoVar.a) && u890.j(this.b, vtoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
