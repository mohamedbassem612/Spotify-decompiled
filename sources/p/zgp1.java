package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zgp1 extends ahp1 {
    @Override // p.ahp1
    public final byte b(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(gvg.l(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(fd21.h(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(47).length()), "Index > length: ", i, ", 47"));
    }

    @Override // p.ahp1
    public final byte c(int i) {
        return this.b[i];
    }

    @Override // p.ahp1
    public final int d() {
        return 47;
    }
}
