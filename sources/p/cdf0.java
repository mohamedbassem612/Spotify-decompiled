package p;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cdf0 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean q1;
    public static final List r1;
    public static final ThreadPoolExecutor s1;
    public boolean N0;
    public i4k O0;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public xc21 U0;
    public boolean V0;
    public final Matrix W0;
    public String X;
    public Bitmap X0;
    public boolean Y;
    public Canvas Y0;
    public boolean Z;
    public Rect Z0;
    public fcf0 a;
    public RectF a1;
    public final sdf0 b;
    public p9b0 b1;
    public boolean c;
    public Rect c1;
    public boolean d;
    public Rect d1;
    public boolean e;
    public RectF e1;
    public final ArrayList f;
    public RectF f1;
    public eyh0 g;
    public Matrix g1;
    public String h;
    public Matrix h1;
    public ur00 i;
    public boolean i1;
    public jj7 j1;
    public final Semaphore k1;
    public Handler l1;
    public gv40 m1;
    public final n6 n1;
    public float o1;
    public int p1;
    public Map t;

    static {
        q1 = Build.VERSION.SDK_INT <= 25;
        r1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        s1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new rdf0());
    }

    public cdf0() {
        sdf0 sdf0Var = new sdf0();
        sdf0Var.d = 1.0f;
        sdf0Var.e = false;
        sdf0Var.f = 0L;
        sdf0Var.g = 0.0f;
        sdf0Var.h = 0.0f;
        sdf0Var.i = 0;
        sdf0Var.t = -2.1474836E9f;
        sdf0Var.X = 2.1474836E9f;
        sdf0Var.Z = false;
        sdf0Var.N0 = false;
        this.b = sdf0Var;
        this.c = true;
        this.d = false;
        this.e = false;
        this.p1 = 1;
        this.f = new ArrayList();
        this.Z = false;
        this.N0 = true;
        this.P0 = 255;
        this.T0 = false;
        this.U0 = xc21.a;
        this.V0 = false;
        this.W0 = new Matrix();
        this.i1 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: p.ycf0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cdf0 cdf0Var = this.a;
                jj7 jj7Var = cdf0Var.j1;
                if (jj7Var == null) {
                    jj7Var = jj7.a;
                }
                if (jj7Var == jj7.b) {
                    cdf0Var.invalidateSelf();
                    return;
                }
                i4k i4kVar = cdf0Var.O0;
                if (i4kVar != null) {
                    i4kVar.r(cdf0Var.b.j());
                }
            }
        };
        this.k1 = new Semaphore(1);
        this.n1 = new n6(this, (byte) 8);
        this.o1 = -3.4028235E38f;
        sdf0Var.addUpdateListener(animatorUpdateListener);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(kpa0 kpa0Var, Object obj, j2e0 j2e0Var) {
        List list;
        i4k i4kVar = this.O0;
        if (i4kVar == null) {
            this.f.add(new ucf0(this, kpa0Var, obj, j2e0Var));
            return;
        }
        boolean zIsEmpty = true;
        if (kpa0Var == kpa0.c) {
            i4kVar.g(obj, j2e0Var);
        } else if (kpa0Var.c() != null) {
            kpa0Var.c().g(obj, j2e0Var);
        } else {
            if (this.O0 == null) {
                nue0.c("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                this.O0.e(kpa0Var, 0, arrayList, new kpa0(new String[0]));
                list = arrayList;
            }
            for (int i = 0; i < list.size(); i++) {
                ((kpa0) list.get(i)).c().g(obj, j2e0Var);
            }
            zIsEmpty = true ^ list.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == ndf0.z) {
                v(this.b.j());
            }
        }
    }

    public final boolean b() {
        return this.c || this.d;
    }

    public final void c() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return;
        }
        ye90 ye90Var = skb0.a;
        Rect rect = fcf0Var.k;
        List list = Collections.EMPTY_LIST;
        i4k i4kVar = new i4k(this, new qkb0(list, fcf0Var, "__container", -1L, 1, -1L, null, list, new w95(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), fcf0Var.j, fcf0Var);
        this.O0 = i4kVar;
        if (this.R0) {
            i4kVar.q(true);
        }
        this.O0.I = this.N0;
    }

    public final void d() {
        sdf0 sdf0Var = this.b;
        if (sdf0Var.Z) {
            sdf0Var.cancel();
            if (!isVisible()) {
                this.p1 = 1;
            }
        }
        this.a = null;
        this.O0 = null;
        this.g = null;
        this.o1 = -3.4028235E38f;
        sdf0Var.Y = null;
        sdf0Var.t = -2.1474836E9f;
        sdf0Var.X = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        i4k i4kVar = this.O0;
        if (i4kVar == null) {
            return;
        }
        jj7 jj7Var = this.j1;
        if (jj7Var == null) {
            jj7Var = jj7.a;
        }
        boolean z = jj7Var == jj7.b;
        n6 n6Var = this.n1;
        ThreadPoolExecutor threadPoolExecutor = s1;
        sdf0 sdf0Var = this.b;
        Semaphore semaphore = this.k1;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (i4kVar.H == sdf0Var.j()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (i4kVar.H != sdf0Var.j()) {
                        threadPoolExecutor.execute(n6Var);
                    }
                }
                throw th;
            }
        }
        if (z && y()) {
            v(sdf0Var.j());
        }
        boolean z2 = this.e;
        boolean z3 = this.V0;
        if (z2) {
            try {
                if (z3) {
                    l(canvas, i4kVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                nue0.b();
            }
        } else if (z3) {
            l(canvas, i4kVar);
        } else {
            g(canvas);
        }
        this.i1 = false;
        if (z) {
            semaphore.release();
            if (i4kVar.H == sdf0Var.j()) {
                return;
            }
            threadPoolExecutor.execute(n6Var);
        }
    }

    public final void e() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return;
        }
        xc21 xc21Var = this.U0;
        int i = Build.VERSION.SDK_INT;
        boolean z = fcf0Var.o;
        int i2 = fcf0Var.f33p;
        int iOrdinal = xc21Var.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.V0 = z2;
    }

    public final void g(Canvas canvas) {
        i4k i4kVar = this.O0;
        fcf0 fcf0Var = this.a;
        if (i4kVar == null || fcf0Var == null) {
            return;
        }
        Matrix matrix = this.W0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / fcf0Var.k.width(), bounds.height() / fcf0Var.k.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        i4kVar.f(canvas, matrix, this.P0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.P0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return -1;
        }
        return fcf0Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return -1;
        }
        return fcf0Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        this.f.clear();
        sdf0 sdf0Var = this.b;
        sdf0Var.q(true);
        sdf0Var.b(sdf0Var.n());
        if (isVisible()) {
            return;
        }
        this.p1 = 1;
    }

    public final ur00 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.i == null) {
            ur00 ur00Var = new ur00(getCallback());
            this.i = ur00Var;
            String str = this.X;
            if (str != null) {
                ur00Var.y(str);
            }
        }
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.i1) {
            return;
        }
        this.i1 = true;
        if ((!q1 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        sdf0 sdf0Var = this.b;
        if (sdf0Var == null) {
            return false;
        }
        return sdf0Var.Z;
    }

    public final void j() {
        this.f.clear();
        sdf0 sdf0Var = this.b;
        sdf0Var.q(true);
        sdf0Var.d();
        if (isVisible()) {
            return;
        }
        this.p1 = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.animation.ValueAnimator, android.view.Choreographer$FrameCallback, p.jba, p.sdf0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k() {
        if (this.O0 == null) {
            this.f.add(new bdf0() { // from class: p.zcf0
                public final void run() {
                    this.a.k();
                }
            });
            return;
        }
        e();
        boolean zB = b();
        ?? r2 = this.b;
        if (zB || r2.getRepeatCount() == 0) {
            if (isVisible()) {
                r2.Z = true;
                r2.h(r2.n());
                r2.r((int) (r2.n() ? r2.k() : r2.l()));
                r2.f = 0L;
                r2.i = 0;
                if (r2.Z) {
                    r2.q(false);
                    Choreographer.getInstance().postFrameCallback(r2);
                }
                this.p1 = 1;
            } else {
                this.p1 = 2;
            }
        }
        if (b()) {
            return;
        }
        Iterator it = r1.iterator();
        ntg0 ntg0VarD = null;
        while (it.hasNext()) {
            ntg0VarD = this.a.d((String) it.next());
            if (ntg0VarD != null) {
                break;
            }
        }
        if (ntg0VarD != null) {
            o((int) ntg0VarD.b);
        } else {
            o((int) (r2.d < 0.0f ? r2.l() : r2.k()));
        }
        r2.q(true);
        r2.b(r2.n());
        if (isVisible()) {
            return;
        }
        this.p1 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void l(Canvas canvas, i4k i4kVar) {
        boolean z;
        if (this.a == null || i4kVar == null) {
            return;
        }
        if (this.Y0 == null) {
            this.Y0 = new Canvas();
            this.f1 = new RectF();
            this.g1 = new Matrix();
            this.h1 = new Matrix();
            this.Z0 = new Rect();
            this.a1 = new RectF();
            this.b1 = new p9b0();
            this.c1 = new Rect();
            this.d1 = new Rect();
            this.e1 = new RectF();
        }
        canvas.getMatrix(this.g1);
        canvas.getClipBounds(this.Z0);
        Rect rect = this.Z0;
        this.a1.set(rect.left, rect.top, rect.right, rect.bottom);
        this.g1.mapRect(this.a1);
        f(this.Z0, this.a1);
        boolean z2 = this.N0;
        RectF rectF = this.f1;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            i4kVar.c(rectF, null, false);
        }
        this.g1.mapRect(this.f1);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.f1;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.f1;
            Rect rect2 = this.Z0;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f1.width());
        int iCeil2 = (int) Math.ceil(this.f1.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.X0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.X0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.X0 = bitmapCreateBitmap;
            this.Y0.setBitmap(bitmapCreateBitmap);
            this.i1 = true;
        } else if (this.X0.getWidth() > iCeil || this.X0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.X0, 0, 0, iCeil, iCeil2);
            this.X0 = bitmapCreateBitmap2;
            this.Y0.setBitmap(bitmapCreateBitmap2);
            this.i1 = true;
        }
        if (this.i1) {
            Matrix matrix = this.g1;
            Matrix matrix2 = this.W0;
            matrix2.set(matrix);
            matrix2.preScale(fWidth, fHeight);
            RectF rectF4 = this.f1;
            matrix2.postTranslate(-rectF4.left, -rectF4.top);
            this.X0.eraseColor(0);
            i4kVar.f(this.Y0, matrix2, this.P0);
            this.g1.invert(this.h1);
            this.h1.mapRect(this.e1, this.f1);
            f(this.d1, this.e1);
        }
        this.c1.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.X0, this.c1, this.d1, this.b1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.animation.ValueAnimator, android.view.Choreographer$FrameCallback, p.jba, p.sdf0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        if (this.O0 == null) {
            this.f.add(new xcf0(this));
            return;
        }
        e();
        boolean zB = b();
        ?? r2 = this.b;
        if (zB || r2.getRepeatCount() == 0) {
            if (isVisible()) {
                r2.Z = true;
                r2.q(false);
                Choreographer.getInstance().postFrameCallback(r2);
                r2.f = 0L;
                if (r2.n() && r2.h == r2.l()) {
                    r2.r(r2.k());
                } else if (!r2.n() && r2.h == r2.k()) {
                    r2.r(r2.l());
                }
                r2.g();
                this.p1 = 1;
            } else {
                this.p1 = 3;
            }
        }
        if (b()) {
            return;
        }
        o((int) (r2.d < 0.0f ? r2.l() : r2.k()));
        r2.q(true);
        r2.b(r2.n());
        if (isVisible()) {
            return;
        }
        this.p1 = 1;
    }

    public final boolean n(fcf0 fcf0Var) {
        if (this.a == fcf0Var) {
            return false;
        }
        this.i1 = true;
        d();
        this.a = fcf0Var;
        c();
        sdf0 sdf0Var = this.b;
        boolean z = sdf0Var.Y == null;
        sdf0Var.Y = fcf0Var;
        if (z) {
            sdf0Var.s(Math.max(sdf0Var.t, fcf0Var.l), Math.min(sdf0Var.X, fcf0Var.m));
        } else {
            sdf0Var.s((int) fcf0Var.l, (int) fcf0Var.m);
        }
        float f = sdf0Var.h;
        sdf0Var.h = 0.0f;
        sdf0Var.g = 0.0f;
        sdf0Var.r((int) f);
        sdf0Var.i();
        v(sdf0Var.getAnimatedFraction());
        ArrayList arrayList = this.f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            bdf0 bdf0Var = (bdf0) it.next();
            if (bdf0Var != null) {
                bdf0Var.run();
            }
            it.remove();
        }
        arrayList.clear();
        fcf0Var.a.a = this.Q0;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void o(int i) {
        if (this.a != null) {
            this.b.r(i);
        } else {
            this.f.add(new tcf0(this, i, (byte) 0));
        }
    }

    public final void p(int i) {
        if (this.a == null) {
            this.f.add(new tcf0(this, i, (byte) 1));
        } else {
            sdf0 sdf0Var = this.b;
            sdf0Var.s(sdf0Var.t, i + 0.99f);
        }
    }

    public final void q(String str) {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            this.f.add(new scf0(this, str, (byte) 1));
            return;
        }
        ntg0 ntg0VarD = fcf0Var.d(str);
        if (ntg0VarD != null) {
            p((int) (ntg0VarD.b + ntg0VarD.c));
        } else {
            hhg1.n(f4i1.f("Cannot find marker with name ", str, "."));
        }
    }

    public final void r(int i, int i2) {
        if (this.a == null) {
            this.f.add(new wcf0(this, i, i2));
        } else {
            this.b.s(i, i2 + 0.99f);
        }
    }

    public final void s(String str) {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            this.f.add(new scf0(this, str, (byte) 0));
            return;
        }
        ntg0 ntg0VarD = fcf0Var.d(str);
        if (ntg0VarD == null) {
            hhg1.n(f4i1.f("Cannot find marker with name ", str, "."));
        } else {
            int i = (int) ntg0VarD.b;
            r(i, ((int) ntg0VarD.c) + i);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.P0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        nue0.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.p1;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                m();
                return visible;
            }
        } else {
            if (this.b.Z) {
                j();
                this.p1 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.p1 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        h();
    }

    public final void t(int i) {
        if (this.a == null) {
            this.f.add(new tcf0(this, i, (byte) 2));
        } else {
            sdf0 sdf0Var = this.b;
            sdf0Var.s(i, (int) sdf0Var.X);
        }
    }

    public final void u(String str) {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            this.f.add(new scf0(this, str, (byte) 2));
            return;
        }
        ntg0 ntg0VarD = fcf0Var.d(str);
        if (ntg0VarD != null) {
            t((int) ntg0VarD.b);
        } else {
            hhg1.n(f4i1.f("Cannot find marker with name ", str, "."));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final float f) {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            this.f.add(new bdf0() { // from class: p.adf0
                public final void run() {
                    this.a.v(f);
                }
            });
        } else {
            this.b.r(itj0.e(fcf0Var.l, fcf0Var.m, f));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w(int i) {
        this.b.setRepeatCount(i);
    }

    public final void x(int i) {
        this.b.setRepeatMode(i);
    }

    public final boolean y() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return false;
        }
        float f = this.o1;
        float fJ = this.b.j();
        this.o1 = fJ;
        return Math.abs(fJ - f) * fcf0Var.b() >= 50.0f;
    }
}
