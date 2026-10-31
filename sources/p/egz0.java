package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class egz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fgz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egz0(fgz0 fgz0Var, byte b) {
        super(0);
        this.a = b;
        this.b = fgz0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        fgz0 fgz0Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((err0) fgz0Var.a.e.b).s());
            case 1:
                xtb0 xtb0Var = fgz0Var.a;
                ptb0 ptb0VarH = xtb0Var.h();
                i25 i25Var = xtb0Var.e;
                int i = ptb0VarH.o;
                List list = ptb0VarH.l;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((qtb0) it.next()).q));
                }
                int i2 = ptb0VarH.n - ptb0VarH.m;
                int iS = ((err0) i25Var.b).s();
                int iS2 = ((err0) i25Var.c).s();
                float fO = 0.0f;
                if (i != 0 && !arrayList.isEmpty()) {
                    float fH0 = (float) o7h.h0(arrayList);
                    if (fH0 > 0.0f) {
                        float f = (i * fH0) - i2;
                        if (f > 0.0f) {
                            fO = yoi1.o(((iS * fH0) + iS2) / f, 0.0f, 1.0f);
                        }
                    }
                }
                return Float.valueOf(fO);
            default:
                int i3 = fgz0Var.a.h().o;
                if (i3 == 0) {
                    i3 = 0;
                }
                return Integer.valueOf(i3);
        }
    }
}
