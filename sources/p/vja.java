package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vja {
    public final String a;
    public final String b;

    public vja(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vja)) {
            return false;
        }
        vja vjaVar = (vja) obj;
        return this.a.equals(vjaVar.a) && this.b.equals(vjaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
