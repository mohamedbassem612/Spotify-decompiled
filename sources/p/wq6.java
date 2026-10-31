package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wq6 implements dbc0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq6(zac0 zac0Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((rp) obj2).dispose();
                ((ven0) obj).setValue((Object) null);
                break;
            default:
                ((ar9) obj2).disable();
                ((xab1) obj).d((CancellationException) null);
                break;
        }
    }
}
