package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class plc1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ slc1 b;

    public /* synthetic */ plc1(slc1 slc1Var, byte b) {
        this.a = b;
        this.b = slc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        slc1 slc1Var = this.b;
        switch (b) {
            case 0:
                vlc1 vlc1Var = slc1Var.a;
                hmb0 hmb0Var = (hmb0) obj;
                vmb0 vmb0Var = hmb0Var.g1;
                if (vmb0Var == null) {
                    vmb0Var = new vmb0(hmb0Var, vlc1Var);
                    hmb0Var.g1 = vmb0Var;
                }
                slc1Var.b = vmb0Var;
                slc1Var.a().i();
                vmb0 vmb0VarA = slc1Var.a();
                if (vmb0VarA.c != vlc1Var) {
                    vmb0VarA.c = vlc1Var;
                    vmb0VarA.j(false);
                    hmb0.W(vmb0VarA.a, false, 7);
                }
                break;
            case 1:
                slc1Var.a().b = (v3k) obj2;
                break;
            default:
                vmb0 vmb0VarA2 = slc1Var.a();
                ((hmb0) obj).d0(new smb0(vmb0VarA2, (vu30) obj2, vmb0VarA2.P0));
                break;
        }
        return rih1Var;
    }
}
