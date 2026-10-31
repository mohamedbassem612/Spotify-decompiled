package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xl71 extends hab0 implements iu30 {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ wh71 b;
    public final /* synthetic */ flw0 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl71(int i, ArrayList arrayList, q8n q8nVar, flw0 flw0Var, wh71 wh71Var) {
        super(1);
        this.a = q8nVar;
        this.b = wh71Var;
        this.c = flw0Var;
        this.d = arrayList;
        this.e = i;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = new x6w0(this.d, this.e, (byte) 2);
        casVar.d = da71.X;
        casVar.e = da71.Y;
        casVar.a(new ldz0(1, (byte) 28), new ldz0(1, (byte) 29));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new wzv0(new tu41(this.b.b(new uh71(rc11.a.b(elw0.class), null)), (byte) 15), (byte) 21), new wzv0(new fts(this.c.a, (byte) 7), (byte) 22)};
        companion.getClass();
        casVar.b = new b(this.a, mr20VarArr);
        return rih1.a;
    }
}
