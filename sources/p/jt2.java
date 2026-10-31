package p;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jt2 {
    public final Context a;
    public final cs2 b;
    public final gx2 c;
    public final jr2 d;
    public final r3d e;
    public final yqg f;
    public final a2n g;
    public final zo2 h;
    public final String i;
    public final String j;

    public jt2(Context context, cs2 cs2Var, gx2 gx2Var, jr2 jr2Var, r3d r3dVar, yqg yqgVar, a2n a2nVar, zo2 zo2Var, x6h0 x6h0Var) {
        this.a = context;
        this.b = cs2Var;
        this.c = gx2Var;
        this.d = jr2Var;
        this.e = r3dVar;
        this.f = yqgVar;
        this.g = a2nVar;
        this.h = zo2Var;
        this.i = x6h0Var.Z;
        this.j = x6h0Var.N0;
    }

    public static z4h0 a(xv2 xv2Var, ArrayList arrayList, int i) {
        return new z4h0(new xv2(l1d.k(i, xv2Var.a, ":seg:"), mqo1.A(arrayList), xv2Var.c, true, xv2Var.e, xv2Var.f), null);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0187  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    public static o7h0 h(jt2 jt2Var, hr2 hr2Var, String str, String str2, int i) {
        String str3;
        h290 h290Var;
        String str4;
        List listSingletonList;
        String string = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        jt2Var.getClass();
        ArrayList<ds2> arrayList = hr2Var.a;
        ArrayList arrayList2 = new ArrayList();
        for (ds2 ds2Var : arrayList) {
            se11 se11Var = lt2.a;
            es2 es2Var = ds2Var.c;
            String str6 = ds2Var.a;
            if (str6 == null || ihc1.y0(str6)) {
                str6 = null;
            }
            String str7 = ds2Var.b;
            if (str7 == null || ihc1.y0(str7)) {
                str7 = null;
            }
            if (es2Var != null) {
                h290Var = es2Var.a;
                if (h290Var.isEmpty()) {
                    h290Var = null;
                }
            } else {
                h290Var = null;
            }
            at2 at2Var = es2Var != null ? es2Var.c : null;
            String str8 = es2Var != null ? es2Var.b : null;
            if (str8 != null) {
                if (ihc1.y0(str8)) {
                    str8 = null;
                }
                if (str8 == null) {
                    if (h290Var != null) {
                        str8 = (String) o7h.s0(h290Var);
                    } else {
                        str8 = null;
                    }
                }
            } else if (h290Var != null) {
                str8 = (String) o7h.s0(h290Var);
            } else {
                str8 = null;
            }
            if (str8 != null) {
                String strZ0 = ihc1.Z0(str8, "?");
                if ((!nhc1.Y(strZ0, "spotify:playlist:", false) || strZ0.length() <= 17) && !lt2.a.e(strZ0)) {
                    str4 = null;
                } else {
                    str4 = str8;
                }
            } else {
                str4 = null;
            }
            ns2 ns2Var = ds2Var.d;
            nt2 nt2Var = ds2Var.f;
            if (str6 != null) {
                listSingletonList = Collections.singletonList(new crl(str6));
            } else if (str7 != null) {
                listSingletonList = Collections.singletonList(new drl(str7));
            } else if (at2Var != null && str4 != null) {
                listSingletonList = Collections.singletonList(new erl(fg91.b, "", at2Var.a, str4, str4, at2Var.b));
            } else if (h290Var != null) {
                listSingletonList = Collections.singletonList(new frl(2, es2Var != null ? es2Var.b : null, mqo1.A(h290Var)));
            } else if (ns2Var != null) {
                smc0 smc0VarN = k4p1.n();
                Collection collection = ns2Var.a;
                if (collection.isEmpty()) {
                    collection = null;
                }
                if (collection != null) {
                    smc0VarN.add(new frl(4, null, mqo1.A(collection)));
                }
                Collection collection2 = ns2Var.b;
                if (collection2.isEmpty()) {
                    collection2 = null;
                }
                if (collection2 != null) {
                    smc0VarN.add(new frl(4, null, mqo1.A(collection2)));
                }
                listSingletonList = k4p1.k(smc0VarN);
            } else if (nt2Var != null) {
                c380 c380VarA = mqo1.A(nt2Var.a);
                String str9 = nt2Var.b;
                String str10 = nt2Var.c;
                String str11 = nt2Var.d;
                listSingletonList = Collections.singletonList(new erl(c380VarA, str9, str10, (str11 == null || ihc1.y0(str11)) ? null : str11, null, null));
            } else {
                listSingletonList = z6x.a;
            }
            r7h.W(listSingletonList, arrayList2);
        }
        c380 c380VarA2 = mqo1.A(arrayList2);
        if (c380VarA2.isEmpty()) {
            return null;
        }
        String str12 = hr2Var.c;
        if (str12 == null) {
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            str3 = string;
        } else {
            String str13 = !ihc1.y0(str12) ? str12 : null;
            if (str13 == null) {
                if (string == null) {
                    string = UUID.randomUUID().toString();
                }
                str3 = string;
            } else {
                str3 = str13;
            }
        }
        return new o7h0(new xv2(str3, c380VarA2, true, false, str5, jt2Var.f.b() / 1000), new m8r(str3, mqo1.s(new String[]{"agent_gateway_response"})), str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, lnm lnmVar) {
        ft2 ft2Var;
        if (lnmVar instanceof ft2) {
            ft2Var = (ft2) lnmVar;
            int i = ft2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ft2Var.d = i - Integer.MIN_VALUE;
            } else {
                ft2Var = new ft2(this, lnmVar);
            }
        } else {
            ft2Var = new ft2(this, lnmVar);
        }
        Object objY = ft2Var.b;
        int i2 = ft2Var.d;
        String str2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                hi2 hi2Var = new hi2(this, str, (lnm) null, (byte) 5);
                ft2Var.a = str;
                ft2Var.d = 1;
                objY = fn31.Y(b3sVar, hi2Var, ft2Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ft2Var.a;
                hm5.M(objY);
            }
            List list = (List) objY;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r7h.W(((qs2) it.next()).a, arrayList);
            }
            List listA1 = o7h.a1(o7h.u1(arrayList), pap1.s(new iu30[]{ny1.c1, ny1.d1}));
            ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
            Iterator it2 = listA1.iterator();
            while (it2.hasNext()) {
                arrayList2.add((vs2) ((aa80) it2.next()).b);
            }
            c380 c380VarG = g(str, arrayList2);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String str3 = ((qs2) it3.next()).c;
                if (str3 != null) {
                    str2 = str3;
                    break;
                }
            }
            return new x2h0(str, str2, c380VarG);
        } catch (Throwable th) {
            return new m2h0(th);
        }
    }

    public final void c(hr2 hr2Var) {
        os2 os2Var;
        Iterator it = hr2Var.b.iterator();
        do {
            if (!it.hasNext()) {
                os2Var = null;
                break;
            }
            os2Var = ((gr2) it.next()).c;
        } while (os2Var == null);
        if (os2Var != null) {
            String str = os2Var.a;
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                zo2 zo2Var = this.h;
                fn31.T(zo2Var.a, (o8n) null, 0, new hi2(zo2Var.b, str, (lnm) null, (byte) 3), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5 A[Catch: all -> 0x00e9, PHI: r1 r2 r3 r9
      0x00b5: PHI (r1v14 p.d0h0) = (r1v5 p.d0h0), (r1v18 p.d0h0) binds: [B:23:0x0052, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r2v15 android.net.Uri) = (r2v3 android.net.Uri), (r2v19 android.net.Uri) binds: [B:23:0x0052, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r3v18 java.lang.Object) = (r3v7 java.lang.Object), (r3v25 java.lang.Object) binds: [B:23:0x0052, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r9v5 p.gt2) = (r9v0 p.gt2), (r9v7 p.gt2) binds: [B:23:0x0052, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x00e9, blocks: (B:54:0x0125, B:55:0x012a, B:59:0x0134, B:61:0x013c, B:63:0x0140, B:65:0x014b, B:67:0x014f, B:70:0x0158, B:73:0x0161, B:76:0x016a, B:79:0x0173, B:84:0x017e, B:85:0x0180, B:88:0x018e, B:91:0x0198, B:94:0x01a3, B:96:0x01a7, B:99:0x01ad, B:102:0x01b3, B:105:0x01b9, B:108:0x01bf, B:113:0x01c7, B:114:0x01c9, B:116:0x01d7, B:36:0x00b5, B:38:0x00ca, B:39:0x00d5, B:41:0x00db, B:43:0x00e5, B:46:0x00ec, B:48:0x0100, B:33:0x0089, B:30:0x006e), top: B:123:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:54:0x0125, B:55:0x012a, B:59:0x0134, B:61:0x013c, B:63:0x0140, B:65:0x014b, B:67:0x014f, B:70:0x0158, B:73:0x0161, B:76:0x016a, B:79:0x0173, B:84:0x017e, B:85:0x0180, B:88:0x018e, B:91:0x0198, B:94:0x01a3, B:96:0x01a7, B:99:0x01ad, B:102:0x01b3, B:105:0x01b9, B:108:0x01bf, B:113:0x01c7, B:114:0x01c9, B:116:0x01d7, B:36:0x00b5, B:38:0x00ca, B:39:0x00d5, B:41:0x00db, B:43:0x00e5, B:46:0x00ec, B:48:0x0100, B:33:0x0089, B:30:0x006e), top: B:123:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:54:0x0125, B:55:0x012a, B:59:0x0134, B:61:0x013c, B:63:0x0140, B:65:0x014b, B:67:0x014f, B:70:0x0158, B:73:0x0161, B:76:0x016a, B:79:0x0173, B:84:0x017e, B:85:0x0180, B:88:0x018e, B:91:0x0198, B:94:0x01a3, B:96:0x01a7, B:99:0x01ad, B:102:0x01b3, B:105:0x01b9, B:108:0x01bf, B:113:0x01c7, B:114:0x01c9, B:116:0x01d7, B:36:0x00b5, B:38:0x00ca, B:39:0x00d5, B:41:0x00db, B:43:0x00e5, B:46:0x00ec, B:48:0x0100, B:33:0x0089, B:30:0x006e), top: B:123:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0100 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:54:0x0125, B:55:0x012a, B:59:0x0134, B:61:0x013c, B:63:0x0140, B:65:0x014b, B:67:0x014f, B:70:0x0158, B:73:0x0161, B:76:0x016a, B:79:0x0173, B:84:0x017e, B:85:0x0180, B:88:0x018e, B:91:0x0198, B:94:0x01a3, B:96:0x01a7, B:99:0x01ad, B:102:0x01b3, B:105:0x01b9, B:108:0x01bf, B:113:0x01c7, B:114:0x01c9, B:116:0x01d7, B:36:0x00b5, B:38:0x00ca, B:39:0x00d5, B:41:0x00db, B:43:0x00e5, B:46:0x00ec, B:48:0x0100, B:33:0x0089, B:30:0x006e), top: B:123:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    public final Object d(d0h0 d0h0Var, lnm lnmVar) {
        gt2 gt2Var;
        d0h0 d0h0Var2;
        Uri uri;
        d0h0 d0h0Var3;
        Object objY;
        d0h0 d0h0Var4;
        Object objC;
        hr2 hr2Var;
        hr2 hr2Var2;
        String str;
        hx2 hx2Var;
        String str2;
        hx2 hx2Var2;
        hr2 hr2Var3;
        d0h0 d0h0Var5;
        h290 h290Var;
        d0h0 d0h0Var6;
        d0h0 d0h0Var7;
        ArrayList arrayList;
        Iterator it;
        String strY0;
        a2n a2nVar;
        String str3;
        String str4;
        d0h0 d0h0Var8 = d0h0Var;
        if (lnmVar instanceof gt2) {
            gt2Var = (gt2) lnmVar;
            int i = gt2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gt2Var.i = i - Integer.MIN_VALUE;
            } else {
                gt2Var = new gt2(this, lnmVar);
            }
        } else {
            gt2Var = new gt2(this, lnmVar);
        }
        gt2 gt2Var2 = gt2Var;
        Object obj = gt2Var2.g;
        ?? r3 = gt2Var2.i;
        d9n d9nVar = d9n.a;
        if (r3 == 0) {
            hm5.M(obj);
            try {
                uri = d0h0Var8.a;
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                k2 k2Var = new k2(this, uri, (lnm) null, (byte) 19);
                gt2Var2.a = d0h0Var8;
                gt2Var2.b = uri;
                gt2Var2.i = 1;
                objY = fn31.Y(b3sVar, k2Var, gt2Var2);
                d0h0Var3 = d0h0Var8;
                if (objY != d9nVar) {
                    ts2 ts2Var = new ts2((byte[]) objY);
                    gx2 gx2Var = this.c;
                    List listSingletonList = Collections.singletonList(ts2Var);
                    String str5 = d0h0Var3.b;
                    rq2 rq2Var = rq2.t;
                    String str6 = d0h0Var3.d;
                    this.b.getClass();
                    String str7 = this.i;
                    gt2Var2.a = d0h0Var3;
                    gt2Var2.b = uri;
                    gt2Var2.i = 2;
                    objC = gx2Var.c(listSingletonList, str5, rq2Var, str6, str7, gt2Var2);
                    gt2Var2 = gt2Var2;
                    d0h0Var4 = d0h0Var3;
                    if (objC == d9nVar) {
                        hx2Var2 = (hx2) objC;
                        this.e.e(Collections.singletonList(uri.toString()));
                        str2 = hx2Var2.a;
                        hr2Var3 = hx2Var2.b;
                        d0h0Var5 = d0h0Var4;
                        if (hr2Var3 != null) {
                            ArrayList arrayList2 = hr2Var3.a;
                            arrayList = new ArrayList();
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                str4 = ((ds2) it.next()).b;
                                if (str4 != null) {
                                    arrayList.add(str4);
                                }
                            }
                            strY0 = o7h.y0(arrayList, "\n", (String) null, (String) null, (iu30) null, 62);
                            if (ihc1.y0(strY0)) {
                                hx2Var = hx2Var2;
                                hr2Var2 = hr2Var3;
                                d0h0Var6 = d0h0Var4;
                            } else {
                                a2nVar = this.g;
                                str3 = hr2Var3.c;
                                gt2Var2.a = d0h0Var4;
                                gt2Var2.b = null;
                                gt2Var2.c = hx2Var2;
                                gt2Var2.d = str2;
                                gt2Var2.e = hr2Var3;
                                gt2Var2.f = hr2Var3;
                                gt2Var2.i = 3;
                                if (a2nVar.I(strY0, str3, str2, false, gt2Var2) != d9nVar) {
                                    d0h0Var7 = d0h0Var4;
                                    hr2Var = hr2Var3;
                                    hx2Var = hx2Var2;
                                    str = str2;
                                    hr2Var2 = hr2Var;
                                    hr2Var3 = hr2Var;
                                    str2 = str;
                                    d0h0Var6 = d0h0Var7;
                                }
                            }
                            c(hr2Var3);
                            hr2Var3 = hr2Var2;
                            hx2Var2 = hx2Var;
                            d0h0Var5 = d0h0Var6;
                        }
                    }
                }
                return d9nVar;
            } catch (Throwable th) {
                th = th;
                d0h0Var2 = d0h0Var8;
                return new c2h0(d0h0Var2.e, th);
            }
        }
        try {
            if (r3 == 1) {
                Uri uri2 = gt2Var2.b;
                d0h0 d0h0Var9 = gt2Var2.a;
                hm5.M(obj);
                uri = uri2;
                d0h0Var3 = d0h0Var9;
                objY = obj;
                ts2 ts2Var2 = new ts2((byte[]) objY);
                gx2 gx2Var2 = this.c;
                List listSingletonList2 = Collections.singletonList(ts2Var2);
                String str8 = d0h0Var3.b;
                rq2 rq2Var2 = rq2.t;
                String str9 = d0h0Var3.d;
                this.b.getClass();
                String str10 = this.i;
                gt2Var2.a = d0h0Var3;
                gt2Var2.b = uri;
                gt2Var2.i = 2;
                objC = gx2Var2.c(listSingletonList2, str8, rq2Var2, str9, str10, gt2Var2);
                gt2Var2 = gt2Var2;
                d0h0Var4 = d0h0Var3;
                if (objC == d9nVar) {
                    hx2Var2 = (hx2) objC;
                    this.e.e(Collections.singletonList(uri.toString()));
                    str2 = hx2Var2.a;
                    hr2Var3 = hx2Var2.b;
                    d0h0Var5 = d0h0Var4;
                    if (hr2Var3 != null) {
                        ArrayList arrayList3 = hr2Var3.a;
                        arrayList = new ArrayList();
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            str4 = ((ds2) it.next()).b;
                            if (str4 != null) {
                                arrayList.add(str4);
                            }
                        }
                        strY0 = o7h.y0(arrayList, "\n", (String) null, (String) null, (iu30) null, 62);
                        if (ihc1.y0(strY0)) {
                            a2nVar = this.g;
                            str3 = hr2Var3.c;
                            gt2Var2.a = d0h0Var4;
                            gt2Var2.b = null;
                            gt2Var2.c = hx2Var2;
                            gt2Var2.d = str2;
                            gt2Var2.e = hr2Var3;
                            gt2Var2.f = hr2Var3;
                            gt2Var2.i = 3;
                            if (a2nVar.I(strY0, str3, str2, false, gt2Var2) != d9nVar) {
                                d0h0Var7 = d0h0Var4;
                                hr2Var = hr2Var3;
                                hx2Var = hx2Var2;
                                str = str2;
                                hr2Var2 = hr2Var;
                            }
                        } else {
                            hx2Var = hx2Var2;
                            hr2Var2 = hr2Var3;
                            d0h0Var6 = d0h0Var4;
                        }
                        c(hr2Var3);
                        hr2Var3 = hr2Var2;
                        hx2Var2 = hx2Var;
                        d0h0Var5 = d0h0Var6;
                    }
                }
                return d9nVar;
            }
            if (r3 == 2) {
                Uri uri3 = gt2Var2.b;
                d0h0 d0h0Var10 = gt2Var2.a;
                hm5.M(obj);
                uri = uri3;
                d0h0Var4 = d0h0Var10;
                objC = obj;
                hx2Var2 = (hx2) objC;
                this.e.e(Collections.singletonList(uri.toString()));
                str2 = hx2Var2.a;
                hr2Var3 = hx2Var2.b;
                d0h0Var5 = d0h0Var4;
                if (hr2Var3 != null) {
                    ArrayList arrayList4 = hr2Var3.a;
                    arrayList = new ArrayList();
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        str4 = ((ds2) it.next()).b;
                        if (str4 != null) {
                            arrayList.add(str4);
                        }
                    }
                    strY0 = o7h.y0(arrayList, "\n", (String) null, (String) null, (iu30) null, 62);
                    if (ihc1.y0(strY0)) {
                        a2nVar = this.g;
                        str3 = hr2Var3.c;
                        gt2Var2.a = d0h0Var4;
                        gt2Var2.b = null;
                        gt2Var2.c = hx2Var2;
                        gt2Var2.d = str2;
                        gt2Var2.e = hr2Var3;
                        gt2Var2.f = hr2Var3;
                        gt2Var2.i = 3;
                        if (a2nVar.I(strY0, str3, str2, false, gt2Var2) != d9nVar) {
                            d0h0Var7 = d0h0Var4;
                            hr2Var = hr2Var3;
                            hx2Var = hx2Var2;
                            str = str2;
                            hr2Var2 = hr2Var;
                        }
                        return d9nVar;
                    }
                    hx2Var = hx2Var2;
                    hr2Var2 = hr2Var3;
                    d0h0Var6 = d0h0Var4;
                    c(hr2Var3);
                    hr2Var3 = hr2Var2;
                    hx2Var2 = hx2Var;
                    d0h0Var5 = d0h0Var6;
                }
            } else {
                if (r3 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hr2Var = gt2Var2.f;
                hr2Var2 = gt2Var2.e;
                str = gt2Var2.d;
                hx2Var = gt2Var2.c;
                d0h0 d0h0Var11 = gt2Var2.a;
                try {
                    hm5.M(obj);
                    d0h0Var7 = d0h0Var11;
                } catch (Throwable th2) {
                    th = th2;
                    d0h0Var2 = d0h0Var11;
                    return new c2h0(d0h0Var2.e, th);
                }
            }
            hr2Var3 = hr2Var;
            str2 = str;
            d0h0Var6 = d0h0Var7;
            c(hr2Var3);
            hr2Var3 = hr2Var2;
            hx2Var2 = hx2Var;
            d0h0Var5 = d0h0Var6;
        } catch (Throwable th3) {
            th = th3;
            d0h0Var2 = r3;
        }
        String str11 = str2;
        String str12 = d0h0Var5.d;
        h290 h290Var2 = z6x.a;
        if (str12 == null) {
            ys2 ys2VarB = hr2Var3 != null ? lt2.b(hr2Var3.b) : null;
            o7h0 o7h0VarH = hr2Var3 != null ? h(this, hr2Var3, null, hx2Var2.c, 1) : null;
            String str13 = hx2Var2.d;
            String str14 = ys2VarB != null ? ys2VarB.a : null;
            String str15 = ys2VarB != null ? ys2VarB.b : null;
            Long l = ys2VarB != null ? ys2VarB.c : null;
            ijg1 ijg1Var = ys2VarB != null ? ys2VarB.d : null;
            h290Var = ys2VarB != null ? ys2VarB.e : null;
            return new v2h0(str11, o7h0VarH, str13, str14, str15, l, ijg1Var, h290Var == null ? h290Var2 : h290Var, ys2VarB != null ? ys2VarB.f : 0, d0h0Var5.e);
        }
        ys2 ys2VarB2 = hr2Var3 != null ? lt2.b(hr2Var3.b) : null;
        o7h0 o7h0VarH2 = hr2Var3 != null ? h(this, hr2Var3, null, hx2Var2.c, 1) : null;
        if (o7h0VarH2 == null) {
            return new c2h0(d0h0Var5.e, new IllegalStateException("Received empty response from agent gateway"));
        }
        String str16 = ys2VarB2 != null ? ys2VarB2.a : null;
        String str17 = ys2VarB2 != null ? ys2VarB2.b : null;
        Long l2 = ys2VarB2 != null ? ys2VarB2.c : null;
        ijg1 ijg1Var2 = ys2VarB2 != null ? ys2VarB2.d : null;
        h290Var = ys2VarB2 != null ? ys2VarB2.e : null;
        if (h290Var != null) {
            h290Var2 = h290Var;
        }
        return new d2h0(o7h0VarH2, str16, str17, l2, ijg1Var2, h290Var2, ys2VarB2 != null ? ys2VarB2.f : 0, d0h0Var5.e);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0189 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x018c  */
    /* JADX WARN: Code duplicated, block: B:104:0x018f A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0192  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:112:0x019e A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01aa A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0103 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x016a A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0173  */
    /* JADX WARN: Code duplicated, block: B:93:0x0177 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x017b A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:49:0x00f5, B:50:0x00f9, B:54:0x0103, B:56:0x010b, B:58:0x010f, B:61:0x011e, B:63:0x0122, B:66:0x0128, B:69:0x0131, B:72:0x0137, B:75:0x0140, B:81:0x014f, B:83:0x0154, B:87:0x0160, B:90:0x016a, B:93:0x0177, B:95:0x017b, B:98:0x0182, B:101:0x0189, B:104:0x018f, B:107:0x0195, B:112:0x019e, B:114:0x01a3, B:116:0x01aa, B:21:0x004a, B:33:0x0093, B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b7, B:41:0x00bb, B:43:0x00d1, B:26:0x0057, B:28:0x0073, B:30:0x0079), top: B:120:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0186  */
    public final Object e(e0h0 e0h0Var, lnm lnmVar) {
        ht2 ht2Var;
        d9n d9nVar;
        int i;
        Object objE;
        hx2 hx2Var;
        String str;
        hr2 hr2Var;
        hr2 hr2Var2;
        e0h0 e0h0Var2;
        String str2;
        hx2 hx2Var2;
        hr2 hr2Var3;
        String str3;
        String str4;
        h290 h290Var;
        ys2 ys2VarB;
        h290 h290Var2;
        o7h0 o7h0VarH;
        h290 h290Var3;
        h290 h290Var4;
        h290 h290Var5;
        h290 h290Var6;
        h290 h290Var7;
        int i2;
        ys2 ys2VarB2;
        o7h0 o7h0VarH2;
        String str5;
        String str6;
        Long l;
        ijg1 ijg1Var;
        h290 h290Var8;
        h290 h290Var9;
        int i3;
        e0h0 e0h0Var3 = e0h0Var;
        if (lnmVar instanceof ht2) {
            ht2Var = (ht2) lnmVar;
            int i4 = ht2Var.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ht2Var.h = i4 - Integer.MIN_VALUE;
            } else {
                ht2Var = new ht2(this, lnmVar);
            }
        } else {
            ht2Var = new ht2(this, lnmVar);
        }
        ht2 ht2Var2 = ht2Var;
        Object obj = ht2Var2.f;
        int i5 = ht2Var2.h;
        d9n d9nVar2 = d9n.a;
        try {
            if (i5 == 0) {
                hm5.M(obj);
                String str7 = this.j;
                gx2 gx2Var = this.c;
                String str8 = e0h0Var3.a;
                rq2 rq2Var = this.b.b;
                String str9 = e0h0Var3.c;
                boolean z = e0h0Var3.f;
                String str10 = this.i;
                String str11 = e0h0Var3.g;
                tv80 tv80Var = e0h0Var3.e;
                us2 us2VarL = tv80Var != null ? fq7.L(tv80Var) : null;
                String str12 = e0h0Var3.d;
                ht2Var2.a = e0h0Var3;
                ht2Var2.h = 1;
                d9nVar = d9nVar2;
                i = 2;
                objE = gx2.e(gx2Var, str8, rq2Var, str9, z, str10, (String) null, str7, str11, us2VarL, str12, ht2Var2, 64);
                if (objE == d9nVar) {
                }
                return d9nVar;
            }
            if (i5 == 1) {
                e0h0Var3 = ht2Var2.a;
                hm5.M(obj);
                i = 2;
                objE = obj;
                d9nVar = d9nVar2;
            } else {
                if (i5 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hr2Var3 = ht2Var2.e;
                hr2Var2 = ht2Var2.d;
                str2 = ht2Var2.c;
                hx2Var2 = ht2Var2.b;
                e0h0Var2 = ht2Var2.a;
                try {
                    hm5.M(obj);
                } catch (Throwable th) {
                    th = th;
                    e0h0Var3 = e0h0Var2;
                    return new c2h0(e0h0Var3.h, th);
                }
            }
            hr2Var = hr2Var3;
            hx2Var = hx2Var2;
            e0h0Var3 = e0h0Var2;
            str = str2;
            c(hr2Var);
            hr2Var = hr2Var2;
            str3 = str;
            str4 = e0h0Var3.c;
            h290Var = z6x.a;
            if (str4 == null) {
                if (hr2Var != null) {
                    ys2VarB2 = lt2.b(hr2Var.b);
                } else {
                    ys2VarB2 = null;
                }
                if (hr2Var != null) {
                    o7h0VarH2 = h(this, hr2Var, null, hx2Var.c, 1);
                } else {
                    o7h0VarH2 = null;
                }
                String str13 = hx2Var.d;
                if (ys2VarB2 != null) {
                    str5 = ys2VarB2.a;
                } else {
                    str5 = null;
                }
                if (ys2VarB2 != null) {
                    str6 = ys2VarB2.b;
                } else {
                    str6 = null;
                }
                if (ys2VarB2 != null) {
                    l = ys2VarB2.c;
                } else {
                    l = null;
                }
                if (ys2VarB2 != null) {
                    ijg1Var = ys2VarB2.d;
                } else {
                    ijg1Var = null;
                }
                if (ys2VarB2 != null) {
                    h290Var8 = ys2VarB2.e;
                } else {
                    h290Var8 = null;
                }
                if (h290Var8 == null) {
                    h290Var9 = h290Var;
                } else {
                    h290Var9 = h290Var8;
                }
                if (ys2VarB2 != null) {
                    i3 = ys2VarB2.f;
                } else {
                    i3 = 0;
                }
                return new v2h0(str3, o7h0VarH2, str13, str5, str6, l, ijg1Var, h290Var9, i3, e0h0Var3.h);
            }
            if (hr2Var != null) {
                ys2VarB = lt2.b(hr2Var.b);
            } else {
                ys2VarB = null;
            }
            if (hr2Var != null) {
                h290Var2 = null;
                o7h0VarH = h(this, hr2Var, null, hx2Var.c, 1);
            } else {
                h290Var2 = null;
                o7h0VarH = null;
            }
            if (o7h0VarH != null) {
                return new c2h0(e0h0Var3.h, new IllegalStateException("Received empty response from agent gateway"));
            }
            if (ys2VarB != null) {
                h290Var3 = ys2VarB.a;
            } else {
                h290Var3 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var4 = ys2VarB.b;
            } else {
                h290Var4 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var5 = ys2VarB.c;
            } else {
                h290Var5 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var6 = ys2VarB.d;
            } else {
                h290Var6 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var7 = ys2VarB.e;
            } else {
                h290Var7 = h290Var2;
            }
            if (h290Var7 == null) {
                h290Var7 = h290Var;
            }
            if (ys2VarB != null) {
                i2 = ys2VarB.f;
            } else {
                i2 = 0;
            }
            return new d2h0(o7h0VarH, h290Var3, h290Var4, h290Var5, h290Var6, h290Var7, i2, e0h0Var3.h);
            hx2Var = (hx2) objE;
            str = hx2Var.a;
            hr2Var = hx2Var.b;
            if (hr2Var != null) {
                ArrayList arrayList = hr2Var.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str14 = ((ds2) it.next()).b;
                    if (str14 != null) {
                        arrayList2.add(str14);
                    }
                }
                String strY0 = o7h.y0(arrayList2, "\n", (String) null, (String) null, (iu30) null, 62);
                if (!ihc1.y0(strY0)) {
                    a2n a2nVar = this.g;
                    String str15 = hr2Var.c;
                    ht2Var2.a = e0h0Var3;
                    ht2Var2.b = hx2Var;
                    ht2Var2.c = str;
                    ht2Var2.d = hr2Var;
                    ht2Var2.e = hr2Var;
                    ht2Var2.h = i;
                    if (a2nVar.I(strY0, str15, str, false, ht2Var2) != d9nVar) {
                        e0h0Var2 = e0h0Var3;
                        str2 = str;
                        hx2Var2 = hx2Var;
                        hr2Var3 = hr2Var;
                        hr2Var2 = hr2Var3;
                        hr2Var = hr2Var3;
                        hx2Var = hx2Var2;
                        e0h0Var3 = e0h0Var2;
                        str = str2;
                    }
                    return d9nVar;
                }
                hr2Var2 = hr2Var;
                c(hr2Var);
                hr2Var = hr2Var2;
            }
            str3 = str;
            str4 = e0h0Var3.c;
            h290Var = z6x.a;
            if (str4 == null) {
                if (hr2Var != null) {
                    ys2VarB2 = lt2.b(hr2Var.b);
                } else {
                    ys2VarB2 = null;
                }
                if (hr2Var != null) {
                    o7h0VarH2 = h(this, hr2Var, null, hx2Var.c, 1);
                } else {
                    o7h0VarH2 = null;
                }
                String str16 = hx2Var.d;
                if (ys2VarB2 != null) {
                    str5 = ys2VarB2.a;
                } else {
                    str5 = null;
                }
                if (ys2VarB2 != null) {
                    str6 = ys2VarB2.b;
                } else {
                    str6 = null;
                }
                if (ys2VarB2 != null) {
                    l = ys2VarB2.c;
                } else {
                    l = null;
                }
                if (ys2VarB2 != null) {
                    ijg1Var = ys2VarB2.d;
                } else {
                    ijg1Var = null;
                }
                if (ys2VarB2 != null) {
                    h290Var8 = ys2VarB2.e;
                } else {
                    h290Var8 = null;
                }
                if (h290Var8 == null) {
                    h290Var9 = h290Var;
                } else {
                    h290Var9 = h290Var8;
                }
                if (ys2VarB2 != null) {
                    i3 = ys2VarB2.f;
                } else {
                    i3 = 0;
                }
                return new v2h0(str3, o7h0VarH2, str16, str5, str6, l, ijg1Var, h290Var9, i3, e0h0Var3.h);
            }
            if (hr2Var != null) {
                ys2VarB = lt2.b(hr2Var.b);
            } else {
                ys2VarB = null;
            }
            if (hr2Var != null) {
                h290Var2 = null;
                o7h0VarH = h(this, hr2Var, null, hx2Var.c, 1);
            } else {
                h290Var2 = null;
                o7h0VarH = null;
            }
            if (o7h0VarH != null) {
                return new c2h0(e0h0Var3.h, new IllegalStateException("Received empty response from agent gateway"));
            }
            if (ys2VarB != null) {
                h290Var3 = ys2VarB.a;
            } else {
                h290Var3 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var4 = ys2VarB.b;
            } else {
                h290Var4 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var5 = ys2VarB.c;
            } else {
                h290Var5 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var6 = ys2VarB.d;
            } else {
                h290Var6 = h290Var2;
            }
            if (ys2VarB != null) {
                h290Var7 = ys2VarB.e;
            } else {
                h290Var7 = h290Var2;
            }
            if (h290Var7 == null) {
                h290Var7 = h290Var;
            }
            if (ys2VarB != null) {
                i2 = ys2VarB.f;
            } else {
                i2 = 0;
            }
            return new d2h0(o7h0VarH, h290Var3, h290Var4, h290Var5, h290Var6, h290Var7, i2, e0h0Var3.h);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) {
        it2 it2Var;
        if (onmVar instanceof it2) {
            it2Var = (it2) onmVar;
            int i = it2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                it2Var.c = i - Integer.MIN_VALUE;
            } else {
                it2Var = new it2(this, onmVar);
            }
        } else {
            it2Var = new it2(this, onmVar);
        }
        Object obj = it2Var.a;
        int i2 = it2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                wr2 wr2Var = this.d;
                it2Var.c = 1;
                Object objM = wr2Var.m(str, it2Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }

    public final c380 g(String str, ArrayList arrayList) {
        o7h0 o7h0VarH;
        int iNextIndex;
        z6x z6xVar;
        c380 c380Var;
        ArrayList arrayList2;
        String str2;
        smc0 smc0VarN = k4p1.n();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            c380 c380Var2 = null;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            vs2 vs2Var = (vs2) obj;
            Long l = vs2Var.c;
            String strValueOf = l != null ? l.longValue() + ":" + i : String.valueOf(i);
            tt2 tt2Var = vs2Var.a;
            if (tt2Var != null && (str2 = tt2Var.a) != null) {
                if (ihc1.y0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    smc0VarN.add(new g5h0(null, xcg1.i(str, ":user:", strValueOf), str2));
                }
            }
            hr2 hr2Var = vs2Var.b;
            if (hr2Var != null && (o7h0VarH = h(this, hr2Var, xcg1.i(str, ":agent:", strValueOf), null, 2)) != null) {
                xv2 xv2Var = o7h0VarH.a;
                String str3 = xv2Var.a;
                if (ihc1.y0(k1o1.i(xv2Var)) && k1o1.g(xv2Var).isEmpty() && k1o1.j(xv2Var).isEmpty()) {
                    z6xVar = z6x.a;
                } else {
                    z6x arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i3 = 0;
                    for (grl grlVar : xv2Var.b) {
                        if ((grlVar instanceof drl) || (grlVar instanceof crl)) {
                            c380Var = c380Var2;
                            arrayList4.add(grlVar);
                        } else if (grlVar instanceof frl) {
                            if (!arrayList4.isEmpty()) {
                                arrayList3.add(a(xv2Var, arrayList4, i3));
                                arrayList4 = new ArrayList();
                                i3++;
                            }
                            frl frlVar = (frl) grlVar;
                            c380 c380Var3 = frlVar.a;
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it = c380Var3.iterator();
                            while (it.hasNext()) {
                                c380 c380Var4 = c380Var2;
                                ux01 ux01VarS = f3o1.s((String) it.next(), frlVar.c, frlVar.b);
                                if (ux01VarS != null) {
                                    arrayList5.add(ux01VarS);
                                }
                                c380Var2 = c380Var4;
                            }
                            c380Var = c380Var2;
                            arrayList3.add(new a5h0(str3, mqo1.A(arrayList5)));
                        } else {
                            c380Var = c380Var2;
                            if (!(grlVar instanceof erl)) {
                                eg.o();
                                return c380Var;
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList2 = arrayList4;
                            } else {
                                arrayList3.add(a(xv2Var, arrayList4, i3));
                                arrayList2 = new ArrayList();
                                i3++;
                            }
                            erl erlVar = (erl) grlVar;
                            arrayList3.add(new f5h0(str3, i3, erlVar.a, erlVar.b, erlVar.c, erlVar.d, erlVar.e, erlVar.f));
                            i3++;
                            arrayList4 = arrayList2;
                        }
                        c380Var2 = c380Var;
                    }
                    c380 c380Var5 = c380Var2;
                    if (!arrayList4.isEmpty()) {
                        arrayList3.add(a(xv2Var, arrayList4, i3));
                        i3++;
                    }
                    int i4 = i3;
                    ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (((h5h0) listIterator.previous()) instanceof z4h0) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (iNextIndex >= 0) {
                        z4h0 z4h0Var = (z4h0) arrayList3.get(iNextIndex);
                        arrayList3.set(iNextIndex, z4h0.a(z4h0Var, xv2.a(z4h0Var.a, str3, null, false, xv2Var.d, 0L, 54), i4 > 1 ? k1o1.i(xv2Var) : c380Var5, 2));
                    }
                    z6xVar = arrayList3;
                }
                smc0VarN.addAll((Collection) z6xVar);
            }
            i = i2;
        }
        return mqo1.A(k4p1.k(smc0VarN));
    }
}
