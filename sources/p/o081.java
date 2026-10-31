package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o081 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p081 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o081(p081 p081Var, byte b) {
        super(1);
        this.a = b;
        this.b = p081Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        p081 p081Var = this.b;
        switch (b) {
            case 0:
                m081 m081Var = (m081) obj;
                mr20 mr20VarU = rqt0.u(new g9i0(p081Var.d, m081Var.d, (byte) 3));
                Flowable flowable = p081Var.a;
                vbm[] vbmVarArr = q601.a;
                return new x010(mr20VarU, new kge(flowable), new dwf0(m081Var, lnmVar, (byte) 22), (byte) 1);
            case 1:
                m081 m081Var2 = (m081) obj;
                vgm vgmVar = p081Var.e;
                String str = m081Var2.d;
                boolean zA = vgm.a(vgmVar, str);
                return new n081(m081Var2.b, m081Var2.c, str, m081Var2.e, k081.a, c081.a, str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq"), f3o1.a, zA);
            default:
                ((qtr) obj).b(new k8y0(p081Var, lnmVar, (byte) 15));
                return rih1.a;
        }
    }
}
