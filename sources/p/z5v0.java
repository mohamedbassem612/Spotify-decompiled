package p;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z5v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DialogInterface.OnClickListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5v0(DialogInterface.OnClickListener onClickListener, byte b) {
        super(0);
        this.a = b;
        this.b = onClickListener;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        DialogInterface.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                onClickListener.onClick(null, -1);
                break;
            default:
                if (onClickListener != null) {
                    onClickListener.onClick(null, -2);
                }
                break;
        }
        return rih1Var;
    }
}
