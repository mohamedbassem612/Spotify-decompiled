package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class nmg1 {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 28;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ee  */
    public static ImageView a(ViewGroup viewGroup, View view, View view2) {
        int iIndexOfChild;
        ViewGroup viewGroup2;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        tik1 tik1Var = rik1.a;
        tik1Var.N(view, matrix);
        tik1Var.O(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        boolean z = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (!zIsAttachedToWindow) {
            if (z) {
                viewGroup2 = (ViewGroup) view.getParent();
                iIndexOfChild = viewGroup2.indexOfChild(view);
                b8k1.b(view, viewGroup);
            }
            if (bitmapCreateBitmap != null) {
                imageView.setImageBitmap(bitmapCreateBitmap);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
            imageView.layout(iRound, iRound2, iRound3, iRound4);
            return imageView;
        }
        iIndexOfChild = 0;
        viewGroup2 = null;
        int iRound5 = Math.round(rectF.width());
        int iRound6 = Math.round(rectF.height());
        if (iRound5 > 0 && iRound6 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
            int iRound7 = Math.round(iRound5 * fMin);
            int iRound8 = Math.round(iRound6 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (a) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = mmg1.c(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        if (bitmapCreateBitmap != null) {
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }
}
