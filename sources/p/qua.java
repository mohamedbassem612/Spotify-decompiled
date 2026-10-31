package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qua extends am70 {
    public final byte[] b;

    public qua(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qua.class != obj.getClass()) {
            return false;
        }
        qua quaVar = (qua) obj;
        return this.a.equals(quaVar.a) && Arrays.equals(this.b, quaVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + cy30.d(527, 31, this.a);
    }
}
