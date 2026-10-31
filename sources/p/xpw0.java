package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xpw0 implements kly0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ xpw0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ypw0 ypw0Var = (ypw0) obj;
                a1r0 a1r0Var = (a1r0) ypw0Var.f;
                iyc0 iyc0Var = (iyc0) ypw0Var.g;
                Resources resources = (Resources) ypw0Var.h;
                q8n q8nVar = ypw0Var.b;
                qow0 qow0Var = new qow0((iu30) obj2, a1r0Var, iyc0Var, resources, q8nVar);
                zpw0 zpw0Var = (zpw0) ypw0Var.d;
                ov20 ov20Var = (ov20) ypw0Var.e;
                q8n q8nVar2 = ypw0Var.c;
                return new fpw0(qow0Var, new jpw0(zpw0Var, ov20Var, q8nVar2), q8nVar, q8nVar2);
            default:
                twb twbVar = new twb((byte) 29);
                khc khcVar = new khc((byte) 28);
                t09 t09Var = t09.f;
                xa4.l(t09Var);
                return new c441(twbVar, khcVar, t09Var, (vm41) ((kly0) obj2).get(), (kly0) obj);
        }
    }
}
