package p;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Vibrator;
import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zh41 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ zh41(uw0 uw0Var, byte b) {
        this.a = b;
        this.b = uw0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                ei41 ei41Var = (ei41) ((WeakReference) uw0Var.i).get();
                if (ei41Var != null) {
                    ProgressDialog progressDialog = ei41Var.d;
                    progressDialog.show();
                    progressDialog.setTitle(2131961451);
                    progressDialog.setMessage(ei41Var.a.getString(2131961450));
                    break;
                }
                break;
            default:
                ei41 ei41Var2 = (ei41) ((WeakReference) uw0Var.i).get();
                if (ei41Var2 != null) {
                    Activity activity = ei41Var2.a;
                    ProgressDialog progressDialog2 = ei41Var2.d;
                    progressDialog2.setTitle(2131961451);
                    progressDialog2.setMessage(activity.getString(2131961449));
                    Vibrator vibrator = (Vibrator) activity.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(100L);
                    }
                    break;
                }
                break;
        }
    }
}
