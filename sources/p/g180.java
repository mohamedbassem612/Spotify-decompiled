package p;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class g180 {
    public static ZoomImageView a(View view) {
        if (view instanceof ZoomImageView) {
            return (ZoomImageView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null) {
                    return a(childAt);
                }
                tw20.p();
            }
        }
        return null;
    }

    public static boolean c(mmr0 mmr0Var, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        PointF pointF = (PointF) mmr0Var.a;
        Point point = new Point((int) pointF.x, (int) pointF.y);
        if (!rect.contains(point.x, point.y)) {
            return false;
        }
        PointF pointF2 = (PointF) mmr0Var.b;
        Point point2 = new Point((int) pointF2.x, (int) pointF2.y);
        return rect.contains(point2.x, point2.y);
    }

    public abstract f180 b(mmr0 mmr0Var);
}
