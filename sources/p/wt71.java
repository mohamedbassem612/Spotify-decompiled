package p;

import android.content.Context;
import com.spotify.sharedpreferencessizesampler.events.proto.SharedPreferencesFileSizeSnapshotEvent;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wt71 implements dwo {
    public final Context a;
    public final dma1 b;
    public final gma1 c;
    public final Observable d;
    public final llm e;
    public final by40 f;
    public final int g;

    public wt71(Context context, s35 s35Var, dma1 dma1Var, gma1 gma1Var, Observable observable, t2j0 t2j0Var, q8n q8nVar) {
        this.a = context;
        this.b = dma1Var;
        this.c = gma1Var;
        this.d = observable;
        llm llmVarE = smo1.e(flo1.l(guo1.B(), q8nVar).y(new z8n("shared-preferences-size-sampler")).y(new v62(olj0.T0, (byte) 20)));
        this.e = llmVarE;
        this.f = new by40(t2j0Var);
        this.g = s35Var.a();
        fn31.T(llmVarE, (o8n) null, 0, new b751(this, null, (byte) 16), 3);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0278  */
    /* JADX WARN: Code duplicated, block: B:104:0x027f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0291 A[LOOP:8: B:106:0x028b->B:108:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02db  */
    /* JADX WARN: Code duplicated, block: B:123:0x02de  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:144:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e A[LOOP:1: B:44:0x0138->B:46:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0162  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:60:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x0216 A[LOOP:6: B:83:0x0210->B:85:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0222  */
    /* JADX WARN: Code duplicated, block: B:88:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x0239 A[LOOP:7: B:90:0x0233->B:92:0x0239, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x024e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0250  */
    /* JADX WARN: Code duplicated, block: B:99:0x0262  */
    public final Object a(onm onmVar) {
        vt71 vt71Var;
        ArrayList arrayList;
        Iterator it;
        Object obj;
        boolean z;
        nfh0 nfh0Var;
        ArrayList arrayList2;
        Iterator it2;
        boolean z2;
        Object obj2;
        nfh0 nfh0Var2;
        Iterator it3;
        long j;
        long j2;
        Iterator it4;
        long j3;
        Iterator it5;
        Long lValueOf;
        Long lValueOf2;
        long jLongValue;
        Iterator it6;
        long j4;
        Iterator it7;
        Long lValueOf3;
        Long lValueOf4;
        long jLongValue2;
        int i;
        int i2;
        Object next;
        nfh0 nfh0Var3;
        Object next2;
        File file;
        if (onmVar instanceof vt71) {
            vt71Var = (vt71) onmVar;
            int i3 = vt71Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vt71Var.c = i3 - Integer.MIN_VALUE;
            } else {
                vt71Var = new vt71(this, onmVar);
            }
        } else {
            vt71Var = new vt71(this, onmVar);
        }
        Object objJ = vt71Var.a;
        int i4 = vt71Var.c;
        yt71 yt71Var = null;
        if (i4 == 0) {
            hm5.M(objJ);
            ezc ezcVarG = yoi1.g(this.d);
            ck01 ck01Var = new ck01(2, (lnm) null, (byte) 17);
            vt71Var.c = 1;
            objJ = b5p1.j(ezcVarG, ck01Var, vt71Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        String str = (String) objJ;
        int i5 = hu50.a;
        String str2 = "user-" + fu50.a.F(str, Charset.defaultCharset()) + ".xml";
        fma1 fma1VarA = this.c.a();
        Context context = this.a;
        ima1 ima1VarB = fma1VarA.b(context, str);
        File file2 = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        int size = o7h.p1(this.b.o().getAll().keySet()).size();
        int size2 = o7h.p1(ima1VarB.o().getAll().keySet()).size();
        if (file2.isDirectory()) {
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles != null) {
                List listQ0 = f46.Q0(fileArrListFiles);
                if ((listQ0 instanceof Collection) && listQ0.isEmpty()) {
                    ArrayList<File> arrayList3 = new ArrayList();
                    while (r7.hasNext()) {
                        file = (File) obj;
                        if (!file.isFile()) {
                        }
                    }
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    for (File file3 : arrayList3) {
                        file3.getClass();
                        arrayList.add(new nfh0(file3, file3.length()));
                    }
                    it = arrayList.iterator();
                    obj = null;
                    z = false;
                    while (true) {
                        if (it.hasNext()) {
                            if (z) {
                                break;
                            }
                            break;
                        }
                        next2 = it.next();
                        if (!u890.j(((nfh0) next2).a.getName(), "spotify_preferences.xml")) {
                            if (z) {
                                z = true;
                                obj = next2;
                            }
                        }
                        obj = null;
                        break;
                    }
                    nfh0Var = (nfh0) obj;
                    arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (nhc1.Y(((nfh0) obj3).a.getName(), "user-", false)) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    while (r12.hasNext()) {
                        nfh0Var3 = (nfh0) obj;
                        if (u890.j(nfh0Var3.a.getName(), "spotify_preferences.xml")) {
                        }
                    }
                    it2 = arrayList2.iterator();
                    z2 = false;
                    obj2 = null;
                    while (true) {
                        if (it2.hasNext()) {
                            if (z2) {
                                break;
                            }
                            break;
                        }
                        next = it2.next();
                        if (!u890.j(((nfh0) next).a.getName(), str2)) {
                            if (z2) {
                                z2 = true;
                                obj2 = next;
                            }
                        }
                        obj2 = null;
                        break;
                    }
                    nfh0Var2 = (nfh0) obj2;
                    int size3 = arrayList.size();
                    it3 = arrayList.iterator();
                    j = 0;
                    while (it3.hasNext()) {
                        j += ((nfh0) it3.next()).b;
                    }
                    if (nfh0Var != null) {
                        j2 = nfh0Var.b;
                    } else {
                        j2 = 0;
                    }
                    int size4 = arrayList2.size();
                    it4 = arrayList2.iterator();
                    j3 = 0;
                    while (it4.hasNext()) {
                        j3 += ((nfh0) it4.next()).b;
                    }
                    it5 = arrayList2.iterator();
                    if (it5.hasNext()) {
                        lValueOf = Long.valueOf(((nfh0) it5.next()).b);
                        while (it5.hasNext()) {
                            lValueOf2 = Long.valueOf(((nfh0) it5.next()).b);
                            if (lValueOf.compareTo(lValueOf2) < 0) {
                                lValueOf = lValueOf2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    int size5 = arrayList4.size();
                    it6 = arrayList4.iterator();
                    j4 = 0;
                    while (it6.hasNext()) {
                        j4 += ((nfh0) it6.next()).b;
                    }
                    it7 = arrayList4.iterator();
                    if (it7.hasNext()) {
                        lValueOf3 = Long.valueOf(((nfh0) it7.next()).b);
                        while (it7.hasNext()) {
                            lValueOf4 = Long.valueOf(((nfh0) it7.next()).b);
                            if (lValueOf3.compareTo(lValueOf4) < 0) {
                                lValueOf3 = lValueOf4;
                            }
                        }
                    } else {
                        lValueOf3 = null;
                    }
                    if (lValueOf3 != null) {
                        jLongValue2 = lValueOf3.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    if (nfh0Var == null) {
                        i = 0;
                    } else {
                        i = size;
                    }
                    long j5 = nfh0Var2 != null ? nfh0Var2.b : 0L;
                    if (nfh0Var2 == null) {
                        i2 = 0;
                    } else {
                        i2 = size2;
                    }
                    yt71Var = new yt71(size3, j, j2, size4, j3, jLongValue, size5, j4, jLongValue2, i, j5, i2);
                } else {
                    Iterator it8 = listQ0.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            File file4 = (File) it8.next();
                            if (!file4.isFile() || !nhc1.R(file4.getName(), ".bak", false)) {
                            }
                        } else {
                            ArrayList<File> arrayList5 = new ArrayList();
                            for (Object obj4 : listQ0) {
                                file = (File) obj4;
                                if (!file.isFile() && nhc1.R(file.getName(), ".xml", false)) {
                                    arrayList5.add(obj4);
                                }
                            }
                            arrayList = new ArrayList(q7h.U(arrayList5, 10));
                            while (r7.hasNext()) {
                                file3.getClass();
                                arrayList.add(new nfh0(file3, file3.length()));
                            }
                            it = arrayList.iterator();
                            obj = null;
                            z = false;
                            while (true) {
                                if (it.hasNext()) {
                                    if (z) {
                                        break;
                                    }
                                    break;
                                }
                                next2 = it.next();
                                if (!u890.j(((nfh0) next2).a.getName(), "spotify_preferences.xml")) {
                                    if (z) {
                                        z = true;
                                        obj = next2;
                                    }
                                }
                                obj = null;
                                break;
                            }
                            nfh0Var = (nfh0) obj;
                            arrayList2 = new ArrayList();
                            while (r9.hasNext()) {
                                if (nhc1.Y(((nfh0) obj3).a.getName(), "user-", false)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : arrayList) {
                                nfh0Var3 = (nfh0) obj5;
                                if (u890.j(nfh0Var3.a.getName(), "spotify_preferences.xml") && !nhc1.Y(nfh0Var3.a.getName(), "user-", false)) {
                                    arrayList6.add(obj5);
                                }
                            }
                            it2 = arrayList2.iterator();
                            z2 = false;
                            obj2 = null;
                            while (true) {
                                if (it2.hasNext()) {
                                    if (z2) {
                                        break;
                                    }
                                    break;
                                }
                                next = it2.next();
                                if (!u890.j(((nfh0) next).a.getName(), str2)) {
                                    if (z2) {
                                        z2 = true;
                                        obj2 = next;
                                    }
                                }
                                obj2 = null;
                                break;
                            }
                            nfh0Var2 = (nfh0) obj2;
                            int size6 = arrayList.size();
                            it3 = arrayList.iterator();
                            j = 0;
                            while (it3.hasNext()) {
                                j += ((nfh0) it3.next()).b;
                            }
                            if (nfh0Var != null) {
                                j2 = nfh0Var.b;
                            } else {
                                j2 = 0;
                            }
                            int size7 = arrayList2.size();
                            it4 = arrayList2.iterator();
                            j3 = 0;
                            while (it4.hasNext()) {
                                j3 += ((nfh0) it4.next()).b;
                            }
                            it5 = arrayList2.iterator();
                            if (it5.hasNext()) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(((nfh0) it5.next()).b);
                                while (it5.hasNext()) {
                                    lValueOf2 = Long.valueOf(((nfh0) it5.next()).b);
                                    if (lValueOf.compareTo(lValueOf2) < 0) {
                                        lValueOf = lValueOf2;
                                    }
                                }
                            }
                            if (lValueOf != null) {
                                jLongValue = lValueOf.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            int size8 = arrayList6.size();
                            it6 = arrayList6.iterator();
                            j4 = 0;
                            while (it6.hasNext()) {
                                j4 += ((nfh0) it6.next()).b;
                            }
                            it7 = arrayList6.iterator();
                            if (it7.hasNext()) {
                                lValueOf3 = null;
                            } else {
                                lValueOf3 = Long.valueOf(((nfh0) it7.next()).b);
                                while (it7.hasNext()) {
                                    lValueOf4 = Long.valueOf(((nfh0) it7.next()).b);
                                    if (lValueOf3.compareTo(lValueOf4) < 0) {
                                        lValueOf3 = lValueOf4;
                                    }
                                }
                            }
                            if (lValueOf3 != null) {
                                jLongValue2 = lValueOf3.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            if (nfh0Var == null) {
                                i = 0;
                            } else {
                                i = size;
                            }
                            long j6 = nfh0Var2 != null ? nfh0Var2.b : 0L;
                            if (nfh0Var2 == null) {
                                i2 = 0;
                            } else {
                                i2 = size2;
                            }
                            yt71Var = new yt71(size6, j, j2, size7, j3, jLongValue, size8, j4, jLongValue2, i, j6, i2);
                        }
                    }
                }
            } else {
                yt71Var = null;
            }
        }
        if (yt71Var != null) {
            by40 by40Var = this.f;
            by40Var.getClass();
            zt71 zt71VarN = SharedPreferencesFileSizeSnapshotEvent.n();
            zt71VarN.r(yt71Var.a);
            zt71VarN.x(yt71Var.b);
            zt71VarN.t(yt71Var.c);
            zt71VarN.s(yt71Var.j);
            zt71VarN.y(yt71Var.d);
            zt71VarN.A(yt71Var.e);
            zt71VarN.z(yt71Var.f);
            zt71VarN.q(yt71Var.k);
            zt71VarN.n(yt71Var.l);
            zt71VarN.u(yt71Var.g);
            zt71VarN.w(yt71Var.h);
            zt71VarN.v(yt71Var.i);
            SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) zt71VarN.build();
            t2j0 t2j0Var = by40Var.a;
            sharedPreferencesFileSizeSnapshotEvent.getClass();
            t2j0Var.a(sharedPreferencesFileSizeSnapshotEvent);
        }
        return rih1.a;
    }

    public final void shutdown() {
        smo1.p(this.e, (CancellationException) null);
    }
}
