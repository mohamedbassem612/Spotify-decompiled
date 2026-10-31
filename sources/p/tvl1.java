package p;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tvl1 {
    public final dwl1 a;
    public final lsw0 b;
    public final dxl1 c;

    static {
        qs10.c("WMFgUpdater");
    }

    public tvl1(WorkDatabase workDatabase, lsw0 lsw0Var, dwl1 dwl1Var) {
        this.b = lsw0Var;
        this.a = dwl1Var;
        this.c = workDatabase.A();
    }
}
