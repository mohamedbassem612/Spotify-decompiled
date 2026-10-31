package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ooo1 extends a8d1 implements vu30 {
    public vgn0 a;
    public xoo1 b;
    public vi01 c;
    public char d;
    public byte e;
    public final /* synthetic */ xoo1 f;
    public final /* synthetic */ char g;
    public final /* synthetic */ vi01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [char, int] */
    public ooo1(xoo1 xoo1Var, long j, vi01 vi01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = xoo1Var;
        this.g = (int) j;
        this.h = vi01Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ooo1(this.f, this.g, this.h, lnmVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [char, int] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        xoo1 xoo1Var;
        long j;
        vi01 vi01Var;
        vgn0 vgn0Var;
        Throwable th;
        vgn0 vgn0Var2;
        byte b = this.e;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                long j2 = this.g;
                xoo1 xoo1Var2 = this.f;
                vgn0 vgn0Var3 = xoo1Var2.d;
                this.a = vgn0Var3;
                this.b = xoo1Var2;
                vi01 vi01Var2 = this.h;
                this.c = vi01Var2;
                this.d = (int) j2;
                this.e = (byte) 1;
                if (vgn0Var3.a(this) != d9nVar) {
                    xoo1Var = xoo1Var2;
                    j = j2;
                    vi01Var = vi01Var2;
                    vgn0Var = vgn0Var3;
                }
                return d9nVar;
            }
            if (b != 1) {
                vgn0Var2 = this.a;
                try {
                    hm5.M(obj);
                    e331 e331Var = (e331) obj;
                    Object obj2 = e331Var.a;
                    vgn0Var2.c((Object) null);
                    return e331Var;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            long j3 = this.d;
            vi01 vi01Var3 = this.c;
            xoo1 xoo1Var3 = this.b;
            vgn0Var = this.a;
            hm5.M(obj);
            j = j3;
            vi01Var = vi01Var3;
            xoo1Var = xoo1Var3;
            swo1 swo1Var = xoo1Var.c;
            xn2 xn2Var = new xn2(j, (Object) xoo1Var, (Object) vi01Var, (lnm) null, (byte) 17);
            this.a = vgn0Var;
            this.b = null;
            this.c = null;
            this.e = (byte) 2;
            obj = xn2Var.invoke(swo1Var, this);
            if (obj != d9nVar) {
                vgn0Var2 = vgn0Var;
                e331 e331Var2 = (e331) obj;
                Object obj3 = e331Var2.a;
                vgn0Var2.c((Object) null);
                return e331Var2;
            }
            return d9nVar;
        } catch (Throwable th3) {
            th = th3;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
