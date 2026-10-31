package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xv40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ n511 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv40(Bitmap bitmap, n511 n511Var, float f, byte b) {
        super(1);
        this.a = b;
        this.b = bitmap;
        this.c = n511Var;
        this.d = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        n511 n511Var = this.c;
        Bitmap bitmap = this.b;
        switch (b) {
            case 0:
                u84 u84VarP = ((DrawScope) obj).a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawBitmap(bitmap, n511Var.a - f, n511Var.b - f, (Paint) null);
                break;
            default:
                u84 u84VarP2 = ((DrawScope) obj).a1().p();
                Canvas canvas2 = v84.a;
                u84VarP2.a.drawBitmap(bitmap, n511Var.a - f, n511Var.b - f, (Paint) null);
                break;
        }
        return rih1Var;
    }
}
