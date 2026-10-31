package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface fx30 extends mr20 {
    static /* synthetic */ mr20 e(fx30 fx30Var, o8n o8nVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            o8nVar = o6x.a;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return fx30Var.b(o8nVar, i, i2);
    }

    mr20 b(o8n o8nVar, int i, int i2);
}
