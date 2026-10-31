package p;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kx61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public kx61(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.O0 == null) {
            return;
        }
        if (shapeableImageView.N0 == null) {
            shapeableImageView.N0 = new gch0(shapeableImageView.O0);
        }
        RectF rectF = shapeableImageView.e;
        Rect rect = this.a;
        rectF.round(rect);
        shapeableImageView.N0.setBounds(rect);
        shapeableImageView.N0.getOutline(outline);
    }
}
