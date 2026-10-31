package p;

import android.content.Intent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mdata.cosmos.proto.InvalidateCacheRequest;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorNext;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bm00 implements Function, k2r, ObservableOnSubscribe, hs31 {
    public final /* synthetic */ byte a;
    public Object b;

    public bm00(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.b = new nr30(5, 1.0f, false);
                break;
            default:
                this.b = new cm00();
                break;
        }
    }

    public static ri40 l(bm00 bm00Var, lby lbyVar, ji40 ji40Var, d8r0 d8r0Var, String str, int i) {
        return new ri40(lbyVar.a, lbyVar.b, tb51.i((tb51) bm00Var.b, lbyVar, false, false, 6), lbyVar.c, str, d8r0Var, i, (Integer) null, (String) null, lbyVar.g);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void a(yzm yzmVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        String strU;
        int i2;
        int i3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1194543136);
        int i4 = i | (x340Var2.i(yzmVar) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.g(this) ? 256 : 128);
        if (x340Var2.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (yzmVar instanceof uzm) {
                x340Var2.i0(-860204579);
                int i5 = ((uzm) yzmVar).a;
                if (i5 != 0) {
                    if (i5 != 1) {
                        x340Var2.i0(-819003302);
                        strU = cwl1.U(2131820746, i5, new Object[]{Integer.valueOf(i5)}, x340Var2);
                        x340Var2.r(false);
                    } else {
                        i2 = -819006142;
                        i3 = 2131958292;
                    }
                    x340Var2.r(false);
                } else {
                    i2 = -819008482;
                    i3 = 2131958291;
                }
                strU = x0d.k(x340Var2, i2, i3, x340Var2, false);
                x340Var2.r(false);
            } else if (yzmVar instanceof vzm) {
                x340Var2.i0(-860202787);
                int i6 = ((vzm) yzmVar).a;
                if (i6 == 1) {
                    strU = x0d.k(x340Var2, -2061879289, 2131958288, x340Var2, false);
                } else {
                    x340Var2.i0(-2061876371);
                    strU = cwl1.U(2131820747, i6, new Object[]{Integer.valueOf(i6)}, x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else if (yzmVar instanceof wzm) {
                x340Var2.i0(-860201027);
                int i7 = ((wzm) yzmVar).a;
                if (i7 == 1) {
                    strU = x0d.k(x340Var2, 947028694, 2131958289, x340Var2, false);
                } else {
                    x340Var2.i0(947031537);
                    strU = cwl1.U(2131820748, i7, new Object[]{Integer.valueOf(i7)}, x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else {
                if (!(yzmVar instanceof xzm)) {
                    throw p3d1.k(x340Var2, -860206112, false);
                }
                x340Var2.i0(-860199267);
                int i8 = ((xzm) yzmVar).a;
                if (i8 == 1) {
                    strU = x0d.k(x340Var2, -876521121, 2131958290, x340Var2, false);
                } else {
                    x340Var2.i0(-876518278);
                    strU = cwl1.U(2131820749, i8, new Object[]{Integer.valueOf(i8)}, x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            }
            uwr uwrVar = cbx.a;
            uwo1.e(strU, uyn1.B(u291.f(nim0.a, 1.0f), 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50(this, yzmVar, qim0Var, i, (byte) 9);
        }
    }

    public Object apply(Object obj) {
        ws60 ws60Var;
        Object obj2;
        int i = 2;
        switch (this.a) {
            case 1:
                String str = (String) obj;
                hj91 hj91Var = (ki91) ((g710) this.b).h.get();
                str.getClass();
                return hj91Var.d(str);
            case 6:
                tfs0 tfs0Var = (tfs0) obj;
                e71 e71Var = new e71((td30) this.b, tfs0Var, (byte) 8);
                int i2 = Flowable.a;
                return new FlowableOnErrorNext(new FlowableFromCallable(e71Var), new wb00(tfs0Var, (byte) 6));
            case 7:
                return ((Flowable) ((dxy) this.b).d).z().map(new wb00((gru) obj, (byte) 7));
            case 10:
                int iOrdinal = ((fbl) obj).ordinal();
                if (iOrdinal == 0) {
                    hgo hgoVar = (hgo) this.b;
                    return ((Observable) ((na) hgoVar.c).invoke()).flatMapSingle(new wb00(hgoVar, (byte) 10));
                }
                if (iOrdinal != 1) {
                    return iOrdinal != 2 ? Observable.just(new ac20(vwt.d)) : Observable.just(new ac20(rwt.d));
                }
                return Observable.just(new ac20(uwt.d));
            case 15:
                sy21 sy21Var = (sy21) obj;
                if (sy21Var.a.Q0 && (obj2 = sy21Var.b) != null) {
                    return new du60((w47) obj2);
                }
                uz21 uz21Var = sy21Var.c;
                kv60 kv60VarB = uz21Var != null ? ut60.b(uz21Var, (nfa0) this.b) : null;
                if (kv60VarB != null) {
                    String str2 = kv60VarB.b;
                    if (u890.j(str2, "NOT_IN_SESSION")) {
                        i = 1;
                    } else if (!u890.j(str2, "NOT_LISTEN_ALONG")) {
                        i = 3;
                    }
                    ws60Var = new ws60(i);
                } else {
                    ws60Var = new ws60(3);
                }
                return new cu60(ws60Var);
            case 18:
                yc80 yc80Var = (yc80) this.b;
                return yc80Var.e.take(1L).flatMap(new ro30(yc80Var, (jqx0) obj, (byte) 22)).onErrorReturnItem(atx0.a);
            case 20:
                spq0 spq0Var = (spq0) obj;
                p410 p410Var = (p410) this.b;
                p410Var.getClass();
                String strJ = spq0Var.c() ? ((l0l) spq0Var.b()).j() : "";
                i8h1 i8h1Var = (i8h1) p410Var.b;
                x6h1 x6h1VarC = ((dsk0) p410Var.g).b.c();
                x6h1VarC.i.add(new a7h1("play_on_device_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ou80 ou80Var = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", strJ != null ? strJ : "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
                if (!spq0Var.c() || ((l0l) spq0Var.b()).l()) {
                    return Single.just(ou80Var);
                }
                zor.i((zor) p410Var.c, ou80Var.a, 6);
                return ((g0l) p410Var.d).d().filter(eh10.g).firstOrError().timeout(10L, TimeUnit.SECONDS, (Scheduler) p410Var.f).map(new wb00(ou80Var, (byte) 19));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Completable.u(((Duration) obj).toMillis(), TimeUnit.MILLISECONDS, (Scheduler) ((haa0) this.b).b);
            case 24:
                li8 li8Var = (mi8) obj;
                if (!(li8Var instanceof li8)) {
                    return CompletableEmpty.a;
                }
                zmj0 zmj0Var = ((wza0) this.b).k;
                ac90 ac90VarP = InvalidateCacheRequest.p();
                ac90VarP.n(Collections.singletonList("spotify:user:" + li8Var.a.a));
                ac90VarP.r(hz00.Q0);
                return zmj0Var.callSingle("spotify.mdata_esperanto.proto.MetadataService", "Expire", ac90VarP.build()).map(e710.P0).ignoreElement();
            case 27:
                q0c0 q0c0Var = (q0c0) obj;
                t0c0 t0c0Var = (t0c0) this.b;
                ArrayList arrayList = new ArrayList();
                if (q0c0Var.b) {
                    arrayList.add(t0c0Var.g);
                }
                if (q0c0Var.a) {
                    arrayList.add(t0c0Var.h);
                }
                if (q0c0Var.d) {
                    arrayList.add(t0c0Var.i);
                }
                if (q0c0Var.c) {
                    arrayList.add(t0c0Var.j);
                }
                return o7h.l1(arrayList);
            default:
                return new scc0(false, (nq6) this.b, ((List) obj).size());
        }
    }

    public void b(zzm zzmVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        e0n e0nVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-865336051);
        int i2 = i | (x340Var.i(zzmVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(zzmVar.a);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                n6q n6qVar = (n6q) this.b;
                z720 z720Var = new z720(iu30Var, (byte) 23);
                switch (n6qVar.a) {
                    case 0:
                        e0nVar = new e0n(z720Var);
                        break;
                    default:
                        e0nVar = new e0n(z720Var);
                        break;
                }
                objT = e0nVar;
                x340Var.s0(objT);
            }
            otw.c((e0n) objT, new d0n(zzmVar), qim0Var, (ipb1) null, x340Var, i2 & 896, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60((byte) 4, i, this, zzmVar, iu30Var, qim0Var);
        }
    }

    public void c(xh60 xh60Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(715804282);
        int i2 = (i & 6) == 0 ? (x340Var.i(xh60Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            c380<mmr0> c380Var = xh60Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            for (mmr0 mmr0Var : c380Var) {
                yzm yzmVar = (yzm) mmr0Var.a;
                c380 c380Var2 = (c380) mmr0Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : c380Var2) {
                    if (!xh60Var.b.contains(((zzm) obj).a)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.add(new mmr0(yzmVar, mqo1.A(arrayList2)));
            }
            ArrayList<mmr0> arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((c380) ((mmr0) obj2).b).isEmpty()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (mmr0 mmr0Var2 : arrayList3) {
                yzm yzmVar2 = (yzm) mmr0Var2.a;
                c380 c380Var3 = (c380) mmr0Var2.b;
                List listSingletonList = Collections.singletonList(new oi60(yzmVar2));
                ArrayList arrayList5 = new ArrayList(q7h.U(c380Var3, 10));
                Iterator it = c380Var3.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new pi60((zzm) it.next()));
                }
                r7h.W(o7h.N0(arrayList5, listSingletonList), arrayList4);
            }
            c380 c380VarA = mqo1.A(arrayList4);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean zI = x340Var.i(c380VarA) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var.i(this))) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new lb50((Object) c380VarA, (Object) this, (Object) iu30Var, (byte) 6);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarD, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 510);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(this, xh60Var, iu30Var, i);
        }
    }

    public void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-722568066);
        int i2 = i | 6;
        byte b = 1;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 8.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(h2c.a.a(qim0Var2, een.h), 0, 0L, 0L, x340Var, 0, 14);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(this, qim0Var, i, b);
        }
    }

    public void e(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-354140297);
        int i2 = i | (b0kVar2.i(iu30Var) ? 4 : 2) | (b0kVar2.i(qim0Var) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar2, 2131958286);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            pm31 pm31Var = new pm31(0);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new u460(iu30Var, (byte) 8);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarF2 = dug.f(bin.x(qim0VarF, false, strO0, pm31Var, (idn0) null, (Function0) objT, 9), u7h.j, d4o1.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 12.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            lee1 lee1Var = cbx.d(b0kVar2).g;
            String strO1 = cwl1.o0(b0kVar2, 2131958285);
            cjc0 cjc0Var = new cjc0(1);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(strO1, uyn1.B(wnb0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar2, 0, 0, 1720);
            plx plxVar = plx.c;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            b0kVar2 = b0kVar2;
            w0h1.a(plxVar, isl.a, u291.r(nim0.a, 16.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, plx.d | 48, 48);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50(this, iu30Var, qim0Var, i, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void f(zh60 zh60Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(516114837);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zh60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(nim0.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (zh60Var instanceof wh60) {
            x340Var.i0(-405699445);
            x340Var.r(false);
        } else if (zh60Var instanceof xh60) {
            x340Var.i0(2065123645);
            c((xh60) zh60Var, iu30Var, x340Var, i2 & 8190);
            x340Var.r(false);
        } else {
            if (!zh60Var.equals(yh60.a)) {
                throw p3d1.k(x340Var, 2065121980, false);
            }
            x340Var.i0(2065125477);
            d(null, x340Var, (i2 >> 6) & 112);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(this, zh60Var, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(onm onmVar) {
        az10 az10Var;
        if (onmVar instanceof az10) {
            az10Var = (az10) onmVar;
            int i = az10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                az10Var.c = i - Integer.MIN_VALUE;
            } else {
                az10Var = new az10(this, onmVar);
            }
        } else {
            az10Var = new az10(this, onmVar);
        }
        Object objA = az10Var.a;
        int i2 = az10Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                fpu fpuVar = (fpu) this.b;
                az10Var.c = 1;
                objA = fpuVar.a(az10Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return new n4y((bpu) objA);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return t4y.a;
        }
    }

    public cm00 h() {
        return (cm00) this.b;
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        nv60 nv60Var;
        String str;
        ru9 ru9Var = (ru9) this.b;
        ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
        ou80 ou80Var = serializableExtra instanceof ou80 ? serializableExtra : null;
        boolean zHasExtra = intent.hasExtra("push_data");
        iw60 iw60Var = (iw60) ru9Var.c;
        String str2 = ou80Var != null ? ou80Var.a : null;
        if (zHasExtra) {
            vjq0 vjq0Var = (vjq0) ila0.s(intent, "push_data", vjq0.class);
            if (vjq0Var == null || (str = vjq0Var.d) == null) {
                str = "";
            }
            nv60Var = new nv60(str);
        } else {
            nv60Var = mv60.a;
        }
        iw60Var.a(str2, nv60Var);
    }

    public o2r j() {
        s320 s320Var = new s320(false);
        yeg1 yeg1Var = (yeg1) this.b;
        if (yeg1Var != null) {
            s320Var.a(yeg1Var);
        }
        return s320Var;
    }

    public Observable k() {
        return ((o241) this.b).a("graduation-status", "INELIGIBLE").map(vf61.U0).onErrorReturnItem(xa50.a);
    }

    public ri40 m(lby lbyVar, d8r0 d8r0Var, String str, int i) {
        o940 o940Var = lbyVar.g;
        return new ri40(lbyVar.a, lbyVar.b, (o940Var != null ? o940Var.b : null) == k940.b ? tb51.i((tb51) this.b, lbyVar, false, false, 6) : "", lbyVar.c, str, d8r0Var, i, (Integer) null, (String) null, lbyVar.g);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public int n(m210 m210Var, blc0 blc0Var) {
        Object next;
        o2s o2sVar;
        boolean zJ;
        o2s o2sVar2 = o2s.b;
        if (m210Var != null) {
            Iterator it = ((Set) this.b).iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    switch (((o2s) next).a) {
                        case 0:
                            zJ = true;
                            break;
                        default:
                            zJ = u890.j(m210Var.f, "widget");
                            break;
                    }
                } else {
                    next = null;
                }
                o2sVar = (o2s) next;
                if (o2sVar != null) {
                    o2sVar2 = o2sVar;
                }
            } while (!zJ);
            o2sVar = (o2s) next;
            if (o2sVar != null) {
                o2sVar2 = o2sVar;
            }
        }
        switch (o2sVar2.a) {
            case 0:
                int iOrdinal = blc0Var.ordinal();
                if (iOrdinal == 44) {
                    return 1;
                }
                if (iOrdinal != 860) {
                    return 3;
                }
                break;
            default:
                if (zol1.a[blc0Var.ordinal()] == 1) {
                    return 1;
                }
                break;
        }
        return 2;
    }

    public void o(String str) {
        ((cm00) this.b).b = str;
    }

    public void p(String str) {
        ((cm00) this.b).a = str;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        fn70 fn70Var = new fn70(observableEmitter, (byte) 0);
        en70 en70Var = (en70) this.b;
        observableEmitter.onNext(spq0.a(en70Var.a()));
        observableEmitter.setCancellable(new pc6(en70Var, fn70Var, (byte) 7));
        en70Var.d(fn70Var);
    }

    public /* synthetic */ bm00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public bm00(cua cuaVar, t2b t2bVar) {
        this.a = (byte) 13;
        this.b = cuaVar;
    }

    public bm00(ConstraintLayout constraintLayout, EncoreButton encoreButton, EncoreButton encoreButton2, TextView textView, TextView textView2) {
        this.a = (byte) 11;
        this.b = constraintLayout;
    }
}
