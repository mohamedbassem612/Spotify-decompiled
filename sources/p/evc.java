package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class evc implements hvc {
    public final String a;
    public final int b;

    public evc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evc)) {
            return false;
        }
        evc evcVar = (evc) obj;
        return u890.j(this.a, evcVar.a) && this.b == evcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
