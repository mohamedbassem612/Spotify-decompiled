package p;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ws50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws50(ys50 ys50Var, c9n c9nVar, long j, List list, int i) {
        super(1);
        this.d = ys50Var;
        this.e = c9nVar;
        this.b = j;
        this.f = list;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        long j = 0;
        switch (this.a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                List list = (List) this.f;
                ys50 ys50Var = (ys50) this.d;
                int i = ys50Var.f;
                if (i == 2 || i == 3) {
                    ys50Var.b.cancel();
                    smo1.p((c9n) this.e, (CancellationException) null);
                }
                long j2 = jLongValue - this.b;
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= size) {
                        i2 = i3;
                    } else if (j2 < j || j2 >= ((long) ((zs50) list.get(i2)).b) + j) {
                        j += (long) ((zs50) list.get(i2)).b;
                        i3 = i2 + 1;
                        i2 = i3;
                    }
                }
                ys50Var.e = this.c + i2;
                if (i2 >= list.size()) {
                    ys50Var.f = 3;
                }
                return rih1.a;
            default:
                gxc gxcVar = (gxc) obj;
                mxc mxcVar = gxcVar.b;
                mxcVar.g = (IOException) this.d;
                yon1.K5(mxcVar, new n82(this.b, (voe1) this.f, (byte) 10));
                return new m4g1(gxcVar.a, this.b, fae1.i(((jf01) this.e).b, 0L), ((IOException) this.d).toString(), this.c, fae1.j(gxcVar, ((jf01) this.e).R0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws50(IOException iOException, long j, jf01 jf01Var, int i, voe1 voe1Var) {
        super(1);
        this.d = iOException;
        this.b = j;
        this.e = jf01Var;
        this.c = i;
        this.f = voe1Var;
    }
}
