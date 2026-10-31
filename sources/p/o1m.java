package p;

import android.os.Looper;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o1m implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1m b;

    public /* synthetic */ o1m(p1m p1mVar, byte b) {
        this.a = b;
        this.b = p1mVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        p1m p1mVar = this.b;
        switch (b) {
            case 0:
                gmj gmjVar = new gmj(p1mVar, (ro41) obj, (byte) 22);
                if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                    p1mVar.h.post(new s10(gmjVar, (byte) 28));
                } else {
                    gmjVar.invoke();
                }
                break;
            default:
                z3m z3mVar = (z3m) obj;
                bbc bbcVar = p1mVar.f;
                z3mVar.getClass();
                bbcVar.l(z3mVar);
                break;
        }
    }
}
