package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class khg extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khg(float f, String str, long j, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.a = f;
        this.b = str;
        this.c = j;
        this.d = ven0Var;
        this.e = ven0Var2;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        y9e1 y9e1Var = (y9e1) this.d.getValue();
        if (y9e1Var != null) {
            float fX0 = drawScope.X0(phg.c);
            float fX1 = drawScope.X0(0.0f);
            for (i220 i220Var : (List) this.e.getValue()) {
                float f = this.a;
                String str = this.b;
                if (str == null || i220Var.b.a.equals(str)) {
                    float f2 = fX0;
                    float f3 = fX1;
                    for (n511 n511Var : phg.d(y9e1Var, i220Var.a, f3, f)) {
                        DrawScope.g0(drawScope, this.c, n511Var.h(), n511Var.g(), (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (DrawStyle) null, 0.0f, 0, 240);
                    }
                    fX1 = f3;
                    fX0 = f2;
                } else {
                    tr80 tr80Var = i220Var.a;
                    long j = phg.b;
                    for (n511 n511Var2 : phg.d(y9e1Var, tr80Var, fX1, f)) {
                        long j2 = j;
                        DrawScope.g0(drawScope, j2, n511Var2.h(), n511Var2.g(), (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), new phc1(drawScope.X0(1.0f), 0.0f, 0, 0, (uw4) null, 30), 0.0f, 0, 224);
                        j = j2;
                        fX1 = fX1;
                        fX0 = fX0;
                    }
                }
            }
        }
        return rih1.a;
    }
}
