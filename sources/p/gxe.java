package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxe implements nye {
    public final String a;
    public final String b;
    public final boolean c;

    public gxe(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxe)) {
            return false;
        }
        gxe gxeVar = (gxe) obj;
        return u890.j(this.a, gxeVar.a) && u890.j(this.b, gxeVar.b) && this.c == gxeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
