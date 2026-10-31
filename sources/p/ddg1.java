package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ddg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mic0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ mic0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddg1(boolean z, mic0 mic0Var, boolean z2, mic0 mic0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = mic0Var;
        this.d = z2;
        this.e = mic0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                if (z2) {
                    DrawScope.S0(lslVar, this.c, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                }
                if (z) {
                    DrawScope.S0(lslVar, this.e, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                }
                break;
            default:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                if (z2) {
                    DrawScope.S0(lslVar2, this.c, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                }
                if (z) {
                    DrawScope.S0(lslVar2, this.e, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                }
                break;
        }
        return rih1Var;
    }
}
