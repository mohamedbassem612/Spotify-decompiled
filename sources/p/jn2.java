package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jn2 implements xpw {
    public final /* synthetic */ byte a;
    public final Function0 b;
    public final rey0 c;
    public final eih1 d;
    public final psw e;

    public jn2(Function0 function0, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = function0;
                this.c = new rey0(new o2(this, (byte) 24));
                this.d = new eih1();
                j2i j2iVar = n5i.b;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = function0;
                this.c = new rey0(new o2(this, (byte) 23));
                this.d = new eih1();
                j2i j2iVar2 = m5i.b;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        byte b = this.a;
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
        byte b = this.a;
        return this.c;
    }
}
