package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eqf0 implements gqf0 {
    public final String a;

    public eqf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqf0) && this.a.equals(((eqf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
