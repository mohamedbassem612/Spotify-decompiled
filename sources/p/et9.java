package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class et9 implements h0r0 {
    public final /* synthetic */ byte a;
    public final cbr0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public et9(qyj qyjVar, rm9 rm9Var, ot9 ot9Var, a1r0 a1r0Var, yu3 yu3Var, cp31 cp31Var, ufc ufcVar, los losVar) {
        this.a = (byte) 0;
        this.c = qyjVar;
        this.d = rm9Var;
        this.e = ot9Var;
        this.f = a1r0Var;
        this.g = yu3Var;
        this.h = cp31Var;
        this.i = ufcVar;
        this.j = new bqk0((byte) 12);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{new bn70(yon1.G1("BYOM_VOLUME_CONTROLS", "byom/volume-controls", 264, "byom"), new lik1("spotify:internal:byom-volume-control"), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        byte b = this.a;
        return this.b;
    }

    public final p2r0 b() {
        switch (this.a) {
            case 0:
                return ((qyj) this.c).a(new j2i(1482814601, new mu6(this, (byte) 25), true));
            default:
                return hvj.b((hvj) this.d, f4p1.g((oie0) this.e), new j2i(198333481, new k2d0(this, (byte) 14), true));
        }
    }

    public et9(wne0 wne0Var, hvj hvjVar, oie0 oie0Var, j2e0 j2e0Var, tso tsoVar, boe0 boe0Var, ng20 ng20Var) {
        this.a = (byte) 1;
        this.c = wne0Var;
        this.d = hvjVar;
        this.e = oie0Var;
        this.f = j2e0Var;
        this.g = tsoVar;
        this.h = boe0Var;
        this.i = ng20Var;
        this.j = new h3h1(new pie0(this, (byte) 2));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{new bn70(yon1.G1("BLUEJAY_LOCATION_PICKER", "bluejay/location-picker", 232, "bluejay"), nik1.q6, (nar0) null)}, false);
    }
}
