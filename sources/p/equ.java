package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class equ implements wyo0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public equ(b0a0 b0a0Var, caq caqVar, caq caqVar2, thq thqVar, thq thqVar2) {
        this.a = (byte) 1;
        this.b = new idd1(new vt1(b0a0Var, caqVar, this, caqVar2, thqVar, thqVar2));
    }

    @Override // p.wyo0
    public final mr20 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (huz) obj;
            default:
                return (mr20) ((idd1) obj).getValue();
        }
    }

    public equ() {
        this.a = (byte) 0;
        this.b = new huz((Object) null, (byte) 10);
    }
}
