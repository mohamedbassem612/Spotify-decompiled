package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oci1 implements vci1 {
    public final String a;

    public oci1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oci1) && u890.j(this.a, ((oci1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
