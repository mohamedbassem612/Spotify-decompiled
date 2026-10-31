package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lq00 implements rjc0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(mjc0 mjc0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (mjc0Var instanceof ljc0) {
                    ((iu30) obj).invoke(((ljc0) mjc0Var).a);
                }
                break;
            case 1:
                if (mjc0Var instanceof ljc0) {
                    ((iu30) obj).invoke(new eb30(((ljc0) mjc0Var).a));
                }
                break;
            case 2:
                if (mjc0Var instanceof ljc0) {
                    ((iu30) obj).invoke(new q660(((ljc0) mjc0Var).a));
                }
                break;
            default:
                ((xkc0) obj).e.invoke();
                break;
        }
    }
}
