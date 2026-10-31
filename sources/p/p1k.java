package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p1k implements iu30 {
    public final /* synthetic */ byte a;
    public final kf30 b;

    public /* synthetic */ p1k(kf30 kf30Var, byte b) {
        this.a = b;
        this.b = kf30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kf30 kf30Var = this.b;
        switch (b) {
            case 0:
                return ((fg5) obj).F(kf30Var);
            default:
                kf30 kf30Var2 = (kf30) obj;
                return Boolean.valueOf(!kf30Var2.a.c() && kf30Var2.b().equals(kf30Var));
        }
    }
}
