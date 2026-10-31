package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerState;
import com.spotify.stickers.v1.FilterChip;
import com.spotify.stickers.v1.GetStickerResponse;
import com.spotify.stickers.v1.GetSurfaceResponse;
import com.spotify.stickers.v1.SearchSurfaceStickersResponse;
import com.spotify.stickers.v1.Sticker;
import com.spotify.stickers.v1.StickerPack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class m87 {
    public static final l75 a = new l75();
    public static b180 b;
    public static b180 c;

    public static final ArrayList A(GetSurfaceResponse getSurfaceResponse) {
        h290<StickerPack> h290VarO = getSurfaceResponse.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (StickerPack stickerPack : h290VarO) {
            String strN = stickerPack.n();
            String title = stickerPack.getTitle();
            h290<Sticker> h290VarO2 = stickerPack.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO2, 10));
            for (Sticker sticker : h290VarO2) {
                sticker.getClass();
                arrayList2.add(z(sticker));
            }
            arrayList.add(new mwb1(strN, arrayList2, title));
        }
        return arrayList;
    }

    public static final ArrayList B(SearchSurfaceStickersResponse searchSurfaceStickersResponse) {
        h290<StickerPack> h290VarN = searchSurfaceStickersResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (StickerPack stickerPack : h290VarN) {
            String strN = stickerPack.n();
            String title = stickerPack.getTitle();
            h290<Sticker> h290VarO = stickerPack.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (Sticker sticker : h290VarO) {
                sticker.getClass();
                arrayList2.add(z(sticker));
            }
            arrayList.add(new mwb1(strN, arrayList2, title));
        }
        return arrayList;
    }

    public static Next C(kak0 kak0Var, w1k0 w1k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        q6w0 q6w0Var = lhg1Var.a;
        duk1 duk1Var = w1k0Var.c;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(q6w0Var, duk1Var != null ? new buk1(duk1Var) : null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, w1k0Var.a, w1k0Var.b, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 65149), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 3);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x032b A[LOOP:1: B:137:0x0325->B:139:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:218:0x045e  */
    public static final Next D(jyt0 jyt0Var, fyt0 fyt0Var) {
        zxt0 wxt0Var;
        gyt0 gyt0VarA;
        y6b1 y6b1Var;
        long j;
        long j2;
        ArrayList arrayList;
        Iterator it;
        uxt0 sxt0Var;
        y6b1 y6b1Var2;
        long j3;
        boolean z = fyt0Var instanceof eyt0;
        Set setSingleton = w7x.a;
        zxt0 zxt0Var = yxt0.a;
        Long lValueOf = null;
        if (!z) {
            if (fyt0Var instanceof ayt0) {
                return Next.a(Collections.singleton(vxt0.a));
            }
            if (!(fyt0Var instanceof byt0)) {
                if (fyt0Var instanceof cyt0) {
                    return Next.j();
                }
                if (!(fyt0Var instanceof dyt0)) {
                    eg.o();
                    return null;
                }
                dyt0 dyt0Var = (dyt0) fyt0Var;
                if (jyt0Var instanceof gyt0) {
                    ErrorType errorTypeError = dyt0Var.a.error();
                    int i = errorTypeError == null ? -1 : qve0.a[errorTypeError.ordinal()];
                    if (i == 1 || i == 2) {
                        gyt0 gyt0Var = (gyt0) jyt0Var;
                        setSingleton = Collections.singleton(new xxt0(0L, gyt0Var.b, gyt0Var.c, gyt0Var.a));
                    }
                }
                return setSingleton.isEmpty() ? Next.j() : Next.a(setSingleton);
            }
            byt0 byt0Var = (byt0) fyt0Var;
            if (!(jyt0Var instanceof gyt0)) {
                if (jyt0Var instanceof hyt0) {
                    eg.m("LLP - shouldn't receive messages while paused.");
                    return null;
                }
                if (jyt0Var instanceof iyt0) {
                    eg.m("LLP - shouldn't receive messages while waiting for party.");
                    return null;
                }
                eg.o();
                return null;
            }
            gyt0 gyt0Var2 = (gyt0) jyt0Var;
            y6b1 y6b1Var3 = gyt0Var2.a;
            PlayerState playerState = gyt0Var2.b;
            v3s0 v3s0Var = byt0Var.a;
            if (v3s0Var instanceof u3s0) {
                u3s0 u3s0Var = (u3s0) v3s0Var;
                if (c4p1.z(playerState)) {
                    zxt0Var = null;
                } else {
                    wxt0Var = new xxt0(u3s0Var.a, playerState, gyt0Var2.c, y6b1Var3);
                    zxt0Var = wxt0Var;
                }
            } else if (v3s0Var instanceof v3s0) {
                v3s0 v3s0Var2 = v3s0Var;
                y6b1 y6b1Var4 = v3s0Var2.a;
                if (u(playerState, y6b1Var4.toString(), v3s0Var2.b)) {
                    zxt0Var = null;
                } else {
                    wxt0Var = new wxt0(y6b1Var3, Collections.singletonList(y6b1Var4), v3s0Var2.b, playerState, gyt0Var2.c);
                    zxt0Var = wxt0Var;
                }
            } else if (v3s0Var instanceof w3s0) {
                w3s0 w3s0Var = (w3s0) v3s0Var;
                List list = w3s0Var.a;
                y6b1 y6b1Var5 = (y6b1) o7h.s0(list);
                if (y6b1Var5 != null ? u(playerState, y6b1Var5.toString(), w3s0Var.b) : false) {
                    zxt0Var = null;
                } else {
                    wxt0Var = new wxt0(y6b1Var3, list, w3s0Var.b, playerState, gyt0Var2.c);
                    zxt0Var = wxt0Var;
                }
            } else if (!(v3s0Var instanceof t3s0)) {
                eg.o();
                return null;
            }
            return zxt0Var != null ? Next.i(gyt0.a(gyt0Var2, (PlayerState) null, (PlayerState) null, o7h.O0(v3s0Var, gyt0Var2.d), 7), Collections.singleton(zxt0Var)) : Next.j();
        }
        Long l = ((eyt0) fyt0Var).a;
        boolean z2 = jyt0Var instanceof gyt0;
        iyt0 iyt0Var = iyt0.a;
        if (!z2) {
            if (!(jyt0Var instanceof hyt0)) {
                if (!(jyt0Var instanceof iyt0)) {
                    eg.o();
                    return null;
                }
                if (!t2p1.m(l) || !c4p1.y(l)) {
                    return Next.j();
                }
                y6b1 y6b1Var6 = new y6b1(l.contextUri(), false);
                Long l2 = c4p1.z(l) ? l : null;
                lValueOf = c4p1.z(l) ? l : null;
                return p(lValueOf != null ? c4p1.t(lValueOf) : 0L, l, l2, y6b1Var6);
            }
            if ((ihc1.y0(l.contextUri()) && !l.track().c()) || (l.track().c() && c4p1.A(l) < 1 && !t2p1.m(l))) {
                return Next.h(iyt0Var);
            }
            if (!t2p1.m(l) || !c4p1.y(l)) {
                return Next.j();
            }
            lValueOf = c4p1.z(l) ? l : null;
            if (lValueOf == null) {
                lValueOf = ((hyt0) jyt0Var).b;
            }
            return p(lValueOf != null ? c4p1.t(lValueOf) : 0L, l, lValueOf, new y6b1(l.contextUri(), false));
        }
        if (c4p1.A(l) > 0 && c4p1.z(l)) {
            return Next.i(iyt0Var, f46.S0(new zxt0[]{new rxt0(((gyt0) jyt0Var).a), zxt0Var}));
        }
        if (c4p1.A(l) > 0 && !c4p1.z(l)) {
            gyt0 gyt0Var3 = (gyt0) jyt0Var;
            return Next.a(Collections.singleton(new xxt0(0L, gyt0Var3.b, gyt0Var3.c, gyt0Var3.a)));
        }
        if ((ihc1.y0(l.contextUri()) && !l.track().c()) || (l.track().c() && c4p1.A(l) < 1 && !t2p1.m(l))) {
            return Next.i(iyt0Var, Collections.singleton(new rxt0(((gyt0) jyt0Var).a)));
        }
        if (c4p1.x(l)) {
            gyt0 gyt0Var4 = (gyt0) jyt0Var;
            y6b1 y6b1Var7 = gyt0Var4.a;
            return Next.i(new hyt0(y6b1Var7, gyt0Var4.c), Collections.singleton(new rxt0(y6b1Var7)));
        }
        if (c4p1.z(l) && !c4p1.y(l)) {
            return Next.j();
        }
        if (c4p1.z(l) && ((Number) l.positionAsOfTimestamp().e(0L)).longValue() < ((Number) ((gyt0) jyt0Var).c.positionAsOfTimestamp().e(0L)).longValue()) {
            return Next.j();
        }
        gyt0 gyt0Var5 = (gyt0) jyt0Var;
        y6b1 y6b1Var8 = gyt0Var5.a;
        if (l.track().c()) {
            gyt0VarA = gyt0.a(gyt0Var5, l, (PlayerState) null, (ArrayList) null, 13);
            ContextTrack contextTrack = (ContextTrack) l.track().h();
            if (contextTrack != null && l4o1.M(contextTrack)) {
                gyt0VarA = gyt0.a(gyt0VarA, (PlayerState) null, l, (ArrayList) null, 11);
            }
        } else {
            gyt0VarA = gyt0Var5;
        }
        if (l.track().c()) {
            PlayerState playerState2 = gyt0Var5.b;
            PlayerState playerState3 = gyt0Var5.c;
            List list2 = gyt0Var5.d;
            if (c4p1.z(playerState2) && !c4p1.z(l)) {
                y6b1 y6b1Var9 = new y6b1(c4p1.w(l), false);
                v3s0 v3s0Var3 = (x3s0) o7h.A0(list2);
                if (v3s0Var3 instanceof v3s0) {
                    y6b1Var2 = v3s0Var3.a;
                } else {
                    if (!(v3s0Var3 instanceof w3s0)) {
                        eg.m("invalid state, expected to play music in response to a message");
                        return null;
                    }
                    y6b1Var2 = (y6b1) o7h.q0(((w3s0) v3s0Var3).a);
                }
                long jT = c4p1.t(l);
                v3s0 v3s0Var4 = (x3s0) o7h.A0(list2);
                if (v3s0Var4 instanceof v3s0) {
                    j3 = v3s0Var4.b;
                } else {
                    if (!(v3s0Var4 instanceof w3s0)) {
                        eg.m("invalid state, expected to play music in response to a message");
                        return null;
                    }
                    j3 = ((w3s0) v3s0Var4).b;
                }
                long j4 = j3;
                b380 b380VarNextTracks = l.nextTracks();
                ArrayList arrayList2 = new ArrayList(q7h.U(b380VarNextTracks, 10));
                Iterator it2 = b380VarNextTracks.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new y6b1(((ContextTrack) it2.next()).uri(), false));
                }
                setSingleton = Collections.singleton(new txt0(y6b1Var8, y6b1Var9, y6b1Var2, jT, j4, arrayList2, c4p1.t(playerState3), Long.valueOf(((x3s0) o7h.A0(list2)).a()), ((x3s0) o7h.A0(list2)).getEventId()));
            } else if (!c4p1.z(playerState2) && c4p1.z(l)) {
                v3s0 v3s0Var5 = (x3s0) o7h.A0(list2);
                if (v3s0Var5 instanceof u3s0) {
                    u3s0 u3s0Var2 = (u3s0) v3s0Var5;
                    sxt0Var = new uxt0(y6b1Var8, c4p1.t(l), u3s0Var2.a, u3s0Var2.b);
                } else if (v3s0Var5 instanceof v3s0) {
                    y6b1 y6b1Var10 = new y6b1(c4p1.w(playerState2), false);
                    long jT2 = c4p1.t(l);
                    v3s0 v3s0Var6 = v3s0Var5;
                    long j5 = v3s0Var6.c;
                    Long l3 = (Long) playerState2.duration().h();
                    sxt0Var = new sxt0(y6b1Var8, y6b1Var10, jT2, Long.valueOf((l3 != null ? l3.longValue() : 0L) + j5), v3s0Var6.d);
                } else {
                    if (!(v3s0Var5 instanceof w3s0)) {
                        if (v3s0Var5 instanceof t3s0) {
                            eg.m("invalid state, expecting party to end not play talk");
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    sxt0Var = new sxt0(y6b1Var8, new y6b1(c4p1.w(playerState2), false), c4p1.t(l), (Long) null, ((w3s0) v3s0Var5).d);
                }
                setSingleton = Collections.singleton(sxt0Var);
            } else if (!c4p1.z(playerState2) && !c4p1.z(l) && !c4p1.w(playerState2).equals(c4p1.w(l))) {
                v3s0 v3s0Var7 = (x3s0) o7h.A0(list2);
                y6b1 y6b1Var11 = new y6b1(c4p1.w(l), false);
                boolean z3 = v3s0Var7 instanceof v3s0;
                if (z3) {
                    y6b1Var = v3s0Var7.a;
                } else {
                    if (!(v3s0Var7 instanceof w3s0)) {
                        eg.m("invalid state, expected to play music in response to a message");
                        return null;
                    }
                    List list3 = ((w3s0) v3s0Var7).a;
                    y6b1Var = list3.size() == l.nextTracks().size() + 1 ? (y6b1) o7h.q0(list3) : null;
                }
                long jT3 = c4p1.t(l);
                if (z3) {
                    j2 = v3s0Var7.b;
                } else {
                    if (!(v3s0Var7 instanceof w3s0)) {
                        eg.o();
                        return null;
                    }
                    w3s0 w3s0Var2 = (w3s0) v3s0Var7;
                    y6b1 y6b1Var12 = (y6b1) o7h.s0(w3s0Var2.a);
                    if (u890.j(y6b1Var12 != null ? y6b1Var12.toString() : null, c4p1.w(l))) {
                        j2 = w3s0Var2.b;
                    } else {
                        j = 0;
                    }
                    b380 b380VarNextTracks2 = l.nextTracks();
                    arrayList = new ArrayList(q7h.U(b380VarNextTracks2, 10));
                    it = b380VarNextTracks2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new y6b1(((ContextTrack) it.next()).uri(), false));
                    }
                    long jT4 = c4p1.t(playerState3);
                    if ((v3s0Var7 instanceof w3s0) && ((w3s0) v3s0Var7).a.size() != l.nextTracks().size() + 1) {
                        lValueOf = Long.valueOf(c4p1.t(playerState3));
                    }
                    setSingleton = Collections.singleton(new txt0(y6b1Var8, y6b1Var11, y6b1Var, jT3, j, arrayList, jT4, lValueOf, ((x3s0) o7h.A0(list2)).getEventId()));
                }
                j = j2;
                b380 b380VarNextTracks3 = l.nextTracks();
                arrayList = new ArrayList(q7h.U(b380VarNextTracks3, 10));
                it = b380VarNextTracks3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new y6b1(((ContextTrack) it.next()).uri(), false));
                }
                long jT5 = c4p1.t(playerState3);
                if (v3s0Var7 instanceof w3s0) {
                    lValueOf = Long.valueOf(c4p1.t(playerState3));
                }
                setSingleton = Collections.singleton(new txt0(y6b1Var8, y6b1Var11, y6b1Var, jT3, j, arrayList, jT5, lValueOf, ((x3s0) o7h.A0(list2)).getEventId()));
            }
        }
        return Next.i(gyt0VarA, setSingleton);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(int i, String str, qim0 qim0Var, Function0 function0, Function0 function1, Function0 function2, boolean z, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        String strK;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        int i3 = i2 | (kk0.t(-1265205089, i, x340Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192) | (x340Var.i(function2) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                strK = x0d.k(x340Var, -386334623, 2131952084, x340Var, false);
            } else {
                x340Var.i0(908602046);
                x340Var.r(false);
                strK = null;
            }
            String str2 = strK;
            int iC = l1d.C(i);
            qim0 qim0Var4 = nim0.a;
            if (iC == 0) {
                qim0Var3 = qim0Var4;
                x340Var.i0(908681376);
                c97.a(cwl1.o0(x340Var, 2131952083), cwl1.n0(2131952082, new Object[]{str}, x340Var), qim0Var3, null, null, null, null, str2, function2, function1, x340Var, 384 | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), 120);
                x340Var.r(false);
            } else if (iC == 1) {
                qim0Var3 = qim0Var4;
                x340Var.i0(909172137);
                if (function0 == null || function1 == null) {
                    x340Var.i0(909460964);
                    c97.a(cwl1.o0(x340Var, 2131952079), cwl1.n0(2131952077, new Object[]{str}, x340Var), qim0Var3, null, null, null, null, null, null, function1, x340Var, 384 | ((i3 << 15) & 1879048192), 504);
                    x340Var.r(false);
                } else {
                    x340Var.i0(909222760);
                    int i4 = (i3 >> 3) & 14;
                    int i5 = i3 >> 6;
                    fq7.k(str, function0, function1, qim0Var3, x340Var, (i5 & 896) | i4 | (i5 & 112) | 3072, 0);
                    qim0Var3 = qim0Var3;
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -386330335, false);
                }
                x340Var.i0(909890500);
                c97.a(cwl1.o0(x340Var, 2131952087), cwl1.o0(x340Var, 2131952086), qim0Var4, null, null, null, null, str2, function2, function1, x340Var, 384 | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), 120);
                qim0Var3 = qim0Var4;
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(i, str, qim0Var2, function0, function1, function2, z, i2);
        }
    }

    public static final void b(float f, int i, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, b0k b0kVar, qim0 qim0Var) {
        j2i j2iVar4;
        j2i j2iVar5;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2130986633);
        int i2 = i | (b0kVar3.d(f) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar2;
            b0kVar2 = b0kVar3;
            cwl1.b(uyn1.B(dug.f(qim0Var, cbx.a(b0kVar3).a.a.a(), d4o1.a), 0.0f, 0.0f, 0.0f, f, 7), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2097329842, new p8e1(j2iVar4, j2iVar5, j2iVar3, (byte) 10), b0kVar3), b0kVar2, 0, 48, 2046);
        } else {
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar2;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fbe(j2iVar4, j2iVar5, j2iVar3, f, qim0Var, i);
        }
    }

    public static final void c(String str, ceo ceoVar, bwx bwxVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-599483642);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(ceoVar) ? 32 : 16) | (x340Var.i(bwxVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            eth.a(str, (qim0) null, irn1.o0(jfv.t(bwxVar.a, ngv.d), 0, ceoVar, 2), "Bottom sheet title", apo.r(962939972, new kk11(3, (byte) 14), x340Var), x340Var, (i2 & 14) | 27648, 2);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3j1(i, str, ceoVar, bwxVar, qim0Var2, (byte) 4);
        }
    }

    public static final void d(String str, String str2, float f, max maxVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1511227283);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.i(maxVar) ? 2048 : 1024) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarK = d9y0.k(qim0Var3, f);
            gdx gdxVarS = yla.s(x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                iu30Var2 = iu30Var;
                objT = new dnn(iu30Var2, (byte) 3);
                x340Var.s0(objT);
            } else {
                iu30Var2 = iu30Var;
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.h(new gbx(new y50(str2), function0), qim0VarK, maxVar, gdxVarS, null, null, apo.r(920683123, new avk1(str, (byte) 2), x340Var), x340Var, ((i2 >> 3) & 896) | 12582912, 112);
                qim0Var2 = qim0Var3;
            }
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j40(str, str2, f, maxVar, iu30Var2, qim0Var2, i);
        }
    }

    public static final void e(fwk1 fwk1Var, iu30 iu30Var, ng20 ng20Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1082338964);
        int i2 = i | (x340Var.g(fwk1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(ng20Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            j2i j2iVarR = apo.r(1445198739, new p8e1(fwk1Var, iu30Var, ng20Var, (byte) 11), x340Var);
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, null, null, null, j2iVarR, x340Var, 24582, 14);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3j1(i, fwk1Var, iu30Var, ng20Var, qim0Var2, (byte) 5);
        }
    }

    public static final void f(xhz xhzVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-293975756);
        int i2 = (x340Var.g(xhzVar) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (xhzVar.e) {
            x340Var.i0(-393293027);
            nyx.a(3, (wux) null, apo.r(1769641222, new dxk1(iu30Var, xhzVar, (byte) 4), x340Var), x340Var, 3078, 6);
            x340Var.r(false);
        } else {
            x340Var.i0(-392231122);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dxk1(xhzVar, iu30Var, i);
        }
    }

    public static final void g(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(399114643);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            xu30 xu30VarR = null;
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131956153);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            nim0 nim0Var = nim0.a;
            uwo1.e(strO0, uyn1.B(nim0Var, 16.0f, 0.0f, 0.0f, 16.0f, 6), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uvx uvxVar = new uvx(0, (pgx) null, 3, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 379);
            String strO1 = cwl1.o0(x340Var2, 2131956151);
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO1), function0);
            if (str == null) {
                x340Var2.i0(1791970106);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1791970107);
                xu30VarR = apo.r(295844055, new c2(str, z, (byte) 6), x340Var2);
                x340Var2.r(false);
            }
            jto1.b(qim0VarF, uvxVar, null, false, null, null, gbxVar, null, null, xu30VarR, null, null, tpi.a, null, null, apo.r(1840048845, new z3y(str2, (byte) 8), x340Var2), x340Var2, 64, 196992, 28092);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new br30(str, z, str2, function0, qim0Var, i);
        }
    }

    public static final void h(i260 i260Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        boolean z;
        String str;
        fra fraVar;
        c380 c380Var = i260Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(709454225);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(i260Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(ab80.o(nim0Var, f, x340Var, nim0Var, 1.0f), (fra) null, 3);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarZ);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(i260Var.c, u291.B(nim0Var, (gra) null, 3), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            if (i < 0 || i >= c380Var.size()) {
                z = true;
                x340Var.i0(-2035438441);
                x340Var.r(false);
            } else {
                x340Var.i0(-2036551279);
                String str2 = (String) c380Var.get(i);
                View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.TRUE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Integer numValueOf2 = Integer.valueOf(i);
                boolean zI = x340Var.i(ven0Var) | x340Var.i(view) | x340Var.g(str2);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    str = str2;
                    mxj1 mxj1Var = new mxj1(ven0Var, view, str, (lnm) null, (byte) 2);
                    fraVar = null;
                    x340Var.s0(mxj1Var);
                    objT2 = mxj1Var;
                } else {
                    str = str2;
                    fraVar = null;
                }
                qxd0.t(numValueOf2, x340Var, (vu30) objT2);
                qim0 qim0VarH = kx40.h(1.0f, u291.z(nim0Var, fraVar, 3), true);
                jw31 jw31VarA2 = ew31.a(h36.b, een.N0, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                jlx jlxVar = jlx.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                z = true;
                w0h1.a(jlxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).c.f, 0L, false, x340Var, jlx.d | 48, 48);
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(str, null, ktd.l(nim0Var, 6.0f, x340Var, x340Var).m, cbx.a(x340Var).c.f, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(i260Var, i, qim0Var, i2);
        }
    }

    public static final void i(c380 c380Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(244735152);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            zzq0 zzq0VarJ = uyn1.j(0.0f, cbx.b(x340Var).e.b, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                j2iVar3 = j2iVar;
                objT = new lz6(c380Var, j2iVar3, j2iVar2, (byte) 7);
                x340Var.s0(objT);
            } else {
                j2iVar3 = j2iVar;
            }
            ujo1.d(qim0Var, null, zzq0VarJ, false, null, null, null, false, null, (iu30) objT, x340Var, (i2 >> 9) & 14, 506);
        } else {
            j2iVar3 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l4c1(c380Var, j2iVar3, j2iVar2, qim0Var, i, (byte) 1);
        }
    }

    public static final void j(boolean z, String str, float f, max maxVar, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(400845562);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.i(maxVar) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            j2i j2iVar2 = vrj.a;
            gfx.g(4, apo.r(-1396364441, new fxk1(qim0Var, f, str, iu30Var, z, maxVar, j2iVar), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fxk1(z, str, f, maxVar, iu30Var, qim0Var, j2iVar, i);
        }
    }

    public static final void k(fwk1 fwk1Var, iu30 iu30Var, ng20 ng20Var, qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1713193820);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(fwk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ng20Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i3 |= x340Var.i(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            int i4 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || x340Var.E()) {
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                x340Var.s0(iu30Var);
                objT = iu30Var;
            }
            iu30 iu30Var2 = (iu30) objT;
            kiv kivVar = mde0.a;
            uo5 uo5Var = ((cwx) x340Var.k(kivVar)).a;
            bwx bwxVar = ((cwx) x340Var.k(kivVar)).b;
            tob1 tob1VarB = z95.b(fwk1Var.g() > 0 ? 1.0f : 0.0f, irn1.o0(jfv.t(bwxVar.a, ngv.d), 0, ((jhx) uo5Var.d).c, 2), "alpha value for hiding/showing bottom sheet CTA states", (iu30) null, x340Var, 3072, 20);
            f(fwk1Var.h, iu30Var2, x340Var, 48);
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, vzq0Var2.d(), 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(1088051588);
            i(mqo1.A(fwk1Var.f), apo.r(1063090595, new gxk1(fwk1Var, (byte) 0), x340Var), apo.r(1906014633, new sgi1(ng20Var, fwk1Var, (byte) 11), x340Var), kx40.h(1.0f, u291.f(qim0Var4, 1.0f), true), x340Var, 432);
            qim0 qim0VarB2 = u291.B(qim0Var4, (gra) null, 3);
            WeakHashMap weakHashMap = osl1.x;
            b(poo1.x(new bgc0(lhc.g(x340Var).e, 32), x340Var).a(), 438, apo.r(-1712108515, new pej1(fwk1Var, uo5Var, bwxVar, (byte) 11), x340Var), apo.r(543395294, new hxk1(fwk1Var, iu30Var2, tob1VarB, (byte) 0), x340Var), apo.r(-1496068193, new hxk1(fwk1Var, iu30Var2, tob1VarB, (byte) 1), x340Var), x340Var, qim0VarB2);
            x340Var = x340Var;
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 21, i, (Object) fwk1Var, (Object) ng20Var, (Object) vzq0Var2, iu30Var, qim0Var2);
        }
    }

    public static final void l(View view, hmb0 hmb0Var) {
        long jO = ((sh80) hmb0Var.e1.d).O(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jO >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jO & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    public static final float m(int i) {
        return i * (-1.0f);
    }

    public static final float n(float f) {
        return f * (-1.0f);
    }

    public static final int o(int i) {
        return i == 0 ? 1 : 2;
    }

    public static final Next p(long j, PlayerState playerState, PlayerState playerState2, y6b1 y6b1Var) {
        if (playerState2 != null) {
            return Next.i(new gyt0(y6b1Var, playerState, playerState2, z6x.a), Collections.singleton(new qxt0(y6b1Var, j)));
        }
        return Next.i(iyt0.a, Collections.singleton(new xxt0(0L, playerState, (PlayerState) null, y6b1Var)));
    }

    public static final void q(View view) {
        if (view instanceof o6) {
            ((o6) view).l();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                q(viewGroup.getChildAt(i));
            }
        }
    }

    public static apk0 r(Integer num, r6h1 r6h1Var) {
        return new apk0(num, r6h1Var);
    }

    public static final max s(fwk1 fwk1Var, x340 x340Var) {
        if (fwk1Var.g() > 0 && !fwk1Var.i) {
            x340Var.i0(1112076382);
            x340Var.r(false);
            return jax.a;
        }
        x340Var.i0(1112113861);
        hax haxVar = new hax(cwl1.o0(x340Var, 2131963824));
        x340Var.r(false);
        return haxVar;
    }

    public static final First t(jyt0 jyt0Var) {
        return First.b(jyt0Var);
    }

    public static final boolean u(PlayerState playerState, String str, long j) {
        if (str.equals(c4p1.w(playerState))) {
            return Math.abs(j - c4p1.t(playerState)) < 5000;
        }
        ContextTrack contextTrack = (ContextTrack) o7h.s0(playerState.nextTracks());
        if (!str.equals(contextTrack != null ? contextTrack.uri() : null)) {
            return false;
        }
        Long l = (Long) playerState.duration().h();
        return ((l != null ? l.longValue() : 0L) - c4p1.t(playerState)) + j < 5000;
    }

    public static final ArrayList v(GetSurfaceResponse getSurfaceResponse) {
        h290<FilterChip> h290VarN = getSurfaceResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (FilterChip filterChip : h290VarN) {
            arrayList.add(new k820(filterChip.n(), filterChip.getDisplayName(), filterChip.p() ? filterChip.o() : null));
        }
        return arrayList;
    }

    public static final dh90 w(ju7 ju7Var) {
        return new dh90(ju7Var.a());
    }

    public static final li90 x(clj1 clj1Var) {
        String str = clj1Var.a;
        int iC = l1d.C(clj1Var.b);
        if (iC == 0) {
            return new th90(str);
        }
        if (iC == 1) {
            return new uh90(Integer.valueOf((int) clj1Var.c), str, Integer.valueOf((int) clj1Var.d));
        }
        eg.o();
        return null;
    }

    public static final rvb1 y(GetStickerResponse getStickerResponse) {
        return z(getStickerResponse.n());
    }

    public static final rvb1 z(Sticker sticker) {
        exb1 fxb1Var;
        int iT = sticker.t();
        int i = iT == 0 ? -1 : zz21.a[l1d.C(iT)];
        if (i != -1) {
            if (i == 1) {
                fxb1Var = new fxb1(sticker.r().o(), sticker.r().q(), sticker.r().r() ? sticker.r().p() : null);
            } else if (i != 2) {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                fxb1Var = gxb1.a;
            } else {
                fxb1Var = exb1.a;
            }
        } else {
            fxb1Var = gxb1.a;
        }
        exb1 exb1Var = fxb1Var;
        return new rvb1(sticker.getStickerId(), sticker.q(), sticker.p(), exb1Var instanceof fxb1 ? ((fxb1) exb1Var).b : "", sticker.o(), exb1Var, sticker.s());
    }
}
