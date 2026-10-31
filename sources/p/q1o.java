package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q1o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s1o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1o(s1o s1oVar, byte b) {
        super(1);
        this.a = b;
        this.b = s1oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s1o s1oVar = this.b;
        switch (b) {
            case 0:
                i2o i2oVar = (i2o) obj;
                d0r d0rVar = s1oVar.f;
                return h5p1.s(d3p1.H(d0rVar, s1oVar.g, i2oVar), d3p1.H(d0rVar, s1oVar.h, i2oVar), d3p1.H(d0rVar, s1oVar.i, i2oVar), new vd2(4, (lnm) null, (byte) 11));
            default:
                ((qtr) obj).b(new lu(s1oVar, (lnm) null, (byte) 19));
                return rih1.a;
        }
    }
}
