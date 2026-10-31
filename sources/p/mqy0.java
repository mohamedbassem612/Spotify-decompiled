package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mqy0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nqy0 b;

    public /* synthetic */ mqy0(nqy0 nqy0Var, byte b) {
        this.a = b;
        this.b = nqy0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        nqy0 nqy0Var = this.b;
        switch (b) {
            case 0:
                l0x0 l0x0Var = nqy0Var.a;
                a1r0.i((a1r0) l0x0Var.b, "spotify:internal:puffin-setup-autodetect", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((jqy0) obj).c), 2);
                break;
            default:
                l0x0 l0x0Var2 = nqy0Var.a;
                List list = oqy0.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((gw70) l0x0Var2.d).f((String) it.next()).n();
                    arrayList.add(rih1.a);
                }
                break;
        }
    }
}
