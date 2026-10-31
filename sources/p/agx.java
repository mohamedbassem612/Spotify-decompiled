package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class agx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ agx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                return new odr(((ufx) obj5).a, (String) obj4, (r6h1) obj3, (acq) obj2, (mf4) obj);
            case 1:
                return new fcs(new toj0(((wfx) obj5).b, (agx) obj4, (iac0) obj3, (gik1) obj2, (lh2) obj), (byte) 11);
            default:
                if (l0iVar == null) {
                    return new h98(((wfx) obj5).b, (egx) obj4, (y9p) obj3, (kly0) obj2, (i3b) obj);
                }
                bhn0.d();
                return null;
        }
    }
}
