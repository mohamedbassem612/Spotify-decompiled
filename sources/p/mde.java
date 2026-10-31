package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mde implements ode {
    public final String a;

    public mde(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mde) && this.a.equals(((mde) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
