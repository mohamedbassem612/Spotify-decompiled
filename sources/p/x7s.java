package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class x7s implements v0d1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7s(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (o2i0) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    bhn0.p(e);
                    return null;
                }
            case 1:
                return (o2i0) obj;
            case 2:
                return (h6s) obj;
            case 3:
                return (ajr) obj;
            case 4:
                return (exs) obj;
            case 5:
                return (rd21) obj;
            default:
                uv81 uv81Var = (uv81) obj;
                tv81 tv81VarA = uv81Var.a();
                tv81VarA.e = null;
                tv81VarA.d = uv81Var.v.p() ? 4 : 2;
                return new uv81(tv81VarA);
        }
    }
}
