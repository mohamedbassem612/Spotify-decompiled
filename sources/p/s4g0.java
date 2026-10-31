package p;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s4g0 {
    public final iyc0 a;
    public final eyh0 b;
    public final llm c;
    public final dt71 d;
    public xab1 e;
    public xab1 f;
    public final LinkedHashSet g;
    public boolean h;
    public final ve01 i;

    public s4g0(iyc0 iyc0Var, eyh0 eyh0Var) {
        this.a = iyc0Var;
        this.b = eyh0Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.c = smo1.e(flo1.l(j0d1VarB, pyf0.a).y(new v62(olj0.T0, (byte) 14)));
        dt71 dt71VarE = mgo1.e(0, 10, 0, 5);
        this.d = dt71VarE;
        this.g = new LinkedHashSet();
        this.i = d5p1.g(dt71VarE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) {
        q4g0 q4g0Var;
        Set set;
        if (onmVar instanceof q4g0) {
            q4g0Var = (q4g0) onmVar;
            int i = q4g0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q4g0Var.d = i - Integer.MIN_VALUE;
            } else {
                q4g0Var = new q4g0(this, onmVar);
            }
        } else {
            q4g0Var = new q4g0(this, onmVar);
        }
        Object obj = q4g0Var.b;
        int i2 = q4g0Var.d;
        rih1 rih1Var = rih1.a;
        LinkedHashSet linkedHashSet = this.g;
        if (i2 == 0) {
            hm5.M(obj);
            Set setP1 = o7h.p1(linkedHashSet);
            if (!setP1.isEmpty()) {
                linkedHashSet.clear();
                q4g0Var.a = setP1;
                q4g0Var.d = 1;
                Object objB = b(setP1, wls0.c, q4g0Var);
                Object obj2 = d9n.a;
                if (objB == obj2) {
                    return obj2;
                }
                set = setP1;
                obj = objB;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        set = q4g0Var.a;
        hm5.M(obj);
        if (!((Boolean) obj).booleanValue()) {
            r7h.W(set, linkedHashSet);
            set.size();
            tzf0 tzf0Var = new tzf0(this, (byte) 8);
            eyh0 eyh0Var = this.b;
            Context context = (Context) eyh0Var.b;
            context.getResources();
            kt91 kt91Var = (kt91) eyh0Var.d;
            context.getResources();
            kt91Var.k(new er91((fs91) null, "", (Integer) null, "", (Integer) null, new c20(tzf0Var, (byte) 1), (cvr) null, (xq91) null, false));
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Set set, wls0 wls0Var, onm onmVar) {
        r4g0 r4g0Var;
        if (onmVar instanceof r4g0) {
            r4g0Var = (r4g0) onmVar;
            int i = r4g0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r4g0Var.e = i - Integer.MIN_VALUE;
            } else {
                r4g0Var = new r4g0(this, onmVar);
            }
        } else {
            r4g0Var = new r4g0(this, onmVar);
        }
        Object objB = r4g0Var.c;
        int i2 = r4g0Var.e;
        if (i2 == 0) {
            hm5.M(objB);
            List listL1 = o7h.l1(set);
            r4g0Var.a = set;
            r4g0Var.b = wls0Var;
            r4g0Var.e = 1;
            objB = iyc0.b(this.a, listL1, wls0Var, r4g0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wls0Var = r4g0Var.b;
            set = r4g0Var.a;
            hm5.M(objB);
        }
        ly21 ly21Var = (py21) objB;
        j2d0 j2d0Var = new j2d0(wls0Var, set, (byte) 22);
        ly21Var.getClass();
        if (ly21Var instanceof ly21) {
            j2d0Var.invoke(ly21Var.a);
            return Boolean.FALSE;
        }
        if (ly21Var instanceof oy21) {
            return Boolean.TRUE;
        }
        eg.o();
        return null;
    }
}
