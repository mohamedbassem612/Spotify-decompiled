package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class htb implements ktb {
    public final bek0 a;

    public htb(bek0 bek0Var) {
        this.a = bek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htb) && this.a.equals(((htb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
