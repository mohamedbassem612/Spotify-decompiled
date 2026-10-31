package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class agf0 {
    public static final zff0 Companion = new zff0();
    public final boolean a;

    public /* synthetic */ agf0(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            o6p1.t(i, 1, yff0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agf0) && this.a == ((agf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public agf0(boolean z) {
        this.a = z;
    }
}
