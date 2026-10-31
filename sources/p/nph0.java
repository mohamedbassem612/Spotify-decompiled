package p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nph0 implements bi7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tph0 b;

    public /* synthetic */ nph0(tph0 tph0Var, byte b) {
        this.a = b;
        this.b = tph0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n8d0 apply(Object obj) {
        Object obj2;
        Object obj3;
        byte b = this.a;
        l5u l5uVar = l5u.a;
        Object[] objArr = 0;
        s7c0 s7c0Var = (s7c0) obj;
        switch (b) {
            case 0:
                dm5.s(s7c0Var, "LibraryResult must not be null");
                final em61 em61Var = new em61();
                if (s7c0Var.a != 0 || (obj2 = s7c0Var.c) == null) {
                    em61Var.u((Object) null);
                } else {
                    yoh0 yoh0Var = (yoh0) obj2;
                    byte[] bArr = yoh0Var.d.k;
                    if (bArr == null) {
                        em61Var.u(yzb0.a(yoh0Var, null));
                    } else {
                        final n8d0 n8d0VarQ = this.b.d.m.q(bArr);
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        em61Var.b(new Runnable() { // from class: p.oph0
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = objArr2;
                                n8d0 n8d0Var = n8d0VarQ;
                                em61 em61Var2 = em61Var;
                                switch (b2) {
                                    case 0:
                                        if (em61Var2.isCancelled()) {
                                            n8d0Var.cancel(false);
                                        }
                                        break;
                                    default:
                                        if (em61Var2.isCancelled()) {
                                            n8d0Var.cancel(false);
                                        }
                                        break;
                                }
                            }
                        }, l5uVar);
                        n8d0VarQ.b(new c45((Object) n8d0VarQ, (Object) em61Var, (Object) yoh0Var, (byte) 26), l5uVar);
                    }
                }
                return em61Var;
            default:
                dm5.s(s7c0Var, "LibraryResult must not be null");
                em61 em61Var2 = new em61();
                if (s7c0Var.a != 0 || (obj3 = s7c0Var.c) == null) {
                    em61Var2.u((Object) null);
                } else {
                    b380 b380Var = (b380) obj3;
                    if (b380Var.isEmpty()) {
                        em61Var2.u(new ArrayList());
                    } else {
                        ArrayList arrayList = new ArrayList();
                        em61Var2.b(new ag20(em61Var2, arrayList, (byte) 19), l5uVar);
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        tph0 tph0Var = this.b;
                        m2d m2dVar = new m2d((byte) 9, atomicInteger, tph0Var, b380Var, arrayList, em61Var2);
                        for (int i = 0; i < b380Var.size(); i++) {
                            byte[] bArr2 = ((yoh0) b380Var.get(i)).d.k;
                            if (bArr2 == null) {
                                arrayList.add(null);
                                m2dVar.run();
                            } else {
                                n8d0 n8d0VarQ2 = tph0Var.d.m.q(bArr2);
                                arrayList.add(n8d0VarQ2);
                                n8d0VarQ2.b(m2dVar, l5uVar);
                            }
                        }
                    }
                }
                return em61Var2;
        }
    }
}
