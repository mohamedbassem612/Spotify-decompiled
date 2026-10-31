package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ke31 {
    public final String a;

    public ke31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke31) && u890.j(this.a, ((ke31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
