package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bts0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dts0 b;
    public final /* synthetic */ l510 c;
    public final /* synthetic */ r9c d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ bts0(dts0 dts0Var, l510 l510Var, r9c r9cVar, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = dts0Var;
        this.c = l510Var;
        this.d = r9cVar;
        this.e = z;
        this.f = z2;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.c(this.c, (List) ((spq0) obj).h(), this.d, this.e, this.f);
            default:
                List list = (List) ((spq0) obj).h();
                boolean z = this.e;
                boolean z2 = this.f;
                dts0 dts0Var = this.b;
                l510 l510Var = this.c;
                return new z310(dts0Var.c(l510Var, list, this.d, z, z2), (f410) null, l510Var.b, l510Var.c);
        }
    }
}
