package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bhk {
    public final zpk a;
    public final i4q b;
    public final boolean c;
    public final dg8 d;
    public final uu00 e;
    public final kt91 f;
    public final yqg g;
    public final iac0 h;
    public final q8n i;
    public final hrr0 j = v8r.q((Object) null);

    public bhk(zpk zpkVar, i4q i4qVar, boolean z, dg8 dg8Var, uu00 uu00Var, kt91 kt91Var, yqg yqgVar, iac0 iac0Var, q8n q8nVar) {
        this.a = zpkVar;
        this.b = i4qVar;
        this.c = z;
        this.d = dg8Var;
        this.e = uu00Var;
        this.f = kt91Var;
        this.g = yqgVar;
        this.h = iac0Var;
        this.i = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        zgk zgkVar;
        Object next;
        Object next2;
        if (onmVar instanceof zgk) {
            zgkVar = (zgk) onmVar;
            int i = zgkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgkVar.d = i - Integer.MIN_VALUE;
            } else {
                zgkVar = new zgk(this, onmVar);
            }
        } else {
            zgkVar = new zgk(this, onmVar);
        }
        Object objK = zgkVar.b;
        int i2 = zgkVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                ld2 ld2Var = new ld2(o4p1.r(yoi1.g(this.e.b(new oi("concert-entity-page", false, new kak(str, (byte) 4)))), this.i), str, (byte) 5);
                ytw0 ytw0Var = jfv.b;
                huz huzVarW = r4p1.w(ld2Var, fdg1.k0(1000, ngv.d));
                zgkVar.a = str;
                zgkVar.d = 1;
                objK = b5p1.k(huzVarW, zgkVar);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = zgkVar.a;
                hm5.M(objK);
            }
            String str2 = str;
            uv00 uv00Var = (uv00) objK;
            jek jekVar = uv00Var != null ? (jek) uv00Var.a(jek.class, str2).b : null;
            eek eekVar = uv00Var != null ? (eek) uv00Var.a(eek.class, str2).b : null;
            if (((jekVar != null ? jekVar.a : null) instanceof z6d) && eekVar != null) {
                ArrayList arrayList = eekVar.a;
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((h7d) next).a.equals("decline_offer_title"));
                h7d h7dVar = (h7d) next;
                if (h7dVar != null) {
                    String str3 = h7dVar.b;
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!((h7d) next2).a.equals("decline_offer_subtitle"));
                    h7d h7dVar2 = (h7d) next2;
                    if (h7dVar2 != null) {
                        return e6p1.h(new f80(this, str2, str3, h7dVar2.b, (byte) 24));
                    }
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    public final void b(int i, List list) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        Integer numValueOf = Integer.valueOf(i);
        n57.k(i != 0, "Invalid resource ID provided: %s", new Object[]{numValueOf});
        this.f.k(new er91((fs91) null, "", numValueOf, (String) null, 2131959155, new cg1(this, list, (byte) 22), (cvr) null, (xq91) null, false));
    }
}
