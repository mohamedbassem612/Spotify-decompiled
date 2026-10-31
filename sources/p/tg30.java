package p;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class tg30 extends jch0 {
    public final Activity d;
    public final Context e;
    public final Handler f;
    public final ai30 g = new ai30();

    public tg30(Activity activity, Context context, Handler handler) {
        this.d = activity;
        this.e = context;
        this.f = handler;
    }

    public abstract void l0(PrintWriter printWriter, String[] strArr);

    public abstract dg30 m0();

    public abstract LayoutInflater n0();

    public abstract void o0();
}
