package p;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kl10 extends f611 implements j611 {
    public static final int[] c1 = {R.attr.state_pressed};
    public static final int[] d1 = new int[0];
    public int N0;
    public int O0;
    public float P0;
    public final RecyclerView S0;
    public int X;
    public int Y;
    public float Z;
    public final ValueAnimator Z0;
    public final int a;
    public byte a1;
    public final int b;
    public final a6n b1;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int t;
    public int Q0 = 0;
    public int R0 = 0;
    public boolean T0 = false;
    public boolean U0 = false;
    public byte V0 = 0;
    public byte W0 = 0;
    public final int[] X0 = new int[2];
    public final int[] Y0 = new int[2];

    public kl10(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z0 = valueAnimatorOfFloat;
        this.a1 = (byte) 0;
        a6n a6nVar = new a6n(this, (byte) 21);
        this.b1 = a6nVar;
        zl7 zl7Var = new zl7(this, (byte) 5);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.t = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new jl10(this));
        valueAnimatorOfFloat.addUpdateListener(new kb5(this, (byte) 10));
        RecyclerView recyclerView2 = this.S0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.n0(this);
            RecyclerView recyclerView3 = this.S0;
            recyclerView3.T0.remove(this);
            if (recyclerView3.U0 == this) {
                recyclerView3.U0 = null;
            }
            this.S0.p0(zl7Var);
            this.S0.removeCallbacks(a6nVar);
        }
        this.S0 = recyclerView;
        recyclerView.j(this);
        this.S0.l(this);
        this.S0.m(zl7Var);
    }

    public static int k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // p.j611
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        byte b = this.V0;
        if (b != 1) {
            return b == 2;
        }
        boolean zJ = j(motionEvent.getX(), motionEvent.getY());
        boolean zI = i(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zJ && !zI) {
            return false;
        }
        if (zI) {
            this.W0 = (byte) 1;
            this.P0 = (int) motionEvent.getX();
        } else if (zJ) {
            this.W0 = (byte) 2;
            this.Z = (int) motionEvent.getY();
        }
        l(2);
        return true;
    }

    @Override // p.j611
    public final void f(MotionEvent motionEvent) {
        if (this.V0 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (zJ || zI) {
                if (zI) {
                    this.W0 = (byte) 1;
                    this.P0 = (int) motionEvent.getX();
                } else if (zJ) {
                    this.W0 = (byte) 2;
                    this.Z = (int) motionEvent.getY();
                }
                l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.V0 == 2) {
            this.Z = 0.0f;
            this.P0 = 0.0f;
            l(1);
            this.W0 = (byte) 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.V0 == 2) {
            m();
            byte b = this.W0;
            RecyclerView recyclerView = this.S0;
            int i = this.b;
            if (b == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.Y0;
                iArr[0] = i;
                int i2 = this.Q0 - i;
                iArr[1] = i2;
                float fMax = Math.max(i, Math.min(i2, x));
                if (Math.abs(this.O0 - fMax) >= 2.0f) {
                    int iK = k(this.P0, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.Q0);
                    if (iK != 0) {
                        recyclerView.scrollBy(iK, 0);
                    }
                    this.P0 = fMax;
                }
            }
            if (this.W0 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.X0;
                iArr2[0] = i;
                int i3 = this.R0 - i;
                iArr2[1] = i3;
                float fMax2 = Math.max(i, Math.min(i3, y));
                if (Math.abs(this.Y - fMax2) < 2.0f) {
                    return;
                }
                int iK2 = k(this.Z, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.R0);
                if (iK2 != 0) {
                    recyclerView.scrollBy(0, iK2);
                }
                this.Z = fMax2;
            }
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        int i = this.Q0;
        RecyclerView recyclerView2 = this.S0;
        if (i != recyclerView2.getWidth() || this.R0 != recyclerView2.getHeight()) {
            this.Q0 = recyclerView2.getWidth();
            this.R0 = recyclerView2.getHeight();
            l(0);
            return;
        }
        if (this.a1 != 0) {
            if (this.T0) {
                int i2 = this.Q0;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.Y;
                int i6 = this.X;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f;
                int i9 = this.R0;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = b8k1.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.U0) {
                int i10 = this.R0;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.O0;
                int i14 = this.N0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.Q0;
                int i17 = this.t;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean i(float f, float f2) {
        if (f2 < this.R0 - this.i) {
            return false;
        }
        int i = this.O0;
        int i2 = this.N0;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean j(float f, float f2) {
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = this.S0.getLayoutDirection();
        int i = this.e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.Q0 - i) {
            return false;
        }
        int i2 = this.Y;
        int i3 = this.X / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        RecyclerView recyclerView = this.S0;
        a6n a6nVar = this.b1;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.V0 != 2) {
            stateListDrawable.setState(c1);
            recyclerView.removeCallbacks(a6nVar);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            m();
        }
        if (this.V0 == 2 && i != 2) {
            stateListDrawable.setState(d1);
            recyclerView.removeCallbacks(a6nVar);
            recyclerView.postDelayed(a6nVar, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(a6nVar);
            recyclerView.postDelayed(a6nVar, 1500L);
        }
        this.V0 = i;
    }

    public final void m() {
        byte b = this.a1;
        ValueAnimator valueAnimator = this.Z0;
        if (b != 0) {
            if (b != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.a1 = (byte) 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p.j611
    public final void d(boolean z) {
    }
}
