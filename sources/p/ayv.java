package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class ayv implements Update {
    public final Next a(Object obj, Object obj2) {
        eyv eyvVar = (eyv) obj;
        oxv oxvVar = (oxv) obj2;
        if (oxvVar instanceof lxv) {
            lxv lxvVar = (lxv) oxvVar;
            return Next.h(eyv.a(eyvVar, null, lxvVar.a, lxvVar.b, false, 9));
        }
        if (oxvVar instanceof nxv) {
            return Next.h(eyv.a(eyvVar, ((nxv) oxvVar).a, false, false, false, 14));
        }
        if (oxvVar instanceof mxv) {
            Set set = eyvVar.a;
            return set.isEmpty() ? Next.j() : Next.a(Collections.singleton(new fxv(set)));
        }
        if (oxvVar instanceof jxv) {
            return Next.a(Collections.singleton(new exv(((jxv) oxvVar).a)));
        }
        if (oxvVar instanceof kxv) {
            return Next.h(eyv.a(eyvVar, null, false, false, ((kxv) oxvVar).a, 7));
        }
        eg.o();
        return null;
    }
}
