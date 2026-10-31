package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qnb implements snb {
    public final String a;
    public final int b;

    public qnb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnb)) {
            return false;
        }
        qnb qnbVar = (qnb) obj;
        return u890.j(this.a, qnbVar.a) && this.b == qnbVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
