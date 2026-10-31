package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class aof implements Update {
    public static final aof a = new aof();

    public final Next a(Object obj, Object obj2) {
        eof eofVar = (eof) obj;
        znf znfVar = (znf) obj2;
        t7q0 t7q0Var = eofVar.b;
        String str = eofVar.a;
        vub1 vub1Var = eofVar.c;
        boolean zEquals = znfVar.equals(vnf.a);
        uub1 uub1Var = uub1.a;
        if (zEquals) {
            boolean zEquals2 = vub1Var.equals(uub1Var);
            mnf mnfVar = mnf.a;
            if (zEquals2 || (vub1Var instanceof sub1)) {
                return Next.a(Effects.a(new mnf[]{mnfVar}));
            }
            if (vub1Var instanceof tub1) {
                return ((tub1) vub1Var).a != null ? Next.a(Effects.a(new nnf[]{new nnf(str)})) : Next.a(Effects.a(new mnf[]{mnfVar}));
            }
            eg.o();
            return null;
        }
        if (znfVar.equals(xnf.a)) {
            return Next.h(new eof(str, t7q0Var, uub1Var));
        }
        if (znfVar instanceof wnf) {
            wnf wnfVar = (wnf) znfVar;
            return Next.a(Effects.a(new onf[]{new onf(str, wnfVar.a, wnfVar.b)}));
        }
        if (znfVar instanceof ynf) {
            return Next.h(new eof(str, t7q0Var, new tub1(((ynf) znfVar).a, null, 2)));
        }
        eg.o();
        return null;
    }
}
