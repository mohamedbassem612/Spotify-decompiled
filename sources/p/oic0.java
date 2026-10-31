package p;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oic0 extends o5 {
    public static final nce X = new nce(Float.class, "animationFraction", (byte) 8);
    public ObjectAnimator e;
    public final hl10 f;
    public final uic0 g;
    public int h;
    public boolean i;
    public float t;

    public oic0(uic0 uic0Var) {
        super(3);
        this.h = 1;
        this.g = uic0Var;
        this.f = new hl10();
    }

    @Override // p.o5
    public final void M() {
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, X, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.e.setInterpolator(null);
            this.e.setRepeatCount(-1);
            this.e.addListener(new d20(this, (byte) 7));
        }
        this.i = true;
        this.h = 1;
        Arrays.fill((int[]) this.d, ago1.m(((eca) this.g).c[0], ((c8v) ((s980) this.b)).t));
        this.e.start();
    }

    @Override // p.o5
    public final void m() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p.o5
    public final void v() {
        this.i = true;
        this.h = 1;
        Arrays.fill((int[]) this.d, ago1.m(((eca) this.g).c[0], ((c8v) ((s980) this.b)).t));
    }
}
