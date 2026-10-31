package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pse implements sbr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pse(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final tbr0 a(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (tbr0) obj;
            case 1:
                s7q s7qVar = ((r7q) obj).d;
                return new tbr0((c690) s7qVar.Ki.get(), (n431) s7qVar.Li.get(), str);
            default:
                teq teqVar = ((r7q) obj).d;
                return new tbr0((c690) teqVar.eg.get(), (n431) teqVar.fg.get(), str);
        }
    }
}
