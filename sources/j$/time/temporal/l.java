package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class l implements k {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ l(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iG = temporal.g(ChronoField.DAY_OF_WEEK);
                if (iG == i) {
                    return temporal;
                }
                int i2 = iG - i;
                return temporal.b(i2 >= 0 ? 7 - i2 : -i2, ChronoUnit.DAYS);
            default:
                int iG2 = temporal.g(ChronoField.DAY_OF_WEEK);
                if (iG2 == i) {
                    return temporal;
                }
                int i3 = i - iG2;
                return temporal.c(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
        }
    }
}
