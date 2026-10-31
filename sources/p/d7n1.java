package p;

import android.app.Application;
import android.content.SharedPreferences;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase;
import com.ravelin.core.repository.db.AppDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d7n1 implements jly0 {
    public final /* synthetic */ byte a;
    public final jo80 b;

    public /* synthetic */ d7n1(Object obj, jo80 jo80Var, byte b) {
        this.a = b;
        this.b = jo80Var;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        jo80 jo80Var = this.b;
        switch (b) {
            case 0:
                return new a7n1((Application) jo80Var.a);
            case 1:
                Application application = (Application) jo80Var.a;
                try {
                    ytw0.c(application);
                    SharedPreferences sharedPreferences = application.getSharedPreferences("my_com.ravelin.core_shared_pref_data", 0);
                    sharedPreferences.getClass();
                    return sharedPreferences;
                } catch (Exception unused) {
                    SharedPreferences sharedPreferences2 = application.getSharedPreferences("my_com.ravelin.core_shared_pref_data", 0);
                    sharedPreferences2.getClass();
                    return sharedPreferences2;
                }
            case 2:
                bn31 bn31VarT = u890.t((Application) jo80Var.a, BroadcastsDatabase.class, "com.ravelin.sdk.broadcasts");
                bn31VarT.i = true;
                return bn31VarT.c();
            case 3:
                return new b7n1(((Application) jo80Var.a).getApplicationContext());
            case 4:
                bn31 bn31VarT2 = u890.t((Application) jo80Var.a, AppDatabase.class, "com.ravelin.sdk.device");
                bn31VarT2.i = true;
                bn31VarT2.a(new trj0[]{AppDatabase.l, AppDatabase.m, AppDatabase.n, AppDatabase.o});
                return bn31VarT2.c();
            default:
                return new v6n1((Application) jo80Var.a);
        }
    }
}
