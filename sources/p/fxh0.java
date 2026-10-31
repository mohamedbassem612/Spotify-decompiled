package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fxh0 implements exh0 {
    public final q8n a;
    public final j0i0 b;
    public final v62 c = new v62((byte) 15);

    public fxh0(q8n q8nVar, j0i0 j0i0Var) {
        this.a = q8nVar;
        this.b = j0i0Var;
    }

    public static void a(Context context, List list) {
        Logger.b("MBS: Setting component states: %s", new Object[]{list});
        try {
            if (Build.VERSION.SDK_INT < 33) {
                Logger.b("MBS: Using setComponentEnabledSetting (non-atomic).", new Object[0]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mmr0 mmr0Var = (mmr0) it.next();
                    context.getPackageManager().setComponentEnabledSetting((ComponentName) mmr0Var.a, ((Number) mmr0Var.b).intValue(), 1);
                }
                return;
            }
            Logger.b("MBS: Using setComponentEnabledSettings (atomic).", new Object[0]);
            PackageManager packageManager = context.getPackageManager();
            List<mmr0> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (mmr0 mmr0Var2 : list2) {
                ComponentName componentName = (ComponentName) mmr0Var2.a;
                int iIntValue = ((Number) mmr0Var2.b).intValue();
                rqb.e();
                arrayList.add(rqb.a(iIntValue, componentName));
            }
            packageManager.setComponentEnabledSettings(arrayList);
        } catch (Exception e) {
            n57.t("Failed to set component states: " + list, e);
        }
    }
}
