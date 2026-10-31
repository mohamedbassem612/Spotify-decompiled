package p;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import app.p000rive.runtime.kotlin.R;
import app.p000rive.semantics.SemanticState;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c4u extends p0i {
    public Function0 d;
    public i3u e;
    public final View f;
    public final c3u g;
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, p.c3u] */
    public c4u(Function0 function0, i3u i3uVar, View view, flb0 flb0Var, wat watVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), i3uVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.d = function0;
        this.e = i3uVar;
        this.f = view;
        Window window = getWindow();
        if (window == null) {
            eg.m("Dialog has no window");
            throw null;
        }
        i3u i3uVar2 = this.e;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = i3uVar2.g;
            window2.setAttributes(attributes);
        }
        final byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        d55.i(window, this.e.e);
        window.setGravity(17);
        if (!this.e.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                qh5.a.a(attributes2);
            }
            if (i >= 30) {
                sh5 sh5Var = sh5.a;
                sh5Var.b(attributes2, 0);
                sh5Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        ?? c3uVar = new c3u(getContext(), window);
        setTitle(this.e.f);
        c3uVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c3uVar.setClipChildren(false);
        c3uVar.setElevation(watVar.X0(8.0f));
        c3uVar.setOutlineProvider(new b4u((byte) 0));
        this.g = c3uVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView((View) c3uVar);
        x9p1.p((View) c3uVar, x9p1.h(view));
        lap1.o((View) c3uVar, lap1.k(view));
        hm5.J((View) c3uVar, hm5.w(view));
        f(this.d, this.e, flb0Var);
        aq8.v(((p0i) this).c, this, new iu30(this) { // from class: p.pd4
            public final /* synthetic */ c4u b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Dialog, java.lang.Object, p.c4u] */
            public final Object invoke(Object obj) {
                byte b2 = b;
                ?? r1 = this.b;
                switch (b2) {
                    case 0:
                        r1.show();
                        return new rm((Object) r1, (byte) 4);
                    default:
                        if (r1.e.a) {
                            r1.d.invoke();
                        }
                        return rih1.a;
                }
            }
        }, 2);
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof c3u) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(v3k v3kVar, vu30 vu30Var) {
        c3u c3uVar = this.g;
        c3uVar.setParentCompositionContext(v3kVar);
        c3uVar.O0.setValue(vu30Var);
        c3uVar.S0 = true;
        c3uVar.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, p.c3u] */
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
    public final void f(Function0 function0, i3u i3uVar, flb0 flb0Var) {
        int i;
        this.d = function0;
        this.e = i3uVar;
        int i2 = i3uVar.c;
        boolean zC = sy4.c(this.f);
        int iC = l1d.C(i2);
        int i3 = 0;
        if (iC != 0) {
            if (iC == 1) {
                zC = true;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                zC = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zC ? 8192 : -8193, SemanticState.Multiline);
        int iOrdinal = flb0Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            i = 1;
        }
        ?? r9 = this.g;
        r9.setLayoutDirection(i);
        boolean z = i3uVar.e;
        boolean z2 = i3uVar.d;
        Window window2 = r9.N0;
        boolean z3 = (r9.R0 && z2 == r9.P0 && z == r9.Q0) ? false : true;
        r9.P0 = z2;
        r9.Q0 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i4 = z2 ? -2 : -1;
            if (i4 != attributes.width || !r9.R0) {
                window2.setLayout(i4, -2);
                r9.R0 = true;
            }
        }
        setCanceledOnTouchOutside(i3uVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i3 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.e.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super/*android.app.Dialog*/.onKeyUp(i, keyEvent);
        }
        this.d.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iU;
        boolean zOnTouchEvent = super/*android.app.Dialog*/.onTouchEvent(motionEvent);
        if (!this.e.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.h = false;
            return zOnTouchEvent;
        }
        o6 o6Var = this.g;
        o6Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = o6Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + o6Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + o6Var.getTop();
            int height = childAt.getHeight() + top;
            int iU2 = jch0.U(motionEvent.getX());
            if (left <= iU2 && iU2 <= width && top <= (iU = jch0.U(motionEvent.getY())) && iU <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.h = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.h = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.h = false;
                return zOnTouchEvent;
            }
        } else if (this.h) {
            this.d.invoke();
            this.h = false;
            return true;
        }
        return zOnTouchEvent;
    }

    public final void cancel() {
    }
}
