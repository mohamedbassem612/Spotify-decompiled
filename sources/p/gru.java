package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gru {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ gru(int i, boolean z) {
        this(false, (i & 2) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gru)) {
            return false;
        }
        gru gruVar = (gru) obj;
        return this.a == gruVar.a && this.b == gruVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public gru(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
