package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zx8 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wen0 b;

    public /* synthetic */ zx8(wen0 wen0Var, byte b) {
        this.a = b;
        this.b = wen0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.l(obj);
                break;
            default:
                Float f = new Float(((Number) obj).floatValue());
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, f);
                break;
        }
        return rih1Var;
    }
}
