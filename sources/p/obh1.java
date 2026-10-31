package p;

import android.view.View;
import com.spotify.promptedplaylists.ucpapiimpl.RemovePromptPayload;
import com.spotify.promptedplaylists.ucpapiimpl.TriggerUpdatePayload;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class obh1 {
    public final String a;
    public final ffe1 b;
    public final sjf1 c;
    public final kt91 d;
    public final hrr0 e;
    public final hrr0 f;
    public final hrr0 g;
    public final hrr0 h;
    public final hrr0 i = v8r.q((Object) null);
    public final hrr0 j = v8r.q(w7x.a);

    public obh1(yah1 yah1Var, String str, ffe1 ffe1Var, sjf1 sjf1Var, kt91 kt91Var) {
        this.a = str;
        this.b = ffe1Var;
        this.c = sjf1Var;
        this.d = kt91Var;
        this.e = v8r.q(yah1Var.a);
        this.f = v8r.q(yah1Var.b);
        this.g = v8r.q(Boolean.valueOf(yah1Var.c));
        this.h = v8r.q(yah1Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lbh1 lbh1Var, onm onmVar) throws Throwable {
        mbh1 mbh1Var;
        lbh1 lbh1Var2;
        Throwable th;
        obh1 obh1Var;
        if (onmVar instanceof mbh1) {
            mbh1Var = (mbh1) onmVar;
            int i = mbh1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbh1Var.e = i - Integer.MIN_VALUE;
            } else {
                mbh1Var = new mbh1(this, onmVar);
            }
        } else {
            mbh1Var = new mbh1(this, onmVar);
        }
        Object objR = mbh1Var.c;
        int i2 = mbh1Var.e;
        hrr0 hrr0Var = this.j;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objR);
            if (((Boolean) this.g.getValue()).booleanValue() || !c().a.isEmpty()) {
                return rih1Var;
            }
            Set setB = b();
            String str = lbh1Var.a;
            if (setB.contains(str)) {
                return rih1Var;
            }
            hrr0Var.setValue(dm61.x0(str, b()));
            try {
                ffe1 ffe1Var = this.b;
                String str2 = this.a;
                mbh1Var.a = lbh1Var;
                mbh1Var.b = this;
                mbh1Var.e = 1;
                va21 va21VarN = RemovePromptPayload.n();
                va21VarN.n(str);
                objR = ffe1Var.r(str2, "REMOVE_PROMPT", va21VarN.build(), mbh1Var);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
                lbh1Var2 = lbh1Var;
                obh1Var = this;
            } catch (Throwable th2) {
                lbh1Var2 = lbh1Var;
                th = th2;
                hrr0Var.setValue(dm61.u0(lbh1Var2.a, b()));
                throw th;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obh1Var = mbh1Var.b;
            lbh1Var2 = mbh1Var.a;
            try {
                hm5.M(objR);
            } catch (Throwable th3) {
                th = th3;
                hrr0Var.setValue(dm61.u0(lbh1Var2.a, b()));
                throw th;
            }
        }
        obh1Var.d((nm81) objR, new mah1(this, lbh1Var2, (byte) 3));
        hrr0Var.setValue(dm61.u0(lbh1Var2.a, b()));
        return rih1Var;
    }

    public final Set b() {
        return (Set) this.j.getValue();
    }

    public final xj61 c() {
        xj61 xj61Var = new xj61();
        for (lbh1 lbh1Var : (List) this.e.getValue()) {
            if (lbh1Var.f) {
                xj61Var.add(lbh1Var.a);
            }
        }
        String str = (String) this.i.getValue();
        if (str != null) {
            xj61Var.add(str);
        }
        return cwl1.j(xj61Var);
    }

    public final void d(nm81 nm81Var, Function0 function0) {
        if (u890.j(nm81Var, mm81.a)) {
            function0.invoke();
            return;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963457});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.d.k(new er91((fs91) null, "", 2131963457, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(lbh1 lbh1Var, onm onmVar) {
        nbh1 nbh1Var;
        if (onmVar instanceof nbh1) {
            nbh1Var = (nbh1) onmVar;
            int i = nbh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbh1Var.c = i - Integer.MIN_VALUE;
            } else {
                nbh1Var = new nbh1(this, onmVar);
            }
        } else {
            nbh1Var = new nbh1(this, onmVar);
        }
        Object objR = nbh1Var.a;
        int i2 = nbh1Var.c;
        hrr0 hrr0Var = this.i;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objR);
            if (!((Boolean) this.g.getValue()).booleanValue() && c().a.isEmpty()) {
                Set setB = b();
                String str = lbh1Var.a;
                if (!setB.contains(str)) {
                    hrr0Var.setValue(str);
                    nbh1Var.c = 1;
                    rvg1 rvg1VarN = TriggerUpdatePayload.n();
                    rvg1VarN.n(str);
                    objR = this.b.r(this.a, "TRIGGER_UPDATE", rvg1VarN.build(), nbh1Var);
                    d9n d9nVar = d9n.a;
                    if (objR == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objR);
        nm81 nm81Var = (nm81) objR;
        d(nm81Var, this.c);
        if (!u890.j(nm81Var, mm81.a)) {
            hrr0Var.setValue((Object) null);
        }
        return rih1Var;
    }
}
