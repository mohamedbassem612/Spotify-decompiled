package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class du1 {
    public final int a;
    public final int b;

    public /* synthetic */ du1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static mo20 a(du1 du1Var, w190[] w190VarArr) {
        return new mo20(du1Var.a + du1Var.b, w190VarArr);
    }

    public static lo20 b(du1 du1Var) {
        return new lo20(du1Var.a + du1Var.b, 1);
    }

    public static lo20 c() {
        return new lo20(0, 1);
    }

    public abstract Object d(int i);
}
