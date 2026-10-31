package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u170 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u170(int i, Function0 function0) {
        this.a = (byte) 1;
        this.b = i;
        this.c = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                z170 z170Var = (z170) this.c;
                int i = this.b;
                z170Var.X.getClass();
                synchronized (z170Var) {
                    z170Var.Z0.remove(Integer.valueOf(i));
                }
                return rih1.a;
            case 1:
                return new kes(this.b, 0.0f, (Function0) this.c);
            case 2:
                a9a a9aVar = (a9a) this.c;
                return Integer.valueOf(((y9e1) a9aVar.e).b.d(this.b));
            default:
                ((z4e1) this.c).N1(this.b);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ u170(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ u170(z170 z170Var, int i, int i2) {
        this.a = (byte) 0;
        this.c = z170Var;
        this.b = i;
    }
}
