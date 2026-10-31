package p;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.spotify.scannables.scannables.ScannablesException;
import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ai41 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ ai41(uw0 uw0Var, byte b) {
        this.a = b;
        this.b = uw0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ei41 ei41Var = (ei41) ((WeakReference) uw0Var.i).get();
                if (ei41Var != null) {
                    ei41Var.d.dismiss();
                    boolean z = th instanceof ScannablesException;
                    Activity activity = ei41Var.a;
                    if (!z) {
                        Toast.makeText(activity, 2131961443, 0).show();
                        activity.setResult(0);
                        activity.finish();
                    } else {
                        Toast.makeText(activity, 2131961442, 1).show();
                    }
                    break;
                }
                break;
            default:
                gm70 gm70Var = (gm70) obj;
                ei41 ei41Var2 = (ei41) ((WeakReference) uw0Var.i).get();
                if (ei41Var2 != null) {
                    ei41Var2.d.dismiss();
                    String str = gm70Var.a;
                    Intent intent = new Intent();
                    intent.putExtra("com.spotify.scannables.scannables.RESULT", str);
                    Activity activity2 = ei41Var2.a;
                    activity2.setResult(-1, intent);
                    activity2.finish();
                    break;
                }
                break;
        }
    }
}
