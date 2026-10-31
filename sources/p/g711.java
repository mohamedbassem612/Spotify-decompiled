package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g711 implements h611 {
    public int a;
    public boolean b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public g711(RecyclerView recyclerView, Function0 function0, Function0 function1) {
        this.c = recyclerView;
        this.d = function0;
        this.e = function1;
    }

    public final void a(View view) {
        this.c.o0(this);
    }

    public final void c(View view) {
        if (this.b) {
            return;
        }
        RecyclerView recyclerViewI = u0p1.i(view);
        if (recyclerViewI != null) {
            u0p1.s(recyclerViewI, new ggx0(this, (byte) 11), new ggx0(this, (byte) 12));
        } else {
            u0p1.j(view, new ggx0(this, (byte) 13), new ggx0(this, (byte) 14));
        }
    }
}
