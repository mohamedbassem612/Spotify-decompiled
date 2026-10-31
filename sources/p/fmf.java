package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fmf implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fmf(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        boolean z;
        switch (this.a) {
            case 0:
                if (k8c0Var == k8c0.ON_RESUME) {
                    l811 l811Var = (l811) this.b;
                    if (l811Var.a) {
                        l811Var.a = false;
                        return;
                    } else {
                        mmf mmfVar = (mmf) this.c;
                        fn31.T(mmfVar.O0, null, 0, new x4c(mmfVar, (String) this.d, (ven0) this.e, (lnm) null, (byte) 6), 3);
                        return;
                    }
                }
                return;
            default:
                mhd mhdVarD = null;
                switch (ftl1.a[k8c0Var.ordinal()]) {
                    case 1:
                        fn31.T((llm) this.b, null, 4, new nsf1((p811) this.e, (p311) this.d, iac0Var, this, (lnm) null, (byte) 17), 1);
                        return;
                    case 2:
                        a65 a65Var = (a65) this.c;
                        if (a65Var != null) {
                            y861 y861Var = (y861) a65Var.c;
                            synchronized (y861Var.b) {
                                try {
                                    synchronized (y861Var.b) {
                                        z = y861Var.a;
                                    }
                                    if (!z) {
                                        ArrayList arrayList = (ArrayList) y861Var.c;
                                        y861Var.c = (ArrayList) y861Var.d;
                                        y861Var.d = arrayList;
                                        y861Var.a = true;
                                        int size = arrayList.size();
                                        for (int i = 0; i < size; i++) {
                                            ((lnm) arrayList.get(i)).resumeWith(rih1.a);
                                        }
                                        arrayList.clear();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        p311 p311Var = (p311) this.d;
                        synchronized (p311Var.d) {
                            if (p311Var.u) {
                                p311Var.u = false;
                                mhdVarD = p311Var.D();
                            }
                            break;
                        }
                        if (mhdVarD != null) {
                            ((ohd) mhdVarD).resumeWith(rih1.a);
                            return;
                        }
                        return;
                    case 3:
                        p311 p311Var2 = (p311) this.d;
                        synchronized (p311Var2.d) {
                            p311Var2.u = true;
                        }
                        return;
                    case 4:
                        ((p311) this.d).B();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        return;
                    default:
                        eg.o();
                        return;
                }
        }
    }
}
