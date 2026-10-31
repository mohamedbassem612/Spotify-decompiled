package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iw60 {
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final ser a;
    public final vu60 b;
    public final z1s c;
    public final vun d;
    public final av60 e;
    public final llm f;

    static {
        ytw0 ytw0Var = jfv.b;
        g = fdg1.k0(500, ngv.MILLISECONDS);
    }

    public iw60(ser serVar, vu60 vu60Var, z1s z1sVar, vun vunVar, av60 av60Var, q8n q8nVar) {
        this.a = serVar;
        this.b = vu60Var;
        this.c = z1sVar;
        this.d = vunVar;
        this.e = av60Var;
        this.f = l1d.x(q8nVar);
    }

    public final void a(String str, ov60 ov60Var) {
        if (ov60Var instanceof nv60) {
            c921.y(this.f, (o8n) null, 0, new f530(this, ov60Var, str, (lnm) null, (byte) 19), 3);
        } else if (ov60Var.equals(mv60.a)) {
            b(str, ov60Var);
        } else {
            eg.o();
        }
    }

    public final void b(String str, ov60 ov60Var) {
        int i;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        if (l0o1.i(this.d, yon1.k2())) {
            String str2 = nik1.w5.a;
            if (ov60Var instanceof nv60) {
                i = 1;
            } else {
                if (!ov60Var.equals(mv60.a)) {
                    eg.o();
                    return;
                }
                i = 2;
            }
            this.a.a(str, str2, new nw60(i).a());
        }
    }
}
