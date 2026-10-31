package p;

import android.content.Context;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.list_collection.save_source.proto.SaveSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionAddRemoveItem;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ccc0 {
    public final Context a;
    public final iyc0 b;
    public final agc0 c;
    public final r5h d;
    public final q8n e;
    public final spq0 f;
    public final idd1 g = new idd1(new nzb0(this, (byte) 6));

    public ccc0(Context context, iyc0 iyc0Var, agc0 agc0Var, r5h r5hVar, q8n q8nVar, spq0 spq0Var) {
        this.a = context;
        this.b = iyc0Var;
        this.c = agc0Var;
        this.d = r5hVar;
        this.e = q8nVar;
        this.f = spq0Var;
    }

    public static Object b(ccc0 ccc0Var, String str, boolean z, ubc0 ubc0Var, lnm lnmVar, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            ubc0Var = null;
        }
        ccc0Var.getClass();
        return c(ccc0Var, str, z, ubc0Var, lnmVar);
    }

    public static /* synthetic */ Object c(ccc0 ccc0Var, String str, boolean z, ubc0 ubc0Var, lnm lnmVar) {
        return ccc0Var.a(k4p1.x(str), z, ubc0Var, lnmVar);
    }

    public static ArrayList e(List list, ubc0 ubc0Var) {
        CollectionItemdata$ItemData collectionItemdata$ItemData;
        if (ubc0Var != null) {
            h4h h4hVarT = CollectionItemdata$ItemData.t();
            oc41 oc41VarP = SaveSource.p();
            oc41VarP.n(ubc0Var.a().a.a);
            h4hVarT.r(oc41VarP.build());
            collectionItemdata$ItemData = (CollectionItemdata$ItemData) h4hVarT.build();
        } else {
            collectionItemdata$ItemData = null;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            b0h b0hVarN = CollectionAddRemoveItem.n();
            b0hVarN.r(str);
            if (collectionItemdata$ItemData != null) {
                b0hVarN.n(collectionItemdata$ItemData);
            }
            arrayList.add(b0hVarN.build());
        }
        return arrayList;
    }

    public static Object h(ccc0 ccc0Var, String str, ubc0 ubc0Var, lnm lnmVar, int i) {
        if ((i & 4) != 0) {
            ubc0Var = null;
        }
        ccc0Var.getClass();
        return i(ccc0Var, str, false, ubc0Var, lnmVar);
    }

    public static /* synthetic */ Object i(ccc0 ccc0Var, String str, boolean z, ubc0 ubc0Var, lnm lnmVar) {
        return ccc0Var.g(k4p1.x(str), z, ubc0Var, lnmVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a4, code lost:
    
        if (p.fc11.i(r0, r6) == r12) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r20, boolean r21, p.ubc0 r22, p.lnm r23) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ccc0.a(java.util.List, boolean, p.ubc0, p.lnm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Enum d(List list, ubc0 ubc0Var, onm onmVar) throws NoWhenBranchMatchedException {
        ybc0 ybc0Var;
        py21 m231Var;
        if (onmVar instanceof ybc0) {
            ybc0Var = (ybc0) onmVar;
            int i = ybc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybc0Var.c = i - Integer.MIN_VALUE;
            } else {
                ybc0Var = new ybc0(this, onmVar);
            }
        } else {
            ybc0Var = new ybc0(this, onmVar);
        }
        ybc0 ybc0Var2 = ybc0Var;
        Object objD = ybc0Var2.a;
        int i2 = ybc0Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                this.c.getClass();
                zxc0 zxc0Var = ubc0Var != null ? new zxc0(ubc0Var.a().a) : null;
                xyc0 xyc0Var = this.b;
                ybc0Var2.c = 1;
                objD = xyc0Var.d("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", list, "", "", zxc0Var, ybc0Var2);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            m231Var = (py21) objD;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        vbc0 vbc0Var = vbc0.b;
        if (thA != null) {
            return vbc0Var;
        }
        py21 py21Var = m231Var;
        hyb0 hyb0Var = hyb0.V0;
        py21Var.getClass();
        if (py21Var instanceof ly21) {
            return vbc0Var;
        }
        if (py21Var instanceof oy21) {
            hyb0Var.invoke(((oy21) py21Var).a);
            return vbc0.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum f(iu30 iu30Var, onm onmVar) {
        zbc0 zbc0Var;
        if (onmVar instanceof zbc0) {
            zbc0Var = (zbc0) onmVar;
            int i = zbc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbc0Var.c = i - Integer.MIN_VALUE;
            } else {
                zbc0Var = new zbc0(this, onmVar);
            }
        } else {
            zbc0Var = new zbc0(this, onmVar);
        }
        Object objH = zbc0Var.a;
        int i2 = zbc0Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            fuo fuoVar = new fuo(iu30Var, (lnm) null, (byte) 2);
            zbc0Var.c = 1;
            objH = c921.H(this.e, fuoVar, zbc0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        Object obj = ((e331) objH).a;
        if (e331.a(obj) == null) {
            tr80 tr80VarB = dcc0.b();
            int i3 = ((rr80) tr80VarB).a;
            int i4 = ((rr80) tr80VarB).b;
            int iO = ((CollectionAddRemoveItemsResponse) obj).n().o();
            if (i3 <= iO && iO <= i4) {
                return vbc0.a;
            }
        }
        return vbc0.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a4, code lost:
    
        if (p.fc11.i(r0, r6) == r12) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r20, boolean r21, p.ubc0 r22, p.lnm r23) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ccc0.g(java.util.List, boolean, p.ubc0, p.lnm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum j(List list, ubc0 ubc0Var, onm onmVar) throws NoWhenBranchMatchedException {
        bcc0 bcc0Var;
        py21 m231Var;
        if (onmVar instanceof bcc0) {
            bcc0Var = (bcc0) onmVar;
            int i = bcc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcc0Var.c = i - Integer.MIN_VALUE;
            } else {
                bcc0Var = new bcc0(this, onmVar);
            }
        } else {
            bcc0Var = new bcc0(this, onmVar);
        }
        Object objL = bcc0Var.a;
        int i2 = bcc0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                xyc0 xyc0Var = this.b;
                this.c.getClass();
                tv80 tv80VarA = ubc0Var != null ? ubc0Var.a() : null;
                bcc0Var.c = 1;
                objL = xyc0Var.l("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", list, bcc0Var, tv80VarA);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            m231Var = (py21) objL;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        vbc0 vbc0Var = vbc0.b;
        if (thA != null) {
            return vbc0Var;
        }
        py21 py21Var = m231Var;
        hyb0 hyb0Var = hyb0.W0;
        py21Var.getClass();
        if (py21Var instanceof ly21) {
            return vbc0Var;
        }
        if (py21Var instanceof oy21) {
            hyb0Var.invoke(((oy21) py21Var).a);
            return vbc0.a;
        }
        eg.o();
        return null;
    }
}
