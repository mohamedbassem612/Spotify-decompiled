package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wlr {
    public final vgm a;
    public final lik1 b;
    public final tgm c;
    public final d0r d;
    public final String e;
    public final y1c1 f;
    public final mje g;
    public final kdy0 h;
    public final q8n i;
    public final boolean j;
    public final boolean k;
    public final uq8 l;
    public final hsc m;
    public final tzo n = new tzo(this, (byte) 5);

    public wlr(vgm vgmVar, lik1 lik1Var, tgm tgmVar, d0r d0rVar, String str, y1c1 y1c1Var, mje mjeVar, kdy0 kdy0Var, q8n q8nVar, boolean z, boolean z2, uq8 uq8Var, hsc hscVar) {
        this.a = vgmVar;
        this.b = lik1Var;
        this.c = tgmVar;
        this.d = d0rVar;
        this.e = str;
        this.f = y1c1Var;
        this.g = mjeVar;
        this.h = kdy0Var;
        this.i = q8nVar;
        this.j = z;
        this.k = z2;
        this.l = uq8Var;
        this.m = hscVar;
    }

    public final tgm a(ahe aheVar) {
        boolean z = this.j;
        tgm tgmVar = this.c;
        if (!z) {
            return tgm.a(tgmVar, false, false, 0, false, (sgm) null, (iu30) null, (p860) null, false, -5);
        }
        return tgm.a(tgmVar, false, false, 0, false, mmo1.s(this.g, this.d, this.h, this.n, this.l, aheVar, this.e, this.k, new rlr(this, aheVar, null), new slr(this, aheVar, null)), (iu30) null, (p860) null, false, -67108865);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) {
        tlr tlrVar;
        if (onmVar instanceof tlr) {
            tlrVar = (tlr) onmVar;
            int i = tlrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlrVar.c = i - Integer.MIN_VALUE;
            } else {
                tlrVar = new tlr(this, onmVar);
            }
        } else {
            tlrVar = new tlr(this, onmVar);
        }
        Object objY = tlrVar.a;
        int i2 = tlrVar.c;
        if (i2 == 0) {
            hm5.M(objY);
            tlrVar.c = 1;
            objY = fn31.Y(this.i, new vk6(this.f, (lnm) null, (byte) 28), tlrVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        Iterable iterable = (Iterable) objY;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((ahe) it.next()).a);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        ulr ulrVar;
        if (onmVar instanceof ulr) {
            ulrVar = (ulr) onmVar;
            int i = ulrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulrVar.d = i - Integer.MIN_VALUE;
            } else {
                ulrVar = new ulr(this, onmVar);
            }
        } else {
            ulrVar = new ulr(this, onmVar);
        }
        Object objY = ulrVar.b;
        int i2 = ulrVar.d;
        if (i2 == 0) {
            hm5.M(objY);
            ulrVar.a = str;
            ulrVar.d = 1;
            objY = fn31.Y(this.i, new vk6(this.f, (lnm) null, (byte) 28), ulrVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ulrVar.a;
            hm5.M(objY);
        }
        List list = (List) objY;
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (u890.j(((ahe) it.next()).a, str)) {
                return i3 >= 0 ? list.subList(i3, list.size()) : Collections.singletonList(new ahe(str, ""));
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        vlr vlrVar;
        if (onmVar instanceof vlr) {
            vlrVar = (vlr) onmVar;
            int i = vlrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vlrVar.d = i - Integer.MIN_VALUE;
            } else {
                vlrVar = new vlr(this, onmVar);
            }
        } else {
            vlrVar = new vlr(this, onmVar);
        }
        Object objY = vlrVar.b;
        int i2 = vlrVar.d;
        if (i2 == 0) {
            hm5.M(objY);
            vlrVar.a = str;
            vlrVar.d = 1;
            objY = fn31.Y(this.i, new vk6(this.f, (lnm) null, (byte) 28), vlrVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vlrVar.a;
            hm5.M(objY);
        }
        List list = (List) objY;
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (u890.j(((ahe) it.next()).a, str)) {
                return i3 >= 0 ? list.subList(0, i3 + 1) : Collections.singletonList(new ahe(str, ""));
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
        }
    }
}
