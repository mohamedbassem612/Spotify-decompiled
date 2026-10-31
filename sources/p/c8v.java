package p;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class c8v extends Drawable implements Animatable {
    public static final nce X = new nce(Float.class, "growFraction", (byte) 7);
    public final Context a;
    public final eca b;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ArrayList f;
    public boolean g;
    public float h;
    public int t;
    public final Paint i = new Paint();
    public te5 c = new te5();

    public c8v(Context context, eca ecaVar) {
        this.a = context;
        this.b = ecaVar;
        setAlpha(255);
    }

    public final float b() {
        eca ecaVar = this.b;
        if (ecaVar.e == 0 && ecaVar.f == 0) {
            return 1.0f;
        }
        return this.h;
    }

    public final boolean c() {
        ObjectAnimator objectAnimator = this.e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean d() {
        ObjectAnimator objectAnimator = this.d;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        te5 te5Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        te5Var.getClass();
        return f(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean f(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.d;
        byte b = 0;
        nce nceVar = X;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<c8v, Float>) nceVar, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.d.setInterpolator(je5.b);
            ObjectAnimator objectAnimator2 = this.d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                hhg1.n("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.d = objectAnimator2;
            objectAnimator2.addListener(new b8v(this, b));
        }
        byte b2 = 1;
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<c8v, Float>) nceVar, 1.0f, 0.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.e.setInterpolator(je5.b);
            ObjectAnimator objectAnimator3 = this.e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                hhg1.n("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.e = objectAnimator3;
            objectAnimator3.addListener(new b8v(this, b2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.d : this.e;
            if (!z3) {
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z4 = this.g;
                    this.g = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.g = z4;
                }
                return super.setVisible(z, false);
            }
            if (!z3 || !objectAnimator4.isRunning()) {
                boolean z5 = !z || super.setVisible(z, false);
                eca ecaVar = this.b;
                if (!z ? ecaVar.f != 0 : ecaVar.e != 0) {
                    boolean z6 = this.g;
                    this.g = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.g = z6;
                    return z5;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z5;
                }
                objectAnimator4.resume();
                return z5;
            }
        }
        return false;
    }

    public final void g(cca ccaVar) {
        ArrayList arrayList = this.f;
        if (arrayList == null || !arrayList.contains(ccaVar)) {
            return;
        }
        this.f.remove(ccaVar);
        if (this.f.isEmpty()) {
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return d() || c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return e(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
