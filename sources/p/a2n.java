package p;

import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a2n {
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public static final bma1 k;
    public static final bma1 l;
    public static final bma1 m;
    public static final bma1 n;
    public static final bma1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bma1 f4p;
    public final Single a;
    public final yqg b;
    public final gy2 c;
    public final dlf d;
    public final c9n e;

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("martini_gateway_conversation_id");
        g = nbcVar.u("martini_gateway_conversation_last_activity_at_ms");
        h = nbcVar.u("martini_gateway_last_activity_by_conversation");
        i = nbcVar.u("martini_playback_conversation_id");
        j = nbcVar.u("martini_linked_surfaces");
        k = nbcVar.u("martini_last_response_text");
        l = nbcVar.u("martini_last_response_message_id");
        m = nbcVar.u("martini_last_response_conversation_id");
        n = nbcVar.u("martini_last_responses_by_conversation");
        o = nbcVar.u("martini_gateway_start_new_surfaces");
        f4p = nbcVar.u("martini_gateway_force_new_conversation");
    }

    public a2n(Single single, yqg yqgVar, gy2 gy2Var, dlf dlfVar, c9n c9nVar) {
        this.a = single;
        this.b = yqgVar;
        this.c = gy2Var;
        this.d = dlfVar;
        this.e = c9nVar;
    }

    public static String i(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!ihc1.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return o7h.y0(o7h.Z0(arrayList), "\t", null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable A(onm onmVar) {
        g1n g1nVar;
        if (onmVar instanceof g1n) {
            g1nVar = (g1n) onmVar;
            int i2 = g1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                g1nVar = new g1n(this, onmVar);
            }
        } else {
            g1nVar = new g1n(this, onmVar);
        }
        Object objT = g1nVar.a;
        int i3 = g1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            g1nVar.c = 1;
            objT = T(g1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        String strE = ((dma1) objT).e(j, (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strE != null && strE.length() != 0) {
            Iterator it = ihc1.P0(strE, new char[]{'\n'}, 6).iterator();
            while (it.hasNext()) {
                List listP0 = ihc1.P0((String) it.next(), new char[]{'\t'}, 6);
                String str = (String) o7h.s0(listP0);
                if (str != null) {
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int size = listP0.size();
                        for (int i4 = 1; i4 < size; i4++) {
                            Object obj = listP0.get(i4);
                            if (ihc1.y0((String) obj)) {
                                obj = null;
                            }
                            String str2 = (String) obj;
                            if (str2 != null) {
                                linkedHashSet.add(str2);
                            }
                        }
                        linkedHashMap.put(str, linkedHashSet);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(onm onmVar) {
        h1n h1nVar;
        if (onmVar instanceof h1n) {
            h1nVar = (h1n) onmVar;
            int i2 = h1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                h1nVar = new h1n(this, onmVar);
            }
        } else {
            h1nVar = new h1n(this, onmVar);
        }
        Object objT = h1nVar.a;
        int i3 = h1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            h1nVar.c = 1;
            objT = T(h1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        String strE = ((dma1) objT).e(i, (String) null);
        if (strE == null || ihc1.y0(strE)) {
            return null;
        }
        return strE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable C(onm onmVar) {
        i1n i1nVar;
        if (onmVar instanceof i1n) {
            i1nVar = (i1n) onmVar;
            int i2 = i1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                i1nVar = new i1n(this, onmVar);
            }
        } else {
            i1nVar = new i1n(this, onmVar);
        }
        Object objT = i1nVar.a;
        int i3 = i1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            i1nVar.c = 1;
            objT = T(i1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        String strE = ((dma1) objT).e(o, (String) null);
        if (strE == null || strE.length() == 0) {
            return new LinkedHashSet();
        }
        List listP0 = ihc1.P0(strE, new char[]{'\t'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (!ihc1.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o7h.h1(arrayList, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(onm onmVar) {
        j1n j1nVar;
        if (onmVar instanceof j1n) {
            j1nVar = (j1n) onmVar;
            int i2 = j1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                j1nVar = new j1n(this, onmVar);
            }
        } else {
            j1nVar = new j1n(this, onmVar);
        }
        Object objT = j1nVar.a;
        int i3 = j1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            j1nVar.c = 1;
            objT = T(j1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        String strE = ((dma1) objT).e(f, (String) null);
        if (strE == null || ihc1.y0(strE)) {
            return null;
        }
        return strE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, onm onmVar) {
        k1n k1nVar;
        LinkedHashSet linkedHashSet;
        dma1 dma1Var;
        boolean zIsEmpty;
        bma1 bma1Var;
        if (onmVar instanceof k1n) {
            k1nVar = (k1n) onmVar;
            int i2 = k1nVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k1nVar.e = i2 - Integer.MIN_VALUE;
            } else {
                k1nVar = new k1n(this, onmVar);
            }
        } else {
            k1nVar = new k1n(this, onmVar);
        }
        Object objC = k1nVar.c;
        int i3 = k1nVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objC);
            k1nVar.a = str;
            k1nVar.e = 1;
            objC = C(k1nVar);
            if (objC != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            str = k1nVar.a;
            hm5.M(objC);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashSet = k1nVar.b;
            hm5.M(objC);
        }
        dma1Var = (dma1) objC;
        zIsEmpty = linkedHashSet.isEmpty();
        bma1Var = o;
        if (zIsEmpty) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.f(bma1Var);
            hma1VarEdit.h();
            return rih1Var;
        }
        hma1 hma1VarEdit2 = dma1Var.edit();
        hma1VarEdit2.d(bma1Var, i(linkedHashSet));
        hma1VarEdit2.h();
        return rih1Var;
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) objC;
        if (!linkedHashSet2.remove(str)) {
            return rih1Var;
        }
        k1nVar.a = null;
        k1nVar.b = linkedHashSet2;
        k1nVar.e = 2;
        Object objT = T(k1nVar);
        if (objT != d9nVar) {
            objC = objT;
            linkedHashSet = linkedHashSet2;
            dma1Var = (dma1) objC;
            zIsEmpty = linkedHashSet.isEmpty();
            bma1Var = o;
            if (zIsEmpty) {
                hma1 hma1VarEdit3 = dma1Var.edit();
                hma1VarEdit3.f(bma1Var);
                hma1VarEdit3.h();
                return rih1Var;
            }
            hma1 hma1VarEdit4 = dma1Var.edit();
            hma1VarEdit4.d(bma1Var, i(linkedHashSet));
            hma1VarEdit4.h();
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01df  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e0 A[DONT_INVERT, PHI: r0 r12 r13
      0x01e0: PHI (r0v19 java.lang.String) = (r0v17 java.lang.String), (r0v17 java.lang.String), (r0v22 java.lang.String) binds: [B:93:0x01c0, B:100:0x01df, B:99:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r12v24 int) = (r12v22 int), (r12v22 int), (r12v25 int) binds: [B:93:0x01c0, B:100:0x01df, B:99:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r13v43 java.lang.String) = (r13v38 java.lang.String), (r13v40 java.lang.String), (r13v46 java.lang.String) binds: [B:93:0x01c0, B:100:0x01df, B:99:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:109:0x0200  */
    /* JADX WARN: Code duplicated, block: B:115:0x0221 A[PHI: r1 r12
      0x0221: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v7 java.lang.String) binds: [B:108:0x01fe, B:113:0x021e] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r12v30 int) = (r12v27 int), (r12v31 int) binds: [B:108:0x01fe, B:113:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0224 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x0225  */
    /* JADX WARN: Code duplicated, block: B:123:0x0247  */
    /* JADX WARN: Code duplicated, block: B:125:0x024d  */
    /* JADX WARN: Code duplicated, block: B:128:0x025a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0260  */
    /* JADX WARN: Code duplicated, block: B:136:0x0288  */
    /* JADX WARN: Code duplicated, block: B:139:0x028d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:141:0x028f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0295  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02de  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:173:0x0312 A[DONT_INVERT, PHI: r12
      0x0312: PHI (r12v48 java.lang.String) = 
      (r12v5 java.lang.String)
      (r12v42 java.lang.String)
      (r12v44 java.lang.String)
      (r12v46 java.lang.String)
      (r12v50 java.lang.String)
     binds: [B:59:0x012e, B:154:0x02c5, B:159:0x02db, B:166:0x02f9, B:171:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x0314  */
    /* JADX WARN: Code duplicated, block: B:177:0x0323 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x0324  */
    /* JADX WARN: Code duplicated, block: B:181:0x0335 A[PHI: r12 r13
      0x0335: PHI (r12v52 java.lang.String) = (r12v48 java.lang.String), (r12v55 java.lang.String) binds: [B:179:0x0332, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0335: PHI (r13v79 java.lang.Object) = (r13v76 java.lang.Object), (r13v1 java.lang.Object) binds: [B:179:0x0332, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0340  */
    /* JADX WARN: Code duplicated, block: B:186:0x0344  */
    /* JADX WARN: Code duplicated, block: B:188:0x0350  */
    /* JADX WARN: Code duplicated, block: B:191:0x0361 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:192:0x0362  */
    /* JADX WARN: Code duplicated, block: B:194:0x036a  */
    /* JADX WARN: Code duplicated, block: B:196:0x037a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:197:0x037b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:198:0x037c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x037f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r0 r12 r13
      0x0065: PHI (r0v48 java.lang.String) = (r0v46 java.lang.String), (r0v52 java.lang.String) binds: [B:151:0x02bb, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r12v41 int) = (r12v39 int), (r12v43 int) binds: [B:151:0x02bb, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r13v64 java.lang.Object) = (r13v63 java.lang.Object), (r13v1 java.lang.Object) binds: [B:151:0x02bb, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[PHI: r0 r1 r12 r13
      0x0086: PHI (r0v31 java.lang.String) = (r0v27 java.lang.String), (r0v44 java.lang.String) binds: [B:119:0x0239, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r1v9 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:119:0x0239, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r12v33 int) = (r12v29 int), (r12v35 int) binds: [B:119:0x0239, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r13v55 java.lang.Object) = (r13v51 java.lang.Object), (r13v1 java.lang.Object) binds: [B:119:0x0239, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r12 r13
      0x00e1: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String) binds: [B:51:0x010f, B:41:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r13v9 java.lang.Object) = (r13v8 java.lang.Object), (r13v1 java.lang.Object) binds: [B:51:0x010f, B:41:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a A[PHI: r0 r12
      0x015a: PHI (r0v8 java.lang.String) = (r0v4 java.lang.String), (r0v4 java.lang.String), (r0v10 java.lang.String) binds: [B:62:0x0138, B:64:0x0140, B:70:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r12v12 java.lang.String) = (r12v5 java.lang.String), (r12v5 java.lang.String), (r12v14 java.lang.String) binds: [B:62:0x0138, B:64:0x0140, B:70:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[PHI: r0 r12
      0x015f: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v10 java.lang.String) binds: [B:60:0x0130, B:70:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r12v7 java.lang.String) = (r12v5 java.lang.String), (r12v14 java.lang.String) binds: [B:60:0x0130, B:70:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0164  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018e A[PHI: r0 r2 r12 r13
      0x018e: PHI (r0v15 java.lang.String) = (r0v12 java.lang.String), (r0v16 java.lang.String) binds: [B:81:0x018a, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:81:0x018a, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r12v19 int) = (r12v16 int), (r12v21 int) binds: [B:81:0x018a, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r13v34 java.lang.Object) = (r13v31 java.lang.Object), (r13v1 java.lang.Object) binds: [B:81:0x018a, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa A[PHI: r0 r2 r12
      0x01aa: PHI (r0v14 java.lang.String) = (r0v12 java.lang.String), (r0v15 java.lang.String) binds: [B:79:0x0179, B:84:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:79:0x0179, B:84:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r12v18 int) = (r12v16 int), (r12v19 int) binds: [B:79:0x0179, B:84:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:92:0x01be A[PHI: r0 r2 r12 r13
      0x01be: PHI (r0v17 java.lang.String) = (r0v14 java.lang.String), (r0v18 java.lang.String) binds: [B:90:0x01ba, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r2v7 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:90:0x01ba, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r12v22 int) = (r12v18 int), (r12v23 int) binds: [B:90:0x01ba, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r13v37 java.lang.Object) = (r13v33 java.lang.Object), (r13v1 java.lang.Object) binds: [B:90:0x01ba, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c8  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0214, code lost:
    
        if (r13 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02d5, code lost:
    
        if (r13 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0309, code lost:
    
        if (r13 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r13 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d8, code lost:
    
        if (r13 == r7) goto L196;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(java.lang.String r12, p.onm r13) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.F(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT, PHI: r8
      0x007c: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v6 java.lang.String) binds: [B:24:0x005d, B:32:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[PHI: r8 r9
      0x008e: PHI (r8v8 java.lang.String) = (r8v4 java.lang.String), (r8v9 java.lang.String) binds: [B:35:0x008b, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r9v13 java.lang.Object) = (r9v9 java.lang.Object), (r9v1 java.lang.Object) binds: [B:35:0x008b, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7 A[PHI: r8 r9
      0x00a7: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v15 java.lang.String) binds: [B:41:0x00a4, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r9v19 java.lang.Object) = (r9v18 java.lang.Object), (r9v1 java.lang.Object) binds: [B:41:0x00a4, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(String str, onm onmVar) {
        m1n m1nVar;
        String str2;
        Object objL;
        String str3;
        String str4;
        zx2 zx2Var;
        d9n d9nVarO;
        d9n d9nVarO2;
        if (onmVar instanceof m1n) {
            m1nVar = (m1n) onmVar;
            int i2 = m1nVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m1nVar.e = i2 - Integer.MIN_VALUE;
            } else {
                m1nVar = new m1n(this, onmVar);
            }
        } else {
            m1nVar = new m1n(this, onmVar);
        }
        Object objJ = m1nVar.c;
        int i3 = m1nVar.e;
        d9n d9nVar = d9n.a;
        switch (i3) {
            case 0:
                hm5.M(objJ);
                m1nVar.a = str;
                m1nVar.e = 1;
                objJ = j(str, m1nVar);
                if (objJ != d9nVar) {
                    str2 = (String) objJ;
                    if (str2 != null) {
                        if (str != null) {
                            m1nVar.a = str;
                            m1nVar.b = null;
                            m1nVar.e = 3;
                            objJ = r(str, "spotify:internal:npv-mini-chat", m1nVar);
                            if (objJ != d9nVar) {
                                if (((Boolean) objJ).booleanValue()) {
                                    m1nVar.a = str;
                                    m1nVar.b = null;
                                    m1nVar.e = 4;
                                    objJ = this.c.a(m1nVar);
                                    if (objJ != d9nVar) {
                                        zx2Var = (ay2) objJ;
                                        if (!u890.j(zx2Var, yx2.b)) {
                                            if (zx2Var instanceof zx2) {
                                                if (q(zx2Var.a())) {
                                                    m1nVar.a = null;
                                                    m1nVar.b = null;
                                                    m1nVar.e = 5;
                                                    d9nVarO2 = O(m1nVar);
                                                    if (d9nVarO2 != d9nVar) {
                                                        return d9nVarO2;
                                                    }
                                                }
                                            } else if (!u890.j(zx2Var, yx2.a)) {
                                                m1nVar.a = null;
                                                m1nVar.b = null;
                                                m1nVar.e = 6;
                                                d9nVarO = O(m1nVar);
                                                if (d9nVarO != d9nVar) {
                                                    return d9nVarO;
                                                }
                                            } else if (zx2Var != null) {
                                                eg.o();
                                            }
                                        }
                                        return str;
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    m1nVar.a = str;
                    m1nVar.b = str2;
                    m1nVar.e = 2;
                    objL = l(str2, str, m1nVar);
                    if (objL != d9nVar) {
                        str3 = str;
                        str4 = str2;
                        objJ = objL;
                        if (!((Boolean) objJ).booleanValue()) {
                            return str4;
                        }
                        str = str3;
                        if (str != null) {
                            m1nVar.a = str;
                            m1nVar.b = null;
                            m1nVar.e = 3;
                            objJ = r(str, "spotify:internal:npv-mini-chat", m1nVar);
                            if (objJ != d9nVar) {
                                if (((Boolean) objJ).booleanValue()) {
                                    m1nVar.a = str;
                                    m1nVar.b = null;
                                    m1nVar.e = 4;
                                    objJ = this.c.a(m1nVar);
                                    if (objJ != d9nVar) {
                                        zx2Var = (ay2) objJ;
                                        if (!u890.j(zx2Var, yx2.b)) {
                                            if (zx2Var instanceof zx2) {
                                                if (q(zx2Var.a())) {
                                                    m1nVar.a = null;
                                                    m1nVar.b = null;
                                                    m1nVar.e = 5;
                                                    d9nVarO2 = O(m1nVar);
                                                    if (d9nVarO2 != d9nVar) {
                                                        return d9nVarO2;
                                                    }
                                                }
                                            } else if (!u890.j(zx2Var, yx2.a)) {
                                                m1nVar.a = null;
                                                m1nVar.b = null;
                                                m1nVar.e = 6;
                                                d9nVarO = O(m1nVar);
                                                if (d9nVarO != d9nVar) {
                                                    return d9nVarO;
                                                }
                                            } else if (zx2Var != null) {
                                                eg.o();
                                            }
                                        }
                                        return str;
                                    }
                                }
                            }
                        }
                        return null;
                    }
                }
                return d9nVar;
            case 1:
                str = m1nVar.a;
                hm5.M(objJ);
                str2 = (String) objJ;
                if (str2 != null) {
                    if (str != null) {
                        m1nVar.a = str;
                        m1nVar.b = null;
                        m1nVar.e = 3;
                        objJ = r(str, "spotify:internal:npv-mini-chat", m1nVar);
                        if (objJ != d9nVar) {
                            if (((Boolean) objJ).booleanValue()) {
                                m1nVar.a = str;
                                m1nVar.b = null;
                                m1nVar.e = 4;
                                objJ = this.c.a(m1nVar);
                                if (objJ != d9nVar) {
                                    zx2Var = (ay2) objJ;
                                    if (!u890.j(zx2Var, yx2.b)) {
                                        if (zx2Var instanceof zx2) {
                                            if (q(zx2Var.a())) {
                                                m1nVar.a = null;
                                                m1nVar.b = null;
                                                m1nVar.e = 5;
                                                d9nVarO2 = O(m1nVar);
                                                if (d9nVarO2 != d9nVar) {
                                                    return d9nVarO2;
                                                }
                                            }
                                        } else if (!u890.j(zx2Var, yx2.a)) {
                                            m1nVar.a = null;
                                            m1nVar.b = null;
                                            m1nVar.e = 6;
                                            d9nVarO = O(m1nVar);
                                            if (d9nVarO != d9nVar) {
                                                return d9nVarO;
                                            }
                                        } else if (zx2Var != null) {
                                            eg.o();
                                        }
                                    }
                                    return str;
                                }
                            }
                        }
                    }
                    return null;
                }
                m1nVar.a = str;
                m1nVar.b = str2;
                m1nVar.e = 2;
                objL = l(str2, str, m1nVar);
                if (objL != d9nVar) {
                    str3 = str;
                    str4 = str2;
                    objJ = objL;
                    if (!((Boolean) objJ).booleanValue()) {
                        return str4;
                    }
                    str = str3;
                    if (str != null) {
                        m1nVar.a = str;
                        m1nVar.b = null;
                        m1nVar.e = 3;
                        objJ = r(str, "spotify:internal:npv-mini-chat", m1nVar);
                        if (objJ != d9nVar) {
                            if (((Boolean) objJ).booleanValue()) {
                                m1nVar.a = str;
                                m1nVar.b = null;
                                m1nVar.e = 4;
                                objJ = this.c.a(m1nVar);
                                if (objJ != d9nVar) {
                                    zx2Var = (ay2) objJ;
                                    if (!u890.j(zx2Var, yx2.b)) {
                                        if (zx2Var instanceof zx2) {
                                            if (q(zx2Var.a())) {
                                                m1nVar.a = null;
                                                m1nVar.b = null;
                                                m1nVar.e = 5;
                                                d9nVarO2 = O(m1nVar);
                                                if (d9nVarO2 != d9nVar) {
                                                    return d9nVarO2;
                                                }
                                            }
                                        } else if (!u890.j(zx2Var, yx2.a)) {
                                            m1nVar.a = null;
                                            m1nVar.b = null;
                                            m1nVar.e = 6;
                                            d9nVarO = O(m1nVar);
                                            if (d9nVarO != d9nVar) {
                                                return d9nVarO;
                                            }
                                        } else if (zx2Var != null) {
                                            eg.o();
                                        }
                                    }
                                    return str;
                                }
                            }
                        }
                    }
                    return null;
                }
                return d9nVar;
            case 2:
                str4 = m1nVar.b;
                str3 = m1nVar.a;
                hm5.M(objJ);
                if (!((Boolean) objJ).booleanValue()) {
                    return str4;
                }
                str = str3;
                if (str != null) {
                    m1nVar.a = str;
                    m1nVar.b = null;
                    m1nVar.e = 3;
                    objJ = r(str, "spotify:internal:npv-mini-chat", m1nVar);
                    if (objJ != d9nVar) {
                        if (((Boolean) objJ).booleanValue()) {
                            m1nVar.a = str;
                            m1nVar.b = null;
                            m1nVar.e = 4;
                            objJ = this.c.a(m1nVar);
                            if (objJ != d9nVar) {
                                zx2Var = (ay2) objJ;
                                if (!u890.j(zx2Var, yx2.b)) {
                                    if (zx2Var instanceof zx2) {
                                        if (q(zx2Var.a())) {
                                            m1nVar.a = null;
                                            m1nVar.b = null;
                                            m1nVar.e = 5;
                                            d9nVarO2 = O(m1nVar);
                                            if (d9nVarO2 != d9nVar) {
                                                return d9nVarO2;
                                            }
                                        }
                                    } else if (!u890.j(zx2Var, yx2.a)) {
                                        m1nVar.a = null;
                                        m1nVar.b = null;
                                        m1nVar.e = 6;
                                        d9nVarO = O(m1nVar);
                                        if (d9nVarO != d9nVar) {
                                            return d9nVarO;
                                        }
                                    } else if (zx2Var != null) {
                                        eg.o();
                                    }
                                }
                                return str;
                            }
                        }
                    }
                    return d9nVar;
                }
                return null;
            case 3:
                str = m1nVar.a;
                hm5.M(objJ);
                if (((Boolean) objJ).booleanValue()) {
                    m1nVar.a = str;
                    m1nVar.b = null;
                    m1nVar.e = 4;
                    objJ = this.c.a(m1nVar);
                    if (objJ != d9nVar) {
                        zx2Var = (ay2) objJ;
                        if (!u890.j(zx2Var, yx2.b)) {
                            if (zx2Var instanceof zx2) {
                                if (q(zx2Var.a())) {
                                    m1nVar.a = null;
                                    m1nVar.b = null;
                                    m1nVar.e = 5;
                                    d9nVarO2 = O(m1nVar);
                                    if (d9nVarO2 != d9nVar) {
                                        return d9nVarO2;
                                    }
                                }
                            } else if (!u890.j(zx2Var, yx2.a)) {
                                m1nVar.a = null;
                                m1nVar.b = null;
                                m1nVar.e = 6;
                                d9nVarO = O(m1nVar);
                                if (d9nVarO != d9nVar) {
                                    return d9nVarO;
                                }
                            } else if (zx2Var != null) {
                                eg.o();
                            }
                        }
                        return str;
                    }
                    return d9nVar;
                }
                return null;
            case 4:
                str = m1nVar.a;
                hm5.M(objJ);
                zx2Var = (ay2) objJ;
                if (!u890.j(zx2Var, yx2.b)) {
                    if (zx2Var instanceof zx2) {
                        if (q(zx2Var.a())) {
                            m1nVar.a = null;
                            m1nVar.b = null;
                            m1nVar.e = 5;
                            d9nVarO2 = O(m1nVar);
                            if (d9nVarO2 != d9nVar) {
                                return d9nVarO2;
                            }
                        }
                    } else {
                        if (!u890.j(zx2Var, yx2.a)) {
                            if (zx2Var != null) {
                                eg.o();
                            }
                            return null;
                        }
                        m1nVar.a = null;
                        m1nVar.b = null;
                        m1nVar.e = 6;
                        d9nVarO = O(m1nVar);
                        if (d9nVarO != d9nVar) {
                            return d9nVarO;
                        }
                    }
                    return d9nVar;
                }
                return str;
            case 5:
                hm5.M(objJ);
                return objJ;
            case 6:
                hm5.M(objJ);
                return objJ;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r8 == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.n1n
            if (r0 == 0) goto L13
            r0 = r8
            p.n1n r0 = (p.n1n) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.n1n r0 = new p.n1n
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            p.hm5.M(r8)
            return r8
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L34:
            p.hm5.M(r8)
            goto L55
        L38:
            p.hm5.M(r8)
            goto L48
        L3c:
            p.hm5.M(r8)
            r0.c = r4
            java.lang.Object r8 = r7.D(r0)
            if (r8 != r6) goto L48
            goto L67
        L48:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5e
            r0.c = r3
            java.lang.Object r8 = r7.u(r8, r0)
            if (r8 != r6) goto L55
            goto L67
        L55:
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L5e
            return r5
        L5e:
            r0.c = r2
            r8 = 0
            java.lang.Object r7 = r7.v(r8, r0)
            if (r7 != r6) goto L68
        L67:
            return r6
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.H(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object I(String str, String str2, String str3, boolean z, onm onmVar) {
        o1n o1nVar;
        String strC1;
        if (onmVar instanceof o1n) {
            o1nVar = (o1n) onmVar;
            int i2 = o1nVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1nVar.g = i2 - Integer.MIN_VALUE;
            } else {
                o1nVar = new o1n(this, onmVar);
            }
        } else {
            o1nVar = new o1n(this, onmVar);
        }
        o1n o1nVar2 = o1nVar;
        Object objT = o1nVar2.e;
        int i3 = o1nVar2.g;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objT);
            strC1 = ihc1.c1(2000, str);
            o1nVar2.a = str2;
            o1nVar2.b = str3;
            o1nVar2.c = strC1;
            o1nVar2.d = z;
            o1nVar2.g = 1;
            objT = T(o1nVar2);
            if (objT != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objT);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = o1nVar2.d;
        strC1 = o1nVar2.c;
        str3 = o1nVar2.b;
        str2 = o1nVar2.a;
        hm5.M(objT);
        String str4 = str2;
        String str5 = strC1;
        String str6 = str3;
        hma1 hma1VarEdit = ((dma1) objT).edit();
        hma1VarEdit.d(k, str5);
        hma1VarEdit.d(m, str6);
        bma1 bma1Var = l;
        if (str4 != null) {
            hma1VarEdit.d(bma1Var, str4);
        } else {
            hma1VarEdit.f(bma1Var);
        }
        hma1VarEdit.h();
        if (!ihc1.y0(str6) && !ihc1.y0(str5)) {
            o1nVar2.a = null;
            o1nVar2.b = null;
            o1nVar2.c = null;
            o1nVar2.d = z;
            o1nVar2.g = 2;
            if (S(str6, str5, str4, z, o1nVar2) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(LinkedHashMap linkedHashMap, onm onmVar) {
        p1n p1nVar;
        if (onmVar instanceof p1n) {
            p1nVar = (p1n) onmVar;
            int i2 = p1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                p1nVar = new p1n(this, onmVar);
            }
        } else {
            p1nVar = new p1n(this, onmVar);
        }
        Object objT = p1nVar.b;
        int i3 = p1nVar.d;
        if (i3 == 0) {
            hm5.M(objT);
            p1nVar.a = linkedHashMap;
            p1nVar.d = 1;
            objT = T(p1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = p1nVar.a;
            hm5.M(objT);
        }
        dma1 dma1Var = (dma1) objT;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        rih1 rih1Var = rih1.a;
        bma1 bma1Var = n;
        if (zIsEmpty) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.f(bma1Var);
            hma1VarEdit.h();
            return rih1Var;
        }
        String strY0 = o7h.y0(linkedHashMap.values(), "\n", null, null, zxm.W0, 30);
        hma1 hma1VarEdit2 = dma1Var.edit();
        hma1VarEdit2.d(bma1Var, strY0);
        hma1VarEdit2.h();
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K(LinkedHashMap linkedHashMap, onm onmVar) {
        q1n q1nVar;
        if (onmVar instanceof q1n) {
            q1nVar = (q1n) onmVar;
            int i2 = q1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                q1nVar = new q1n(this, onmVar);
            }
        } else {
            q1nVar = new q1n(this, onmVar);
        }
        Object objT = q1nVar.b;
        int i3 = q1nVar.d;
        if (i3 == 0) {
            hm5.M(objT);
            q1nVar.a = linkedHashMap;
            q1nVar.d = 1;
            objT = T(q1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = q1nVar.a;
            hm5.M(objT);
        }
        dma1 dma1Var = (dma1) objT;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        rih1 rih1Var = rih1.a;
        bma1 bma1Var = j;
        if (zIsEmpty) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.f(bma1Var);
            hma1VarEdit.h();
            return rih1Var;
        }
        String strY0 = o7h.y0(linkedHashMap.entrySet(), "\n", null, null, zxm.X0, 30);
        hma1 hma1VarEdit2 = dma1Var.edit();
        hma1VarEdit2.d(bma1Var, strY0);
        hma1VarEdit2.h();
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(String str, onm onmVar) {
        r1n r1nVar;
        if (onmVar instanceof r1n) {
            r1nVar = (r1n) onmVar;
            int i2 = r1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                r1nVar = new r1n(this, onmVar);
            }
        } else {
            r1nVar = new r1n(this, onmVar);
        }
        Object objT = r1nVar.b;
        int i3 = r1nVar.d;
        rih1 rih1Var = rih1.a;
        if (i3 == 0) {
            hm5.M(objT);
            if (ihc1.y0(str)) {
                return rih1Var;
            }
            r1nVar.a = str;
            r1nVar.d = 1;
            objT = T(r1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = r1nVar.a;
            hm5.M(objT);
        }
        hma1 hma1VarEdit = ((dma1) objT).edit();
        hma1VarEdit.f(f4p);
        hma1VarEdit.d(f, str);
        hma1VarEdit.h();
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(String str, lnm lnmVar) {
        s1n s1nVar;
        if (lnmVar instanceof s1n) {
            s1nVar = (s1n) lnmVar;
            int i2 = s1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                s1nVar = new s1n(this, lnmVar);
            }
        } else {
            s1nVar = new s1n(this, lnmVar);
        }
        Object objT = s1nVar.b;
        int i3 = s1nVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objT);
            s1nVar.a = str;
            s1nVar.d = 1;
            objT = T(s1nVar);
            if (objT != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objT);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = s1nVar.a;
        hm5.M(objT);
        hma1 hma1VarEdit = ((dma1) objT).edit();
        bma1 bma1Var = i;
        if (str == null || ihc1.y0(str)) {
            hma1VarEdit.f(bma1Var);
        } else {
            hma1VarEdit.d(bma1Var, str);
        }
        hma1VarEdit.h();
        if (str != null && !ihc1.y0(str)) {
            s1nVar.a = null;
            s1nVar.d = 2;
            if (t(str, "spotify:internal:npv-mini-chat", s1nVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(String str, onm onmVar) {
        t1n t1nVar;
        if (onmVar instanceof t1n) {
            t1nVar = (t1n) onmVar;
            int i2 = t1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                t1nVar = new t1n(this, onmVar);
            }
        } else {
            t1nVar = new t1n(this, onmVar);
        }
        Object obj = t1nVar.b;
        int i3 = t1nVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return yah0.m(((dma1) obj).h(f4p, false));
            }
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = t1nVar.a;
            hm5.M(obj);
            return yah0.m(((LinkedHashSet) obj).contains(str));
        }
        hm5.M(obj);
        d9n d9nVar = d9n.a;
        if (str == null || ihc1.y0(str)) {
            t1nVar.a = null;
            t1nVar.d = 1;
            Object objT = T(t1nVar);
            if (objT != d9nVar) {
                obj = objT;
                return yah0.m(((dma1) obj).h(f4p, false));
            }
        } else {
            t1nVar.a = str;
            t1nVar.d = 2;
            Serializable serializableC = C(t1nVar);
            if (serializableC != d9nVar) {
                obj = serializableC;
                return yah0.m(((LinkedHashSet) obj).contains(str));
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final d9n O(onm onmVar) {
        u1n u1nVar;
        if (onmVar instanceof u1n) {
            u1nVar = (u1n) onmVar;
            int i2 = u1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                u1nVar = new u1n(this, onmVar);
            }
        } else {
            u1nVar = new u1n(this, onmVar);
        }
        Object objB = u1nVar.a;
        int i3 = u1nVar.c;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objB);
            u1nVar.c = 1;
            objB = B(u1nVar);
            if (objB != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            hm5.M(objB);
        } else {
            if (i3 == 2) {
                hm5.M(objB);
                u1nVar.c = 3;
                if (M(null, u1nVar) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    hm5.M(objB);
                    return null;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        u1nVar.c = 4;
        if (h(u1nVar) == d9nVar) {
            return d9nVar;
        }
        return null;
        String str = (String) objB;
        if (str != null) {
            u1nVar.c = 2;
            if (Q(str, "spotify:internal:npv-mini-chat", u1nVar) != d9nVar) {
                u1nVar.c = 3;
                if (M(null, u1nVar) != d9nVar) {
                    u1nVar.c = 4;
                    if (h(u1nVar) == d9nVar) {
                        return null;
                    }
                }
            }
        } else {
            u1nVar.c = 3;
            if (M(null, u1nVar) != d9nVar) {
                u1nVar.c = 4;
                if (h(u1nVar) == d9nVar) {
                    return null;
                }
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(String str, String str2, onm onmVar) {
        v1n v1nVar;
        dma1 dma1Var;
        String str3;
        dma1 dma1Var2;
        String str4;
        String str5;
        String str6;
        if (onmVar instanceof v1n) {
            v1nVar = (v1n) onmVar;
            int i2 = v1nVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v1nVar.f = i2 - Integer.MIN_VALUE;
            } else {
                v1nVar = new v1n(this, onmVar);
            }
        } else {
            v1nVar = new v1n(this, onmVar);
        }
        Object objT = v1nVar.d;
        int i3 = v1nVar.f;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objT);
            v1nVar.a = str;
            v1nVar.b = str2;
            v1nVar.f = 1;
            objT = T(v1nVar);
            if (objT != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            str2 = v1nVar.b;
            str = v1nVar.a;
            hm5.M(objT);
        } else {
            if (i3 == 2) {
                dma1Var2 = v1nVar.c;
                str2 = v1nVar.b;
                str3 = v1nVar.a;
                hm5.M(objT);
                LinkedHashSet linkedHashSet = (LinkedHashSet) objT;
                linkedHashSet.add(str2);
                hma1 hma1VarEdit = dma1Var2.edit();
                hma1VarEdit.d(o, i(linkedHashSet));
                hma1VarEdit.h();
                dma1Var = dma1Var2;
                str = str3;
                if (str != null || ihc1.y0(str)) {
                    hma1 hma1VarEdit2 = dma1Var.edit();
                    hma1VarEdit2.f(k);
                    hma1VarEdit2.f(l);
                    hma1VarEdit2.f(m);
                    hma1VarEdit2.h();
                    return rih1Var;
                }
                v1nVar.a = str;
                v1nVar.b = str2;
                v1nVar.c = null;
                v1nVar.f = 3;
                if (Q(str, str2, v1nVar) != d9nVar) {
                    String str7 = str2;
                    str4 = str;
                    str5 = str7;
                    if (str5 != null) {
                    }
                    z = false;
                    str6 = str4;
                    if (!z) {
                        v1nVar.a = null;
                        v1nVar.b = null;
                        v1nVar.c = null;
                        v1nVar.f = 5;
                        if (f(str6, v1nVar) == d9nVar) {
                        }
                    }
                    return rih1Var;
                }
                return d9nVar;
            }
            if (i3 == 3) {
                str5 = v1nVar.b;
                str4 = v1nVar.a;
                hm5.M(objT);
                if (str5 != null || ihc1.y0(str5)) {
                    z = false;
                    str6 = str4;
                    if (!z) {
                        v1nVar.a = null;
                        v1nVar.b = null;
                        v1nVar.c = null;
                        v1nVar.f = 5;
                        if (f(str6, v1nVar) == d9nVar) {
                        }
                    }
                    return rih1Var;
                }
                v1nVar.a = str4;
                v1nVar.b = null;
                v1nVar.c = null;
                v1nVar.f = 4;
                objT = u(str4, v1nVar);
                if (objT != d9nVar) {
                    str6 = str4;
                }
                return d9nVar;
            }
            if (i3 != 4) {
                if (i3 == 5) {
                    hm5.M(objT);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = v1nVar.a;
            hm5.M(objT);
        }
        if (((Collection) objT).isEmpty()) {
            str4 = str6;
            z = false;
            str6 = str4;
        }
        if (!z) {
            v1nVar.a = null;
            v1nVar.b = null;
            v1nVar.c = null;
            v1nVar.f = 5;
            if (f(str6, v1nVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        dma1Var = (dma1) objT;
        if (str2 == null || ihc1.y0(str2)) {
            hma1 hma1VarEdit3 = dma1Var.edit();
            hma1VarEdit3.a(f4p, true);
            hma1VarEdit3.h();
            if (str != null) {
            }
            hma1 hma1VarEdit4 = dma1Var.edit();
            hma1VarEdit4.f(k);
            hma1VarEdit4.f(l);
            hma1VarEdit4.f(m);
            hma1VarEdit4.h();
            return rih1Var;
        }
        v1nVar.a = str;
        v1nVar.b = str2;
        v1nVar.c = dma1Var;
        v1nVar.f = 2;
        Serializable serializableC = C(v1nVar);
        if (serializableC != d9nVar) {
            str3 = str;
            dma1Var2 = dma1Var;
            objT = serializableC;
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) objT;
            linkedHashSet2.add(str2);
            hma1 hma1VarEdit5 = dma1Var2.edit();
            hma1VarEdit5.d(o, i(linkedHashSet2));
            hma1VarEdit5.h();
            dma1Var = dma1Var2;
            str = str3;
            if (str != null) {
            }
            hma1 hma1VarEdit6 = dma1Var.edit();
            hma1VarEdit6.f(k);
            hma1VarEdit6.f(l);
            hma1VarEdit6.f(m);
            hma1VarEdit6.h();
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(String str, String str2, onm onmVar) {
        w1n w1nVar;
        if (onmVar instanceof w1n) {
            w1nVar = (w1n) onmVar;
            int i2 = w1nVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w1nVar.e = i2 - Integer.MIN_VALUE;
            } else {
                w1nVar = new w1n(this, onmVar);
            }
        } else {
            w1nVar = new w1n(this, onmVar);
        }
        Object objA = w1nVar.c;
        int i3 = w1nVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objA);
            if (!ihc1.y0(str) && str2 != null && !ihc1.y0(str2)) {
                w1nVar.a = str;
                w1nVar.b = str2;
                w1nVar.e = 1;
                objA = A(w1nVar);
                if (objA != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objA);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = w1nVar.b;
        str = w1nVar.a;
        hm5.M(objA);
        LinkedHashMap linkedHashMap = (LinkedHashMap) objA;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str2);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, linkedHashSet);
            }
            w1nVar.a = null;
            w1nVar.b = null;
            w1nVar.e = 2;
            if (K(linkedHashMap, w1nVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(String str, onm onmVar) {
        x1n x1nVar;
        long jB;
        LinkedHashMap linkedHashMap;
        String str2;
        long j2;
        if (onmVar instanceof x1n) {
            x1nVar = (x1n) onmVar;
            int i2 = x1nVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x1nVar.f = i2 - Integer.MIN_VALUE;
            } else {
                x1nVar = new x1n(this, onmVar);
            }
        } else {
            x1nVar = new x1n(this, onmVar);
        }
        Object objW = x1nVar.d;
        int i3 = x1nVar.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objW);
            if (ihc1.y0(str)) {
                return rih1Var;
            }
            jB = this.b.b();
            x1nVar.a = str;
            x1nVar.c = jB;
            x1nVar.f = 1;
            objW = w(x1nVar);
            if (objW != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            jB = x1nVar.c;
            str = x1nVar.a;
            hm5.M(objW);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = x1nVar.c;
            linkedHashMap = x1nVar.b;
            str2 = x1nVar.a;
            hm5.M(objW);
        }
        hma1 hma1VarEdit = ((dma1) objW).edit();
        hma1VarEdit.d(f, str2);
        hma1VarEdit.c(g, j2);
        hma1VarEdit.d(h, o7h.y0(linkedHashMap.entrySet(), "\n", null, null, zxm.V0, 30));
        hma1VarEdit.h();
        return rih1Var;
        linkedHashMap = (LinkedHashMap) objW;
        linkedHashMap.remove(str);
        linkedHashMap.put(str, yah0.q(jB));
        while (linkedHashMap.size() > 20) {
            linkedHashMap.remove(o7h.p0(linkedHashMap.keySet()));
        }
        x1nVar.a = str;
        x1nVar.b = linkedHashMap;
        x1nVar.c = jB;
        x1nVar.f = 2;
        objW = T(x1nVar);
        if (objW != d9nVar) {
            str2 = str;
            j2 = jB;
            hma1 hma1VarEdit2 = ((dma1) objW).edit();
            hma1VarEdit2.d(f, str2);
            hma1VarEdit2.c(g, j2);
            hma1VarEdit2.d(h, o7h.y0(linkedHashMap.entrySet(), "\n", null, null, zxm.V0, 30));
            hma1VarEdit2.h();
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (J(r11, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, p.onm r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof p.y1n
            if (r0 == 0) goto L13
            r0 = r11
            p.y1n r0 = (p.y1n) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.y1n r0 = new p.y1n
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r11)
            goto L85
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            boolean r10 = r0.d
            java.lang.String r9 = r0.c
            java.lang.String r8 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r11)
            goto L51
        L3d:
            p.hm5.M(r11)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.d = r10
            r0.g = r3
            java.io.Serializable r11 = r6.z(r0)
            if (r11 != r5) goto L51
            goto L84
        L51:
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            r11.remove(r7)
            p.wfb0 r1 = new p.wfb0
            r1.<init>(r8, r9, r7, r10)
            r11.put(r7, r1)
        L5e:
            int r7 = r11.size()
            r8 = 20
            if (r7 <= r8) goto L74
            java.util.Set r7 = r11.keySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = p.o7h.p0(r7)
            r11.remove(r7)
            goto L5e
        L74:
            r0.a = r4
            r0.b = r4
            r0.c = r4
            r0.d = r10
            r0.g = r2
            java.lang.Object r6 = r6.J(r11, r0)
            if (r6 != r5) goto L85
        L84:
            return r5
        L85:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.S(java.lang.String, java.lang.String, java.lang.String, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(onm onmVar) {
        z1n z1nVar;
        if (onmVar instanceof z1n) {
            z1nVar = (z1n) onmVar;
            int i2 = z1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                z1nVar = new z1n(this, onmVar);
            }
        } else {
            z1nVar = new z1n(this, onmVar);
        }
        Object objJ = z1nVar.a;
        int i3 = z1nVar.c;
        if (i3 == 0) {
            hm5.M(objJ);
            z1nVar.c = 1;
            objJ = fc11.j(this.a, z1nVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (d(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.i0n
            if (r0 == 0) goto L13
            r0 = r6
            p.i0n r0 = (p.i0n) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.i0n r0 = new p.i0n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L78
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L41
        L35:
            p.hm5.M(r6)
            r0.c = r3
            java.lang.Object r6 = r5.T(r0)
            if (r6 != r4) goto L41
            goto L77
        L41:
            p.dma1 r6 = (p.dma1) r6
            p.hma1 r6 = r6.edit()
            p.bma1 r1 = p.a2n.f
            r6.f(r1)
            p.bma1 r1 = p.a2n.g
            r6.f(r1)
            p.bma1 r1 = p.a2n.h
            r6.f(r1)
            p.bma1 r1 = p.a2n.j
            r6.f(r1)
            p.bma1 r1 = p.a2n.o
            r6.f(r1)
            p.bma1 r1 = p.a2n.f4p
            r6.f(r1)
            p.bma1 r1 = p.hy2.a()
            r6.f(r1)
            r6.h()
            r0.c = r2
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r4) goto L78
        L77:
            return r4
        L78:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.a(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[PHI: r11
      0x0092: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v1 java.lang.String), (r11v6 java.lang.String) binds: [B:34:0x0076, B:36:0x008f, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[PHI: r11 r12
      0x009d: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v7 java.lang.String) binds: [B:39:0x009a, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r12v9 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:39:0x009a, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        j0n j0nVar;
        LinkedHashMap linkedHashMap;
        if (onmVar instanceof j0n) {
            j0nVar = (j0n) onmVar;
            int i2 = j0nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                j0nVar = new j0n(this, onmVar);
            }
        } else {
            j0nVar = new j0n(this, onmVar);
        }
        Object objT = j0nVar.b;
        int i3 = j0nVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objT);
            if (!ihc1.y0(str)) {
                j0nVar.a = str;
                j0nVar.d = 1;
                objT = T(j0nVar);
                if (objT != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i3 == 1) {
            str = j0nVar.a;
            hm5.M(objT);
        } else {
            if (i3 == 2) {
                str = j0nVar.a;
                hm5.M(objT);
                j0nVar.a = str;
                j0nVar.d = 3;
                objT = A(j0nVar);
                if (objT != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    hm5.M(objT);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = j0nVar.a;
            hm5.M(objT);
        }
        linkedHashMap = (LinkedHashMap) objT;
        if (linkedHashMap.remove(str) != null) {
            j0nVar.a = null;
            j0nVar.d = 4;
            if (K(linkedHashMap, j0nVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        dma1 dma1Var = (dma1) objT;
        bma1 bma1Var = f;
        String strE = dma1Var.e(bma1Var, (String) null);
        if (strE == null || ihc1.y0(strE)) {
            strE = null;
        }
        if (u890.j(strE, str)) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.f(bma1Var);
            hma1VarEdit.f(g);
            hma1VarEdit.h();
            j0nVar.a = str;
            j0nVar.d = 2;
            if (d(j0nVar) != d9nVar) {
                j0nVar.a = str;
                j0nVar.d = 3;
                objT = A(j0nVar);
                if (objT != d9nVar) {
                    linkedHashMap = (LinkedHashMap) objT;
                    if (linkedHashMap.remove(str) != null) {
                        j0nVar.a = null;
                        j0nVar.d = 4;
                        if (K(linkedHashMap, j0nVar) == d9nVar) {
                        }
                    }
                    return rih1Var;
                }
            }
        } else {
            j0nVar.a = str;
            j0nVar.d = 3;
            objT = A(j0nVar);
            if (objT != d9nVar) {
                linkedHashMap = (LinkedHashMap) objT;
                if (linkedHashMap.remove(str) != null) {
                    j0nVar.a = null;
                    j0nVar.d = 4;
                    if (K(linkedHashMap, j0nVar) == d9nVar) {
                    }
                }
                return rih1Var;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        k0n k0nVar;
        if (onmVar instanceof k0n) {
            k0nVar = (k0n) onmVar;
            int i2 = k0nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                k0nVar = new k0n(this, onmVar);
            }
        } else {
            k0nVar = new k0n(this, onmVar);
        }
        Object objT = k0nVar.a;
        int i3 = k0nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            k0nVar.c = 1;
            objT = T(k0nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        hma1 hma1VarEdit = ((dma1) objT).edit();
        hma1VarEdit.f(k);
        hma1VarEdit.f(l);
        hma1VarEdit.f(m);
        hma1VarEdit.h();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        l0n l0nVar;
        if (onmVar instanceof l0n) {
            l0nVar = (l0n) onmVar;
            int i2 = l0nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                l0nVar = new l0n(this, onmVar);
            }
        } else {
            l0nVar = new l0n(this, onmVar);
        }
        Object objT = l0nVar.a;
        int i3 = l0nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            l0nVar.c = 1;
            objT = T(l0nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        hma1 hma1VarEdit = ((dma1) objT).edit();
        hma1VarEdit.f(k);
        hma1VarEdit.f(l);
        hma1VarEdit.f(m);
        hma1VarEdit.f(n);
        hma1VarEdit.h();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r8 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.m0n
            if (r0 == 0) goto L13
            r0 = r8
            p.m0n r0 = (p.m0n) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.m0n r0 = new p.m0n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r7 = r0.a
            p.hm5.M(r8)
            goto L4b
        L37:
            p.hm5.M(r8)
            boolean r8 = p.ihc1.y0(r7)
            if (r8 != 0) goto L6a
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.B(r0)
            if (r8 != r5) goto L4b
            goto L5b
        L4b:
            boolean r7 = p.u890.j(r8, r7)
            if (r7 == 0) goto L6a
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r6.T(r0)
            if (r8 != r5) goto L5c
        L5b:
            return r5
        L5c:
            p.dma1 r8 = (p.dma1) r8
            p.hma1 r6 = r8.edit()
            p.bma1 r7 = p.a2n.i
            r6.f(r7)
            r6.h()
        L6a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.e(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081 A[DONT_INVERT, PHI: r1 r10
      0x0081: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:28:0x007e, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r10v4 p.wfb0) = (r10v3 p.wfb0), (r10v14 p.wfb0) binds: [B:28:0x007e, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r11 == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r10, p.onm r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p.n0n
            if (r0 == 0) goto L13
            r0 = r11
            p.n0n r0 = (p.n0n) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.n0n r0 = new p.n0n
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L4e
            if (r1 == r5) goto L48
            if (r1 == r4) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            p.hm5.M(r11)
            goto L9c
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r6
        L38:
            p.wfb0 r10 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r11)
            goto L81
        L40:
            p.wfb0 r10 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r11)
            goto L6f
        L48:
            java.lang.String r10 = r0.a
            p.hm5.M(r11)
            goto L5c
        L4e:
            p.hm5.M(r11)
            r0.a = r10
            r0.e = r5
            java.lang.Object r11 = r9.y(r0)
            if (r11 != r7) goto L5c
            goto L9b
        L5c:
            p.wfb0 r11 = (p.wfb0) r11
            r0.a = r10
            r0.b = r11
            r0.e = r4
            java.io.Serializable r1 = r9.z(r0)
            if (r1 != r7) goto L6b
            goto L9b
        L6b:
            r8 = r1
            r1 = r10
            r10 = r11
            r11 = r8
        L6f:
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            r11.remove(r1)
            r0.a = r1
            r0.b = r10
            r0.e = r3
            java.lang.Object r11 = r9.J(r11, r0)
            if (r11 != r7) goto L81
            goto L9b
        L81:
            if (r10 == 0) goto L88
            java.lang.String r10 = r10.a()
            goto L89
        L88:
            r10 = r6
        L89:
            boolean r10 = p.u890.j(r10, r1)
            if (r10 == 0) goto Lb4
            r0.a = r6
            r0.b = r6
            r0.e = r2
            java.lang.Object r11 = r9.T(r0)
            if (r11 != r7) goto L9c
        L9b:
            return r7
        L9c:
            p.dma1 r11 = (p.dma1) r11
            p.hma1 r9 = r11.edit()
            p.bma1 r10 = p.a2n.k
            r9.f(r10)
            p.bma1 r10 = p.a2n.l
            r9.f(r10)
            p.bma1 r10 = p.a2n.m
            r9.f(r10)
            r9.h()
        Lb4:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.f(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r4 == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r4 == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        return p.h0n.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum g(long r21, java.lang.String r23, p.onm r24, boolean r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            boolean r6 = r4 instanceof p.o0n
            if (r6 == 0) goto L1d
            r6 = r4
            p.o0n r6 = (p.o0n) r6
            int r7 = r6.g
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L1d
            int r7 = r7 - r8
            r6.g = r7
            goto L22
        L1d:
            p.o0n r6 = new p.o0n
            r6.<init>(r0, r4)
        L22:
            java.lang.Object r4 = r6.e
            int r7 = r6.g
            r8 = 0
            p.gy2 r9 = r0.c
            r10 = 3
            r11 = 2
            r12 = 1
            p.d9n r13 = p.d9n.a
            if (r7 == 0) goto L51
            if (r7 == r12) goto L45
            if (r7 == r11) goto L41
            if (r7 != r10) goto L3b
            p.hm5.M(r4)
            goto Lb2
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r8
        L41:
            p.hm5.M(r4)
            goto L98
        L45:
            long r0 = r6.c
            boolean r2 = r6.d
            long r14 = r6.b
            java.lang.String r3 = r6.a
            p.hm5.M(r4)
            goto L7d
        L51:
            p.hm5.M(r4)
            p.yqg r4 = r0.b
            long r14 = r4.b()
            long r14 = r14 - r1
            r16 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 >= 0) goto La1
            if (r5 != 0) goto Lba
            r6.a = r3
            r6.b = r1
            r6.d = r5
            r6.c = r14
            r6.g = r12
            p.dlf r0 = r0.d
            java.lang.Object r4 = r0.a(r6)
            if (r4 != r13) goto L77
            goto Lb1
        L77:
            r18 = r14
            r14 = r1
            r0 = r18
            r2 = r5
        L7d:
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 <= 0) goto Lba
            r6.a = r8
            r6.b = r14
            r6.d = r2
            r6.c = r0
            r6.g = r11
            java.lang.Boolean r4 = r9.d(r3)
            if (r4 != r13) goto L98
            goto Lb1
        L98:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto Lba
            goto Lbd
        La1:
            r6.a = r8
            r6.b = r1
            r6.d = r5
            r6.c = r14
            r6.g = r10
            java.lang.Boolean r4 = r9.d(r3)
            if (r4 != r13) goto Lb2
        Lb1:
            return r13
        Lb2:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto Lbd
        Lba:
            p.h0n r0 = p.h0n.a
            return r0
        Lbd:
            p.h0n r0 = p.h0n.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.g(long, java.lang.String, p.onm, boolean):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(onm onmVar) {
        p0n p0nVar;
        if (onmVar instanceof p0n) {
            p0nVar = (p0n) onmVar;
            int i2 = p0nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                p0nVar = new p0n(this, onmVar);
            }
        } else {
            p0nVar = new p0n(this, onmVar);
        }
        Object objT = p0nVar.a;
        int i3 = p0nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            p0nVar.c = 1;
            objT = T(p0nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        hma1 hma1VarEdit = ((dma1) objT).edit();
        hma1VarEdit.f(f);
        hma1VarEdit.f(g);
        hma1VarEdit.h();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b A[PHI: r14
      0x007b: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v4 java.lang.String) binds: [B:21:0x0063, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r15 == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r15 == r7) goto L48;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0106 -> B:49:0x0109). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.j(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[PHI: r10 r11
      0x0075: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:21:0x005d, B:26:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0075: PHI (r11v2 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:21:0x005d, B:26:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r12 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r10, java.lang.String r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.k(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, String str2, onm onmVar) {
        s0n s0nVar;
        String str3;
        String str4;
        String str5;
        Long l2;
        long jLongValue;
        Object objS;
        long j2;
        Long l3;
        long jLongValue2;
        if (onmVar instanceof s0n) {
            s0nVar = (s0n) onmVar;
            int i2 = s0nVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0nVar.f = i2 - Integer.MIN_VALUE;
            } else {
                s0nVar = new s0n(this, onmVar);
            }
        } else {
            s0nVar = new s0n(this, onmVar);
        }
        Object objR = s0nVar.d;
        int i3 = s0nVar.f;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objR);
            if (str2 != null && !str2.equals(str)) {
                s0nVar.a = str;
                s0nVar.b = str2;
                s0nVar.f = 1;
                objR = r(str2, "spotify:internal:npv-mini-chat", s0nVar);
                if (objR != d9nVar) {
                }
                return d9nVar;
            }
            return yah0.m(false);
        }
        if (i3 == 1) {
            str2 = s0nVar.b;
            str = s0nVar.a;
            hm5.M(objR);
        } else {
            if (i3 == 2) {
                str4 = s0nVar.b;
                str3 = s0nVar.a;
                hm5.M(objR);
                if (((Boolean) objR).booleanValue()) {
                    return yah0.m(false);
                }
                s0nVar.a = str3;
                s0nVar.b = null;
                s0nVar.f = 3;
                objR = s(str4, s0nVar);
                if (objR != d9nVar) {
                    str5 = str3;
                    l2 = (Long) objR;
                    if (l2 == null) {
                        return yah0.m(false);
                    }
                    jLongValue = l2.longValue();
                    s0nVar.a = null;
                    s0nVar.b = null;
                    s0nVar.c = jLongValue;
                    s0nVar.f = 4;
                    objS = s(str5, s0nVar);
                    if (objS != d9nVar) {
                        objR = objS;
                        j2 = jLongValue;
                    }
                }
                return d9nVar;
            }
            if (i3 == 3) {
                str5 = s0nVar.a;
                hm5.M(objR);
                l2 = (Long) objR;
                if (l2 == null) {
                    return yah0.m(false);
                }
                jLongValue = l2.longValue();
                s0nVar.a = null;
                s0nVar.b = null;
                s0nVar.c = jLongValue;
                s0nVar.f = 4;
                objS = s(str5, s0nVar);
                if (objS != d9nVar) {
                    objR = objS;
                    j2 = jLongValue;
                }
                return d9nVar;
            }
            if (i3 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = s0nVar.c;
            hm5.M(objR);
        }
        l3 = (Long) objR;
        if (l3 != null) {
            jLongValue2 = l3.longValue();
        } else {
            jLongValue2 = 0;
        }
        return yah0.m(j2 > jLongValue2);
        if (((Boolean) objR).booleanValue()) {
            s0nVar.a = str;
            s0nVar.b = str2;
            s0nVar.f = 2;
            objR = m(s0nVar);
            if (objR != d9nVar) {
                String str6 = str2;
                str3 = str;
                str4 = str6;
                if (((Boolean) objR).booleanValue()) {
                    return yah0.m(false);
                }
                s0nVar.a = str3;
                s0nVar.b = null;
                s0nVar.f = 3;
                objR = s(str4, s0nVar);
                if (objR != d9nVar) {
                    str5 = str3;
                    l2 = (Long) objR;
                    if (l2 == null) {
                        return yah0.m(false);
                    }
                    jLongValue = l2.longValue();
                    s0nVar.a = null;
                    s0nVar.b = null;
                    s0nVar.c = jLongValue;
                    s0nVar.f = 4;
                    objS = s(str5, s0nVar);
                    if (objS != d9nVar) {
                        objR = objS;
                        j2 = jLongValue;
                        l3 = (Long) objR;
                        if (l3 != null) {
                            jLongValue2 = l3.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        return yah0.m(j2 > jLongValue2);
                    }
                }
            }
            return d9nVar;
        }
        return yah0.m(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(onm onmVar) {
        t0n t0nVar;
        if (onmVar instanceof t0n) {
            t0nVar = (t0n) onmVar;
            int i2 = t0nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                t0nVar = new t0n(this, onmVar);
            }
        } else {
            t0nVar = new t0n(this, onmVar);
        }
        Object objA = t0nVar.a;
        int i3 = t0nVar.c;
        boolean zQ = true;
        if (i3 == 0) {
            hm5.M(objA);
            t0nVar.c = 1;
            objA = this.c.a(t0nVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        zx2 zx2Var = (ay2) objA;
        if (!u890.j(zx2Var, yx2.a)) {
            zQ = zx2Var instanceof zx2 ? q(zx2Var.a()) : false;
        }
        return yah0.m(zQ);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[PHI: r1
      0x0074: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v6 java.lang.String) binds: [B:24:0x005c, B:29:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r11 == r8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(p.onm r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p.u0n
            if (r0 == 0) goto L13
            r0 = r11
            p.u0n r0 = (p.u0n) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.u0n r0 = new p.u0n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.f
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L4d
            if (r1 == r6) goto L49
            if (r1 == r4) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L35
            java.lang.String r10 = r0.b
            p.hm5.M(r11)
            goto La0
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r7
        L3b:
            int r1 = r0.c
            java.lang.String r3 = r0.a
            p.hm5.M(r11)
            goto L86
        L43:
            java.lang.String r1 = r0.a
            p.hm5.M(r11)
            goto L69
        L49:
            p.hm5.M(r11)
            goto L59
        L4d:
            p.hm5.M(r11)
            r0.f = r6
            java.lang.Object r11 = r10.B(r0)
            if (r11 != r8) goto L59
            goto L9c
        L59:
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L74
            r0.a = r1
            r0.f = r4
            java.lang.Object r11 = r10.m(r0)
            if (r11 != r8) goto L69
            goto L9c
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L74
            r11 = r1
            r1 = r6
            goto L76
        L74:
            r11 = r1
            r1 = r5
        L76:
            r0.a = r11
            r0.c = r1
            r0.f = r3
            java.lang.Object r3 = r10.D(r0)
            if (r3 != r8) goto L83
            goto L9c
        L83:
            r9 = r3
            r3 = r11
            r11 = r9
        L86:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L8b
            goto La9
        L8b:
            if (r1 == 0) goto L8e
            r5 = r6
        L8e:
            r0.a = r7
            r0.b = r11
            r0.c = r1
            r0.f = r2
            java.lang.Object r10 = r10.p(r11, r3, r0, r5)
            if (r10 != r8) goto L9d
        L9c:
            return r8
        L9d:
            r9 = r11
            r11 = r10
            r10 = r9
        La0:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La9
            return r10
        La9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.n(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(onm onmVar) {
        v0n v0nVar;
        if (onmVar instanceof v0n) {
            v0nVar = (v0n) onmVar;
            int i2 = v0nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                v0nVar = new v0n(this, onmVar);
            }
        } else {
            v0nVar = new v0n(this, onmVar);
        }
        Object objA = v0nVar.a;
        int i3 = v0nVar.c;
        boolean z = true;
        if (i3 == 0) {
            hm5.M(objA);
            v0nVar.c = 1;
            objA = this.c.a(v0nVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        zx2 zx2Var = (ay2) objA;
        if (!u890.j(zx2Var, yx2.b) && (!(zx2Var instanceof zx2) || q(zx2Var.a()))) {
            z = false;
        }
        return yah0.m(z);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r2 == r10) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r20, java.lang.String r21, p.onm r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2n.p(java.lang.String, java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public final boolean q(long j2) {
        return j2 > 0 && this.b.b() - j2 >= 1200000;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, String str2, onm onmVar) {
        x0n x0nVar;
        if (onmVar instanceof x0n) {
            x0nVar = (x0n) onmVar;
            int i2 = x0nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                x0nVar = new x0n(this, onmVar);
            }
        } else {
            x0nVar = new x0n(this, onmVar);
        }
        Object objU = x0nVar.b;
        int i3 = x0nVar.d;
        if (i3 == 0) {
            hm5.M(objU);
            if (ihc1.y0(str) || ihc1.y0(str2)) {
                return yah0.m(false);
            }
            x0nVar.a = str2;
            x0nVar.d = 1;
            objU = u(str, x0nVar);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = x0nVar.a;
            hm5.M(objU);
        }
        return yah0.m(((Set) objU).contains(str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, onm onmVar) {
        y0n y0nVar;
        if (onmVar instanceof y0n) {
            y0nVar = (y0n) onmVar;
            int i2 = y0nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                y0nVar = new y0n(this, onmVar);
            }
        } else {
            y0nVar = new y0n(this, onmVar);
        }
        Object objW = y0nVar.b;
        int i3 = y0nVar.d;
        if (i3 == 0) {
            hm5.M(objW);
            if (ihc1.y0(str)) {
                return null;
            }
            y0nVar.a = str;
            y0nVar.d = 1;
            objW = w(y0nVar);
            Object obj = d9n.a;
            if (objW == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = y0nVar.a;
            hm5.M(objW);
        }
        return ((LinkedHashMap) objW).get(str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[LOOP:0: B:36:0x008a->B:38:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3 A[LOOP:1: B:40:0x009d->B:42:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(String str, String str2, onm onmVar) {
        z0n z0nVar;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet;
        if (onmVar instanceof z0n) {
            z0nVar = (z0n) onmVar;
            int i2 = z0nVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0nVar.e = i2 - Integer.MIN_VALUE;
            } else {
                z0nVar = new z0n(this, onmVar);
            }
        } else {
            z0nVar = new z0n(this, onmVar);
        }
        Object objA = z0nVar.c;
        int i3 = z0nVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objA);
            if (!ihc1.y0(str) && str2 != null && !ihc1.y0(str2)) {
                z0nVar.a = str;
                z0nVar.b = str2;
                z0nVar.e = 1;
                if (E(str2, z0nVar) != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i3 == 1) {
            str2 = z0nVar.b;
            str = z0nVar.a;
            hm5.M(objA);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    hm5.M(objA);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = z0nVar.b;
            str3 = z0nVar.a;
            hm5.M(objA);
        }
        linkedHashMap = (LinkedHashMap) objA;
        linkedHashSet = (LinkedHashSet) linkedHashMap.remove(str3);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        linkedHashSet.remove(str4);
        linkedHashSet.add(str4);
        while (linkedHashSet.size() > 20) {
            linkedHashSet.remove(o7h.p0(linkedHashSet));
        }
        linkedHashMap.put(str3, linkedHashSet);
        while (linkedHashMap.size() > 20) {
            linkedHashMap.remove(o7h.p0(linkedHashMap.keySet()));
        }
        z0nVar.a = null;
        z0nVar.b = null;
        z0nVar.e = 3;
        if (K(linkedHashMap, z0nVar) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        z0nVar.a = str;
        z0nVar.b = str2;
        z0nVar.e = 2;
        objA = A(z0nVar);
        if (objA != d9nVar) {
            String str5 = str2;
            str3 = str;
            str4 = str5;
            linkedHashMap = (LinkedHashMap) objA;
            linkedHashSet = (LinkedHashSet) linkedHashMap.remove(str3);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.remove(str4);
            linkedHashSet.add(str4);
            while (linkedHashSet.size() > 20) {
                linkedHashSet.remove(o7h.p0(linkedHashSet));
            }
            linkedHashMap.put(str3, linkedHashSet);
            while (linkedHashMap.size() > 20) {
                linkedHashMap.remove(o7h.p0(linkedHashMap.keySet()));
            }
            z0nVar.a = null;
            z0nVar.b = null;
            z0nVar.e = 3;
            if (K(linkedHashMap, z0nVar) != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, onm onmVar) {
        a1n a1nVar;
        if (onmVar instanceof a1n) {
            a1nVar = (a1n) onmVar;
            int i2 = a1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                a1nVar = new a1n(this, onmVar);
            }
        } else {
            a1nVar = new a1n(this, onmVar);
        }
        Object objA = a1nVar.b;
        int i3 = a1nVar.d;
        if (i3 == 0) {
            hm5.M(objA);
            if (!ihc1.y0(str)) {
                a1nVar.a = str;
                a1nVar.d = 1;
                objA = A(a1nVar);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            }
            return w7x.a;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = a1nVar.a;
        hm5.M(objA);
        Set set = (Set) ((LinkedHashMap) objA).get(str);
        if (set != null) {
            return set;
        }
        return w7x.a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object v(boolean z, onm onmVar) {
        b1n b1nVar;
        String str;
        a2n a2nVar;
        long j2;
        boolean z2;
        int iOrdinal;
        if (onmVar instanceof b1n) {
            b1nVar = (b1n) onmVar;
            int i2 = b1nVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1nVar.f = i2 - Integer.MIN_VALUE;
            } else {
                b1nVar = new b1n(this, onmVar);
            }
        } else {
            b1nVar = new b1n(this, onmVar);
        }
        b1n b1nVar2 = b1nVar;
        Object objT = b1nVar2.d;
        int i3 = b1nVar2.f;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objT);
            dlf dlfVar = this.d;
            boolean zCompareAndSet = dlfVar.d.compareAndSet(false, true);
            c9n c9nVar = this.e;
            if (zCompareAndSet) {
                c921.y(c9nVar, (o8n) null, 0, new mx(dlfVar, (lnm) null, (byte) 6), 3);
            }
            this.c.f(c9nVar);
            b1nVar2.a = z;
            b1nVar2.f = 1;
            objT = T(b1nVar2);
            if (objT != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            z = b1nVar2.a;
            hm5.M(objT);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    hm5.M(objT);
                    return null;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = b1nVar2.c;
            z2 = b1nVar2.a;
            String str2 = b1nVar2.b;
            hm5.M(objT);
            str = str2;
            j2 = j3;
            a2nVar = this;
        }
        iOrdinal = ((h0n) objT).ordinal();
        if (iOrdinal != 0) {
            return str;
        }
        if (iOrdinal == 1) {
            eg.o();
            return null;
        }
        b1nVar2.b = null;
        b1nVar2.a = z2;
        b1nVar2.c = j2;
        b1nVar2.f = 3;
        if (a2nVar.h(b1nVar2) == d9nVar) {
            return d9nVar;
        }
        return null;
        boolean z3 = z;
        dma1 dma1Var = (dma1) objT;
        String strE = dma1Var.e(f, (String) null);
        str = (strE == null || ihc1.y0(strE)) ? null : strE;
        long jG = dma1Var.g(g, 0L);
        if (str != null && jG > 0) {
            b1nVar2.b = str;
            b1nVar2.a = z3;
            b1nVar2.c = jG;
            b1nVar2.f = 2;
            a2nVar = this;
            j2 = jG;
            objT = a2nVar.g(j2, str, b1nVar2, z3);
            if (objT != d9nVar) {
                z2 = z3;
                iOrdinal = ((h0n) objT).ordinal();
                if (iOrdinal != 0) {
                    return str;
                }
                if (iOrdinal == 1) {
                    eg.o();
                    return null;
                }
                b1nVar2.b = null;
                b1nVar2.a = z2;
                b1nVar2.c = j2;
                b1nVar2.f = 3;
                if (a2nVar.h(b1nVar2) == d9nVar) {
                }
            }
            return d9nVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable w(onm onmVar) {
        c1n c1nVar;
        if (onmVar instanceof c1n) {
            c1nVar = (c1n) onmVar;
            int i2 = c1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                c1nVar = new c1n(this, onmVar);
            }
        } else {
            c1nVar = new c1n(this, onmVar);
        }
        Object objT = c1nVar.a;
        int i3 = c1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            c1nVar.c = 1;
            objT = T(c1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        String strE = ((dma1) objT).e(h, (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strE != null && strE.length() != 0) {
            Iterator it = ihc1.P0(strE, new char[]{'\n'}, 6).iterator();
            while (it.hasNext()) {
                List listP0 = ihc1.P0((String) it.next(), new char[]{'\t'}, 6);
                String str = (String) o7h.s0(listP0);
                if (str == null || ihc1.y0(str)) {
                    str = null;
                }
                String str2 = (String) o7h.t0(1, listP0);
                Long lD0 = str2 != null ? nhc1.d0(10, str2) : null;
                if (str != null && lD0 != null) {
                    linkedHashMap.put(str, lD0);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, onm onmVar) {
        e1n e1nVar;
        String str2;
        wfb0 wfb0Var;
        if (onmVar instanceof e1n) {
            e1nVar = (e1n) onmVar;
            int i2 = e1nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e1nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                e1nVar = new e1n(this, onmVar);
            }
        } else {
            e1nVar = new e1n(this, onmVar);
        }
        Object objZ = e1nVar.b;
        int i3 = e1nVar.d;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objZ);
            if (!ihc1.y0(str)) {
                e1nVar.a = str;
                e1nVar.d = 1;
                objZ = z(e1nVar);
                if (objZ != d9nVar) {
                }
                return d9nVar;
            }
            return null;
        }
        if (i3 == 1) {
            str = e1nVar.a;
            hm5.M(objZ);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = e1nVar.a;
            hm5.M(objZ);
        }
        wfb0Var = (wfb0) objZ;
        if (wfb0Var == null && u890.j(wfb0Var.a(), str2)) {
            return wfb0Var;
        }
        return null;
        wfb0 wfb0Var2 = (wfb0) ((LinkedHashMap) objZ).get(str);
        if (wfb0Var2 != null) {
            return wfb0Var2;
        }
        e1nVar.a = str;
        e1nVar.d = 2;
        objZ = y(e1nVar);
        if (objZ != d9nVar) {
            str2 = str;
            wfb0Var = (wfb0) objZ;
            if (wfb0Var == null) {
            }
            return null;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(onm onmVar) {
        d1n d1nVar;
        if (onmVar instanceof d1n) {
            d1nVar = (d1n) onmVar;
            int i2 = d1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                d1nVar = new d1n(this, onmVar);
            }
        } else {
            d1nVar = new d1n(this, onmVar);
        }
        Object objT = d1nVar.a;
        int i3 = d1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            d1nVar.c = 1;
            objT = T(d1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        dma1 dma1Var = (dma1) objT;
        String strE = dma1Var.e(k, (String) null);
        if (strE != null) {
            if (ihc1.y0(strE)) {
                strE = null;
            }
            if (strE != null) {
                String strE2 = dma1Var.e(l, (String) null);
                if (strE2 == null || ihc1.y0(strE2)) {
                    strE2 = null;
                }
                String strE3 = dma1Var.e(m, (String) null);
                if (strE3 != null) {
                    if (ihc1.y0(strE3)) {
                        strE3 = null;
                    }
                    if (strE3 != null) {
                        return new wfb0(strE, strE2, strE3);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable z(onm onmVar) {
        f1n f1nVar;
        wfb0 wfb0Var;
        if (onmVar instanceof f1n) {
            f1nVar = (f1n) onmVar;
            int i2 = f1nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1nVar.c = i2 - Integer.MIN_VALUE;
            } else {
                f1nVar = new f1n(this, onmVar);
            }
        } else {
            f1nVar = new f1n(this, onmVar);
        }
        Object objT = f1nVar.a;
        int i3 = f1nVar.c;
        if (i3 == 0) {
            hm5.M(objT);
            f1nVar.c = 1;
            objT = T(f1nVar);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        String strE = ((dma1) objT).e(n, (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strE != null && strE.length() != 0) {
            Iterator it = ihc1.P0(strE, new char[]{'\n'}, 6).iterator();
            while (it.hasNext()) {
                List listP0 = ihc1.P0((String) it.next(), new char[]{'\t'}, 6);
                String str = (String) o7h.s0(listP0);
                if (str == null) {
                    wfb0Var = null;
                } else {
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str != null && listP0.size() >= 2) {
                        boolean z = listP0.size() >= 4 && (u890.j(listP0.get(2), "0") || u890.j(listP0.get(2), "1"));
                        List list = listP0;
                        String strY0 = o7h.y0(z ? o7h.k0(list, 3) : o7h.k0(list, 2), "\t", null, null, null, 62);
                        if (ihc1.y0(strY0)) {
                            strY0 = null;
                        }
                        if (strY0 == null) {
                            wfb0Var = null;
                        } else {
                            Object obj = listP0.get(1);
                            if (ihc1.y0((String) obj)) {
                                obj = null;
                            }
                            wfb0Var = new wfb0(strY0, (String) obj, str, z && u890.j(listP0.get(2), "1"));
                        }
                    } else {
                        wfb0Var = null;
                    }
                }
                if (wfb0Var != null) {
                    linkedHashMap.put(wfb0Var.a(), wfb0Var);
                }
            }
        }
        return linkedHashMap;
    }
}
