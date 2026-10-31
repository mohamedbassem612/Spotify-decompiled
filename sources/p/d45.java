package p;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d45 implements o3e1 {
    public final View a;
    public final iu30 b;
    public final Function0 c;
    public final pfn0 d = new pfn0();
    public final gw91 e;
    public final x35 f;
    public final x35 g;
    public ActionMode h;
    public c45 i;
    public Runnable j;

    /* JADX WARN: Type inference failed for: r1v3, types: [p.x35] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.x35] */
    public d45(View view, iu30 iu30Var, Function0 function0) {
        this.a = view;
        this.b = iu30Var;
        this.c = function0;
        final byte b = 0;
        this.e = new gw91(new iu30(this) { // from class: p.x35
            public final /* synthetic */ d45 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                rih1 rih1Var = rih1.a;
                d45 d45Var = this.b;
                switch (b2) {
                    case 0:
                        Function0 function1 = (Function0) obj;
                        View view2 = d45Var.a;
                        Handler handler = view2.getHandler();
                        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                            function1.invoke();
                        } else {
                            Handler handler2 = view2.getHandler();
                            if (handler2 != null) {
                                handler2.post(new t94(function1, (byte) 2));
                            }
                        }
                        return rih1Var;
                    case 1:
                        ActionMode actionMode = d45Var.h;
                        if (actionMode != null) {
                            actionMode.invalidate();
                        }
                        return rih1Var;
                    case 2:
                        ActionMode actionMode2 = d45Var.h;
                        if (actionMode2 != null) {
                            actionMode2.invalidateContentRect();
                        }
                        return rih1Var;
                    default:
                        d45Var.e.e();
                        return new rm(d45Var, (byte) 6);
                }
            }
        });
        final byte b2 = 1;
        this.f = new iu30(this) { // from class: p.x35
            public final /* synthetic */ d45 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                rih1 rih1Var = rih1.a;
                d45 d45Var = this.b;
                switch (b3) {
                    case 0:
                        Function0 function1 = (Function0) obj;
                        View view2 = d45Var.a;
                        Handler handler = view2.getHandler();
                        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                            function1.invoke();
                        } else {
                            Handler handler2 = view2.getHandler();
                            if (handler2 != null) {
                                handler2.post(new t94(function1, (byte) 2));
                            }
                        }
                        return rih1Var;
                    case 1:
                        ActionMode actionMode = d45Var.h;
                        if (actionMode != null) {
                            actionMode.invalidate();
                        }
                        return rih1Var;
                    case 2:
                        ActionMode actionMode2 = d45Var.h;
                        if (actionMode2 != null) {
                            actionMode2.invalidateContentRect();
                        }
                        return rih1Var;
                    default:
                        d45Var.e.e();
                        return new rm(d45Var, (byte) 6);
                }
            }
        };
        final byte b3 = 2;
        this.g = new iu30(this) { // from class: p.x35
            public final /* synthetic */ d45 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b4 = b3;
                rih1 rih1Var = rih1.a;
                d45 d45Var = this.b;
                switch (b4) {
                    case 0:
                        Function0 function1 = (Function0) obj;
                        View view2 = d45Var.a;
                        Handler handler = view2.getHandler();
                        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                            function1.invoke();
                        } else {
                            Handler handler2 = view2.getHandler();
                            if (handler2 != null) {
                                handler2.post(new t94(function1, (byte) 2));
                            }
                        }
                        return rih1Var;
                    case 1:
                        ActionMode actionMode = d45Var.h;
                        if (actionMode != null) {
                            actionMode.invalidate();
                        }
                        return rih1Var;
                    case 2:
                        ActionMode actionMode2 = d45Var.h;
                        if (actionMode2 != null) {
                            actionMode2.invalidateContentRect();
                        }
                        return rih1Var;
                    default:
                        d45Var.e.e();
                        return new rm(d45Var, (byte) 6);
                }
            }
        };
    }

    @Override // p.o3e1
    public final Object a(g3e1 g3e1Var, a8d1 a8d1Var) {
        Object objA = this.d.a(hfn0.a, new i24(this, g3e1Var, null, (byte) 2), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }
}
