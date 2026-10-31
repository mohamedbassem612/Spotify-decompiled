package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mt41 {
    public static final /* synthetic */ mma0[] h = {new een0(mt41.class, "isScrolledToBottom", "isScrolledToBottom()Z", 0), new een0(mt41.class, "targetScrollableView", "getTargetScrollableView()Lcom/spotify/mainlayout/ui/view/gradient/ScrolledToBottomHelper$ScrollableView;", 0)};
    public final eyh0 a;
    public final a42 b;
    public final kt41 c = new kt41(this, (byte) 0);
    public final LinkedHashMap d = new LinkedHashMap();
    public final ArrayList e = new ArrayList();
    public final kt41 f = new kt41(this, (byte) 1);
    public final xfz0 g = new xfz0(this, (byte) 7);

    public mt41(eyh0 eyh0Var, a42 a42Var) {
        this.a = eyh0Var;
        this.b = a42Var;
    }

    public final void a() {
        mma0[] mma0VarArr = h;
        mma0 mma0Var = mma0VarArr[1];
        a32 a32Var = (a32) ((sgp0) this.f).a;
        this.c.c(mma0VarArr[0], this, Boolean.valueOf((a32Var == null || a32Var.a.canScrollVertically(1)) ? false : true));
    }
}
