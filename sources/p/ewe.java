package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ewe implements h0r0 {
    public final /* synthetic */ byte a;
    public final cbr0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ewe(gj5 gj5Var, gwe gweVar, qyj qyjVar, ynb0 ynb0Var, cwe cweVar, los losVar, q8n q8nVar) {
        this.a = (byte) 0;
        this.c = gj5Var;
        this.d = qyjVar;
        this.e = ynb0Var;
        this.f = cweVar;
        this.g = q8nVar;
        this.h = new dsk0((byte) 3);
        this.b = new cbr0(new dbr0[]{new j0c0(mno1.e), new bn70(new awz0("chat_disclaimer"), new lik1(gweVar.a), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, true, (nsm0) null, 3797)}, false);
    }

    public final cbr0 a() {
        byte b = this.a;
        return this.b;
    }

    public final p2r0 b() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((qyj) obj).a(new j2i(880783578, new cka(this, (byte) 28), true));
            default:
                return hvj.b((hvj) this.c, f4p1.g((i4z0) obj), new j2i(-870210013, new f2z0(this, (byte) 3), true));
        }
    }

    public ewe(hvj hvjVar, i4z0 i4z0Var, p40 p40Var, hyy0 hyy0Var, tso tsoVar) {
        this.a = (byte) 1;
        this.c = hvjVar;
        this.d = i4z0Var;
        this.e = p40Var;
        this.f = hyy0Var;
        this.g = tsoVar;
        this.h = new h3h1(new j4z0(this, (byte) 1));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{new bn70(yon1.G1("BLUEJAY_QUESTION_PICKER", "bluejay/question-picker", 234, "bluejay"), nik1.q6, (nar0) null)}, false);
    }
}
