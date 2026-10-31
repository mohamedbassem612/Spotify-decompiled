package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ke90 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ke90(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.i0v0
    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (rq21) ((tw20) obj3).j((sq21) obj, (jq21) obj2);
            case 1:
                return (rq21) ((mna0) obj3).a((sq21) obj, (jq21) obj2);
            case 2:
                return (kk90) ((m6k0) obj3).b((qop) obj, (gl90) obj2);
            default:
                return (zqw) ((hq81) obj3).a((qop) obj, (fl90) obj2);
        }
    }

    @Override // p.i0v0
    public final String b() {
        switch (this.a) {
            case 0:
                return "invite";
            case 1:
                return "local files";
            case 2:
                return "mixing";
            default:
                return "standard";
        }
    }
}
