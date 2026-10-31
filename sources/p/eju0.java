package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eju0 implements kju0 {
    public final String a;

    public eju0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eju0) && this.a.equals(((eju0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
