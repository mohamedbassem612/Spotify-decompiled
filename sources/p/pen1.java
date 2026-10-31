package p;

import android.os.Bundle;
import com.google.android.engage.service.AppEngageException;
import com.google.android.gms.internal.engage.zzp;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class pen1 implements bgp1, ufp1, fsc1, mnm {
    public static final /* synthetic */ pen1 a = new pen1();
    public static final /* synthetic */ pen1 b = new pen1();

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        return lhn1.b((ydn1) pno1Var);
    }

    public Object d(Task task) {
        int errorCode;
        jm jmVar = ndn1.f;
        if (((hfp1) task).d) {
            return o0c.y(new AppEngageException(3));
        }
        if (task.j()) {
            return o0c.z(Boolean.valueOf(((Bundle) task.g()).getBoolean("availability", false)));
        }
        AppEngageException appEngageExceptionF = task.f();
        if (appEngageExceptionF == null) {
            return o0c.y(new AppEngageException(3));
        }
        if (appEngageExceptionF instanceof zzp) {
            return o0c.z(Boolean.FALSE);
        }
        return ((appEngageExceptionF instanceof AppEngageException) && ((errorCode = appEngageExceptionF.getErrorCode()) == 2 || errorCode == 1)) ? o0c.z(Boolean.FALSE) : o0c.y(appEngageExceptionF);
    }

    public hfp1 e(Object obj) {
        return o0c.z((Object) null);
    }
}
