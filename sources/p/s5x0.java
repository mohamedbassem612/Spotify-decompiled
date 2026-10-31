package p;

import android.app.Activity;
import android.view.View;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s5x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ kt91 c;

    public /* synthetic */ s5x0(Activity activity, kt91 kt91Var, byte b) {
        this.a = b;
        this.b = activity;
        this.c = kt91Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        kt91 kt91Var = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                kt91Var.k(new er91((fs91) null, activity.getString(2131960437), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 1:
                kt91Var.k(new er91((fs91) null, activity.getString(2131960498, ((a5x0) obj).d), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 2:
                kt91Var.k(new er91((fs91) null, activity.getString(2131960511), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91Var.k(new er91((fs91) null, activity.getString(2131960575, ((h5x0) obj).d), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }

    public /* synthetic */ s5x0(kt91 kt91Var, Activity activity, byte b) {
        this.a = b;
        this.c = kt91Var;
        this.b = activity;
    }
}
