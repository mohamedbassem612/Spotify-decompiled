package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.playerimpl.tracking.PendingStorageException;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class noa extends roa implements n590 {
    public doa A1;
    public koe1 B1;
    public final PublishSubject C1;
    public final swz0 D1;
    public final llm E1;
    public final xe01 F1;
    public final Disposable G1;
    public long H1;
    public boolean I1;
    public final t2j0 p1;
    public final Scheduler q1;
    public final kba r1;
    public final np00 s1;
    public final String t1;
    public float u1;
    public String v1;
    public final long w1;
    public Long x1;
    public int y1;
    public jgc1 z1;

    public noa(m0u0 m0u0Var, zwz0 zwz0Var, String str, t2j0 t2j0Var, oot0 oot0Var, Scheduler scheduler, kba kbaVar, np00 np00Var, q8n q8nVar) {
        super(m0u0Var, oot0Var);
        this.p1 = t2j0Var;
        this.q1 = scheduler;
        this.r1 = kbaVar;
        this.s1 = np00Var;
        String strC = zod.C(m0u0Var);
        this.t1 = strC != null ? strC : str;
        this.v1 = "unknown";
        this.w1 = oot0Var.a;
        this.y1 = 1;
        this.z1 = jgc1.UNKNOWN;
        PublishSubject publishSubject = new PublishSubject();
        this.C1 = publishSubject;
        swz0 swz0Var = new swz0(new eho0(false, false));
        this.D1 = swz0Var;
        llm llmVarE = smo1.e(q8nVar);
        this.E1 = llmVarE;
        this.F1 = d5p1.t(new lt20(zwz0Var.d(), new qt(this, (lnm) null, (byte) 26), (byte) 0), llmVarE, ey71.a, swz0Var);
        this.G1 = publishSubject.concatMapCompletable(new t4d1(this, (byte) 28)).subscribe();
    }

    public static void V(String str, String str2, m0u0 m0u0Var, ioa ioaVar) {
        String str3 = (String) m0u0Var.b().get(str);
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            ioaVar.q(str2, str3);
        }
    }

    public static /* synthetic */ void X(noa noaVar, int i, Long l, int i2) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        noaVar.W(i, l, 0);
    }

    @Override // p.roa
    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        super.B(z, z2, f, videoSurfaceView, j);
        this.v1 = zod.A((uwz0) this.F1.a.getValue());
    }

    public final void J(long j, long j2) {
        this.a1 = true;
        X(this, 3, null, 6);
    }

    @Override // p.roa
    public final void M(long j, long j2, koj1 koj1Var) {
        a(j, j, koj1Var);
        int i = koj1Var.d;
        if (i > 0) {
            this.u1 = koj1Var.c / i;
        }
    }

    @Override // p.roa
    public final void O(long j, long j2) {
        super.O(j, j2);
        X(this, 2, Long.valueOf(j), 4);
    }

    @Override // p.roa
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        W(5, Long.valueOf(j), i);
    }

    public final void U(Throwable th) {
        PendingStorageException pendingStorageException = new PendingStorageException(th);
        this.p1.a(x9p1.i(this.a, this.t1, pendingStorageException.hashCode(), pendingStorageException));
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0225  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    public final void W(int i, Long l, int i2) {
        long j;
        ArrayList arrayList;
        Object next;
        Object next2;
        int i3;
        int i4;
        int i5;
        String str;
        String str2;
        String str3;
        Boolean boolD1;
        int i6;
        long jLongValue;
        int i7;
        int i8;
        long j2;
        t2k1 t2k1Var;
        int iC;
        if (l != null) {
            I(l.longValue(), l.longValue());
        }
        Long l2 = this.e1;
        long jLongValue2 = l2 != null ? l2.longValue() + 30000 : Long.MAX_VALUE;
        ArrayList<kqz0> arrayList2 = new ArrayList();
        Iterator it = this.h1.iterator();
        while (true) {
            j = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next3 = it.next();
            kqz0 kqz0Var = (kqz0) next3;
            boolean z = kqz0Var.h;
            long j3 = kqz0Var.i;
            long j4 = kqz0Var.e;
            if (z && 0 <= j4 && j4 <= jLongValue2) {
                long j5 = kqz0Var.f;
                if (0 <= j5 && j5 <= jLongValue2 && j5 - j4 >= 0) {
                    arrayList2.add(next3);
                }
            }
            Logger.d("Found invalid play range, length: %d, end position: %d", new Object[]{Long.valueOf(j3), Long.valueOf(j4 + j3)});
        }
        long j6 = 0;
        for (kqz0 kqz0Var2 : arrayList2) {
            long j7 = kqz0Var2.e;
            if (j6 == j7) {
                int i9 = (kqz0Var2.a > 0.0f ? 1 : (kqz0Var2.a == 0.0f ? 0 : -1));
            }
            j6 = kqz0Var2.i + j7;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = o7h.a1(arrayList2, k0d.Z).iterator();
        ArrayList arrayList3 = arrayList2;
        long jMax = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            arrayList = arrayList3;
            if (!it2.hasNext()) {
                break;
            }
            kqz0 kqz0Var3 = (kqz0) it2.next();
            long j14 = j9;
            long j15 = kqz0Var3.j;
            int i10 = kqz0Var3.b;
            j12 += j15;
            long j16 = kqz0Var3.i;
            long j17 = j8 + j16;
            int iC2 = l1d.C(i10);
            if (iC2 != 0) {
                if (iC2 == 1) {
                    j11 += j15;
                } else if (iC2 != 2) {
                    if (iC2 == 6 || iC2 == 7 || iC2 == 8) {
                        j += j15;
                    }
                }
                if (!kqz0Var3.g) {
                    j13 += j15;
                }
                j2 = kqz0Var3.e;
                if (j2 >= jMax) {
                    jMax = j2 + j16;
                } else {
                    jMax = Math.max(jMax, j2 + j16);
                }
                if (kqz0Var3.d.length() > 0) {
                    j9 = j14 + j15;
                } else {
                    j9 = j14;
                }
                t2k1Var = kqz0Var3.c;
                if (t2k1Var == null && (iC = l1d.C(i10)) != 0 && iC != 1 && iC != 2) {
                    String identifier = t2k1Var.getIdentifier();
                    Long l3 = (Long) linkedHashMap.get(t2k1Var.getIdentifier());
                    linkedHashMap.put(identifier, Long.valueOf(j15 + (l3 != null ? l3.longValue() : 0L)));
                }
                arrayList3 = arrayList;
                j8 = j17;
            } else {
                j11 += j15;
            }
            j10 += j15;
            if (!kqz0Var3.g) {
                j13 += j15;
            }
            j2 = kqz0Var3.e;
            if (j2 >= jMax) {
                jMax = j2 + j16;
            } else {
                jMax = Math.max(jMax, j2 + j16);
            }
            if (kqz0Var3.d.length() > 0) {
                j9 = j14 + j15;
            } else {
                j9 = j14;
            }
            t2k1Var = kqz0Var3.c;
            if (t2k1Var == null) {
            }
            arrayList3 = arrayList;
            j8 = j17;
        }
        long j18 = j9;
        long j19 = j8;
        long j20 = j;
        long j21 = j10;
        long j22 = j11;
        long j23 = 0;
        long j24 = 0;
        long jMax2 = 0;
        long j25 = 0;
        long jMax3 = 0;
        long jMax4 = 0;
        int i11 = 0;
        int i12 = 0;
        long j26 = -1;
        for (pac pacVar : this.i1) {
            long j27 = j23;
            long j28 = pacVar.d;
            int iC3 = l1d.C(pacVar.a);
            if (iC3 != 0) {
                i8 = i12;
                if (iC3 == 1) {
                    j24 += j28;
                    jMax2 = Math.max(jMax2, j28);
                } else if (iC3 == 2) {
                    j25 += j28;
                    jMax3 = Math.max(jMax3, j28);
                    i11++;
                } else if (iC3 != 3) {
                    eg.o();
                    return;
                } else {
                    jMax4 = Math.max(jMax4, j28);
                    i12 = i8 + 1;
                    j23 = j27 + j28;
                }
            } else {
                i8 = i12;
                if (j26 == -1) {
                    j26 = 0;
                }
                j26 += j28;
            }
            i12 = i8;
            j23 = j27;
        }
        long j29 = j23;
        int i13 = i12;
        Iterator it3 = this.j1.iterator();
        int i14 = 0;
        int i15 = 0;
        while (it3.hasNext()) {
            if (((km51) it3.next()).c) {
                i14++;
            } else {
                i15++;
            }
        }
        Iterator it4 = arrayList.iterator();
        float f = 0.0f;
        while (true) {
            Iterator it5 = it4;
            if (!it4.hasNext()) {
                break;
            }
            kqz0 kqz0Var4 = (kqz0) it5.next();
            float f2 = f;
            int iC4 = l1d.C(kqz0Var4.b);
            int i16 = i14;
            if (iC4 == 0 || iC4 == 2 || iC4 == 5 || iC4 == 8) {
                j19 = j19;
                f = f2;
            } else {
                int iC5 = l1d.C(kqz0Var4.b);
                if (iC5 == 3) {
                    i7 = 0;
                } else {
                    if (iC5 != 4) {
                        if (iC5 == 6) {
                            i7 = 0;
                        } else if (iC5 != 7) {
                            i7 = -1;
                        }
                    }
                    i7 = 1;
                }
                f = ((i7 * kqz0Var4.i) / j19) + f2;
            }
            i11 = i11;
            i14 = i16;
            it4 = it5;
        }
        int i17 = i14;
        int i18 = i11;
        float f3 = f;
        long j30 = j19;
        Iterator it6 = this.k1.iterator();
        while (true) {
            if (!it6.hasNext()) {
                next = null;
                break;
            }
            next = it6.next();
            Iterator it7 = it6;
            if (((njp0) next).a != null) {
                break;
            } else {
                it6 = it7;
            }
        }
        njp0 njp0Var = (njp0) next;
        koj1 koj1Var = njp0Var != null ? (koj1) njp0Var.a : null;
        njp0 njp0Var2 = this.i;
        koj1 koj1Var2 = njp0Var2 != null ? (koj1) njp0Var2.a : null;
        Iterator it8 = this.l1.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it8.next();
            Iterator it9 = it8;
            if (((njp0) next2).a != null) {
                break;
            } else {
                it8 = it9;
            }
        }
        njp0 njp0Var3 = (njp0) next2;
        ev7 ev7Var = njp0Var3 != null ? (ev7) njp0Var3.a : null;
        njp0 njp0Var4 = this.t;
        ev7 ev7Var2 = njp0Var4 != null ? (ev7) njp0Var4.a : null;
        if (koj1Var != null) {
            i3 = koj1Var.a;
            if (ev7Var != null) {
                i3 += ev7Var.a;
            }
        } else if (koj1Var2 != null) {
            int i19 = koj1Var2.a;
            i3 = ev7Var2 != null ? ev7Var2.a + i19 : i19;
        } else {
            i3 = -1;
        }
        ArrayList<mjp0> arrayList4 = this.b;
        if (arrayList4.isEmpty()) {
            i4 = i15;
            i5 = 0;
        } else {
            long j31 = 0;
            long j32 = 0;
            for (mjp0 mjp0Var : arrayList4) {
                int i20 = i15;
                long j33 = mjp0Var.a;
                long j34 = mjp0Var.b;
                j32 = (j33 * j34) + j32;
                j31 += j34;
                i15 = i20;
            }
            i4 = i15;
            i5 = (int) ((j31 != 0 ? j32 / j31 : 0L) / 1000);
        }
        this.b1 = i5;
        if (this.d1 == -1) {
            Long l4 = this.S0;
            Long l5 = this.T0;
            if (l4 == null || l5 == null || l5.longValue() == -1 || this.N0) {
                if (this.N0) {
                    i6 = 5;
                } else if (l4 == null && l5 == null) {
                    i6 = 2;
                } else if (l4 == null) {
                    i6 = 3;
                } else {
                    i6 = l5 == null ? 4 : 1;
                }
                this.o1 = i6;
            } else {
                jLongValue = l4.longValue() - l5.longValue();
                if (jLongValue < 0) {
                    this.o1 = 1;
                }
                this.d1 = jLongValue;
            }
            jLongValue = -1;
            this.d1 = jLongValue;
        }
        long jCeil = (long) Math.ceil(this.X0 / 1000.0d);
        long jCeil2 = (long) Math.ceil(this.Y0 / 1000.0d);
        ioa ioaVarQ = BetamaxPlaybackSession.q();
        m0u0 m0u0Var = this.a;
        String str4 = m0u0Var.b;
        o2u0 o2u0Var = m0u0Var.a;
        ioaVarQ.i0(str4);
        ioaVarQ.j0(m0u0Var.d);
        ioaVarQ.y(this.t1);
        ioaVarQ.G(o2u0Var.a);
        String str5 = (String) o2u0Var.d.get("metadata_keys.internal.is_royalty_media");
        ioaVarQ.z((str5 == null || (boolD1 = ihc1.d1(str5)) == null) ? false : boolD1.booleanValue());
        ioaVarQ.k0(i3);
        Long l6 = this.e1;
        ioaVarQ.N(l6 != null ? l6.longValue() : -1L);
        ioaVarQ.a0(this.w1);
        Long l7 = this.Z0;
        ioaVarQ.b0(l7 != null ? l7.longValue() : -1L);
        Long l8 = this.f1;
        ioaVarQ.Q(l8 != null ? l8.longValue() : -1L);
        Long l9 = this.g1;
        ioaVarQ.O(l9 != null ? l9.longValue() : -1L);
        ioaVarQ.P(j26);
        ioaVarQ.H(j24);
        ioaVarQ.I(jMax2);
        ioaVarQ.J(j25);
        ioaVarQ.K(jMax3);
        ioaVarQ.f0(i18);
        ioaVarQ.L(j29);
        ioaVarQ.M(jMax4);
        ioaVarQ.g0(i13);
        ioaVarQ.d0(i4);
        ioaVarQ.e0(i17);
        ioaVarQ.S(j12);
        ioaVarQ.W(this.H1);
        ioaVarQ.X(j30);
        ioaVarQ.Z(j21);
        ioaVarQ.U(j22);
        ioaVarQ.V(j20);
        ioaVarQ.Y(j18);
        ioaVarQ.l0(this.z1.a);
        ioaVarQ.u(this.v1);
        ioaVarQ.t(zod.A((uwz0) this.F1.a.getValue()));
        ioaVarQ.A(this.b1);
        int i21 = this.n1;
        int i22 = i21 == 0 ? 2 : i21;
        String str6 = "unknown";
        if (i22 == 1) {
            str = "widevine";
        } else if (i22 == 2) {
            str = "none";
        } else {
            if (i22 != 3) {
                throw null;
            }
            str = "unknown";
        }
        ioaVarQ.w(str);
        ioaVarQ.D();
        ioaVarQ.B(jCeil);
        ioaVarQ.C(jCeil2);
        ioaVarQ.c0(this.c1);
        switch (i2 != 0 ? loa.a[l1d.C(i2)] : -1) {
            case -1:
                str2 = "unexpected-exit";
                break;
            case 0:
            default:
                eg.o();
                return;
            case 1:
                str2 = "played-to-end";
                break;
            case 2:
                str2 = "requested-end";
                break;
            case 3:
            case 4:
                str2 = "error";
                break;
            case 5:
                str2 = "network-error";
                break;
            case 6:
                str2 = "shutdown";
                break;
        }
        ioaVarQ.x(str2);
        ioaVarQ.r(this.u1);
        hpc1 hpc1Var = this.O0;
        if (hpc1Var == null || (str3 = hpc1Var.h) == null) {
            str3 = "";
        }
        ioaVarQ.E(str3);
        ioaVarQ.F(pze0.c(this.y1));
        ioaVarQ.n(linkedHashMap);
        ioaVarQ.R(this.d1);
        ioaVarQ.v(this.a1);
        ioaVarQ.T(j13);
        byte[] bArrA = raa.b.a(zod.D(m0u0Var).toUpperCase(Locale.US));
        ioaVarQ.h0(phc.e(0, bArrA, bArrA.length));
        ioaVarQ.s(f3);
        V("feature_tracking_id", "feature_tracking_id", m0u0Var, ioaVarQ);
        V("is_multiplayer_playback", "is_multiplayer_playback", m0u0Var, ioaVarQ);
        V("endvideo_context_uri", "play_context", m0u0Var, ioaVarQ);
        V("endvideo_track_uri", "spotify_uri", m0u0Var, ioaVarQ);
        String str7 = (String) m0u0Var.b().get("orchestration_stack");
        if (str7 == null) {
            str7 = "standalone";
        }
        ioaVarQ.q("playback_orchestration", str7);
        Long l10 = this.x1;
        if (l10 != null) {
            ioaVarQ.q("sampled_start_position", String.valueOf(l10.longValue()));
        }
        if (this.d1 == -1) {
            int i23 = this.o1;
            if (i23 != 1) {
                if (i23 == 2) {
                    str6 = "both timestamps missing";
                } else if (i23 == 3) {
                    str6 = "no playback started timestamp";
                } else if (i23 == 4) {
                    str6 = "no begin tracking timestamp";
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    str6 = "has paused during loading";
                }
            }
            ioaVarQ.q("invalid_pttff_reason", str6);
        }
        ion ionVar = new ion(ioaVarQ.build(), i);
        PublishSubject publishSubject = this.C1;
        publishSubject.onNext(ionVar);
        if (i == 5) {
            publishSubject.onNext(oqh.a);
        }
    }

    @Override // p.roa
    public final void j(int i, jgc1 jgc1Var, long j) {
        this.m1 = i;
        this.y1 = i;
        if (this.z1 == jgc1.UNKNOWN) {
            this.z1 = jgc1Var;
        }
    }

    @Override // p.roa
    public final void k(long j, long j2) {
        super.k(j, j2);
        koe1 koe1Var = this.B1;
        np00 np00Var = this.s1;
        if (koe1Var != null) {
            np00Var.c(koe1Var);
            this.B1 = null;
        }
        this.B1 = np00Var.a(j, new jc9((Object) this, (byte) 3));
    }

    @Override // p.roa
    public final void m(long j, long j2) {
        super.m(j, j2);
        if (this.x1 == null) {
            this.x1 = Long.valueOf(j);
        }
        X(this, 1, Long.valueOf(j), 4);
    }

    @Override // p.n590
    public final void u(p590 p590Var) {
        this.H1 += p590Var.a;
    }
}
