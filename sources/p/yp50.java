package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yp50 implements xpw {
    public final /* synthetic */ byte a;
    public final ynb0 b;
    public final rey0 c;
    public final eih1 d;
    public final psw e;

    public yp50(ynb0 ynb0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = ynb0Var;
                this.c = k1o1.p();
                this.d = new eih1();
                j2i j2iVar = new j2i(969450301, new qcd0(this, (byte) 11), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = ynb0Var;
                this.c = k1o1.p();
                this.d = new eih1();
                j2i j2iVar2 = new j2i(478505279, new zq30(this, (byte) 18), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }
}
