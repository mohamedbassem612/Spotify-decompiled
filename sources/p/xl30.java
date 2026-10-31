package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class xl30 implements Update {
    public final Next a(Object obj, Object obj2) {
        c8o ol30Var;
        zl30 zl30Var = (zl30) obj;
        tl30 tl30Var = (tl30) obj2;
        boolean z = zl30Var.b;
        if (!(tl30Var instanceof sl30)) {
            if (tl30Var instanceof rl30) {
                return z ? Next.j() : Next.i(new zl30(zl30Var.a, true), Effects.a(new c8o[]{new ol30(8)}));
            }
            eg.o();
            return null;
        }
        ozh1 ozh1Var = ((sl30) tl30Var).a;
        zl30 zl30Var2 = new zl30(ozh1Var, z);
        int i = ozh1Var.a;
        int i2 = ozh1Var.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            return Next.j();
        }
        if (iC == 1) {
            ol30Var = new ol30(i2);
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            ol30Var = new nl30(i2);
        }
        if (i2 == 8) {
            return z ? Next.j() : Next.i(new zl30(ozh1Var, true), Effects.a(new c8o[]{ol30Var}));
        }
        return Next.i(zl30Var2, Effects.a(new c8o[]{ol30Var}));
    }
}
