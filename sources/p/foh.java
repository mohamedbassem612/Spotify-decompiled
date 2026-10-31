package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class foh implements iph {
    public final ijh a;

    public foh(ijh ijhVar) {
        this.a = ijhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof foh) && this.a.equals(((foh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
