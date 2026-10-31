package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zyl1 implements jlq0 {
    public final dai1 a;
    public final xrc0 b;
    public final q8n c;

    public zyl1(dai1 dai1Var, xrc0 xrc0Var, q8n q8nVar) {
        this.a = dai1Var;
        this.b = xrc0Var;
        this.c = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        yyl1 yyl1Var;
        Set setA;
        dma1 dma1Var;
        Set set;
        Set set2;
        LinkedHashSet linkedHashSet;
        Map map;
        LinkedHashSet linkedHashSet2;
        py21 py21Var;
        wsc0 wsc0Var;
        kby kbyVar;
        if (onmVar instanceof yyl1) {
            yyl1Var = (yyl1) onmVar;
            int i = yyl1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyl1Var.h = i - Integer.MIN_VALUE;
            } else {
                yyl1Var = new yyl1(this, onmVar);
            }
        } else {
            yyl1Var = new yyl1(this, onmVar);
        }
        Object objA = yyl1Var.f;
        int i2 = yyl1Var.h;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                yyl1Var.h = 1;
                objA = this.a.a(yyl1Var);
                if (objA != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                hm5.M(objA);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                linkedHashSet = yyl1Var.e;
                set2 = yyl1Var.d;
                set = yyl1Var.c;
                setA = yyl1Var.b;
                dma1Var = yyl1Var.a;
                hm5.M(objA);
            }
            map = (Map) objA;
            linkedHashSet2 = new LinkedHashSet();
            for (Object obj : linkedHashSet) {
                py21Var = (py21) map.get((String) obj);
                if (py21Var == null && (wsc0Var = (wsc0) py21Var.c()) != null && (kbyVar = wsc0Var.f) != null && !kbyVar.g) {
                    linkedHashSet2.add(obj);
                }
            }
            if (!linkedHashSet2.isEmpty()) {
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.e(ezl1.a, dm61.v0(setA, linkedHashSet2));
                hma1VarEdit.e(ezl1.b, dm61.v0(set, linkedHashSet2));
                hma1VarEdit.e(ezl1.c, dm61.v0(set2, linkedHashSet2));
                hma1VarEdit.g();
            }
            return rih1Var;
            dma1 dma1Var2 = (dma1) objA;
            setA = dma1Var2.a(ezl1.a);
            Set setA2 = dma1Var2.a(ezl1.b);
            Set setA3 = dma1Var2.a(ezl1.c);
            LinkedHashSet linkedHashSetY0 = dm61.y0(dm61.y0(setA, setA2), setA3);
            if (!linkedHashSetY0.isEmpty()) {
                int iS = zno1.s(q7h.U(linkedHashSetY0, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : linkedHashSetY0) {
                    linkedHashMap.put(obj2, new wrc0((String) obj2, azl1.a));
                }
                xrc0 xrc0Var = this.b;
                yyl1Var.a = dma1Var2;
                yyl1Var.b = setA;
                yyl1Var.c = setA2;
                yyl1Var.d = setA3;
                yyl1Var.e = linkedHashSetY0;
                yyl1Var.h = 2;
                Object objG = ((rsc0) xrc0Var).g(linkedHashMap, null, yyl1Var);
                if (objG != d9nVar) {
                    dma1Var = dma1Var2;
                    set = setA2;
                    set2 = setA3;
                    objA = objG;
                    linkedHashSet = linkedHashSetY0;
                    map = (Map) objA;
                    linkedHashSet2 = new LinkedHashSet();
                    while (r14.hasNext()) {
                        py21Var = (py21) map.get((String) obj);
                        if (py21Var == null) {
                        }
                    }
                    if (!linkedHashSet2.isEmpty()) {
                        hma1 hma1VarEdit2 = dma1Var.edit();
                        hma1VarEdit2.e(ezl1.a, dm61.v0(setA, linkedHashSet2));
                        hma1VarEdit2.e(ezl1.b, dm61.v0(set, linkedHashSet2));
                        hma1VarEdit2.e(ezl1.c, dm61.v0(set2, linkedHashSet2));
                        hma1VarEdit2.g();
                    }
                }
                return d9nVar;
            }
        } catch (Exception unused) {
        }
        return rih1Var;
    }

    @Override // p.jlq0
    public final void c() {
        c921.y(smo1.e(this.c), (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 22), 3);
    }

    @Override // p.jlq0
    public final String getName() {
        return "WorkoutPlaylistCleanupOperation";
    }
}
