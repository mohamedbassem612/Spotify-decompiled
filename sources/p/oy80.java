package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oy80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bz80 a;

    public oy80(bz80 bz80Var) {
        this.a = bz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.ox80] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ny80 ny80Var;
        ou80 ou80Var;
        if (onmVar instanceof ny80) {
            ny80Var = (ny80) onmVar;
            int i = ny80Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny80Var.b = i - Integer.MIN_VALUE;
            } else {
                ny80Var = new ny80(this, onmVar);
            }
        } else {
            ny80Var = new ny80(this, onmVar);
        }
        Object objA = ny80Var.a;
        int i2 = ny80Var.b;
        bz80 bz80Var = this.a;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ox80 ox80Var = (ox80) obj;
                joe joeVar = bz80Var.c;
                tv80 tv80Var = ox80Var.b;
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str = ou80Var.a;
                }
                ny80Var.d = ox80Var;
                ny80Var.b = 1;
                objA = joeVar.a(str, ny80Var);
                d9n d9nVar = d9n.a;
                obj = ox80Var;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ox80 ox80Var2 = ny80Var.d;
                hm5.M(objA);
                obj = ox80Var2;
            }
            noe noeVar = (noe) objA;
            if (!(noeVar instanceof loe)) {
                tv80 tv80VarA = noeVar.a(obj.b);
                Bundle bundle = new Bundle();
                bundle.putString("martini-source-surface-uri", "spotify:home");
                String str2 = obj.a;
                if (str2 != null) {
                    bundle.putString("martini-prompt", str2);
                    bundle.putBoolean("martini-open-with-keyboard", false);
                    bundle.putBoolean("martini-resume-playback-after-tts", obj.c);
                } else {
                    bundle.putBoolean("martini-open-with-keyboard", true);
                }
                lo60 lo60Var = bz80Var.a;
                p1f0 p1f0VarW = rrn1.w(bz80.Q0);
                p1f0VarW.B(tv80VarA);
                lo60Var.i(p1f0VarW.h(), bundle);
            }
        } catch (Exception e) {
            n57.t("Effect handling failed for " + obj, e);
        }
        return rih1.a;
    }
}
