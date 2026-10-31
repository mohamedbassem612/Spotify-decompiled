package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iwy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ oud a;
    public final /* synthetic */ o4t b;
    public final /* synthetic */ ol71 c;
    public final /* synthetic */ oey d;
    public final /* synthetic */ t8r0 e;

    public iwy(lhc lhcVar, oud oudVar, o4t o4tVar, ol71 ol71Var, oey oeyVar, t8r0 t8r0Var) {
        this.a = oudVar;
        this.b = o4tVar;
        this.c = ol71Var;
        this.d = oeyVar;
        this.e = t8r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hwy hwyVar;
        bwy bwyVar;
        exy exyVar;
        int i;
        r261 r261Var2;
        bwy bwyVar2;
        r261 r261Var3;
        exy exyVar2;
        exy exyVar3;
        r261 r261Var4;
        d9n d9nVar;
        Object objA;
        r261 r261Var5;
        if (onmVar instanceof hwy) {
            hwyVar = (hwy) onmVar;
            int i2 = hwyVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hwyVar.b = i2 - Integer.MIN_VALUE;
            } else {
                hwyVar = new hwy(this, onmVar);
            }
        } else {
            hwyVar = new hwy(this, onmVar);
        }
        Object obj2 = hwyVar.a;
        int i3 = hwyVar.b;
        oud oudVar = this.a;
        d9n d9nVar2 = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = hwyVar.g;
                exyVar = hwyVar.f;
                bwyVar = hwyVar.e;
                r261Var2 = hwyVar.d;
                hm5.M(obj2);
            } else if (i3 == 2) {
                i = hwyVar.g;
                exyVar3 = hwyVar.f;
                bwyVar2 = hwyVar.e;
                r261Var4 = hwyVar.d;
                hm5.M(obj2);
                exyVar2 = exyVar3;
                r261Var3 = r261Var4;
                z771 z771Var = bwyVar2.c.a.b;
                d9nVar = d9nVar2;
                zvy zvyVar = new zvy(bwyVar2, z771Var, this.d, exyVar2, this.e, oudVar, null, (byte) 0);
                hwyVar.d = r261Var3;
                hwyVar.e = null;
                hwyVar.f = null;
                hwyVar.g = i;
                hwyVar.b = 3;
                objA = this.c.a("sharing.entity_share_format_loading", z771Var, zvyVar, hwyVar);
                if (objA == d9nVar) {
                    return d9nVar;
                }
                r261 r261Var6 = r261Var3;
                obj2 = objA;
                r261Var5 = r261Var6;
                hwyVar.d = null;
                hwyVar.e = null;
                hwyVar.f = null;
                hwyVar.b = 4;
                if (r261Var5.b(obj2, hwyVar) == d9nVar) {
                    return d9nVar;
                }
            } else if (i3 == 3) {
                r261Var5 = hwyVar.d;
                hm5.M(obj2);
                d9nVar = d9nVar2;
                hwyVar.d = null;
                hwyVar.e = null;
                hwyVar.f = null;
                hwyVar.b = 4;
                if (r261Var5.b(obj2, hwyVar) == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
            }
            return rih1.a;
        }
        hm5.M(obj2);
        bwyVar = (bwy) obj;
        exyVar = (exy) bwyVar.c.b();
        i = 0;
        if (exyVar.f == null) {
            gud gudVar = new gud(fj30.H(exyVar));
            r261Var2 = r261Var;
            hwyVar.d = r261Var2;
            hwyVar.e = bwyVar;
            hwyVar.f = exyVar;
            hwyVar.g = 0;
            hwyVar.b = 1;
            if (oudVar.a(gudVar, hwyVar) != d9nVar2) {
            }
            return d9nVar2;
        }
        r261Var2 = r261Var;
        if (bwyVar.e) {
            o4t o4tVar = this.b;
            long j = o4tVar.b;
            o4tVar.b = (long) (Math.pow(2.0d, o4tVar.a) * 200.0d);
            o4tVar.a++;
            hwyVar.d = r261Var2;
            hwyVar.e = bwyVar;
            hwyVar.f = exyVar;
            hwyVar.g = i;
            hwyVar.b = 2;
            if (hap1.i(j, hwyVar) != d9nVar2) {
                exyVar3 = exyVar;
                bwyVar2 = bwyVar;
                r261Var4 = r261Var2;
                exyVar2 = exyVar3;
                r261Var3 = r261Var4;
            }
            return d9nVar2;
        }
        bwyVar2 = bwyVar;
        r261Var3 = r261Var2;
        exyVar2 = exyVar;
        z771 z771Var2 = bwyVar2.c.a.b;
        d9nVar = d9nVar2;
        zvy zvyVar2 = new zvy(bwyVar2, z771Var2, this.d, exyVar2, this.e, oudVar, null, (byte) 0);
        hwyVar.d = r261Var3;
        hwyVar.e = null;
        hwyVar.f = null;
        hwyVar.g = i;
        hwyVar.b = 3;
        objA = this.c.a("sharing.entity_share_format_loading", z771Var2, zvyVar2, hwyVar);
        if (objA == d9nVar) {
            return d9nVar;
        }
        r261 r261Var7 = r261Var3;
        obj2 = objA;
        r261Var5 = r261Var7;
        hwyVar.d = null;
        hwyVar.e = null;
        hwyVar.f = null;
        hwyVar.b = 4;
        if (r261Var5.b(obj2, hwyVar) == d9nVar) {
            return d9nVar;
        }
        return rih1.a;
    }
}
