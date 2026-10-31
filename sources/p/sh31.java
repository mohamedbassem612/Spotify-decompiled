package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sh31 extends x6 {
    public int c;
    public int d;
    public final /* synthetic */ th31 e;

    public sh31(th31 th31Var) {
        this.e = th31Var;
        this.c = th31Var.d;
        this.d = th31Var.c;
    }

    @Override // p.x6
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = (byte) 2;
            return;
        }
        th31 th31Var = this.e;
        Object[] objArr = th31Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = (byte) 1;
        this.d = (i2 + 1) % th31Var.b;
        this.c = i - 1;
    }
}
