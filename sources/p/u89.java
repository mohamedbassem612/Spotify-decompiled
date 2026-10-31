package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class u89 {
    public static final t89 Companion = new t89();
    public final boolean a;

    public /* synthetic */ u89(int i, boolean z) {
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
        return (obj instanceof u89) && this.a == ((u89) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public u89() {
        this.a = false;
    }
}
