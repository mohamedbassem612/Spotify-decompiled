package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uhh implements tyq {
    public final psw N0;
    public final o3r X;
    public final js20 Y;
    public final eih1 Z;
    public final Context a;
    public final k0a1 b;
    public final f1n0 c;
    public final i4q d;
    public final eg0 e;
    public final oi f;
    public final kt91 g;
    public final h4q h;
    public final d0r i;
    public final ConcurrentHashMap.KeySetView t = ConcurrentHashMap.newKeySet();

    public uhh(Context context, k0a1 k0a1Var, f1n0 f1n0Var, i4q i4qVar, eg0 eg0Var, oi oiVar, kt91 kt91Var, h4q h4qVar, d0r d0rVar) {
        this.a = context;
        this.b = k0a1Var;
        this.c = f1n0Var;
        this.d = i4qVar;
        this.e = eg0Var;
        this.f = oiVar;
        this.g = kt91Var;
        this.h = h4qVar;
        this.i = d0rVar;
        new lhc();
        jd11 jd11Var = rc11.a;
        this.X = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 2, cgh.Y, new j4r(cgh.g), cgh.Z), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, cgh.N0, new j4r(cgh.h), cgh.O0), new l4r(hvm.a, 2, cgh.P0, new j4r(cgh.i), cgh.Q0), kna.Q0);
        this.Y = x3p1.n(new phh(this, (byte) 0), new phh(this, (byte) 1), new j1(2, this, uhh.class, "deriveState", "deriveState(Lcom/spotify/socialinteractivity/elements/commentrow/api/CommentRowElement$Props;Lcom/spotify/socialinteractivity/elements/commentrow/impl/CommentRowElementImpl$LoadedData;)Lcom/spotify/socialinteractivity/elements/commentrow/api/CommentRowElement$State;", 0, (byte) 18), (o8n) null, new phh(this, (byte) 2), 8);
        this.Z = new eih1();
        j2i j2iVar = new j2i(-607579586, new rxg(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.N0;
    }

    public final d0r e() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final Object f(khh khhVar, onm onmVar) {
        qhh qhhVar;
        if (onmVar instanceof qhh) {
            qhhVar = (qhh) onmVar;
            int i = qhhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qhhVar.d = i - Integer.MIN_VALUE;
            } else {
                qhhVar = new qhh(this, onmVar);
            }
        } else {
            qhhVar = new qhh(this, onmVar);
        }
        Object obj = qhhVar.b;
        int i2 = qhhVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                lvm lvmVar = khhVar.a;
                mqm mqmVar = new mqm(lvmVar, new lqm(Collections.singletonList(ovm.b), (List) null, (qle1) null, 6));
                d0r d0rVar = this.i;
                hvm hvmVar = hvm.a;
                qrm qrmVar = new qrm(lvmVar, khhVar.b);
                qhhVar.a = khhVar;
                qhhVar.d = 1;
                d0rVar.getClass();
                Object objD = d0r.d(d0rVar, hvmVar, mqmVar, qrmVar, qhhVar);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                khhVar = qhhVar.a;
                hm5.M(obj);
            }
            kt91 kt91Var = this.g;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954086});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131954086, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            rhh rhhVar = new rhh(this, khhVar, null, (byte) 0);
            oi oiVar = this.f;
            ((jjz) oiVar.d).a(new xiz(fjz.b, (!oiVar.b || message == null) ? yiz.c : new yiz(message), ajz.d), new f2t(oiVar, rhhVar, (byte) 2), u6t.b);
        }
        return rih1.a;
    }

    public final mhh g(khh khhVar, nhh nhhVar) {
        String strS;
        String strB;
        String strA;
        mq70 mq70Var;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        for (som somVar : nhhVar.c) {
            num numVar = somVar.c;
            num numVar2 = numVar instanceof num ? numVar : null;
            if (numVar2 != null) {
                String str5 = numVar2.c;
                linkedHashMap.put(str5, Integer.valueOf(((Number) linkedHashMap.getOrDefault(str5, 0)).intValue() + 1));
                if (u890.j(somVar.d, khhVar.f)) {
                    str4 = somVar.a;
                    str3 = str5;
                }
            }
        }
        int iC1 = o7h.c1(linkedHashMap.values());
        jo70 jo70Var = nhhVar.a;
        if (jo70Var == null || (strS = jo70Var.a) == null) {
            String str6 = khhVar.c;
            Set set = s4b1.f;
            strS = uic.x(str6).s();
            if (strS == null) {
                strS = "";
            }
        }
        String str7 = strS;
        xkk1 xkk1Var = nhhVar.b;
        if (xkk1Var != null && (mq70Var = xkk1Var.a) != null) {
            up70 up70VarA = mq70Var.a(vp70.b);
            if (up70VarA == null || (str = up70VarA.a.a) == null) {
                up70 up70VarA2 = mq70Var.a(vp70.c);
                if (up70VarA2 != null) {
                    str2 = up70VarA2.a.a;
                }
            } else {
                str2 = str;
            }
        }
        String str8 = str2;
        String str9 = khhVar.b;
        String str10 = khhVar.d;
        Long l = khhVar.e;
        k0a1 k0a1Var = this.b;
        Resources resources = k0a1Var.b;
        if (l == null) {
            strB = resources.getString(2131962640);
        } else {
            long jB = k0a1Var.a.b() - l.longValue();
            if (jB < 0) {
                jB = 0;
            }
            long j = jB / 1000;
            if (j < 60) {
                strB = resources.getString(2131962640);
            } else if (j < 3600) {
                strB = k0a1Var.b(2131820902, j / 60);
            } else if (j < 86400) {
                strB = k0a1Var.b(2131820901, j / 3600);
            } else if (j < 604800) {
                strB = k0a1Var.b(2131820900, j / 86400);
            } else if (j < 2592000) {
                strB = k0a1Var.b(2131820904, j / 604800);
            } else {
                strB = j < 31536000 ? k0a1Var.b(2131820903, j / 2592000) : k0a1Var.b(2131820905, j / 31536000);
            }
        }
        String str11 = strB;
        int i = khhVar.h;
        List listD1 = o7h.d1(o7h.a1(linkedHashMap.entrySet(), new xvd(new p0d((byte) 12), (byte) 2)), 3);
        ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        c380 c380VarA = mqo1.A(arrayList);
        if (iC1 < 1000) {
            strA = String.valueOf(iC1);
        } else if (iC1 < 1000000) {
            double dS = ((double) jch0.S((((double) iC1) / 1000.0d) * 10.0d)) / 10.0d;
            strA = dS >= 1000.0d ? k0a1Var.a(dS / 1000.0d, 2131962638) : k0a1Var.a(dS, 2131962639);
        } else {
            strA = k0a1Var.a(((double) jch0.S((((double) iC1) / 1000000.0d) * 10.0d)) / 10.0d, 2131962638);
        }
        return new mhh(str9, str7, str8, str10, str11, new lhh(c380VarA, iC1, strA, str3, str4), i);
    }

    public final mqw getBehavior() {
        return this.Y;
    }

    public final f4r getData() {
        return this.X;
    }

    public final Object h(String str, tqw tqwVar, u08 u08Var) {
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        Object objD = f1n0.d(this.c, new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null), u08Var);
        return objD == d9n.a ? objD : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(khh khhVar, mhh mhhVar, String str, onm onmVar) {
        shh shhVar;
        prm qrmVar;
        if (onmVar instanceof shh) {
            shhVar = (shh) onmVar;
            int i = shhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shhVar.d = i - Integer.MIN_VALUE;
            } else {
                shhVar = new shh(this, onmVar);
            }
        } else {
            shhVar = new shh(this, onmVar);
        }
        Object obj = shhVar.b;
        int i2 = shhVar.d;
        rih1 rih1Var = rih1.a;
        ConcurrentHashMap.KeySetView keySetView = this.t;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    if (!keySetView.add(khhVar.b)) {
                        return rih1Var;
                    }
                    kvm kvmVar = new kvm(khhVar.b);
                    mqm mqmVar = new mqm(kvmVar, new lqm(Collections.singletonList(ovm.c), (List) null, (qle1) null, 6));
                    lhh lhhVar = mhhVar.f;
                    String str2 = lhhVar.e;
                    if (str2 == null) {
                        qrmVar = new prm(kvmVar, new num(str));
                    } else {
                        qrmVar = u890.j(lhhVar.d, str) ? new qrm(kvmVar, str2) : new rrm(kvmVar, str2, new num(str));
                    }
                    d0r d0rVar = this.i;
                    hvm hvmVar = hvm.a;
                    shhVar.a = khhVar;
                    shhVar.d = 1;
                    d0rVar.getClass();
                    Object objD = d0r.d(d0rVar, hvmVar, mqmVar, qrmVar, shhVar);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    khhVar = shhVar.a;
                    hm5.M(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
            }
            keySetView.remove(khhVar.b);
            return rih1Var;
        } catch (Throwable th) {
            keySetView.remove(khhVar.b);
            throw th;
        }
    }
}
