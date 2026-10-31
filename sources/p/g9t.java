package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g9t implements lov {
    public final int a;
    public final int b;

    public g9t(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        rf80.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p.lov
    public final void a(k4w k4wVar) {
        int iM = 0;
        for (int i = 0; i < this.a; i++) {
            int i2 = iM + 1;
            if (k4wVar.m() <= i2) {
                iM = k4wVar.m();
                break;
            }
            iM = qpn1.f(k4wVar.f((k4wVar.m() - i2) + (-1)), k4wVar.f(k4wVar.m() - i2)) ? iM + 2 : i2;
        }
        int iK = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = iK + 1;
            if (k4wVar.l() + i4 >= k4wVar.k()) {
                iK = k4wVar.k() - k4wVar.l();
                break;
            }
            iK = qpn1.f(k4wVar.f((k4wVar.l() + i4) + (-1)), k4wVar.f(k4wVar.l() + i4)) ? iK + 2 : i4;
        }
        k4wVar.e(k4wVar.l(), k4wVar.l() + iK);
        k4wVar.e(k4wVar.m() - iM, k4wVar.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9t)) {
            return false;
        }
        g9t g9tVar = (g9t) obj;
        return this.a == g9tVar.a && this.b == g9tVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
