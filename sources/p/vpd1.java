package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class vpd1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(250, ngv.d);
    }

    public static final ux a(wx wxVar, int i, int i2) {
        long j = i2;
        if (j < 0) {
            j = 0;
        }
        long j2 = j + 1;
        if (j2 > 2147483647L) {
            j2 = 2147483647L;
        }
        int i3 = (int) j2;
        if (wxVar.equals(vx.a)) {
            return new ux(i, 1);
        }
        if (!(wxVar instanceof ux)) {
            eg.o();
            return null;
        }
        ux uxVar = (ux) wxVar;
        int i4 = uxVar.a;
        if (i4 != i) {
            return new ux(i, 1);
        }
        int i5 = uxVar.b + 1;
        return i5 <= i3 ? new ux(i4, i5) : uxVar;
    }
}
