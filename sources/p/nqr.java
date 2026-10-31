package p;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nqr implements qzh {
    public final b2c a;
    public final yir b;
    public final yqg c;
    public final Scheduler d;
    public mqr e;
    public final LinearLayout f;
    public boolean g;
    public boolean h;
    public final PublishSubject i;
    public final idd1 t;

    public nqr(b2c b2cVar, yir yirVar, yqg yqgVar, Scheduler scheduler) {
        this.a = b2cVar;
        this.b = yirVar;
        this.c = yqgVar;
        this.d = scheduler;
        lag lagVar = (lag) b2cVar.d;
        this.f = (LinearLayout) lagVar.b;
        PublishSubject publishSubject = new PublishSubject();
        this.i = publishSubject;
        this.t = new idd1(new kqr(this, (byte) 1));
        if (yirVar != null) {
            View view = (ComposeView) yirVar.c;
            FrameLayout frameLayout = (FrameLayout) lagVar.e;
            frameLayout.removeAllViews();
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2));
            yirVar.n(new m4r(this, (byte) 14));
        }
        publishSubject.switchMap(new lqr(this, (byte) 0)).subscribe();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(ian ianVar) {
        boolean z = ianVar instanceof han;
        int i = (!z || ((han) ianVar).c == null) ? 2 : 1;
        b2c b2cVar = this.a;
        b2cVar.a = i;
        this.i.onNext(ianVar);
        boolean zC = ianVar.c();
        ((FrameLayout) ((lag) b2cVar.d).e).setVisibility(zC ? 0 : 8);
        if (zC) {
            yir yirVar = this.b;
            if (yirVar != null) {
                yirVar.f(lsv0.a);
            }
            if (!this.h) {
                mqr mqrVar = this.e;
                if (mqrVar != null) {
                    mqrVar.a.invoke(ean.a);
                }
                this.h = this.e != null;
            }
        }
        if (!zC) {
            this.h = false;
        }
        this.g = zC;
        if (z) {
            han hanVar = (han) ianVar;
            String str = hanVar.b;
            String str2 = hanVar.c;
            b2cVar.h(str, str2 != null ? new sqm(this, str2, (byte) 27) : null);
            return;
        }
        if (ianVar instanceof gan) {
            b2cVar.h(null, null);
        } else {
            eg.o();
        }
    }

    public final View getView() {
        return this.f;
    }

    public final void n(iu30 iu30Var) {
        this.e = new mqr(iu30Var);
        if (!this.g || this.h) {
            return;
        }
        iu30Var.invoke(ean.a);
        this.h = true;
    }
}
