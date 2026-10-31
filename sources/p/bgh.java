package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bgh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jd6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgh(jd6 jd6Var, byte b) {
        super(1);
        this.a = b;
        this.b = jd6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jd6 jd6Var = this.b;
        switch (b) {
            case 0:
                return new m441(new hff((yfh) obj, jd6Var, (lnm) null, (byte) 7));
            case 1:
                yfh yfhVar = (yfh) obj;
                Boolean bool = yfhVar.c;
                String strB = ((vos0) jd6Var.f).b(o6p1.o(yfhVar));
                if ((2 & 4) != 0) {
                    strB = null;
                }
                return new zfh(bool, null, strB);
            default:
                ((qtr) obj).b(new f3(jd6Var, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}
