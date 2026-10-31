package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mly extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mly(oly olyVar, byte b) {
        super(0);
        this.a = b;
        this.b = olyVar;
    }

    public final Object invoke() {
        byte b = this.a;
        oly olyVar = this.b;
        switch (b) {
            case 0:
                ConstraintLayout constraintLayout = olyVar.f;
                return Float.valueOf(constraintLayout != null ? constraintLayout.getWidth() : 0.0f);
            default:
                ConstraintLayout constraintLayout2 = olyVar.f;
                return Float.valueOf(constraintLayout2 != null ? constraintLayout2.getWidth() : 0.0f);
        }
    }
}
