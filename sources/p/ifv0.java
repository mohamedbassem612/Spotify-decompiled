package p;

import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ifv0 extends o6 {
    public static final g6f0 h1 = new g6f0((byte) 20);
    public Function0 N0;
    public nfv0 O0;
    public String P0;
    public final View Q0;
    public final boolean R0;
    public final sua S0;
    public final WindowManager T0;
    public final WindowManager.LayoutParams U0;
    public mfv0 V0;
    public flb0 W0;
    public final hrr0 X0;
    public final hrr0 Y0;
    public ur80 Z0;
    public final mdt a1;
    public final Rect b1;
    public final gw91 c1;
    public wh5 d1;
    public final hrr0 e1;
    public boolean f1;
    public final int[] g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ifv0(Function0 function0, nfv0 nfv0Var, String str, View view, wat watVar, mfv0 mfv0Var, UUID uuid, boolean z) {
        super(view.getContext(), (AttributeSet) null, 6, 0);
        int i = Build.VERSION.SDK_INT;
        sua kfv0Var = i >= 30 ? new kfv0((byte) 20) : i >= 29 ? new jfv0((byte) 20) : new sua((byte) 20);
        this.N0 = function0;
        this.O0 = nfv0Var;
        this.P0 = str;
        this.Q0 = view;
        this.R0 = z;
        this.S0 = kfv0Var;
        this.T0 = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        nfv0 nfv0Var2 = this.O0;
        boolean zC = sy4.c(view);
        boolean z2 = nfv0Var2.b;
        int i2 = nfv0Var2.a;
        if (z2 && zC) {
            i2 |= SemanticState.Multiline;
        } else if (z2 && !zC) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.O0.g;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.U0 = layoutParams;
        this.V0 = mfv0Var;
        this.W0 = flb0.a;
        this.X0 = v8r.q((Object) null);
        this.Y0 = v8r.q((Object) null);
        this.a1 = yv91.a(new g030(this, (byte) 26));
        this.b1 = new Rect();
        this.c1 = new gw91(new ly4(this, (byte) 2));
        setId(android.R.id.content);
        x9p1.p(this, x9p1.h(view));
        lap1.o(this, lap1.k(view));
        hm5.J(this, hm5.w(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(watVar.X0(8.0f));
        setOutlineProvider(new hfv0());
        this.e1 = v8r.q(xto.a);
        this.g1 = new int[2];
    }

    private final vu30 getContent() {
        return (vu30) this.e1.getValue();
    }

    private final ur80 getDisplayBounds() {
        int i = this.O0.a & 512;
        View view = this.Q0;
        Rect rect = this.b1;
        sua suaVar = this.S0;
        if (i == 0) {
            suaVar.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            suaVar.q(rect, view);
        }
        return new ur80(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final elb0 getParentLayoutCoordinates() {
        return (elb0) this.Y0.getValue();
    }

    private final void setContent(vu30 vu30Var) {
        this.e1.setValue(vu30Var);
    }

    private final void setParentLayoutCoordinates(elb0 elb0Var) {
        this.Y0.setValue(elb0Var);
    }

    public static final boolean y(ifv0 ifv0Var) {
        elb0 parentLayoutCoordinates = ifv0Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.a()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || ifv0Var.m633getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(Function0 function0, nfv0 nfv0Var, String str, flb0 flb0Var) {
        int i;
        this.N0 = function0;
        this.P0 = str;
        if (!u890.j(this.O0, nfv0Var)) {
            boolean z = nfv0Var.f;
            WindowManager.LayoutParams layoutParams = this.U0;
            if (z && !this.O0.f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.O0 = nfv0Var;
            boolean zC = sy4.c(this.Q0);
            boolean z2 = nfv0Var.b;
            int i2 = nfv0Var.a;
            if (z2 && zC) {
                i2 |= SemanticState.Multiline;
            } else if (z2 && !zC) {
                i2 &= -8193;
            }
            layoutParams.flags = i2;
            this.S0.getClass();
            this.T0.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = flb0Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
        } else {
            i = 0;
        }
        super/*android.view.View*/.setLayoutDirection(i);
    }

    public final void B() {
        elb0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.a()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jB = parentLayoutCoordinates.b();
            long jE = this.R0 ? parentLayoutCoordinates.E(0L) : parentLayoutCoordinates.p(0L);
            ur80 ur80VarE = hm5.e((((long) Math.round(Float.intBitsToFloat((int) (jE >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jE & 4294967295L))))), jB);
            if (ur80VarE.equals(this.Z0)) {
                return;
            }
            this.Z0 = ur80VarE;
            D();
        }
    }

    public final void C(elb0 elb0Var) {
        setParentLayoutCoordinates(elb0Var);
        B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        yr80 yr80VarM633getPopupContentSizebOM6tXw;
        final ur80 ur80Var = this.Z0;
        if (ur80Var == null || (yr80VarM633getPopupContentSizebOM6tXw = m633getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = yr80VarM633getPopupContentSizebOM6tXw.a;
        ur80 displayBounds = getDisplayBounds();
        final long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        final o811 o811Var = new o811();
        o811Var.a = 0L;
        this.c1.d(this, h1, new Function0() { // from class: p.gfv0
            public final Object invoke() {
                ifv0 ifv0Var = this;
                o811Var.a = ifv0Var.V0.a(ur80Var, jB, ifv0Var.W0, j);
                return rih1.a;
            }
        });
        long j2 = o811Var.a;
        WindowManager.LayoutParams layoutParams = this.U0;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.O0.e;
        sua suaVar = this.S0;
        if (z) {
            suaVar.x(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        suaVar.getClass();
        this.T0.updateViewLayout(this, layoutParams);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-857613600);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9(this, i, (byte) 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.O0.c) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.N0;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.a1.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.U0;
    }

    public final flb0 getParentLayoutDirection() {
        return this.W0;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final yr80 m633getPopupContentSizebOM6tXw() {
        return (yr80) this.X0.getValue();
    }

    public final mfv0 getPositionProvider() {
        return this.V0;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1;
    }

    public final String getTestTag() {
        return this.P0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c1.e();
        if (!this.O0.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        wh5 wh5Var = this.d1;
        if (wh5Var == null) {
            wh5 wh5Var2 = new wh5(this.N0, (byte) 0);
            this.d1 = wh5Var2;
            wh5Var = wh5Var2;
        }
        yh5.f(this, wh5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        gw91 gw91Var = this.c1;
        gw91Var.f();
        gw91Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            yh5.g(this, this.d1);
        }
        this.d1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.O0.d) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.N0;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        Function0 function1 = this.N0;
        if (function1 != null) {
            function1.invoke();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.s(z, i, i2, i3, i4);
        if (this.O0.f || (childAt = getChildAt(0)) == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.U0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.S0.getClass();
        this.T0.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(flb0 flb0Var) {
        this.W0 = flb0Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m634setPopupContentSizefhxjrPA(yr80 yr80Var) {
        this.X0.setValue(yr80Var);
    }

    public final void setPositionProvider(mfv0 mfv0Var) {
        this.V0 = mfv0Var;
    }

    public final void setTestTag(String str) {
        this.P0 = str;
    }

    public final void t(int i, int i2) {
        if (this.O0.f) {
            super.t(i, i2);
        } else {
            ur80 displayBounds = getDisplayBounds();
            super.t(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), os00.INVALID_ID), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), os00.INVALID_ID));
        }
    }

    public final void z(v3k v3kVar, vu30 vu30Var) {
        setParentCompositionContext(v3kVar);
        setContent(vu30Var);
        this.f1 = true;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public o6 getSubCompositionView() {
        return this;
    }

    public void setLayoutDirection(int i) {
    }
}
