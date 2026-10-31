package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class odm implements anc0 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public odm(d0r d0rVar, String str, u9c0 u9c0Var, ynb0 ynb0Var) {
        this.a = (byte) 1;
        this.c = u9c0Var;
        this.d = ynb0Var;
        this.e = new p1e0(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, mmp0.S0, new j4r(mmp0.Q0), mmp0.T0), mmp0.R0), str), (byte) 26);
    }

    @Override // p.anc0
    public final void a() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = (xab1) this.b;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            case 1:
                xab1 xab1Var2 = (xab1) this.b;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                break;
            default:
                ((vku) this.b).c();
                break;
        }
    }

    @Override // p.anc0
    public final void b() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                xab1 xab1Var = (xab1) this.b;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.b = fn31.T(smo1.e((q8n) obj), (o8n) null, 0, new awe(this, (lnm) null, (byte) 22), 3);
                break;
            case 1:
                xab1 xab1Var2 = (xab1) this.b;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                this.b = fn31.T((u9c0) this.c, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 1), 3);
                break;
            default:
                if (zro1.u((c8c0) obj)) {
                    ((vku) this.b).a(rqt0.F(o6x.a, new i2p0(this, (lnm) null, (byte) 20)).subscribe(xfs0.c, xfs0.d));
                    break;
                }
                break;
        }
    }

    public odm(fqb fqbVar, q8n q8nVar, sen0 sen0Var) {
        this.a = (byte) 0;
        this.c = fqbVar;
        this.d = q8nVar;
        this.e = sen0Var;
    }

    public odm(iyc0 iyc0Var, c8c0 c8c0Var, String str) {
        this.a = (byte) 2;
        this.c = iyc0Var;
        this.d = c8c0Var;
        this.e = str;
        this.b = new vku();
    }
}
