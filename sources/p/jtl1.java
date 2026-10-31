package p;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jtl1 extends g5 {
    public final bpb1 a;
    public final xe01 b;
    public itl1 c;

    public jtl1() {
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
    }

    public final void a(Activity activity) {
        btl1.a.getClass();
        atl1 atl1VarA = gtv0.h().a(activity);
        int iWidth = atl1VarA.a().width();
        int iHeight = atl1VarA.a().height();
        float f = activity.getResources().getDisplayMetrics().density;
        this.a.m(null, d9y0.n(iWidth / f, iHeight / f));
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        itl1 itl1Var = new itl1(activity, this);
        this.c = itl1Var;
        viewGroup.addView(itl1Var);
        a(activity);
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.c != null) {
            ((ViewGroup) activity.findViewById(R.id.content)).removeView(this.c);
            this.c = null;
        }
    }
}
