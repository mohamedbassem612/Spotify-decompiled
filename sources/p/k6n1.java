package p;

import android.content.SharedPreferences;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase;
import com.ravelin.core.repository.db.AppDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k6n1 implements jly0 {
    public final d7n1 a;
    public final d7n1 b;
    public final jly0 c;
    public final jly0 d;
    public final jly0 e;

    public k6n1(ytw0 ytw0Var, d7n1 d7n1Var, d7n1 d7n1Var2, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        this.a = d7n1Var;
        this.b = d7n1Var2;
        this.c = jly0Var;
        this.d = jly0Var2;
        this.e = jly0Var3;
    }

    @Override // p.kly0
    public final Object get() {
        return new ovg((AppDatabase) this.a.get(), (BroadcastsDatabase) this.b.get(), (g7n1) this.c.get(), (SharedPreferences) this.d.get(), (o9b0) this.e.get());
    }
}
