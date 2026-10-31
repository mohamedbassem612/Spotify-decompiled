package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hgl implements kgl {
    public final int a;
    public final String b;

    public hgl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgl)) {
            return false;
        }
        hgl hglVar = (hgl) obj;
        return this.a == hglVar.a && this.b.equals(hglVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
