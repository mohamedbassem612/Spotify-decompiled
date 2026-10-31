package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mhn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ mhn(ohn ohnVar, long j, String str, byte b) {
        this.a = b;
        this.b = ohnVar;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ohn ohnVar = this.b;
                ((djn) ohnVar.p.c).a(new mhn(ohnVar, this.c, this.d, (byte) 1));
                break;
            default:
                jhn jhnVar = this.b.h;
                cjn cjnVar = jhnVar.n;
                if (cjnVar == null || !cjnVar.e.get()) {
                    ((n420) jhnVar.i.b).h(this.c, this.d);
                }
                break;
        }
    }
}
