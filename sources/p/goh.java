package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class goh implements iph {
    public final vgh a;

    public goh(vgh vghVar) {
        this.a = vghVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goh) && this.a.equals(((goh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
