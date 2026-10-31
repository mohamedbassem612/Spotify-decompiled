package p;

import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class szf1 extends lda {
    public final qzh U0;
    public final ynb0 V0;
    public final ynb0 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szf1(FrameLayout frameLayout, qzh qzhVar, ynb0 ynb0Var, ynb0 ynb0Var2) {
        super(frameLayout);
        frameLayout.addView(qzhVar.getView());
        this.U0 = qzhVar;
        this.V0 = ynb0Var;
        this.W0 = ynb0Var2;
    }

    @Override // p.lda
    public final void E(iby ibyVar) {
        k4m k4mVar;
        azy azyVar = (azy) ibyVar.e;
        String str = ibyVar.c;
        ArrayList arrayList = azyVar.b;
        String str2 = ibyVar.d;
        if (azyVar.d) {
            k4mVar = k4m.a;
        } else {
            k4mVar = azyVar.c ? k4m.b : k4m.d;
        }
        k4m k4mVar2 = k4mVar;
        boolean z = azyVar.e;
        int iC = l1d.C(azyVar.g);
        int i = 1;
        if (iC != 0) {
            i = iC != 1 ? 3 : 2;
        }
        exf1 exf1Var = new exf1(str, arrayList, azyVar.f, str2, k4mVar2, i, z);
        qzh qzhVar = this.U0;
        qzhVar.f(exf1Var);
        qzhVar.n(new rzf1(this, ibyVar, (byte) 0));
    }
}
