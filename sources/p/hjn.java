package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hjn {
    public final float a;
    public final float b;
    public final boolean c;

    public hjn(float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjn)) {
            return false;
        }
        hjn hjnVar = (hjn) obj;
        return Float.compare(this.a, hjnVar.a) == 0 && Float.compare(this.b, hjnVar.b) == 0 && this.c == hjnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
