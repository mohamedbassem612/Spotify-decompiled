package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yen implements ugn {
    public final String a;

    public yen(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yen) && this.a.equals(((yen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
