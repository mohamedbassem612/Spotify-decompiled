package p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t5x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt91 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ zsc d;

    public /* synthetic */ t5x0(kt91 kt91Var, Activity activity, zsc zscVar, byte b) {
        this.a = b;
        this.b = kt91Var;
        this.c = activity;
        this.d = zscVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        zsc zscVar = this.d;
        Activity activity = this.c;
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                b5x0 b5x0Var = (b5x0) obj;
                String string = activity.getString(2131960439, b5x0Var.e);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, string, (Integer) null, (String) null, 2131960438, new t230(zscVar, b5x0Var, (byte) 26), (cvr) null, (xq91) null, false));
                break;
            default:
                d5x0 d5x0Var = (d5x0) obj;
                String string2 = activity.getString(2131960513, d5x0Var.e);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, string2, (Integer) null, (String) null, 2131960512, new t230(zscVar, d5x0Var, (byte) 27), (cvr) null, (xq91) null, false));
                break;
        }
    }
}
