package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pv7 {
    public final boolean a;
    public final String b;

    public pv7(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv7)) {
            return false;
        }
        pv7 pv7Var = (pv7) obj;
        return this.a == pv7Var.a && u890.j(this.b, pv7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
