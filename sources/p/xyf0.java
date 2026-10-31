package p;

import android.R;
import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.Barrier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xyf0 {
    public static final /* synthetic */ mma0[] i = {new een0(xyf0.class, "bottomGradientBarrierMargin", "getBottomGradientBarrierMargin()I", 0), new een0(xyf0.class, "isScrolledToBottom", "isScrolledToBottom()Z", 0), new een0(xyf0.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0)};
    public final Barrier a;
    public final long b;
    public ObjectAnimator c;
    public final int d;
    public final int e;
    public final wyf0 f;
    public final wyf0 g;
    public final wyf0 h;

    public xyf0(Barrier barrier, boolean z) {
        this.a = barrier;
        this.b = barrier.getResources().getInteger(R.integer.config_shortAnimTime);
        int margin = barrier.getMargin();
        this.d = margin;
        this.e = z ? 0 : -barrier.getResources().getDimensionPixelSize(2131166387);
        this.f = new wyf0(Integer.valueOf(margin), this);
        this.g = new wyf0(this, (byte) 1);
        this.h = new wyf0(this, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void a() {
        int i2;
        mma0[] mma0VarArr = i;
        mma0 mma0Var = mma0VarArr[1];
        if (((Boolean) ((sgp0) this.g).a).booleanValue()) {
            i2 = this.e;
        } else {
            mma0 mma0Var2 = mma0VarArr[2];
            hgr0 hgr0Var = (hgr0) ((sgp0) this.h).a;
            if ((hgr0Var != null ? hgr0Var.b : 0) == 2) {
                i2 = this.e;
            } else {
                i2 = this.d;
            }
        }
        this.f.c(mma0VarArr[0], this, Integer.valueOf(i2));
    }
}
