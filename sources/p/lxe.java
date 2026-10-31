package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxe implements nye {
    public final String a;
    public final String b;

    public lxe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxe)) {
            return false;
        }
        lxe lxeVar = (lxe) obj;
        return u890.j(this.a, lxeVar.a) && this.b.equals(lxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
