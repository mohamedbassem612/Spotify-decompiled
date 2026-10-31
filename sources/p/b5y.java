package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b5y extends hab0 implements vu30 {
    public final /* synthetic */ c5y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5y(c5y c5yVar) {
        super(2);
        this.a = c5yVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        z4y z4yVar = this.a.b;
        return Mobius.d(y4y.a, z4yVar.a).c(z4yVar.b, new EventSource[0]);
    }
}
