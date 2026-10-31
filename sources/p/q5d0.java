package p;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q5d0 implements View.OnTouchListener {
    public static final int Q0 = ViewConfiguration.getTapTimeout();
    public boolean N0;
    public boolean O0;
    public final m9v P0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final ex8 a;
    public final AccelerateInterpolator b;
    public final m9v c;
    public s10 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final float[] h;
    public final float[] i;
    public final float[] t;

    public q5d0(m9v m9vVar) {
        ex8 ex8Var = new ex8();
        ex8Var.e = Long.MIN_VALUE;
        ex8Var.g = -1L;
        ex8Var.f = 0L;
        this.a = ex8Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.h = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.i = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.t = fArr5;
        this.c = m9vVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.g = Q0;
        ex8Var.a = (short) 500;
        ex8Var.b = (short) 500;
        this.P0 = m9vVar;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.e[i] * f2, 0.0f, this.f[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.h[i];
            float f5 = this.i[i];
            float f6 = this.t[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.h[i];
        float f9 = this.i[i];
        float f10 = this.t[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.N0) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.Y) {
            this.N0 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ex8 ex8Var = this.a;
        int i2 = (int) (jCurrentAnimationTimeMillis - ex8Var.e);
        short s = ex8Var.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        ex8Var.i = i;
        ex8Var.h = ex8Var.a(jCurrentAnimationTimeMillis);
        ex8Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        m9v m9vVar;
        int count;
        ex8 ex8Var = this.a;
        float f = ex8Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(ex8Var.c);
        if (iAbs != 0 && (count = (m9vVar = this.P0).getCount()) != 0) {
            int childCount = m9vVar.getChildCount();
            int firstVisiblePosition = m9vVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && m9vVar.getChildAt(0).getTop() >= 0)) : !(i >= count && m9vVar.getChildAt(childCount - 1).getBottom() <= m9vVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
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
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.O0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7a
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7a
        L17:
            r7.d()
            return r1
        L1b:
            r7.Z = r2
            r7.X = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p.m9v r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            p.ex8 r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.N0
            if (r8 != 0) goto L7a
            boolean r8 = r7.e()
            if (r8 == 0) goto L7a
            p.s10 r8 = r7.d
            if (r8 != 0) goto L62
            p.s10 r8 = new p.s10
            r9 = 13
            r8.<init>(r7, r9)
            r7.d = r8
        L62:
            r7.N0 = r2
            r7.Y = r2
            boolean r9 = r7.X
            if (r9 != 0) goto L75
            int r9 = r7.g
            if (r9 <= 0) goto L75
            long r5 = (long) r9
            java.util.WeakHashMap r9 = p.b8k1.a
            r4.postOnAnimationDelayed(r8, r5)
            goto L78
        L75:
            r8.run()
        L78:
            r7.X = r2
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q5d0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
