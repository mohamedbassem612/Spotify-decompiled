package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p.a8v;
import p.f0o1;
import p.gk5;
import p.ij5;
import p.kfe1;
import p.mal;
import p.qxe1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AppCompatImageView extends ImageView implements qxe1 {
    private final ij5 a;
    private final gk5 b;
    public boolean c;

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        kfe1.a(getContext(), this);
        ij5 ij5Var = new ij5(this);
        this.a = ij5Var;
        ij5Var.d(attributeSet, i);
        gk5 gk5Var = new gk5(this);
        this.b = gk5Var;
        gk5Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.a();
        }
        gk5 gk5Var = this.b;
        if (gk5Var != null) {
            gk5Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            return ij5Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            return ij5Var.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        mal malVar;
        gk5 gk5Var = this.b;
        if (gk5Var == null || (malVar = gk5Var.b) == null) {
            return null;
        }
        return (ColorStateList) malVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        mal malVar;
        gk5 gk5Var = this.b;
        if (gk5Var == null || (malVar = gk5Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) malVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        gk5 gk5Var = this.b;
        if (gk5Var != null) {
            gk5Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        gk5 gk5Var = this.b;
        if (gk5Var != null && drawable != null && !this.c) {
            gk5Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        gk5 gk5Var2 = this.b;
        if (gk5Var2 != null) {
            gk5Var2.a();
            if (this.c) {
                return;
            }
            gk5 gk5Var3 = this.b;
            ImageView imageView = gk5Var3.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(gk5Var3.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        gk5 gk5Var = this.b;
        if (gk5Var != null) {
            ImageView imageView = gk5Var.a;
            if (i != 0) {
                Drawable drawableJ = f0o1.j(imageView.getContext(), i);
                if (drawableJ != null) {
                    a8v.a(drawableJ);
                }
                imageView.setImageDrawable(drawableJ);
            } else {
                imageView.setImageDrawable(null);
            }
            gk5Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        gk5 gk5Var = this.b;
        if (gk5Var != null) {
            gk5Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.i(mode);
        }
    }

    @Override // p.qxe1
    public void setSupportImageTintList(ColorStateList colorStateList) {
        gk5 gk5Var = this.b;
        if (gk5Var != null) {
            mal malVar = gk5Var.b;
            if (malVar == null) {
                malVar = new mal();
                gk5Var.b = malVar;
            }
            malVar.c = colorStateList;
            malVar.b = true;
            gk5Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        gk5 gk5Var = this.b;
        if (gk5Var != null) {
            mal malVar = gk5Var.b;
            if (malVar == null) {
                malVar = new mal();
                gk5Var.b = malVar;
            }
            malVar.d = mode;
            malVar.a = true;
            gk5Var.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
