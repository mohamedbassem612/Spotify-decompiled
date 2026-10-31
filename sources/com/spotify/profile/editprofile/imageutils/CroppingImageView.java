package com.spotify.profile.editprofile.imageutils;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import kotlin.Metadata;
import p.a7h1;
import p.b7x;
import p.ewn0;
import p.i8h1;
import p.k8o;
import p.ktd;
import p.r0w;
import p.r6h1;
import p.u890;
import p.w7h1;
import p.x6h1;
import p.x7h1;
import p.xj61;
import p.y6h1;
import p.z7h1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/spotify/profile/editprofile/imageutils/CroppingImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/RectF;", "getNormalizedRect", "()Landroid/graphics/RectF;", "normalizedRect", "p/ewn0", "p/k8o", "src_main_java_com_spotify_profile_editprofile_imageutils-imageutils"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CroppingImageView extends AppCompatImageView implements View.OnTouchListener {
    public static final /* synthetic */ int d1 = 0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public boolean U0;
    public boolean V0;
    public float W0;
    public float X0;
    public float Y0;
    public int Z0;
    public int a1;
    public int b1;
    public ewn0 c1;
    public int d;
    public int e;
    public ScaleGestureDetector f;
    public final Matrix g;
    public final Paint h;
    public Bitmap i;
    public RectF t;

    public CroppingImageView(Context context) {
        super(context);
        this.g = new Matrix();
        this.h = new Paint();
        e(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        int i;
        int i2;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        this.a1 = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.b1 = intrinsicHeight;
        int i3 = this.a1;
        if (i3 == 0 || intrinsicHeight == 0 || (i = this.d) == 0 || (i2 = this.e) == 0) {
            return;
        }
        float fMax = Math.max(i / i3, i2 / intrinsicHeight);
        this.S0 = fMax;
        this.T0 = 10.0f * fMax;
        RectF rectF = this.t;
        if (rectF != null) {
            float fMax2 = fMax / Math.max(rectF.width(), rectF.height());
            this.N0 = fMax2;
            this.O0 = (-this.a1) * fMax2 * rectF.left;
            this.P0 = (-this.b1) * fMax2 * rectF.top;
            this.t = null;
        }
        if (this.N0 < 1.0E-4f) {
            float f = this.S0;
            this.N0 = f;
            this.O0 = ktd.e(this.a1, f, this.d, 2.0f);
            this.P0 = ktd.e(this.b1, f, this.e, 2.0f);
        }
        d();
        float f2 = this.N0;
        Matrix matrix = this.g;
        matrix.setScale(f2, f2);
        matrix.postTranslate(this.O0, this.P0);
        setImageMatrix(matrix);
    }

    public final void d() {
        float f = this.N0;
        float f2 = this.S0;
        if (f < f2) {
            this.N0 = f2;
            f = f2;
        }
        float f3 = this.T0;
        if (f > f3) {
            this.N0 = f3;
            f = f3;
        }
        float f4 = this.O0;
        if (f4 > 0.0f) {
            this.O0 = 0.0f;
        } else {
            int i = this.a1;
            float f5 = (i * f) + f4;
            int i2 = this.d;
            if (f5 < i2) {
                this.O0 = i2 - (i * f);
            }
        }
        float f6 = this.P0;
        if (f6 > 0.0f) {
            this.P0 = 0.0f;
            return;
        }
        int i3 = this.b1;
        float f7 = (i3 * f) + f6;
        int i4 = this.e;
        if (f7 < i4) {
            this.P0 = i4 - (i3 * f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Context context) {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f = new ScaleGestureDetector(context, new k8o(this));
        setOnTouchListener(this);
    }

    public final RectF getNormalizedRect() {
        int i = this.a1;
        if (i <= 0 && this.b1 <= 0) {
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        float f = -this.O0;
        float f2 = this.N0;
        float f3 = (f / f2) / i;
        float f4 = (-this.P0) / f2;
        int i2 = this.b1;
        float f5 = f4 / i2;
        return new RectF(f3, f5, ((this.d / f2) / i) + f3, ((this.e / f2) / i2) + f5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (this.d <= 0 || this.e <= 0) {
            return;
        }
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            bitmap.getClass();
            if (bitmap.isRecycled()) {
                Context context = getContext();
                int i = this.d;
                int i2 = this.e;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColor(context.getColor(2131103107));
                float f = i;
                float f2 = i2;
                canvas2.drawRect(0.0f, 0.0f, f, f2, paint);
                paint.setColor(context.getColor(R.color.transparent));
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawCircle(f / 2.0f, f2 / 2.0f, Math.min(i, i2) / 2.0f, paint);
                this.i = bitmapCreateBitmap;
            }
        } else {
            Context context2 = getContext();
            int i3 = this.d;
            int i4 = this.e;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
            Paint paint2 = new Paint();
            paint2.setColor(context2.getColor(2131103107));
            float f3 = i3;
            float f4 = i4;
            canvas3.drawRect(0.0f, 0.0f, f3, f4, paint2);
            paint2.setColor(context2.getColor(R.color.transparent));
            paint2.setAntiAlias(true);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas3.drawCircle(f3 / 2.0f, f4 / 2.0f, Math.min(i3, i4) / 2.0f, paint2);
            this.i = bitmapCreateBitmap2;
        }
        Bitmap bitmap2 = this.i;
        if (bitmap2 != null) {
            bitmap2.getClass();
            if (bitmap2.isRecycled()) {
                return;
            }
            Bitmap bitmap3 = this.i;
            bitmap3.getClass();
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null) {
            super/*android.view.View*/.onRestoreInstanceState(null);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.t = (RectF) bundle.getParcelable("normalized_rect");
        super/*android.view.View*/.onRestoreInstanceState(bundle.getParcelable("super_state"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("normalized_rect", getNormalizedRect());
        bundle.putParcelable("super_state", super/*android.view.View*/.onSaveInstanceState());
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.d = i;
        this.e = i2;
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            bitmap.recycle();
            this.i = null;
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ewn0 ewn0Var;
        ScaleGestureDetector scaleGestureDetector = this.f;
        if (scaleGestureDetector == null) {
            u890.C("scaleDetector");
            throw null;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.U0) {
                this.X0 = motionEvent.getX();
                this.Y0 = motionEvent.getY();
                this.Z0 = motionEvent.getActionIndex();
                this.U0 = true;
            }
        } else if (action == 1) {
            if (this.U0 && this.Z0 == motionEvent.getActionIndex()) {
                ewn0Var = this.c1;
                if (ewn0Var != null) {
                    r0w r0wVarP0 = ((PictureSelectionActivity) ewn0Var.b).p0();
                    i8h1 i8h1Var = r0wVarP0.a;
                    x6h1 x6h1VarC = r0wVarP0.b.b.c();
                    x6h1VarC.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    b7x b7xVar = b7x.a;
                    String str = i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("move_image", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                }
                this.U0 = false;
            }
        } else if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    if (this.U0) {
                        ewn0Var = this.c1;
                        if (ewn0Var != null) {
                            r0w r0wVarP1 = ((PictureSelectionActivity) ewn0Var.b).p0();
                            i8h1 i8h1Var2 = r0wVarP1.a;
                            x6h1 x6h1VarC3 = r0wVarP1.b.b.c();
                            x6h1VarC3.i.add(new a7h1("image_preview_dialog", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                            x6h1VarC4.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            y6h1 y6h1VarA2 = x6h1VarC4.a();
                            b7x b7xVar2 = b7x.a;
                            String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("drag", 1, b7xVar2), new x7h1("move_image", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                        }
                        this.U0 = false;
                    }
                }
            } else if (!this.U0) {
                this.X0 = motionEvent.getX();
                this.Y0 = motionEvent.getY();
                this.Z0 = motionEvent.getActionIndex();
                this.U0 = true;
            }
        } else if (this.U0 && this.Z0 == motionEvent.getActionIndex()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!this.V0) {
                this.O0 = (x - this.X0) + this.O0;
                this.P0 = (y - this.Y0) + this.P0;
                d();
            }
            this.X0 = x;
            this.Y0 = y;
        }
        float f = this.N0;
        Matrix matrix = this.g;
        matrix.setScale(f, f);
        matrix.postTranslate(this.O0, this.P0);
        setImageMatrix(matrix);
        return true;
    }

    public CroppingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new Matrix();
        this.h = new Paint();
        e(context);
    }

    public CroppingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Matrix();
        this.h = new Paint();
        e(context);
    }
}
