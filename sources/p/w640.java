package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w640 implements d740 {
    public final boolean a;

    public w640(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w640) && this.a == ((w640) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
