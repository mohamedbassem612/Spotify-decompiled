package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x10 extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x10(Drawable drawable, float f, int i, byte b) {
        this(drawable, f);
        this.a = b;
        switch (b) {
            case 2:
                this.b = new og41(f, i, drawable);
                if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
                    hhg1.n("drawable must have an intrinsic size");
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.e;
                    if (drawable3 != null && actionBarContainer.h) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            case 1:
                ng41 ng41Var = (ng41) obj;
                ng41Var.getClass();
                Drawable drawable4 = ng41Var.a;
                float intrinsicWidth = drawable4.getIntrinsicWidth();
                float intrinsicHeight = drawable4.getIntrinsicHeight();
                int iSave = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth, intrinsicHeight);
                canvas.scale(fMin, fMin);
                float f = ng41Var.b;
                canvas.scale(f, f);
                canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
                drawable4.draw(canvas);
                canvas.restoreToCount(iSave);
                break;
            case 2:
                og41 og41Var = (og41) obj;
                Drawable drawable5 = og41Var.a;
                int i = og41Var.c;
                if (i != 0) {
                    canvas.drawColor(i);
                }
                float intrinsicWidth2 = drawable5.getIntrinsicWidth();
                float intrinsicHeight2 = drawable5.getIntrinsicHeight();
                int iSave2 = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin2 = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth2, intrinsicHeight2);
                canvas.scale(fMin2, fMin2);
                float f2 = og41Var.b;
                canvas.scale(f2, f2);
                canvas.translate((-intrinsicWidth2) / 2.0f, (-intrinsicHeight2) / 2.0f);
                drawable5.draw(canvas);
                canvas.restoreToCount(iSave2);
                break;
            default:
                ((Drawable) obj).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        switch (this.a) {
            case 3:
                return ((Drawable) this.b).getChangingConfigurations();
            default:
                return super.getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ng41 ng41Var = (ng41) obj;
                ng41Var.c = getChangingConfigurations();
                return ng41Var;
            case 2:
                og41 og41Var = (og41) obj;
                og41Var.d = getChangingConfigurations();
                return og41Var;
            default:
                return super.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ng41 ng41Var = (ng41) obj;
                return (int) (ng41Var.a.getIntrinsicHeight() / ng41Var.b);
            case 2:
                og41 og41Var = (og41) obj;
                return (int) (og41Var.a.getIntrinsicHeight() / og41Var.b);
            case 3:
                Drawable drawable = (Drawable) obj;
                return Math.max(drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth());
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float intrinsicWidth;
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ng41 ng41Var = (ng41) obj;
                intrinsicWidth = ng41Var.a.getIntrinsicWidth();
                f = ng41Var.b;
                break;
            case 2:
                og41 og41Var = (og41) obj;
                intrinsicWidth = og41Var.a.getIntrinsicWidth();
                f = og41Var.b;
                break;
            case 3:
                return getIntrinsicHeight();
            default:
                return super.getIntrinsicWidth();
        }
        return (int) (intrinsicWidth / f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        float minimumHeight;
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ng41 ng41Var = (ng41) obj;
                minimumHeight = ng41Var.a.getMinimumHeight();
                f = ng41Var.b;
                break;
            case 2:
                og41 og41Var = (og41) obj;
                minimumHeight = og41Var.a.getMinimumHeight();
                f = og41Var.b;
                break;
            default:
                return super.getMinimumHeight();
        }
        return (int) (minimumHeight / f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        float minimumWidth;
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ng41 ng41Var = (ng41) obj;
                minimumWidth = ng41Var.a.getMinimumWidth();
                f = ng41Var.b;
                break;
            case 2:
                og41 og41Var = (og41) obj;
                minimumWidth = og41Var.a.getMinimumWidth();
                f = og41Var.b;
                break;
            default:
                return super.getMinimumWidth();
        }
        return (int) (minimumWidth / f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return 0;
            case 1:
                return ((ng41) obj).a.getOpacity();
            case 2:
                return ((og41) obj).a.getOpacity();
            default:
                return ((Drawable) obj).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f != null) {
                    actionBarContainer.d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return ((ng41) obj).a.getState();
            case 2:
                return ((og41) obj).a.getState();
            case 3:
                return ((Drawable) obj).getState();
            default:
                return super.getState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return ((ng41) obj).a.isStateful();
            case 2:
                return ((og41) obj).a.isStateful();
            case 3:
                return ((Drawable) obj).isStateful();
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((ng41) obj).a.jumpToCurrentState();
                break;
            case 2:
                ((og41) obj).a.jumpToCurrentState();
                break;
            case 3:
                ((Drawable) obj).jumpToCurrentState();
                break;
            default:
                super.jumpToCurrentState();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        switch (this.a) {
            case 1:
                return getConstantState().newDrawable();
            case 2:
                return getConstantState().newDrawable();
            default:
                return super.mutate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 3:
                ((Drawable) this.b).setBounds(rect);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return ((ng41) obj).a.setLevel(i);
            case 2:
                return ((og41) obj).a.setLevel(i);
            default:
                return super.onLevelChange(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return ((ng41) obj).a.setState(iArr);
            case 2:
                return ((og41) obj).a.setState(iArr);
            default:
                return super.onStateChange(iArr);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ((ng41) obj).a.setAlpha(i);
                break;
            case 2:
                ((og41) obj).a.setAlpha(i);
                break;
            default:
                ((Drawable) obj).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ((ng41) obj).a.setColorFilter(colorFilter);
                break;
            case 2:
                ((og41) obj).a.setColorFilter(colorFilter);
                break;
            default:
                ((Drawable) obj).setColorFilter(colorFilter);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return ((ng41) obj).a.setState(iArr);
            case 2:
                return ((og41) obj).a.setState(iArr);
            case 3:
                return ((Drawable) obj).setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public x10(Drawable drawable, float f) {
        this.a = (byte) 1;
        this.b = new ng41(drawable, f);
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            hhg1.n("drawable must have an intrinsic size");
            throw null;
        }
    }

    public /* synthetic */ x10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
