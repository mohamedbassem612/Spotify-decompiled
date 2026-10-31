package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uak1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ blc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uak1(blc blcVar, byte b) {
        super(1);
        this.a = b;
        this.b = blcVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        blc blcVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return Boolean.valueOf(u890.j(((gmc) ((mmr0) obj).a).a, blcVar.b.getRequestId()));
    }
}
