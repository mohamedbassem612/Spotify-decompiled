package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xu3 implements xq91 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ohd b;
    public final /* synthetic */ Object c;

    public xu3(AtomicBoolean atomicBoolean, ohd ohdVar) {
        this.c = atomicBoolean;
        this.b = ohdVar;
    }

    public final void b() {
        byte b = this.a;
        ohd ohdVar = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ohdVar.resumeWith(Boolean.TRUE);
                ((kt91) ((yu3) obj).c).i(this);
                break;
            default:
                if (((AtomicBoolean) obj).compareAndSet(false, true)) {
                    ohdVar.resumeWith(jhh1.b);
                    break;
                }
                break;
        }
    }

    public xu3(ohd ohdVar, yu3 yu3Var) {
        this.b = ohdVar;
        this.c = yu3Var;
    }
}
