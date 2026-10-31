package p;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qic0 extends o5 {
    public float X;
    public n95 Y;
    public ObjectAnimator e;
    public ObjectAnimator f;
    public final Interpolator[] g;
    public final uic0 h;
    public int i;
    public boolean t;
    public static final int[] Z = {533, 567, 850, 750};
    public static final int[] N0 = {1267, 1000, 333, 0};
    public static final nce O0 = new nce(Float.class, "animationFraction", (byte) 9);

    public qic0(Context context, uic0 uic0Var) {
        super(2);
        this.i = 0;
        this.Y = null;
        this.h = uic0Var;
        this.g = new Interpolator[]{AnimationUtils.loadInterpolator(context, 2130837517), AnimationUtils.loadInterpolator(context, 2130837518), AnimationUtils.loadInterpolator(context, 2130837519), AnimationUtils.loadInterpolator(context, 2130837520)};
    }

    public final void D(cca ccaVar) {
        this.Y = ccaVar;
    }

    public final void H() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        m();
        if (((s980) ((o5) this).b).isVisible()) {
            this.f.setFloatValues(this.X, 1.0f);
            this.f.setDuration((long) ((1.0f - this.X) * 1800.0f));
            this.f.start();
        }
    }

    public final void M() {
        ObjectAnimator objectAnimator = this.e;
        nce nceVar = O0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<qic0, Float>) nceVar, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.e.setInterpolator(null);
            this.e.setRepeatCount(-1);
            this.e.addListener(new pic0(this, (byte) 0));
        }
        if (this.f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<qic0, Float>) nceVar, 1.0f);
            this.f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f.setInterpolator(null);
            this.f.addListener(new pic0(this, (byte) 1));
        }
        this.i = 0;
        int iM = ago1.m(this.h.c[0], ((s980) ((o5) this).b).t);
        int[] iArr = (int[]) ((o5) this).d;
        iArr[0] = iM;
        iArr[1] = iM;
        this.e.start();
    }

    public final void O() {
        this.Y = null;
    }

    public final void m() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void v() {
        this.i = 0;
        int iM = ago1.m(this.h.c[0], ((s980) ((o5) this).b).t);
        int[] iArr = (int[]) ((o5) this).d;
        iArr[0] = iM;
        iArr[1] = iM;
    }
}
