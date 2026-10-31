package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w060 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Brush b;
    public final /* synthetic */ Brush c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w060(Brush brush, Brush brush2, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = brush;
        this.c = brush2;
        this.d = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Function0 function0 = this.d;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.S0(drawScope, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                DrawScope.S0(drawScope, this.c, 0L, 0L, ((Number) function0.invoke()).floatValue(), (DrawStyle) null, (ColorFilter) null, 0, 118);
                return rih1.a;
            default:
                return ((eqc) obj).a(new w060(this.b, this.c, function0, (byte) 0));
        }
    }
}
