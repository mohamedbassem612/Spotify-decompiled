package p;

import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ncg extends o5 {
    public float X;
    public n95 Y;
    public ObjectAnimator e;
    public ObjectAnimator f;
    public final hl10 g;
    public final ucg h;
    public int i;
    public float t;
    public static final int[] Z = {0, 1350, 2700, 4050};
    public static final int[] N0 = {667, 2017, 3367, 4717};
    public static final int[] O0 = {1000, 2350, 3700, 5050};
    public static final nce P0 = new nce(Float.class, "animationFraction", (byte) 5);
    public static final nce Q0 = new nce(Float.class, "completeEndFraction", (byte) 6);

    public ncg(ucg ucgVar) {
        super(1);
        this.i = 0;
        this.Y = null;
        this.h = ucgVar;
        this.g = new hl10();
    }

    public final void D(cca ccaVar) {
        this.Y = ccaVar;
    }

    public final void H() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((s980) ((o5) this).b).isVisible()) {
            this.f.start();
        } else {
            m();
        }
    }

    public final void M() {
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<ncg, Float>) P0, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.e.setInterpolator(null);
            this.e.setRepeatCount(-1);
            this.e.addListener(new mcg(this, (byte) 0));
        }
        if (this.f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<ncg, Float>) Q0, 0.0f, 1.0f);
            this.f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f.setInterpolator(this.g);
            this.f.addListener(new mcg(this, (byte) 1));
        }
        this.i = 0;
        ((int[]) ((o5) this).d)[0] = ago1.m(this.h.c[0], ((s980) ((o5) this).b).t);
        this.X = 0.0f;
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
        ((int[]) ((o5) this).d)[0] = ago1.m(this.h.c[0], ((s980) ((o5) this).b).t);
        this.X = 0.0f;
    }
}
