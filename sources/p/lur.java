package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lur implements a4l {
    public final kly0 a;
    public final kly0 b;
    public final mur c;
    public final Scheduler d;
    public final vku e = new vku();

    public lur(kly0 kly0Var, kly0 kly0Var2, mur murVar, h94 h94Var, Scheduler scheduler) {
        this.a = kly0Var;
        this.b = kly0Var2;
        this.c = murVar;
        this.d = scheduler;
    }

    @Override // p.a4l
    public final void a() {
        this.e.c();
    }

    public final LinkedHashMap c() {
        List<zqt> list = (List) qyo1.x(((art) this.b.get()).a, true, false, new qrk((byte) 15));
        int iS = zno1.s(q7h.U(list, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (zqt zqtVar : list) {
            mmr0 mmr0VarN = oqn1.n(zqtVar.a, Long.valueOf(zqtVar.b));
            linkedHashMap.put(mmr0VarN.a, mmr0VarN.b);
        }
        return linkedHashMap;
    }

    public final void d(String str, Function0 function0) {
        zqt zqtVar = new zqt(this.c.a(str), System.currentTimeMillis());
        art artVar = (art) this.b.get();
        this.e.a(m5n1.l(artVar.a, new wrs(artVar, zqtVar, (byte) 11)).g(new qs4(zqtVar, (byte) 1)).s(this.d).subscribe(new kur(function0, (byte) 0)));
    }
}
