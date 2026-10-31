package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pdt extends rdt {
    public final String a;
    public final String b;
    public final boolean c;

    public pdt(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdt)) {
            return false;
        }
        pdt pdtVar = (pdt) obj;
        return u890.j(this.a, pdtVar.a) && u890.j(this.b, pdtVar.b) && this.c == pdtVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
