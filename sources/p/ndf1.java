package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ndf1 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndf1(float f, float f2, long j, long j2) {
        super(1);
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = j2;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        Float fValueOf = Float.valueOf(0.0f);
        long j = this.a;
        mmr0 mmr0Var = new mmr0(fValueOf, new u7h(j));
        mmr0 mmr0Var2 = new mmr0(Float.valueOf(this.b), new u7h(j));
        Float fValueOf2 = Float.valueOf(this.c);
        long j2 = this.d;
        DrawScope.S0(lslVar, v9c.t(new mmr0[]{mmr0Var, mmr0Var2, new mmr0(fValueOf2, new u7h(j2)), new mmr0(Float.valueOf(1.0f), new u7h(j2))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
        return rih1.a;
    }
}
