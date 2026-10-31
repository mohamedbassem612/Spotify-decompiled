package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bpy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ loy b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ wh1 d;
    public final /* synthetic */ ycm e;
    public final /* synthetic */ j6q f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bpy(loy loyVar, d0r d0rVar, wh1 wh1Var, ycm ycmVar, j6q j6qVar, String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = loyVar;
        this.c = d0rVar;
        this.d = wh1Var;
        this.e = ycmVar;
        this.f = j6qVar;
        this.g = str;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                wpb1.d(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                wpb1.l(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
