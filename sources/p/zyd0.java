package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zyd0 implements azd0 {
    public final String a;

    public zyd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyd0) && this.a.equals(((zyd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
