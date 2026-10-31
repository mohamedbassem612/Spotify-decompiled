package p;

import android.app.Application;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Fingerprint;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.RavelinError;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pvz0 {
    public static final uic n = new uic((byte) 21);
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f95p;
    public static final llm q;
    public static final q6n1 r;
    public static volatile pvz0 s;
    public final Application a;
    public final String b;
    public zdp0 c;
    public u6n1 d;
    public rug e;
    public ydp0 f;
    public tug g;
    public sug h;
    public kvg i;
    public xdf0 j;
    public o9b0 k;
    public llm l;
    public String m = "";

    static {
        String canonicalName = pvz0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = pvz0.class.getSimpleName();
        }
        o = canonicalName;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        q = smo1.e(ha71.A(j0d1VarB, b3s.c));
        r = new q6n1();
    }

    public pvz0(Application application, String str) {
        this.a = application;
        this.b = str;
    }

    public final ydp0 a() {
        ydp0 ydp0Var = this.f;
        if (ydp0Var != null) {
            return ydp0Var;
        }
        u890.C("deviceIdWrapper");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object b(Application application, String str, String str2, cnr cnrVar, onm onmVar) {
        jvz0 jvz0Var;
        Boolean bool;
        boolean zC;
        Long l;
        long j;
        Application application2;
        String str3;
        String str4;
        ArrayList arrayList;
        if (onmVar instanceof jvz0) {
            jvz0Var = (jvz0) onmVar;
            int i = jvz0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                jvz0Var.i = i - Integer.MIN_VALUE;
            } else {
                jvz0Var = new jvz0(this, onmVar);
            }
        } else {
            jvz0Var = new jvz0(this, onmVar);
        }
        jvz0 jvz0Var2 = jvz0Var;
        Object obj = jvz0Var2.g;
        int i2 = jvz0Var2.i;
        rih1 rih1Var = rih1.a;
        String str5 = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                gex0.g(application, this.b).j(this);
                j0d1 j0d1VarB = guo1.B();
                zdp0 zdp0Var = this.c;
                if (zdp0Var == null) {
                    u890.C("coroutineContextProvider");
                    throw null;
                }
                this.l = smo1.e(ha71.A(j0d1VarB, zdp0Var.a()));
                String str6 = str == null ? "" : str;
                if (f0o1.b(str6)) {
                    this.m = str6;
                } else {
                    this.m = "";
                }
                if (cnrVar != null) {
                    Object objB = cnrVar.b("device id sharing group", "device id sharing enabled");
                    if (!(objB instanceof Boolean)) {
                        objB = null;
                    }
                    bool = (Boolean) objB;
                } else {
                    bool = null;
                }
                zC = uug.c(bool);
                if (cnrVar != null) {
                    Object objB2 = cnrVar.b("device id sharing group", "device id sharing timeout");
                    if (!(objB2 instanceof Long)) {
                        objB2 = null;
                    }
                    l = (Long) objB2;
                } else {
                    l = null;
                }
                long jA = uug.a(l);
                f(cnrVar);
                ArrayList arrayListI = a().i(application, yah0.m(zC));
                Boolean boolM = yah0.m(zC);
                Long lQ = yah0.q(jA);
                jvz0Var2.a = application;
                jvz0Var2.b = str;
                jvz0Var2.c = str2;
                jvz0Var2.d = arrayListI;
                jvz0Var2.e = zC;
                jvz0Var2.f = jA;
                jvz0Var2.i = 1;
                lvg lvgVarA = a();
                j = jA;
                tug tugVar = this.g;
                if (tugVar == null) {
                    u890.C("randomNumbersGenerator");
                    throw null;
                }
                sug sugVar = this.h;
                if (sugVar == null) {
                    u890.C("permissionsManager");
                    throw null;
                }
                Object objG = lvgVarA.g(application, tugVar, sugVar, arrayListI, str2, boolM, lQ, jvz0Var2);
                d9n d9nVar = d9n.a;
                if (objG != d9nVar) {
                    objG = rih1Var;
                }
                if (objG == d9nVar) {
                    return d9nVar;
                }
                application2 = application;
                str3 = str2;
                str4 = str;
                arrayList = arrayListI;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = jvz0Var2.f;
                boolean z = jvz0Var2.e;
                ArrayList arrayList2 = jvz0Var2.d;
                String str7 = jvz0Var2.c;
                String str8 = jvz0Var2.b;
                Application application3 = jvz0Var2.a;
                hm5.M(obj);
                zC = z;
                j = j2;
                arrayList = arrayList2;
                str3 = str7;
                application2 = application3;
                str4 = str8;
            }
            Boolean boolM2 = yah0.m(zC);
            Long lQ2 = yah0.q(j);
            llm llmVar = this.l;
            if (llmVar != null) {
                c921.y(llmVar, (o8n) null, 0, new fvz0(this, application2, str3, arrayList, boolM2, lQ2, (lnm) null), 3);
            }
            rug rugVar = this.e;
            if (rugVar == null) {
                u890.C("payloadGenerator");
                throw null;
            }
            String strB = rugVar.b();
            if (ihc1.y0(strB) || strB.equals("0")) {
                rug rugVar2 = this.e;
                if (rugVar2 == null) {
                    u890.C("payloadGenerator");
                    throw null;
                }
                rugVar2.b();
            }
            Boolean boolM3 = yah0.m(zC);
            llm llmVar2 = this.l;
            if (llmVar2 != null) {
                c921.y(llmVar2, (o8n) null, 0, new nvz0(this, application2, arrayList, boolM3, str4, null), 3);
            }
            f95p = true;
            return rih1Var;
        } catch (Exception e) {
            j2p1.v(o, "***Debug error in RavelinSDK initialise " + e.getMessage());
            e(new RavelinError(e.getMessage(), str5, 2, str5), new ErrorMetadata(104, "Initialization", "An error occurred while initializing the SDK", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null), null);
            return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(cnr cnrVar, boolean z, ovz0 ovz0Var, onm onmVar) {
        gvz0 gvz0Var;
        if (onmVar instanceof gvz0) {
            gvz0Var = (gvz0) onmVar;
            int i = gvz0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvz0Var.d = i - Integer.MIN_VALUE;
            } else {
                gvz0Var = new gvz0(this, onmVar);
            }
        } else {
            gvz0Var = new gvz0(this, onmVar);
        }
        Object objE = gvz0Var.b;
        int i2 = gvz0Var.d;
        rih1 rih1Var = rih1.a;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                u6n1 u6n1Var = this.d;
                if (u6n1Var == null) {
                    u890.C("fingerprintGenerator");
                    throw null;
                }
                gvz0Var.a = ovz0Var;
                gvz0Var.d = 1;
                objE = u6n1.e(u6n1Var, cnrVar, z, gvz0Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ovz0Var = gvz0Var.a;
                hm5.M(objE);
            }
            Fingerprint fingerprint = (Fingerprint) objE;
            if (ovz0Var == null) {
                return null;
            }
            ovz0Var.u(fingerprint);
            return rih1Var;
        } catch (Exception e) {
            if (ovz0Var == null) {
                return null;
            }
            ovz0Var.n(new RavelinError(e.getMessage(), str, 2, str));
            return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(boolean z, cnr cnrVar, evz0 evz0Var, lnm lnmVar) {
        kvz0 kvz0Var;
        if (lnmVar instanceof kvz0) {
            kvz0Var = (kvz0) lnmVar;
            int i = kvz0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kvz0Var.d = i - Integer.MIN_VALUE;
            } else {
                kvz0Var = new kvz0(this, lnmVar);
            }
        } else {
            kvz0Var = new kvz0(this, lnmVar);
        }
        Object objC = kvz0Var.b;
        int i2 = kvz0Var.d;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                rug rugVar = this.e;
                if (rugVar == null) {
                    u890.C("payloadGenerator");
                    throw null;
                }
                String str2 = this.m;
                String strE = a().e();
                if (strE == null) {
                    strE = "0";
                }
                ovz0 ovz0Var = new ovz0(rugVar.a(str2, strE, new ivz0(this, evz0Var)), this, evz0Var);
                kvz0Var.a = evz0Var;
                kvz0Var.d = 1;
                objC = c(cnrVar, z, ovz0Var, kvz0Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                evz0 evz0Var2 = kvz0Var.a;
                hm5.M(objC);
            }
            return (rih1) objC;
        } catch (Exception e) {
            e(new RavelinError(e.getMessage(), str, 2, str), new ErrorMetadata(101, "Tracking", "An error occurred while generating the fingerprint", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null), evz0Var);
            return rih1.a;
        }
    }

    public final void e(RavelinError ravelinError, ErrorMetadata errorMetadata, evz0 evz0Var) {
        Application application = this.a;
        if (application != null) {
            a().j(application.getApplicationContext());
            MobileError mobileError = new MobileError(System.currentTimeMillis(), "", "mobile-report", ravelinError.getMessage(), errorMetadata);
            boolean z = this.k != null;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (!z) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                r7n1 r7n1Var = this.k;
                if (r7n1Var == null) {
                    u890.C("eventTracker");
                    throw null;
                }
                r7n1Var.a(mobileError);
            }
        }
        if (evz0Var != null) {
            evz0Var.a(ravelinError);
        }
    }

    public final void f(cnr cnrVar) {
        kvg kvgVar = this.i;
        lnm lnmVar = null;
        if (kvgVar == null) {
            u890.C("rateLimit");
            throw null;
        }
        kvgVar.b.put("fingerprint emitter", new wdp0(mgo1.e(0, 0, 0, 7), new lvz0(4, this, pvz0.class, "trackFingerprintAction", "trackFingerprintAction(ZLcom/ravelin/core/util/configparameters/ConfigParameters;Lcom/ravelin/core/callback/RavelinRequestCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8), cnrVar));
        c921.y(kvgVar.a, (o8n) null, 0, new k53(kvgVar, lnmVar, (byte) 5), 3);
    }
}
