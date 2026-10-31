package p;

import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iir0 extends w611 {
    public static final /* synthetic */ int V0 = 0;
    public final gmt U0;

    public iir0(FrameLayout frameLayout) {
        super(frameLayout);
        gmt gmtVarJ = gmt.j(LayoutInflater.from(frameLayout.getContext()), frameLayout);
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new eg7(gmtVarJ, this));
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) gmtVarJ.b;
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) (qx21.a(2131165685, frameLayout.getContext().getResources()) * frameLayout.getHeight()));
        }
        this.U0 = gmtVarJ;
    }
}
