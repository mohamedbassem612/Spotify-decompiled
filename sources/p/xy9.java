package p;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xy9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ View d;

    public xy9(List list, ArrayList arrayList, yy9 yy9Var) {
        this.b = list;
        this.c = arrayList;
        this.d = yy9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        yy9 yy9Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                ArrayList arrayList = new ArrayList();
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    PointF pointF = (PointF) list.get(i);
                    PointF pointF2 = (PointF) ((ArrayList) obj).get(i);
                    if (u890.j(pointF, pointF2)) {
                        arrayList.add(pointF);
                    } else {
                        float f = pointF.x;
                        float f2 = pointF2.y;
                        arrayList.add(new PointF(f, f2 - ((f2 - pointF.y) * animatedFraction)));
                    }
                }
                yy9Var.b(arrayList);
                break;
            default:
                ((chd1) yy9Var).c((View) obj2, (View) obj, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public xy9(chd1 chd1Var, View view, View view2) {
        this.d = chd1Var;
        this.b = view;
        this.c = view2;
    }
}
