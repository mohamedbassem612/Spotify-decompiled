package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ay51 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by51 b;

    public /* synthetic */ ay51(by51 by51Var, byte b) {
        this.a = b;
        this.b = by51Var;
    }

    public final void accept(Object obj) {
        Object value;
        byte b = this.a;
        by51 by51Var = this.b;
        switch (b) {
            case 0:
                fy51 fy51Var = (fy51) obj;
                d061 d061Var = by51Var.e;
                if (d061Var != null) {
                    d061Var.invoke(new sw31(fy51Var.a, fy51Var.b));
                }
                break;
            default:
                gy51 gy51Var = (gy51) obj;
                ede1 ede1Var = by51Var.b;
                Set set = gy51Var.a;
                Set set2 = gy51Var.b;
                bpb1 bpb1Var = ede1Var.a;
                do {
                    value = bpb1Var.getValue();
                    ((dde1) value).getClass();
                } while (!bpb1Var.k(value, new dde1(set, set2)));
                break;
        }
    }
}
