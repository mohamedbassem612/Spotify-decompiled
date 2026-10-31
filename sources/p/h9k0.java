package p;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h9k0 {
    public final f1n0 a;
    public final uo5 b;
    public final yfc0 c;
    public final ov20 d;

    public h9k0(f1n0 f1n0Var, uo5 uo5Var, yfc0 yfc0Var, ov20 ov20Var) {
        this.a = f1n0Var;
        this.b = uo5Var;
        this.c = yfc0Var;
        this.d = ov20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, a9k0 a9k0Var, onm onmVar) {
        e9k0 e9k0Var;
        if (onmVar instanceof e9k0) {
            e9k0Var = (e9k0) onmVar;
            int i = e9k0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9k0Var.e = i - Integer.MIN_VALUE;
            } else {
                e9k0Var = new e9k0(this, onmVar);
            }
        } else {
            e9k0Var = new e9k0(this, onmVar);
        }
        Object objB = e9k0Var.c;
        int i2 = e9k0Var.e;
        if (i2 == 0) {
            hm5.M(objB);
            e9k0Var.a = str;
            e9k0Var.b = a9k0Var;
            e9k0Var.e = 1;
            objB = b(a9k0Var, e9k0Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a9k0Var = e9k0Var.b;
            str = e9k0Var.a;
            hm5.M(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            return Boolean.FALSE;
        }
        d9k0 d9k0VarV = a9k0Var.v();
        if (!(d9k0VarV instanceof b9k0)) {
            if (!(d9k0VarV instanceof c9k0)) {
                eg.o();
                return null;
            }
            w7x w7xVar = (Set) this.b.H().a.get(str);
            if (w7xVar == null) {
                w7xVar = w7x.a;
            }
            if (w7xVar.contains(((c9k0) d9k0VarV).a)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(a9k0 a9k0Var, onm onmVar) {
        f9k0 f9k0Var;
        if (onmVar instanceof f9k0) {
            f9k0Var = (f9k0) onmVar;
            int i = f9k0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9k0Var.c = i - Integer.MIN_VALUE;
            } else {
                f9k0Var = new f9k0(this, onmVar);
            }
        } else {
            f9k0Var = new f9k0(this, onmVar);
        }
        Object objI = f9k0Var.a;
        int i2 = f9k0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            if (!(a9k0Var instanceof x8k0)) {
                return Boolean.FALSE;
            }
            ezc ezcVar = this.d.a;
            f9k0Var.c = 1;
            objI = b5p1.i(ezcVar, f9k0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        int iOrdinal = this.c.d((Map) objI).ordinal();
        if (iOrdinal == 0) {
            z = false;
        } else if (iOrdinal != 1 && iOrdinal != 2) {
            eg.o();
            return null;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(String str, a9k0 a9k0Var, tv80 tv80Var, onm onmVar) {
        g9k0 g9k0Var;
        tv80 tv80Var2;
        Object objA;
        String str2 = str;
        a9k0 a9k0Var2 = a9k0Var;
        if (onmVar instanceof g9k0) {
            g9k0Var = (g9k0) onmVar;
            int i = g9k0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9k0Var.f = i - Integer.MIN_VALUE;
            } else {
                g9k0Var = new g9k0(this, onmVar);
            }
        } else {
            g9k0Var = new g9k0(this, onmVar);
        }
        Object obj = g9k0Var.d;
        int i2 = g9k0Var.f;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            g9k0Var.a = str2;
            g9k0Var.b = a9k0Var2;
            tv80Var2 = tv80Var;
            g9k0Var.c = tv80Var2;
            g9k0Var.f = 1;
            objA = a(str2, a9k0Var2, g9k0Var);
            if (objA != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80 tv80Var3 = g9k0Var.c;
        a9k0Var2 = g9k0Var.b;
        String str3 = g9k0Var.a;
        hm5.M(obj);
        tv80Var2 = tv80Var3;
        str2 = str3;
        objA = obj;
        if (((Boolean) objA).booleanValue()) {
            d9k0 d9k0VarV = a9k0Var2.v();
            if (d9k0VarV instanceof c9k0) {
                String str4 = ((c9k0) d9k0VarV).a;
                uo5 uo5Var = this.b;
                hma1 hma1VarEdit = ((dma1) uo5Var.b).edit();
                bma1 bma1Var = ufj0.a;
                nfa0 nfa0Var = (nfa0) uo5Var.c;
                nma0 nma0VarSerializer = tfj0.Companion.serializer();
                tfj0 tfj0VarH = uo5Var.H();
                Map map = tfj0VarH.a;
                Object obj3 = map.get(str2);
                if (obj3 == null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    map.put(str2, linkedHashSet);
                    obj3 = linkedHashSet;
                }
                ((Set) obj3).add(str4);
                hma1VarEdit.d(bma1Var, nfa0Var.b(nma0VarSerializer, tfj0VarH));
                hma1VarEdit.g();
            }
            Bundle bundle = new Bundle();
            bundle.putString("list-uri", str2);
            bundle.putParcelable("bottom-sheet", a9k0Var2);
            g9k0Var.a = null;
            g9k0Var.b = null;
            g9k0Var.c = null;
            g9k0Var.f = 2;
            if (this.a.e("spotify:internal:playlist-overlap-messaging", tv80Var2, bundle, g9k0Var) == obj2) {
                return obj2;
            }
        }
        return rih1Var;
    }
}
