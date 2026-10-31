package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pxe implements nye {
    public final String a;
    public final String b;

    public pxe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe)) {
            return false;
        }
        pxe pxeVar = (pxe) obj;
        return u890.j(this.a, pxeVar.a) && u890.j(this.b, pxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
