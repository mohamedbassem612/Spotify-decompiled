package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fos implements tyq {
    public final /* synthetic */ byte a;
    public final rey0 b;
    public final eih1 c;
    public final psw d;
    public final f4r e;

    public fos(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = k1o1.p();
                this.c = new eih1();
                j2i j2iVar = vnj.a;
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                this.e = i13.y;
                break;
            default:
                this.b = k1o1.p();
                this.c = new eih1();
                j2i j2iVar2 = rii.a;
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                this.e = i13.k;
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }
}
