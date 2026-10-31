package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ckt implements dkt {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ ckt(int i) {
        this(false, (i & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckt)) {
            return false;
        }
        ckt cktVar = (ckt) obj;
        return this.a == cktVar.a && this.b == cktVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public ckt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
