package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class de0 extends sgp0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de0(byte b) {
        super((Object) null);
        this.b = b;
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                z7a z7aVar = (z7a) obj;
                if (z7aVar != null) {
                    z7aVar.a();
                }
                break;
            case 1:
                faa0 faa0Var = (faa0) obj;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                break;
            default:
                z7a z7aVar2 = (z7a) obj;
                if (z7aVar2 != null) {
                    z7aVar2.a();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de0(Object obj) {
        super(obj);
        this.b = (byte) 2;
    }
}
