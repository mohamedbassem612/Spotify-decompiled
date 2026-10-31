package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jcd0 implements oh81 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final Object c;
    public final Object d;

    public jcd0(haa0 haa0Var, thq thqVar) {
        this.a = (byte) 0;
        this.c = haa0Var;
        this.b = thqVar;
        this.d = new idd1(new nzb0(this, (byte) 26));
    }

    public final mr20 a() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (mr20) ((idd1) obj).getValue();
            default:
                return rqt0.u(new vlj1(((ov20) obj).a("restrict-showing-your-updates", false), this, (byte) 22));
        }
    }

    public jcd0(thq thqVar, thq thqVar2, ov20 ov20Var) {
        this.a = (byte) 1;
        this.b = thqVar;
        this.c = thqVar2;
        this.d = ov20Var;
    }
}
