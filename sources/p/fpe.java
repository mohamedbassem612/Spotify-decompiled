package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fpe implements npe {
    public final String a;

    public fpe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpe) && this.a.equals(((fpe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
