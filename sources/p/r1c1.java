package p;

import android.content.Context;
import com.spotify.storage.localstorageapi.CacheMovingWorker;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r1c1 extends g810 {
    public final Context c;
    public final s6b1 d;
    public final gpm0 e;
    public final c681 f;

    public r1c1(Context context, s6b1 s6b1Var, gpm0 gpm0Var, c681 c681Var) {
        this.c = context;
        this.d = s6b1Var;
        this.e = gpm0Var;
        this.f = c681Var;
    }

    @Override // p.g810
    public final Object a(onm onmVar) {
        String strE = this.d.l.e(t6b1.t, (String) null);
        return strE != null ? new it61(strE) : new ht61((Integer) null, 0);
    }

    @Override // p.g810
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, tv80 tv80Var, f810 f810Var) {
        return d((String) obj, (String) obj2, f810Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0124 A[PHI: r1 r5
      0x0124: PHI (r1v18 long) = (r1v17 long), (r1v25 long) binds: [B:32:0x0121, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r5v10 java.lang.String) = (r5v9 java.lang.String), (r5v13 java.lang.String) binds: [B:32:0x0121, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0132  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139  */
    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:46:0x014a  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(String str, String str2, onm onmVar) {
        o1c1 o1c1Var;
        Long lT;
        long jLongValue;
        int i;
        String str3;
        long j;
        ezc ezcVarF;
        q1c1 q1c1Var;
        String str4;
        it61 it61Var;
        it61 it61Var2;
        String str5 = str2;
        if (onmVar instanceof o1c1) {
            o1c1Var = (o1c1) onmVar;
            int i2 = o1c1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1c1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                o1c1Var = new o1c1(this, onmVar);
            }
        } else {
            o1c1Var = new o1c1(this, onmVar);
        }
        Object objA = o1c1Var.c;
        int i3 = o1c1Var.e;
        byte b = 0;
        Context context = this.c;
        lnm lnmVar = null;
        Object obj = d9n.a;
        if (i3 == 0) {
            hm5.M(objA);
            if (str == null || (lT = this.f.t(str)) == null) {
                return new ht61((Integer) null, 0);
            }
            jLongValue = lT.longValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("volume", str5);
            linkedHashMap.put("estimated-size", lT);
            ewq ewqVar = new ewq(linkedHashMap);
            o0c.N(ewqVar);
            pzc pzcVar = (pzc) awl1.d(context).c("cache_moving_worker", 2, new ciq0(CacheMovingWorker.class).i(ewqVar).b()).b;
            o1c1Var.a = str5;
            o1c1Var.b = jLongValue;
            o1c1Var.e = 1;
            if (w0h1.n(pzcVar, o1c1Var) != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            long j2 = o1c1Var.b;
            String str6 = o1c1Var.a;
            hm5.M(objA);
            jLongValue = j2;
            str5 = str6;
        } else {
            if (i3 == 2) {
                j = o1c1Var.b;
                str3 = o1c1Var.a;
                hm5.M(objA);
                i = 2;
                ezcVarF = h4p1.f(new sb91(this.e, lnmVar, (byte) 27));
                q1c1Var = new q1c1(i, lnmVar, b);
                o1c1Var.a = str3;
                o1c1Var.b = j;
                o1c1Var.e = 3;
                if (b5p1.l(ezcVarF, q1c1Var, o1c1Var) != obj) {
                    o1c1Var.a = str3;
                    o1c1Var.b = j;
                    o1c1Var.e = 4;
                    objA = a(o1c1Var);
                    if (objA != obj) {
                        str4 = str3;
                    }
                }
                return obj;
            }
            if (i3 == 3) {
                j = o1c1Var.b;
                str3 = o1c1Var.a;
                hm5.M(objA);
                o1c1Var.a = str3;
                o1c1Var.b = j;
                o1c1Var.e = 4;
                objA = a(o1c1Var);
                if (objA != obj) {
                    str4 = str3;
                }
                return obj;
            }
            if (i3 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = o1c1Var.a;
            hm5.M(objA);
        }
        it61Var = (jt61) objA;
        if (it61Var instanceof it61) {
            it61Var2 = it61Var;
        } else {
            it61Var2 = null;
        }
        if (it61Var2 != null) {
            if (!nhc1.Y((String) it61Var2.a, str4, false)) {
                it61Var2 = null;
            }
            if (it61Var2 != null) {
                return it61Var2;
            }
        }
        return new ht61((Integer) null, 0);
        awl1 awl1VarD = awl1.d(context);
        dxl1 dxl1VarA = awl1VarD.c.A();
        mr20 mr20VarR = o4p1.r(rqt0.u(new xwl1(zno1.h(dxl1VarA.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new w7d1(dxl1VarA, (byte) 15)), (byte) 0)), awl1VarD.d.b);
        i = 2;
        ck01 ck01Var = new ck01(2, (lnm) null, (byte) 29);
        o1c1Var.a = str5;
        o1c1Var.b = jLongValue;
        o1c1Var.e = 2;
        if (b5p1.l(mr20VarR, ck01Var, o1c1Var) != obj) {
            str3 = str5;
            j = jLongValue;
            ezcVarF = h4p1.f(new sb91(this.e, lnmVar, (byte) 27));
            q1c1Var = new q1c1(i, lnmVar, b);
            o1c1Var.a = str3;
            o1c1Var.b = j;
            o1c1Var.e = 3;
            if (b5p1.l(ezcVarF, q1c1Var, o1c1Var) != obj) {
                o1c1Var.a = str3;
                o1c1Var.b = j;
                o1c1Var.e = 4;
                objA = a(o1c1Var);
                if (objA != obj) {
                    str4 = str3;
                    it61Var = (jt61) objA;
                    if (it61Var instanceof it61) {
                        it61Var2 = it61Var;
                    } else {
                        it61Var2 = null;
                    }
                    if (it61Var2 != null) {
                        if (!nhc1.Y((String) it61Var2.a, str4, false)) {
                            it61Var2 = null;
                        }
                        if (it61Var2 != null) {
                            return it61Var2;
                        }
                    }
                    return new ht61((Integer) null, 0);
                }
            }
        }
        return obj;
    }
}
