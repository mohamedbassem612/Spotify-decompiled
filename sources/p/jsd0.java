package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jsd0 extends psd0 {
    public final String a;

    public jsd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsd0) && u890.j(this.a, ((jsd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
