package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rk20 {
    public final String a;

    public rk20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk20) && u890.j(this.a, ((rk20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
