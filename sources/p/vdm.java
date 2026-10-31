package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdm extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdm(String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return new vdm(str, lnmVar, (byte) 0);
            case 1:
                return new vdm(str, lnmVar, (byte) 1);
            case 2:
                return new vdm(str, lnmVar, (byte) 2);
            case 3:
                return new vdm(str, lnmVar, (byte) 3);
            default:
                return new vdm(str, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                vdm vdmVarCreate = create(lnmVar);
                hm5.M(rih1Var);
                return vdmVarCreate.b;
            case 1:
                vdm vdmVarCreate2 = create(lnmVar);
                hm5.M(rih1Var);
                return vdmVarCreate2.b;
            case 2:
                vdm vdmVarCreate3 = create(lnmVar);
                hm5.M(rih1Var);
                return vdmVarCreate3.b;
            case 3:
                vdm vdmVarCreate4 = create(lnmVar);
                hm5.M(rih1Var);
                return vdmVarCreate4.b;
            default:
                vdm vdmVarCreate5 = create(lnmVar);
                hm5.M(rih1Var);
                return vdmVarCreate5.b;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                break;
            case 1:
                hm5.M(obj);
                break;
            case 2:
                hm5.M(obj);
                break;
            case 3:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return str;
    }
}
