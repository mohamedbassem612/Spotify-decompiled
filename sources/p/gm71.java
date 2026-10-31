package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gm71 extends im71 {
    public final int a;
    public final String b;

    public gm71(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm71)) {
            return false;
        }
        gm71 gm71Var = (gm71) obj;
        return this.a == gm71Var.a && this.b.equals(gm71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
