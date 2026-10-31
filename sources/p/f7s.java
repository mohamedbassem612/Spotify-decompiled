package p;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f7s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7s(ViewGroup viewGroup, byte b) {
        super(0);
        this.a = b;
        this.b = viewGroup;
    }

    public final Object invoke() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                Context context = viewGroup.getContext();
                float dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165492);
                int color = context.getColor(2131101551);
                g4b1 g4b1Var = new g4b1(context, j4b1.I1, dimensionPixelSize);
                g4b1Var.b(color);
                return g4b1Var;
            default:
                return viewGroup.getContext().getDrawable(2131233903);
        }
    }
}
