package p;

import com.spotify.kidsdatamigration.v1.MigrationStatusPubsub;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r5x0 implements Function, Function3, Init, BiFunction, Function4, pi61, m2a1, Predicate, g4u, br20 {
    public final /* synthetic */ byte a;
    public static final r5x0 b = new r5x0((byte) 0);
    public static final r5x0 c = new r5x0((byte) 1);
    public static final r5x0 d = new r5x0((byte) 2);
    public static final r5x0 e = new r5x0((byte) 3);
    public static final r5x0 f = new r5x0((byte) 4);
    public static final r5x0 g = new r5x0((byte) 5);
    public static final r5x0 h = new r5x0((byte) 6);
    public static final r5x0 i = new r5x0((byte) 7);
    public static final r5x0 t = new r5x0((byte) 8);
    public static final r5x0 X = new r5x0((byte) 9);
    public static final r5x0 Y = new r5x0((byte) 10);
    public static final r5x0 Z = new r5x0((byte) 11);
    public static final r5x0 N0 = new r5x0((byte) 12);
    public static final r5x0 O0 = new r5x0((byte) 13);
    public static final r5x0 P0 = new r5x0((byte) 14);
    public static final r5x0 Q0 = new r5x0((byte) 15);
    public static final r5x0 R0 = new r5x0((byte) 16);
    public static final t8e1 S0 = new t8e1((byte) 0);
    public static final t8e1 T0 = new t8e1((byte) 1);
    public static final r5x0 U0 = new r5x0((byte) 18);
    public static final r5x0 V0 = new r5x0((byte) 19);
    public static final r5x0 W0 = new r5x0((byte) 20);
    public static final r5x0 X0 = new r5x0((byte) 21);
    public static final r5x0 Y0 = new r5x0((byte) 22);
    public static final r5x0 Z0 = new r5x0((byte) 23);
    public static final r5x0 a1 = new r5x0((byte) 24);
    public static final r5x0 b1 = new r5x0((byte) 25);
    public static final r5x0 c1 = new r5x0((byte) 26);

    public r5x0(vw vwVar) {
        this.a = (byte) 27;
    }

    public static final String c() {
        w6b1 w6b1VarA = f7b1.a(blc0.lh);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final String e() {
        w6b1 w6b1VarA = f7b1.a(blc0.ta);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final String f() {
        w6b1 w6b1VarA = f7b1.a(blc0.ua);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final String g() {
        w6b1 w6b1VarA = f7b1.a(blc0.va);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final String h() {
        w6b1 w6b1VarA = f7b1.a(blc0.ya);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final String i() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.y1().c;
    }

    public static final String j() {
        w6b1 w6b1VarA = f7b1.a(blc0.Aa);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final String k() {
        w6b1 w6b1VarA = f7b1.a(blc0.Ea);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new mm51((String) obj, (Restrictions) obj2, (xp91) obj3, (fvf1) obj4);
    }

    public float a(float f2, long j) {
        return 0.0f;
    }

    public Object apply(Object obj) {
        hyo1 wwVar;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return new e6x0((Throwable) obj);
            case 1:
                return sqy0.a;
            case 2:
            case 3:
            case 5:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 21:
            default:
                MigrationStatusPubsub migrationStatusPubsub = (MigrationStatusPubsub) obj;
                String migrationId = migrationStatusPubsub.getMigrationId();
                int i2 = uw.a[migrationStatusPubsub.n().ordinal()];
                if (i2 == 1) {
                    wwVar = yw.c;
                } else if (i2 == 2) {
                    wwVar = new ww(migrationStatusPubsub.getChildId());
                } else {
                    if (i2 != 3) {
                        hhg1.n("Failed to parse kids-data-migration");
                        return null;
                    }
                    wwVar = xw.c;
                }
                return new tw(migrationId, wwVar);
            case 4:
                return new b33(((da61) obj).c);
            case 6:
                byte[] bArr = (byte[]) obj;
                try {
                    return ResumptionProgressEsperanto.GetDetailsResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetDetailsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                return new gb41(false);
            case 10:
                return u890.j(((c481) obj).a.B.get(Context$Metadata.KEY_AUTOPLAY_CANDIDATE), "false") ? Collections.singletonMap(Context$Metadata.KEY_AUTOPLAY_CANDIDATE, "false") : b7xVar;
            case 11:
                return ((so81) obj).c;
            case 15:
                ArrayList<mmr0> arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof mmr0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (mmr0 mmr0Var : arrayList) {
                    String str = (String) mmr0Var.a;
                    fqa1 fqa1Var = (gqa1) mmr0Var.b;
                    fqa1 fqa1Var2 = fqa1Var instanceof fqa1 ? fqa1Var : null;
                    mmr0 mmr0Var2 = fqa1Var2 != null ? new mmr0(str, fqa1Var2) : null;
                    if (mmr0Var2 != null) {
                        arrayList2.add(mmr0Var2);
                    }
                }
                return sqg0.T(arrayList2);
            case 16:
                return new yac1((eb71) obj);
            case 19:
                return l5g1.a;
            case 20:
                return new l8z0(b7xVar);
            case 22:
                mmr0 mmr0Var3 = (mmr0) obj;
                int iIntValue = ((Number) mmr0Var3.a).intValue();
                int iIntValue2 = ((Number) mmr0Var3.b).intValue();
                return Float.valueOf(iIntValue2 == 0 ? 0.0f : iIntValue / iIntValue2);
            case 23:
                return new e331(new m231((Throwable) obj));
            case 24:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    public float b(float f2, float f3, long j) {
        return 0.0f;
    }

    public float d() {
        return 0.0f;
    }

    public First e0(Object obj) {
        gl01 gl01Var = (hl01) obj;
        if (gl01Var instanceof gl01) {
            return First.c(gl01Var, Collections.singleton(new gk01(gl01Var.a, 0L)));
        }
        if ((gl01Var instanceof fl01) || (gl01Var instanceof el01)) {
            return First.b(gl01Var);
        }
        eg.o();
        return null;
    }

    public long m(float f2) {
        return 0L;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new mmr0((Map) obj, (Boolean) obj3);
    }

    public float p(float f2, float f3) {
        return 0.0f;
    }

    public boolean test(Object obj, Object obj2) {
        return !((ouj1) obj).a.equals(((ouj1) obj2).a);
    }

    public /* synthetic */ r5x0(byte b2) {
        this.a = b2;
    }

    public boolean test(Object obj) {
        return !((uv00) obj).f;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    public Object apply(Object obj, Object obj2) {
        boolean z;
        int i2;
        pn91 pn91VarA;
        switch (this.a) {
            case 5:
                q0u q0uVar = (q0u) obj;
                if (y7y0.t("is-mobile-only-tier", (Map) obj2)) {
                    return new c221(false, false);
                }
                boolean z2 = q0uVar instanceof p0u;
                if (z2) {
                    ArrayList arrayList = ((p0u) q0uVar).a;
                    if (arrayList.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it = arrayList.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if (((m0u) it.next()).b && (i2 = i2 + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    if (i2 > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return new c221(z, z2 && mym.j(((p0u) q0uVar).a));
            case 12:
                return new o491((PlayerState) obj, (fvf1) obj2);
            default:
                pn91 pn91Var = (pn91) obj;
                on91 on91Var = (on91) obj2;
                kkt0 kkt0VarA = pn91Var.b;
                on91 on91Var2 = pn91Var.a;
                if (on91Var2 != null && u890.j(on91Var2.a, on91Var.a)) {
                    if (kkt0VarA == null) {
                        kkt0VarA = null;
                    } else if (!on91Var2.d) {
                        kkt0VarA = kkt0.a(kkt0VarA, kkt0VarA.d + (on91Var.c - on91Var2.c));
                    }
                    pn91VarA = pn91.a(pn91Var, (on91) null, kkt0VarA, (List) null, 5);
                } else {
                    String str = on91Var.a;
                    String str2 = on91Var.b;
                    long j = on91Var.c;
                    kkt0 kkt0Var = new kkt0(j, 0L, on91Var.e, str, str2);
                    if (kkt0VarA == null) {
                        kkt0VarA = null;
                    } else if (on91Var2 != null && !on91Var2.d) {
                        kkt0VarA = kkt0.a(kkt0VarA, kkt0VarA.d + (j - on91Var2.c));
                    }
                    pn91VarA = pn91.a(pn91Var, (on91) null, kkt0Var, o7h.d1(o7h.N0(pn91Var.c, p7h.N(kkt0VarA)), 19), 1);
                }
                return pn91.a(pn91VarA, on91Var, (kkt0) null, (List) null, 6);
        }
    }
}
