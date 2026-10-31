package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dfi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfi0(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                String str = ((mey0) obj).c;
                if (((wei0) el9Var.g).c) {
                    return str;
                }
                return null;
            default:
                String str2 = ((mey0) obj).c;
                if (((wei0) el9Var.g).a) {
                    return str2;
                }
                return null;
        }
    }
}
