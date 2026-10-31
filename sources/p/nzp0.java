package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nzp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ jf01 c;
    public final /* synthetic */ szp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzp0(long j, jf01 jf01Var, szp0 szp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = jf01Var;
        this.d = szp0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                gxc gxcVar = (gxc) obj;
                mxc mxcVar = gxcVar.b;
                mxcVar.h = true;
                n4g1 n4g1Var = mxcVar.i;
                if (n4g1Var != null) {
                    return n4g1Var;
                }
                if (mxcVar.c) {
                    return null;
                }
                mxcVar.g = new IOException("Call ended without a response");
                yon1.K5(mxcVar, new nrj0(this.d, (byte) 25));
                return new m4g1(gxcVar.a, this.b, fae1.i(this.c.b, 0L), "Call ended without a response", 1, fae1.j(gxcVar, false));
            default:
                gxc gxcVar2 = (gxc) obj;
                mxc mxcVar2 = gxcVar2.b;
                if (mxcVar2.d) {
                    return null;
                }
                mxcVar2.d = true;
                return new o4g1(gxcVar2.a, this.b, fae1.i(this.c.b, 0L), new x8l(this.d.c.h));
        }
    }
}
