package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xfn implements ugn {
    public final String a;

    public xfn(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfn) && this.a.equals(((xfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
