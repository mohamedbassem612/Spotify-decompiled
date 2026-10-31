package p;

import android.app.Activity;
import android.os.Build;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w5o {
    public static final p6r0 e;
    public final Activity a;
    public final g1f0 b;
    public final g7h1 c;
    public final dp5 d;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        e = yon1.y1();
    }

    public w5o(Activity activity, g1f0 g1f0Var, g7h1 g7h1Var) {
        this.a = activity;
        this.b = g1f0Var;
        this.c = g7h1Var;
        this.d = qbo1.a(activity);
    }

    public static String c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.version.oneui");
        } catch (Exception unused) {
            return "";
        }
    }

    public final fjs0 a(String str, c6o c6oVar) {
        smc0 smc0VarN = k4p1.n();
        if (c6oVar == c6o.a) {
            smc0VarN.add(new po40());
        }
        if (str != null && this.b.p() && fno1.k()) {
            smc0VarN.add(new po40(str));
        }
        return new fjs0(k4p1.k(smc0VarN), c6oVar != c6o.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        s5o s5oVar;
        if (onmVar instanceof s5o) {
            s5oVar = (s5o) onmVar;
            int i = s5oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5oVar.c = i - Integer.MIN_VALUE;
            } else {
                s5oVar = new s5o(this, onmVar);
            }
        } else {
            s5oVar = new s5o(this, onmVar);
        }
        Object objF = s5oVar.a;
        int i2 = s5oVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                jqn jqnVar = new jqn(str);
                dp5 dp5Var = this.d;
                Activity activity = this.a;
                s5oVar.c = 1;
                objF = dp5Var.f(activity, jqnVar, s5oVar);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            return new non(((yjn) objF).a());
        } catch (CreateCredentialException e2) {
            return new mon(e2);
        } catch (CreateCredentialCancellationException unused) {
            return lon.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, c6o c6oVar, onm onmVar) {
        t5o t5oVar;
        if (onmVar instanceof t5o) {
            t5oVar = (t5o) onmVar;
            int i = t5oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5oVar.c = i - Integer.MIN_VALUE;
            } else {
                t5oVar = new t5o(this, onmVar);
            }
        } else {
            t5oVar = new t5o(this, onmVar);
        }
        Object objK = t5oVar.a;
        int i2 = t5oVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                if (this.b.B() || c2p1.w()) {
                    return co21.a;
                }
                g7h1.b(this.c, e, null, 6);
                fjs0 fjs0VarA = a(str, c6oVar);
                Activity activity = this.a;
                t5oVar.c = 1;
                objK = dp5.k(activity, fjs0VarA, t5oVar);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            y5s0 y5s0VarA = ((km40) objK).a();
            if (!(y5s0VarA instanceof y5s0)) {
                return y5s0VarA instanceof qmy0 ? new bo21(((qmy0) y5s0VarA).v()) : do21.a;
            }
            y5s0 y5s0Var = y5s0VarA;
            return new eo21(y5s0Var.v(), y5s0Var.w());
        } catch (GetCredentialException e2) {
            return new ao21(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        u5o u5oVar;
        j450 k450Var;
        if (onmVar instanceof u5o) {
            u5oVar = (u5o) onmVar;
            int i = u5oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5oVar.c = i - Integer.MIN_VALUE;
            } else {
                u5oVar = new u5o(this, onmVar);
            }
        } else {
            u5oVar = new u5o(this, onmVar);
        }
        Object objK = u5oVar.a;
        int i2 = u5oVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                po40 po40VarD = new ypa((byte) 12, false).d();
                jm40 jm40Var = new jm40();
                jm40Var.a(po40VarD);
                fjs0 fjs0VarB = jm40Var.b();
                Activity activity = this.a;
                u5oVar.c = 1;
                objK = dp5.k(activity, fjs0VarB, u5oVar);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            l450 l450Var = l450.a;
            yf yfVarA = ((km40) objK).a();
            if (!(yfVarA instanceof xpo) || !yfVarA.n().equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                return l450Var;
            }
            try {
                k450Var = new j450(gg.b(yfVarA.h()));
            } catch (GoogleIdTokenParsingException e2) {
                k450Var = new k450(e2);
            }
        } catch (GetCredentialException e3) {
            k450Var = new k450(e3);
        }
        return k450Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, onm onmVar) {
        v5o v5oVar;
        if (onmVar instanceof v5o) {
            v5oVar = (v5o) onmVar;
            int i = v5oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5oVar.c = i - Integer.MIN_VALUE;
            } else {
                v5oVar = new v5o(this, onmVar);
            }
        } else {
            v5oVar = new v5o(this, onmVar);
        }
        Object objF = v5oVar.a;
        int i2 = v5oVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                if ((nhc1.S(Build.MANUFACTURER, z2s0.d, true) && c().length() > 0 && Float.parseFloat(c()) / 10000.0f == 6.0f) || this.b.B() || str.length() == 0 || str2.length() == 0) {
                    return ed41.a;
                }
                pon ponVar = new pon(str, str2);
                dp5 dp5Var = this.d;
                Activity activity = this.a;
                v5oVar.c = 1;
                objF = dp5Var.f(activity, ponVar, v5oVar);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            return fd41.a;
        } catch (CreateCredentialException e2) {
            return new dd41(e2);
        }
    }
}
