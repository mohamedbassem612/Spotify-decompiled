package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lfv0 {
    public final boolean a;
    public final float b;
    public final boolean c;

    public lfv0(float f, boolean z, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfv0)) {
            return false;
        }
        lfv0 lfv0Var = (lfv0) obj;
        return this.a == lfv0Var.a && Float.compare(this.b, lfv0Var.b) == 0 && this.c == lfv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x0d.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
