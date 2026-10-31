package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ns70 extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ns70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((oq70) obj).c(canvas);
                break;
            default:
                ((Drawable) obj).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.b).getChangingConfigurations();
            default:
                return super.getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                return Math.max(drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth());
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return getIntrinsicHeight();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((Drawable) this.b).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.b).getState();
            default:
                return super.getState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.b).isStateful();
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        switch (this.a) {
            case 1:
                ((Drawable) this.b).jumpToCurrentState();
                break;
            default:
                super.jumpToCurrentState();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 1:
                ((Drawable) this.b).setBounds(rect);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((Drawable) this.b).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((Drawable) this.b).setColorFilter(colorFilter);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        switch (this.a) {
            case 1:
                return ((Drawable) this.b).setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
