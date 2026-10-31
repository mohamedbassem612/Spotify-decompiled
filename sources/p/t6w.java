package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t6w {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m980 b;
    public final /* synthetic */ xrc0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t6w(Object obj, m980 m980Var, xrc0 xrc0Var, byte b) {
        this.a = b;
        this.d = obj;
        this.b = m980Var;
        this.c = xrc0Var;
    }

    public final j6w a(d0r d0rVar, u9c0 u9c0Var) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                thq thqVar = ((ygq) obj).a;
                teq teqVar = thqVar.c;
                return new j6w(p6w.a, this.b, this.c, u9c0Var, new uls(new yzu((jhq) teqVar.a.Z0.get(), (lzn0) teqVar.i.get(), (q8n) thqVar.b.V2.get(), d0rVar), false, (lnm) null, (byte) 8));
            case 1:
                thq thqVar2 = ((shq) obj).a;
                teq teqVar2 = thqVar2.c;
                return new j6w(q6w.a, this.b, this.c, u9c0Var, new uls(new yzu((zeq) teqVar2.a.c1.get(), (lzn0) teqVar2.i.get(), (q8n) thqVar2.b.V2.get(), d0rVar), false, (lnm) null, (byte) 9));
            default:
                return new j6w(r6w.a, this.b, this.c, u9c0Var, new uls(new jut(((afq) obj).a.c.a.f1.get(), (Object) d0rVar, (byte) 17), false, (lnm) null, (byte) 10));
        }
    }
}
