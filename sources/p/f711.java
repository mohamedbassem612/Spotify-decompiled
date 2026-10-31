package p;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f711 extends g180 {
    public final /* synthetic */ byte a;
    public final ViewGroup b;

    public /* synthetic */ f711(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // p.g180
    public final f180 b(mmr0 mmr0Var) {
        View view;
        ZoomImageView zoomImageViewA;
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                RecyclerView recyclerView2 = recyclerView;
                LinearLayoutManager layoutManager = recyclerView2.getLayoutManager();
                int iF1 = layoutManager.f1();
                int iH1 = layoutManager.h1();
                if (iF1 > iH1) {
                    return null;
                }
                while (true) {
                    w611 w611VarN = recyclerView2.N(iF1);
                    if (w611VarN == null || (view = w611VarN.a) == null) {
                        return null;
                    }
                    view.getGlobalVisibleRect(new Rect());
                    if (g180.c(mmr0Var, view) && (zoomImageViewA = g180.a(view)) != null) {
                        if (g180.c(mmr0Var, zoomImageViewA.getView())) {
                            return new f180(zoomImageViewA, zoomImageViewA.getRectF());
                        }
                        return null;
                    }
                    if (iF1 == iH1) {
                        return null;
                    }
                    iF1++;
                }
                break;
            default:
                Rect rect = new Rect();
                recyclerView.getGlobalVisibleRect(rect);
                PointF pointF = (PointF) mmr0Var.a;
                PointF pointF2 = new PointF(rect.left + pointF.x, rect.top + pointF.y);
                PointF pointF3 = (PointF) mmr0Var.b;
                PointF pointF4 = new PointF(rect.left + pointF3.x, rect.top + pointF3.y);
                ZoomImageView zoomImageViewA2 = g180.a(recyclerView);
                if (zoomImageViewA2 == null) {
                    return null;
                }
                View view2 = zoomImageViewA2.getView();
                Rect rect2 = new Rect();
                view2.getGlobalVisibleRect(rect2);
                Point point = new Point((int) pointF2.x, (int) pointF2.y);
                if (!rect2.contains(point.x, point.y)) {
                    return null;
                }
                Point point2 = new Point((int) pointF4.x, (int) pointF4.y);
                if (rect2.contains(point2.x, point2.y)) {
                    return new f180(zoomImageViewA2, zoomImageViewA2.getRectF());
                }
                return null;
        }
    }
}
