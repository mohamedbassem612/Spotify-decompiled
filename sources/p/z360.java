package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z360 {
    public static final a1i b = new a1i(oq50.t, gsh.Y);
    public final String a;

    public z360(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z360) && u890.j(this.a, ((z360) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }
}
