package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bck extends hab0 implements zu30 {
    public final /* synthetic */ tob1 N0;
    public final /* synthetic */ tob1 O0;
    public final /* synthetic */ tob1 P0;
    public final /* synthetic */ hdn0 Q0;
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hdk b;
    public final /* synthetic */ hdk c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ fb5 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(boolean z, hdk hdkVar, hdk hdkVar2, iu30 iu30Var, boolean z2, Function0 function0, boolean z3, boolean z4, fb5 fb5Var, boolean z5, iu30 iu30Var2, boolean z6, tob1 tob1Var, tob1 tob1Var2, tob1 tob1Var3, tob1 tob1Var4, hdn0 hdn0Var) {
        super(4);
        this.a = z;
        this.b = hdkVar;
        this.c = hdkVar2;
        this.d = iu30Var;
        this.e = z2;
        this.f = function0;
        this.g = z3;
        this.h = z4;
        this.i = fb5Var;
        this.t = z5;
        this.X = iu30Var2;
        this.Y = z6;
        this.Z = tob1Var;
        this.N0 = tob1Var2;
        this.O0 = tob1Var3;
        this.P0 = tob1Var4;
        this.Q0 = hdn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0157  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        float f2;
        float f3;
        int iS;
        iu30 iu30Var;
        Object objT;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        hdk hdkVar = this.c;
        tob1 tob1Var = this.Z;
        hdk hdkVar2 = this.b;
        if (zBooleanValue) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1659265873);
            rck.e(this.a ? hdkVar2 : hdkVar, this.d, this.e, ((Number) tob1Var.getValue()).floatValue(), this.f, null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1658885627);
            if (this.g) {
                x340Var3.i0(-1658910272);
                vyo1.q(hdkVar2, this.d, this.e, ((Number) tob1Var.getValue()).floatValue(), this.f, (qim0) null, x340Var3, 0);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-1658557275);
                boolean z = this.h;
                hdk hdkVar3 = z ? hdkVar2 : hdkVar;
                float fFloatValue = 0.0f;
                if (z) {
                    x340Var3.i0(-1658449364);
                    if (hdkVar2.C != 0) {
                        x340Var3.i0(639240314);
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var3).g;
                        x340Var3.r(false);
                        f = 16.0f;
                    } else {
                        x340Var3.i0(639240727);
                        x340Var3.r(false);
                        f = 0.0f;
                    }
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1658348583);
                    x340Var3.r(false);
                    f = ((p3v) this.N0.getValue()).a;
                }
                float f4 = f;
                float fFloatValue2 = z ? 1.0f : ((Number) this.O0.getValue()).floatValue();
                fb5 fb5Var = z ? null : this.i;
                if (z) {
                    if (this.t) {
                        f2 = 1.0f;
                    }
                    if (z) {
                        f3 = rck.c;
                    } else {
                        float f5 = rck.b;
                        f3 = 72.0f;
                    }
                    float f6 = f3;
                    p3v p3vVar = z ? new p3v(rck.d) : null;
                    float fFloatValue3 = ((Number) tob1Var.getValue()).floatValue();
                    if (z) {
                        iS = 0;
                    } else {
                        iS = this.Q0.s();
                    }
                    if (z) {
                        x340Var3.i0(-1656907393);
                        objT = x340Var3.T();
                        if (objT == fkj0.X) {
                            objT = c6k.t;
                            x340Var3.s0(objT);
                        }
                        iu30Var = (iu30) objT;
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(-1656855220);
                        x340Var3.r(false);
                        iu30Var = this.X;
                    }
                    rck.h(hdkVar3, this.d, this.e, fFloatValue3, this.f, f4, fFloatValue2, fb5Var, f2, iS, null, f6, p3vVar, this.h, this.Y, iu30Var, x340Var3, 0);
                    x340Var3.r(false);
                } else {
                    fFloatValue = ((Number) this.P0.getValue()).floatValue();
                }
                f2 = fFloatValue;
                if (z) {
                    f3 = rck.c;
                } else {
                    float f7 = rck.b;
                    f3 = 72.0f;
                }
                float f8 = f3;
                p3v p3vVar2 = z ? new p3v(rck.d) : null;
                float fFloatValue4 = ((Number) tob1Var.getValue()).floatValue();
                if (z) {
                    iS = 0;
                } else {
                    iS = this.Q0.s();
                }
                if (z) {
                    x340Var3.i0(-1656907393);
                    objT = x340Var3.T();
                    if (objT == fkj0.X) {
                        objT = c6k.t;
                        x340Var3.s0(objT);
                    }
                    iu30Var = (iu30) objT;
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1656855220);
                    x340Var3.r(false);
                    iu30Var = this.X;
                }
                rck.h(hdkVar3, this.d, this.e, fFloatValue4, this.f, f4, fFloatValue2, fb5Var, f2, iS, null, f8, p3vVar2, this.h, this.Y, iu30Var, x340Var3, 0);
                x340Var3.r(false);
            }
            x340Var3.r(false);
        }
        return rih1.a;
    }
}
