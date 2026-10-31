package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wsz0 {
    public final String a;
    public final String b;

    public wsz0(String str) {
        this.a = str;
        this.b = str.concat(":ratings");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsz0) && u890.j(this.a, ((wsz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
