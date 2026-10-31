package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uwl implements xpw {
    public Object N0;
    public final Object O0;
    public final mqw P0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final boolean b;
    public final ia00 c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public uwl(n6r0 n6r0Var, em0 em0Var, gw70 gw70Var, woa woaVar, kma kmaVar, s801 s801Var, o7h1 o7h1Var, zhy zhyVar, hwp hwpVar, d4e0 d4e0Var, hod0 hod0Var, boolean z, d4q d4qVar) {
        this.a = (byte) 0;
        this.e = n6r0Var;
        this.f = em0Var;
        this.g = gw70Var;
        this.h = woaVar;
        this.i = kmaVar;
        this.t = s801Var;
        this.X = o7h1Var;
        this.Y = zhyVar;
        this.b = z;
        this.Z = d4qVar.a(em0Var);
        this.N0 = hwpVar.a(d4e0Var);
        this.O0 = hwpVar.a(hod0Var);
        this.P0 = h7w.D(vll.a1, (bs50) null, (iu30) null, new j2i(2051135809, new sw1(this, (byte) 7), true), 6);
        this.c = n3o1.q(this).a(new cml(this, (byte) 2), ngl.Y);
        j2i j2iVar = new j2i(-1999697879, new rxg(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object e(oom0 oom0Var, yom0 yom0Var, onm onmVar) {
        fbs fbsVar;
        i130 i130Var;
        yom0 yom0Var2;
        Map map;
        int i;
        i130 i130Var2;
        Iterator it;
        Object objE;
        i130 i130Var3;
        yom0 yom0Var3;
        Object objY;
        if (onmVar instanceof fbs) {
            fbsVar = (fbs) onmVar;
            int i2 = fbsVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fbsVar.g = i2 - Integer.MIN_VALUE;
            } else {
                fbsVar = new fbs(this, onmVar);
            }
        } else {
            fbsVar = new fbs(this, onmVar);
        }
        Object obj = fbsVar.e;
        int i3 = fbsVar.g;
        d9n d9nVar = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = fbsVar.d;
                Iterator it2 = fbsVar.c;
                i130Var2 = fbsVar.b;
                yom0 yom0Var4 = fbsVar.a;
                hm5.M(obj);
                it = it2;
                i = i4;
                yom0Var2 = yom0Var4;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i130 i130Var4 = fbsVar.b;
                yom0 yom0Var5 = fbsVar.a;
                hm5.M(obj);
                yom0Var3 = yom0Var5;
                i130Var3 = i130Var4;
            }
            rih1 rih1Var = (rih1) ((py21) obj).c();
            q8n q8nVar = (q8n) this.Y;
            swn swnVar = new swn(rih1Var, this, yom0Var3, i130Var3, (lnm) null, (byte) 13);
            fbsVar.a = null;
            fbsVar.b = null;
            fbsVar.g = 3;
            objY = fn31.Y(q8nVar, swnVar, fbsVar);
            if (objY != d9nVar) {
                return d9nVar;
            }
            return objY;
        }
        hm5.M(obj);
        i130Var = (g130) o7h.C0(((f130) ((bpb1) this.O0).getValue()).a);
        if (i130Var == null) {
            i130Var = h130.a;
        }
        if (!(i130Var instanceof g130)) {
            return rih1.a;
        }
        if (oom0Var != null && (map = oom0Var.c) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            if (setKeySet != null) {
                i = 0;
                i130Var2 = i130Var;
                it = setKeySet.iterator();
                yom0Var2 = yom0Var;
            }
            pp31 pp31Var = (op31) this.t;
            String str = ((g130) i130Var).a;
            List list = yom0Var2.a;
            fbsVar.a = yom0Var2;
            fbsVar.b = i130Var;
            fbsVar.c = null;
            fbsVar.g = 2;
            objE = pp31Var.e(str, list, fbsVar);
            if (objE != d9nVar) {
                i130Var3 = i130Var;
                obj = objE;
                yom0Var3 = yom0Var2;
                rih1 rih1Var2 = (rih1) ((py21) obj).c();
                q8n q8nVar2 = (q8n) this.Y;
                swn swnVar2 = new swn(rih1Var2, this, yom0Var3, i130Var3, (lnm) null, (byte) 13);
                fbsVar.a = null;
                fbsVar.b = null;
                fbsVar.g = 3;
                objY = fn31.Y(q8nVar2, swnVar2, fbsVar);
                if (objY != d9nVar) {
                    return objY;
                }
            }
            return d9nVar;
        }
        yom0Var2 = yom0Var;
        pp31 pp31Var2 = (op31) this.t;
        String str2 = ((g130) i130Var).a;
        List list2 = yom0Var2.a;
        fbsVar.a = yom0Var2;
        fbsVar.b = i130Var;
        fbsVar.c = null;
        fbsVar.g = 2;
        objE = pp31Var2.e(str2, list2, fbsVar);
        if (objE != d9nVar) {
            i130Var3 = i130Var;
            obj = objE;
            yom0Var3 = yom0Var2;
            rih1 rih1Var3 = (rih1) ((py21) obj).c();
            q8n q8nVar3 = (q8n) this.Y;
            swn swnVar3 = new swn(rih1Var3, this, yom0Var3, i130Var3, (lnm) null, (byte) 13);
            fbsVar.a = null;
            fbsVar.b = null;
            fbsVar.g = 3;
            objY = fn31.Y(q8nVar3, swnVar3, fbsVar);
            if (objY != d9nVar) {
                return objY;
            }
        }
        return d9nVar;
        while (it.hasNext()) {
            Single singleC = ((zxm1) this.i).c((String) it.next());
            fbsVar.a = yom0Var2;
            fbsVar.b = i130Var2;
            fbsVar.c = it;
            fbsVar.d = i;
            fbsVar.g = 1;
            if (fc11.j(singleC, fbsVar) == d9nVar) {
                return d9nVar;
            }
        }
        i130Var = i130Var2;
        pp31 pp31Var3 = (op31) this.t;
        String str3 = ((g130) i130Var).a;
        List list3 = yom0Var2.a;
        fbsVar.a = yom0Var2;
        fbsVar.b = i130Var;
        fbsVar.c = null;
        fbsVar.g = 2;
        objE = pp31Var3.e(str3, list3, fbsVar);
        if (objE != d9nVar) {
            i130Var3 = i130Var;
            obj = objE;
            yom0Var3 = yom0Var2;
            rih1 rih1Var4 = (rih1) ((py21) obj).c();
            q8n q8nVar4 = (q8n) this.Y;
            swn swnVar4 = new swn(rih1Var4, this, yom0Var3, i130Var3, (lnm) null, (byte) 13);
            fbsVar.a = null;
            fbsVar.b = null;
            fbsVar.g = 3;
            objY = fn31.Y(q8nVar4, swnVar4, fbsVar);
            if (objY != d9nVar) {
                return objY;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f(yom0 yom0Var, tom0 tom0Var, oom0 oom0Var, onm onmVar) {
        gbs gbsVar;
        yom0 yom0Var2;
        tom0 tom0Var2;
        Map map;
        Iterator it;
        int i;
        Object objE;
        tom0 tom0Var3;
        gbs gbsVar2;
        yom0 yom0Var3;
        Object objY;
        if (onmVar instanceof gbs) {
            gbsVar = (gbs) onmVar;
            int i2 = gbsVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gbsVar.g = i2 - Integer.MIN_VALUE;
            } else {
                gbsVar = new gbs(this, onmVar);
            }
        } else {
            gbsVar = new gbs(this, onmVar);
        }
        Object obj = gbsVar.e;
        int i3 = gbsVar.g;
        d9n d9nVar = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = gbsVar.d;
                Iterator it2 = gbsVar.c;
                tom0 tom0Var4 = gbsVar.b;
                yom0 yom0Var4 = gbsVar.a;
                hm5.M(obj);
                tom0Var2 = tom0Var4;
                it = it2;
                i = i4;
                yom0Var2 = yom0Var4;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tom0 tom0Var5 = gbsVar.b;
                yom0 yom0Var5 = gbsVar.a;
                hm5.M(obj);
                gbsVar2 = gbsVar;
                yom0Var3 = yom0Var5;
                tom0Var3 = tom0Var5;
            }
            rih1 rih1Var = (rih1) ((py21) obj).c();
            q8n q8nVar = (q8n) this.Y;
            swn swnVar = new swn(rih1Var, this, yom0Var3, tom0Var3, (lnm) null, (byte) 14);
            gbsVar2.a = null;
            gbsVar2.b = null;
            gbsVar2.g = 3;
            objY = fn31.Y(q8nVar, swnVar, gbsVar2);
            if (objY != d9nVar) {
                return d9nVar;
            }
            return objY;
        }
        hm5.M(obj);
        if (oom0Var != null && (map = oom0Var.c) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            if (setKeySet != null) {
                it = setKeySet.iterator();
                yom0Var2 = yom0Var;
                i = 0;
                tom0Var2 = tom0Var;
            }
            pp31 pp31Var = (op31) this.t;
            List list = yom0Var2.a;
            String str = tom0Var2.a;
            gbsVar.a = yom0Var2;
            gbsVar.b = tom0Var2;
            gbsVar.c = null;
            gbsVar.g = 2;
            objE = pp31Var.e(str, list, gbsVar);
            if (objE != d9nVar) {
                tom0Var3 = tom0Var2;
                obj = objE;
                gbsVar2 = gbsVar;
                yom0Var3 = yom0Var2;
                rih1 rih1Var2 = (rih1) ((py21) obj).c();
                q8n q8nVar2 = (q8n) this.Y;
                swn swnVar2 = new swn(rih1Var2, this, yom0Var3, tom0Var3, (lnm) null, (byte) 14);
                gbsVar2.a = null;
                gbsVar2.b = null;
                gbsVar2.g = 3;
                objY = fn31.Y(q8nVar2, swnVar2, gbsVar2);
                if (objY != d9nVar) {
                    return objY;
                }
            }
            return d9nVar;
        }
        yom0Var2 = yom0Var;
        tom0Var2 = tom0Var;
        pp31 pp31Var2 = (op31) this.t;
        List list2 = yom0Var2.a;
        String str2 = tom0Var2.a;
        gbsVar.a = yom0Var2;
        gbsVar.b = tom0Var2;
        gbsVar.c = null;
        gbsVar.g = 2;
        objE = pp31Var2.e(str2, list2, gbsVar);
        if (objE != d9nVar) {
            tom0Var3 = tom0Var2;
            obj = objE;
            gbsVar2 = gbsVar;
            yom0Var3 = yom0Var2;
            rih1 rih1Var3 = (rih1) ((py21) obj).c();
            q8n q8nVar3 = (q8n) this.Y;
            swn swnVar3 = new swn(rih1Var3, this, yom0Var3, tom0Var3, (lnm) null, (byte) 14);
            gbsVar2.a = null;
            gbsVar2.b = null;
            gbsVar2.g = 3;
            objY = fn31.Y(q8nVar3, swnVar3, gbsVar2);
            if (objY != d9nVar) {
                return objY;
            }
        }
        return d9nVar;
        while (it.hasNext()) {
            Single singleC = ((zxm1) this.i).c((String) it.next());
            gbsVar.a = yom0Var2;
            gbsVar.b = tom0Var2;
            gbsVar.c = it;
            gbsVar.d = i;
            gbsVar.g = 1;
            if (fc11.j(singleC, gbsVar) == d9nVar) {
                return d9nVar;
            }
        }
        gbsVar = gbsVar;
        pp31 pp31Var3 = (op31) this.t;
        List list3 = yom0Var2.a;
        String str3 = tom0Var2.a;
        gbsVar.a = yom0Var2;
        gbsVar.b = tom0Var2;
        gbsVar.c = null;
        gbsVar.g = 2;
        objE = pp31Var3.e(str3, list3, gbsVar);
        if (objE != d9nVar) {
            tom0Var3 = tom0Var2;
            obj = objE;
            gbsVar2 = gbsVar;
            yom0Var3 = yom0Var2;
            rih1 rih1Var4 = (rih1) ((py21) obj).c();
            q8n q8nVar4 = (q8n) this.Y;
            swn swnVar4 = new swn(rih1Var4, this, yom0Var3, tom0Var3, (lnm) null, (byte) 14);
            gbsVar2.a = null;
            gbsVar2.b = null;
            gbsVar2.g = 3;
            objY = fn31.Y(q8nVar4, swnVar4, gbsVar2);
            if (objY != d9nVar) {
                return objY;
            }
        }
        return d9nVar;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.P0;
    }

    public uwl(Context context, f1n0 f1n0Var, q7r0 q7r0Var, kt91 kt91Var, zxm1 zxm1Var, op31 op31Var, spn spnVar, q8n q8nVar, vwm1 vwm1Var, boolean z) {
        this.a = (byte) 1;
        this.e = context;
        this.f = f1n0Var;
        this.g = q7r0Var;
        this.h = kt91Var;
        this.i = zxm1Var;
        this.t = op31Var;
        this.X = spnVar;
        this.Y = q8nVar;
        this.Z = vwm1Var;
        this.b = z;
        this.O0 = gio1.b(new f130(z6x.a));
        this.P0 = x3p1.n(new ebs(this, (byte) 0), c6s.V0, szr.i, (o8n) null, new ebs(this, (byte) 1), 8);
        this.c = n3o1.q(this).a(zyr.Z0, zyr.a1);
        j2i j2iVar = new j2i(-1271790694, new i6r(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
