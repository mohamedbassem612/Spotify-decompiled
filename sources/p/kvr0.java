package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kvr0 extends pvr0 {
    public final String a;

    public kvr0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvr0) && u890.j(this.a, ((kvr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
