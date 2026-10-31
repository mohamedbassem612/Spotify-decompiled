package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.mixed.MaybeFlatMapObservable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hyy0 implements l6u0, f9z0, Function, SingleTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public hyy0(yqg yqgVar) {
        this.a = (byte) 6;
        this.b = yqgVar;
        this.c = new n36(10);
    }

    public static hyy0 i(String str) {
        Parcelable.Creator creator = iyy0.CREATOR;
        if (TextUtils.isEmpty(str)) {
            hhg1.n("An empty path was supplied.");
            return null;
        }
        if (!str.startsWith("/")) {
            hhg1.n("A path must start with a single / .");
            return null;
        }
        if (str.startsWith("//")) {
            hhg1.n("A path must start with a single / .");
            return null;
        }
        Uri uriBuild = new Uri.Builder().scheme("wear").path(str).build();
        zno1.F(uriBuild, "uri must not be null");
        return new hyy0(new iyy0(uriBuild, new Bundle(), (byte[]) null, 1800000L));
    }

    public void a(e9z0 e9z0Var, int i) throws IOException {
        int[] iArr = (int[]) this.c;
        try {
            e9z0Var.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            e9z0Var.close();
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 4:
                n811 n811Var = (n811) obj2;
                int i = n811Var.a;
                n811Var.a = i + 1;
                long j = 2 << (i <= 30 ? i : 30);
                if (j > 200) {
                    j = 200;
                }
                return Observable.timer(j, TimeUnit.SECONDS, (Scheduler) obj3);
            case 10:
                sp01 sp01Var = (sp01) obj2;
                return Collections.singletonMap(sp01Var.d.a, new sda(new ivd((List) obj, false, (el51) null, w7x.a, (r87) sp01Var.e).n((List) obj3)));
            case grn1.d /* 12 */:
                gx01 gx01Var = (gx01) obj2;
                gx01Var.getClass();
                return new CompletableFromAction(new dx01(gx01Var, (String) obj3, (byte) 1)).c(Completable.j((Throwable) obj));
            case 13:
                Map map = (Map) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!map.containsKey((String) it.next())) {
                            return MaybeEmpty.a;
                        }
                    }
                }
                List<kjf1> list = (List) obj3;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (kjf1 kjf1Var : list) {
                    String str = (String) map.get(kjf1Var.a);
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(kjf1.a(kjf1Var, str, (vw01) null, 191));
                }
                return Maybe.e(arrayList2);
            case 16:
                phi0 phi0Var = (phi0) obj2;
                return new MaybeFlatMapObservable(cwl1.e0(o6xVar, new j811(phi0Var, (String) obj3, (lnm) null, (byte) 0)), new pux0((YourLibraryContainsResponse) obj, phi0Var, (byte) 21));
            case 17:
                if (!((Boolean) obj).booleanValue()) {
                    Observable observableJust = Observable.just(btx0.a);
                    observableJust.getClass();
                    return observableJust;
                }
                yc80 yc80Var = (yc80) obj2;
                tqx0 tqx0Var = (tqx0) obj3;
                String str2 = tqx0Var.a;
                j23 j23Var = yc80Var.c;
                String str3 = tqx0Var.b;
                if (str2 == null || str2.length() == 0) {
                    int length = str3.length();
                    nf61 nf61Var = yc80Var.b;
                    return length > 0 ? nf61.b(nf61Var, j23Var.d(str3), (String) null, 30) : nf61.b(nf61Var, j23Var.a(), (String) null, 30);
                }
                phi0 phi0Var2 = yc80Var.d;
                String strC = mka.c(str2);
                mwm1 mwm1Var = (mwm1) phi0Var2.e;
                ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
                ssm1VarQ.q(strC);
                return mwm1Var.a(ssm1VarQ.build()).flatMapObservable(new hyy0((Object) phi0Var2, (Object) strC, (byte) 16)).onErrorReturnItem(atx0.a);
            case 18:
                k811 k811Var = (k811) obj2;
                Flowable flowable = (Flowable) k811Var.c;
                Completable completableFlatMapCompletable = new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new pux0(k811Var, (tv80) obj3, (byte) 23));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.o(Functions.h);
            default:
                mmr0 mmr0Var = (mmr0) obj;
                tqw tqwVar = (tqw) obj3;
                PlayerState playerState = (PlayerState) mmr0Var.a;
                Boolean bool = (Boolean) mmr0Var.b;
                ti11 ti11Var = (ti11) obj2;
                if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
                    return ti11Var.b.a(!playerState.options().shufflingContext()).ignoreElement();
                }
                if (bool.booleanValue()) {
                    return ti11Var.i.l(tqwVar != null ? n3o1.y(tqwVar) : null).h(mux0.O0).o(Functions.h);
                }
                return yoi1.i(ti11Var.X.d(), o6xVar).firstOrError().onErrorReturn(pdx0.f).flatMapCompletable(new k811(ti11Var, tqwVar, playerState, (byte) 5));
        }
    }

    public void b(int i, String str, b0k b0kVar, iu30 iu30Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1542615722);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            i3u i3uVar = new i3u(4, true, true, false);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new dv11(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            mqo1.e((Function0) objT, i3uVar, null, ycj.a, apo.r(-737138103, new p9y0(str, (byte) 16), x340Var), apo.r(-1152464920, new iuy0(iu30Var, (byte) 6), x340Var), null, x340Var, 224256, 68);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(this, iu30Var, str, i, (byte) 25);
        }
    }

    public Single c(Single single) {
        return ((x020) this.b) == x020.b ? single.timeout(7000L, TimeUnit.MILLISECONDS, ((vz11) this.c).a) : single;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01df  */
    public void d(agc0 agc0Var, String str, boolean z, boolean z2, c380 c380Var, m87 m87Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        g17 l07Var;
        hy81 hy81Var;
        boolean z3;
        boolean z4;
        l07 g17Var;
        i3h i3hVar = (i3h) this.c;
        gw70 gw70Var = (gw70) this.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(582019488);
        int i2 = i | (x340Var2.i(agc0Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.h(z2) ? 2048 : 1024) | (x340Var2.g(c380Var) ? 16384 : 8192) | (x340Var2.g(m87Var) ? 131072 : 65536) | (x340Var2.i(iu30Var) ? 1048576 : 524288) | (x340Var2.i(this) ? 8388608 : 4194304);
        int i3 = 4793491 & i2;
        boolean z5 = false;
        if (x340Var2.Y(i2 & 1, i3 != 4793490)) {
            boolean z6 = eyo1.p(str) && !z;
            boolean z7 = (i2 & 3670016) == 1048576;
            Object objT = x340Var2.T();
            if (z7 || objT == m4cVar) {
                objT = new fr01(iu30Var, (byte) 0);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(nim0.a, false, null, null, null, (Function0) objT, 15);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = mm01.Z0;
                x340Var2.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT2);
            if (z6 || c380Var.size() <= 1) {
                x340Var = x340Var2;
                x340Var.i0(160485300);
                ft01 ft01Var = (ft01) o7h.s0(c380Var);
                String str2 = ft01Var != null ? ft01Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (z2) {
                    l07Var = new l07(new g07(str2), false);
                } else if (sua.s(ft01Var != null ? ft01Var.b : null)) {
                    l07Var = new l07(new g07(str2), false);
                } else {
                    l07Var = new g17(new g07(str2));
                }
                hy81 hy81Var2 = new hy81(new j47(l07Var), m87Var);
                boolean zI = x340Var.i(i3hVar);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    hy81Var = hy81Var2;
                    v3v0 v3v0Var = new v3v0(1, i3hVar, g3h.class, "getDrawable", "getDrawable(Lcom/spotify/recents/recentsmodels/DestinationArtworkModel$CollectionType;)Landroid/graphics/drawable/Drawable;", 0, (byte) 16);
                    x340Var.s0(v3v0Var);
                    objT3 = v3v0Var;
                } else {
                    hy81Var = hy81Var2;
                }
                sap1.b(hy81Var, gw70Var, (iu30) objT3, null, x340Var, 8);
                x340Var.r(false);
            } else {
                x340Var2.i0(160141293);
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                int i4 = 0;
                for (Object obj : c380Var) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ft01 ft01Var2 = (ft01) obj;
                    if (i4 == 0) {
                        if (sua.s(ft01Var2.b)) {
                            g17Var = new l07(new g07(ft01Var2.a), false);
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        arrayList.add(g17Var);
                        z5 = z4;
                        gw70Var = gw70Var;
                        i4 = i5;
                    } else {
                        z4 = z5;
                    }
                    g17Var = new g17(new g07(ft01Var2.a, yz6.d));
                    arrayList.add(g17Var);
                    z5 = z4;
                    gw70Var = gw70Var;
                    i4 = i5;
                }
                gw70 gw70Var2 = gw70Var;
                boolean z8 = z5;
                eab1 eab1Var = new eab1(mqo1.A(arrayList), m87Var);
                boolean zI2 = x340Var2.i(i3hVar);
                Object objT4 = x340Var2.T();
                if (zI2 || objT4 == m4cVar) {
                    z3 = z8;
                    v3v0 v3v0Var2 = new v3v0(1, i3hVar, g3h.class, "getDrawable", "getDrawable(Lcom/spotify/recents/recentsmodels/DestinationArtworkModel$CollectionType;)Landroid/graphics/drawable/Drawable;", 0, (byte) 15);
                    x340Var2.s0(v3v0Var2);
                    objT4 = v3v0Var2;
                } else {
                    z3 = z8;
                }
                rrn1.s(eab1Var, gw70Var2, (iu30) objT4, qim0VarB, x340Var2, 8, 0);
                x340Var = x340Var2;
                x340Var.r(z3);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m8m(this, agc0Var, str, z, z2, c380Var, m87Var, iu30Var, i);
        }
    }

    public void e(ney0 ney0Var, idd1 idd1Var, agc0 agc0Var, ycm ycmVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        ycm ycmVar2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-720734934);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ney0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(idd1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(agc0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ycmVar2 = ycmVar;
            i2 |= x340Var.i(ycmVar2) ? 2048 : 1024;
        } else {
            ycmVar2 = ycmVar;
        }
        if ((i & 24576) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            mod.b(oi7.a.a((gw70) this.b), apo.r(-1878599574, new hr01(ney0Var, iu30Var2, this, agc0Var, idd1Var, ycmVar2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(this, ney0Var, idd1Var, agc0Var, ycmVar, iu30Var, i, (byte) 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    public void f(String str, String str2, k221 k221Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        k221 k221Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar;
        ?? r14;
        w131 w131Var = k221Var.i;
        m0u m0uVar = k221Var.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1235124230);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(k221Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(this) ? 131072 : 65536;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (74899 & i4) != 74898)) {
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                yqg yqgVar = (yqg) ((r221) ((kp5) ((hoq) this.b).a.c).a).j.get();
                c8o.l(yqgVar);
                a221 a221Var = new a221(yqgVar, iu30Var);
                b0kVar3.s0(a221Var);
                objT = a221Var;
            }
            a221 a221Var2 = (a221) objT;
            i6o0 i6o0VarQ = k1o1.q(b0kVar3);
            qim0Var2 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var2, i6o0VarQ, (g6o0) null);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarL);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int i5 = i4 >> 9;
            g(((i4 >> 3) & 14) | (i5 & 896), str2, b0kVar3, null);
            rqo1.g(0, 1, b0kVar3, null);
            qim0 qim0VarZ = u291.z(qim0Var2, (fra) null, 3);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(b0kVar3).g, 32), b0kVar3);
            boolean zI = ((i4 & 14) == 4) | b0kVar3.i(k221Var) | b0kVar3.i(this) | b0kVar3.i(a221Var2);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar2) {
                m4cVar = m4cVar2;
                vvu0 vvu0Var = new vvu0(k221Var, this, a221Var2, str, (byte) 17);
                b0kVar3.s0(vvu0Var);
                objT2 = vvu0Var;
            } else {
                m4cVar = m4cVar2;
            }
            m4c m4cVar3 = m4cVar;
            s3o1.d(qim0VarZ, null, vk80VarX, null, null, null, false, null, (iu30) objT2, b0kVar3, 0, 506);
            b0kVar3.r(true);
            if (m0uVar != null) {
                b0kVar3.i0(602546989);
                String str3 = m0uVar.c.a;
                boolean z = m0uVar.f;
                int i6 = i4 & 7168;
                boolean zI2 = b0kVar3.i(k221Var2) | (i6 == 2048);
                Object objT3 = b0kVar3.T();
                if (zI2 || objT3 == m4cVar3) {
                    objT3 = new zkz0(iu30Var, k221Var, (byte) 26);
                    b0kVar3.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean z2 = i6 == 2048;
                Object objT4 = b0kVar3.T();
                if (z2 || objT4 == m4cVar3) {
                    objT4 = new dv11(iu30Var, (byte) 7);
                    b0kVar3.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                b0kVar2 = b0kVar3;
                r14 = 0;
                w6p1.e(str3, z, function0, function1, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                r14 = 0;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(602961180);
                b0kVar2.r(false);
            }
            if (k221Var2.f) {
                b0kVar2.i0(603002813);
                ?? r19 = (i4 & 7168) != 2048 ? r14 : 1;
                Object objT5 = b0kVar2.T();
                if (r19 != 0 || objT5 == m4cVar3) {
                    objT5 = new dv11(iu30Var, (byte) 8);
                    b0kVar2.s0(objT5);
                }
                qtg.b((Function0) objT5, b0kVar2, r14);
                b0kVar2.r((boolean) r14);
            } else {
                b0kVar2.i0(603124860);
                b0kVar2.r((boolean) r14);
            }
            if (k221Var2.g && (w131Var instanceof w131)) {
                b0kVar2.i0(603202639);
                b(i5 & 910, w131Var.a, b0kVar2, iu30Var);
                b0kVar2.r((boolean) r14);
            } else {
                b0kVar2.i0(603276636);
                b0kVar2.r((boolean) r14);
            }
        } else {
            k221Var2 = k221Var;
            this = this;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 23, i, this, str, str2, k221Var2, iu30Var, qim0Var2, false);
        }
    }

    public void g(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1792930776);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var2 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var2, new uvx((pgx) null, 0, (tvx) null, (p3v) null, 31), null, false, null, null, null, null, null, null, null, null, null, null, null, apo.r(1527508588, new iww0(str, (byte) 7), b0kVar3), b0kVar2, ((i3 >> 3) & 14) | 64, 196608, 32764);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(this, str, qim0Var2, i, (byte) 26);
        }
    }

    public iyy0 h() {
        vzq vzqVar = (vzq) this.c;
        ArrayList arrayList = new ArrayList();
        tbp1 tbp1VarP = len1.p();
        HashMap map = vzqVar.a;
        TreeSet<String> treeSet = new TreeSet(map.keySet());
        ArrayList arrayList2 = new ArrayList();
        for (String str : treeSet) {
            Object obj = map.get(str);
            xdp1 xdp1VarP = kdn1.p();
            xdp1VarP.d();
            ((kdn1) xdp1VarP.b).q(str);
            vcn1 vcn1VarO = j2h1.O(obj, arrayList);
            xdp1VarP.d();
            ((kdn1) xdp1VarP.b).r(vcn1VarO);
            arrayList2.add((kdn1) xdp1VarP.e());
        }
        tbp1VarP.d();
        ((len1) tbp1VarP.b).q(arrayList2);
        len1 len1Var = (len1) tbp1VarP.e();
        iyy0 iyy0Var = (iyy0) this.b;
        try {
            int iH = len1Var.h();
            byte[] bArr = new byte[iH];
            vun1 vun1Var = new vun1(bArr, iH);
            r6o1 r6o1VarB = w5o1.c.b(len1Var.getClass());
            y1t0 y1t0Var = vun1Var.a;
            if (y1t0Var == null) {
                y1t0Var = new y1t0(vun1Var);
            }
            r6o1VarB.c(len1Var, y1t0Var);
            int i = vun1Var.c;
            int i2 = vun1Var.d;
            if (i - i2 > 0) {
                eg.m("Did not write as much data as expected.");
            } else if (i - i2 < 0) {
                eg.m("Wrote more data than expected.");
            }
            iyy0Var.c = bArr;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                String string = Integer.toString(i3);
                Asset asset = (Asset) arrayList.get(i3);
                if (string == null) {
                    eg.m("asset key cannot be null: ".concat(String.valueOf(asset)));
                    return null;
                }
                if (asset == null) {
                    eg.m("asset cannot be null: key=".concat(string));
                    return null;
                }
                if (Log.isLoggable("DataMap", 3)) {
                    new StringBuilder(string.length() + 33 + asset.toString().length());
                }
                iyy0Var.b.putParcelable(string, asset);
            }
            return iyy0Var;
        } catch (IOException e) {
            String name = len1.class.getName();
            bhn0.o(l1d.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public Object j(onm onmVar) {
        return ((y011) this.c).b(new l8t0(this, (lnm) null, (byte) 7), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, String str2, onm onmVar) {
        nn21 nn21Var;
        if (onmVar instanceof nn21) {
            nn21Var = (nn21) onmVar;
            int i = nn21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn21Var.c = i - Integer.MIN_VALUE;
            } else {
                nn21Var = new nn21(this, onmVar);
            }
        } else {
            nn21Var = new nn21(this, onmVar);
        }
        Object objY = nn21Var.a;
        int i2 = nn21Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            q8n q8nVar = (q8n) this.b;
            m311 m311Var = new m311(this, str, str2, (lnm) null, (byte) 16);
            nn21Var.c = 1;
            objY = fn31.Y(q8nVar, m311Var, nn21Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((xv3) objY).a;
    }

    public void l(ArrayList arrayList, iu30 iu30Var) {
        i501 i501VarA = ((uww0) this.c).a();
        th30 th30Var = (th30) this.b;
        i501VarA.a2 = arrayList;
        i501VarA.b2 = iu30Var;
        i501VarA.g1(th30Var, (String) null);
    }

    public hyy0(iyy0 iyy0Var) {
        this.a = (byte) 0;
        this.b = iyy0Var;
        this.c = new vzq();
    }

    public /* synthetic */ hyy0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public hyy0(ykq ykqVar) {
        this.a = (byte) 2;
        this.b = ykqVar;
        this.c = new h7l0((byte) 23);
    }

    public hyy0(String str, i8h1 i8h1Var) {
        this.a = (byte) 28;
        this.b = i8h1Var;
        this.c = new urk0(str, (byte) 1);
    }

    public hyy0(gw70 gw70Var, sua suaVar, i3h i3hVar) {
        this.a = (byte) 11;
        this.b = gw70Var;
        this.c = i3hVar;
    }

    public void apply(long j) {
        TreeMap treeMap = (TreeMap) this.b;
        Set setKeySet = treeMap.keySet();
        ArrayList<Long> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Long) obj).longValue() <= j) {
                arrayList.add(obj);
            }
        }
        d0z0 d0z0Var = (d0z0) this.c;
        for (Long l : arrayList) {
            co0 co0Var = (co0) treeMap.remove(l);
            l.getClass();
            xu0 xu0Var = d0z0Var.u1;
            if (co0Var != null) {
                t0u0.X(d0z0Var, d0z0Var.w1, co0Var, xu0Var.a, l, null, xu0Var.c, 8);
            }
        }
    }
}
