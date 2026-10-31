package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e5q implements gri0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ e5q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final jd6 a(d0r d0rVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new jd6(d0rVar, (Optional) ((v5q) ((thq) r7qVar).c).y6.get());
            default:
                return new jd6(d0rVar, (Optional) r7qVar.d.S4.get());
        }
    }
}
