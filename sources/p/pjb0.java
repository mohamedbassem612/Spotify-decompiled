package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pjb0 implements vr20 {
    public final /* synthetic */ n811 a;
    public final /* synthetic */ n811 b;
    public final /* synthetic */ tl7 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ float g;

    public pjb0(n811 n811Var, n811 n811Var2, tl7 tl7Var, boolean z, Function0 function0, Function0 function1, float f) {
        this.a = n811Var;
        this.b = n811Var2;
        this.c = tl7Var;
        this.d = z;
        this.e = function0;
        this.f = function1;
        this.g = f;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        int i;
        mmr0 mmr0Var = (mmr0) obj;
        int iIntValue = ((Number) mmr0Var.a).intValue();
        int iIntValue2 = ((Number) mmr0Var.b).intValue();
        n811 n811Var = this.a;
        int i2 = n811Var.a;
        n811 n811Var2 = this.b;
        if (iIntValue == i2) {
            i = iIntValue2 - n811Var2.a;
        } else {
            i = iIntValue > i2 ? iIntValue2 : -n811Var2.a;
        }
        n811Var.a = iIntValue;
        n811Var2.a = iIntValue2;
        if (this.d) {
            i = -i;
        }
        this.c.g(i, (Float) this.e.invoke(), (Float) this.f.invoke(), this.g);
        return rih1.a;
    }
}
