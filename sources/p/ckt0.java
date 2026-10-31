package p;

import android.view.View;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ckt0 implements tyq {
    public final o3r N0;
    public final ljm0 O0;
    public final ia00 P0;
    public final psw Q0;
    public final stt0 X;
    public final idd1 Y = new idd1(new zjt0(this, (byte) 1));
    public final idd1 Z = new idd1(new zjt0(this, (byte) 0));
    public final pp11 a;
    public final kt91 b;
    public final i1r0 c;
    public final y390 d;
    public final n9r0 e;
    public final ynb0 f;
    public final d0r g;
    public final iac0 h;
    public final njm i;
    public final k740 t;

    public ckt0(pp11 pp11Var, kt91 kt91Var, i1r0 i1r0Var, y390 y390Var, n9r0 n9r0Var, ynb0 ynb0Var, w8r0 w8r0Var, d0r d0rVar, iac0 iac0Var, njm njmVar, k740 k740Var, stt0 stt0Var) {
        this.a = pp11Var;
        this.b = kt91Var;
        this.c = i1r0Var;
        this.d = y390Var;
        this.e = n9r0Var;
        this.f = ynb0Var;
        this.g = d0rVar;
        this.h = iac0Var;
        this.i = njmVar;
        this.t = k740Var;
        this.X = stt0Var;
        this.N0 = hqn1.l(iet0.a1, iet0.b1, w8r0Var.a());
        iet0 iet0Var = iet0.Z0;
        fns fnsVar = igu.a;
        this.O0 = h7w.B(iet0Var, pyf0.a, (iu30) null, new x3o0(this, (byte) 27), 4);
        this.P0 = n3o1.q(this).a(e9t0.Q0, e9t0.R0);
        j2i j2iVar = g8j.c;
        ien0 ien0Var = qsw.a;
        this.Q0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.Q0;
    }

    public final d0r e() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r18.e.a(r8, r7, r14) == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.xjt0 r19, p.yjt0 r20, p.tv80 r21, java.lang.String r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ckt0.f(p.xjt0, p.yjt0, p.tv80, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object g(xjt0 xjt0Var, yjt0 yjt0Var, tv80 tv80Var, String str, onm onmVar) {
        bkt0 bkt0Var;
        tv80 tv80Var2;
        Object obj;
        String str2;
        String str3;
        kt91 kt91Var;
        Serializable serializable;
        xjt0 xjt0Var2;
        String str4;
        ou80 ou80Var;
        String str5;
        long j;
        xjt0 xjt0Var3 = xjt0Var;
        if (onmVar instanceof bkt0) {
            bkt0Var = (bkt0) onmVar;
            int i = bkt0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkt0Var.f = i - Integer.MIN_VALUE;
            } else {
                bkt0Var = new bkt0(this, onmVar);
            }
        } else {
            bkt0Var = new bkt0(this, onmVar);
        }
        bkt0 bkt0Var2 = bkt0Var;
        Object obj2 = bkt0Var2.d;
        int i2 = bkt0Var2.f;
        kt91 kt91Var2 = this.b;
        Serializable serializable2 = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                String str6 = bkt0Var2.c;
                tv80Var2 = bkt0Var2.b;
                xjt0 xjt0Var4 = bkt0Var2.a;
                hm5.M(obj2);
                str2 = str6;
                xjt0Var3 = xjt0Var4;
                obj = obj2;
            } else if (i2 == 2) {
                str4 = bkt0Var2.c;
                tv80Var2 = bkt0Var2.b;
                xjt0Var2 = bkt0Var2.a;
                hm5.M(obj2);
                Object obj3 = ((e331) obj2).a;
                kt91Var = kt91Var2;
                serializable = serializable2;
                str5 = xjt0Var2.a;
                j = (xjt0Var2.d + xjt0Var2.c) / 1000;
                bkt0Var2.a = null;
                bkt0Var2.b = tv80Var2;
                bkt0Var2.c = str4;
                bkt0Var2.f = 3;
                if (this.e.a(j, str5, bkt0Var2) == serializable) {
                    return serializable;
                }
            } else {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = bkt0Var2.c;
                tv80Var2 = bkt0Var2.b;
                hm5.M(obj2);
                kt91Var = kt91Var2;
            }
            this.i.b(tv80Var2);
            kt91Var.k(new er91((fs91) null, str4, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            return rih1.a;
        }
        hm5.M(obj2);
        wjt0 wjt0Var = yjt0Var.b;
        vjt0 vjt0Var = wjt0Var instanceof vjt0 ? (vjt0) wjt0Var : null;
        if (vjt0Var != null && (str3 = vjt0Var.a) != null) {
            kt91Var2.k(new er91((fs91) null, str3, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        String str7 = xjt0Var3.a;
        bkt0Var2.a = xjt0Var3;
        tv80Var2 = tv80Var;
        bkt0Var2.b = tv80Var2;
        bkt0Var2.c = str;
        bkt0Var2.f = 1;
        Object objF = this.t.f(str7, bkt0Var2);
        if (objF == serializable2) {
            return serializable2;
        }
        obj = objF;
        str2 = str;
        if (u890.j((e540) obj, d540.a)) {
            bq11 bq11Var = (bq11) this.Y.getValue();
            String str8 = xjt0Var3.a;
            String str9 = xjt0Var3.b;
            List listSingletonList = Collections.singletonList(str9);
            long j2 = xjt0Var3.c;
            String str10 = (tv80Var2 == null || (ou80Var = tv80Var2.a) == null) ? null : ou80Var.a;
            Long l = new Long(j2);
            bkt0Var2.a = xjt0Var3;
            bkt0Var2.b = tv80Var2;
            bkt0Var2.c = str2;
            bkt0Var2.f = 2;
            kt91Var = kt91Var2;
            serializable = serializable2;
            if (bq11.c(bq11Var, str8, str9, listSingletonList, str10, l, (wp11) null, false, bkt0Var2, 208) == serializable) {
                return serializable;
            }
            xjt0Var2 = xjt0Var3;
            str4 = str2;
            str5 = xjt0Var2.a;
            j = (xjt0Var2.d + xjt0Var2.c) / 1000;
            bkt0Var2.a = null;
            bkt0Var2.b = tv80Var2;
            bkt0Var2.c = str4;
            bkt0Var2.f = 3;
            if (this.e.a(j, str5, bkt0Var2) == serializable) {
                return serializable;
            }
            this.i.b(tv80Var2);
            kt91Var.k(new er91((fs91) null, str4, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.O0;
    }

    public final f4r getData() {
        return this.N0;
    }
}
