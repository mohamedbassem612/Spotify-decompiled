package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kle extends am70 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final am70[] f;

    public kle(String str, boolean z, boolean z2, String[] strArr, am70[] am70VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = am70VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kle.class != obj.getClass()) {
            return false;
        }
        kle kleVar = (kle) obj;
        return this.c == kleVar.c && this.d == kleVar.d && this.b.equals(kleVar.b) && Arrays.equals(this.e, kleVar.e) && Arrays.equals(this.f, kleVar.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
