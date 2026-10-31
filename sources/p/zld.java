package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zld implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public zld(vr20 vr20Var, String str, int i) {
        this.a = (byte) 0;
        this.b = vr20Var;
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        yld yldVar;
        uld uldVarU;
        m3r0 m3r0Var;
        h4r0 h4r0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        String str = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof yld) {
                    yldVar = (yld) lnmVar;
                    int i2 = yldVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        yldVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        yldVar = new yld(this, lnmVar);
                    }
                } else {
                    yldVar = new yld(this, lnmVar);
                }
                Object obj2 = yldVar.a;
                int i3 = yldVar.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    prl prlVar = ((uv00) obj).a(prl.class, str).b;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        uldVarU = w0o1.u(prlVar != null ? prlVar.a : null);
                    } else if (iC == 1) {
                        uldVarU = w0o1.u(prlVar != null ? prlVar.b : null);
                    } else if (iC == 2) {
                        uldVarU = w0o1.u(prlVar != null ? prlVar.c : null);
                    } else if (iC == 3) {
                        uldVarU = w0o1.u(prlVar != null ? prlVar.d : null);
                    } else {
                        eg.o();
                    }
                    yldVar.b = 1;
                    return vr20Var.emit(uldVarU, yldVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof m3r0) {
                    m3r0Var = (m3r0) lnmVar;
                    int i4 = m3r0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        m3r0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        m3r0Var = new m3r0(this, lnmVar);
                    }
                } else {
                    m3r0Var = new m3r0(this, lnmVar);
                }
                Object obj3 = m3r0Var.a;
                int i5 = m3r0Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    List listW = zl5.w(i, str, (ioj0) obj);
                    m3r0Var.b = 1;
                    return vr20Var.emit(listW, m3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof h4r0) {
                    h4r0Var = (h4r0) lnmVar;
                    int i6 = h4r0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        h4r0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        h4r0Var = new h4r0(this, lnmVar);
                    }
                } else {
                    h4r0Var = new h4r0(this, lnmVar);
                }
                Object obj4 = h4r0Var.a;
                int i7 = h4r0Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    List listK = zl5.K(i, str, (ioj0) obj);
                    h4r0Var.b = 1;
                    return vr20Var.emit(listK, h4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ zld(vr20 vr20Var, zl5 zl5Var, String str, int i, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
        this.d = i;
    }
}
