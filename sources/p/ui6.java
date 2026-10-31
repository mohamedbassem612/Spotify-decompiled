package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ui6 extends hab0 implements iu30 {
    public final /* synthetic */ yk4 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui6(yk4 yk4Var, long j, int i, int i2, long j2) {
        super(1);
        this.a = yk4Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        DrawScope.G(lslVar, this.a, this.b, (((long) this.c) << 32) | (((long) this.d) & 4294967295L), 0L, this.e, 0.0f, (ColorFilter) null, 0, 744);
        return rih1.a;
    }
}
