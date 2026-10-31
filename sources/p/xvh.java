package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xvh implements yvh {
    public final String a;
    public final String b;

    public xvh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvh)) {
            return false;
        }
        xvh xvhVar = (xvh) obj;
        return this.a.equals(xvhVar.a) && this.b.equals(xvhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
