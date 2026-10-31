package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class lhi1 implements Update {
    public final Next a(Object obj, Object obj2) {
        khi1 khi1Var = (khi1) obj2;
        if (khi1Var instanceof jhi1) {
            return Next.a(Effects.a(new ahi1[]{new ahi1(((jhi1) khi1Var).a)}));
        }
        if (khi1Var instanceof hhi1) {
            return Next.a(Effects.a(new zgi1[]{new zgi1(((hhi1) khi1Var).a)}));
        }
        if (khi1Var instanceof ihi1) {
            ihi1 ihi1Var = (ihi1) khi1Var;
            return Next.a(Effects.a(new bhi1[]{new bhi1(ihi1Var.a, ihi1Var.b)}));
        }
        if (khi1Var.equals(ghi1.a)) {
            return Next.a(Effects.a(new ygi1[]{ygi1.a}));
        }
        eg.o();
        return null;
    }
}
