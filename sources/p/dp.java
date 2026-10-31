package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class dp implements Update {
    public static final dp a = new dp();

    public final Next a(Object obj, Object obj2) {
        hp hpVar = (hp) obj;
        ap apVar = (ap) obj2;
        if (apVar instanceof to) {
            ho hoVar = ((to) apVar).a;
            if (hoVar instanceof fo) {
                return (hpVar.f && ((fo) hoVar).g) ? Next.h(hp.a(hpVar, null, null, false, true, 63)) : Next.a(Collections.singleton(new oo(((fo) hoVar).a)));
            }
            if (hoVar instanceof go) {
                return Next.h(hp.a(hpVar, nun0.a, null, false, false, 123));
            }
            eg.o();
            return null;
        }
        if (apVar instanceof yo) {
            return Next.h(hp.a(hpVar, new pun0(((yo) apVar).a), null, false, false, 123));
        }
        if (apVar.equals(xo.a)) {
            return Next.a(Collections.singleton(no.a));
        }
        if (apVar.equals(xo.b)) {
            return Next.h(hp.a(hpVar, oun0.a, null, false, false, 123));
        }
        if (apVar instanceof wo) {
            return Next.i(hp.a(hpVar, null, ((wo) apVar).a, false, false, 119), Collections.singleton(qo.a));
        }
        if (apVar instanceof zo) {
            hwe0 hwe0Var = hpVar.d;
            return hwe0Var != null ? Next.a(Collections.singleton(new po(hwe0Var, hpVar.b))) : Next.j();
        }
        if (apVar instanceof uo) {
            return Next.h(hp.a(hpVar, null, null, ((uo) apVar).a, false, 111));
        }
        if (apVar.equals(vo.a)) {
            return Next.h(hp.a(hpVar, null, null, false, false, 63));
        }
        eg.o();
        return null;
    }
}
