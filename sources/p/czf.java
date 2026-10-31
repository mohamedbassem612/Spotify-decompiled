package p;

import java.util.zip.Checksum;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class czf extends t5 {
    public final Checksum c;

    public czf(dzf dzfVar, Checksum checksum) {
        checksum.getClass();
        this.c = checksum;
    }

    @Override // p.bmq0
    public final wt50 C() {
        return new vt50((int) this.c.getValue());
    }

    @Override // p.t5
    public final void n0(byte[] bArr, int i) {
        this.c.update(bArr, 0, i);
    }
}
