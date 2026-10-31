package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class faa1 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public faa1(long j, long j2, long j3) {
        super(1);
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        long j = this.b;
        long j2 = this.a;
        long jT = z4p1.t(j2, j);
        long jT2 = z4p1.t(j2, this.c);
        float f = hrt.f(drawScope, 2.0f);
        qoz0 qoz0VarP = v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.2f), new u7h(jT2)), new mmr0(Float.valueOf(1.0f), new u7h(jT))}, 0L, f, 10);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 1.8f) / f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 1.6f) / f;
        long jG1 = drawScope.g1();
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).t(fIntBitsToFloat, fIntBitsToFloat2, jG1);
            DrawScope.S0(drawScope, qoz0VarP, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
            return rih1.a;
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }
}
