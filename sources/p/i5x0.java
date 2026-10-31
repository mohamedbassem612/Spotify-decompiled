package p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i5x0 implements Function, s2i1, Function4, Predicate, m2a1, c36, BiFunction, d8k1, me {
    public final /* synthetic */ byte a;
    public static final i5x0 b = new i5x0((byte) 0);
    public static final i5x0 c = new i5x0((byte) 1);
    public static final i5x0 d = new i5x0((byte) 2);
    public static final i5x0 e = new i5x0((byte) 3);
    public static final i5x0 f = new i5x0((byte) 4);
    public static final i5x0 g = new i5x0((byte) 6);
    public static final i5x0 h = new i5x0((byte) 7);
    public static final i5x0 i = new i5x0((byte) 8);
    public static final i5x0 t = new i5x0((byte) 10);
    public static final i5x0 X = new i5x0((byte) 11);
    public static final i5x0 Y = new i5x0((byte) 12);
    public static final i5x0 Z = new i5x0((byte) 13);
    public static final i5x0 N0 = new i5x0((byte) 14);
    public static final i5x0 O0 = new i5x0((byte) 15);
    public static final i5x0 P0 = new i5x0((byte) 16);
    public static final i5x0 Q0 = new i5x0((byte) 17);
    public static final i5x0 R0 = new i5x0((byte) 18);
    public static final i5x0 S0 = new i5x0((byte) 19);
    public static final i5x0 T0 = new i5x0((byte) 20);
    public static final i5x0 U0 = new i5x0((byte) 21);
    public static final i5x0 V0 = new i5x0((byte) 22);
    public static final i5x0 W0 = new i5x0((byte) 23);
    public static final i5x0 X0 = new i5x0((byte) 24);
    public static final i5x0 Y0 = new i5x0((byte) 25);
    public static final i5x0 Z0 = new i5x0((byte) 26);

    public i5x0(oz3 oz3Var) {
        this.a = (byte) 28;
    }

    public static j4e1 h(long j, long j2, long j3, long j4, long j5, long j6, b0k b0kVar, int i2) {
        long j7 = u7h.k;
        x340 x340Var = (x340) b0kVar;
        return m((dah) x340Var.k(eah.a), (rce1) x340Var.k(sce1.a)).a(j7, j7, j7, j7, j, j2, j7, j7, (i2 & 256) != 0 ? j7 : j3, j7, (rce1) null, j4, j5, j6, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7);
    }

    public static bma1 j(t54 t54Var) {
        return bma1.b.n("audiobook_onboarding:bottom_sheet:".concat(t54Var.a).concat(":consumed"));
    }

    public static bma1 k(t54 t54Var) {
        return bma1.b.n("audiobook_onboarding:bottom_sheet:".concat(t54Var.a).concat(":count"));
    }

    public static bma1 l(t54 t54Var) {
        return bma1.b.n("audiobook_onboarding:bottom_sheet:".concat(t54Var.a).concat(":date"));
    }

    public static j4e1 m(dah dahVar, rce1 rce1Var) {
        j4e1 j4e1Var = dahVar.f0;
        if (j4e1Var == null) {
            j4e1 j4e1Var2 = new j4e1(eah.d(dahVar, 18), eah.d(dahVar, 18), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 18), eah.d(dahVar, 39), eah.d(dahVar, 39), eah.d(dahVar, 39), eah.d(dahVar, 39), eah.d(dahVar, 26), eah.d(dahVar, 2), rce1Var, eah.d(dahVar, 26), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 26), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19));
            dahVar.f0 = j4e1Var2;
            return j4e1Var2;
        }
        if (u890.j(j4e1Var.k, rce1Var)) {
            return j4e1Var;
        }
        j4e1 j4e1VarB = j4e1.b(j4e1Var, rce1Var);
        dahVar.f0 = j4e1VarB;
        return j4e1VarB;
    }

    public static if61 n() {
        return (if61) wi20.c().b(if61.class);
    }

    public static boolean o(k05 k05Var) {
        return k05Var.a();
    }

    public static String p(t54 t54Var) {
        return "audiobook_onboarding:bottom_sheet:".concat(t54Var.a);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new xl51((String) obj, (Restrictions) obj2, (xp91) obj3, (fvf1) obj4);
    }

    public Object apply(Object obj) {
        Single singleJust;
        switch (this.a) {
            case 0:
                return Observable.empty();
            case 1:
                return kpy0.a;
            case 2:
                return ((bf90) obj).a ? zaz0.a : zaz0.b;
            case 3:
                return (n701) u890.k((k1r) obj, (d0r) null, (n4r) null);
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            default:
                return (String) ((PlayerState) obj).playbackId().e("");
            case 6:
                byte[] bArr = (byte[]) obj;
                try {
                    return ResumptionProgressEsperanto.GetResumePointResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetResumePointResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                return (eww0) ((spq0) obj).b();
            case 11:
                return ((ro81) obj).c;
            case 12:
                g281 g281Var = (g281) obj;
                return new g5v0(g281Var.d, g281Var.h);
            case 13:
                jdu0 jdu0Var = (jdu0) obj;
                if (jdu0Var.c.length() <= 0) {
                    return Observable.empty();
                }
                return Observable.just(new on91(jdu0Var.h, jdu0Var.i, jdu0Var.d, jdu0Var.c, jdu0Var.k));
            case 18:
                ly21 ly21Var = (py21) obj;
                if (!(ly21Var instanceof ly21)) {
                    if (ly21Var instanceof oy21) {
                        return Single.just(spq0.d(((List) ((oy21) ly21Var).a).get(0)));
                    }
                    eg.o();
                    return null;
                }
                jy21 jy21Var = ly21Var.a;
                if ((jy21Var instanceof gy21) || (jy21Var instanceof cy21)) {
                    singleJust = Single.just(j5.a);
                } else {
                    singleJust = Single.error(new Throwable("Unable to get playlist: " + jy21Var));
                }
                Single single = singleJust;
                single.getClass();
                return single;
            case 20:
                return new l7z0(b7x.a);
            case 21:
                return odj1.a;
        }
    }

    public String b() {
        return "ig_refresh_token";
    }

    public Function0 c(o6 o6Var) {
        y22 y22Var = new y22(o6Var, (byte) 24);
        o6Var.addOnAttachStateChangeListener(y22Var);
        c8k1 c8k1Var = new c8k1(o6Var);
        p9p1.r(o6Var, c8k1Var);
        return new uc9(o6Var, y22Var, c8k1Var, (byte) 11);
    }

    public String d() {
        return "refresh_access_token";
    }

    public void e(wat watVar, int i2, int[] iArr, flb0 flb0Var, int[] iArr2) {
        tr80 tr80VarL0 = f46.l0(iArr);
        ArrayList arrayList = new ArrayList();
        lr80 it = tr80VarL0.iterator();
        while (((sr80) it).c) {
            Object next = it.next();
            if (iArr[((Number) next).intValue()] > 0) {
                arrayList.add(next);
            }
        }
        kuw0 kuw0Var = arrayList.size() == 1 ? h36.b : h36.g;
        int[] iArr3 = new int[arrayList.size()];
        int size = arrayList.size();
        int[] iArr4 = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iArr4[i4] = iArr[((Number) arrayList.get(i4)).intValue()];
        }
        kuw0Var.e(watVar, i2, iArr4, flb0Var, iArr3);
        f46.f0(0, 0, 6, iArr2);
        for (Object obj : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            iArr2[((Number) obj).intValue()] = iArr3[i3];
            i3 = i5;
        }
    }

    public void f(boolean z, boolean z2, idn0 idn0Var, j4e1 j4e1Var, hw61 hw61Var, b0k b0kVar, int i2) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-818661242);
        int i3 = i2 | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(idn0Var) ? 256 : 128) | (x340Var.g(j4e1Var) ? 16384 : 8192) | (x340Var.g(hw61Var) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            boolean zBooleanValue = ((Boolean) e6p1.g(idn0Var, x340Var, (i3 >> 6) & 14).getValue()).booleanValue();
            if (!z) {
                j = j4e1Var.g;
            } else if (z2) {
                j = j4e1Var.h;
            } else {
                j = zBooleanValue ? j4e1Var.e : j4e1Var.f;
            }
            t1c.a(exd0.r(nim0.a, new gub0(hw61Var, new ml70(new c5e1(w191.a(j, t890.w(x340Var, 5), (String) null, x340Var, 0, 12), tob1.class, "value", "getValue()Ljava/lang/Object;", 0), (byte) 1), (byte) 24)).then(new ha80(z, z2, idn0Var, j4e1Var, hw61Var)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5e1(this, z, z2, idn0Var, j4e1Var, hw61Var, i2);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public void g(java.lang.String r38, p.vu30 r39, boolean r40, boolean r41, p.elk1 r42, p.idn0 r43, p.vu30 r44, p.vu30 r45, p.vu30 r46, p.hw61 r47, p.j4e1 r48, p.vzq0 r49, p.vu30 r50, p.b0k r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i5x0.g(java.lang.String, p.vu30, boolean, boolean, p.elk1, p.idn0, p.vu30, p.vu30, p.vu30, p.hw61, p.j4e1, p.vzq0, p.vu30, p.b0k, int, int, int):void");
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new zd11(xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((cma1) obj).b == 1;
            default:
                return !((YourLibraryResponse) obj).q().r();
        }
    }

    public /* synthetic */ i5x0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                return (o7c1) obj2;
            default:
                return new mmr0((n131) obj, (uv00) obj2);
        }
    }
}
