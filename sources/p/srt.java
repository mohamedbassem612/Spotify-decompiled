package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class srt implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ srt(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((wrt) obj3).invoke(Boolean.valueOf(((urt) obj2).a()));
                break;
            case 1:
                yqj0 yqj0Var = (yqj0) obj2;
                yge0 yge0Var = (yge0) obj3;
                if (x74.j((dg30) yge0Var.b, "android.permission.RECORD_AUDIO") != 0) {
                    yge0Var.k(yqj0Var);
                } else {
                    yqj0Var.invoke(Boolean.TRUE);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    hma1 hma1VarEdit = ((dma1) ((yge0) obj3).c).edit();
                    hma1VarEdit.a(xqj0.a, false);
                    hma1VarEdit.g();
                }
                ((iu30) obj2).invoke(bool);
                break;
        }
    }
}
