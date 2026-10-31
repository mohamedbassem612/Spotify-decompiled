package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bdx0 {
    public final Object a;

    public bdx0(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdx0) && this.a.equals(((bdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
