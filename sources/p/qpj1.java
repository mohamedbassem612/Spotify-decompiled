package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qpj1 implements k1q0, hj71, Function, kq51, l381 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public qpj1(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                break;
            default:
                this.b = new jv81(0);
                this.c = new q5f0((Object) null);
                break;
        }
    }

    public static void z() {
        while (nbk1.d.a() != null) {
        }
    }

    public void A(w611 w611Var) {
        F(w611Var);
    }

    public f3a B(int i, w611 w611Var) {
        nbk1 nbk1Var;
        f3a f3aVar;
        jv81 jv81Var = (jv81) this.b;
        int iD = jv81Var.d(w611Var);
        if (iD >= 0 && (nbk1Var = (nbk1) jv81Var.i(iD)) != null) {
            int i2 = nbk1Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                nbk1Var.a = i3;
                if (i == 4) {
                    f3aVar = nbk1Var.b;
                } else if (i == 8) {
                    f3aVar = nbk1Var.c;
                } else {
                    hhg1.n("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    jv81Var.g(iD);
                    nbk1Var.a = 0;
                    nbk1Var.b = null;
                    nbk1Var.c = null;
                    nbk1.d.i(nbk1Var);
                }
                return f3aVar;
            }
        }
        return null;
    }

    public f3a C(w611 w611Var) {
        return B(8, w611Var);
    }

    public f3a D(w611 w611Var) {
        return B(4, w611Var);
    }

    public void E(mlw0 mlw0Var) {
        boolean zM;
        jv81 jv81Var = (jv81) this.b;
        for (int i = jv81Var.c - 1; i >= 0; i--) {
            w611 w611Var = (w611) jv81Var.f(i);
            nbk1 nbk1Var = (nbk1) jv81Var.g(i);
            int i2 = nbk1Var.a;
            if ((i2 & 3) == 3) {
                RecyclerView recyclerView = (RecyclerView) mlw0Var.b;
                a aVar = recyclerView.Q0;
                View view = w611Var.a;
                n611 n611Var = recyclerView.c;
                aVar.D0(view);
                n611Var.i(view);
            } else if ((i2 & 1) != 0) {
                f3a f3aVar = nbk1Var.b;
                if (f3aVar == null) {
                    RecyclerView recyclerView2 = (RecyclerView) mlw0Var.b;
                    a aVar2 = recyclerView2.Q0;
                    View view2 = w611Var.a;
                    n611 n611Var2 = recyclerView2.c;
                    aVar2.D0(view2);
                    n611Var2.i(view2);
                } else {
                    mlw0Var.i(w611Var, f3aVar, nbk1Var.c);
                }
            } else if ((i2 & 14) == 14) {
                mlw0Var.g(w611Var, nbk1Var.b, nbk1Var.c);
            } else if ((i2 & 12) == 12) {
                f3a f3aVar2 = nbk1Var.b;
                f3a f3aVar3 = nbk1Var.c;
                mlw0Var.getClass();
                w611Var.B(false);
                RecyclerView recyclerView3 = (RecyclerView) mlw0Var.b;
                boolean z = recyclerView3.g1;
                zw81 zw81Var = recyclerView3.p1;
                if (!z) {
                    zw81 zw81Var2 = zw81Var;
                    zw81Var2.getClass();
                    int i3 = f3aVar2.a;
                    int i4 = f3aVar3.a;
                    if (i3 == i4 && f3aVar2.b == f3aVar3.b) {
                        zw81Var2.d(w611Var);
                        zM = false;
                    } else {
                        zM = zw81Var2.m(w611Var, i3, f3aVar2.b, i4, f3aVar3.b);
                    }
                    if (zM) {
                        recyclerView3.h0();
                    }
                } else if (zw81Var.a(w611Var, w611Var, f3aVar2, f3aVar3)) {
                    recyclerView3.h0();
                }
            } else if ((i2 & 4) != 0) {
                mlw0Var.i(w611Var, nbk1Var.b, null);
            } else if ((i2 & 8) != 0) {
                mlw0Var.g(w611Var, nbk1Var.b, nbk1Var.c);
            }
            nbk1Var.a = 0;
            nbk1Var.b = null;
            nbk1Var.c = null;
            nbk1.d.i(nbk1Var);
        }
    }

    public void F(w611 w611Var) {
        nbk1 nbk1Var = (nbk1) ((jv81) this.b).get(w611Var);
        if (nbk1Var == null) {
            return;
        }
        nbk1Var.a &= -2;
    }

    public void G(w611 w611Var) {
        q5f0 q5f0Var = (q5f0) this.c;
        for (int i = q5f0Var.i() - 1; i >= 0; i--) {
            if (w611Var == q5f0Var.j(i)) {
                Object[] objArr = q5f0Var.c;
                Object obj = objArr[i];
                Object obj2 = qon1.a;
                if (obj == obj2) {
                    break;
                }
                objArr[i] = obj2;
                q5f0Var.a = true;
                break;
            }
        }
        nbk1 nbk1Var = (nbk1) ((jv81) this.b).remove(w611Var);
        if (nbk1Var != null) {
            nbk1Var.a = 0;
            nbk1Var.b = null;
            nbk1Var.c = null;
            nbk1.d.i(nbk1Var);
        }
    }

    public synchronized void H(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    oon1.H("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    oon1.H("PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.c = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((w4c0) this.c).z(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r6 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qpj1.apply(java.lang.Object):java.lang.Object");
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public int c(int i) {
        do {
            i = ((w4c0) this.c).E(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    public int d(int i) {
        do {
            i = ((w4c0) this.c).z(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    public int e(int i) {
        do {
            i = ((w4c0) this.c).E(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    public void f(w611 w611Var, f3a f3aVar) {
        jv81 jv81Var = (jv81) this.b;
        nbk1 nbk1VarA = (nbk1) jv81Var.get(w611Var);
        if (nbk1VarA == null) {
            nbk1VarA = nbk1.a();
            jv81Var.put(w611Var, nbk1VarA);
        }
        nbk1VarA.a |= 2;
        nbk1VarA.b = f3aVar;
    }

    public void g(w611 w611Var) {
        jv81 jv81Var = (jv81) this.b;
        nbk1 nbk1VarA = (nbk1) jv81Var.get(w611Var);
        if (nbk1VarA == null) {
            nbk1VarA = nbk1.a();
            jv81Var.put(w611Var, nbk1VarA);
        }
        nbk1VarA.a |= 1;
    }

    public void h(long j, w611 w611Var) {
        ((q5f0) this.c).g(j, w611Var);
    }

    public void i(w611 w611Var, f3a f3aVar) {
        jv81 jv81Var = (jv81) this.b;
        nbk1 nbk1VarA = (nbk1) jv81Var.get(w611Var);
        if (nbk1VarA == null) {
            nbk1VarA = nbk1.a();
            jv81Var.put(w611Var, nbk1VarA);
        }
        nbk1VarA.c = f3aVar;
        nbk1VarA.a |= 8;
    }

    public void j(w611 w611Var, f3a f3aVar) {
        jv81 jv81Var = (jv81) this.b;
        nbk1 nbk1VarA = (nbk1) jv81Var.get(w611Var);
        if (nbk1VarA == null) {
            nbk1VarA = nbk1.a();
            jv81Var.put(w611Var, nbk1VarA);
        }
        nbk1VarA.b = f3aVar;
        nbk1VarA.a |= 4;
    }

    public void k() {
        ((jv81) this.b).clear();
        ((q5f0) this.c).a();
    }

    public jgb1 l(String str, int i, int i2, Integer num, int i3, ezc ezcVar, iu30 iu30Var) {
        return new jgb1(str, Integer.valueOf(i2), (String) null, num, (sp00) null, (Integer) null, (a2i) null, (mr20) null, new f2g1(this, (byte) 10), ((lag) this.c).h(), new xxm0(p7h.M(new qxm0[]{new qxm0(1, 2131961962, (Integer) null, (b2i) null, (mr20) null, (wxm0) null, 1020), new qxm0(2, 2131961964, (Integer) null, (b2i) null, (mr20) null, (wxm0) null, 1020), new qxm0(3, 2131961957, (Integer) null, (b2i) null, (mr20) null, (wxm0) null, 1020), new qxm0(4, 2131961970, (Integer) null, (b2i) null, (mr20) null, (wxm0) null, 1020)}), Collections.singletonMap(0, Integer.valueOf(i3)), new oxm0(i), new uxm0(new ph11(ezcVar, (byte) 22), new t7i(iu30Var, (byte) 14)), (mxm0) null, 16), (Map) null, 73658);
    }

    public py9 m(String str) {
        String str2 = (str == null || str.length() == 0) ? "local_device" : str;
        if (!str2.equals((String) this.c)) {
            this.c = str2;
            this.b = new py9(str, r6h1.c, (byte) 24);
        }
        return (py9) this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.vb20 */
    /* JADX WARN: Code duplicated, block: B:119:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0133 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0103 A[LOOP:2: B:52:0x00fd->B:54:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    public Object n(k371 k371Var, lnm lnmVar) throws vb20 {
        List listL1;
        List listSingletonList;
        mmr0 mmr0Var;
        wa71 wa71Var;
        vb20 vb20Var;
        LinkedHashMap linkedHashMap;
        vb20 m231Var;
        vb20 vb20Var2;
        ArrayList arrayList;
        Iterator it;
        List list;
        Iterator it2;
        int i;
        switch (this.a) {
            case 7:
                Bundle bundle = k371Var.b;
                ArrayList<String> stringArrayList = bundle.getStringArrayList("voting.share.urls");
                if (stringArrayList == null) {
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("voting.results.share.urls");
                    if (stringArrayList2 != null) {
                        listL1 = o7h.l1(stringArrayList2);
                    }
                    return null;
                }
                listL1 = o7h.l1(stringArrayList);
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("voting.results.share.card.accessibility.texts");
                List listL2 = stringArrayList3 != null ? o7h.l1(stringArrayList3) : z6x.a;
                wa71 wa71Var2 = k371Var.a;
                if (wa71Var2 != null) {
                    Context context = (Context) this.b;
                    String str = wa71Var2.a;
                    String str2 = wa71Var2.e;
                    String string = context.getString(2131956653);
                    ArrayList<mmr0> arrayList2 = new ArrayList();
                    int i2 = 0;
                    for (Object obj : listL1) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str3 = (String) obj;
                        if (str3 == null) {
                            mmr0Var = null;
                        } else if ((!ihc1.y0(str3) ? str3 : null) != null) {
                            mmr0Var = new mmr0(str3, Integer.valueOf(i2));
                        } else {
                            mmr0Var = null;
                        }
                        if (mmr0Var != null) {
                            arrayList2.add(mmr0Var);
                        }
                        i2 = i3;
                    }
                    if (arrayList2.isEmpty()) {
                        listSingletonList = Collections.singletonList(new u771(new t771(new wa71(str, (String) null, (cqs0) null, (dqi1) null, str2, (String) null, (Bundle) null, 110), tyo1.p(blc0.mg, new String[0])), new pz61(new y171(rc11.a.b(zwy.class)), new exy((String) null, new n1f1(true), 0, false, new rhy((yny) null, 63), (bwe1) null, (cuu0) null), dz61.d, true), new bj71(w7x.a, true, (String) null)));
                    } else {
                        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                        for (mmr0 mmr0Var2 : arrayList2) {
                            String str4 = (String) mmr0Var2.a;
                            int iIntValue = ((Number) mmr0Var2.b).intValue();
                            f0a f0aVar = new f0a();
                            f0aVar.b = str;
                            Object objT0 = o7h.t0(iIntValue, listL2);
                            String str5 = (String) objT0;
                            if (str5 == null || ihc1.y0(str5)) {
                                objT0 = null;
                            }
                            String str6 = (String) objT0;
                            if (str6 == null) {
                                str6 = string;
                            }
                            f0aVar.h(new jlw0(str4, str6));
                            f0aVar.c = str2 == null ? "" : str2;
                            f0aVar.h = tyo1.p(blc0.mg, new String[0]);
                            arrayList3.add(f0aVar.p());
                        }
                        listSingletonList = arrayList3;
                    }
                    return new qj71(listSingletonList, 0, new quk(new va71((cmt) this.c)));
                }
                return null;
            default:
                Bundle bundle2 = k371Var.b;
                if (!u890.j(bundle2.getString("format.list.type"), "wrapped-2026-top100") || (wa71Var = k371Var.a) == null) {
                    return null;
                }
                String string2 = bundle2.getString("filter_pill_metadata");
                nfa0 nfa0Var = (nfa0) this.c;
                String str7 = wa71Var.a;
                if (ihc1.i0(str7, '?')) {
                    Uri uri = Uri.parse("https://open.spotify.com/?".concat(ihc1.T0(str7, '?', str7)));
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    int iS = zno1.s(q7h.U(queryParameterNames, 10));
                    vb20Var = null;
                    if (iS < 16) {
                        iS = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iS);
                    for (Object obj2 : queryParameterNames) {
                        String queryParameter = uri.getQueryParameter((String) obj2);
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        linkedHashMap.put(obj2, queryParameter);
                    }
                } else {
                    vb20Var = null;
                    linkedHashMap = b7x.a;
                }
                cqs0 cqs0VarG = mqo1.G(sqg0.O(linkedHashMap, wa71Var.c));
                if (string2 != null) {
                    try {
                        m231Var = (vb20) nfa0Var.a(string2, vb20.Companion.serializer());
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = vb20Var;
                    }
                    vb20Var2 = m231Var;
                    if (vb20Var2 != null) {
                        List list2 = vb20Var2.b;
                        if (!vb20Var2.a || list2.isEmpty()) {
                            vb20Var2 = vb20Var;
                        } else {
                            List list3 = list2;
                            if ((list3 instanceof Collection) && list3.isEmpty()) {
                                arrayList = new ArrayList(q7h.U(list3, 10));
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((gb20) it.next()).a);
                                }
                                if (o7h.j0(arrayList).size() == list2.size()) {
                                    list = list2;
                                    if (list instanceof Collection) {
                                        it2 = list.iterator();
                                        i = 0;
                                        while (it2.hasNext()) {
                                            if (!((gb20) it2.next()).c) {
                                            }
                                        }
                                    } else {
                                        it2 = list.iterator();
                                        i = 0;
                                        while (it2.hasNext()) {
                                            if (!((gb20) it2.next()).c) {
                                            }
                                        }
                                    }
                                    if (i > 1) {
                                        vb20Var2 = vb20Var;
                                    }
                                } else {
                                    vb20Var2 = vb20Var;
                                }
                            } else {
                                Iterator it3 = list3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        gb20 gb20Var = (gb20) it3.next();
                                        if (ihc1.y0(gb20Var.a) || ihc1.y0(gb20Var.b)) {
                                        }
                                    } else {
                                        arrayList = new ArrayList(q7h.U(list3, 10));
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((gb20) it.next()).a);
                                        }
                                        if (o7h.j0(arrayList).size() == list2.size()) {
                                            list = list2;
                                            if ((list instanceof Collection) || !list.isEmpty()) {
                                                it2 = list.iterator();
                                                i = 0;
                                                while (it2.hasNext()) {
                                                    if (!((gb20) it2.next()).c && (i = i + 1) < 0) {
                                                        p7h.S();
                                                        throw vb20Var;
                                                    }
                                                }
                                            } else {
                                                i = 0;
                                            }
                                            if (i > 1) {
                                            }
                                        }
                                    }
                                    vb20Var2 = vb20Var;
                                }
                            }
                        }
                    } else {
                        vb20Var2 = vb20Var;
                    }
                    break;
                } else {
                    vb20Var2 = vb20Var;
                }
                if (vb20Var2 != null) {
                    cqs0 cqs0VarRemove = ((dqs0) cqs0VarG).remove("spotify-apply-lenses").remove("spotify-clear-lenses");
                    Iterator it4 = vb20Var2.b.iterator();
                    Object obj3 = vb20Var;
                    boolean z = false;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (((gb20) next).c) {
                                if (!z) {
                                    z = true;
                                    obj3 = next;
                                }
                            }
                        } else if (!z) {
                        }
                        obj3 = vb20Var;
                    }
                    gb20 gb20Var2 = (gb20) obj3;
                    cqs0VarG = gb20Var2 != null ? cqs0VarRemove.put("spotify-apply-lenses", gb20Var2.a) : cqs0VarRemove.put("spotify-clear-lenses", "true");
                }
                return ((xaz0) this.b).n(new k371(wa71.a(wa71Var, ihc1.Y0(str7, '?'), cqs0VarG, vb20Var, 122), bundle2, k371Var.c, k371Var.d), lnmVar);
        }
    }

    public View o(int i, int i2, int i3, int i4) {
        i7k1 i7k1Var = (i7k1) this.c;
        j7k1 j7k1Var = (j7k1) this.b;
        int iB = j7k1Var.b();
        int iE = j7k1Var.e();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewF = j7k1Var.f(i);
            int iA = j7k1Var.a(viewF);
            int iG = j7k1Var.g(viewF);
            i7k1Var.b = iB;
            i7k1Var.c = iE;
            i7k1Var.d = iA;
            i7k1Var.e = iG;
            if (i3 != 0) {
                i7k1Var.a = i3;
                if (i7k1Var.a()) {
                    return viewF;
                }
            }
            if (i4 != 0) {
                i7k1Var.a = i4;
                if (i7k1Var.a()) {
                    view = viewF;
                }
            }
            i += i5;
        }
        return view;
    }

    public hp80 p() {
        o0i o0iVar = (o0i) ((q9l1) this.b).c.getValue();
        if (o0iVar != null) {
            return o0iVar.e;
        }
        return null;
    }

    public w611 q(long j) {
        return (w611) ((q5f0) this.c).b(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(int i, onm onmVar) {
        ypl1 ypl1Var;
        if (onmVar instanceof ypl1) {
            ypl1Var = (ypl1) onmVar;
            int i2 = ypl1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ypl1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ypl1Var = new ypl1(this, onmVar);
            }
        } else {
            ypl1Var = new ypl1(this, onmVar);
        }
        Object objB = ypl1Var.a;
        int i3 = ypl1Var.c;
        if (i3 == 0) {
            hm5.M(objB);
            ox5 ox5Var = (ox5) this.b;
            ypl1Var.c = 1;
            objB = ox5Var.b(i, ypl1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        Bundle bundle = (Bundle) objB;
        boolean z = ((Context) this.c).getResources().getConfiguration().orientation == 2;
        String str = z ? "appWidgetMaxWidth" : "appWidgetMinWidth";
        String str2 = z ? "appWidgetMinHeight" : "appWidgetMaxHeight";
        int i4 = bundle.getInt(str);
        int i5 = bundle.getInt(str2);
        return (i4 <= 0 || i5 <= 0) ? new Size(600, 337) : new Size(i4, i5);
    }

    public boolean s(w611 w611Var) {
        nbk1 nbk1Var = (nbk1) ((jv81) this.b).get(w611Var);
        return (nbk1Var == null || (nbk1Var.a & 1) == 0) ? false : true;
    }

    public boolean t(Object obj) {
        pyl1 pyl1Var = (pyl1) obj;
        return ((xyl1) ((e0t) this.c).e).a(pyl1Var.a.X) && pyl1Var.b;
    }

    public boolean u(w611 w611Var) {
        nbk1 nbk1Var = (nbk1) ((jv81) this.b).get(w611Var);
        return (nbk1Var == null || (nbk1Var.a & 4) == 0) ? false : true;
    }

    public boolean v(View view) {
        i7k1 i7k1Var = (i7k1) this.c;
        j7k1 j7k1Var = (j7k1) this.b;
        int iB = j7k1Var.b();
        int iE = j7k1Var.e();
        int iA = j7k1Var.a(view);
        int iG = j7k1Var.g(view);
        i7k1Var.b = iB;
        i7k1Var.c = iE;
        i7k1Var.d = iA;
        i7k1Var.e = iG;
        i7k1Var.a = 24579;
        return i7k1Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object w(onm onmVar) {
        lml1 lml1Var;
        String str = ((sml1) this.c).a;
        if (onmVar instanceof lml1) {
            lml1Var = (lml1) onmVar;
            int i = lml1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lml1Var.c = i - Integer.MIN_VALUE;
            } else {
                lml1Var = new lml1(this, onmVar);
            }
        } else {
            lml1Var = new lml1(this, onmVar);
        }
        Object objI = lml1Var.a;
        int i2 = lml1Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            Flowable flowable = ((v5n) this.b).a(str).toFlowable();
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(flowable);
            lml1Var.c = 1;
            objI = b5p1.i(kgeVar, lml1Var);
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
        String str2 = (String) objI;
        if (!ihc1.y0(str2) && !str2.equals(str)) {
            z = false;
        }
        return new zgm0(str2, z);
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        lls0 lls0Var = (lls0) this.b;
        cc9 cc9Var = (cc9) this.c;
        int i = cc9Var.a;
        int i2 = cc9Var.b;
        int i3 = cc9Var.c;
        boolean z = lls0Var.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) lls0Var.c;
        bottomSheetBehavior.s = hsl1Var.d();
        WeakHashMap weakHashMap = b8k1.a;
        boolean z2 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.n;
        if (z3) {
            int iA = hsl1Var.a();
            bottomSheetBehavior.r = iA;
            paddingBottom = iA + i3;
        }
        if (bottomSheetBehavior.o) {
            paddingLeft = hsl1Var.b() + (z2 ? i2 : i);
        }
        if (bottomSheetBehavior.p) {
            if (!z2) {
                i = i2;
            }
            paddingRight = hsl1Var.c() + i;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (z) {
            bottomSheetBehavior.l = hsl1Var.a.k().d;
        }
        if (!z3 && !z) {
            return hsl1Var;
        }
        bottomSheetBehavior.T();
        return hsl1Var;
    }

    public void y(nmx0 nmx0Var) {
        nmx0Var.toString();
        qrl0 qrl0Var = (qrl0) this.c;
        String str = nmx0Var.a;
        x6h1 x6h1VarC = qrl0Var.b.c();
        x6h1VarC.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        ((i8h1) this.b).f(k7h1Var.a(), (Set) null);
    }

    public /* synthetic */ qpj1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qpj1(i8h1 i8h1Var) {
        this.a = (byte) 18;
        this.b = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.c = new qrl0((byte) 10);
    }

    public qpj1(Flowable flowable, y4m1 y4m1Var, xyl1 xyl1Var) {
        this.a = (byte) 22;
        this.b = y4m1Var;
        this.c = xyl1Var;
        vbm[] vbmVarArr = q601.a;
        new afb1((lnm) null, this, (byte) 17);
        int i = hu20.a;
    }

    public qpj1(qa2 qa2Var, h7l0 h7l0Var) {
        this.a = (byte) 5;
        this.b = h7l0Var;
        this.c = new idd1(new bkk1(qa2Var, (byte) 2));
    }

    public /* synthetic */ qpj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qpj1(e0t e0tVar) {
        this.a = (byte) 21;
        this.c = e0tVar;
        this.b = e0tVar.d;
    }

    public qpj1(qeh1 qeh1Var) {
        this.a = (byte) 13;
        this.b = qeh1Var;
        this.c = BehaviorSubject.f();
    }

    public qpj1(j7k1 j7k1Var) {
        this.a = (byte) 2;
        this.b = j7k1Var;
        i7k1 i7k1Var = new i7k1();
        i7k1Var.a = 0;
        this.c = i7k1Var;
    }
}
