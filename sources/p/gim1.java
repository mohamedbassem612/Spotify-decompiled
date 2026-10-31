package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gim1 extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gim1(float f, List list, boolean z, long j) {
        super(1);
        this.a = f;
        this.b = list;
        this.c = z;
        this.d = j;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float f = this.a;
        float f2 = f;
        for (y9e1 y9e1Var : this.b) {
            w5p1.i(drawScope, y9e1Var, this.d, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.c ? f : (Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f) - ((int) (y9e1Var.c >> 32)))) << 32), 0.0f, 248);
            f2 += (int) (y9e1Var.c & 4294967295L);
        }
        return rih1.a;
    }
}
