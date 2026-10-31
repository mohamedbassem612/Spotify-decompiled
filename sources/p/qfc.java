package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qfc {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public qfc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfc)) {
            return false;
        }
        qfc qfcVar = (qfc) obj;
        return this.a == qfcVar.a && this.b == qfcVar.b && this.c == qfcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
