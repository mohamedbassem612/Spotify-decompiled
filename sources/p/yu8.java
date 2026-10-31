package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yu8 implements anc0 {
    public final /* synthetic */ byte a;
    public final q8n b;
    public xab1 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public yu8(String str, iyc0 iyc0Var, uu00 uu00Var, mnk0 mnk0Var, q8n q8nVar) {
        this.a = (byte) 0;
        this.d = str;
        this.e = iyc0Var;
        this.f = uu00Var;
        this.g = mnk0Var;
        this.b = q8nVar;
    }

    @Override // p.anc0
    public final void a() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = this.c;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            case 1:
                xab1 xab1Var2 = this.c;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                break;
            default:
                xab1 xab1Var3 = this.c;
                if (xab1Var3 != null) {
                    xab1Var3.d((CancellationException) null);
                }
                break;
        }
    }

    @Override // p.anc0
    public final void b() {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                xab1 xab1Var = this.c;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.c = fn31.T(smo1.e(q8nVar), (o8n) null, 0, new wt(this, null, (byte) 13), 3);
                break;
            case 1:
                xab1 xab1Var2 = this.c;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                this.c = fn31.T(smo1.e(q8nVar), (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 11), 3);
                break;
            default:
                xab1 xab1Var3 = this.c;
                if (xab1Var3 != null) {
                    xab1Var3.d((CancellationException) null);
                }
                this.c = fn31.T(smo1.e(q8nVar), (o8n) null, 0, new f3t0(this, (lnm) null, (byte) 9), 3);
                break;
        }
    }

    public /* synthetic */ yu8(Object obj, Object obj2, Object obj3, q8n q8nVar, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = q8nVar;
        this.g = obj4;
    }
}
