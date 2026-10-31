package p;

import android.content.Context;
import app.rive.runtime.kotlin.fonts.FontFallbackStrategy;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k6b1 implements FontFallbackStrategy {
    public static final List h = p7h.M(new Integer[]{2131296269, 2131296274, 2131296277});
    public final sb91 a;
    public final iu30 b;
    public final AtomicReference c;
    public g6b1 d;
    public g6b1 e;
    public List f;
    public boolean g;

    public k6b1(Context context) {
        sb91 sb91Var = new sb91(context, null, (byte) 17);
        v3b1 v3b1Var = v3b1.f;
        this.a = sb91Var;
        this.b = v3b1Var;
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        while (true) {
            z6x z6xVar = z6x.a;
            if (i >= 3) {
                this.c = new AtomicReference(arrayList);
                this.f = z6xVar;
                return;
            } else {
                arrayList.add(z6xVar);
                i++;
            }
        }
    }

    public static final h6b1 b(IdentityHashMap identityHashMap, k6b1 k6b1Var, byte[] bArr) {
        Object h6b1Var = identityHashMap.get(bArr);
        if (h6b1Var == null) {
            h6b1Var = new h6b1(bArr, ((Number) k6b1Var.b.invoke(bArr)).intValue());
            identityHashMap.put(bArr, h6b1Var);
        }
        return (h6b1) h6b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0285  */
    /* JADX WARN: Code duplicated, block: B:151:0x0289  */
    /* JADX WARN: Code duplicated, block: B:152:0x028b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) throws Throwable {
        j6b1 j6b1Var;
        boolean z;
        String strS;
        boolean z2;
        g6b1 g6b1Var;
        i6b1 i6b1Var;
        int i;
        boolean z3;
        ArrayList arrayList;
        int i2;
        g6b1 g6b1Var2;
        if (onmVar instanceof j6b1) {
            j6b1Var = (j6b1) onmVar;
            int i3 = j6b1Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j6b1Var.e = i3 - Integer.MIN_VALUE;
            } else {
                j6b1Var = new j6b1(this, onmVar);
            }
        } else {
            j6b1Var = new j6b1(this, onmVar);
        }
        Object objInvoke = j6b1Var.c;
        int i4 = j6b1Var.e;
        rih1 rih1Var = rih1.a;
        try {
            try {
                try {
                    try {
                        if (i4 == 0) {
                            hm5.M(objInvoke);
                            op71.x(j6b1Var.getContext());
                            String strS2 = upn1.s();
                            Map map = dj31.a;
                            g6b1Var = new g6b1(strS2, ca30.a);
                            g6b1 g6b1Var3 = this.d;
                            i4 = (g6b1Var3 == null || !g6b1Var3.a(g6b1Var)) ? 0 : 1;
                            if (i4 == 0 || this.g) {
                                sb91 sb91Var = this.a;
                                j6b1Var.a = g6b1Var;
                                j6b1Var.b = i4;
                                j6b1Var.e = 1;
                                objInvoke = sb91Var.invoke(g6b1Var, j6b1Var);
                                d9n d9nVar = d9n.a;
                                if (objInvoke == d9nVar) {
                                    return d9nVar;
                                }
                            }
                            return rih1Var;
                        }
                        if (i4 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = j6b1Var.b;
                        g6b1Var = j6b1Var.a;
                        hm5.M(objInvoke);
                        String strS3 = upn1.s();
                        Map map2 = dj31.a;
                        if (g6b1Var.a(new g6b1(strS3, ca30.a))) {
                            ArrayList<List> arrayList2 = i6b1Var.a;
                            ArrayList arrayList3 = i6b1Var.c;
                            Exception exc = i6b1Var.b;
                            if (arrayList2.isEmpty()) {
                                z3 = true;
                                break;
                            }
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                if (!((List) it.next()).isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                            }
                            if (z3) {
                                i = i4;
                            } else {
                                IdentityHashMap identityHashMap = new IdentityHashMap();
                                boolean z4 = (exc == null || (g6b1Var2 = this.e) == null || !g6b1Var2.a(g6b1Var)) ? false : true;
                                if (z4) {
                                    tr80 tr80VarK = p7h.K(arrayList2);
                                    ArrayList arrayList4 = new ArrayList(q7h.U(tr80VarK, 10));
                                    lr80 it2 = tr80VarK.iterator();
                                    while (((sr80) it2).c) {
                                        try {
                                            int iNextInt = it2.nextInt();
                                            List list = (List) o7h.t0(iNextInt, arrayList3);
                                            List list2 = z6x.a;
                                            if (list == null) {
                                                list = list2;
                                            }
                                            List list3 = list;
                                            List list4 = (List) o7h.t0(iNextInt, this.f);
                                            if (list4 != null) {
                                                list2 = list4;
                                            }
                                            ArrayList arrayListN0 = o7h.N0(list2, list3);
                                            HashSet hashSet = new HashSet();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (Object obj : arrayListN0) {
                                                i2 = i4;
                                                try {
                                                    if (hashSet.add(b(identityHashMap, this, (byte[]) obj))) {
                                                        arrayList5.add(obj);
                                                    }
                                                    i4 = i2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i4 = i2;
                                                    z = false;
                                                    strS = upn1.s();
                                                    Map map3 = dj31.a;
                                                    if (g6b1Var.a(new g6b1(strS, ca30.a))) {
                                                        this.d = g6b1Var;
                                                        if (i4 == 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = z;
                                                        }
                                                        this.g = z2;
                                                    }
                                                    throw th;
                                                }
                                            }
                                            int i5 = i4;
                                            arrayList4.add(arrayList5);
                                            i4 = i5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i2 = i4;
                                        }
                                    }
                                    arrayList3 = arrayList4;
                                }
                                i = i4;
                                AtomicReference atomicReference = this.c;
                                if (z4) {
                                    List list5 = (List) atomicReference.get();
                                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                                    Iterator it3 = arrayList2.iterator();
                                    int i6 = 0;
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            p7h.T();
                                            throw 0;
                                        }
                                        ArrayList arrayListN1 = o7h.N0((Iterable) list5.get(i6), o7h.N0((List) next, (Collection) arrayList3.get(i6)));
                                        HashSet hashSet2 = new HashSet();
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj2 : arrayListN1) {
                                            Iterator it4 = it3;
                                            if (hashSet2.add(b(identityHashMap, this, (byte[]) obj2))) {
                                                arrayList6.add(obj2);
                                            }
                                            it3 = it4;
                                        }
                                        arrayList.add(arrayList6);
                                        i6 = i7;
                                        it3 = it3;
                                    }
                                } else {
                                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                                    for (List list6 : arrayList2) {
                                        HashSet hashSet3 = new HashSet();
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj3 : list6) {
                                            if (hashSet3.add(b(identityHashMap, this, (byte[]) obj3))) {
                                                arrayList7.add(obj3);
                                            }
                                        }
                                        arrayList.add(arrayList7);
                                    }
                                }
                                List list7 = (List) atomicReference.getAndSet(arrayList);
                                try {
                                    FontFallbackStrategy.Companion companion = FontFallbackStrategy.Companion;
                                    if (companion.getStylePicker() != this) {
                                        companion.setStylePicker(this);
                                    } else {
                                        companion.cppResetFontCache();
                                    }
                                    this.e = g6b1Var;
                                    this.f = arrayList3;
                                } catch (Throwable th3) {
                                    atomicReference.set(list7);
                                    throw th3;
                                }
                            }
                            try {
                                this.d = g6b1Var;
                                this.g = i == 0 && (z3 || exc != null);
                                if (exc != null) {
                                    z = false;
                                    try {
                                        Logger.l(exc, "Rive font fallback preparation was incomplete", new Object[0]);
                                        return rih1Var;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i4 = i;
                                        strS = upn1.s();
                                        Map map4 = dj31.a;
                                        if (g6b1Var.a(new g6b1(strS, ca30.a))) {
                                            this.d = g6b1Var;
                                            if (i4 == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = z;
                                            }
                                            this.g = z2;
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z = false;
                                i4 = i;
                                strS = upn1.s();
                                Map map5 = dj31.a;
                                if (g6b1Var.a(new g6b1(strS, ca30.a))) {
                                    this.d = g6b1Var;
                                    if (i4 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = z;
                                    }
                                    this.g = z2;
                                }
                                throw th;
                            }
                        }
                        return rih1Var;
                    } catch (Throwable th6) {
                        th = th6;
                        i = i4;
                    }
                    i6b1Var = (i6b1) objInvoke;
                    op71.x(j6b1Var.getContext());
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final List getFont(Fonts.Weight weight) {
        int i;
        List list = (List) this.c.get();
        if (weight.getWeight() <= 500) {
            i = 0;
        } else {
            i = weight.getWeight() <= 800 ? 1 : 2;
        }
        return (List) list.get(i);
    }
}
