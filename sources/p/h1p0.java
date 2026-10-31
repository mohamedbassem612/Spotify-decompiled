package p;

import android.widget.ImageView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h1p0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i1p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1p0(i1p0 i1p0Var, byte b) {
        super(0);
        this.a = b;
        this.b = i1p0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        i1p0 i1p0Var = this.b;
        switch (b) {
            case 0:
                return (ImageView) i1p0Var.d.findViewById(2131429223);
            default:
                return i1p0Var.d.findViewById(2131431356);
        }
    }
}
