package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.Single;
import java.util.function.Function;
import javax.net.ssl.HostnameVerifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d4k implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4k(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new c4k(((StoryCard) obj2).getId());
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                m900 m900Var = (m900) obj2;
                return Single.defer(new xf0(m900Var, mmr0Var, (byte) 3)).map(new t7y(m900Var, mmr0Var, (byte) 7)).doFinally(new bm0(m900Var, mmr0Var, (byte) 23)).cache();
            case 2:
                HostnameVerifier hostnameVerifier = (dc30) obj;
                zyp0 zyp0Var = (zyp0) obj2;
                hostnameVerifier.getClass();
                if (hostnameVerifier != zyp0Var.u) {
                    zyp0Var.E = null;
                }
                zyp0Var.u = hostnameVerifier;
                return zyp0Var;
            case 3:
                omd omdVar = (omd) obj;
                s940 s940Var = (s940) obj2;
                return d5p1.t(new evz(new ht20(s940Var.d.c(yto.u(omdVar)), new xtz(s940Var, omdVar, (lnm) null, (byte) 8)), omdVar, (byte) 23), s940Var.e, ey71.a, new pmd(omdVar, false, true));
            case 4:
                fqt0 fqt0VarW = ((bjx) obj2).W((rpt0) obj);
                spt0 spt0Var = new spt0();
                spt0Var.a = fqt0VarW;
                return spt0Var;
            default:
                String str = (String) obj;
                vjd0 vjd0Var = (vjd0) obj2;
                return d5p1.r(hu20.e(new m441(new rzu(vjd0Var, str, (lnm) null, (byte) 28)), new qd0((byte) 27, vjd0Var, str, (lnm) null)), vjd0Var.f, new alb1(5000L, 5000L), 1);
        }
    }
}
