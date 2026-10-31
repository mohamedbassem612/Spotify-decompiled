package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f9t implements lov {
    public final int a;
    public final int b;

    public f9t(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        rf80.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p.lov
    public final void a(k4w k4wVar) {
        int iL = k4wVar.l();
        int i = this.b;
        int iK = iL + i;
        if (((iL ^ iK) & (i ^ iK)) < 0) {
            iK = k4wVar.k();
        }
        k4wVar.e(k4wVar.l(), Math.min(iK, k4wVar.k()));
        int iM = k4wVar.m();
        int i2 = this.a;
        int i3 = iM - i2;
        if (((i2 ^ iM) & (iM ^ i3)) < 0) {
            i3 = 0;
        }
        k4wVar.e(Math.max(0, i3), k4wVar.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9t)) {
            return false;
        }
        f9t f9tVar = (f9t) obj;
        return this.a == f9tVar.a && this.b == f9tVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
