package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e7m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7m1(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                af afVar = (af) obj;
                if (afVar.compareTo(af.d) > 0 || afVar.compareTo(af.a) < 0) {
                    ven0Var.setValue(Boolean.TRUE);
                    i = 3;
                } else {
                    ven0Var.setValue(Boolean.FALSE);
                    i = 4;
                }
                return Integer.valueOf(i);
            case 1:
                ven0Var.setValue(Integer.valueOf(jch0.U(Float.intBitsToFloat((int) (((elb0) obj).O(0L) & 4294967295L)))));
                return rih1Var;
            case 2:
                yr80 yr80Var = (yr80) obj;
                long j = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 4:
                ((iu30) ven0Var.getValue()).invoke((sjz) obj);
                return rih1Var;
            case 5:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new pad1(ven0Var, (lnm) null, (byte) 6);
                abc0Var.a = new pad1(ven0Var, (lnm) null, (byte) 7);
                abc0Var.d = new mek1(ven0Var, (byte) 9);
                return rih1Var;
            case 6:
                abc0 abc0Var2 = (abc0) obj;
                abc0Var2.c = new pad1(ven0Var, (lnm) null, (byte) 8);
                abc0Var2.a = new pad1(ven0Var, (lnm) null, (byte) 9);
                abc0Var2.d = new mek1(ven0Var, (byte) 12);
                return rih1Var;
            case 7:
                abc0 abc0Var3 = (abc0) obj;
                abc0Var3.c = new pad1(ven0Var, (lnm) null, (byte) 10);
                abc0Var3.d = new mek1(ven0Var, (byte) 13);
                return rih1Var;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                bpb1 bpb1Var = cem1.i;
                ven0Var.setValue(bool2);
                return rih1Var;
            case 9:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                bpb1 bpb1Var2 = cem1.i;
                ven0Var.setValue(bool3);
                return rih1Var;
            case 10:
                p3v p3vVar = (p3v) obj;
                float f = p3vVar.a;
                ven0Var.setValue(p3vVar);
                return rih1Var;
            case 11:
                p3v p3vVar2 = (p3v) obj;
                float f2 = p3vVar2.a;
                ven0Var.setValue(p3vVar2);
                return rih1Var;
            case 12:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 13:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }
}
