package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class izm extends hab0 implements Function0 {
    public final /* synthetic */ gb5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yym c;
    public final /* synthetic */ float d;
    public final /* synthetic */ vu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izm(gb5 gb5Var, int i, yym yymVar, float f, vu30 vu30Var) {
        super(0);
        this.a = gb5Var;
        this.b = i;
        this.c = yymVar;
        this.d = f;
        this.e = vu30Var;
    }

    public final Object invoke() {
        gb5 gb5Var = this.a;
        o4w o4wVarA = gb5Var.a();
        int i = this.b;
        if (o4wVarA != null) {
            gb5Var.d(o4w.a(o4wVarA, null, null, Integer.valueOf(i), 27));
        }
        o4w o4wVarA2 = gb5Var.a();
        if (o4wVarA2 != null) {
            this.c.c(o4wVarA2, i, this.d);
            xz3 xz3Var = (xz3) o7h.t0(i, o4wVarA2.a);
            if (xz3Var != null) {
                long j = xz3Var.a;
                this.e.invoke(Integer.valueOf(i), new Offset(j));
            }
        }
        return rih1.a;
    }
}
