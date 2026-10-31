package p;

import com.spotify.campfire.elements.sharedbychip.impl.proto.NudgeData;
import com.spotify.campfire.elements.sharedbychip.impl.proto.RetrieveNudgeDataResponse;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zr71 extends onm {
    public /* synthetic */ Object X;
    public final /* synthetic */ dc31 Y;
    public int Z;
    public String a;
    public RetrieveNudgeDataResponse b;
    public cex0 c;
    public Collection d;
    public Iterator e;
    public NudgeData f;
    public String g;
    public Collection h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr71(dc31 dc31Var, onm onmVar) {
        super(onmVar);
        this.Y = dc31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        Object objI = this.Y.i(null, this);
        return objI == d9n.a ? objI : new e331(objI);
    }
}
