package p;

import com.spotify.mobius.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xq6 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ xq6(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                ven0Var.setValue(list);
                break;
            default:
                xuj1 xuj1Var = (xuj1) obj;
                xuj1Var.getClass();
                ven0Var.setValue(xuj1Var);
                break;
        }
    }
}
