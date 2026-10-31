package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class evu0 implements gvu0 {
    public final String a;

    public evu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evu0) && this.a.equals(((evu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
