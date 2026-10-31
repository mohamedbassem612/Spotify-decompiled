package p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class yq70 implements xe30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yq70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.xe30
    public final void a(ye30 ye30Var) {
        hpd1 hpd1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ar70 ar70Var = (ar70) ((WeakReference) ((zq70) obj).e).get();
                if (ar70Var != null) {
                    ar70Var.T0.execute(new gv40(ar70Var, (byte) 3));
                    return;
                }
                return;
            default:
                vnd vndVar = (vnd) obj;
                synchronized (vndVar.c) {
                    try {
                        int i = vndVar.b - 1;
                        vndVar.b = i;
                        if (vndVar.a && i == 0) {
                            vndVar.close();
                        }
                        hpd1Var = (hpd1) vndVar.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (hpd1Var != null) {
                    hpd1Var.a(ye30Var);
                    return;
                }
                return;
        }
    }
}
