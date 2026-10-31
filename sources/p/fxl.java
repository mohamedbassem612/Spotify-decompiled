package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fxl {
    public final exl a;

    public fxl(exl exlVar) {
        this.a = exlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxl) && this.a.equals(((fxl) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
