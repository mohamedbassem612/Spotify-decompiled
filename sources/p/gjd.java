package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gjd extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mic0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjd(mic0 mic0Var, byte b) {
        super(1);
        this.a = b;
        this.b = mic0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                DrawScope.S0((DrawScope) obj, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                break;
            case 1:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.S0(lslVar, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                break;
            case 2:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                DrawScope.S0(lslVar2, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                break;
            case 3:
                DrawScope.S0((DrawScope) obj, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                break;
            case 4:
                lsl lslVar3 = (lsl) obj;
                lslVar3.s1();
                DrawScope.S0(lslVar3, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                break;
            case 5:
                lsl lslVar4 = (lsl) obj;
                lslVar4.s1();
                DrawScope.S0(lslVar4, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                break;
            default:
                lsl lslVar5 = (lsl) obj;
                lslVar5.s1();
                DrawScope.S0(lslVar5, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 9, 62);
                break;
        }
        return rih1Var;
    }
}
