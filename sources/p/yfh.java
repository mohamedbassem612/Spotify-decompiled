package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yfh {
    public final lvm a;
    public final String b;
    public final Boolean c;

    public yfh(lvm lvmVar, String str, Boolean bool) {
        this.a = lvmVar;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfh)) {
            return false;
        }
        yfh yfhVar = (yfh) obj;
        return this.a.equals(yfhVar.a) && this.b.equals(yfhVar.b) && this.c.equals(yfhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.a.hashCode() * 31, 31, this.b);
    }
}
