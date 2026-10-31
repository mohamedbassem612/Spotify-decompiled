package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dg9 extends qg9 {
    public final String a;

    public dg9(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg9) && this.a.equals(((dg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
