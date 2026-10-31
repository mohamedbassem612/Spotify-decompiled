package p;

import android.os.IBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class l1i0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h2i0 b;
    public final /* synthetic */ IBinder c;

    public /* synthetic */ l1i0(h2i0 h2i0Var, IBinder iBinder, byte b) {
        this.a = b;
        this.b = h2i0Var;
        this.c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        IBinder iBinder = this.c;
        h2i0 h2i0Var = this.b;
        switch (b) {
            case 0:
                v1k v1kVar = h2i0Var.m;
                v1kVar.J();
                ixh0 ixh0VarO = v1kVar.o(iBinder);
                if (ixh0VarO != null) {
                    v1kVar.D(ixh0VarO);
                }
                break;
            default:
                v1k v1kVar2 = h2i0Var.m;
                ixh0 ixh0VarO2 = v1kVar2.o(iBinder);
                if (ixh0VarO2 != null) {
                    v1kVar2.j(ixh0VarO2);
                }
                break;
        }
    }
}
