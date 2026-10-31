package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class wmg {
    public static final vmg Companion = new vmg();
    public final boolean a;

    public /* synthetic */ wmg(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            o6p1.t(i, 1, umg.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmg) && this.a == ((wmg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
