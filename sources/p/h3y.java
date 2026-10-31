package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.android.MobiusAndroid;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h3y extends hab0 implements Function0 {
    public final /* synthetic */ j3y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3y(j3y j3yVar) {
        super(0);
        this.a = j3yVar;
    }

    public final Object invoke() {
        m3y m3yVar = this.a.W1;
        if (m3yVar != null) {
            return MobiusAndroid.a(Mobius.d(l3y.a, m3yVar.a), new u3y("", 1, false, false));
        }
        u890.C("mobiusInjector");
        throw null;
    }
}
