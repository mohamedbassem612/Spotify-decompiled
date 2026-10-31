package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xen implements ugn {
    public final String a;

    public xen(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xen) && this.a.equals(((xen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
