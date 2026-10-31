package p;

import android.app.Activity;
import android.content.Intent;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hb2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb2(rwj rwjVar, byte b) {
        super(3);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                hux huxVar = cnx.c;
                int i = (iIntValue & 14) | (cnx.d << 3);
                this.b.h((nbh) obj, huxVar, null, (b0k) obj2, i);
                return rih1Var;
            case 1:
                int iIntValue2 = ((Number) obj3).intValue();
                hux huxVar2 = xtx.c;
                int i2 = (iIntValue2 & 14) | (xtx.d << 3);
                this.b.h((nbh) obj, huxVar2, null, (b0k) obj2, i2);
                return rih1Var;
            default:
                kb2 kb2Var = (kb2) obj;
                tqw tqwVar = (tqw) obj3;
                rwj rwjVar = this.b;
                ewo ewoVar = (ewo) rwjVar.g;
                lzn0 lzn0Var = (lzn0) rwjVar.e;
                Activity activity = (Activity) rwjVar.d;
                int iOrdinal = ((jb2) obj2).ordinal();
                if (iOrdinal == 0) {
                    we2 we2Var = kb2Var.a;
                    Intent intent = kb2Var.b;
                    tv80 tv80VarD = cvl1.d(tqwVar);
                    if (lzn0Var.j(activity)) {
                        lzn0Var.e();
                    } else {
                        ((a1r0) ewoVar.get()).l();
                    }
                    int i3 = AgeAssuranceWebViewActivity.n1;
                    activity.startActivity(sj1.t(activity, we2Var, tv80VarD, intent));
                    return rih1Var;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        z710.d((z710) rwjVar.f, "https://support.spotify.com/article/age-restricted-content-age-check/", false, 6);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                if (lzn0Var.j(activity)) {
                    lzn0Var.e();
                    return rih1Var;
                }
                ((a1r0) ewoVar.get()).l();
                return rih1Var;
        }
    }
}
