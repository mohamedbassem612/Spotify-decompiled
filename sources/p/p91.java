package p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aa1 a;

    public p91(aa1 aa1Var) {
        this.a = aa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        o91 o91Var;
        y6b1 m231Var;
        mmr0 mmr0Var;
        if (onmVar instanceof o91) {
            o91Var = (o91) onmVar;
            int i = o91Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                o91Var.b = i - Integer.MIN_VALUE;
            } else {
                o91Var = new o91(this, onmVar);
            }
        } else {
            o91Var = new o91(this, onmVar);
        }
        o91 o91Var2 = o91Var;
        Object obj2 = o91Var2.a;
        int i2 = o91Var2.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        p81 p81Var = (p81) obj;
        d91 d91Var = this.a.a;
        String str = p81Var.c;
        g4a g4aVar = p81Var.d;
        g4a g4aVar2 = p81Var.e;
        yu3 yu3Var = d91Var.f;
        Resources resources = (Resources) yu3Var.b;
        g4a g4aVar3 = g4a.b;
        mr20 m441Var = r6x.a;
        if (g4aVar != g4aVar3) {
            try {
                m231Var = new y6b1(str, false);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            y6b1 y6b1Var = m231Var instanceof m231 ? null : m231Var;
            if (y6b1Var != null) {
                v6b1 v6b1Var = y6b1Var.c;
                v6b1 v6b1Var2 = v6b1.d;
                u7l0 u7l0Var = u7l0.ADD_TO_APPROVED;
                g4a g4aVar4 = g4a.d;
                if (v6b1Var == v6b1Var2 && g4aVar == g4aVar4) {
                    mmr0Var = new mmr0(resources.getString(2131951894), u7l0Var);
                } else {
                    u7l0 u7l0Var2 = u7l0.ADD_TO_BLOCKED;
                    g4a g4aVar5 = g4a.c;
                    if (v6b1Var == v6b1Var2 && g4aVar == g4aVar5) {
                        mmr0Var = new mmr0(resources.getString(2131951895), u7l0Var2);
                    } else {
                        v6b1 v6b1Var3 = v6b1.t;
                        if (v6b1Var == v6b1Var3 && g4aVar == g4aVar4) {
                            mmr0Var = new mmr0(resources.getString(2131951896), u7l0Var);
                        } else if (v6b1Var == v6b1Var3 && g4aVar == g4aVar5) {
                            mmr0Var = new mmr0(resources.getString(2131951897), u7l0Var2);
                        }
                    }
                }
                m441Var = new m441(new xd1(yu3Var, str, (u7l0) mmr0Var.b, (String) mmr0Var.a, (lnm) null));
            }
        }
        k91 k91Var = new k91(r261Var, (byte) 2);
        o91Var2.b = 1;
        Object objCollect = m441Var.collect(new h50((byte) 1, str, g4aVar2, k91Var), o91Var2);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
