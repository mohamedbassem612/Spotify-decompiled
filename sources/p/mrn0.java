package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mrn0 extends x2i1 {
    public final String a;

    public mrn0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrn0) && u890.j(this.a, ((mrn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
