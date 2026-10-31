package p;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wus implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a = 2;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public wus(View view, iac0 iac0Var, Function0 function0, Function0 function1, Function0 function2) {
        this.b = view;
        this.c = function0;
        this.d = function1;
        this.e = function2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((View) obj).removeOnAttachStateChangeListener(this);
                uus uusVar = (uus) this.d;
                mus musVar = uusVar.a;
                new vas(uusVar, (byte) 20);
                zus zusVar = (zus) this.e;
                View view2 = (View) obj2;
                musVar.n = new ssm((Object) zusVar, (Object) view2, (Object) uusVar, (byte) 13);
                musVar.o = new wrs(zusVar, uusVar, (byte) 2);
                zusVar.e = new x3f1(view2, new ots(uusVar, (byte) 2));
                view2.getViewTreeObserver().addOnGlobalLayoutListener(zusVar.e);
                ogr ogrVar = new ogr(zusVar, (byte) 11);
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(view2, ogrVar);
                musVar.c(view2);
                break;
            case 1:
                ((dt90) obj).invoke();
                ((dt90) obj2).invoke();
                break;
            default:
                ((Function0) obj2).invoke();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                break;
            case 1:
                ((bsc0) obj).invoke();
                ((ven0) this.e).setValue(Boolean.FALSE);
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }

    public wus(dt90 dt90Var, dt90 dt90Var2, bsc0 bsc0Var, ven0 ven0Var) {
        this.b = dt90Var;
        this.c = dt90Var2;
        this.d = bsc0Var;
        this.e = ven0Var;
    }

    public wus(View view, uus uusVar, zus zusVar, View view2) {
        this.b = view;
        this.d = uusVar;
        this.e = zusVar;
        this.c = view2;
    }

    private final void a(View view) {
    }
}
