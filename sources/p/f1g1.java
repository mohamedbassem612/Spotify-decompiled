package p;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f1g1 implements xa71 {
    public static final Set i = f46.S0(new o571[]{g571.d, n571.d, i571.d, j571.d, v471.d});
    public final Context a;
    public final w6e0 b;
    public final j7s c;
    public final hce1 d;
    public final q8n e;
    public final jo8 f;
    public final vr51 g;
    public mmr0 h;

    public f1g1(Context context, w6e0 w6e0Var, j7s j7sVar, hce1 hce1Var, q8n q8nVar, jo8 jo8Var, vr51 vr51Var) {
        this.a = context;
        this.b = w6e0Var;
        this.c = j7sVar;
        this.d = hce1Var;
        this.e = q8nVar;
        this.f = jo8Var;
        this.g = vr51Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    public static int d(List list, z771 z771Var) {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (u890.j(((u771) it.next()).a.b, z771Var)) {
                if (i2 < 0) {
                    return 0;
                }
                return i2;
            }
            i2++;
        }
        i2 = -1;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, wa71 wa71Var, z771 z771Var, p0g1 p0g1Var, onm onmVar) {
        c1g1 c1g1Var;
        wa71 wa71Var2;
        z771 z771Var2;
        p0g1 p0g1Var2;
        Object objA;
        String str2;
        String string;
        if (onmVar instanceof c1g1) {
            c1g1Var = (c1g1) onmVar;
            int i2 = c1g1Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1g1Var.f = i2 - Integer.MIN_VALUE;
            } else {
                c1g1Var = new c1g1(this, onmVar);
            }
        } else {
            c1g1Var = new c1g1(this, onmVar);
        }
        Object obj = c1g1Var.d;
        int i3 = c1g1Var.f;
        if (i3 == 0) {
            hm5.M(obj);
            wa71Var2 = wa71Var;
            c1g1Var.a = wa71Var2;
            z771Var2 = z771Var;
            c1g1Var.b = z771Var2;
            p0g1Var2 = p0g1Var;
            c1g1Var.c = p0g1Var2;
            c1g1Var.f = 1;
            objA = this.f.a(str, c1g1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p0g1 p0g1Var3 = c1g1Var.c;
            z771 z771Var3 = c1g1Var.b;
            wa71 wa71Var3 = c1g1Var.a;
            hm5.M(obj);
            objA = obj;
            wa71Var2 = wa71Var3;
            p0g1Var2 = p0g1Var3;
            z771Var2 = z771Var3;
        }
        xan0 xan0Var = (xan0) objA;
        String str3 = p0g1Var2.d;
        String str4 = p0g1Var2.d;
        Long l = p0g1Var2.e;
        t771 t771Var = new t771(wa71Var2, z771Var2);
        y171 y171Var = new y171(rc11.a.b(iq30.class));
        jlw0 jlw0Var = xan0Var.a;
        String strF = xan0Var.e;
        jlw0 jlw0Var2 = xan0Var.b;
        int i4 = xan0Var.c;
        int i5 = xan0Var.d;
        if (str3 != null && str3.length() != 0) {
            strF = f4i1.f(str3, " - ", strF);
        }
        String str5 = strF;
        String str6 = xan0Var.f;
        xtx xtxVar = xtx.c;
        vr51 vr51Var = this.g;
        Context context = this.a;
        if (l != null) {
            str2 = str4;
            string = context.getString(2131953929, vr51Var.f(l.longValue()));
        } else {
            str2 = str4;
            string = str2 != null ? context.getString(2131953930) : context.getString(2131962254, vr51Var.f(xan0Var.g));
        }
        string.getClass();
        return new u771(t771Var, new pz61(y171Var, new sq30(jlw0Var, jlw0Var2, i4, i5, str5, str6, new s171(string, xtxVar)), ahl.a, false), new bj71(i, false, context.getString(str2 != null ? 2131963360 : 2131963362)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Set set, onm onmVar) throws Throwable {
        d1g1 d1g1Var;
        List m231Var;
        if (onmVar instanceof d1g1) {
            d1g1Var = (d1g1) onmVar;
            int i2 = d1g1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1g1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                d1g1Var = new d1g1(this, onmVar);
            }
        } else {
            d1g1Var = new d1g1(this, onmVar);
        }
        Object objM = d1g1Var.a;
        int i3 = d1g1Var.c;
        lnm lnmVar = null;
        try {
            if (i3 == 0) {
                hm5.M(objM);
                pec1 pec1Var = new pec1(this, set, lnmVar, (byte) 28);
                d1g1Var.c = 1;
                objM = rc2.M(5000L, pec1Var, d1g1Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objM);
            }
            m231Var = (List) objM;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 != null) {
            if (thA2 instanceof TimeoutCancellationException) {
                j2h1.I(thA2);
            } else {
                j2h1.I(thA2);
            }
        }
        return m231Var instanceof m231 ? z6x.a : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(wa71 wa71Var, onm onmVar) {
        e1g1 e1g1Var;
        String str;
        if (onmVar instanceof e1g1) {
            e1g1Var = (e1g1) onmVar;
            int i2 = e1g1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e1g1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                e1g1Var = new e1g1(this, onmVar);
            }
        } else {
            e1g1Var = new e1g1(this, onmVar);
        }
        Object obj = e1g1Var.b;
        int i3 = e1g1Var.d;
        if (i3 == 0) {
            hm5.M(obj);
            String str2 = wa71Var.a;
            mmr0 mmr0Var = this.h;
            if (mmr0Var != null) {
                String str3 = (String) mmr0Var.a;
                p0g1 p0g1Var = (p0g1) mmr0Var.b;
                if (u890.j(str3, str2)) {
                    return p0g1Var;
                }
            }
            e1g1Var.a = str2;
            e1g1Var.d = 1;
            Object objC = this.d.C(wa71Var, e1g1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            obj = objC;
            str = str2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = e1g1Var.a;
            hm5.M(obj);
        }
        p0g1 p0g1Var2 = (p0g1) obj;
        if (p0g1Var2 == null) {
            return null;
        }
        this.h = new mmr0(str, p0g1Var2);
        return p0g1Var2;
    }
}
