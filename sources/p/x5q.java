package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5q implements wbr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5q(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final zbr0 a(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                s7q s7qVar = (s7q) ((r7q) obj).d;
                return new zbr0((c690) s7qVar.Ki.get(), (n431) s7qVar.Li.get(), (s331) s7qVar.E1.get(), str);
            case 1:
                teq teqVar = ((r7q) obj).d;
                return new zbr0((c690) teqVar.eg.get(), (n431) teqVar.fg.get(), (s331) teqVar.X0.get(), str);
            case 2:
                return new zbr0((x5r0) obj, new n431(), t5r0.c, "");
            default:
                return (zbr0) obj;
        }
    }
}
