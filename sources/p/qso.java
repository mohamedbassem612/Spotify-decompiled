package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qso extends x7e0 implements b031 {
    public final es20 d;
    public fw20 e;

    public qso(es20 es20Var) {
        this.d = es20Var;
    }

    public final void a(Bundle bundle) {
        this.e = (fw20) bundle.getParcelable("customization_flow_snapshot");
    }

    public final void e() {
        j();
        i();
    }

    public final void f() {
        this.d.b();
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bpb1 bpb1Var = this.d.e;
        Map map = ((gw20) bpb1Var.getValue()).a;
        List list = ((gw20) bpb1Var.getValue()).b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new jvb1(((evb1) it.next()).a));
        }
        bundle.putParcelable("customization_flow_snapshot", new fw20(map, arrayList));
        return bundle;
    }
}
