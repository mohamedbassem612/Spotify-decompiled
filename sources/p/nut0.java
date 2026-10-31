package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nut0 implements shh0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ nut0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean a(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                upp0 upp0Var = (upp0) ((ynb0) obj).get();
                String str = r9cVar.b;
                upp0Var.getClass();
                return upp0.b(str);
            default:
                return r9cVar.b.startsWith("spotify:space_item:") && !((t7c) obj).a(r9cVar);
        }
    }

    public final rhh0 b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (rhh0) ((ynb0) obj).get();
            default:
                return (rhh0) ((kly0) obj).get();
        }
    }
}
