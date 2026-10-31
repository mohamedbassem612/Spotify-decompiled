package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ab61 {
    public static final xa61 Companion = new xa61();
    public final boolean a;

    public /* synthetic */ ab61(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab61) && this.a == ((ab61) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
