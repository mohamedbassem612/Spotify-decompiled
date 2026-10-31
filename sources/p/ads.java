package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ads extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ads(Context context) {
        this.a = (byte) 1;
        this.b = new Paint(1);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, foo1.t(context, 2130969949), Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                canvas.drawColor(((cds) obj2).a.getColor(2131101502));
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int iSave = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth, intrinsicHeight);
                canvas.scale(fMin, fMin);
                canvas.scale(0.33f, 0.33f);
                canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
                break;
            case 1:
                canvas.save();
                canvas.scale(canvas.getWidth(), canvas.getHeight());
                Paint paint = (Paint) obj;
                paint.setShader((LinearGradient) obj2);
                canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, paint);
                canvas.restore();
                break;
            case 2:
                Drawable drawable2 = (Drawable) obj;
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                canvas.drawColor(((Context) obj2).getColor(2131101502));
                float intrinsicWidth2 = drawable2.getIntrinsicWidth();
                float intrinsicHeight2 = drawable2.getIntrinsicHeight();
                int iSave2 = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin2 = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth2, intrinsicHeight2);
                canvas.scale(fMin2, fMin2);
                canvas.scale(0.5f, 0.5f);
                canvas.translate((-intrinsicWidth2) / 2.0f, (-intrinsicHeight2) / 2.0f);
                drawable2.draw(canvas);
                canvas.restoreToCount(iSave2);
                break;
            default:
                Drawable drawable3 = (Drawable) obj2;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
                ((Drawable) obj).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -1;
            case 1:
                return -3;
            case 2:
                return -1;
            default:
                return ((Drawable) this.b).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Drawable) obj).setAlpha(i);
                break;
            case 1:
                ((Paint) obj).setAlpha(i);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i);
                break;
            default:
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                ((Drawable) obj).setAlpha(255 - i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.setBounds(i, i2, i3, i4);
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    drawable.setBounds(i, i2, i3, i4);
                }
                ((Drawable) this.b).setBounds(i, i2, i3, i4);
                break;
            default:
                super.setBounds(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Drawable) obj).setColorFilter(colorFilter);
                break;
            case 1:
                ((Paint) obj).setColorFilter(colorFilter);
                break;
            case 2:
                ((Drawable) obj).setColorFilter(colorFilter);
                break;
            default:
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                ((Drawable) obj).setColorFilter(colorFilter);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.a) {
            case 3:
                super.setBounds(rect);
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                ((Drawable) this.b).setBounds(rect);
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    public ads(Drawable drawable, Drawable drawable2) {
        this.a = (byte) 3;
        this.b = drawable;
        this.c = drawable2;
    }

    public /* synthetic */ ads(Drawable drawable, Object obj, byte b) {
        this.a = b;
        this.b = drawable;
        this.c = obj;
    }
}
