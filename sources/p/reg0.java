package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class reg0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ofg0 c;
    public final /* synthetic */ o3e0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ reg0(boolean z, ofg0 ofg0Var, o3e0 o3e0Var, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = ofg0Var;
        this.d = o3e0Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.e;
        boolean z = this.b;
        o3e0 o3e0Var = this.d;
        ofg0 ofg0Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(x340Var, 2131958154);
                String strO1 = cwl1.o0(x340Var, 2131958153);
                boolean z2 = !ofg0Var.f;
                x340 x340Var2 = x340Var;
                boolean zI = x340Var2.i(o3e0Var) | x340Var2.h(z) | x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new qeg0(o3e0Var, z, iu30Var, (byte) 0);
                    x340Var2.s0(objT);
                }
                zxo1.a(strO0, strO1, (qim0) null, this.b, z2, (iu30) objT, x340Var2, 0, 4);
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO2 = cwl1.o0(x340Var3, 2131958150);
                String strO3 = cwl1.o0(x340Var3, 2131958149);
                boolean z3 = !ofg0Var.g;
                x340 x340Var4 = x340Var3;
                boolean zI2 = x340Var4.i(o3e0Var) | x340Var4.h(z) | x340Var4.g(iu30Var);
                Object objT2 = x340Var4.T();
                if (zI2 || objT2 == fkj0.X) {
                    objT2 = new qeg0(o3e0Var, z, iu30Var, (byte) 1);
                    x340Var4.s0(objT2);
                }
                zxo1.a(strO2, strO3, (qim0) null, this.b, z3, (iu30) objT2, x340Var4, 0, 4);
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO4 = cwl1.o0(x340Var5, 2131958157);
                String strO5 = cwl1.o0(x340Var5, 2131958156);
                boolean z4 = !ofg0Var.h;
                x340 x340Var6 = x340Var5;
                boolean zI3 = x340Var6.i(o3e0Var) | x340Var6.h(z) | x340Var6.g(iu30Var);
                Object objT3 = x340Var6.T();
                if (zI3 || objT3 == fkj0.X) {
                    objT3 = new qeg0(o3e0Var, z, iu30Var, (byte) 2);
                    x340Var6.s0(objT3);
                }
                zxo1.a(strO4, strO5, (qim0) null, this.b, z4, (iu30) objT3, x340Var6, 0, 4);
                break;
        }
        return rih1Var;
    }
}
