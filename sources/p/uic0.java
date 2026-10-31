package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uic0 extends eca {
    public int g;
    public int h;
    public boolean i;

    @Override // p.eca
    public final void a() {
        if (this.g == 0) {
            if (this.b > 0) {
                hhg1.n("Rounded corners are not supported in contiguous indeterminate animation.");
            } else {
                if (this.c.length >= 3) {
                    return;
                }
                hhg1.n("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
