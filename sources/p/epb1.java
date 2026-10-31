package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class epb1 extends ymd0 {
    public Object N0;
    public final zob1 Y;
    public xab1 Z;

    public epb1(zob1 zob1Var) {
        super(zob1Var.getValue());
        this.Y = zob1Var;
        this.N0 = zob1Var.getValue();
    }

    public final Object e() {
        return this.Y.getValue();
    }

    public final void h() {
        Object value = this.Y.getValue();
        if (!u890.j(value, this.N0)) {
            this.N0 = value;
            m(value);
        }
        fns fnsVar = igu.a;
        this.Z = fn31.T(smo1.e(pyf0.a.f), (o8n) null, 0, new xba1(this, (lnm) null, (byte) 11), 3);
    }

    public final void i() {
        xab1 xab1Var = this.Z;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Z = null;
    }
}
