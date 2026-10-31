package p;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vbz implements s771 {
    public final Context a;
    public final vr51 b;
    public final uvy c;
    public final x2z d;
    public final boolean e;

    public vbz(Context context, vr51 vr51Var, uvy uvyVar, x2z x2zVar, boolean z) {
        this.a = context;
        this.b = vr51Var;
        this.c = uvyVar;
        this.d = x2zVar;
        this.e = z;
    }

    public static u771 c(ybz ybzVar, String str, s171 s171Var) {
        String str2;
        jlw0 jlw0Var;
        j1z j1zVar = ybzVar.b;
        j1z j1zVar2 = ybzVar.b;
        so71 so71Var = ybzVar.f;
        h281 h281Var = ybzVar.a;
        if (!j1zVar.a()) {
            jlw0 jlw0Var2 = j1zVar.c;
            int i = so71Var.a;
            int i2 = so71Var.c;
            String str3 = j1zVar.b;
            str2 = h281Var != null ? h281Var.b : null;
            return f(new mt7(jlw0Var2, i, i2, str3, str2 == null ? "" : str2, s171Var), rc11.a.b(zs7.class), bz61.d, tyo1.p(blc0.og, new String[0]), str, j1zVar2.a);
        }
        jlw0 jlw0Var3 = ybzVar.e;
        if (h281Var == null || (jlw0Var = h281Var.c) == null) {
            jlw0Var = j1zVar.c;
        }
        jlw0 jlw0Var4 = jlw0Var;
        int i3 = so71Var.a;
        int i4 = so71Var.c;
        String str4 = j1zVar.b;
        str2 = h281Var != null ? h281Var.b : null;
        return f(new sq30(jlw0Var3, jlw0Var4, i3, i4, str4, str2 == null ? "" : str2, s171Var), rc11.a.b(iq30.class), ahl.a, tyo1.p(blc0.pg, new String[0]), str, j1zVar2.a);
    }

    public static u771 f(c871 c871Var, tka0 tka0Var, ez61 ez61Var, z771 z771Var, String str, String str2) {
        return new u771(new t771(new wa71(str2, null, null, null, null, null, null, 126), z771Var), new pz61(new y171(tka0Var), c871Var, ez61Var, false), new bj71(null, false, str, 3));
    }

    @Override // p.s771
    public final boolean a(ybz ybzVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p.s771
    public final Object b(ybz ybzVar, String str, lnm lnmVar) throws Throwable {
        sbz sbzVar;
        String str2;
        Object objD;
        ybz ybzVar2;
        String str3;
        vbz vbzVar;
        ybz ybzVar3;
        String string;
        Long l;
        String strF;
        String str4;
        String str5;
        vbz vbzVar2 = this;
        ybz ybzVar4 = ybzVar;
        if (lnmVar instanceof sbz) {
            sbzVar = (sbz) lnmVar;
            int i = sbzVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbzVar.i = i - Integer.MIN_VALUE;
            } else {
                sbzVar = new sbz(vbzVar2, (onm) lnmVar);
            }
        } else {
            sbzVar = new sbz(vbzVar2, (onm) lnmVar);
        }
        Object objE = sbzVar.g;
        int i2 = sbzVar.i;
        vr51 vr51Var = vbzVar2.b;
        Context context = vbzVar2.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objE);
            llg llgVar = ybzVar4.d;
            if (llgVar != null && vbzVar2.e) {
                String str6 = llgVar.a;
                sbzVar.a = ybzVar4;
                sbzVar.i = 1;
                objE = vbzVar2.e(str6, sbzVar);
                if (objE != d9nVar) {
                }
                return d9nVar;
            }
            String string2 = context.getString(2131955584);
            j1z j1zVar = ybzVar4.b;
            String str7 = j1zVar.i;
            Long l2 = j1zVar.g;
            String strF2 = l2 != null ? vr51Var.f(l2.longValue()) : null;
            String string3 = l2 != null ? context.getString(2131955582, vr51Var.f(l2.longValue())) : context.getString(2131955583);
            string3.getClass();
            return c(ybzVar4, string2, new s171(uwo1.n(str7, strF2, string3), j1zVar.a() ? xtx.c : null));
        }
        if (i2 == 1) {
            ybzVar4 = sbzVar.a;
            hm5.M(objE);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybz ybzVar5 = sbzVar.f;
            vbzVar = sbzVar.e;
            str3 = sbzVar.d;
            ybzVar2 = sbzVar.c;
            vbz vbzVar3 = sbzVar.b;
            hm5.M(objE);
            ybzVar3 = ybzVar5;
            vbzVar2 = vbzVar3;
            objD = objE;
            str2 = null;
        }
        string = (String) objD;
        vbzVar.getClass();
        l = ybzVar3.b.g;
        if (l != null) {
            strF = vbzVar.b.f(l.longValue());
        } else {
            strF = str2;
        }
        if (string.length() == 0) {
            if (strF == null) {
                string = "";
            } else {
                string = strF;
            }
        } else if (strF != null) {
            string = vbzVar.a.getString(2131955580, string, strF);
        }
        str4 = xtx.c;
        if (ybzVar3.b.a()) {
            str5 = str4;
        } else {
            str5 = str2;
        }
        s171 s171Var = new s171(string, str5);
        vbzVar2.getClass();
        return c(ybzVar2, str3, s171Var);
        rbz rbzVar = (rbz) objE;
        if (rbzVar != null) {
            String str8 = rbzVar.a;
            Set set = s4b1.f;
            if (!uic.g(str8, blc0.fh)) {
                String str9 = rbzVar.b;
                str2 = null;
                sbzVar.a = null;
                sbzVar.b = vbzVar2;
                sbzVar.c = ybzVar4;
                sbzVar.d = str9;
                sbzVar.e = vbzVar2;
                sbzVar.f = ybzVar4;
                sbzVar.i = 2;
                objD = vbzVar2.d(str8, sbzVar);
                if (objD != d9nVar) {
                    ybzVar2 = ybzVar4;
                    str3 = str9;
                    vbzVar = vbzVar2;
                    ybzVar3 = ybzVar2;
                    string = (String) objD;
                    vbzVar.getClass();
                    l = ybzVar3.b.g;
                    if (l != null) {
                        strF = vbzVar.b.f(l.longValue());
                    } else {
                        strF = str2;
                    }
                    if (string.length() == 0) {
                        if (strF == null) {
                            string = "";
                        } else {
                            string = strF;
                        }
                    } else if (strF != null) {
                        string = vbzVar.a.getString(2131955580, string, strF);
                    }
                    str4 = xtx.c;
                    if (ybzVar3.b.a()) {
                        str5 = str4;
                    } else {
                        str5 = str2;
                    }
                    s171 s171Var2 = new s171(string, str5);
                    vbzVar2.getClass();
                    return c(ybzVar2, str3, s171Var2);
                }
                return d9nVar;
            }
            h281 h281Var = ybzVar4.a;
            if (h281Var != null) {
                jlw0 jlw0Var = h281Var.c;
                if (jlw0Var == null) {
                    jlw0Var = ybzVar4.b.c;
                }
                jlw0 jlw0Var2 = jlw0Var;
                so71 so71Var = ybzVar4.f;
                int i3 = so71Var.a;
                int i4 = so71Var.c;
                String str10 = h281Var.b;
                String str11 = h281Var.d;
                Long l3 = h281Var.e;
                String string4 = l3 != null ? context.getString(2131952645, vr51Var.f(l3.longValue())) : context.getString(2131952646);
                string4.getClass();
                return f(new mt7(jlw0Var2, i3, i4, str10, str11, new s171(string4, null)), rc11.a.b(zs7.class), bz61.d, tyo1.p(blc0.og, new String[0]), rbzVar.b, str8);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) throws Throwable {
        tbz tbzVar;
        String m231Var;
        if (onmVar instanceof tbz) {
            tbzVar = (tbz) onmVar;
            int i = tbzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbzVar.c = i - Integer.MIN_VALUE;
            } else {
                tbzVar = new tbz(this, onmVar);
            }
        } else {
            tbzVar = new tbz(this, onmVar);
        }
        Object objA = tbzVar.a;
        int i2 = tbzVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                x2z x2zVar = this.d;
                tbzVar.c = 1;
                objA = x2zVar.a(str, tbzVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = ((jo70) objA).b;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        String str2 = m231Var instanceof m231 ? null : m231Var;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) throws Throwable {
        ubz ubzVar;
        mvy m231Var;
        String str2;
        if (onmVar instanceof ubz) {
            ubzVar = (ubz) onmVar;
            int i = ubzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubzVar.c = i - Integer.MIN_VALUE;
            } else {
                ubzVar = new ubz(this, onmVar);
            }
        } else {
            ubzVar = new ubz(this, onmVar);
        }
        Object objB = ubzVar.a;
        int i2 = ubzVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                uvy uvyVar = this.c;
                ubzVar.c = 1;
                objB = uvyVar.b(str, ubzVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            m231Var = (mvy) objB;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        mvy mvyVar = m231Var;
        if (mvyVar != null && (str2 = mvyVar.a) != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                return new rbz(str2, mvyVar.b);
            }
        }
        return null;
    }
}
