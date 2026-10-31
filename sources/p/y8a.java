package p;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y8a extends wne {
    public long N0;
    public duf0 O0;
    public duf0 P0;
    public float Q0;
    public float R0;
    public float X;
    public u8a Y;
    public VelocityTracker Z;
    public Matrix e;
    public Matrix f;
    public duf0 g;
    public duf0 h;
    public float i;
    public float t;

    public static float e(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final duf0 a(float f, float f2) {
        q8a q8aVar = this.d;
        zdk1 viewPortHandler = q8aVar.getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return duf0.b(f3, -((q8aVar.getMeasuredHeight() - f2) - (viewPortHandler.d - viewPortHandler.b.bottom)));
    }

    public final void b() {
        q8a q8aVar = this.d;
        if (this.Y == null) {
            q8aVar.u1.getClass();
            q8aVar.v1.getClass();
        }
        u8a u8aVar = this.Y;
        if (u8aVar != null) {
            q8aVar.g(u8aVar.d);
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.e.set(this.f);
        this.d.getOnChartGestureListener();
        b();
        float x = motionEvent.getX();
        duf0 duf0Var = this.g;
        this.e.postTranslate(x - duf0Var.b, motionEvent.getY() - duf0Var.c);
    }

    public final void d(MotionEvent motionEvent) {
        this.f.set(this.e);
        duf0 duf0Var = this.g;
        duf0Var.b = motionEvent.getX();
        duf0Var.c = motionEvent.getY();
        q8a q8aVar = this.d;
        i960 i960VarB = q8aVar.b(motionEvent.getX(), motionEvent.getY());
        this.Y = i960VarB != null ? (u8a) ((z8a) q8aVar.b).b(i960VarB.e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        q8a q8aVar = this.d;
        q8aVar.getOnChartGestureListener();
        if (q8aVar.i1 && ((z8a) q8aVar.getData()).d() > 0) {
            duf0 duf0VarA = a(motionEvent.getX(), motionEvent.getY());
            float f = q8aVar.l1 ? 1.4f : 1.0f;
            float f2 = q8aVar.m1 ? 1.4f : 1.0f;
            float f3 = duf0VarA.b;
            float f4 = duf0VarA.c;
            zdk1 zdk1Var = q8aVar.U0;
            Matrix matrix = q8aVar.C1;
            zdk1Var.getClass();
            matrix.reset();
            matrix.set(zdk1Var.a);
            matrix.postScale(f, f2, f3, -f4);
            zdk1Var.d(matrix, q8aVar, false);
            q8aVar.a();
            q8aVar.postInvalidate();
            boolean z = q8aVar.a;
            duf0.d.c(duf0VarA);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d.getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.d.getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q8a q8aVar = this.d;
        q8aVar.getOnChartGestureListener();
        if (!q8aVar.c) {
            return false;
        }
        i960 i960VarB = q8aVar.b(motionEvent.getX(), motionEvent.getY());
        if (i960VarB == null || i960VarB.a(this.b)) {
            q8aVar.c(null);
            this.b = null;
        } else {
            q8aVar.c(i960VarB);
            this.b = i960VarB;
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i960 i960VarB;
        VelocityTracker velocityTracker;
        duf0 duf0Var = this.P0;
        duf0 duf0Var2 = this.O0;
        duf0 duf0Var3 = this.g;
        duf0 duf0Var4 = this.h;
        x8a x8aVar = this.d;
        VelocityTracker velocityTrackerObtain = this.Z;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.Z = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.Z) != null) {
            velocityTracker.recycle();
            this.Z = null;
        }
        if (this.a == 0) {
            this.c.onTouchEvent(motionEvent);
        }
        if (!x8aVar.k1 && !x8aVar.l1 && !x8aVar.m1) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.Z;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, npi1.c);
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > npi1.b || Math.abs(yVelocity) > npi1.b) && this.a == 1 && x8aVar.d) {
                    duf0Var.b = 0.0f;
                    duf0Var.c = 0.0f;
                    this.N0 = AnimationUtils.currentAnimationTimeMillis();
                    duf0Var2.b = motionEvent.getX();
                    duf0Var2.c = motionEvent.getY();
                    duf0Var.b = xVelocity;
                    duf0Var.c = yVelocity;
                    x8aVar.postInvalidateOnAnimation();
                }
                int i2 = this.a;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    x8aVar.a();
                    x8aVar.postInvalidate();
                }
                this.a = 0;
                ViewParent parent = x8aVar.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.Z;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.Z = null;
                }
                x8aVar.getOnChartGestureListener();
            } else if (action == 2) {
                int i3 = this.a;
                if (i3 == 1) {
                    ViewParent parent2 = x8aVar.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    c(motionEvent);
                } else {
                    if (i3 == 2 || i3 == 3 || i3 == 4) {
                        ViewParent parent3 = x8aVar.getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        if (x8aVar.l1 || x8aVar.m1) {
                            Matrix matrix = this.f;
                            if (motionEvent.getPointerCount() >= 2) {
                                x8aVar.getOnChartGestureListener();
                                float fE = e(motionEvent);
                                if (fE > this.R0) {
                                    duf0 duf0VarA = a(duf0Var4.b, duf0Var4.c);
                                    zdk1 viewPortHandler = x8aVar.getViewPortHandler();
                                    int i4 = this.a;
                                    if (i4 == 4) {
                                        float f = fE / this.X;
                                        boolean z = f < 1.0f;
                                        boolean z2 = !z ? viewPortHandler.g >= viewPortHandler.f : viewPortHandler.g <= viewPortHandler.e;
                                        if (!z ? viewPortHandler.h < Float.MAX_VALUE : viewPortHandler.h > 1.0f) {
                                            i = 1;
                                        }
                                        float f2 = x8aVar.l1 ? f : 1.0f;
                                        float f3 = x8aVar.m1 ? f : 1.0f;
                                        if (i != 0 || z2) {
                                            this.e.set(matrix);
                                            this.e.postScale(f2, f3, duf0VarA.b, duf0VarA.c);
                                        }
                                    } else if (i4 == 2 && x8aVar.l1) {
                                        float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.i;
                                        if (fAbs >= 1.0f ? viewPortHandler.g < viewPortHandler.f : viewPortHandler.g > viewPortHandler.e) {
                                            this.e.set(matrix);
                                            this.e.postScale(fAbs, 1.0f, duf0VarA.b, duf0VarA.c);
                                        }
                                    } else if (i4 == 3 && x8aVar.m1) {
                                        float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.t;
                                        if (fAbs2 >= 1.0f ? viewPortHandler.h < Float.MAX_VALUE : viewPortHandler.h > 1.0f) {
                                            this.e.set(matrix);
                                            this.e.postScale(1.0f, fAbs2, duf0VarA.b, duf0VarA.c);
                                        }
                                    }
                                    duf0.d.c(duf0VarA);
                                }
                            }
                        }
                    } else if (i3 == 0) {
                        float x = motionEvent.getX() - duf0Var3.b;
                        float y = motionEvent.getY() - duf0Var3.c;
                        if (Math.abs((float) Math.sqrt((y * y) + (x * x))) > this.Q0) {
                            zdk1 zdk1Var = x8aVar.U0;
                            if (zdk1Var.j <= 0.0f && zdk1Var.k <= 0.0f) {
                                float f4 = zdk1Var.g;
                                float f5 = zdk1Var.e;
                                if ((f4 > f5 || f5 > 1.0f || zdk1Var.h > 1.0f) && x8aVar.k1) {
                                    this.a = 1;
                                } else if (x8aVar.j1 && (i960VarB = x8aVar.b(motionEvent.getX(), motionEvent.getY())) != null && !i960VarB.a(this.b)) {
                                    this.b = i960VarB;
                                    x8aVar.c(i960VarB);
                                }
                            } else if (x8aVar.k1) {
                                this.a = 1;
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.a = 0;
                x8aVar.getOnChartGestureListener();
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker4 = this.Z;
                    velocityTracker4.computeCurrentVelocity(1000, npi1.c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float xVelocity2 = velocityTracker4.getXVelocity(pointerId2);
                    float yVelocity2 = velocityTracker4.getYVelocity(pointerId2);
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        if (i != actionIndex) {
                            int pointerId3 = motionEvent.getPointerId(i);
                            if ((velocityTracker4.getYVelocity(pointerId3) * yVelocity2) + (velocityTracker4.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                velocityTracker4.clear();
                                break;
                            }
                        }
                        i++;
                    }
                    this.a = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent4 = x8aVar.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(true);
                }
                d(motionEvent);
                this.i = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.t = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float fE2 = e(motionEvent);
                this.X = fE2;
                if (fE2 > 10.0f) {
                    if (x8aVar.h1) {
                        this.a = 4;
                    } else {
                        boolean z3 = x8aVar.l1;
                        if (z3 != x8aVar.m1) {
                            this.a = z3 ? 2 : 3;
                        } else {
                            this.a = this.i > this.t ? 2 : 3;
                        }
                    }
                }
                float x2 = motionEvent.getX(1) + motionEvent.getX(0);
                float y2 = motionEvent.getY(1) + motionEvent.getY(0);
                duf0Var4.b = x2 / 2.0f;
                duf0Var4.c = y2 / 2.0f;
            }
        } else {
            x8aVar.getOnChartGestureListener();
            duf0Var.b = 0.0f;
            duf0Var.c = 0.0f;
            d(motionEvent);
        }
        zdk1 viewPortHandler2 = x8aVar.getViewPortHandler();
        Matrix matrix2 = this.e;
        viewPortHandler2.d(matrix2, x8aVar, true);
        this.e = matrix2;
        return true;
    }
}
