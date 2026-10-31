package p;

import android.app.PendingIntent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.engage.service.AppEngageException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.engage.zzp;
import com.google.android.gms.tasks.Task;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class qen1 implements egp1, bgp1, v0i, mnm {
    public static final /* synthetic */ qen1 a = new qen1();
    public static final /* synthetic */ qen1 b = new qen1();

    public Object d(Task task) {
        jm jmVar = ndn1.f;
        if (((hfp1) task).d) {
            return o0c.y(new AppEngageException(3));
        }
        if (!task.j()) {
            Exception excF = task.f();
            if (excF != null) {
                return excF instanceof zzp ? o0c.y(new AppEngageException(2)) : o0c.y(excF);
            }
            return o0c.y(new AppEngageException(3));
        }
        Bundle bundle = (Bundle) task.g();
        int i = bundle.getInt("service_error_code", -1);
        String string = bundle.getString("service_error_message", "");
        if (i <= 0) {
            return o0c.z(bundle);
        }
        if (TextUtils.isEmpty(string)) {
            return o0c.y(new AppEngageException(i));
        }
        AppEngageException appEngageException = new AppEngageException(new Status(i, f4i1.f(String.format(Locale.getDefault(), "App Engage Service Error: %d", Integer.valueOf(i)), "\n", string), (PendingIntent) null, (lal) null));
        if (i != 0) {
            return o0c.y(appEngageException);
        }
        hhg1.n("errorCode should not be 0.");
        return null;
    }

    public Object m(dxy dxyVar) {
        return new mio1((qok0) dxyVar.a(qok0.class));
    }
}
