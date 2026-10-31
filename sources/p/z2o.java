package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z2o {
    public final String a;
    public final int b;

    public z2o(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2o)) {
            return false;
        }
        z2o z2oVar = (z2o) obj;
        return this.a.equals(z2oVar.a) && this.b == z2oVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
