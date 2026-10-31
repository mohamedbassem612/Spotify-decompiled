package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pz91 implements yz91 {
    public final String a;

    public pz91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz91) && u890.j(this.a, ((pz91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
