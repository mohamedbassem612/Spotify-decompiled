package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xmf1 implements elc0 {
    public final agc0 a;
    public final nwf1 b;

    public xmf1(agc0 agc0Var, nwf1 nwf1Var) {
        this.a = agc0Var;
        this.b = nwf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.elc0
    public final Object a(imt imtVar, lnm lnmVar) {
        wmf1 wmf1Var;
        String str;
        if (lnmVar instanceof wmf1) {
            wmf1Var = (wmf1) lnmVar;
            int i = wmf1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wmf1Var.e = i - Integer.MIN_VALUE;
            } else {
                wmf1Var = new wmf1(this, (onm) lnmVar);
            }
        } else {
            wmf1Var = new wmf1(this, (onm) lnmVar);
        }
        Object obj = wmf1Var.c;
        int i2 = wmf1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            this.a.getClass();
            Single singleA = this.b.a(imtVar.a);
            wmf1Var.a = imtVar;
            wmf1Var.b = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
            wmf1Var.e = 1;
            Object objJ = fc11.j(singleA, wmf1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            obj = objJ;
            str = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wmf1Var.b;
            imtVar = wmf1Var.a;
            hm5.M(obj);
        }
        return new jmt(new iio(str), imtVar.c ? 2 : 1, (List) obj);
    }
}
