package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mws0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mws0(View view, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = view;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        View view = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                view.performHapticFeedback(1);
                function0.invoke();
                return rih1Var;
            case 1:
                return view.getResources().getConfiguration().getLayoutDirection() == 1 ? Float.valueOf(-(view.getX() + view.getWidth())) : Float.valueOf(((Number) function0.invoke()).floatValue() - view.getX());
            default:
                view.setVisibility(8);
                function0.invoke();
                return rih1Var;
        }
    }
}
