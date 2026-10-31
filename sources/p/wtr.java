package p;

import com.spotify.libs.connect.events.proto.ConnectDeviceDiscoverySnapshot;
import com.spotify.libs.connect.events.proto.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wtr {
    public final t2j0 a;
    public final byp b;
    public final vn8 c;
    public final llm d;
    public faa0 e;
    public fqt f;

    public wtr(t2j0 t2j0Var, byp bypVar, q8n q8nVar, vn8 vn8Var) {
        this.a = t2j0Var;
        this.b = bypVar;
        this.c = vn8Var;
        this.d = cy30.t(q8nVar);
    }

    public final boolean a(fqt fqtVar) {
        boolean zEquals;
        if (!fqtVar.a.isEmpty()) {
            ArrayList arrayList = fqtVar.a;
            fqt fqtVar2 = this.f;
            ArrayList arrayList2 = fqtVar2 != null ? fqtVar2.a : null;
            if (arrayList2 == null) {
                zEquals = false;
            } else {
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a builder = ((ConnectDeviceDiscoverySnapshot) it.next()).toBuilder();
                    builder.W("");
                    builder.P("");
                    builder.w("");
                    arrayList3.add(builder.build());
                }
                List listA1 = o7h.a1(arrayList3, new p0d((byte) 25));
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    a builder2 = ((ConnectDeviceDiscoverySnapshot) it2.next()).toBuilder();
                    builder2.W("");
                    builder2.P("");
                    builder2.w("");
                    arrayList4.add(builder2.build());
                }
                zEquals = listA1.equals(o7h.a1(arrayList4, new p0d((byte) 26)));
            }
            if (!zEquals) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long jLongValue = ((Number) this.c.b()).longValue();
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.e = c921.y(this.d, (o8n) null, 0, new kv2(this, jLongValue, (lnm) null, (byte) 5), 3);
    }
}
