package p;

import android.graphics.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x6c extends hab0 implements Function0 {
    public final /* synthetic */ y6c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6c(y6c y6cVar) {
        super(0);
        this.a = y6cVar;
    }

    public final Object invoke() {
        nk80 nk80VarI;
        Rect rect = new Rect();
        y6c y6cVar = this.a;
        y6cVar.getRecyclerView().getGlobalVisibleRect(rect);
        hsl1 hsl1Var = y6cVar.h1;
        int i = (hsl1Var == null || (nk80VarI = hsl1Var.a.i(519)) == null) ? 0 : nk80VarI.d;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        return m511.a(new m511(f, f2, f3, f4), 0.0f, f4 - i, 7);
    }
}
