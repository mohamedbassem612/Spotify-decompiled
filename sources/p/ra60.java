package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ra60 {
    public final String a;
    public final boolean b;

    public ra60(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra60)) {
            return false;
        }
        ra60 ra60Var = (ra60) obj;
        return this.a.equals(ra60Var.a) && this.b == ra60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
