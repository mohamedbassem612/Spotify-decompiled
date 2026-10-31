package p;

import android.content.Context;
import android.view.Window;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nfx implements u0i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public nfx(wfx wfxVar) {
        this.a = (byte) 1;
        this.b = wfxVar;
        this.c = new idd1(new v7v(wfxVar, (byte) 19));
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    wfx wfxVar = (wfx) obj;
                    return new mgr(wfxVar.b, (Scheduler) obj2, wfxVar.a);
                }
                bhn0.d();
                return null;
            case 1:
                wfx wfxVar2 = (wfx) obj;
                return new yir(wfxVar2.b, wfxVar2.a, (rcf0) ((idd1) obj2).getValue(), u890.j((k9z) l0iVar, k9z.b));
            case 2:
                if (l0iVar == null) {
                    ufx ufxVar = (ufx) obj;
                    return new dds(ufxVar.a, ufxVar.b, (i3h) obj2);
                }
                bhn0.d();
                return null;
            case 3:
                if (l0iVar == null) {
                    Context context = ((vfx) obj).a;
                    return new wyr(context, new no5(context), (Window) obj2);
                }
                bhn0.d();
                return null;
            case 4:
                return new vis(((ufx) obj).a, (af10) obj2);
            case 5:
                return new nts(this, (pky) l0iVar);
            default:
                return new yir(((ufx) obj).a, (gw70) obj2, true);
        }
    }

    public /* synthetic */ nfx(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
