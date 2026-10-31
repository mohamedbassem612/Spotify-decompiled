package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vw5 implements kwc1 {
    public hp91 N0;
    public final bpb1 O0;
    public final llm X;
    public final bpb1 Y;
    public final bpb1 Z;
    public final ezt a;
    public final agr b;
    public final c9c0 c;
    public final iur d;
    public final m7p0 e;
    public final kyf0 f;
    public final Flowable g;
    public final xc4 h;
    public final fvc1 i;
    public final esa1 t;

    public vw5(ezt eztVar, agr agrVar, c9c0 c9c0Var, iur iurVar, m7p0 m7p0Var, kyf0 kyf0Var, Flowable flowable, xc4 xc4Var, fvc1 fvc1Var, esa1 esa1Var, q8n q8nVar) {
        this.a = eztVar;
        this.b = agrVar;
        this.c = c9c0Var;
        this.d = iurVar;
        this.e = m7p0Var;
        this.f = kyf0Var;
        this.g = flowable;
        this.h = xc4Var;
        this.i = fvc1Var;
        this.t = esa1Var;
        this.X = l1d.x(q8nVar);
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.Y = bpb1VarB;
        this.Z = gio1.b((Object) null);
        this.O0 = bpb1VarB;
    }

    @Override // p.a4l
    public final void a() {
        op71.r(this.X.a);
        this.Y.l((Object) null);
        this.Z.l((Object) null);
        hp91 hp91Var = this.N0;
        if (hp91Var != null) {
            hp91Var.e();
        }
        this.N0 = null;
    }

    @Override // p.a4l
    public final void b() {
        if (this.h.b()) {
            this.N0 = this.i.c(this);
            tw5 tw5Var = new tw5(this, (lnm) null, (byte) 0);
            llm llmVar = this.X;
            c921.y(llmVar, (o8n) null, 0, tw5Var, 3);
            c921.y(llmVar, (o8n) null, 0, new tw5(this, (lnm) null, (byte) 1), 3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:107:0x0247  */
    /* JADX WARN: Code duplicated, block: B:109:0x024a  */
    /* JADX WARN: Code duplicated, block: B:110:0x024d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(onm onmVar) throws NoWhenBranchMatchedException {
        ow5 ow5Var;
        String str;
        String str2;
        esa1 esa1Var;
        d9n d9nVar;
        Object objI;
        h06 h06Var;
        h06 h06Var2;
        String str3;
        bxt bxtVar;
        Object objI2;
        String str4;
        bxt bxtVar2;
        int iC;
        vc4 vc4Var;
        boolean zContains;
        int iOrdinal;
        ywt ywtVarB;
        int iOrdinal2;
        String str5;
        mmr0 mmr0VarN;
        if (onmVar instanceof ow5) {
            ow5Var = (ow5) onmVar;
            int i = ow5Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ow5Var.e = i - Integer.MIN_VALUE;
            } else {
                ow5Var = new ow5(this, onmVar);
            }
        } else {
            ow5Var = new ow5(this, onmVar);
        }
        ow5 ow5Var2 = ow5Var;
        Object obj = ow5Var2.c;
        int i2 = ow5Var2.e;
        rih1 rih1Var = rih1.a;
        xc4 xc4Var = this.h;
        esa1 esa1Var2 = this.t;
        d9n d9nVar2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            xc4Var.a();
            int iOrdinal3 = xc4Var.e().ordinal();
            if (iOrdinal3 == 0) {
                str = "smart_control_nudge";
            } else {
                if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                str = "bottom_sheet_nudge";
            }
            str2 = str;
            esa1Var2.u(new tvc1("app_startup", str2));
            try {
                ezt eztVar = this.a;
                d9nVar = d9nVar2;
                Long lQ = yah0.q(xc4Var.a());
                ve3 ve3Var = new ve3(this, (byte) 13);
                ow5Var2.a = str2;
                ow5Var2.e = 1;
                esa1Var = esa1Var2;
                try {
                    objI = eztVar.i("app_startup_trigger", oxt.a, lQ, ve3Var, ow5Var2);
                    if (objI != d9nVar) {
                        bxtVar = (bxt) objI;
                        if (bxtVar == null) {
                            esa1Var.u(new svc1("app_startup", str2, (String) null, "BACKEND_NO_SUGGESTION"));
                            return rih1Var;
                        }
                        x010 x010VarT = h5p1.t(ezn1.o(this.e.a).a(), this.f.b, new ew0(this, (lnm) null, (byte) 3));
                        ow5Var2.a = str2;
                        ow5Var2.b = bxtVar;
                        ow5Var2.e = 2;
                        objI2 = b5p1.i(x010VarT, ow5Var2);
                        if (objI2 != d9nVar) {
                            str4 = str2;
                            bxtVar2 = bxtVar;
                            if (!((Boolean) objI2).booleanValue()) {
                                bxtVar2.getClass();
                                esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "VIEW_NOT_READY"));
                                return rih1Var;
                            }
                            iC = l1d.C(bxtVar2.a());
                            vc4Var = vc4.b;
                            zContains = false;
                            if (iC != 0) {
                                if (iC == 1) {
                                    zContains = p7h.M(new vc4[]{vc4Var, vc4.c}).contains(xc4Var.c());
                                } else if (iC == 2) {
                                    zContains = true;
                                } else if (iC != 3) {
                                    eg.o();
                                    return null;
                                }
                            } else if (xc4Var.c() == vc4Var) {
                                zContains = true;
                            }
                            if (!zContains) {
                                Objects.toString(xc4Var.c());
                                esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "BELOW_CONFIDENCE_THRESHOLD"));
                                return rih1Var;
                            }
                            iOrdinal = xc4Var.e().ordinal();
                            if (iOrdinal == 0) {
                                ywtVarB = bxtVar2.f().b();
                            } else {
                                if (iOrdinal != 1) {
                                    eg.o();
                                    return null;
                                }
                                ywtVarB = bxtVar2.f().a();
                            }
                            iOrdinal2 = ywtVarB.ordinal();
                            if (iOrdinal2 != 0) {
                            }
                            esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "BELOW_NUDGE_PROPENSITY_THRESHOLD"));
                            return rih1Var;
                        }
                    }
                    return d9nVar;
                } catch (CancellationException e) {
                    e = e;
                    h06Var = (h06) this.b.b.h();
                    h06Var2 = h06.b;
                    if (h06Var == null) {
                        h06Var = h06Var2;
                    }
                    if (h06Var == h06Var2) {
                        str3 = "APP_BACKGROUNDED";
                    } else {
                        str3 = "TRIGGER_STOPPED";
                    }
                    esa1Var.u(new mvc1("app_startup", str2, str3));
                    throw e;
                }
            } catch (CancellationException e2) {
                e = e2;
                esa1Var = esa1Var2;
                h06Var = (h06) this.b.b.h();
                h06Var2 = h06.b;
                if (h06Var == null) {
                    h06Var = h06Var2;
                }
                if (h06Var == h06Var2) {
                    str3 = "APP_BACKGROUNDED";
                } else {
                    str3 = "TRIGGER_STOPPED";
                }
                esa1Var.u(new mvc1("app_startup", str2, str3));
                throw e;
            }
        }
        if (i2 == 1) {
            str2 = ow5Var2.a;
            try {
                hm5.M(obj);
                esa1Var = esa1Var2;
                objI = obj;
                d9nVar = d9nVar2;
                bxtVar = (bxt) objI;
                if (bxtVar == null) {
                    esa1Var.u(new svc1("app_startup", str2, (String) null, "BACKEND_NO_SUGGESTION"));
                    return rih1Var;
                }
                x010 x010VarT2 = h5p1.t(ezn1.o(this.e.a).a(), this.f.b, new ew0(this, (lnm) null, (byte) 3));
                ow5Var2.a = str2;
                ow5Var2.b = bxtVar;
                ow5Var2.e = 2;
                objI2 = b5p1.i(x010VarT2, ow5Var2);
                if (objI2 != d9nVar) {
                    str4 = str2;
                    bxtVar2 = bxtVar;
                    if (!((Boolean) objI2).booleanValue()) {
                        bxtVar2.getClass();
                        esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "VIEW_NOT_READY"));
                        return rih1Var;
                    }
                    iC = l1d.C(bxtVar2.a());
                    vc4Var = vc4.b;
                    zContains = false;
                    if (iC != 0) {
                        if (iC == 1) {
                            zContains = p7h.M(new vc4[]{vc4Var, vc4.c}).contains(xc4Var.c());
                        } else if (iC == 2) {
                            zContains = true;
                        } else if (iC != 3) {
                            eg.o();
                            return null;
                        }
                    } else if (xc4Var.c() == vc4Var) {
                        zContains = true;
                    }
                    if (!zContains) {
                        Objects.toString(xc4Var.c());
                        esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "BELOW_CONFIDENCE_THRESHOLD"));
                        return rih1Var;
                    }
                    iOrdinal = xc4Var.e().ordinal();
                    if (iOrdinal == 0) {
                        ywtVarB = bxtVar2.f().b();
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        ywtVarB = bxtVar2.f().a();
                    }
                    iOrdinal2 = ywtVarB.ordinal();
                    if (iOrdinal2 != 0) {
                    }
                    esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "BELOW_NUDGE_PROPENSITY_THRESHOLD"));
                    return rih1Var;
                }
                return d9nVar;
            } catch (CancellationException e3) {
                e = e3;
                esa1Var = esa1Var2;
                h06Var = (h06) this.b.b.h();
                h06Var2 = h06.b;
                if (h06Var == null) {
                    h06Var = h06Var2;
                }
                if (h06Var == h06Var2) {
                    str3 = "APP_BACKGROUNDED";
                } else {
                    str3 = "TRIGGER_STOPPED";
                }
                esa1Var.u(new mvc1("app_startup", str2, str3));
                throw e;
            }
        }
        if (i2 == 2) {
            bxtVar2 = ow5Var2.b;
            str4 = ow5Var2.a;
            hm5.M(obj);
            objI2 = obj;
            d9nVar = d9nVar2;
            esa1Var = esa1Var2;
            if (!((Boolean) objI2).booleanValue()) {
                bxtVar2.getClass();
                esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "VIEW_NOT_READY"));
                return rih1Var;
            }
            iC = l1d.C(bxtVar2.a());
            vc4Var = vc4.b;
            zContains = false;
            if (iC != 0) {
                if (iC == 1) {
                    zContains = p7h.M(new vc4[]{vc4Var, vc4.c}).contains(xc4Var.c());
                } else if (iC == 2) {
                    zContains = true;
                } else if (iC != 3) {
                    eg.o();
                    return null;
                }
            } else if (xc4Var.c() == vc4Var) {
                zContains = true;
            }
            if (!zContains) {
                Objects.toString(xc4Var.c());
                esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "BELOW_CONFIDENCE_THRESHOLD"));
                return rih1Var;
            }
            iOrdinal = xc4Var.e().ordinal();
            if (iOrdinal == 0) {
                ywtVarB = bxtVar2.f().b();
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                ywtVarB = bxtVar2.f().a();
            }
            iOrdinal2 = ywtVarB.ordinal();
            if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                esa1Var.u(new svc1("app_startup", str4, bxtVar2.e(), "BELOW_NUDGE_PROPENSITY_THRESHOLD"));
                return rih1Var;
            }
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                eg.o();
                return null;
            }
            ow5Var2.a = str4;
            ow5Var2.b = bxtVar2;
            ow5Var2.e = 3;
            Object objD = d(ow5Var2);
            if (objD != d9nVar) {
                obj = objD;
                str5 = str4;
            }
            return d9nVar;
        }
        if (i2 != 3) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bxtVar2 = ow5Var2.b;
        str5 = ow5Var2.a;
        hm5.M(obj);
        esa1Var = esa1Var2;
        if (!((Boolean) obj).booleanValue()) {
            bxtVar2.getClass();
            esa1Var.u(new svc1("app_startup", str5, bxtVar2.e(), "INELIGIBLE"));
            return rih1Var;
        }
        int iOrdinal4 = xc4Var.e().ordinal();
        if (iOrdinal4 == 0) {
            mmr0VarN = oqn1.n(eh91.a, sqg0.J(new mmr0[]{oqn1.n("instrumentationId", iyk0.b), oqn1.n("dismissTimeout", Long.valueOf(xc4Var.d()))}));
        } else {
            if (iOrdinal4 != 1) {
                eg.o();
                return null;
            }
            mmr0VarN = oqn1.n(pyb.a, zno1.t(oqn1.n("instrumentationId", w4l0.b)));
        }
        guc1 guc1Var = new guc1(bxtVar2, (Map) mmr0VarN.b, (jwc1) mmr0VarN.a);
        guc1Var.b().getClass();
        esa1Var.u(new pvc1("app_startup", guc1Var.b().a(), bxtVar2.e(), pro1.x(bxtVar2.a())));
        this.Y.m((Object) null, guc1Var);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        rw5 rw5Var;
        if (onmVar instanceof rw5) {
            rw5Var = (rw5) onmVar;
            int i = rw5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rw5Var.c = i - Integer.MIN_VALUE;
            } else {
                rw5Var = new rw5(this, onmVar);
            }
        } else {
            rw5Var = new rw5(this, onmVar);
        }
        Object objI = rw5Var.a;
        int i2 = rw5Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            any anyVarN = f5p1.n(this.Z);
            rw5Var.c = 1;
            objI = b5p1.i(anyVarN, rw5Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        if (((Boolean) objI).booleanValue()) {
            return yah0.m(false);
        }
        if (this.c.b.current().getValue() != null) {
            return yah0.m(false);
        }
        return ((Boolean) this.d.b.getValue()).booleanValue() ? yah0.m(false) : yah0.m(true);
    }

    @Override // p.kwc1
    public final String e() {
        return "app_startup";
    }

    @Override // p.kwc1
    public final bpb1 f() {
        return this.O0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.kwc1
    public final void h(evc1 evc1Var) throws NoWhenBranchMatchedException {
        evc1Var.toString();
        if ((evc1Var instanceof avc1) || (evc1Var instanceof cvc1)) {
            this.Y.l((Object) null);
        } else {
            if ((evc1Var instanceof bvc1) || (evc1Var instanceof dvc1)) {
                return;
            }
            eg.o();
        }
    }
}
