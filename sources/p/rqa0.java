package p;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rqa0 {
    public static final jxa d = new jxa((byte) 14);
    public static final LinkedHashMap e = new LinkedHashMap();
    public final Context a;
    public final ut71 b;
    public final x880 c;

    public rqa0(Context context, ut71 ut71Var, mr20 mr20Var) {
        this.a = context;
        this.b = ut71Var;
        this.c = new x880(new ry50(mr20Var, (byte) 24), this, (byte) 13);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) throws AbortFlowException {
        oqa0 oqa0Var;
        if (onmVar instanceof oqa0) {
            oqa0Var = (oqa0) onmVar;
            int i = oqa0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqa0Var.e = i - Integer.MIN_VALUE;
            } else {
                oqa0Var = new oqa0(this, onmVar);
            }
        } else {
            oqa0Var = new oqa0(this, onmVar);
        }
        Object objI = oqa0Var.c;
        int i2 = oqa0Var.e;
        if (i2 == 0) {
            hm5.M(objI);
            oqa0Var.a = str;
            oqa0Var.b = str2;
            oqa0Var.e = 1;
            objI = b5p1.i(this.c, oqa0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = oqa0Var.b;
            str = oqa0Var.a;
            hm5.M(objI);
        }
        hma1 hma1VarEdit = ((dma1) objI).edit();
        hma1VarEdit.d(d.I(str), str2);
        hma1VarEdit.h();
        return rih1.a;
    }
}
