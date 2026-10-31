package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ox1 implements is31, hj71 {
    public final Context a;

    public o3r a(z6h z6hVar, iu30 iu30Var) {
        jd11 jd11Var = rc11.a;
        return w3p1.k(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, fiu0.V0, new j4r(fiu0.d1), fiu0.X0), new l4r(new wlu(jd11Var.b(jo70.class)), 1, fiu0.Y0, new j4r(rku0.b), fiu0.Z0), new l4r(pwc0.b, 1, fiu0.a1, new j4r(rku0.d), fiu0.b1), new l4r(new xv00(jd11Var.b(fuj0.class)), 2, fiu0.N0, new j4r(rku0.e), fiu0.P0), new l4r(jd0.b, 2, fiu0.R0, new j4r(rku0.f), fiu0.T0), new pj0(iu30Var, this, z6hVar, (byte) 5));
    }

    public Intent f(Intent intent) {
        int i = AllboardingActivity.l1;
        Context context = this.a;
        context.getClass();
        return x2g0.z(context, EntryPoint.DEFAULT);
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        wa71 wa71Var;
        List listSingletonList;
        if (!k371Var.d.contains(vej0.a) || (wa71Var = k371Var.a) == null) {
            return null;
        }
        String string = k371Var.b.getString("messaging.share.image_url");
        if (string != null) {
            String str = wa71Var.a;
            f0a f0aVar = new f0a();
            f0aVar.b = str;
            f0aVar.h(new jlw0(string, this.a.getString(2131956653)));
            f0aVar.h = tyo1.p(blc0.tg, new String[0]);
            listSingletonList = Collections.singletonList(f0aVar.p());
        } else {
            tyo1.p(blc0.mg, new String[0]);
            rhy rhyVar = new rhy((yny) null, 63);
            dz61 dz61Var = dz61.d;
            listSingletonList = Collections.singletonList(new u771(new t771(wa71Var, tyo1.p(blc0.tg, new String[0])), new pz61(new y171(rc11.a.b(zwy.class)), new exy((String) null, m1f1.a, 0, false, rhyVar, (bwe1) null, (cuu0) null), dz61.d, false), new bj71(w7x.a, true, (String) null)));
        }
        return new qj71(listSingletonList, 0, new quk(new va71(new cmt(p7h.O(new o571[]{m471.d, l571.d, w471.d, u471.d, r471.d, h571.d, q471.d, s471.d, c571.d, n571.d, f571.d, x471.d, p471.d, e571.d, z471.d}), 3))));
    }
}
