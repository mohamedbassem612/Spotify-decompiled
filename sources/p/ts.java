package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ts {
    public final ss a;
    public final boolean b;
    public final boolean c;

    public ts(ss ssVar, boolean z) {
        this.a = ssVar;
        this.b = z;
        this.c = !z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts)) {
            return false;
        }
        ts tsVar = (ts) obj;
        return this.a.equals(tsVar.a) && this.b == tsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
