package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uz91 implements yz91 {
    public final String a;

    public uz91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz91) && u890.j(this.a, ((uz91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
