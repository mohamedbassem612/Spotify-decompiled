package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r9q0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t9q0 b;

    public /* synthetic */ r9q0(t9q0 t9q0Var, byte b) {
        this.a = b;
        this.b = t9q0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        t9q0 t9q0Var = this.b;
        switch (b) {
            case 0:
                v9q0 v9q0Var = (v9q0) obj;
                tv80 tv80Var = v9q0Var.b;
                String str = v9q0Var.a;
                lzn0 lzn0Var = t9q0Var.a;
                if (tv80Var == null) {
                    lzn0Var.h(str);
                } else {
                    lzn0Var.a(str, tv80Var, (Bundle) null);
                }
                break;
            default:
                u9q0 u9q0Var = (u9q0) obj;
                ArrayList arrayList = u9q0Var.a;
                String str2 = u9q0Var.b;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("multi_event_card_uris", new ArrayList<>(arrayList));
                bundle.putString("multi_event_card_artist_uri", str2);
                tv80 tv80Var2 = u9q0Var.c;
                lzn0 lzn0Var2 = t9q0Var.a;
                if (tv80Var2 == null) {
                    lzn0Var2.g(bundle, i1k0.r());
                } else {
                    lzn0Var2.a(i1k0.r(), tv80Var2, bundle);
                }
                break;
        }
    }
}
