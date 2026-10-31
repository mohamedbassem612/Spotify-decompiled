package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class wkm {
    public static final vkm Companion = new vkm();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ wkm(int i, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, ukm.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkm)) {
            return false;
        }
        wkm wkmVar = (wkm) obj;
        return this.a == wkmVar.a && this.b == wkmVar.b && this.c == wkmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
