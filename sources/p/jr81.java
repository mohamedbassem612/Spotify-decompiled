package p;

import android.content.Context;
import android.view.View;
import android.widget.ViewAnimator;
import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jr81 implements Connection {
    public final /* synthetic */ Connection a;
    public final /* synthetic */ Connection b;
    public final /* synthetic */ Connection c;
    public final /* synthetic */ rp d;
    public final /* synthetic */ jkn0 e;
    public final /* synthetic */ kr81 f;
    public final /* synthetic */ Disposable g;
    public final /* synthetic */ Disposable h;

    public jr81(ibn ibnVar, ibn ibnVar2, Connection connection, rp rpVar, jkn0 jkn0Var, kr81 kr81Var, Disposable disposable, Disposable disposable2) {
        this.a = ibnVar;
        this.b = ibnVar2;
        this.c = connection;
        this.d = rpVar;
        this.e = jkn0Var;
        this.f = kr81Var;
        this.g = disposable;
        this.h = disposable2;
    }

    public final void accept(Object obj) {
        qq81 qq81Var = (qq81) obj;
        Connection connection = this.a;
        if (connection != null) {
            connection.accept(qq81Var.b);
        }
        Connection connection2 = this.b;
        if (connection2 != null) {
            connection2.accept(qq81Var.c);
        }
        this.c.accept(qq81Var.d);
        this.d.accept(qq81Var.e);
        this.e.accept(qq81Var.f);
        kr81 kr81Var = this.f;
        int i = qq81Var.t;
        synchronized (kr81Var) {
            try {
                if (kr81Var.S0.getDisplayedChild() != i || kr81Var.X0) {
                    View view = kr81Var.X;
                    WeakHashMap weakHashMap = b8k1.a;
                    boolean z = view.getLayoutDirection() == 1;
                    int displayedChild = kr81Var.S0.getDisplayedChild();
                    ViewAnimator viewAnimator = kr81Var.S0;
                    int i2 = 2130772060;
                    int i3 = 2130772057;
                    if (i < displayedChild) {
                        viewAnimator.setInAnimation(viewAnimator.getContext(), z ? 2130772058 : 2130772057);
                        ViewAnimator viewAnimator2 = kr81Var.S0;
                        viewAnimator2.setOutAnimation(viewAnimator2.getContext(), z ? 2130772059 : 2130772060);
                    } else {
                        Context context = viewAnimator.getContext();
                        if (!z) {
                            i3 = 2130772058;
                        }
                        viewAnimator.setInAnimation(context, i3);
                        ViewAnimator viewAnimator3 = kr81Var.S0;
                        Context context2 = viewAnimator3.getContext();
                        if (!z) {
                            i2 = 2130772059;
                        }
                        viewAnimator3.setOutAnimation(context2, i2);
                    }
                    ((c7k1) kr81Var.W0.get(kr81Var.S0.getDisplayedChild())).a();
                    kr81Var.S0.setDisplayedChild(i);
                    kr81Var.X.setVisibility(0);
                    if (kr81Var.f) {
                        kr81Var.T0.setText(kr81Var.X.getContext().getString(2131962526, Integer.valueOf(kr81Var.g + i + 1), Integer.valueOf(kr81Var.g + kr81Var.W0.size())));
                    }
                    c7k1 c7k1Var = (c7k1) kr81Var.W0.get(kr81Var.S0.getDisplayedChild());
                    c7k1Var.c();
                    kr81Var.b.invoke(c7k1Var.b());
                    kr81Var.i.invoke();
                    kr81Var.X0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kr81 kr81Var2 = this.f;
        if (kr81Var2.U0 == null) {
            pq81 pq81Var = qq81Var.a;
            if (pq81Var instanceof oq81) {
                kr81Var2.U0 = pq81Var;
            }
        }
    }

    public final void dispose() {
        this.g.dispose();
        Connection connection = this.a;
        if (connection != null) {
            connection.dispose();
        }
        Connection connection2 = this.b;
        if (connection2 != null) {
            connection2.dispose();
        }
        this.c.dispose();
        this.e.dispose();
        this.h.dispose();
        this.f.R0.setOnClickListener(null);
    }
}
