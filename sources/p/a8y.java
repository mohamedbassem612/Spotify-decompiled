package p;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a8y implements f4h1 {
    public final View a;
    public final Observable b;
    public final yjq c;
    public final qzh d;
    public final kt91 e;
    public final lzn0 f;
    public final TextView g;
    public final vku h;

    public a8y(View view, Observable observable, yjq yjqVar, qzh qzhVar, kt91 kt91Var, lzn0 lzn0Var) {
        this.a = view;
        this.b = observable;
        this.c = yjqVar;
        this.d = qzhVar;
        this.e = kt91Var;
        this.f = lzn0Var;
        yjqVar.x(this);
        ((FrameLayout) view.findViewById(2131428660)).addView(qzhVar.getView());
        this.g = (TextView) view.findViewById(2131428661);
        this.h = new vku();
    }

    public final Object getView() {
        return this.a;
    }

    public final Bundle serialize() {
        return new Bundle();
    }

    public final void start() {
        this.h.a(this.b.subscribe(new cfs(this, (byte) 20)));
    }

    public final void stop() {
        this.h.c();
        this.c.v();
    }
}
