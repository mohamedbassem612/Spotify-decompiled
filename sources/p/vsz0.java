package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vsz0 {
    public final String a;
    public final String b;

    public vsz0(String str) {
        this.a = str;
        this.b = str.concat(":ratings");
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsz0) && u890.j(this.a, ((vsz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
