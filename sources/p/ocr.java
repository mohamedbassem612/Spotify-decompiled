package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ocr implements Update {
    public final Next a(Object obj, Object obj2) {
        qcr qcrVar = (qcr) obj;
        ncr ncrVar = (ncr) obj2;
        hi hiVar = qcrVar.a;
        if (!(ncrVar instanceof mcr)) {
            if (ncrVar.equals(lcr.c)) {
                return Next.a(Collections.singleton(new dcr(hiVar, 4)));
            }
            if (ncrVar.equals(lcr.a)) {
                return Next.i(new qcr(hiVar, new mj(2131963045, 2131963034, 2131963040, 34, null, null), 2), Effects.a(new icr[]{icr.a}));
            }
            if (ncrVar.equals(lcr.b)) {
                return Next.a(Collections.singleton(new dcr(hiVar, 5)));
            }
            eg.o();
            return null;
        }
        lj ljVar = ((mcr) ncrVar).a;
        if (ljVar.equals(jj.a)) {
            int iC = l1d.C(qcrVar.c);
            if (iC == 0) {
                return Next.a(Collections.singleton(new hcr(hiVar)));
            }
            if (iC == 1) {
                return Next.a(Collections.singleton(gcr.a));
            }
            eg.o();
            return null;
        }
        if (ljVar.equals(gj.a)) {
            return Next.a(Collections.singleton(new dcr(hiVar, 1)));
        }
        if (ljVar.equals(fj.a)) {
            return Next.a(Collections.singleton(new dcr(hiVar, 2)));
        }
        if (ljVar.equals(kj.a)) {
            return Next.a(Collections.singleton(new dcr(hiVar, 3)));
        }
        if (ljVar instanceof hj) {
            return Next.a(Collections.singleton(new fcr(((hj) ljVar).a)));
        }
        if (ljVar instanceof ij) {
            ij ijVar = (ij) ljVar;
            return Next.a(Collections.singleton(new ecr(ijVar.a, ijVar.b)));
        }
        eg.o();
        return null;
    }
}
