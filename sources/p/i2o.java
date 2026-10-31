package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i2o {
    public final String a;

    public i2o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2o) && u890.j(this.a, ((i2o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
