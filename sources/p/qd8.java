package p;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qd8 implements f4h1 {
    public final View X;
    public final View a;
    public final kp5 b;
    public final kt91 c;
    public final lzn0 d;
    public final vku e;
    public final WebView f;
    public final View g;
    public final View h;
    public final TextView i;
    public final ProgressBar t;

    public qd8(View view, kp5 kp5Var, kt91 kt91Var, lzn0 lzn0Var, Activity activity, ajg ajgVar, cir0 cir0Var) {
        this.a = view;
        this.b = kp5Var;
        this.c = kt91Var;
        this.d = lzn0Var;
        vku vkuVar = new vku();
        this.e = vkuVar;
        WebView webView = (WebView) view.findViewById(2131431680);
        this.f = webView;
        View viewFindViewById = view.findViewById(2131431397);
        this.g = viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131427810);
        this.h = viewFindViewById2;
        this.i = (TextView) view.findViewById(2131430275);
        this.t = (ProgressBar) view.findViewById(2131431688);
        this.X = view.findViewById(2131429644);
        r78 r78Var = new r78(ajgVar, this);
        pd8 pd8Var = new pd8(this, (byte) 0);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        viewFindViewById.setLayoutParams(marginLayoutParams);
        viewFindViewById2.setOnClickListener(new c20(this, (byte) 7));
        r78Var.a(webView);
        od8 od8Var = (od8) kp5Var.a;
        ((vku) kp5Var.h).a(((o78) kp5Var.b).a(new bxf(od8Var.a, od8Var.b)).subscribeOn((Scheduler) kp5Var.c).observeOn((Scheduler) kp5Var.d).flatMap(new x6o0(kp5Var, (byte) 29)).map(vrg.i).subscribe(new wd8(kp5Var, (byte) 1), new wd8(kp5Var, (byte) 2)));
        vkuVar.a(((BehaviorSubject) kp5Var.g).subscribe(new tg(this, (byte) 22)));
        cir0Var.j(pd8Var);
    }

    public final Object getView() {
        return this.a;
    }

    public final void stop() {
        this.e.c();
    }

    public final void start() {
    }
}
