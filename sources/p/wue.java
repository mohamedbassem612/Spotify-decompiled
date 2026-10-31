package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class wue implements Update {
    public static final wue a = new wue();

    public final Next a(Object obj, Object obj2) {
        bve bveVar = (bve) obj;
        vue vueVar = (vue) obj2;
        if (vueVar.equals(que.a)) {
            return Next.h(bve.a(bveVar, null, true, 1));
        }
        if (vueVar.equals(oue.a)) {
            return Next.h(bve.a(bveVar, null, false, 1));
        }
        if (vueVar.equals(pue.a)) {
            return Next.i(bve.a(bveVar, null, false, 1), Collections.singleton(bue.a));
        }
        if (vueVar.equals(tue.a)) {
            return Next.i(bve.a(bveVar, null, true, 1), Collections.singleton(cue.a));
        }
        if (vueVar.equals(rue.a)) {
            return Next.h(new bve(qte.a(bveVar.a, true, null, null, null, 61), false));
        }
        if (vueVar.equals(uue.a)) {
            return Next.h(new bve(qte.a(bveVar.a, false, null, null, null, 61), false));
        }
        boolean zEquals = vueVar.equals(kue.a);
        yte yteVar = yte.a;
        if (zEquals) {
            return Next.i(bve.a(bveVar, null, false, 1), Collections.singleton(yteVar));
        }
        if (vueVar.equals(mue.a)) {
            return Next.i(bve.a(bveVar, null, false, 1), Collections.singleton(yteVar));
        }
        if (vueVar.equals(nue.a)) {
            return Next.i(bve.a(bveVar, null, false, 1), Collections.singleton(zte.a));
        }
        if (vueVar instanceof sue) {
            return Next.a(Collections.singleton(new aue(((sue) vueVar).a)));
        }
        if (!(vueVar instanceof lue)) {
            eg.o();
            return null;
        }
        String str = ((lue) vueVar).a;
        qte qteVar = bveVar.a;
        btf btfVar = qteVar.c;
        return !(btfVar instanceof btf) ? Next.j() : Next.h(bve.a(bveVar, qte.a(qteVar, false, new btf(str, btfVar.b), null, null, 59), false, 2));
    }
}
