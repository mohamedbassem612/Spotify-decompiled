package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lo2 {
    public final hil1 a;
    public final uu00 b;
    public final c9n c;
    public final bpb1 d;
    public final xe01 e;
    public volatile faa0 f;

    public lo2(hil1 hil1Var, uu00 uu00Var, c9n c9nVar) {
        this.a = hil1Var;
        this.b = uu00Var;
        this.c = c9nVar;
        bpb1 bpb1VarB = gio1.b(qo2.a);
        this.d = bpb1VarB;
        this.e = d5p1.h(bpb1VarB);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(faa0 faa0Var, w18 w18Var, lnm lnmVar) throws NoWhenBranchMatchedException {
        ho2 ho2Var;
        rih1 rih1Var = rih1.a;
        if (lnmVar instanceof ho2) {
            ho2Var = (ho2) lnmVar;
            int i = ho2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho2Var.e = i - Integer.MIN_VALUE;
            } else {
                ho2Var = new ho2(this, lnmVar);
            }
        } else {
            ho2Var = new ho2(this, lnmVar);
        }
        Object objC = ho2Var.c;
        d9n d9nVar = d9n.a;
        int i2 = ho2Var.e;
        if (i2 == 0) {
            hm5.M(objC);
            if (this.f == faa0Var) {
                if (u890.j(w18Var, t18.a)) {
                    this.d.m((Object) null, ro2.a);
                    return rih1Var;
                }
                if (u890.j(w18Var, r18.a)) {
                    this.d.m((Object) null, oo2.a);
                    return rih1Var;
                }
                if (!(w18Var instanceof u18)) {
                    if (w18Var instanceof v18) {
                        Logger.g("Audio recognition returned no match", new Object[0]);
                        this.d.m((Object) null, new uo2(((v18) w18Var).a()));
                        return rih1Var;
                    }
                    if (!(w18Var instanceof s18)) {
                        eg.o();
                        return null;
                    }
                    Logger.d("Audio recognition failed: %s", ((s18) w18Var).a());
                    this.d.m((Object) null, po2.a);
                    return rih1Var;
                }
                u18 u18Var = (u18) w18Var;
                Logger.g("Audio recognition matched: %s", u18Var.b());
                String strB = u18Var.b();
                ho2Var.a = faa0Var;
                ho2Var.b = u18Var;
                ho2Var.e = 1;
                objC = c(strB, ho2Var);
                if (objC == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w18Var = ho2Var.b;
        faa0Var = ho2Var.a;
        hm5.M(objC);
        kw01 kw01Var = (kw01) objC;
        if (this.f == faa0Var) {
            u18 u18Var2 = (u18) w18Var;
            this.d.m((Object) null, new so2(u18Var2.b(), u18Var2.a(), kw01Var));
        }
        return rih1Var;
    }

    public final void b() {
        faa0 faa0Var = this.f;
        this.f = null;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.d.m((Object) null, to2.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        io2 io2Var;
        jo70 jo70Var;
        List listJ0;
        List list;
        String str2;
        if (onmVar instanceof io2) {
            io2Var = (io2) onmVar;
            int i = io2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                io2Var.d = i - Integer.MIN_VALUE;
            } else {
                io2Var = new io2(this, onmVar);
            }
        } else {
            io2Var = new io2(this, onmVar);
        }
        Object objO = io2Var.b;
        int i2 = io2Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                hi2 hi2Var = new hi2(this, str, (lnm) null, (byte) 1);
                io2Var.a = str;
                io2Var.d = 1;
                objO = rc2.O(3000L, hi2Var, io2Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = io2Var.a;
                hm5.M(objO);
            }
            jo70Var = (jo70) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to resolve audio recognition metadata for URI: %s", str);
            jo70Var = null;
        }
        String string = (jo70Var == null || (str2 = jo70Var.a) == null) ? null : ihc1.e1(str2).toString();
        if (string == null) {
            string = "";
        }
        if (jo70Var == null || (list = jo70Var.d) == null) {
            listJ0 = null;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ihc1.e1(((ho70) it.next()).a).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            listJ0 = o7h.j0(arrayList2);
        }
        if (listJ0 == null) {
            listJ0 = z6x.a;
        }
        if (string.length() != 0 && !listJ0.isEmpty()) {
            return new kw01(string, listJ0);
        }
        Logger.g("Audio recognition metadata unavailable for URI: %s", str);
        return null;
    }
}
