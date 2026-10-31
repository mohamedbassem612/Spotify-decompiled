package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gmw0 extends FrameLayout {
    public final bmw0 N0;
    public final amw0 O0;
    public dmw0 a;
    public hmw0 b;
    public final ep41 c;
    public final ylw0 d;
    public boolean e;
    public final kdn0 f;
    public final AtomicReference g;
    public final imw0 h;
    public l3d i;
    public final cmw0 t;

    /* JADX WARN: Type inference failed for: r0v6, types: [p.bmw0] */
    public gmw0(Context context) {
        super(context, null, 0, 0);
        this.a = dmw0.PERFORMANCE;
        ylw0 ylw0Var = new ylw0();
        ylw0Var.h = emw0.FILL_CENTER;
        this.d = ylw0Var;
        this.e = true;
        this.f = new kdn0(fmw0.a);
        this.g = new AtomicReference();
        this.h = new imw0(ylw0Var);
        this.t = new cmw0(this);
        this.N0 = new View.OnLayoutChangeListener() { // from class: p.bmw0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                gmw0 gmw0Var = this.a;
                gmw0Var.a();
                w8p1.m();
                gmw0Var.getViewPort();
            }
        };
        this.O0 = new amw0(this);
        w8p1.m();
        Resources.Theme theme = context.getTheme();
        int[] iArr = mmz0.a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        b8k1.o(this, context, iArr, (AttributeSet) null, typedArrayObtainStyledAttributes, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, ylw0Var.h.a);
            for (emw0 emw0Var : emw0.values()) {
                if (emw0Var.a == integer) {
                    setScaleType(emw0Var);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (dmw0 dmw0Var : dmw0.values()) {
                        if (dmw0Var.a == integer2) {
                            setImplementationMode(dmw0Var);
                            typedArrayObtainStyledAttributes.recycle();
                            new qpp0((byte) 24);
                            ViewConfiguration.get(context).getScaledTouchSlop();
                            new GestureDetector(context, (GestureDetector.OnGestureListener) new z62(new p4n1(), (byte) 3));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ep41 ep41Var = new ep41(context, null, 0, 0);
                            ep41Var.setBackgroundColor(-1);
                            ep41Var.setAlpha(0.0f);
                            ep41Var.setElevation(Float.MAX_VALUE);
                            this.c = ep41Var;
                            ep41Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(j4d1 j4d1Var, dmw0 dmw0Var) {
        boolean zEquals = j4d1Var.d.g().i().equals("androidx.camera.camera2.legacy");
        boolean z = (uvt.a.m(SurfaceViewStretchedQuirk.class) == null && uvt.a.m(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z) {
            int iOrdinal = dmw0Var.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                hhg1.g(dmw0Var, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private nr70 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    bhn0.y(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(nr70 nr70Var) {
        j2h1.o("PreviewView");
    }

    public final void a() {
        Rect rect;
        Display display;
        l3d l3dVar;
        w8p1.m();
        if (this.b != null) {
            if (this.e && (display = getDisplay()) != null && (l3dVar = this.i) != null) {
                ylw0 ylw0Var = this.d;
                int iJ = l3dVar.j(display.getRotation());
                int rotation = display.getRotation();
                if (ylw0Var.g) {
                    ylw0Var.c = iJ;
                    ylw0Var.e = rotation;
                }
            }
            this.b.f();
        }
        imw0 imw0Var = this.h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        imw0Var.getClass();
        w8p1.m();
        synchronized (imw0Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = imw0Var.b) != null) {
                    imw0Var.a.a(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getBitmap() {
        w8p1.m();
        hmw0 hmw0Var = this.b;
        if (hmw0Var == null) {
            return null;
        }
        FrameLayout frameLayout = hmw0Var.b;
        Bitmap bitmapB = hmw0Var.b();
        if (bitmapB == null) {
            return null;
        }
        ylw0 ylw0Var = hmw0Var.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!ylw0Var.f()) {
            return bitmapB;
        }
        Matrix matrixD = ylw0Var.d();
        RectF rectFE = ylw0Var.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / ylw0Var.a.getWidth(), rectFE.height() / ylw0Var.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public d3d getController() {
        w8p1.m();
        return null;
    }

    public dmw0 getImplementationMode() {
        w8p1.m();
        return this.a;
    }

    public roj0 getMeteringPointFactory() {
        w8p1.m();
        return this.h;
    }

    public kuq0 getOutputTransform() {
        Matrix matrixC;
        ylw0 ylw0Var = this.d;
        w8p1.m();
        try {
            matrixC = ylw0Var.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = ylw0Var.b;
        if (matrixC == null || rect == null) {
            j2h1.o("PreviewView");
            return null;
        }
        RectF rectF = pfg1.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(pfg1.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.b instanceof hfe1) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            j2h1.M("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new kuq0();
    }

    public ymd0 getPreviewStreamState() {
        return this.f;
    }

    public emw0 getScaleType() {
        w8p1.m();
        return this.d.h;
    }

    public nr70 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        w8p1.m();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        ylw0 ylw0Var = this.d;
        if (!ylw0Var.f()) {
            return null;
        }
        Matrix matrix = new Matrix(ylw0Var.d);
        matrix.postConcat(ylw0Var.c(size, layoutDirection));
        return matrix;
    }

    public haw0 getSurfaceProvider() {
        w8p1.m();
        return this.O0;
    }

    public ydk1 getViewPort() {
        w8p1.m();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        w8p1.m();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new ydk1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.t, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.N0);
        hmw0 hmw0Var = this.b;
        if (hmw0Var != null) {
            hmw0Var.c();
        }
        w8p1.m();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.N0);
        hmw0 hmw0Var = this.b;
        if (hmw0Var != null) {
            hmw0Var.d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.t);
    }

    public void setController(d3d d3dVar) {
        w8p1.m();
        w8p1.m();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(dmw0 dmw0Var) {
        w8p1.m();
        this.a = dmw0Var;
    }

    public void setScaleType(emw0 emw0Var) {
        w8p1.m();
        this.d.h = emw0Var;
        a();
        w8p1.m();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        w8p1.m();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
