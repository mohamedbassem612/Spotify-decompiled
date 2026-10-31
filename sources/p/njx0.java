package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class njx0 implements Function, Predicate, BiFunction, r0c, Function3, com.spotify.mobius.functions.Function, s2i1, tnd1 {
    public final /* synthetic */ byte a;
    public static final njx0 b = new njx0((byte) 0);
    public static final njx0 c = new njx0((byte) 1);
    public static final njx0 d = new njx0((byte) 2);
    public static final njx0 e = new njx0((byte) 3);
    public static final njx0 f = new njx0((byte) 4);
    public static final njx0 g = new njx0((byte) 5);
    public static final njx0 h = new njx0((byte) 6);
    public static final njx0 i = new njx0((byte) 7);
    public static final njx0 t = new njx0((byte) 8);
    public static final njx0 X = new njx0((byte) 9);
    public static final njx0 Y = new njx0((byte) 10);
    public static final njx0 Z = new njx0((byte) 11);
    public static final njx0 N0 = new njx0((byte) 12);
    public static final njx0 O0 = new njx0((byte) 13);
    public static final njx0 P0 = new njx0((byte) 14);
    public static final njx0 Q0 = new njx0((byte) 15);
    public static final njx0 R0 = new njx0((byte) 16);
    public static final njx0 S0 = new njx0((byte) 17);
    public static final njx0 T0 = new njx0((byte) 18);
    public static final njx0 U0 = new njx0((byte) 19);
    public static final njx0 V0 = new njx0((byte) 20);
    public static final njx0 W0 = new njx0((byte) 21);
    public static final njx0 X0 = new njx0((byte) 22);
    public static final njx0 Y0 = new njx0((byte) 23);
    public static final njx0 Z0 = new njx0((byte) 25);
    public static final njx0 a1 = new njx0((byte) 26);

    public njx0(yh2 yh2Var) {
        this.a = (byte) 27;
    }

    public static boolean c(int i2, Object obj, a9a a9aVar) {
        din1 din1Var = (din1) a9aVar.e;
        int i3 = a9aVar.b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            a9aVar.H(0);
            ((bkn1) obj).d(i4 << 3, Long.valueOf(din1Var.i()));
            return true;
        }
        if (i5 == 1) {
            a9aVar.H(1);
            ((bkn1) obj).d((i4 << 3) | 1, Long.valueOf(din1Var.k()));
            return true;
        }
        if (i5 == 2) {
            ((bkn1) obj).d((i4 << 3) | 2, a9aVar.O());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                x4n1.g("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i5 != 5) {
                x4n1.a();
                return false;
            }
            a9aVar.H(5);
            ((bkn1) obj).d(5 | (i4 << 3), Integer.valueOf(din1Var.l()));
            return true;
        }
        bkn1 bkn1VarA = bkn1.a();
        int i6 = i4 << 3;
        int i7 = i2 + 1;
        if (i7 >= 100) {
            x4n1.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (a9aVar.N() != Integer.MAX_VALUE && c(i7, bkn1VarA, a9aVar)) {
        }
        if ((i6 | 4) != a9aVar.b) {
            x4n1.g("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (bkn1VarA.e) {
            bkn1VarA.e = false;
        }
        ((bkn1) obj).d(i6 | 3, bkn1VarA);
        return true;
    }

    public static final bkn1 e(Object obj) {
        rin1 rin1Var = (rin1) obj;
        bkn1 bkn1Var = rin1Var.zzc;
        if (bkn1Var != bkn1.f) {
            return bkn1Var;
        }
        bkn1 bkn1VarA = bkn1.a();
        rin1Var.zzc = bkn1VarA;
        return bkn1VarA;
    }

    public long a(int i2, a9a a9aVar) {
        return ((y9e1) a9aVar.e).l(i2);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    wu21 wu21Var = (wu21) entry.getValue();
                    if (wu21Var instanceof vu21) {
                        up70 up70VarA = ((vu21) wu21Var).a.a(vp70.c);
                        String str = up70VarA != null ? up70VarA.a.a : null;
                        linkedHashMap.put(key, str);
                    } else if (!(wu21Var instanceof tu21) && !(wu21Var instanceof uu21)) {
                        eg.o();
                        return null;
                    }
                    linkedHashMap.put(key, str);
                }
                return new e7z0(linkedHashMap);
            case 2:
                return new y101((String) obj);
            case 3:
                return ((List) obj).isEmpty() ? Observable.timer(500L, TimeUnit.MILLISECONDS) : Observable.empty();
            case 4:
            case 7:
            case 8:
            case 10:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            default:
                return Boolean.valueOf(yto.k((String) ((Map) obj).get("filter-age-restricted-content"), false));
            case 5:
                return Observable.just(new qyd0((Throwable) obj));
            case 6:
                return new v231(obj);
            case 9:
                Object obj2 = ((cma1) obj).a;
                if (obj2 != null) {
                    return (Long) obj2;
                }
                hhg1.n("Required value was null.");
                return null;
            case 11:
                return new so81((c6s0) obj);
            case 12:
                return ((ul91) obj).a;
            case 13:
                return new g8o0((Throwable) obj, (bk8) null);
            case 14:
                return crn0.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                mmr0 mmr0Var = (mmr0) obj;
                return new dkf1((PlayerState) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue(), true);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                y1k1 y1k1Var = (y1k1) ((Optional) obj).orElse(null);
                return Optional.ofNullable(y1k1Var != null ? l4p1.x(y1k1Var) : null);
            case 22:
                return Single.just(new q1l1((wze1) obj));
            case 23:
                return ((th61) obj).a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (p.hap1.i(500, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Enum b(p.r9y0 r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.mjx0
            if (r0 == 0) goto L13
            r0 = r10
            p.mjx0 r0 = (p.mjx0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.mjx0 r0 = new p.mjx0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r8 = r0.b
            int r10 = r0.d
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r10 == 0) goto L40
            if (r10 == r4) goto L3a
            if (r10 == r3) goto L34
            if (r10 != r2) goto L2e
            p.hm5.M(r8)
            goto L79
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r1
        L34:
            p.iu30 r9 = r0.a
            p.hm5.M(r8)
            goto L67
        L3a:
            p.iu30 r9 = r0.a
            p.hm5.M(r8)
            goto L55
        L40:
            p.hm5.M(r8)
            p.ljx0 r8 = p.ljx0.b
            r9.invoke(r8)
            r0.a = r9
            r0.d = r4
            r6 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = p.hap1.i(r6, r0)
            if (r8 != r5) goto L55
            goto L78
        L55:
            p.ljx0 r8 = p.ljx0.c
            r9.invoke(r8)
            r0.a = r9
            r0.d = r3
            r3 = 250(0xfa, double:1.235E-321)
            java.lang.Object r8 = p.hap1.i(r3, r0)
            if (r8 != r5) goto L67
            goto L78
        L67:
            p.ljx0 r8 = p.ljx0.d
            r9.invoke(r8)
            r0.a = r1
            r0.d = r2
            r8 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r8 = p.hap1.i(r8, r0)
            if (r8 != r5) goto L79
        L78:
            return r5
        L79:
            p.ljx0 r8 = p.ljx0.e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.njx0.b(p.r9y0, p.onm):java.lang.Enum");
    }

    public iu30 d() {
        return cv6.Z0;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new r1d1(str2, str, xkg0Var);
    }

    public w7h1 k(cnd1 cnd1Var, n8h1 n8h1Var) {
        r6h1 r6h1VarB = n8h1Var.b();
        Integer numValueOf = Integer.valueOf(cnd1Var.b);
        String str = cnd1Var.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-tab";
        x6h1VarI.f = "2.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1VarB, System.currentTimeMillis());
    }

    public boolean l() {
        return true;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new nf81((spq0) obj, (spq0) obj2, (spq0) obj3);
    }

    public boolean test(Object obj) {
        boolean zIsEmpty;
        switch (this.a) {
            case 4:
                zIsEmpty = ((List) obj).isEmpty();
                break;
            default:
                zIsEmpty = ((uv00) obj).f;
                break;
        }
        return !zIsEmpty;
    }

    public /* synthetic */ njx0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                return new mmr0((l62) obj, (Long) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new mmr0((Boolean) obj, (Boolean) obj2);
            default:
                return Boolean.valueOf(!((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
        }
    }
}
