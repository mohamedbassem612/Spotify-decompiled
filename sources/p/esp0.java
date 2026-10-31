package p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.search.esperanto.proto.OfflineSearchRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.AbstractSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class esp0 implements m710 {
    public final Context a;
    public final fwp0 b;

    public esp0(Context context, fwp0 fwp0Var) {
        this.a = context;
        this.b = fwp0Var;
    }

    @Override // p.m710
    public final Single a(String str, Bundle bundle, m210 m210Var, AbstractSet abstractSet) {
        dwp0 dwp0VarN = OfflineSearchRequest.n();
        dwp0VarN.q(str);
        return this.b.a(dwp0VarN.build()).map(new swm0(this, (byte) 13));
    }
}
