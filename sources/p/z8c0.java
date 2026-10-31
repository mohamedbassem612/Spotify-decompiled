package p;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.media3.common.ParserException;
import com.spotify.karaoke.esperanto.proto.KaraokeSubEventsRequest;
import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentDisplayRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z8c0 implements ObservableOnSubscribe, Function, SingleOnSubscribe, mkf1, Predicate, xi7 {
    public final /* synthetic */ byte a;
    public Object b;

    public z8c0(g0l g0lVar, gcn0 gcn0Var) {
        this.a = (byte) 21;
        this.b = g0lVar;
        new CompositeDisposable();
        (gcn0Var.a ? ((inr) g0lVar).d().map(new yla(this, (byte) 17)).distinctUntilChanged() : Observable.just(Boolean.TRUE)).getClass();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    public void a(int i, int i2, fc10 fc10Var) throws ParserException {
        int i3;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        long j;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        rch0 rch0Var = (rch0) this.b;
        iti1 iti1Var = rch0Var.b;
        SparseArray sparseArray = rch0Var.c;
        izr0 izr0Var = rch0Var.l;
        izr0 izr0Var2 = rch0Var.j;
        byte b3 = 2;
        int i12 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (rch0Var.U != 2) {
                    return;
                }
                qch0 qch0Var = (qch0) sparseArray.get(rch0Var.a0);
                int i13 = rch0Var.d0;
                izr0 izr0Var3 = rch0Var.q;
                if (i13 != 4 || !"V_VP9".equals(qch0Var.c)) {
                    fc10Var.u(i2);
                    return;
                } else {
                    izr0Var3.O(i2);
                    fc10Var.readFully(izr0Var3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                rch0Var.g(i);
                qch0 qch0Var2 = rch0Var.A;
                int i14 = qch0Var2.i;
                if (i14 != 1685485123 && i14 != 1685480259) {
                    fc10Var.u(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                qch0Var2.P = bArr;
                fc10Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                rch0Var.g(i);
                byte[] bArr2 = new byte[i2];
                rch0Var.A.k = bArr2;
                fc10Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                fc10Var.readFully(bArr3, 0, i2);
                rch0Var.g(i);
                rch0Var.A.l = new ftf1(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(izr0Var.a, (byte) 0);
                fc10Var.readFully(izr0Var.a, 4 - i2, i2);
                izr0Var.R(0);
                rch0Var.C = (int) izr0Var.G();
                return;
            }
            if (i == 25506) {
                rch0Var.g(i);
                byte[] bArr4 = new byte[i2];
                rch0Var.A.m = bArr4;
                fc10Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a((RuntimeException) null, "Unexpected id: " + i);
            }
            rch0Var.g(i);
            byte[] bArr5 = new byte[i2];
            rch0Var.A.y = bArr5;
            fc10Var.readFully(bArr5, 0, i2);
            return;
        }
        int i15 = 8;
        if (rch0Var.U == 0) {
            rch0Var.a0 = (int) iti1Var.b(fc10Var, false, true, 8);
            rch0Var.b0 = iti1Var.b;
            rch0Var.W = -9223372036854775807L;
            rch0Var.U = (byte) 1;
            izr0Var2.O(0);
        }
        qch0 qch0Var3 = (qch0) sparseArray.get(rch0Var.a0);
        if (qch0Var3 == null) {
            fc10Var.u(i2 - rch0Var.b0);
            rch0Var.U = (byte) 0;
            return;
        }
        qch0Var3.d0.getClass();
        if (rch0Var.U == 1) {
            rch0Var.l(fc10Var, 3);
            int i16 = (izr0Var2.a[2] & 6) >> 1;
            if (i16 == 0) {
                rch0Var.Y = 1;
                int[] iArr2 = rch0Var.Z;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                rch0Var.Z = iArr2;
                iArr2[0] = (i2 - rch0Var.b0) - 3;
            } else {
                rch0Var.l(fc10Var, 4);
                int i17 = (izr0Var2.a[3] & 255) + 1;
                rch0Var.Y = i17;
                int[] iArr3 = rch0Var.Z;
                if (iArr3 == null) {
                    iArr3 = new int[i17];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i17) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i17)];
                    }
                }
                rch0Var.Z = iArr3;
                if (i16 == 2) {
                    int i18 = (i2 - rch0Var.b0) - 4;
                    int i19 = rch0Var.Y;
                    Arrays.fill(iArr3, 0, i19, i18 / i19);
                } else {
                    if (i16 == 1) {
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = i3;
                        while (true) {
                            i8 = rch0Var.Y - 1;
                            iArr = rch0Var.Z;
                            if (i20 >= i8) {
                                break;
                            }
                            iArr[i20] = 0;
                            while (true) {
                                i9 = i22 + 1;
                                rch0Var.l(fc10Var, i9);
                                int i23 = izr0Var2.a[i22] & 255;
                                int[] iArr4 = rch0Var.Z;
                                i10 = iArr4[i20] + i23;
                                iArr4[i20] = i10;
                                if (i23 != 255) {
                                    break;
                                } else {
                                    i22 = i9;
                                }
                            }
                            i21 += i10;
                            i20++;
                            i22 = i9;
                        }
                        iArr[i8] = ((i2 - rch0Var.b0) - i22) - i21;
                    } else {
                        if (i16 != 3) {
                            throw ParserException.a((RuntimeException) null, "Unexpected lacing value: " + i16);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = i3;
                        while (true) {
                            int i27 = rch0Var.Y - 1;
                            int[] iArr5 = rch0Var.Z;
                            if (i24 >= i27) {
                                b = b3;
                                i4 = i12;
                                iArr5[i27] = ((i2 - rch0Var.b0) - i26) - i25;
                                break;
                            }
                            iArr5[i24] = i12;
                            int i28 = i26 + 1;
                            rch0Var.l(fc10Var, i28);
                            if (izr0Var2.a[i26] == 0) {
                                throw ParserException.a((RuntimeException) null, "No valid varint length mask found");
                            }
                            int i29 = i12;
                            while (true) {
                                if (i29 >= i15) {
                                    i5 = i15;
                                    b2 = b3;
                                    i6 = i12;
                                    j = 0;
                                    i7 = i28;
                                    break;
                                }
                                i5 = i15;
                                int i30 = 1 << (7 - i29);
                                i6 = i12;
                                if ((izr0Var2.a[i26] & i30) != 0) {
                                    i7 = i28 + i29;
                                    rch0Var.l(fc10Var, i7);
                                    b2 = b3;
                                    j = (~i30) & izr0Var2.a[i26] & 255;
                                    while (i28 < i7) {
                                        j = (j << i5) | ((long) (izr0Var2.a[i28] & 255));
                                        i28++;
                                    }
                                    if (i24 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i29 * 7) + 6)) - 1;
                                    break;
                                }
                                i29++;
                                i12 = i6;
                                i15 = i5;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw ParserException.a((RuntimeException) null, "EBML lacing sample size out of range.");
                            }
                            int i31 = (int) j;
                            int[] iArr6 = rch0Var.Z;
                            if (i24 != 0) {
                                i31 += iArr6[i24 - 1];
                            }
                            iArr6[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i7;
                            i12 = i6;
                            i15 = i5;
                            b3 = b2;
                        }
                    }
                    byte[] bArr6 = izr0Var2.a;
                    rch0Var.V = rch0Var.n((bArr6[1] & 255) | (bArr6[i4] << 8)) + rch0Var.S;
                    if (qch0Var3.f != 1 || (i == 163 && (izr0Var2.a[b] & 128) == 128)) {
                        i11 = 1;
                    } else {
                        i11 = i4;
                    }
                    rch0Var.c0 = i11;
                    rch0Var.U = b;
                    rch0Var.X = i4;
                }
            }
            b = 2;
            i4 = 0;
            byte[] bArr7 = izr0Var2.a;
            rch0Var.V = rch0Var.n((bArr7[1] & 255) | (bArr7[i4] << 8)) + rch0Var.S;
            if (qch0Var3.f != 1) {
                i11 = 1;
            } else {
                i11 = 1;
            }
            rch0Var.c0 = i11;
            rch0Var.U = b;
            rch0Var.X = i4;
        }
        if (i == 163) {
            while (true) {
                int i32 = rch0Var.X;
                if (i32 >= rch0Var.Y) {
                    rch0Var.U = (byte) 0;
                    return;
                }
                rch0Var.h(qch0Var3, ((long) ((rch0Var.X * qch0Var3.g) / 1000)) + rch0Var.V, rch0Var.c0, rch0Var.p(fc10Var, qch0Var3, rch0Var.Z[i32], false), 0);
                rch0Var.X++;
            }
        } else {
            while (true) {
                int i33 = rch0Var.X;
                if (i33 >= rch0Var.Y) {
                    return;
                }
                int[] iArr7 = rch0Var.Z;
                iArr7[i33] = rch0Var.p(fc10Var, qch0Var3, iArr7[i33], true);
                rch0Var.X++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0347  */
    public Object apply(Object obj) {
        boolean z;
        m231 rsnVar;
        CompletablePeek completablePeekA;
        Completable completableIgnoreElement;
        byte b = 14;
        lnm lnmVar = null;
        switch (this.a) {
            case 1:
                if (((String) obj).length() == 0) {
                    return j5.a;
                }
                ((agc0) ((yfu) this.b).c).getClass();
                return spq0.a("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                boolean z2 = ((r0x) this.b).a;
                qsn qsnVar = (qsn) mmr0Var.a;
                ly21 ly21Var = (py21) mmr0Var.b;
                if (ly21Var instanceof ly21) {
                    rsnVar = new m231(new meh(String.valueOf(ly21Var.a)));
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    Object obj2 = ((oy21) ly21Var).a;
                    smc0 smc0VarN = k4p1.n();
                    wsc0 wsc0Var = (wsc0) obj2;
                    List<zuc0> list = wsc0Var.e;
                    int iU = q7h.U(list, 9);
                    if (iU == 0) {
                        Collections.singletonList(null);
                    } else {
                        ArrayList arrayList = new ArrayList(iU + 1);
                        arrayList.add(null);
                        Object obj3 = null;
                        for (zuc0 zuc0Var : list) {
                            String str = (String) zuc0Var.g.get("list_item_heading");
                            if (str != null && !str.equals(obj3)) {
                                if (z2) {
                                    smc0VarN.add(new osn(str));
                                }
                                obj3 = str;
                            }
                            smc0VarN.add(new nsn(zuc0Var.c, zuc0Var.a));
                            arrayList.add(obj3);
                            obj3 = obj3;
                        }
                    }
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    ega1 ega1Var = qsnVar.b;
                    km90 km90Var = qsnVar.c;
                    if (!u890.j(km90Var, im90.a)) {
                        if (!(km90Var instanceof jm90)) {
                            eg.o();
                            return null;
                        }
                        z = wsc0Var.a > wsc0Var.e.size();
                    }
                    rsnVar = new rsn(smc0VarK, ega1Var, z);
                }
                return new e331(rsnVar);
            case 4:
                return Long.valueOf(((skd0) this.b).a((PlayerState) obj));
            case 7:
                a4e0 a4e0Var = (a4e0) this.b;
                return rqt0.F(a4e0Var.d, new xtz((k8u) obj, a4e0Var, (lnm) null, (byte) 28));
            case 8:
                gnh gnhVar = (gnh) obj;
                h1e0 h1e0Var = (h1e0) this.b;
                tjh tjhVar = h1e0Var.b;
                String str2 = gnhVar.a;
                ldi1 ldi1Var = (ldi1) tjhVar.c.b;
                rl40 rl40VarO = GetCommentDisplayRequest.o();
                rl40VarO.n(str2);
                return ldi1Var.e(rl40VarO.build()).subscribeOn(tjhVar.a).map(new ulc(h1e0Var, (byte) 14)).onErrorReturn(new yfc0(gnhVar, (byte) 6));
            case 11:
                boolean z3 = ((whf0) obj).a;
                wlk1 wlk1Var = (wlk1) this.b;
                wlk1Var.getClass();
                if (z3) {
                    KaraokeSubEventsRequest karaokeSubEventsRequestN = KaraokeSubEventsRequest.n();
                    be beVar = wlk1Var.d;
                    karaokeSubEventsRequestN.getClass();
                    completablePeekA = Completable.m(new CompletableSource[]{beVar.callStream("spotify.karaoke_esperanto.proto.KaraokeService", "SubscribeToEvents", karaokeSubEventsRequestN).map(cj20.h).take(1L).flatMapCompletable(new h5a1(wlk1Var, (byte) 23)), wlk1Var.a(boa0.b)}).h(new vlk1(wlk1Var, (byte) 0));
                } else {
                    if (z3) {
                        eg.o();
                        return null;
                    }
                    completablePeekA = wlk1Var.a(boa0.c);
                }
                List list2 = ygl.a;
                return completablePeekA.d(Observable.just(new jjf0(z3, xlk1.c))).onErrorReturn(new m980((byte) 17, z3));
            case 13:
                g4o0 g4o0Var = (g4o0) obj;
                l6s l6sVar = ((qig0) this.b).d;
                int iOrdinal = g4o0Var.ordinal();
                if (iOrdinal == 0) {
                    completableIgnoreElement = CompletableEmpty.a;
                } else if (iOrdinal == 1) {
                    completableIgnoreElement = ((q1o0) l6sVar.a).a().doOnSuccess(new ecs(l6sVar, (byte) 0)).ignoreElement();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    completableIgnoreElement = ((q1o0) l6sVar.a).a().doOnSuccess(new ecs(l6sVar, (byte) 1)).ignoreElement();
                }
                completableIgnoreElement.getClass();
                return completableIgnoreElement.e(Single.just(g4o0Var));
            case 17:
                mki0 mki0Var = (mki0) obj;
                gj10 gj10Var = ((rki0) this.b).a;
                String str3 = mki0Var.b;
                boolean z4 = mki0Var.c;
                return gj10.k(gj10Var, str3, (String) null, (String) null, (Boolean) null, Boolean.valueOf(z4), (Boolean) null, 46).d(Observable.just(new wki0(z4))).onErrorReturn(new yfc0(mki0Var, (byte) 15));
            case 22:
                q1o0 q1o0Var = (q1o0) this.b;
                return Integer.valueOf(q1o0Var.a.b(q1o0Var.e, (String) obj).l(bma1.b.n("key_bt_permissions_system_dialog_count"), 0));
            case 23:
                d3o0 d3o0Var = (d3o0) this.b;
                return rqt0.F(d3o0Var.e, new m3n0(d3o0Var, (String) obj, lnmVar, b));
            case 24:
                v6o0 v6o0Var = (y6o0) obj;
                zd1 zd1Var = (zd1) this.b;
                rcl rclVar = (rcl) zd1Var.b;
                if (v6o0Var instanceof v6o0) {
                    if (Build.VERSION.SDK_INT < 26) {
                        zd1Var.d = rclVar.f(((ConnectivityManager) ((Context) zd1Var.c).getSystemService("connectivity")).getNetworkCapabilities(v6o0Var.a));
                    }
                } else if (v6o0Var instanceof z6o0) {
                    zd1Var.d = rclVar.f(((z6o0) v6o0Var).b);
                } else {
                    if (!(v6o0Var instanceof x7o0)) {
                        eg.o();
                        return null;
                    }
                    zd1Var.d = gbl.f;
                }
                return (gbl) zd1Var.d;
            case 27:
                List list3 = (List) obj;
                if (list3.isEmpty()) {
                    return Flowable.I(su50.a);
                }
                Flowable flowableM = Flowable.E(list3).m(new yfc0((cr6) this.b, (byte) 25));
                flowableM.getClass();
                return flowableM;
            default:
                mmr0 mmr0Var2 = (mmr0) obj;
                phi0 phi0Var = (phi0) ((rzo0) this.b).b;
                PlayerState playerState = (PlayerState) mmr0Var2.a;
                Map map = (Map) mmr0Var2.b;
                if (!playerState.track().c()) {
                    return NowPlayingMiniMode.Empty;
                }
                esj0 esj0Var = (esj0) phi0Var.b;
                esj0Var.getClass();
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                if (esj0Var.a.a()) {
                    contextTrack.getClass();
                    if (l4o1.E(contextTrack)) {
                        return NowPlayingMiniMode.Ad;
                    }
                }
                ((h5v0) phi0Var.d).getClass();
                if (l4o1.P((ContextTrack) playerState.track().b())) {
                    return NowPlayingMiniMode.Podcast;
                }
                if (((s6z0) phi0Var.c).b((ContextTrack) playerState.track().b())) {
                    return NowPlayingMiniMode.Greenroom;
                }
                ((j0y) phi0Var.e).getClass();
                if (o4p1.u(playerState)) {
                    return NowPlayingMiniMode.Endless;
                }
                ((sh11) phi0Var.f).a.getClass();
                return rh11.c(map) ? NowPlayingMiniMode.ReinventFree : NowPlayingMiniMode.Default;
        }
    }

    public qfe0 b(String str) {
        v6a0 v6a0Var = (v6a0) this.b;
        gz70 fz70Var = null;
        gz70 gz70Var = str.equals("spotify:local-files:cover:v1") ? new gz70(new jgd0((fad0) v6a0Var.b, (byte) 12)) : null;
        if (gz70Var != null) {
            fz70Var = gz70Var;
        } else {
            sjq0 sjq0Var = (sjq0) v6a0Var.c;
            if (str.equals("spotify:cached-files")) {
                fz70Var = new fz70(new kks0(sjq0Var, (byte) 14));
            }
        }
        return fz70Var != null ? new ofe0(new rfe0(fz70Var)) : pfe0.a;
    }

    public boolean c() {
        return ((wg4) this.b).b();
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        return new qud0(viewGroup, ((af80) ((lud0) this.b).b).a);
    }

    public void e(b2p1 b2p1Var) {
        w62 w62Var = (w62) this.b;
        if (!(b2p1Var instanceof s0u0)) {
            if (!(b2p1Var instanceof r0u0)) {
                eg.o();
                return;
            } else {
                ((rku) w62Var.h).b(Completable.k(((ruz) w62Var.c).a(new d9u0("episode-defaultplaypauseinteractor", false))).subscribe());
                return;
            }
        }
        s0u0 s0u0Var = (s0u0) b2p1Var;
        long j = s0u0Var.h;
        rku rkuVar = (rku) w62Var.h;
        String str = s0u0Var.c;
        String str2 = s0u0Var.d;
        if (j > -1) {
            rkuVar.b(w62Var.i(str, str2, -1L, s0u0Var.f, -1L, j).subscribe(new wes(), new xes((byte) 1, j, str2)));
        } else {
            long j2 = s0u0Var.e;
            rkuVar.b(w62Var.i(str, str2, j2, s0u0Var.f, s0u0Var.g, -1L).subscribe(new wes(), new xes((byte) 0, j2, str2)));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public void f(int i, long j) throws ParserException {
        rch0 rch0Var = (rch0) this.b;
        if (i == 136) {
            rch0Var.g(i);
            rch0Var.A.b0 = j == 1;
            return;
        }
        if (i == 137) {
            rch0Var.j(i).e = j;
            return;
        }
        if (i == 145) {
            rch0Var.j(i).b = j;
            return;
        }
        if (i == 146) {
            rch0Var.j(i).c = j;
            return;
        }
        if (i == 240) {
            if (rch0Var.B) {
                return;
            }
            rch0Var.f(i);
            if (rch0Var.J == -1) {
                rch0Var.J = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (rch0Var.B) {
                return;
            }
            rch0Var.f(i);
            if (rch0Var.I == -1) {
                rch0Var.I = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a((RuntimeException) null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a((RuntimeException) null, "ContentEncodingScope " + j + " not supported");
        }
        if (i == 29636) {
            rch0Var.j(i).a = j;
            return;
        }
        if (i == 29637) {
            rch0Var.g(i);
            rch0Var.A.e = j;
            return;
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    rch0Var.g(i);
                    rch0Var.A.f = 2;
                    return;
                }
                if (i2 == 2) {
                    rch0Var.g(i);
                    rch0Var.A.f = 1;
                    return;
                } else if (i2 == 17) {
                    rch0Var.g(i);
                    rch0Var.A.f = 3;
                    return;
                } else if (i2 != 33) {
                    rch0Var.g(i);
                    rch0Var.A.f = -1;
                    return;
                } else {
                    rch0Var.g(i);
                    rch0Var.A.f = 5;
                    return;
                }
            case 152:
                rch0Var.j(i).d = j == 1;
                return;
            case 155:
                rch0Var.W = rch0Var.n(j);
                return;
            case 159:
                rch0Var.g(i);
                rch0Var.A.Q = (int) j;
                return;
            case 176:
                rch0Var.g(i);
                rch0Var.A.o = (int) j;
                return;
            case 179:
                if (rch0Var.B) {
                    return;
                }
                rch0Var.f(i);
                rch0Var.G = rch0Var.n(j);
                return;
            case 186:
                rch0Var.g(i);
                rch0Var.A.p = (int) j;
                return;
            case 215:
                rch0Var.g(i);
                rch0Var.A.d = (int) j;
                return;
            case 231:
                rch0Var.S = rch0Var.n(j);
                return;
            case 238:
                rch0Var.d0 = (int) j;
                return;
            case 247:
                if (rch0Var.B) {
                    return;
                }
                rch0Var.f(i);
                rch0Var.H = (int) j;
                return;
            case 251:
                rch0Var.e0 = true;
                return;
            case 16871:
                rch0Var.g(i);
                rch0Var.A.i = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a((RuntimeException) null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a((RuntimeException) null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a((RuntimeException) null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a((RuntimeException) null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a((RuntimeException) null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                rch0Var.D = j + rch0Var.t;
                return;
            case 21432:
                int i3 = (int) j;
                rch0Var.g(i);
                if (i3 == 0) {
                    rch0Var.A.z = 0;
                    return;
                }
                if (i3 == 1) {
                    rch0Var.A.z = 2;
                    return;
                } else if (i3 == 3) {
                    rch0Var.A.z = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    rch0Var.A.z = 3;
                    return;
                }
            case 21680:
                rch0Var.g(i);
                rch0Var.A.r = (int) j;
                return;
            case 21682:
                rch0Var.g(i);
                rch0Var.A.t = (int) j;
                return;
            case 21690:
                rch0Var.g(i);
                rch0Var.A.s = (int) j;
                return;
            case 21930:
                rch0Var.g(i);
                rch0Var.A.a0 = j == 1;
                return;
            case 21938:
                rch0Var.g(i);
                rch0Var.A.q = (int) j;
                return;
            case 21998:
                rch0Var.g(i);
                rch0Var.A.h = (int) j;
                return;
            case 22186:
                rch0Var.g(i);
                rch0Var.A.U = j;
                return;
            case 22203:
                rch0Var.g(i);
                rch0Var.A.V = j;
                return;
            case 25188:
                rch0Var.g(i);
                rch0Var.A.R = (int) j;
                return;
            case 30114:
                rch0Var.f0 = j;
                return;
            case 30321:
                rch0Var.g(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    rch0Var.A.u = 0;
                    return;
                }
                if (i4 == 1) {
                    rch0Var.A.u = 1;
                    return;
                } else if (i4 == 2) {
                    rch0Var.A.u = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    rch0Var.A.u = 3;
                    return;
                }
            case 2352003:
                rch0Var.g(i);
                rch0Var.A.g = (int) j;
                return;
            case 2807729:
                rch0Var.u = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        rch0Var.g(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            rch0Var.A.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            rch0Var.A.C = 1;
                            return;
                        }
                    case 21946:
                        rch0Var.g(i);
                        int iJ = x8h.j((int) j);
                        if (iJ != -1) {
                            rch0Var.A.B = iJ;
                            return;
                        }
                        return;
                    case 21947:
                        rch0Var.g(i);
                        int i6 = x8h.i((int) j);
                        if (i6 != -1) {
                            rch0Var.A.A = i6;
                            return;
                        }
                        return;
                    case 21948:
                        rch0Var.g(i);
                        rch0Var.A.D = (int) j;
                        return;
                    case 21949:
                        rch0Var.g(i);
                        rch0Var.A.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean g() {
        return ((wg4) this.b).a();
    }

    public boolean h(int i) {
        it4 it4Var = (it4) this.b;
        switch (l1d.C(i)) {
            case 0:
                return it4Var.b();
            case 1:
                return it4Var.c();
            case 2:
                return it4Var.d();
            case 3:
                return it4Var.e();
            case 4:
                return it4Var.f();
            case 5:
                return it4Var.g();
            case 6:
                return it4Var.h();
            case 7:
                return it4Var.i();
            case 8:
                return it4Var.j();
            case 9:
                return it4Var.k();
            case 10:
                return it4Var.l();
            case 11:
                return it4Var.m();
            default:
                eg.o();
                return false;
        }
    }

    public void i(Exception exc) {
        oon1.w("Audio sink error", exc);
        em3 em3Var = ((zjh0) this.b).i2;
        Handler handler = (Handler) em3Var.b;
        if (handler != null) {
            handler.post(new m38(em3Var, exc, (byte) 1));
        }
    }

    public void j() {
        mym0 mym0Var = (mym0) this.b;
        mym0Var.q = true;
        if (!mym0Var.i.isEmpty()) {
            mym0Var.p();
            return;
        }
        azs azsVar = mym0Var.n;
        azsVar.getClass();
        azsVar.k();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public void k(int i, long j, long j2) throws ParserException {
        rch0 rch0Var = (rch0) this.b;
        rch0Var.p0.getClass();
        if (i == 128) {
            rch0Var.j(i).h = null;
            rch0Var.j(i).i = null;
            return;
        }
        if (i == 160) {
            rch0Var.e0 = false;
            rch0Var.f0 = 0L;
            return;
        }
        if (i == 174) {
            qch0 qch0Var = new qch0();
            qch0Var.o = -1;
            qch0Var.p = -1;
            qch0Var.q = -1;
            qch0Var.r = -1;
            qch0Var.s = -1;
            qch0Var.t = 0;
            qch0Var.u = -1;
            qch0Var.v = 0.0f;
            qch0Var.w = 0.0f;
            qch0Var.x = 0.0f;
            qch0Var.y = null;
            qch0Var.z = -1;
            qch0Var.A = -1;
            qch0Var.B = -1;
            qch0Var.C = -1;
            qch0Var.D = 1000;
            qch0Var.E = 200;
            qch0Var.F = -1.0f;
            qch0Var.G = -1.0f;
            qch0Var.H = -1.0f;
            qch0Var.I = -1.0f;
            qch0Var.J = -1.0f;
            qch0Var.K = -1.0f;
            qch0Var.L = -1.0f;
            qch0Var.M = -1.0f;
            qch0Var.N = -1.0f;
            qch0Var.O = -1.0f;
            qch0Var.Q = 1;
            qch0Var.R = -1;
            qch0Var.S = -1;
            qch0Var.T = 8000;
            qch0Var.U = 0L;
            qch0Var.V = 0L;
            qch0Var.X = false;
            qch0Var.b0 = true;
            qch0Var.c0 = "eng";
            rch0Var.A = qch0Var;
            qch0Var.a = rch0Var.x;
            return;
        }
        if (i == 187) {
            if (rch0Var.B) {
                return;
            }
            rch0Var.f(i);
            rch0Var.G = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            rch0Var.C = -1;
            rch0Var.D = -1L;
            return;
        }
        if (i == 20533) {
            rch0Var.g(i);
            rch0Var.A.j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = rch0Var.t;
            if (j3 != -1 && j3 != j) {
                throw ParserException.a((RuntimeException) null, "Multiple Segment elements not supported");
            }
            rch0Var.t = j;
            rch0Var.s = j2;
            return;
        }
        if (i == 475249515) {
            if (rch0Var.B) {
                return;
            }
            rch0Var.F = true;
            return;
        }
        if (i == 524531317) {
            if (rch0Var.O != -1 && !rch0Var.R) {
                rch0Var.P = true;
            }
            if (rch0Var.B) {
                return;
            }
            if (rch0Var.e && rch0Var.M != -1) {
                rch0Var.L = true;
                return;
            } else {
                rch0Var.p0.c(new bc9(rch0Var.w));
                rch0Var.B = true;
                return;
            }
        }
        if (i == 182) {
            nch0 nch0Var = new nch0();
            nch0Var.b = -9223372036854775807L;
            nch0Var.c = -9223372036854775807L;
            rch0Var.z = nch0Var;
            return;
        }
        if (i == 183 && !rch0Var.B) {
            rch0Var.f(i);
            rch0Var.H = -1;
            rch0Var.I = -1L;
            rch0Var.J = -1L;
        }
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((Observable) ((b9o) ((wf2) this.b).b).invoke()).firstOrError().map(ak20.t).onErrorReturn(bk20.X);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public void m(int i, String str) throws ParserException {
        rch0 rch0Var = (rch0) this.b;
        if (i == 133) {
            rch0Var.j(i).h = str;
            return;
        }
        if (i == 134) {
            rch0Var.g(i);
            rch0Var.A.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                rch0Var.x = str.equals("webm");
                return;
            }
            throw ParserException.a((RuntimeException) null, "DocType " + str + " not supported");
        }
        if (i == 17276) {
            rch0Var.j(i).i = str;
            return;
        }
        if (i == 21358) {
            rch0Var.g(i);
            rch0Var.A.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            rch0Var.g(i);
            rch0Var.A.c0 = str;
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        hgd0 hgd0Var = (hgd0) this.b;
        luk lukVar = hgd0Var.s;
        if (lukVar == null || !lukVar.i("listening-activity.visibility_indicator_treatment")) {
            lukVar = hgd0Var.t;
        }
        if (lukVar != null) {
            lukVar.e(new ggd0(singleEmitter, hgd0Var, (byte) 1));
        }
    }

    public boolean test(Object obj) {
        return ((List) ((o860) this.b).e).contains(((PlayerError) obj).error());
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        x8c0 x8c0Var = (x8c0) this.b;
        it0 it0Var = new it0(observableEmitter, x8c0Var, (byte) 6);
        observableEmitter.onNext(x8c0Var.b());
        x8c0Var.a(it0Var);
        observableEmitter.setCancellable(new pc6(x8c0Var, it0Var, (byte) 8));
    }

    public z8c0(y490 y490Var) {
        this.a = (byte) 16;
        this.b = new zx60(yoi1.g(y490Var.k()), (byte) 23);
    }

    public /* synthetic */ z8c0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
