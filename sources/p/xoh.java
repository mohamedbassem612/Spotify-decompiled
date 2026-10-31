package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xoh implements iph {
    public final lnh a;

    public xoh(lnh lnhVar) {
        this.a = lnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoh) && this.a.equals(((xoh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
