package p;

import com.spotify.player.model.SleepTimer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tyh0 implements syh0 {
    public dg90 a;
    public ryh0 b = new ryh0();

    public final void a(boolean z) {
        ryh0 ryh0Var = this.b;
        if (ryh0Var.a != z) {
            ryh0 ryh0VarA = ryh0.a(ryh0Var, z, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (SleepTimer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (b380) null, (Set) null, (String) null, (String) null, (String) null, -2, 7);
            this.b = ryh0VarA;
            dg90 dg90Var = this.a;
            if (dg90Var != null) {
                ((y490) dg90Var.b).setExtras(ryh0VarA.b());
            }
        }
    }

    public final void b(dg90 dg90Var) {
        this.a = dg90Var;
        if (dg90Var != null) {
            ((y490) dg90Var.b).setExtras(this.b.b());
        }
    }
}
