package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tyl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tyl1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fjk0 fjk0Var = (fjk0) obj2;
                y4m1 y4m1Var = (y4m1) fjk0Var.f;
                fn31.T(y4m1Var.a, y4m1Var.b, 0, new x4m1(y4m1Var, (String) fjk0Var.e, zBooleanValue, (lnm) null, (byte) 1), 2);
                break;
            case 1:
                ((o0i) obj2).d.A();
                break;
            default:
                ((rim1) obj2).d.set(((Boolean) obj).booleanValue());
                break;
        }
        return rih1Var;
    }
}
