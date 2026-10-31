package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pye implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public pye(o0f o0fVar) {
        this.a = o0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        oye oyeVar;
        swe sweVar;
        Object objA;
        int i;
        if (onmVar instanceof oye) {
            oyeVar = (oye) onmVar;
            int i2 = oyeVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oyeVar.b = i2 - Integer.MIN_VALUE;
            } else {
                oyeVar = new oye(this, onmVar);
            }
        } else {
            oyeVar = new oye(this, onmVar);
        }
        Object obj2 = oyeVar.a;
        int i3 = oyeVar.b;
        rih1 rih1Var = rih1.a;
        o0f o0fVar = this.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj2);
            sweVar = (swe) obj;
            a42 a42Var = o0fVar.j;
            String str = sweVar.a;
            oyeVar.d = sweVar;
            oyeVar.e = 0;
            oyeVar.b = 1;
            objA = a42Var.a(str, oyeVar);
            if (objA != d9nVar) {
                i = 0;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = oyeVar.e;
        sweVar = oyeVar.d;
        hm5.M(obj2);
        objA = ((e331) obj2).a;
        if (e331.a(objA) == null) {
            ((Boolean) objA).getClass();
            return rih1Var;
        }
        op71.x(oyeVar.getContext());
        rok0 rok0Var = o0fVar.c;
        String str2 = sweVar.a;
        oyeVar.d = null;
        oyeVar.e = i;
        oyeVar.b = 2;
        Object objY = fn31.Y((q8n) rok0Var.c, new hyg0(rok0Var, str2, (lnm) null, (byte) 20), oyeVar);
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? d9nVar : rih1Var;
    }
}
