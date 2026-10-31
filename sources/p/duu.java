package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class duu {
    public final String a;

    public duu(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duu) && u890.j(this.a, ((duu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
