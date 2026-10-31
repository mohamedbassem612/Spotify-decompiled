package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h5z implements bkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5z(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        Object value;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                e5z e5zVar = (e5z) obj;
                e5zVar.getClass();
                ((nty) obj2).invoke(e5zVar);
                break;
            case 1:
                ((ObservableEmitter) obj2).onNext((o5e0) obj);
                break;
            case 2:
                wkn0 wkn0Var = (wkn0) obj2;
                View view = wkn0Var.f1;
                int i = wkn0Var.i1;
                int i2 = wkn0Var.l1;
                ViewGroup viewGroup = wkn0Var.d1;
                View viewFindViewById = viewGroup.findViewById(2131427919);
                View viewFindViewById2 = viewGroup.findViewById(2131427918);
                if (viewFindViewById == null || viewFindViewById2 == null) {
                    bhn0.i("The Mode Page layout is missing carousel_item_safe_barrier_top and/or carousel_item_safe_barrier_bottom views, needed to position the square cover art in between.");
                } else {
                    int top = (viewFindViewById2.getTop() - viewFindViewById.getBottom()) - (wkn0Var.m1 + i2);
                    int iMin = Math.min(top, i - (wkn0Var.k1 * 2));
                    int bottom = ((top - iMin) / 2) + viewFindViewById.getBottom() + i2;
                    boolean z = i > wkn0Var.j1;
                    boolean z2 = ((double) iMin) > ((double) i) * 0.4d;
                    if (z || z2) {
                        qhl qhlVar = (qhl) view.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) qhlVar).height = iMin;
                        ((ViewGroup.MarginLayoutParams) qhlVar).width = iMin;
                        qhlVar.setMargins(0, bottom, 0, 0);
                        view.setLayoutParams(qhlVar);
                    }
                }
                break;
            case 3:
                ((Activity) obj2).startActivity((Intent) obj);
                break;
            case 4:
                String str = (String) obj;
                Logger.g("Partner ID \"%s\" retrieved for Crashlytics", new Object[]{str});
                zhq0 zhq0Var = ((xi61) obj2).e;
                str.getClass();
                if (str.length() != 0) {
                    bpb1 bpb1Var = (bpb1) zhq0Var.b;
                    do {
                        value = bpb1Var.getValue();
                    } while (!bpb1Var.k(value, new r1s0(str)));
                }
                break;
            case 5:
                bq61 bq61Var = (bq61) obj;
                bq61Var.getClass();
                ((q961) obj2).invoke(bq61Var);
                break;
            case 6:
                ((vr61) obj2).c.accept((tr80) obj);
                break;
            case 7:
                List list = (List) obj;
                list.getClass();
                ((iu30) obj2).invoke(list);
                break;
            default:
                String str2 = (String) obj;
                fib1 fib1Var = ((bkb1) obj2).a;
                if (fib1Var.q0()) {
                    th30 th30VarJ0 = fib1Var.j0();
                    jnw jnwVarG = th30VarJ0.G("EffortlessLoginBottomSheetDialog");
                    if (jnwVarG instanceof jnw) {
                        jnwVarG.dismiss();
                    }
                    jnw jnwVar = new jnw();
                    Bundle bundle = new Bundle();
                    bundle.putString("username", str2);
                    jnwVar.T0(bundle);
                    jnwVar.g1(th30VarJ0, "EffortlessLoginBottomSheetDialog");
                }
                break;
        }
    }
}
