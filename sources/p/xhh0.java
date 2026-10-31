package p;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xhh0 extends gih0 {
    public final /* synthetic */ zhh0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ jih0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhh0(jih0 jih0Var, String str, zhh0 zhh0Var, String str2, Bundle bundle) {
        super(str);
        this.h = jih0Var;
        this.e = zhh0Var;
        this.f = str2;
        this.g = bundle;
    }

    @Override // p.gih0
    public final void c(Object obj) {
        List list = (List) obj;
        Bundle bundle = this.g;
        y36 y36Var = this.h.d;
        zhh0 zhh0Var = this.e;
        d4e0 d4e0Var = zhh0Var.d;
        if (y36Var.get(((Messenger) d4e0Var.b).getBinder()) != zhh0Var) {
            int i = jih0.g;
        } else {
            try {
                d4e0Var.k(this.f, bundle, list);
            } catch (RemoteException unused) {
            }
        }
    }
}
