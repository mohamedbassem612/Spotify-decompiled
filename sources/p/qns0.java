package p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qns0 {
    public final q8n a;
    public final jn7 b;

    public qns0(jn7 jn7Var, q8n q8nVar) {
        this.a = q8nVar;
        this.b = jn7Var;
    }

    public final Object a(String str, List list, onm onmVar, boolean z) {
        return c921.H(this.a, new t6a(this, list, str, z, (lnm) null, (byte) 2), onmVar);
    }

    public final Single b(String str, List list, boolean z) {
        return rqt0.F(this.a, new du2(this, list, str, z, (lnm) null, (byte) 8));
    }

    public final mr20 c() {
        return o4p1.r(new k6e0(this.b.S(Empty.o().build()), (byte) 23), this.a);
    }
}
