package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w6f extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ q8n h;
    public final /* synthetic */ q8n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, q8n q8nVar, q8n q8nVar2) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = q8nVar;
        this.i = q8nVar2;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = new u6f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (byte) 1);
        casVar.d = new v6f(this.h, (byte) 0);
        casVar.e = new v6f(this.i, (byte) 1);
        return rih1.a;
    }
}
