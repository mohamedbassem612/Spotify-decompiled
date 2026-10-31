package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rme0 implements Update {
    public static final rme0 a = new rme0();

    public final Next a(Object obj, Object obj2) {
        vme0 vme0Var = (vme0) obj;
        hme0 hme0Var = (hme0) obj2;
        cov0 cov0Var = vme0Var.f;
        int i = vme0Var.c;
        boolean z = hme0Var instanceof ile0;
        vje0 vje0Var = vje0.c;
        z6x z6xVar = z6x.a;
        if (z) {
            int i2 = vme0Var.d;
            return i != i2 ? Next.h(vme0.a(vme0Var, z6xVar, 1, i2, 0, null, null, 56)) : Next.a(Collections.singleton(vje0Var));
        }
        if (hme0Var instanceof sle0) {
            return Next.a(Effects.a(new rje0[]{new rje0(((sle0) hme0Var).a)}));
        }
        if (hme0Var instanceof tle0) {
            jj40 jj40Var = ((tle0) hme0Var).a;
            return (i == 1 || i == 3) ? Next.i(vme0Var, Effects.a(new cke0[]{new cke0(jj40Var)})) : Next.i(vme0Var, Effects.a(new dke0[]{new dke0(jj40Var)}));
        }
        if (hme0Var instanceof rle0) {
            List list = ((rle0) hme0Var).a;
            return Next.h(vme0.a(vme0Var, list, list.size() == 0 ? 2 : 1, 0, 0, null, null, 60));
        }
        if (hme0Var instanceof qle0) {
            return Next.h(vme0.a(vme0Var, z6xVar, 1, 0, 0, null, null, 60));
        }
        if (hme0Var instanceof jle0) {
            return Next.h(vme0.a(vme0Var, null, 0, 3, 0, null, null, 59));
        }
        if (hme0Var instanceof kle0) {
            return Next.h(vme0.a(vme0Var, null, 0, 2, 0, null, null, 59));
        }
        if (hme0Var instanceof bme0) {
            return Next.a(Effects.a(new xje0[]{new xje0(((bme0) hme0Var).a)}));
        }
        if (hme0Var instanceof zle0) {
            return Next.h(vme0.a(vme0Var, null, 0, 0, 0, ((zle0) hme0Var).a, null, 47));
        }
        if (hme0Var instanceof nle0) {
            vme0 vme0VarA = vme0.a(vme0Var, null, 0, 0, 0, null, cov0.a(cov0Var, null, 0, true, 3), 31);
            jj40 jj40Var2 = cov0Var.a;
            if (jj40Var2 == null) {
                jj40Var2 = jj40.c;
            }
            return Next.i(vme0VarA, Effects.a(new eke0[]{new eke0(jj40Var2)}));
        }
        boolean z2 = hme0Var instanceof wle0;
        qje0 qje0Var = qje0.c;
        pje0 pje0Var = pje0.c;
        if (z2) {
            cov0 cov0VarA = cov0.a(cov0Var, null, 0, false, 3);
            return ((wle0) hme0Var).a ? Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0.a(cov0VarA, null, 3, false, 5), 31), Effects.a(new pje0[]{pje0Var})) : Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0VarA, 31), Effects.a(new qje0[]{qje0Var}));
        }
        if (hme0Var instanceof xle0) {
            cov0 cov0VarA2 = cov0.a(cov0Var, null, 0, false, 3);
            return ((xle0) hme0Var).a ? Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0.a(cov0VarA2, null, 3, false, 5), 31), Effects.a(new e9p1[]{pje0Var, vje0Var})) : Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0VarA2, 31), Effects.a(new qje0[]{qje0Var}));
        }
        if (hme0Var instanceof mle0) {
            vme0 vme0VarA2 = vme0.a(vme0Var, null, 0, 0, 0, null, cov0.a(cov0Var, null, 0, true, 3), 31);
            Integer num = ((mle0) hme0Var).a;
            return Next.i(vme0VarA2, Effects.a(new nje0[]{new nje0(num != null ? num.intValue() : -1)}));
        }
        if (hme0Var instanceof vle0) {
            cov0 cov0VarA3 = cov0.a(cov0Var, null, 0, false, 3);
            return ((vle0) hme0Var).a ? Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0VarA3, 31), Effects.a(new tje0[]{tje0.c})) : Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0VarA3, 31), Effects.a(new qje0[]{qje0Var}));
        }
        if (hme0Var instanceof yle0) {
            return Next.i(vme0.a(vme0Var, null, 0, 0, 0, null, cov0.a(cov0Var, ((yle0) hme0Var).a, 2, false, 4), 31), Effects.a(new pje0[]{pje0Var}));
        }
        eg.o();
        return null;
    }
}
