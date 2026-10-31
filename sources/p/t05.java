package p;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t05 extends pim0 implements j4k, m7v, zkb0 {
    public final idn0 O0;
    public final boolean P0;
    public final float Q0;
    public final x9h R0;
    public final Function0 S0;
    public vrv0 T0;
    public float U0;
    public boolean W0;
    public xh31 Y0;
    public yh31 Z0;
    public long V0 = 0;
    public final wdn0 X0 = new wdn0();

    public t05(idn0 idn0Var, boolean z, float f, x9h x9hVar, Function0 function0) {
        this.O0 = idn0Var;
        this.P0 = z;
        this.Q0 = f;
        this.R0 = x9hVar;
        this.S0 = function0;
    }

    public final void A1() {
        xh31 xh31Var = this.Y0;
        if (xh31Var != null) {
            this.Z0 = null;
            ha71.x(this);
            dc31 dc31Var = xh31Var.d;
            yh31 yh31Var = (yh31) ((LinkedHashMap) dc31Var.b).get(this);
            if (yh31Var != null) {
                yh31Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) dc31Var.b;
                yh31 yh31Var2 = (yh31) linkedHashMap.get(this);
                if (yh31Var2 != null) {
                }
                linkedHashMap.remove(this);
                xh31Var.c.add(yh31Var);
            }
        }
    }

    public final void H1(t9w0 t9w0Var) {
        yh31 yh31Var;
        if (!(t9w0Var instanceof r9w0)) {
            if (t9w0Var instanceof s9w0) {
                yh31 yh31Var2 = this.Z0;
                if (yh31Var2 != null) {
                    yh31Var2.d();
                    return;
                }
                return;
            }
            if (!(t9w0Var instanceof q9w0) || (yh31Var = this.Z0) == null) {
                return;
            }
            yh31Var.d();
            return;
        }
        r9w0 r9w0Var = (r9w0) t9w0Var;
        long j = this.V0;
        float f = this.U0;
        xh31 xh31Var = this.Y0;
        if (xh31Var == null) {
            Object obj = (View) lcc.z(this, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    hhg1.f(cy30.m("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    xh31 xh31Var2 = new xh31(viewGroup.getContext());
                    viewGroup.addView(xh31Var2);
                    xh31Var = xh31Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof xh31) {
                        xh31Var = (xh31) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.Y0 = xh31Var;
        }
        ArrayList arrayList = xh31Var.b;
        dc31 dc31Var = xh31Var.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dc31Var.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dc31Var.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) dc31Var.c;
        yh31 yh31Var3 = (yh31) linkedHashMap.get(this);
        byte b = 1;
        if (yh31Var3 == null) {
            yh31Var3 = (yh31) r7h.c0(xh31Var.c);
            if (yh31Var3 == null) {
                if (xh31Var.e > p7h.L(arrayList)) {
                    yh31Var3 = new yh31(xh31Var.getContext());
                    xh31Var.addView(yh31Var3);
                    arrayList.add(yh31Var3);
                } else {
                    yh31Var3 = (yh31) arrayList.get(xh31Var.e);
                    t05 t05Var = (t05) linkedHashMap3.get(yh31Var3);
                    if (t05Var != null) {
                        t05Var.Z0 = null;
                        ha71.x(t05Var);
                        yh31 yh31Var4 = (yh31) linkedHashMap2.get(t05Var);
                        if (yh31Var4 != null) {
                        }
                        linkedHashMap2.remove(t05Var);
                        yh31Var3.c();
                    }
                }
                int i2 = xh31Var.e;
                if (i2 < xh31Var.a - 1) {
                    xh31Var.e = i2 + 1;
                } else {
                    xh31Var.e = 0;
                }
            }
            linkedHashMap2.put(this, yh31Var3);
            linkedHashMap3.put(yh31Var3, this);
        }
        yh31 yh31Var5 = yh31Var3;
        yh31Var5.b(r9w0Var, this.P0, j, jch0.U(f), this.R0.a(), ((uh31) this.S0.invoke()).d, new hx4(this, b));
        this.Z0 = yh31Var5;
        ha71.x(this);
    }

    public final void f(long j) {
        float fX0;
        this.W0 = true;
        wat watVar = oap1.B(this).Z0;
        this.V0 = o0c.R(j);
        float f = this.Q0;
        if (Float.isNaN(f)) {
            long j2 = this.V0;
            fX0 = Offset.d(hm5.g(Size.f(j2), Size.d(j2))) / 2.0f;
            if (this.P0) {
                fX0 += watVar.X0(10.0f);
            }
        } else {
            fX0 = watVar.X0(f);
        }
        this.U0 = fX0;
        wdn0 wdn0Var = this.X0;
        Object[] objArr = wdn0Var.a;
        int i = wdn0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            H1((t9w0) objArr[i2]);
        }
        wdn0Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    public final void t0(lsl lslVar) {
        lsl lslVar2;
        lslVar.s1();
        vrv0 vrv0Var = this.T0;
        if (vrv0Var != null) {
            float f = this.U0;
            long jA = this.R0.a();
            float fFloatValue = ((Number) ((o95) vrv0Var.d).e()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = u7h.b(jA, fFloatValue, 0.0f, 0.0f, 0.0f, 14);
                if (vrv0Var.b) {
                    float f2 = Size.f(lslVar.j());
                    float fD = Size.d(lslVar.j());
                    cab cabVarA1 = lslVar.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        ((dg8) cabVarA1.b).k(0.0f, 0.0f, f2, fD, 1);
                        lslVar2 = lslVar;
                        DrawScope.b0(lslVar2, jB, f, 0L, 0.0f, (DrawStyle) null, 124);
                        i3a.n(cabVarA1, jU);
                    } catch (Throwable th) {
                        i3a.n(cabVarA1, jU);
                        throw th;
                    }
                } else {
                    lslVar2 = lslVar;
                    DrawScope.b0(lslVar2, jB, f, 0L, 0.0f, (DrawStyle) null, 124);
                }
            } else {
                lslVar2 = lslVar;
            }
        } else {
            lslVar2 = lslVar;
        }
        u84 u84VarP = lslVar2.a1().p();
        yh31 yh31Var = this.Z0;
        if (yh31Var != null) {
            long j = this.V0;
            yh31Var.e(jch0.U(this.U0), j, ((uh31) this.S0.invoke()).d, this.R0.a());
            Canvas canvas = v84.a;
            yh31Var.draw(u84VarP.a);
        }
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        fn31.T(v1(), null, 0, new d821(this, (lnm) null), 3);
    }
}
