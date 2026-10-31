package p;

import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yku implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ yku(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                l811 l811Var = (l811) this.c;
                Consumer consumer = (Consumer) this.d;
                synchronized (obj2) {
                    if (!l811Var.a) {
                        consumer.accept(obj);
                    }
                    break;
                }
                return;
            default:
                phf0 phf0Var = (phf0) obj;
                hcb0 hcb0Var = (hcb0) this.c;
                if (phf0Var instanceof lhf0) {
                    ((Function0) this.b).invoke();
                    return;
                }
                if (phf0Var instanceof mhf0) {
                    hcb0Var.close();
                    return;
                }
                if (phf0Var instanceof ohf0) {
                    ((e4f0) this.d).invoke(Boolean.valueOf(((ohf0) phf0Var).a));
                    return;
                } else if (!(phf0Var instanceof nhf0)) {
                    eg.o();
                    return;
                } else {
                    nhf0 nhf0Var = (nhf0) phf0Var;
                    hcb0Var.b(nhf0Var.a, nhf0Var.b);
                    return;
                }
        }
    }
}
