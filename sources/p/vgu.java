package p;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vgu implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vgu(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x8c0 lifecycle;
        x8c0 lifecycle2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                if (((ygu) obj3).f.a) {
                    xgu xguVar = (xgu) obj;
                    ygu yguVar = xguVar.h;
                    xguVar.b = fn31.T(yguVar.h, yguVar.a, 0, new sr1(yguVar, xguVar, xguVar.t, (lnm) null, (byte) 14), 2);
                }
                break;
            case 1:
                ((FrameLayout) obj2).removeOnAttachStateChangeListener(this);
                ((tte0) obj3).h.requestLayout();
                ((ven0) obj).setValue(Boolean.TRUE);
                break;
            case 2:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                View view2 = (View) obj3;
                aiq0.a(view2, new aih0(view2, (air0) obj, false, (byte) 9));
                break;
            case 3:
                ((z511) obj2).t((w611) obj3);
                ((jbk1) obj).c = true;
                break;
            case 4:
                RecyclerView recyclerView = (RecyclerView) obj;
                cej1 cej1Var = (cej1) obj3;
                if (((z511) obj2).e() > 0) {
                    if (!cej1Var.t && (recyclerView.getChildCount() == 0 || recyclerView.getLayoutParams().height != -2)) {
                        cej1Var.t = true;
                        recyclerView.post(new mqh1(cej1Var, recyclerView, (byte) 2));
                    }
                    if (!cej1Var.X) {
                        cej1Var.X = true;
                        recyclerView.post(new jyh0(cej1Var, recyclerView, (byte) 29));
                        break;
                    }
                }
                break;
            default:
                zw3 zw3Var = (zw3) obj3;
                p811 p811Var = (p811) obj2;
                iac0 iac0Var = (iac0) p811Var.a;
                if (iac0Var != null && (lifecycle2 = iac0Var.getLifecycle()) != null) {
                    lifecycle2.d(zw3Var);
                }
                iac0 iac0VarH = x9p1.h(view);
                p811Var.a = iac0VarH;
                iac0 iac0Var2 = iac0VarH;
                if (iac0Var2 != null && (lifecycle = iac0Var2.getLifecycle()) != null) {
                    lifecycle.a(zw3Var);
                }
                ((hfj1) obj).invoke();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 3:
                ((z511) this.b).u((w611) this.c);
                ((jbk1) this.d).c = false;
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
