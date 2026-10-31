package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hu7 {
    public final long a;
    public final boolean b;

    public hu7(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu7)) {
            return false;
        }
        hu7 hu7Var = (hu7) obj;
        return this.a == hu7Var.a && this.b == hu7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public /* synthetic */ hu7() {
        this(0L, false);
    }
}
