package p;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class cju0 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(iyc0 iyc0Var, String str, String str2, int i, tv80 tv80Var, onm onmVar) throws NoWhenBranchMatchedException {
        bju0 bju0Var;
        if (onmVar instanceof bju0) {
            bju0Var = (bju0) onmVar;
            int i2 = bju0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bju0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                bju0Var = new bju0(onmVar);
            }
        } else {
            bju0Var = new bju0(onmVar);
        }
        Object objL = bju0Var.b;
        int i3 = bju0Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objL);
                List listSingletonList = Collections.singletonList(str2);
                bju0Var.a = i;
                bju0Var.c = 1;
                objL = ((xyc0) iyc0Var).l(str, listSingletonList, bju0Var, tv80Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = bju0Var.a;
                hm5.M(objL);
            }
            py21 py21Var = (py21) objL;
            if (py21Var instanceof oy21) {
                return new rju0(i);
            }
            if (py21Var instanceof ly21) {
                return new qju0(i);
            }
            throw new NoWhenBranchMatchedException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new qju0(i);
        }
    }
}
