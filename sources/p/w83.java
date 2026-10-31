package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w83 implements tyq {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ tyq b;
    public final Object c;

    public w83(ujo ujoVar, xe01 xe01Var, yy80 yy80Var) {
        this.b = ujoVar;
        j2i j2iVar = new j2i(8759510, new pj0(xe01Var, yy80Var, ujoVar, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        ujo ujoVar = this.b;
        switch (b) {
            case 0:
                return ((xzq) ujoVar).a();
            default:
                return ujoVar.f;
        }
    }

    public final String b() {
        byte b = this.a;
        ujo ujoVar = this.b;
        switch (b) {
            case 0:
                return ((xzq) ujoVar).a.b();
            default:
                return ujoVar.b();
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                return this.b.a.c();
            default:
                return (psw) this.c;
        }
    }

    public final d0r e() {
        byte b = this.a;
        ujo ujoVar = this.b;
        switch (b) {
            case 0:
                return ((xzq) ujoVar).a.e();
            default:
                return ujoVar.b;
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        ujo ujoVar = this.b;
        switch (b) {
            case 0:
                return ((xzq) ujoVar).getBehavior();
            default:
                return ujoVar.getBehavior();
        }
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (mch) this.c;
            default:
                return this.b.getData();
        }
    }

    public w83(xzq xzqVar, o3r o3rVar) {
        this.b = xzqVar;
        this.c = i6p1.q(xzqVar.getData(), o3rVar);
    }
}
