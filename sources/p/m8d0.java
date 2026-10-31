package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class m8d0 {
    public static final l8d0 Companion = new l8d0();
    public final boolean a;

    public /* synthetic */ m8d0(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8d0) && this.a == ((m8d0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public m8d0() {
        this.a = false;
    }
}
