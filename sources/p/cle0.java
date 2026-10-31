package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cle0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ im01 a;

    public cle0(im01 im01Var) {
        this.a = im01Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: Exception -> 0x00af, LOOP:0: B:35:0x008f->B:37:0x0095, LOOP_END, TryCatch #0 {Exception -> 0x00af, blocks: (B:18:0x003c, B:34:0x007e, B:35:0x008f, B:37:0x0095, B:38:0x00a8), top: B:47:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ble0 ble0Var;
        int i;
        r261 r261Var2;
        zle0 zle0Var;
        ArrayList arrayList;
        l0x0 l0x0Var = this.a.a;
        if (onmVar instanceof ble0) {
            ble0Var = (ble0) onmVar;
            int i2 = ble0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ble0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                ble0Var = new ble0(this, onmVar);
            }
        } else {
            ble0Var = new ble0(this, onmVar);
        }
        Object objM = ble0Var.a;
        int i3 = ble0Var.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(objM);
                int i4 = ((xje0) obj).c;
                ble0Var.d = r261Var;
                i = 0;
                ble0Var.e = 0;
                ble0Var.b = 1;
                fns fnsVar = igu.a;
                Object objY = fn31.Y(b3s.c, new cy9(l0x0Var, i4, (lnm) null, (byte) 12), ble0Var);
                if (objY != obj2) {
                    objY = rih1Var;
                }
                if (objY != obj2) {
                    objY = rih1Var;
                }
                if (objY != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(objM);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r261Var2 = ble0Var.d;
                try {
                    hm5.M(objM);
                    Iterable<fm01> iterable = (Iterable) objM;
                    arrayList = new ArrayList(q7h.U(iterable, 10));
                    for (fm01 fm01Var : iterable) {
                        arrayList.add(new jj40(fm01Var.b, fm01Var.a));
                    }
                    zle0Var = new zle0(arrayList);
                } catch (Exception unused) {
                    zle0Var = new zle0(z6x.a);
                }
                ble0Var.d = null;
                ble0Var.b = 3;
                if (r261Var2.b(zle0Var, ble0Var) != obj2) {
                    return obj2;
                }
                return rih1Var;
            }
            i = ble0Var.e;
            r261Var = ble0Var.d;
            hm5.M(objM);
            ble0Var.d = r261Var;
            ble0Var.e = i;
            ble0Var.b = 2;
            objM = l0x0Var.m(ble0Var);
            if (objM != obj2) {
                r261Var2 = r261Var;
                Iterable<fm01> iterable2 = (Iterable) objM;
                arrayList = new ArrayList(q7h.U(iterable2, 10));
                while (r9.hasNext()) {
                    arrayList.add(new jj40(fm01Var.b, fm01Var.a));
                }
                zle0Var = new zle0(arrayList);
                ble0Var.d = null;
                ble0Var.b = 3;
                if (r261Var2.b(zle0Var, ble0Var) != obj2) {
                    return rih1Var;
                }
            }
        } catch (Exception unused2) {
            r261Var2 = r261Var;
            zle0Var = new zle0(z6x.a);
        }
        return obj2;
    }
}
