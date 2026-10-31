package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g2r {
    public final int a;
    public final int b;
    public final int c;
    public final byte d;
    public final l3p1 e;
    public final DataSectionType f;

    /* JADX WARN: Multi-variable type inference failed */
    public g2r(int i, int i2, int i3, int i4, l3p1 l3p1Var, DataSectionType dataSectionType) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = l3p1Var;
        this.f = dataSectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2r)) {
            return false;
        }
        g2r g2rVar = (g2r) obj;
        return this.a == g2rVar.a && this.b == g2rVar.b && this.c == g2rVar.c && this.d == g2rVar.d && this.e.equals(g2rVar.e) && this.f == g2rVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31)) * 31);
    }
}
