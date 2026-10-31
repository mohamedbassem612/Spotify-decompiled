package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mej1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ c9s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mej1(RecyclerView recyclerView, c9s c9sVar, byte b) {
        super(0);
        this.a = b;
        this.b = recyclerView;
        this.c = c9sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                recyclerView.addOnAttachStateChangeListener(onAttachStateChangeListener);
                break;
            default:
                recyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                break;
        }
        return rih1Var;
    }
}
