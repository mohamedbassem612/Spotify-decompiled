package p;

import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class chi0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public boolean b;
    public int c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chi0(d0r d0rVar, wul1 wul1Var, Object obj, dpb1 dpb1Var, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.f = d0rVar;
        this.g = wul1Var;
        this.h = obj;
        this.i = dpb1Var;
        this.c = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new chi0((igi0) this.e, (xtb0) obj2, (ven0) this.g, (iu30) this.h, (hdn0) this.i, lnmVar);
            case 1:
                chi0 chi0Var = new chi0((d0r) obj2, (wul1) this.g, this.h, (dpb1) this.i, this.c, lnmVar);
                chi0Var.e = obj;
                return chi0Var;
            default:
                return new chi0(this.c, this.d, lnmVar, (bju) this.e, (gw70) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262  */
    /* JADX WARN: Code duplicated, block: B:102:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:105:0x0280  */
    /* JADX WARN: Code duplicated, block: B:107:0x0283  */
    /* JADX WARN: Code duplicated, block: B:123:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:4: B:82:0x021a->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0216  */
    /* JADX WARN: Code duplicated, block: B:84:0x0220  */
    /* JADX WARN: Code duplicated, block: B:88:0x022f  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:94:0x024a A[LOOP:3: B:89:0x0234->B:94:0x024a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0250  */
    /* JADX WARN: Code duplicated, block: B:99:0x0260  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        String str;
        Set set;
        Iterator it;
        Object[] objArr;
        err0 err0Var;
        int iS;
        int iL;
        Iterator it2;
        int i;
        int i2;
        ArrayList arrayList2;
        int i3;
        c0r c0rVar;
        SceneTemplate.TopFiveSongsContent.Card1.SongItem songItem;
        Object objE;
        SceneTemplate.TopFiveSongsContent.Card1.SongItem songItem2;
        vu30 vu30Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        d9n d9nVar = d9n.a;
        Object obj3 = null;
        str = null;
        String str2 = null;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) this.h;
                err0 err0Var2 = (hdn0) this.i;
                ven0 ven0Var = (ven0) this.g;
                ArrayList arrayList3 = ((igi0) this.e).b;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((mey0) it3.next()).a);
                    }
                    if (arrayList.equals((List) ven0Var.getValue())) {
                        return rih1Var;
                    }
                    Set setP1 = o7h.p1((List) ven0Var.getValue());
                    Set setP2 = o7h.p1(arrayList);
                    for (Object obj4 : arrayList) {
                        if (!setP1.contains((String) obj4)) {
                            obj3 = obj4;
                            str = (String) obj3;
                            set = setP1;
                            if ((set instanceof Collection) || !set.isEmpty()) {
                                it = set.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        objArr = false;
                                    } else if (!setP2.contains((String) it.next())) {
                                        objArr = true;
                                    }
                                }
                            } else {
                                objArr = false;
                            }
                            if (str != null) {
                                it2 = arrayList3.iterator();
                                i = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        i2 = -1;
                                    } else if (u890.j(((mey0) it2.next()).a, str)) {
                                        i2 = i;
                                    } else {
                                        i++;
                                    }
                                }
                                if (i2 >= 0) {
                                    this.d = arrayList;
                                    this.c = i2;
                                    this.b = true;
                                    df41 df41Var = xtb0.y;
                                    if (((xtb0) obj2).f(i2, 0, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                    arrayList2 = arrayList;
                                    i3 = i2;
                                }
                            } else if (objArr != false) {
                                err0Var = err0Var2;
                                iS = err0Var.s();
                                iL = p7h.L(arrayList3);
                                if (iS > iL) {
                                    iS = iL;
                                }
                                if (iS >= 0) {
                                    err0Var.t(iS);
                                    iu30Var.invoke(Integer.valueOf(iS));
                                }
                            }
                            ven0Var.setValue(arrayList);
                            return rih1Var;
                        }
                    }
                    str = (String) obj3;
                    set = setP1;
                    if (set instanceof Collection) {
                        it = set.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                objArr = false;
                            } else if (!setP2.contains((String) it.next())) {
                                objArr = true;
                            }
                        }
                    } else {
                        it = set.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                objArr = false;
                            } else if (!setP2.contains((String) it.next())) {
                                objArr = true;
                            }
                        }
                    }
                    if (str != null) {
                        it2 = arrayList3.iterator();
                        i = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                i2 = -1;
                            } else if (u890.j(((mey0) it2.next()).a, str)) {
                                i2 = i;
                            } else {
                                i++;
                            }
                        }
                        if (i2 >= 0) {
                            this.d = arrayList;
                            this.c = i2;
                            this.b = true;
                            df41 df41Var2 = xtb0.y;
                            if (((xtb0) obj2).f(i2, 0, this) == d9nVar) {
                                return d9nVar;
                            }
                            arrayList2 = arrayList;
                            i3 = i2;
                        }
                    } else if (objArr != false) {
                        err0Var = err0Var2;
                        iS = err0Var.s();
                        iL = p7h.L(arrayList3);
                        if (iS > iL) {
                            iS = iL;
                        }
                        if (iS >= 0) {
                            err0Var.t(iS);
                            iu30Var.invoke(Integer.valueOf(iS));
                        }
                    }
                    ven0Var.setValue(arrayList);
                    return rih1Var;
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.c;
                arrayList2 = (ArrayList) this.d;
                hm5.M(obj);
                err0Var2.t(i3);
                iu30Var.invoke(Integer.valueOf(i3));
                arrayList = arrayList2;
                ven0Var.setValue(arrayList);
                return rih1Var;
            case 1:
                dpb1 dpb1Var = (dpb1) this.i;
                nsw0 nsw0Var = (nsw0) this.e;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    c0r c0rVarC = ((d0r) obj2).c(((wul1) this.g).getData().a(this.h));
                    try {
                        bpb1 bpb1Var = c0rVarC.a().a;
                        l2j0 l2j0Var = new l2j0(this.c, (dpb1) this.i, c0rVarC, this.h, nsw0Var, (byte) 3);
                        this.e = null;
                        this.d = c0rVarC;
                        this.b = true;
                        bpb1Var.collect(l2j0Var, this);
                        return d9nVar;
                    } catch (Throwable th) {
                        th = th;
                        c0rVar = c0rVarC;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0rVar = (c0r) this.d;
                    try {
                        hm5.M(obj);
                        if (c0rVar == dpb1Var.a) {
                            return rih1Var;
                        }
                        c0rVar.dispose();
                        return rih1Var;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (c0rVar != dpb1Var.a) {
                    c0rVar.dispose();
                }
                throw th;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    int i4 = this.c;
                    songItem = (SceneTemplate.TopFiveSongsContent.Card1.SongItem) this.d;
                    songItem.getClass();
                    vu30 qaf1Var = new qaf1(songItem);
                    bju bjuVar = (bju) this.e;
                    String strC = f4i1.c(i4, "song_");
                    raf1 raf1Var = new raf1(songItem, (gw70) obj2, (lnm) null);
                    this.g = songItem;
                    this.h = qaf1Var;
                    this.i = songItem;
                    this.b = true;
                    objE = bjuVar.e(strC, raf1Var, this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    songItem2 = songItem;
                    vu30Var = qaf1Var;
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    songItem2 = (SceneTemplate.TopFiveSongsContent.Card1.SongItem) this.i;
                    vu30 vu30Var2 = (qaf1) this.h;
                    SceneTemplate.TopFiveSongsContent.Card1.SongItem songItem3 = (SceneTemplate.TopFiveSongsContent.Card1.SongItem) this.g;
                    hm5.M(obj);
                    vu30Var = vu30Var2;
                    songItem = songItem3;
                    objE = obj;
                }
                wi90 wi90Var = new wi90(vu30Var, (yj41) objE, new saf1(songItem), songItem.u() ? new taf1(songItem) : ppd1.c1, g070.e1, u7h.j);
                AudioPreview audioPreviewO = songItem2.o();
                String url = audioPreviewO.getUrl();
                if (url.length() == 0) {
                    url = null;
                }
                rx7 rx7Var = url != null ? new rx7(url, u3k.m(audioPreviewO), u3k.j(audioPreviewO)) : null;
                List listM = p7h.M(new String[]{ror0.a(songItem2.q()).u(), ror0.a(songItem2.s()).u(), ror0.a(songItem2.r()).u()});
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : listM) {
                    String str3 = (String) obj5;
                    str3.getClass();
                    if (!ihc1.y0(str3)) {
                        arrayList4.add(obj5);
                    }
                }
                String strY0 = o7h.y0(arrayList4, ". ", (String) null, (String) null, (iu30) null, 62);
                String strN = songItem2.n();
                if (rx7Var != null) {
                    strN.getClass();
                    if (!ihc1.y0(strN)) {
                        str2 = strN;
                    }
                }
                return new laf1(wi90Var, rx7Var, strY0, str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chi0(int i, Object obj, lnm lnmVar, bju bjuVar, gw70 gw70Var) {
        super(2, lnmVar);
        this.c = i;
        this.d = obj;
        this.e = bjuVar;
        this.f = gw70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chi0(igi0 igi0Var, xtb0 xtb0Var, ven0 ven0Var, iu30 iu30Var, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = igi0Var;
        this.f = xtb0Var;
        this.g = ven0Var;
        this.h = iu30Var;
        this.i = hdn0Var;
    }
}
