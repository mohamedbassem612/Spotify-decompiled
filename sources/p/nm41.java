package p;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nm41 implements em00 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ List b;
    public final /* synthetic */ btk c;
    public final /* synthetic */ WorkDatabase d;

    public /* synthetic */ nm41(Executor executor, List list, btk btkVar, WorkDatabase workDatabase) {
        this.a = executor;
        this.b = list;
        this.c = btkVar;
        this.d = workDatabase;
    }

    public final void a(uvl1 uvl1Var, boolean z) {
        this.a.execute(new m2d(this.b, uvl1Var, this.c, this.d, (byte) 24));
    }
}
