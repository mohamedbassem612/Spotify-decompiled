package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sod1 {
    public final String a;

    public sod1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sod1) && this.a.equals(((sod1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
