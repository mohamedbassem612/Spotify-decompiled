package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class llo implements mko {
    public final String a;
    public final qlw b;
    public final q8n c;
    public final q8n d;
    public MobiusLoop e;
    public final idd1 f;

    public llo(iac0 iac0Var, String str, qlw qlwVar, q8n q8nVar, q8n q8nVar2) {
        this.a = str;
        this.b = qlwVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        iac0Var.getLifecycle().a(new flo(this));
        this.f = new idd1(new z5o(this, (byte) 2));
    }

    public final void a(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set set2 = s4b1.f;
            String strZ = uic.x(str).z();
            if (strZ != null) {
                arrayList.add(strZ);
            }
        }
        Set setP1 = o7h.p1(arrayList);
        if (setP1.isEmpty()) {
            return;
        }
        MobiusLoop mobiusLoop = this.e;
        if (mobiusLoop != null) {
            mobiusLoop.a(new y450(setP1));
        } else {
            n57.e("Trying to set items of interest in CurationStateApiService before the service is started or after it's been stopped");
        }
    }

    public final kko b() {
        return (kko) this.f.getValue();
    }

    public final void start() {
        this.e = Mobius.d(rve0.c, this.b.a((String) null, new m95(this.a, (lnm) null, (byte) 1))).d(new fna(this, (byte) 29)).b(new i3b(this, (byte) 25)).g(slo.a);
    }

    public final void stop() {
        MobiusLoop mobiusLoop = this.e;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            n57.e("Trying to stop CurationStateApiService before the service is started or after it's been stopped");
        }
        this.e = null;
    }
}
