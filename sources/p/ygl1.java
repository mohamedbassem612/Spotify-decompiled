package p;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ygl1 {
    public final xjn1 a;
    public final xjn1 b;
    public final s0o1 c;
    public final phl1 d;

    public ygl1(xjn1 xjn1Var, xjn1 xjn1Var2, s0o1 s0o1Var, phl1 phl1Var) {
        this.a = xjn1Var;
        this.b = xjn1Var2;
        this.c = s0o1Var;
        this.d = phl1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        ugl1 ugl1Var;
        Set setG;
        if (onmVar instanceof ugl1) {
            ugl1Var = (ugl1) onmVar;
            int i = ugl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugl1Var.c = i - Integer.MIN_VALUE;
            } else {
                ugl1Var = new ugl1(this, onmVar);
            }
        } else {
            ugl1Var = new ugl1(this, onmVar);
        }
        Object objL = ugl1Var.a;
        int i2 = ugl1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                hfp1 hfp1VarF = this.b.f();
                ugl1Var.c = 1;
                objL = u890.l(hfp1VarF, ugl1Var);
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
            bmd bmdVar = (bmd) ((Map) objL).get("data_layer_watch_app_installed");
            if (bmdVar != null && (setG = bmdVar.g()) != null) {
                return o7h.l1(setG);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) {
        vgl1 vgl1Var;
        boolean zBooleanValue;
        if (onmVar instanceof vgl1) {
            vgl1Var = (vgl1) onmVar;
            int i = vgl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgl1Var.c = i - Integer.MIN_VALUE;
            } else {
                vgl1Var = new vgl1(this, onmVar);
            }
        } else {
            vgl1Var = new vgl1(this, onmVar);
        }
        Object objL = vgl1Var.a;
        int i2 = vgl1Var.c;
        z6x z6xVar = z6x.a;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                hfp1 hfp1VarF = this.c.f(Uri.parse("wear://*/user_logged_in"));
                vgl1Var.c = 1;
                objL = u890.l(hfp1VarF, vgl1Var);
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
            hzq hzqVar = (hzq) objL;
            try {
                if (hzqVar.getCount() == 0) {
                    return z6xVar;
                }
                ArrayList arrayList = new ArrayList(q7h.U(hzqVar, 10));
                owq it = hzqVar.iterator();
                while (true) {
                    owq owqVar = it;
                    if (!owqVar.hasNext()) {
                        return arrayList;
                    }
                    fzq fzqVar = (fzq) owqVar.next();
                    String host = fzqVar.getUri().getHost();
                    if (host == null) {
                        host = "";
                    }
                    Object obj = a1q.a(fzqVar).b().a.get("com.spotify.wear.logged.in.watch");
                    if (obj == null) {
                        zBooleanValue = false;
                    } else {
                        try {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                        } catch (ClassCastException unused) {
                            zBooleanValue = false;
                        }
                    }
                    arrayList.add(new udo0(host, zBooleanValue));
                }
            } finally {
                hzqVar.d();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused2) {
            return z6xVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:2: B:38:0x00c6->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable c(onm onmVar) {
        wgl1 wgl1Var;
        List list;
        List list2;
        Serializable serializableB;
        List list3;
        List list4;
        List list5;
        ArrayList<omr0> arrayList;
        List list6;
        boolean zB;
        Iterator it;
        boolean z;
        Iterator it2;
        Object next;
        udo0 udo0Var;
        if (onmVar instanceof wgl1) {
            wgl1Var = (wgl1) onmVar;
            int i = wgl1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgl1Var.e = i - Integer.MIN_VALUE;
            } else {
                wgl1Var = new wgl1(this, onmVar);
            }
        } else {
            wgl1Var = new wgl1(this, onmVar);
        }
        Object objD = wgl1Var.c;
        int i2 = wgl1Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            wgl1Var.e = 1;
            objD = d(wgl1Var);
            if (objD != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objD);
        } else {
            if (i2 == 2) {
                list = wgl1Var.a;
                hm5.M(objD);
                list2 = (List) objD;
                wgl1Var.a = list;
                wgl1Var.b = list2;
                wgl1Var.e = 3;
                serializableB = b(wgl1Var);
                if (serializableB != d9nVar) {
                    List list7 = list;
                    list3 = list2;
                    objD = serializableB;
                    list4 = list7;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = wgl1Var.b;
            list4 = wgl1Var.a;
            hm5.M(objD);
        }
        list5 = (List) objD;
        List<zio1> list8 = list4;
        arrayList = new ArrayList(q7h.U(list8, 10));
        for (zio1 zio1Var : list8) {
            String id = zio1Var.getId();
            boolean zJ = zio1Var.j();
            list6 = list3;
            zB = false;
            if (!(list6 instanceof Collection) && list6.isEmpty()) {
                z = false;
                break;
            }
            it = list6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (u890.j(((zio1) it.next()).getId(), zio1Var.getId())) {
                    z = true;
                    break;
                }
            }
            it2 = list5.iterator();
            do {
                if (it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((udo0) next).a().equals(zio1Var.getId()));
            udo0Var = (udo0) next;
            if (udo0Var != null) {
                zB = udo0Var.b();
            }
            arrayList.add(new omr0(id, zJ, z, zB));
        }
        if (!arrayList.isEmpty()) {
            for (omr0 omr0Var : arrayList) {
                if (omr0Var.a() && omr0Var.c()) {
                    phl1 phl1Var = this.d;
                    ima1 ima1Var = phl1Var.a;
                    if (!phl1Var.c.c()) {
                        break;
                    }
                    bma1 bma1Var = qhl1.a;
                    if (!ima1Var.n(bma1Var)) {
                        l1d.B(phl1Var.b, ima1Var.edit(), bma1Var);
                        break;
                    }
                    break;
                }
            }
        }
        return arrayList;
        List list9 = (List) objD;
        wgl1Var.a = list9;
        wgl1Var.e = 2;
        Object objA = a(wgl1Var);
        if (objA != d9nVar) {
            list = list9;
            objD = objA;
            list2 = (List) objD;
            wgl1Var.a = list;
            wgl1Var.b = list2;
            wgl1Var.e = 3;
            serializableB = b(wgl1Var);
            if (serializableB != d9nVar) {
                List list10 = list;
                list3 = list2;
                objD = serializableB;
                list4 = list10;
                list5 = (List) objD;
                List<zio1> list11 = list4;
                arrayList = new ArrayList(q7h.U(list11, 10));
                while (r2.hasNext()) {
                    String id2 = zio1Var.getId();
                    boolean zJ2 = zio1Var.j();
                    list6 = list3;
                    zB = false;
                    if (!(list6 instanceof Collection)) {
                        it = list6.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (u890.j(((zio1) it.next()).getId(), zio1Var.getId())) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        it = list6.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (u890.j(((zio1) it.next()).getId(), zio1Var.getId())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    it2 = list5.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!((udo0) next).a().equals(zio1Var.getId()));
                    udo0Var = (udo0) next;
                    if (udo0Var != null) {
                        zB = udo0Var.b();
                    }
                    arrayList.add(new omr0(id2, zJ2, z, zB));
                }
                if (!arrayList.isEmpty()) {
                    while (r1.hasNext()) {
                        if (omr0Var.a()) {
                        }
                    }
                }
                return arrayList;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        xgl1 xgl1Var;
        if (onmVar instanceof xgl1) {
            xgl1Var = (xgl1) onmVar;
            int i = xgl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgl1Var.c = i - Integer.MIN_VALUE;
            } else {
                xgl1Var = new xgl1(this, onmVar);
            }
        } else {
            xgl1Var = new xgl1(this, onmVar);
        }
        Object objL = xgl1Var.a;
        int i2 = xgl1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                hfp1 hfp1VarG = this.a.g();
                xgl1Var.c = 1;
                objL = u890.l(hfp1VarG, xgl1Var);
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
            objL.getClass();
            return (List) objL;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return z6x.a;
        }
    }
}
