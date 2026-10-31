package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w6c extends hab0 implements xu30 {
    public final /* synthetic */ y6c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6c(y6c y6cVar) {
        super(3);
        this.a = y6cVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hsl1 hsl1Var = (hsl1) obj2;
        y6c y6cVar = this.a;
        RecyclerView recyclerView = y6cVar.getRecyclerView();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((uc80) obj3).d + hsl1Var.a.i(519).d);
        y6cVar.h1 = hsl1Var;
        return hsl1Var;
    }
}
