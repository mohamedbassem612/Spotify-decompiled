package p;

import com.spotify.contentagnostic.v2.CurationExperienceTrait;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wio implements ov00 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static two1 c(CurationExperienceTrait.Method method) throws NoWhenBranchMatchedException {
        int iQ = method.q();
        int i = iQ == 0 ? -1 : vio.a[l1d.C(iQ)];
        if (i != -1) {
            if (i == 1) {
                return sio.c;
            }
            if (i == 2) {
                return new rio(method.r().getUri());
            }
            if (i == 3) {
                return new qio(method.o().o());
            }
            if (i == 4) {
                return new pio(method.n().o());
            }
            if (i != 5) {
                eg.o();
                return null;
            }
        }
        return tio.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ez00 a(byte[] bArr) throws NoWhenBranchMatchedException {
        CurationExperienceTrait curationExperienceTraitQ = CurationExperienceTrait.q(bArr);
        String strP = curationExperienceTraitQ.p();
        two1 two1VarC = c(curationExperienceTraitQ.o());
        h290<CurationExperienceTrait.Method> h290VarN = curationExperienceTraitQ.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (CurationExperienceTrait.Method method : h290VarN) {
            method.getClass();
            arrayList.add(c(method));
        }
        return new uio(strP, two1VarC, arrayList);
    }

    public final int b() {
        return 246;
    }

    public final Class type() {
        return uio.class;
    }
}
