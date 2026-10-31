package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jym0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jym0(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((mym0) ((yfc0) obj).b).d.c(i2, i);
                break;
            case 1:
                ((ez81) ((w360) obj).b).d.c(i2, i);
                break;
            default:
                n3d1 n3d1Var = (n3d1) obj;
                boolean z2 = true;
                if (n3d1Var.i != i2) {
                    n3d1Var.i = i2;
                    z = true;
                } else {
                    z = false;
                }
                if (n3d1Var.h != i) {
                    n3d1Var.h = i;
                } else {
                    z2 = z;
                }
                if (z2) {
                    n3d1Var.e();
                }
                break;
        }
    }
}
