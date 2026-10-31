package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.CapabilityRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uw5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw5(w9f0 w9f0Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = w9f0Var;
        this.c = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                uw5 uw5Var = new uw5(obj2, lnmVar, (byte) 0);
                uw5Var.c = ((Boolean) obj).booleanValue();
                return uw5Var;
            case 1:
                return new uw5(this.c, (hld) obj2, lnmVar, (byte) 1);
            case 2:
                return new uw5(obj2, lnmVar, (byte) 2);
            case 3:
                return new uw5(this.c, (ven0) obj2, lnmVar, (byte) 3);
            default:
                return new uw5((w9f0) obj2, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((uw5) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((uw5) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((uw5) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((uw5) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((uw5) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objB;
        Object objA;
        Object objI;
        boolean zBooleanValue;
        Object objI2;
        Object objA2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                vw5 vw5Var = (vw5) obj2;
                boolean z = this.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (!z) {
                        vw5Var.Y.l((Object) null);
                        return rih1Var;
                    }
                    this.c = z;
                    this.b = (byte) 1;
                    Object objJ = b5p1.j(h5p1.t(ezn1.o(vw5Var.e.a).a(), vw5Var.f.b, new ew0(vw5Var, (lnm) null, (byte) 3)), new nw5(2, (lnm) null, (byte) 0), this);
                    if (objJ != d9nVar) {
                        objJ = rih1Var;
                    }
                    if (objJ != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 == 1) {
                    hm5.M(obj);
                } else {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = obj;
                }
                if (((Boolean) objD).booleanValue()) {
                    return rih1Var;
                }
                this.c = z;
                this.b = (byte) 3;
                if (vw5Var.c(this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
                this.c = z;
                this.b = (byte) 2;
                objD = vw5Var.d(this);
                if (objD != d9nVar) {
                    if (((Boolean) objD).booleanValue()) {
                        return rih1Var;
                    }
                    this.c = z;
                    this.b = (byte) 3;
                    if (vw5Var.c(this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 1:
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                        objA = obj;
                        return (Empty) objA;
                    }
                    if (b3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                    return (Empty) objB;
                }
                hm5.M(obj);
                cmd cmdVarN = CapabilityRequest.n();
                cmdVarN.n(xld.c);
                CapabilityRequest capabilityRequestBuild = cmdVarN.build();
                hld hldVar = (hld) obj2;
                if (this.c) {
                    fld fldVar = hldVar.a;
                    capabilityRequestBuild.getClass();
                    this.b = (byte) 1;
                    objA = fldVar.a(capabilityRequestBuild, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    return (Empty) objA;
                }
                fld fldVar2 = hldVar.a;
                capabilityRequestBuild.getClass();
                this.b = (byte) 2;
                objB = fldVar2.b(capabilityRequestBuild, this);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                return (Empty) objB;
            case 2:
                ur00 ur00Var = ((w8n) obj2).d;
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1) {
                        hm5.M(obj);
                        objI = obj;
                    } else {
                        if (b4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = this.c;
                        hm5.M(obj);
                        zBooleanValue = z2;
                        objI2 = obj;
                    }
                    if (((Boolean) objI2).booleanValue()) {
                        return nre0.b;
                    }
                    return zBooleanValue ? nre0.a : nre0.c;
                }
                hm5.M(obj);
                mr20 mr20Var = (mr20) ur00Var.e;
                this.b = (byte) 1;
                objI = b5p1.i(mr20Var, this);
                if (objI == d9nVar) {
                    return d9nVar;
                }
                zBooleanValue = ((Boolean) objI).booleanValue();
                mr20 mr20Var2 = (mr20) ur00Var.f;
                this.c = zBooleanValue;
                this.b = (byte) 2;
                objI2 = b5p1.i(mr20Var2, this);
                if (objI2 == d9nVar) {
                    return d9nVar;
                }
                if (((Boolean) objI2).booleanValue()) {
                    return nre0.b;
                }
                if (zBooleanValue) {
                }
            case 3:
                ven0 ven0Var = (ven0) obj2;
                boolean z3 = this.c;
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    if (!z3) {
                        this.b = (byte) 1;
                        if (hap1.i(2000L, this) != d9nVar) {
                        }
                    }
                    return d9nVar;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                float fFloatValue = ((Number) ven0Var.getValue()).floatValue();
                float f = z3 ? 1.0f : 0.0f;
                pxg1 pxg1VarO0 = irn1.o0(0, 0, (dlv) null, 7);
                fc3 fc3Var = new fc3(ven0Var, (byte) 21);
                this.b = (byte) 2;
                if (wwo1.t(fFloatValue, f, pxg1VarO0, fc3Var, this, 4) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                w9f0 w9f0Var = (w9f0) obj2;
                cs2 cs2Var = (cs2) w9f0Var.c;
                byte b6 = this.b;
                if (b6 == 0) {
                    hm5.M(obj);
                    this.b = (byte) 1;
                    objA2 = cs2Var.a.a(this);
                    if (objA2 != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b6 != 1) {
                    if (b6 == 2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objA2 = obj;
                ot2 ot2Var = (ot2) objA2;
                wr2 wr2Var = (jr2) w9f0Var.b;
                zq00 zq00Var = (zq00) w9f0Var.d;
                String str = zq00Var.b;
                if (str == null) {
                    str = zq00Var.a;
                }
                boolean z4 = this.c;
                String str2 = str;
                dt2 dt2Var = new dt2(cs2Var.b.b, (String) null, (String) null);
                this.b = (byte) 2;
                Object objH = wr2Var.h(ot2Var, str2, (String) null, z4, dt2Var, this);
                if (objH != d9nVar) {
                    return objH;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw5(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw5(boolean z, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
    }
}
