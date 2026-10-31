package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class egf extends hab0 implements xu30 {
    public final /* synthetic */ zlp0 N0;
    public final /* synthetic */ ynb0 O0;
    public final /* synthetic */ boolean P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ boolean R0;
    public final /* synthetic */ boolean S0;
    public final /* synthetic */ ven0 T0;
    public final /* synthetic */ njf X;
    public final /* synthetic */ hn50 Y;
    public final /* synthetic */ xif Z;
    public final /* synthetic */ uef a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ymq0 f;
    public final /* synthetic */ ahs0 g;
    public final /* synthetic */ u7i1 h;
    public final /* synthetic */ j780 i;
    public final /* synthetic */ h7f t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egf(uef uefVar, String str, boolean z, boolean z2, iu30 iu30Var, ymq0 ymq0Var, ahs0 ahs0Var, u7i1 u7i1Var, j780 j780Var, h7f h7fVar, njf njfVar, hn50 hn50Var, xif xifVar, zlp0 zlp0Var, ynb0 ynb0Var, boolean z3, boolean z4, boolean z5, boolean z6, ven0 ven0Var) {
        super(3);
        this.a = uefVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = iu30Var;
        this.f = ymq0Var;
        this.g = ahs0Var;
        this.h = u7i1Var;
        this.i = j780Var;
        this.t = h7fVar;
        this.X = njfVar;
        this.Y = hn50Var;
        this.Z = xifVar;
        this.N0 = zlp0Var;
        this.O0 = ynb0Var;
        this.P0 = z3;
        this.Q0 = z4;
        this.R0 = z5;
        this.S0 = z6;
        this.T0 = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0182  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qub qubVar;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        uef uefVar = this.a;
        hef hefVar = uefVar.a;
        String str = uefVar.b;
        ctf ctfVar = uefVar.c;
        t7q0 t7q0Var = uefVar.i;
        boolean zBooleanValue = ((Boolean) this.T0.getValue()).booleanValue();
        int i = 1;
        boolean z = uefVar.l && this.c;
        if (hefVar instanceof hef) {
            qubVar = hefVar.b ? new qub(str, false, t7q0Var, zBooleanValue, false) : new rub(str, false, t7q0Var, zBooleanValue, false);
        } else if (hefVar instanceof gef) {
            qubVar = new qub(str, false, t7q0Var, zBooleanValue, false);
        } else if (hefVar.equals(ief.b) || hefVar.equals(tef.b)) {
            qubVar = oub.d;
        } else {
            if (!(hefVar instanceof sef)) {
                eg.o();
                return null;
            }
            oef oefVar = ((sef) hefVar).b;
            boolean zEquals = oefVar.equals(nef.b);
            atf atfVar = atf.a;
            if (zEquals) {
                if (ctfVar.equals(atfVar)) {
                    qubVar = vub.d;
                } else {
                    if (!(ctfVar instanceof btf)) {
                        eg.o();
                        return null;
                    }
                    qubVar = uub.d;
                }
            } else if (oefVar.equals(lef.b)) {
                qubVar = wub.d;
            } else {
                boolean zEquals2 = oefVar.equals(mef.b);
                String str2 = this.b;
                if (zEquals2) {
                    qubVar = new xub(str, str2);
                } else if (oefVar instanceof ref) {
                    ref refVar = (ref) oefVar;
                    ctf ctfVar2 = refVar.b;
                    if (refVar.c) {
                        if (u890.j(ctfVar2, atfVar)) {
                            qubVar = new cvb(str2);
                        } else {
                            if (!(ctfVar2 instanceof btf)) {
                                eg.o();
                                return null;
                            }
                            qubVar = zub.d;
                        }
                    } else if (refVar.d) {
                        if (u890.j(ctfVar2, atfVar)) {
                            qubVar = new dvb(str2, t7q0Var, zBooleanValue);
                        } else {
                            if (!(ctfVar2 instanceof btf)) {
                                eg.o();
                                return null;
                            }
                            qubVar = new avb(t7q0Var, zBooleanValue);
                        }
                    } else if (u890.j(ctfVar2, atfVar)) {
                        qubVar = new evb(str2, t7q0Var, zBooleanValue);
                    } else {
                        if (!(ctfVar2 instanceof btf)) {
                            eg.o();
                            return null;
                        }
                        qubVar = new bvb(t7q0Var, zBooleanValue);
                    }
                } else if (oefVar instanceof oef) {
                    qubVar = oefVar.b ? new qub(str, true, t7q0Var, zBooleanValue, z) : new rub(str, true, t7q0Var, zBooleanValue, z);
                } else if (oefVar.equals(jef.b)) {
                    qubVar = pub.d;
                } else if (oefVar.equals(kef.b)) {
                    qubVar = tub.d;
                } else if (oefVar.equals(pef.b)) {
                    qubVar = yub.d;
                } else {
                    if (!(oefVar instanceof qef)) {
                        eg.o();
                        return null;
                    }
                    qubVar = sub.d;
                }
            }
        }
        boolean z2 = uefVar.j != null;
        if (this.d) {
            if (hefVar instanceof sef) {
                oef oefVar2 = ((sef) hefVar).b;
                if ((oefVar2 instanceof oef) && oefVar2.b) {
                    i = 2;
                } else {
                    i = 3;
                }
            } else {
                i = 3;
            }
        }
        eso1.c(qubVar, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, i, this.P0, (qim0) null, z2, this.Q0, this.R0, this.S0, b0kVar, 0);
        return rih1.a;
    }
}
