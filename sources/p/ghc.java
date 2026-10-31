package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ghc extends ohc {
    public final byte[] d;

    public ghc(byte[] bArr) {
        this.a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // p.ohc
    public byte b(int i) {
        return this.d[i];
    }

    @Override // p.ohc
    public void e(byte[] bArr, int i) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ohc) && size() == ((ohc) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof ghc)) {
                return obj.equals(this);
            }
            ghc ghcVar = (ghc) obj;
            int i = this.a;
            int i2 = ghcVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > ghcVar.size()) {
                    eg.e(size, size());
                    return false;
                }
                if (size > ghcVar.size()) {
                    StringBuilder sbR = cy30.r(size, "Ran off end of other: 0, ", ", ");
                    sbR.append(ghcVar.size());
                    throw new IllegalArgumentException(sbR.toString());
                }
                byte[] bArr = ghcVar.d;
                int iK = k() + size;
                int iK2 = k();
                int iK3 = ghcVar.k();
                while (iK2 < iK) {
                    if (this.d[iK2] == bArr[iK3]) {
                        iK2++;
                        iK3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p.ohc
    public byte f(int i) {
        return this.d[i];
    }

    public int k() {
        return 0;
    }

    @Override // p.ohc
    public int size() {
        return this.d.length;
    }
}
