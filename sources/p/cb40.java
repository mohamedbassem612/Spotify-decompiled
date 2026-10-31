package p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cb40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ib40 a;

    public cb40(ib40 ib40Var) {
        this.a = ib40Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        int i;
        za40 za40Var = (za40) obj;
        sp00 sp00Var = this.a.d;
        int i2 = za40Var.e;
        LinkedHashMap linkedHashMap = za40Var.f;
        Collection collectionValues = linkedHashMap.values();
        int i3 = 0;
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            i = 0;
        } else {
            Iterator it = collectionValues.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        Collection collectionValues2 = linkedHashMap.values();
        if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
            Iterator it2 = collectionValues2.iterator();
            while (it2.hasNext()) {
                if (!((Boolean) it2.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        int i4 = 2131956177;
        if (i <= 0 || i3 <= 0) {
            if (i == 1) {
                int iC = l1d.C(i2);
                if (iC == 0) {
                    i4 = 2131956176;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 2131956174;
                }
            } else if (i > 1) {
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    i4 = 2131956175;
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 2131956173;
                }
            } else if (i3 == 1) {
                int iC3 = l1d.C(i2);
                if (iC3 == 0) {
                    i4 = 2131956181;
                } else {
                    if (iC3 != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 2131956179;
                }
            } else if (i3 > 1) {
                int iC4 = l1d.C(i2);
                if (iC4 == 0) {
                    i4 = 2131956180;
                } else {
                    if (iC4 != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 2131956178;
                }
            }
        }
        Object objY = fn31.Y((q8n) sp00Var.d, new h210(sp00Var, ((Resources) sp00Var.b).getString(i4), (lnm) null, (byte) 23), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
