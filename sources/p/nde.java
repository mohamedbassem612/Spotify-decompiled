package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nde implements ode {
    public final String a;

    public nde(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nde) && this.a.equals(((nde) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
