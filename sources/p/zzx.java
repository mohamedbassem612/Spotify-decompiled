package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zzx {
    public final xrc0 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Enum a(onm onmVar) {
        yzx yzxVar;
        if (onmVar instanceof yzx) {
            yzxVar = (yzx) onmVar;
            int i = yzxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yzxVar.c = i - Integer.MIN_VALUE;
            } else {
                yzxVar = new yzx(this, onmVar);
            }
        } else {
            yzxVar = new yzx(this, onmVar);
        }
        Object objF = yzxVar.a;
        int i2 = yzxVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) null, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 479);
            yzxVar.c = 1;
            objF = this.a.f("spotify:playlist:37i9dQZF1EYkqdzj48dyYq", trc0Var, yzxVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        ly21 ly21Var = (py21) objF;
        if (ly21Var instanceof oy21) {
            return xzx.a;
        }
        if (ly21Var instanceof ly21) {
            return ly21Var.a instanceof gy21 ? xzx.b : xzx.c;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        pwl1 pwl1Var;
        if (onmVar instanceof pwl1) {
            pwl1Var = (pwl1) onmVar;
            int i = pwl1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwl1Var.d = i - Integer.MIN_VALUE;
            } else {
                pwl1Var = new pwl1(this, onmVar);
            }
        } else {
            pwl1Var = new pwl1(this, onmVar);
        }
        Object objI = pwl1Var.b;
        int i2 = pwl1Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            qvc0 qvc0Var = new qvc0("spotify:list:available-release-groups:artist_".concat(ihc1.V0(str, ':', str)), (c3d0) null, (Set) null, (mqz0) null, 14);
            pwl1Var.a = str;
            pwl1Var.d = 1;
            objI = this.a.i(qvc0Var, pwl1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = pwl1Var.a;
            hm5.M(objI);
        }
        List list = (List) ((py21) objI).d();
        ywn ywnVar = new ywn(str);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            w7x w7xVar = w7x.a;
            if (!zHasNext) {
                return new yw11(ywnVar, w7xVar, arrayList);
            }
            pvc0 pvc0Var = (pvc0) it.next();
            String str2 = pvc0Var.a;
            String str3 = pvc0Var.c;
            if (str2.length() == 0) {
                str2 = str3;
            }
            arrayList.add(new tx11(str2, str3, w7xVar));
        }
    }
}
