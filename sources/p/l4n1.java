package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class l4n1 implements vu30 {
    public final /* synthetic */ l811 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ o811 c;
    public final /* synthetic */ ff01 d;
    public final /* synthetic */ o811 e;
    public final /* synthetic */ o811 f;
    public final /* synthetic */ p811 g;
    public final /* synthetic */ p811 h;
    public final /* synthetic */ p811 i;

    public /* synthetic */ l4n1(l811 l811Var, long j, o811 o811Var, ff01 ff01Var, o811 o811Var2, o811 o811Var3, p811 p811Var, p811 p811Var2, p811 p811Var3) {
        this.a = l811Var;
        this.b = j;
        this.c = o811Var;
        this.d = ff01Var;
        this.e = o811Var2;
        this.f = o811Var3;
        this.g = p811Var;
        this.h = p811Var2;
        this.i = p811Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        long jLongValue = ((Long) obj2).longValue();
        ff01 ff01Var = this.d;
        if (iIntValue == 1) {
            l811 l811Var = this.a;
            if (l811Var.a) {
                k220.i("bad zip: zip64 extra repeated");
                return null;
            }
            l811Var.a = true;
            if (jLongValue < this.b) {
                k220.i("bad zip: zip64 extra too short");
                return null;
            }
            o811 o811Var = this.c;
            long jI = o811Var.a;
            if (jI == 4294967295L) {
                jI = ff01Var.i();
            }
            o811Var.a = jI;
            o811 o811Var2 = this.e;
            o811Var2.a = o811Var2.a == 4294967295L ? ff01Var.i() : 0L;
            o811 o811Var3 = this.f;
            o811Var3.a = o811Var3.a == 4294967295L ? ff01Var.i() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                k220.i("bad zip: NTFS extra too short");
                return null;
            }
            ff01Var.skip(4L);
            rrn1.G(ff01Var, (int) (jLongValue - 4), new k4n1(this.g, ff01Var, this.h, this.i));
        }
        return rih1.a;
    }
}
