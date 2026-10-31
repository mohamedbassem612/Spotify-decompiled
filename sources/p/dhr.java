package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dhr implements ehr {
    public final String a;

    public dhr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhr) && u890.j(this.a, ((dhr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
