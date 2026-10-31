package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cxh0 implements o1i {
    public final kly0 a;
    public final Integer[] b = {2131429940, 2131429941, 2131429942};
    public final Map c = sqg0.J(oqn1.n(1, new blb0(2131625210, 0.0f, 0.0f)), oqn1.n(2, new blb0(2131625211, 7.0f, 4.0f)), oqn1.n(3, new blb0(2131625212, 7.0f, 4.0f)));

    public cxh0(jly0 jly0Var, mka mkaVar) {
        this.a = jly0Var;
    }

    @Override // p.o1i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(axh0 axh0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1290228902);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(axh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarJ = u291.j(0.0f, 400.0f, 1, qim0Var);
            uwr uwrVar = cbx.a;
            wmo1.e(390, apo.r(-1000133958, new rvg0(axh0Var, o0iVar, this, (byte) 8), x340Var), x340Var, uyn1.z(0.0f, cbx.b(x340Var).b.c, 1, qim0VarJ));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, axh0Var, o0iVar, qim0Var, (byte) 3);
        }
    }

    public final ArrayList d(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.b) {
            View viewFindViewById = viewGroup.findViewById(num.intValue());
            if (viewFindViewById != null) {
                arrayList.add(viewFindViewById);
            }
        }
        return arrayList;
    }
}
