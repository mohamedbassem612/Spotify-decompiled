package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iis {
    public final Function0 a;
    public final Function0 b;
    public final String c;
    public final dgx d;
    public final nfx e;
    public final dgx f;
    public final dgx g;
    public m42 h;
    public final idd1 i;
    public dtw j;
    public final r4u k = r4u.c(new r4u[]{r4u.d(q9w.Y0, r4u.a(new lqr(this, (byte) 8)))});
    public int l;

    public iis(Context context, Function0 function0, Function0 function1, String str, dgx dgxVar, nfx nfxVar, dgx dgxVar2, dgx dgxVar3) {
        this.a = function0;
        this.b = function1;
        this.c = str;
        this.d = dgxVar;
        this.e = nfxVar;
        this.f = dgxVar2;
        this.g = dgxVar3;
        this.i = new idd1(new mo2(context, (byte) 12));
    }

    public static void b(View view, FrameLayout frameLayout, Function0 function0) {
        if (frameLayout.indexOfChild(view) != -1) {
            return;
        }
        if (frameLayout.getChildCount() > 1) {
            if (!(frameLayout.getChildCount() > 0)) {
                bhn0.t("Sequence is empty.");
                return;
            }
            View childAt = frameLayout.getChildAt(0);
            if (childAt == null) {
                tw20.p();
                return;
            }
            childAt.setVisibility(4);
        }
        function0.invoke();
        frameLayout.addView(view);
        frameLayout.post(new a6n(frameLayout, (byte) 8));
    }

    public final FrameLayout a() {
        return (FrameLayout) this.i.getValue();
    }
}
