package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class h2x0 implements Function, av30, BiPredicate, Init, au11, Predicate, s2i1, rb, c290 {
    public final /* synthetic */ byte a;
    public static final h2x0 b = new h2x0(0);
    public static final h2x0 c = new h2x0(1);
    public static final h2x0 d = new h2x0(2);
    public static final h2x0 e = new h2x0(3);
    public static final h2x0 f = new h2x0(4);
    public static final h2x0 g = new h2x0(5);
    public static final h2x0 h = new h2x0(6);
    public static final h2x0 i = new h2x0(7);
    public static final h2x0 t = new h2x0(8);
    public static final h2x0 X = new h2x0(9);
    public static final h2x0 Y = new h2x0(10);
    public static final h2x0 Z = new h2x0(12);
    public static final h2x0 N0 = new h2x0(13);
    public static final h2x0 O0 = new h2x0(14);
    public static final h2x0 P0 = new h2x0(15);
    public static final h2x0 Q0 = new h2x0(16);
    public static final h2x0 R0 = new h2x0(17);
    public static final h2x0 S0 = new h2x0(18);
    public static final h2x0 T0 = new h2x0(19);
    public static final h2x0 U0 = new h2x0(20);
    public static final h2x0 V0 = new h2x0(21);
    public static final h2x0 W0 = new h2x0(22);
    public static final h2x0 X0 = new h2x0(23);
    public static final h2x0 Y0 = new h2x0(24);
    public static final h2x0 Z0 = new h2x0(25);
    public static final h2x0 a1 = new h2x0(26);
    public static final h2x0 b1 = new h2x0(27);

    public /* synthetic */ h2x0(byte b2) {
        this.a = b2;
    }

    public static vrv0 b(zm81 zm81Var, tm81 tm81Var) {
        if (tm81Var != null) {
            return new vrv0(zm81Var, tm81Var);
        }
        return null;
    }

    public static final Object e(long j, iu30 iu30Var, a8d1 a8d1Var) {
        return rc2.M(j, new w73(iu30Var, (lnm) null, (byte) 26), a8d1Var);
    }

    public xpv0 a() {
        return new xpv0((byte) 19);
    }

    public boolean accept(Object obj) {
        Set set = s4b1.f;
        return uic.x(((iw81) obj).b).c == blc0.g1;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((Uri) obj).toString();
            case 1:
                dwx0 dwx0Var = (dwx0) obj;
                return new mmr0(dwx0Var.a, Boolean.valueOf(dwx0Var.g));
            case 2:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    vu21 vu21Var = (wu21) entry.getValue();
                    if (vu21Var instanceof vu21) {
                        up70 up70VarA = vu21Var.a.a(vp70.c);
                        String str = up70VarA != null ? up70VarA.a.a : null;
                        linkedHashMap.put(key, str);
                    } else if (!(vu21Var instanceof tu21) && !(vu21Var instanceof uu21)) {
                        eg.o();
                        return null;
                    }
                    linkedHashMap.put(key, str);
                }
                return new x8z0(linkedHashMap);
            case 3:
                ccg1 ccg1Var = (ccg1) obj;
                return new mmr0(Boolean.valueOf(ccg1Var.o), ccg1Var.c);
            case 4:
                return z6x.a;
            case 5:
                f5e0 f5e0Var = (o5e0) obj;
                if (f5e0Var instanceof f5e0) {
                    rwd0 rwd0Var = (swd0) f5e0Var.a;
                    if (rwd0Var instanceof rwd0) {
                        return new byd0(rwd0Var);
                    }
                }
                return ayd0.a;
            case 6:
            case 11:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            default:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch Your Episodes", new Object[0]);
                return b7x.a;
            case 7:
                return new z310((List) obj, (f410) null, (m510) null, (String) null);
            case 8:
                return new t051((m131) obj);
            case 9:
                return Observable.empty();
            case 10:
                Object obj2 = ((cma1) obj).a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                hhg1.n("Required value was null.");
                return null;
            case 12:
                Logger.k("Age verification failed with exception, failing open", new Object[]{(Throwable) obj});
                return new lp81(en2.a);
            case 16:
                if (!(((feh) obj) instanceof ceh)) {
                    n57.s("Puffin: Failed to pause music during onboarding");
                }
                return CompletableEmpty.a;
            case 17:
                return Boolean.valueOf(((th61) obj).b);
            case 18:
                return (Single) obj;
            case 22:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 23:
                beh behVar = (feh) obj;
                return behVar instanceof ceh ? MaybeEmpty.a : Maybe.e(new b2l1(l1d.m("Player command failed: ", behVar.a)));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:42|24|(1:45)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r14 = r2;
        r2 = r13;
        r13 = r10;
        r9 = r8;
        r8 = r12;
        r1 = r11;
        r11 = r0;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, short] */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bd -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(int r18, long r19, long r21, double r23, p.iu30 r25, p.onm r26) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h2x0.c(int, long, long, double, p.iu30, p.onm):java.lang.Object");
    }

    public Object convert(int i2) {
        dm7 dm7Var;
        if (i2 == 0) {
            dm7Var = dm7.KIND_UNSPECIFIED;
        } else if (i2 == 28) {
            dm7Var = dm7.KIND_SAVE_SOURCE;
        } else if (i2 == 3) {
            dm7Var = dm7.KIND_NAME;
        } else if (i2 == 4) {
            dm7Var = dm7.KIND_DESCRIPTION;
        } else if (i2 != 20) {
            dm7Var = i2 != 21 ? null : dm7.KIND_PICTURE_SIZES;
        } else {
            dm7Var = dm7.KIND_PICTURE_FILE_ID;
        }
        return dm7Var == null ? dm7.UNRECOGNIZED : dm7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(2:12|13)(2:14|15))(4:16|40|17|18)|28|(3:30|(1:32)|33)(1:37))(1:21)|38|22|(1:36)(1:25)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r14 = r12;
        r12 = r1;
        r1 = r14;
        r14 = r10;
        r10 = r8;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (p.hap1.i(r6, r1) != r5) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [int, short] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(p.iu30 r17, long r18, long r20, double r22, p.iu30 r24, p.onm r25) throws java.lang.Exception {
        /*
            r16 = this;
            r0 = r25
            boolean r1 = r0 instanceof p.rho1
            if (r1 == 0) goto L15
            r1 = r0
            p.rho1 r1 = (p.rho1) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1c
        L15:
            p.rho1 r1 = new p.rho1
            r2 = r16
            r1.<init>(r2, r0)
        L1c:
            java.lang.Object r0 = r1.f
            int r2 = r1.h
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r2 == 0) goto L57
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3f
            long r6 = r1.d
            double r8 = r1.e
            short r2 = r1.c
            long r10 = (long) r2
            p.iu30 r2 = r1.b
            p.iu30 r12 = r1.a
            p.hm5.M(r0)
        L38:
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r8
            r8 = r14
            goto L65
        L3f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L46:
            long r6 = r1.d
            double r8 = r1.e
            short r2 = r1.c
            long r10 = (long) r2
            p.iu30 r2 = r1.b
            p.iu30 r12 = r1.a
            p.hm5.M(r0)     // Catch: java.lang.Exception -> L55
            return r0
        L55:
            r0 = move-exception
            goto L81
        L57:
            p.hm5.M(r0)
            r6 = r18
            r8 = r20
            r10 = r22
            r2 = r24
            r12 = r1
            r1 = r17
        L65:
            r12.a = r1     // Catch: java.lang.Exception -> L7a
            r12.b = r2     // Catch: java.lang.Exception -> L7a
            int r0 = (int) r8     // Catch: java.lang.Exception -> L7a
            r12.c = r0     // Catch: java.lang.Exception -> L7a
            r12.e = r10     // Catch: java.lang.Exception -> L7a
            r12.d = r6     // Catch: java.lang.Exception -> L7a
            r12.h = r4     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r2.invoke(r12)     // Catch: java.lang.Exception -> L7a
            if (r0 != r5) goto L79
            goto La9
        L79:
            return r0
        L7a:
            r0 = move-exception
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r8
            r8 = r14
        L81:
            java.lang.Object r13 = r12.invoke(r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Laa
            double r6 = (double) r6
            double r6 = r6 * r8
            long r6 = (long) r6
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L95
            r6 = r10
        L95:
            r1.a = r12
            r1.b = r2
            int r0 = (int) r10
            r1.c = r0
            r1.e = r8
            r1.d = r6
            r1.h = r3
            java.lang.Object r0 = p.hap1.i(r6, r1)
            if (r0 == r5) goto La9
            goto L38
        La9:
            return r5
        Laa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h2x0.d(p.iu30, long, long, double, p.iu30, p.onm):java.lang.Object");
    }

    public First e0(Object obj) {
        tw91 tw91Var = (tw91) obj;
        tw91Var.getClass();
        return First.b(tw91Var);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new wni1(xkg0Var, str2, str);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return eu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        Collection collectionValues = ((Map) obj).values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return true;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((wu21) it.next()) instanceof uu21) {
                return false;
            }
        }
        return true;
    }

    public boolean test(Object obj, Object obj2) {
        sp91 sp91Var = (sp91) obj;
        sp91 sp91Var2 = (sp91) obj2;
        return sp91Var.a == sp91Var2.a && u890.j(sp91Var.i, sp91Var2.i) && sp91Var.j == sp91Var2.j;
    }
}
