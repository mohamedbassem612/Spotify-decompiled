package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kp5 implements s8b1, dl4, Function {
    public static final y1x0 i = new y1x0((byte) 28);
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;

    public kp5(ap4 ap4Var, u9c0 u9c0Var, List list) {
        this.a = ap4Var;
        this.b = u9c0Var;
        this.c = list;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            r2g r2gVar = (r2g) obj;
            arrayList.add(new x010(r2gVar.getShow(), r2gVar.g(), new z2g(i2, (lnm) null), (byte) 1));
            i2 = i3;
        }
        int i4 = hu20.a;
        xe01 xe01VarT = d5p1.t(rqt0.u(new h6a(new ipr(b7x.a, new kge(arrayList), new l2(3, (lnm) null, (byte) 23), (byte) 16), (byte) 2)), (u9c0) this.b, ey71.a(3), (Object) null);
        xe01 xe01VarT2 = d5p1.t(rqt0.u(new d3g(new any(xe01VarT, (byte) 18), this, (byte) 0)), (u9c0) this.b, ey71.a(3), (Object) null);
        this.d = rqt0.u(new h6a(new any(xe01VarT2, (byte) 18), (byte) 3));
        this.e = rqt0.u(new d3g(new any(xe01VarT2, (byte) 18), this, (byte) 1));
        this.f = rqt0.u(new d3g(new any(xe01VarT, (byte) 18), this, (byte) 2));
        this.g = d5p1.t(new x72(new any(xe01VarT2, (byte) 18), (byte) 13), (u9c0) this.b, ey71.a(3), Boolean.FALSE);
        this.h = d5p1.t(rqt0.u(new d3g(new any(xe01VarT2, (byte) 18), this, (byte) 3)), (u9c0) this.b, ey71.a, z6x.a);
    }

    public static Completable A(kp5 kp5Var, qs91 qs91Var) {
        Single singleJust;
        Context context = (Context) kp5Var.a;
        if (qs91Var.equals(e2x0.P0)) {
            return kp5Var.y(context.getString(2131952249));
        }
        if (qs91Var instanceof hs91) {
            return kp5Var.u(((hs91) qs91Var).a).flatMapCompletable(new vun(kp5Var, (byte) 20));
        }
        if (qs91Var instanceof is91) {
            String str = ((is91) qs91Var).a;
            kp5 kp5Var2 = (kp5) kp5Var.f;
            ((agc0) kp5Var2.f).getClass();
            if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
                singleJust = Single.just((blt) ((idd1) kp5Var2.g).getValue());
            } else {
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str);
                v5b1 v5b1Var = s4b1VarX.d;
                b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
                if (u890.j(type, wyu0.f) || u890.j(type, nyu0.e)) {
                    singleJust = rqt0.F(o6x.a, new n5s(kp5Var2, str, (lnm) null, (byte) 19)).map(j561.Z0);
                } else {
                    blc0 blc0Var = s4b1VarX.c;
                    int iOrdinal = blc0Var.ordinal();
                    singleJust = (iOrdinal == 180 || iOrdinal == 208 || iOrdinal == 209) ? Single.just((blt) ((idd1) kp5Var2.h).getValue()) : ((eny) kp5Var2.e).a(str, blc0Var).map(uh21.Z0);
                }
            }
            return singleJust.timeout(200L, TimeUnit.MILLISECONDS, Single.error(new TimeoutException())).onErrorReturnItem(new blt("", (alt) null)).flatMapCompletable(new hur(qs91Var, kp5Var, (byte) 18));
        }
        if (qs91Var instanceof os91) {
            Set set2 = s4b1.f;
            String str2 = ((os91) qs91Var).a;
            if (uic.g(str2, blc0.de)) {
                return kp5Var.y(context.getString(2131952252));
            }
            Completable completableFlatMapCompletable = kp5Var.u(str2).flatMapCompletable(new qmr(kp5Var, (byte) 10));
            completableFlatMapCompletable.getClass();
            return completableFlatMapCompletable;
        }
        if (qs91Var instanceof ms91) {
            return kp5Var.y(context.getString(2131952240));
        }
        if (qs91Var instanceof ns91) {
            return kp5Var.y(context.getString(2131952251));
        }
        if (qs91Var instanceof js91) {
            return kp5Var.y(context.getString(2131952242));
        }
        if (qs91Var instanceof ks91) {
            return kp5Var.y(context.getString(2131952247));
        }
        if (qs91Var instanceof ls91) {
            return kp5Var.y(context.getString(2131952250));
        }
        if (qs91Var instanceof ps91) {
            return kp5Var.y(context.getString(2131952254));
        }
        eg.o();
        return null;
    }

    public static final /* synthetic */ fai0 k(kp5 kp5Var) {
        return (fai0) kp5Var.g;
    }

    public ArrayList B(Map map) {
        List listD1 = o7h.d1(map.keySet(), 99);
        ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new x2g(iIntValue, (r2g) ((List) this.c).get(iIntValue)));
        }
        return arrayList;
    }

    public lud0 a() {
        nwp nwpVar = (nwp) this.b;
        gw70 gw70VarA0 = nwpVar.a.a0();
        c8o.l(gw70VarA0);
        Object obj = this.c;
        return new lud0(new vi11(gw70VarA0, (d0r) ((jly0) obj).get(), new uym0(f2u0.j((Flowable) ((jly0) this.d).get()), (Flowable) ((jly0) this.g).get(), ((Flowable) ((jly0) this.d).get()).j(mo9.O0), (w9u0) ((jly0) this.h).get(), (d0r) ((jly0) obj).get()), new et90(new xu4(false, (luk) nwpVar.g.get()), f2u0.f((Flowable) ((jly0) this.d).get()), (cbv) nwpVar.P.get()), nwpVar.e(), (byte) 14), (byte) 2);
    }

    public Object apply(Object obj) {
        q410 q410Var = (q410) this.a;
        String str = (String) this.b;
        PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.c;
        PlayOrigin playOrigin = (PlayOrigin) this.d;
        LoggingParams loggingParams = (LoggingParams) this.e;
        Map map = (Map) this.f;
        return (SingleSource) ((py21) obj).b(new j96(q410Var, str, preparePlayOptions, playOrigin, loggingParams, map, (byte) 13), new z1(q410Var, (g3d0) this.g, (Map) this.h, preparePlayOptions, playOrigin, loggingParams, map, (byte) 6));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void b(int i2, b0k b0kVar, kvv kvvVar, iu30 iu30Var, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1338809377);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(kvvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            int iOrdinal = ((bf) ((dp5) this.a).b).a().ordinal();
            if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                i4 = 1;
            }
            int iC = l1d.C(i4);
            if (iC == 0) {
                x340Var.i0(1404049485);
                c(kvvVar, iu30Var, x340Var, i5 & 8190);
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1894372641, false);
                }
                x340Var.i0(1404169796);
                d(kvvVar, iu30Var, x340Var, i5 & 8190);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rtv(this, kvvVar, iu30Var, qim0Var2, i2);
        }
    }

    public void c(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2130163896);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(kvvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= x340Var.g(nim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            fra fraVar = een.Z;
            qim0 qim0VarA = uyn1.A(anm1.N("BODY", u291.f(nim0Var, 1.0f)), 16.0f, 32.0f, 16.0f, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            ((lqr) this.f).b(kvvVar, iu30Var, x340Var, i3 & 126);
            qim0 qim0VarH = kx40.h(1.0f, uyn1.B(nim0Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 6);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i5 = i3 << 6;
            f(false, kvvVar, iu30Var, x340Var, (i5 & 7168) | (i5 & 896) | 54 | ((i3 << 3) & 57344));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new stv(this, kvvVar, iu30Var, i2, (byte) 0);
        }
    }

    public void d(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-319781328);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(kvvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= x340Var.g(nim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            era eraVar = een.Q0;
            qim0 qim0VarN = anm1.N("LARGE_FOND_BODY", uyn1.x(u291.f(nim0Var, 1.0f), 16.0f));
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            ((lqr) this.f).b(kvvVar, iu30Var, x340Var, i3 & 126);
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            int i5 = i3 << 6;
            f(true, kvvVar, iu30Var, x340Var, (i5 & 7168) | (i5 & 896) | 54 | ((i3 << 3) & 57344));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new stv(this, kvvVar, iu30Var, i2, (byte) 1);
        }
    }

    public void e(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1618199311);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(kvvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 126;
            ((nt21) this.e).c(kvvVar, iu30Var, x340Var, i4);
            ((j2e0) this.g).a(kvvVar, iu30Var, x340Var, i4);
            ((zfr) this.d).c(kvvVar, iu30Var, x340Var, i4);
            ((ilh1) this.c).b(kvvVar, iu30Var, x340Var, i4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new stv(this, kvvVar, iu30Var, i2, (byte) 2, false);
        }
    }

    public void f(boolean z, kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var2;
        b0k b0kVar2;
        Object ttvVar;
        int i4;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1299232367);
        int i6 = i2 & 6;
        pbh pbhVar = pbh.a;
        if (i6 == 0) {
            i3 = (b0kVar3.g(pbhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.g(kvvVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            iu30Var2 = iu30Var;
            i3 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.i(this) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xzu.R0;
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, b0kVar3, 48);
            Object[] objArr2 = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = xzu.Q0;
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT2, b0kVar3, 48);
            String str = kvvVar.b;
            boolean z2 = kvvVar.c;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("NAME", nim0Var);
            gne gneVar = kvvVar.V0;
            boolean z3 = !kvvVar.N0;
            String strO0 = cwl1.o0(b0kVar3, 2131955266);
            int i7 = i3 & 896;
            int i8 = i3 & 7168;
            boolean zG = b0kVar3.g(ven0Var) | (i7 == 256) | b0kVar3.i(this) | (i8 == 2048);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                i4 = i8;
                i5 = i7;
                ttvVar = new ttv(kvvVar, this, iu30Var2, ven0Var, (byte) 0);
                b0kVar3.s0(ttvVar);
            } else {
                i4 = i8;
                ttvVar = objT3;
                i5 = i7;
            }
            eqn1.d(1, str, strO0, z2, z3, z3, (iu30) ttvVar, gneVar, qim0VarN, (lee1) null, b0kVar3, 100663302);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).m;
            long j = cbx.a(b0kVar3).b.b;
            qim0 qim0VarC = pbhVar.c(een.R0, u291.b(0.0f, 16.0f, 1, (qim0) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014d: INVOKE (r9v4 'qim0VarC' p.qim0) = 
                  (r9v0 'pbhVar' p.pbh)
                  (wrap p.era:0x014b: SGET  A[WRAPPED] (LINE:332) p.een.R0 p.era)
                  (wrap p.qim0:0x0147: INVOKE (0.0f float), (16.0f float), (1 int), (wrap p.qim0:?: CAST (p.qim0) (r22v0 ?? I:??[OBJECT, ARRAY])) STATIC call: p.u291.b(float, float, int, p.qim0):p.qim0 A[WRAPPED] (LINE:328))
                 VIRTUAL call: p.pbh.c(p.era, p.qim0):p.qim0 A[DECLARE_VAR] (LINE:334) in method: p.kp5.f(boolean, p.kvv, p.iu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 514
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.kp5.f(boolean, p.kvv, p.iu30, p.b0k, int):void");
        }

        public void g(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i2) {
            int i3;
            m4c m4cVar;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-516788227);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.g(kvvVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.i(this) ? 256 : 128;
            }
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                Object objT = x340Var.T();
                m4c m4cVar2 = fkj0.X;
                if (objT == m4cVar2) {
                    m601 m601Var = new m601(new hws(iu30Var, (byte) 17));
                    x340Var.s0(m601Var);
                    objT = m601Var;
                }
                m601 m601Var2 = (m601) objT;
                if (kvvVar.f) {
                    x340Var.i0(1820009307);
                    m4cVar = m4cVar2;
                    otw.c(m601Var2, new l601(kvvVar.g), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    m4cVar = m4cVar2;
                    x340Var.i0(1820111173);
                    x340Var.r(false);
                }
                if (kvvVar.e) {
                    x340Var.i0(1820167283);
                    if (kvvVar.h) {
                        x340Var.i0(1820201352);
                        orx orxVar = orx.c;
                        String strO0 = cwl1.o0(x340Var, 2131955263);
                        boolean zI = x340Var.i(this) | ((i3 & 112) == 32);
                        Object objT2 = x340Var.T();
                        if (zI || objT2 == m4cVar) {
                            objT2 = new utv(this, iu30Var, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zpn1.d(orx.d << 3, strO0, (Function0) objT2, x340Var, orxVar, (qim0) null);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1820539717);
                        pox poxVar = pox.c;
                        String strO1 = cwl1.o0(x340Var, 2131955262);
                        boolean zI2 = x340Var.i(this) | ((i3 & 112) == 32);
                        Object objT3 = x340Var.T();
                        if (zI2 || objT3 == m4cVar) {
                            objT3 = new utv(this, iu30Var, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        zpn1.d(pox.d << 3, strO1, (Function0) objT3, x340Var, poxVar, (qim0) null);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                } else {
                    x340Var.i0(1820861125);
                    x340Var.r(false);
                }
                if (kvvVar.t) {
                    x340Var.i0(1820912771);
                    cmx cmxVar = cmx.c;
                    String strO2 = cwl1.o0(x340Var, 2131955264);
                    boolean zI3 = x340Var.i(this) | ((i3 & 112) == 32);
                    Object objT4 = x340Var.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new utv(this, iu30Var, (byte) 2);
                        x340Var.s0(objT4);
                    }
                    zpn1.d(cmx.d << 3, strO2, (Function0) objT4, x340Var, cmxVar, (qim0) null);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1821197413);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new stv(this, kvvVar, iu30Var, i2, (byte) 3, false);
            }
        }

        public void h(boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i2) {
            int i3;
            max haxVar;
            m4c m4cVar = fkj0.X;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(1828891669);
            if ((i2 & 6) == 0) {
                i3 = (b0kVar2.h(z) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= b0kVar2.h(z2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= b0kVar2.i(iu30Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= b0kVar2.i(this) ? 2048 : 1024;
            }
            if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
                nim0 nim0Var = nim0.a;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar2, 54);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
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
                String strO0 = cwl1.o0(b0kVar2, 2131955259);
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar2).a.d;
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0VarF = dug.f(nim0Var, j, u5j1Var);
                long j2 = cbx.a(b0kVar2).b.a;
                boolean zI = ((i3 & 14) == 4) | b0kVar2.i(this);
                int i4 = i3 & 896;
                boolean z3 = zI | (i4 == 256);
                Object objT = b0kVar2.T();
                if (z3 || objT == m4cVar) {
                    objT = new vm1(this, z, iu30Var, (byte) 9);
                    b0kVar2.s0(objT);
                }
                max maxVar = jax.a;
                bqn1.e(strO0, (Function0) objT, j2, maxVar, qim0VarF, b0kVar2, 3072);
                boolean z4 = false;
                uwo1.e(cwl1.o0(b0kVar2, 2131955271), uyn1.z(8.0f, 0.0f, 2, new wnb0(1.0f, false)), cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                long j3 = cbx.a(b0kVar2).b.c;
                if (z) {
                    b0kVar2.i0(-156157288);
                    b0kVar2.r(false);
                    haxVar = maxVar;
                } else if (z2) {
                    b0kVar2.i0(-156146027);
                    haxVar = new hax(cwl1.o0(b0kVar2, 2131955270));
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(-156139206);
                    haxVar = new hax(cwl1.o0(b0kVar2, 2131955269));
                    b0kVar2.r(false);
                }
                String strO1 = cwl1.o0(b0kVar2, 2131955268);
                qim0 qim0VarF2 = dug.f(nim0Var, cbx.a(b0kVar2).a.d, u5j1Var);
                boolean zI2 = b0kVar2.i(this);
                if (i4 == 256) {
                    z4 = true;
                }
                boolean z5 = z4 | zI2;
                Object objT2 = b0kVar2.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new utv(this, iu30Var, (byte) 3);
                    b0kVar2.s0(objT2);
                }
                bqn1.e(strO1, (Function0) objT2, j3, haxVar, qim0VarF2, b0kVar2, 0);
                b0kVar2.r(true);
            } else {
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new cla(this, z, z2, iu30Var, i2, (byte) 2);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public void i(int i2, b0k b0kVar, kvv kvvVar, iu30 iu30Var, qim0 qim0Var) throws NoWhenBranchMatchedException {
            int i3;
            b0k b0kVar2;
            kvv kvvVar2;
            qim0 qim0Var2;
            iu30 iu30Var2 = iu30Var;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(196679963);
            if ((i2 & 6) == 0) {
                i3 = (b0kVar3.g(kvvVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            int i4 = i3 | 48;
            if ((i2 & 384) == 0) {
                i4 |= b0kVar3.i(iu30Var2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= b0kVar3.i(this) ? 2048 : 1024;
            }
            int i5 = i4;
            if (b0kVar3.Y(i5 & 1, (i5 & 1171) != 1170)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarH = l6o1.H(u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3), l6o1.C(0, 0, 1, b0kVar3), false, 14);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarH);
                mbh mbhVarA = jbh.a(h36.g, een.P0, b0kVar3, 6);
                int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM = b0kVar3.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0VarP);
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
                int i6 = i5 & 7168;
                h(kvvVar.X0, kvvVar.S0, iu30Var, b0kVar3, i5 & 8064);
                int i7 = i5 & 14;
                int i8 = i5 >> 3;
                int i9 = i7 | (i8 & 112);
                iu30Var2 = iu30Var;
                b(i9 | i6, b0kVar3, kvvVar, iu30Var2, null);
                b0kVar2 = b0kVar3;
                kvvVar2 = kvvVar;
                int i10 = (i8 & 896) | i9;
                g(kvvVar2, iu30Var2, b0kVar2, i10);
                b0kVar2.r(true);
                e(kvvVar2, iu30Var2, b0kVar2, i10);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                kvvVar2 = kvvVar;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new rtv(this, kvvVar2, qim0Var2, iu30Var2, i2);
            }
        }

        public eyh0 l() {
            Context context = (Context) this.a;
            fwo fwoVar = (fwo) this.e;
            fwo fwoVar2 = (fwo) this.f;
            fwo fwoVar3 = (fwo) this.g;
            fwo fwoVar4 = (fwo) this.h;
            mbo0 mbo0Var = (mbo0) this.c;
            ohv0 ohv0Var = (ohv0) this.b;
            return new eyh0(new hj2(context, fwoVar, fwoVar2, fwoVar3, fwoVar4, mbo0Var, new ihv0(ohv0Var)), (af4) this.d, new ihv0(ohv0Var), (byte) 27);
        }

        public vu4 m() {
            return new vu4(false, false, false, (luk) ((nwp) this.b).g.get());
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public Object n(onm onmVar) {
            gl2 gl2Var;
            y1x0 y1x0Var;
            if (onmVar instanceof gl2) {
                gl2Var = (gl2) onmVar;
                int i2 = gl2Var.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gl2Var.d = i2 - Integer.MIN_VALUE;
                } else {
                    gl2Var = new gl2(this, onmVar);
                }
            } else {
                gl2Var = new gl2(this, onmVar);
            }
            Object obj = gl2Var.b;
            int i3 = gl2Var.d;
            if (i3 == 0) {
                hm5.M(obj);
                mr20 mr20VarC = ((ov20) this.e).c("verifiable-parental-consent-status", "");
                y1x0 y1x0Var2 = i;
                gl2Var.a = y1x0Var2;
                gl2Var.d = 1;
                Object objI = b5p1.i(mr20VarC, gl2Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                obj = objI;
                y1x0Var = y1x0Var2;
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y1x0Var = gl2Var.a;
                hm5.M(obj);
            }
            y1x0Var.getClass();
            return new em2(y1x0.d((String) obj));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        public Object o(s2j1 s2j1Var, String str, int i2, onm onmVar) {
            hl2 hl2Var;
            int i3;
            s2j1 s2j1Var2;
            Object obj;
            y1x0 y1x0Var;
            String str2 = str;
            if (onmVar instanceof hl2) {
                hl2Var = (hl2) onmVar;
                int i4 = hl2Var.f;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hl2Var.f = i4 - Integer.MIN_VALUE;
                } else {
                    hl2Var = new hl2(this, onmVar);
                }
            } else {
                hl2Var = new hl2(this, onmVar);
            }
            Object obj2 = hl2Var.d;
            int i5 = hl2Var.f;
            if (i5 == 0) {
                hm5.M(obj2);
                cn2 cn2Var = (cn2) this.g;
                i8h1 i8h1VarA = cn2Var.a();
                h7l0 h7l0Var = cn2Var.b;
                int iOrdinal = s2j1Var.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i3 = 1;
                }
                Integer numValueOf = Integer.valueOf(i2);
                x6h1 x6h1VarC = h7l0Var.b.c();
                x6h1VarC.i.add(new a7h1("verification_row", p6l0.a(i3), numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                this.h = i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                mr20 mr20VarC = ((ov20) this.e).c("verifiable-parental-consent-status", "");
                s2j1Var2 = s2j1Var;
                hl2Var.a = s2j1Var2;
                hl2Var.b = str2;
                y1x0 y1x0Var2 = i;
                hl2Var.c = y1x0Var2;
                hl2Var.f = 1;
                Object objI = b5p1.i(mr20VarC, hl2Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                obj = objI;
                y1x0Var = y1x0Var2;
            } else {
                if (i5 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y1x0Var = hl2Var.c;
                str2 = hl2Var.b;
                s2j1 s2j1Var3 = hl2Var.a;
                hm5.M(obj2);
                obj = obj2;
                s2j1Var2 = s2j1Var3;
            }
            y1x0Var.getClass();
            return new im2(y1x0.d((String) obj), s2j1Var2, str2);
        }

        public s4b1 p() {
            s4b1 s4b1Var = (s4b1) ((l2h) this.b).b.getValue();
            c8o.m(s4b1Var);
            return s4b1Var;
        }

        public void q(fai0 fai0Var, nxa1 nxa1Var, o1f0 o1f0Var) {
            int iOrdinal = nxa1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    fai0Var.m(hp5.c);
                    return;
                } else if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
            }
            int iOrdinal2 = o1f0Var.ordinal();
            if (iOrdinal2 == 0) {
                fai0Var.m(hp5.b);
                if (((r961) this.f) == null) {
                    x8c0 lifecycle = ((iac0) this.a).getLifecycle();
                    r961 r961Var = new r961(lifecycle);
                    w6d1.h((kdn0) r961Var.c).g(new es3(this, (byte) 1));
                    lifecycle.a((e72) r961Var.d);
                    this.f = r961Var;
                    return;
                }
                return;
            }
            if (iOrdinal2 != 1) {
                eg.o();
                return;
            }
            r961 r961Var2 = (r961) this.f;
            if (r961Var2 != null) {
                ((x8c0) r961Var2.b).d((e72) r961Var2.d);
                ((kdn0) r961Var2.c).m(li61.b);
            }
            this.f = null;
            fai0Var.m(hp5.a);
        }

        public void r() {
            View view = (ComposeView) this.h;
            if (view != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            this.h = null;
        }

        public rgy s() {
            dqn dqnVar = (dqn) this.b;
            a9p a9pVar = (a9p) ((jly0) this.d).get();
            b9p b9pVar = (b9p) ((jly0) this.e).get();
            vpn vpnVar = dqnVar.b.c;
            if (vpnVar instanceof vpn) {
                vpn vpnVar2 = vpnVar;
                kp5 kp5Var = (kp5) a9pVar.a.c;
                xon xonVar = (xon) kp5Var.a;
                j130 j130Var = (j130) xonVar.c.get();
                c8o.l(j130Var);
                op31 op31Var = (op31) xonVar.g.get();
                c8o.l(op31Var);
                dqn dqnVar2 = (dqn) kp5Var.b;
                q8n q8nVar = (q8n) xonVar.k.get();
                c8o.l(q8nVar);
                return new ne(vpnVar2, j130Var, op31Var, dqnVar2, q8nVar);
            }
            if (!(vpnVar instanceof zpn)) {
                eg.o();
                return null;
            }
            zpn zpnVar = (zpn) vpnVar;
            kp5 kp5Var2 = (kp5) b9pVar.a.c;
            xon xonVar2 = (xon) kp5Var2.a;
            xrc0 xrc0Var = (xrc0) xonVar2.d.get();
            c8o.l(xrc0Var);
            iyc0 iyc0Var = (iyc0) xonVar2.e.get();
            c8o.l(iyc0Var);
            op31 op31Var2 = (op31) xonVar2.g.get();
            c8o.l(op31Var2);
            Activity activity = (Activity) xonVar2.a.get();
            c8o.l(activity);
            kt91 kt91Var = (kt91) xonVar2.f.get();
            c8o.l(kt91Var);
            a1r0 a1r0Var = (a1r0) xonVar2.h.get();
            c8o.l(a1r0Var);
            yt91 yt91Var = new yt91(activity, kt91Var, a1r0Var, (byte) 0);
            dqn dqnVar3 = (dqn) kp5Var2.b;
            uu00 uu00Var = (uu00) xonVar2.j.get();
            c8o.l(uu00Var);
            q8n q8nVar2 = (q8n) xonVar2.k.get();
            c8o.l(q8nVar2);
            q8n q8nVar3 = (q8n) xonVar2.l.get();
            c8o.l(q8nVar3);
            zwz0 zwz0Var = (zwz0) xonVar2.m.get();
            c8o.l(zwz0Var);
            ylk0 ylk0Var = (ylk0) xonVar2.n.get();
            c8o.l(ylk0Var);
            ylk0 ylk0Var2 = (ylk0) xonVar2.o.get();
            c8o.l(ylk0Var2);
            luk lukVar = (luk) xonVar2.i.get();
            c8o.l(lukVar);
            return new hlu0(xrc0Var, iyc0Var, op31Var2, yt91Var, dqnVar3, uu00Var, q8nVar2, q8nVar3, zwz0Var, ylk0Var, ylk0Var2, new vo4(false, lukVar), zpnVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        public Object t(onm onmVar) {
            jke jkeVar;
            ResumptionProgressEsperanto.ResumePoint resumePointP;
            String str = (String) this.b;
            if (onmVar instanceof jke) {
                jkeVar = (jke) onmVar;
                int i2 = jkeVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jkeVar.c = i2 - Integer.MIN_VALUE;
                } else {
                    jkeVar = new jke(this, onmVar);
                }
            } else {
                jkeVar = new jke(this, onmVar);
            }
            Object objD = jkeVar.a;
            int i3 = jkeVar.c;
            if (i3 == 0) {
                hm5.M(objD);
                p831 p831VarP = ResumptionProgressEsperanto.GetResumePointRequest.p();
                p831VarP.q(str);
                p831VarP.r(((p6r0) this.f).c);
                p831VarP.s("audiobook_chapter_playback_confirmation");
                p831VarP.t();
                ResumptionProgressEsperanto.GetResumePointRequest getResumePointRequestBuild = p831VarP.build();
                jn7 jn7Var = (jn7) this.d;
                getResumePointRequestBuild.getClass();
                jkeVar.c = 1;
                objD = jn7Var.D(getResumePointRequestBuild, jkeVar);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            ResumptionProgressEsperanto.ItemResumePoint itemResumePoint = (ResumptionProgressEsperanto.ItemResumePoint) ((ResumptionProgressEsperanto.GetResumePointResponse) objD).o().get(str);
            if (itemResumePoint == null || itemResumePoint.o() != r831.c || (resumePointP = itemResumePoint.p()) == null) {
                return null;
            }
            return resumePointP.getUri();
        }

        public Single u(String str) {
            eny enyVar = (eny) this.e;
            Set set = s4b1.f;
            return enyVar.a(str, uic.x(str).c).timeout(200L, TimeUnit.MILLISECONDS, Single.error(new TimeoutException())).onErrorReturnItem("");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public Object v(onm onmVar) {
            jl2 jl2Var;
            if (onmVar instanceof jl2) {
                jl2Var = (jl2) onmVar;
                int i2 = jl2Var.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jl2Var.c = i2 - Integer.MIN_VALUE;
                } else {
                    jl2Var = new jl2(this, onmVar);
                }
            } else {
                jl2Var = new jl2(this, onmVar);
            }
            Object objJ = jl2Var.a;
            int i3 = jl2Var.c;
            try {
                if (i3 == 0) {
                    hm5.M(objJ);
                    u70 u70Var = new u70(((ov20) this.e).c("verifiable-parental-consent-status", ""), (byte) 7);
                    s4 s4Var = new s4(2, null, (byte) 5);
                    jl2Var.c = 1;
                    objJ = b5p1.j(u70Var, s4Var, jl2Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i3 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ);
                }
                return new lm2((t2j1) objJ);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                return km2.a;
            }
        }

        public void w(Object obj) {
            OutputSwitcherPermissionNudgeActivity outputSwitcherPermissionNudgeActivity = (OutputSwitcherPermissionNudgeActivity) obj;
            daq daqVar = (daq) this.b;
            ((mzo) outputSwitcherPermissionNudgeActivity).a1 = (jgu) daqVar.a.g0.get();
            outputSwitcherPermissionNudgeActivity.f1 = (rfr) daqVar.Do.get();
            outputSwitcherPermissionNudgeActivity.b1 = (ior) ((jly0) this.h).get();
            outputSwitcherPermissionNudgeActivity.c1 = (iur) daqVar.Ub.get();
            outputSwitcherPermissionNudgeActivity.e1 = (v4o0) daqVar.je.get();
            outputSwitcherPermissionNudgeActivity.d1 = i1l.c((b8p) daqVar.f4.get());
        }

        public EventSource x(String str) {
            Observable observableCombineLatest;
            ObservableFromPublisher observableFromPublisherEmpty;
            ck20 ck20Var = (ck20) ((h0y) this.c).b;
            zkj0 zkj0Var = (zkj0) this.a;
            Set set = s4b1.f;
            int iOrdinal = uic.x(str).c.ordinal();
            if (iOrdinal == 659 || iOrdinal == 844) {
                r5h r5hVar = zkj0Var.b;
                e3h e3hVarP = CollectionDecorateRequest.p();
                e3hVarP.q(str);
                e3hVarP.u(zkj0.d);
                observableCombineLatest = Observable.combineLatest(r5hVar.e(e3hVarP.build()), zkj0Var.c.a(Collections.singletonList(str)).map(d710.P0).toObservable().onErrorReturnItem(Boolean.TRUE), new j2e0(str, zkj0Var, (byte) 28));
            } else {
                observableCombineLatest = Observable.just(new wae0(new IllegalArgumentException("Unsupported entityUri: ".concat(str))));
            }
            ObservableSource map = observableCombineLatest.onErrorReturn(new gap1(str, (byte) 12)).map(vrg.Q0);
            yeu0 yeu0Var = (yeu0) this.b;
            ObservableSource map2 = new ObservableFromPublisher(((Flowable) yeu0Var.b).x(hcx0.b)).switchMap(new l1p0(yeu0Var, (byte) 27)).map(jcx0.b).onErrorReturn(kcx0.b).map(bbn.Q0);
            ObservableSource map3 = ((p501) this.e).a.map(ios.Q0);
            ObservableSource map4 = ck20Var.c.switchMap(c710.c).map(zj20.b).onErrorReturn(ak20.b).map(fmv.R0);
            ObservableSource map5 = ck20Var.c.switchMap(f610.c).map(xj20.b).onErrorReturn(yj20.b).map(v560.Q0);
            ObservableSource map6 = ((Observable) this.h).map(qz70.Q0);
            tjh tjhVar = (tjh) this.d;
            Observable observable = tjhVar.j;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ObservableSource map7 = observable.delay(500L, timeUnit).subscribeOn(tjhVar.a).map(b6j0.P0);
            if (((wjh) this.f).a()) {
                r0s0 r0s0Var = (r0s0) this.g;
                observableFromPublisherEmpty = new ObservableFromPublisher(((Flowable) r0s0Var.c).S(500L, timeUnit, (Scheduler) r0s0Var.b).X(new myq0(str, r0s0Var, (byte) 25)).M(xi20.a1).J(zhm0.O0));
            } else {
                observableFromPublisherEmpty = Observable.empty();
                observableFromPublisherEmpty.getClass();
            }
            return RxEventSources.a(new ObservableSource[]{map, map2, map3, map4, map5, map6, map7, observableFromPublisherEmpty});
        }

        public CompletableSubscribeOn y(String str) {
            return new CompletableFromRunnable(new xwn1(this, str, (byte) 16)).s((Scheduler) this.h);
        }

        public void z(Integer num, String str, String str2, String str3, String str4, Function0 function0, Function0 function1) {
            r();
            Object obj = this.c;
            View composeView = new ComposeView((dg30) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            this.h = composeView;
            hrr0 hrr0VarQ = v8r.q(Boolean.TRUE);
            q6x jp80Var = new jp80(composeView);
            q6x q6xVar = (eq80) this.f;
            if (q6xVar == null) {
                q6xVar = q6x.b;
            }
            q6x wchVar = q6x.b;
            if (jp80Var.equals(wchVar) && q6xVar.equals(wchVar)) {
                jp80Var = wchVar;
            } else if (jp80Var.equals(wchVar)) {
                jp80Var = q6xVar;
            } else if (!q6xVar.equals(wchVar)) {
                wchVar = new wch(jp80Var, q6xVar);
                jp80Var = wchVar;
            }
            xhk1.c(composeView, jp80Var);
            composeView.setContent(new j2i(1601392240, new o06(composeView, this, hrr0VarQ, function1, function0, str, str4, str3, num, str2, (byte) 3), true));
            ((ViewGroup) ((dg30) obj).findViewById(R.id.content)).addView(composeView);
        }

        public /* synthetic */ kp5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            this.a = obj;
            this.b = obj2;
            this.c = obj3;
            this.d = obj4;
            this.e = obj5;
            this.f = obj6;
            this.g = obj7;
        }

        public /* synthetic */ kp5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            this.a = obj;
            this.b = obj2;
            this.c = obj3;
            this.d = obj4;
            this.e = obj5;
            this.f = obj6;
            this.g = obj7;
            this.h = obj8;
        }

        public kp5(daq daqVar, Activity activity) {
            this.b = daqVar;
            this.a = activity;
            g5t g5tVar = new g5t();
            this.c = g5tVar;
            this.d = new p2p(daqVar, this, 3, (byte) 17);
            g5t.a(g5tVar, new p2p(daqVar, this, 2, (byte) 17));
            this.e = new p2p(daqVar, this, 1, (byte) 17);
            this.f = xqu.b(new p2p(daqVar, this, 5, (byte) 17));
            this.g = new p2p(daqVar, this, 4, (byte) 17);
            this.h = xqu.b(new p2p(daqVar, this, 0, (byte) 17));
        }

        public kp5(gp5 gp5Var, iac0 iac0Var, fp31 fp31Var, gp31 gp31Var, vxf0 vxf0Var, hp31 hp31Var, qe41 qe41Var, ap31 ap31Var, ep31 ep31Var, piq piqVar, qiq qiqVar) {
            this.a = iac0Var;
            this.b = fp31Var;
            this.c = gp31Var;
            fai0 fai0Var = new fai0();
            this.g = fai0Var;
            this.h = w6d1.h(fai0Var);
        }

        public /* synthetic */ kp5(FrameLayout frameLayout, View view, View view2, View view3, View view4, TextView textView, View view5, View view6, TextView textView2) {
            this.a = frameLayout;
            this.b = view;
            this.c = view2;
            this.d = view3;
            this.e = view4;
            this.f = textView;
            this.g = view5;
            this.h = textView2;
        }

        public kp5(od8 od8Var, o78 o78Var, Scheduler scheduler, Scheduler scheduler2, hr00 hr00Var, g341 g341Var) {
            this.a = od8Var;
            this.b = o78Var;
            this.c = scheduler;
            this.d = scheduler2;
            this.e = hr00Var;
            this.f = g341Var;
            this.g = BehaviorSubject.g(zd8.a);
            this.h = new vku();
        }

        public kp5(Context context, zwm1 zwm1Var, xrc0 xrc0Var, ltm1 ltm1Var, eny enyVar, agc0 agc0Var) {
            this.a = context;
            this.b = zwm1Var;
            this.c = xrc0Var;
            this.d = ltm1Var;
            this.e = enyVar;
            this.f = agc0Var;
            this.g = new idd1(new clt(this, (byte) 0));
            this.h = new idd1(new clt(this, (byte) 1));
        }

        public kp5(rbq rbqVar, req reqVar, vgm vgmVar, lik1 lik1Var, PlayOrigin playOrigin, tgm tgmVar, d0r d0rVar, String str, mje mjeVar, p4p p4pVar, q8n q8nVar, boolean z, boolean z2, ks6 ks6Var, jn7 jn7Var, qix0 qix0Var, p6r0 p6r0Var) {
            this.a = d0rVar;
            this.b = str;
            this.c = q8nVar;
            this.d = jn7Var;
            this.e = qix0Var;
            this.f = p6r0Var;
            rje rjeVar = rje.t;
            this.g = w3p1.o(new l4r(hjx0.a, 2, rje.Y, new j4r(rjeVar), rje.Z), rje.X);
            this.h = new uq8(this, (byte) 11);
        }

        public kp5(FrameLayout frameLayout, EncoreButton encoreButton, EditText editText, ConstraintLayout constraintLayout, TextView textView, EncoreButton encoreButton2, TextView textView2, ScrollView scrollView, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, View view, ConstraintLayout constraintLayout2, View view2) {
            this.a = frameLayout;
            this.b = editText;
            this.c = constraintLayout;
            this.d = textView;
            this.e = encoreButton2;
            this.f = textView2;
            this.g = view;
            this.h = view2;
        }

        public kp5(lt61 lt61Var, mt61 mt61Var, q7r0 q7r0Var) {
            this.a = lt61Var;
            this.b = q7r0Var;
            this.c = mt61Var;
            this.d = xqu.b(new ipq(this, 3, (byte) 4));
            this.e = new ipq(this, 2, (byte) 4);
            this.f = new ipq(this, 4, (byte) 4);
            this.g = iy81.a(new ipq(this, 1, (byte) 4));
            this.h = new ipq(this, 0, (byte) 4);
        }

        public kp5(tkl1 tkl1Var, dll1 dll1Var) {
            this.a = tkl1Var;
            this.b = dll1Var;
            this.c = xqu.b(new tsq(this, 2, (byte) 25));
            this.d = xqu.b(new tsq(this, 1, (byte) 25));
            this.e = xqu.b(new tsq(this, 5, (byte) 25));
            this.f = xqu.b(new tsq(this, 4, (byte) 25));
            this.g = iy81.a(new tsq(this, 3, (byte) 25));
            this.h = iy81.a(new tsq(this, 0, (byte) 25));
        }

        public kp5(zuf1 zuf1Var, avf1 avf1Var, q7r0 q7r0Var) {
            this.a = zuf1Var;
            this.b = avf1Var;
            this.c = q7r0Var;
            this.d = xqu.b(new tsq(this, 0, (byte) 6));
            this.e = new tsq(this, 2, (byte) 6);
            this.f = iy81.a(new tsq(this, 1, (byte) 6));
            this.g = new tsq(this, 4, (byte) 6);
            this.h = new tsq(this, 3, (byte) 6);
        }

        public kp5(Context context, af4 af4Var, mbo0 mbo0Var, ohv0 ohv0Var) {
            this.a = context;
            this.b = ohv0Var;
            this.c = mbo0Var;
            this.d = af4Var;
            this.e = new fwo(this, 0, (byte) 10);
            this.f = new fwo(this, 1, (byte) 10);
            this.g = new fwo(this, 2, (byte) 10);
            this.h = new fwo(this, 3, (byte) 10);
        }

        public kp5(t2q t2qVar, qop qopVar, jbt jbtVar) {
            this.a = qopVar;
            this.b = t2qVar;
            this.c = jbtVar;
            this.d = xqu.b(new blp(this, 1, (byte) 7));
            this.e = xqu.b(new blp(this, 0, (byte) 7));
            this.f = xqu.b(new blp(this, 2, (byte) 7));
            this.g = iy81.a(new blp(this, 3, (byte) 7));
            this.h = iy81.a(new blp(this, 4, (byte) 7));
        }

        public kp5(xon xonVar, dqn dqnVar, q7r0 q7r0Var) {
            this.a = xonVar;
            this.b = dqnVar;
            this.c = q7r0Var;
            byte b = 17;
            this.d = iy81.a(new d7p(this, 2, b));
            this.e = iy81.a(new d7p(this, 3, b));
            this.f = iy81.a(new d7p(this, 4, b));
            this.g = iy81.a(new d7p(this, 1, b));
            this.h = iy81.a(new d7p(this, 0, b));
        }

        public kp5(sez sezVar, xez xezVar) {
            this.a = sezVar;
            this.b = xqu.b(new lbp(this, 0, (byte) 25));
            this.c = xqu.b(new lbp(this, 1, (byte) 25));
            this.d = xqu.b(new lbp(this, 4, (byte) 25));
            this.e = xqu.b(new lbp(this, 3, (byte) 25));
            this.f = xqu.b(iy81.a(new lbp(this, 5, (byte) 25)));
            this.g = xqu.b(iy81.a(new lbp(this, 6, (byte) 25)));
            this.h = xqu.b(new lbp(this, 2, (byte) 25));
        }

        public kp5(r221 r221Var, t221 t221Var, q7r0 q7r0Var) {
            this.a = r221Var;
            this.b = t221Var;
            this.c = q7r0Var;
            this.d = xqu.b(new ykq(this, 0, (byte) 19));
            this.e = xqu.b(new ykq(this, 1, (byte) 19));
            this.f = xqu.b(new ykq(this, 2, (byte) 19));
            this.g = new ykq(this, 3, (byte) 19);
            this.h = iy81.a(new ykq(this, 4, (byte) 19));
        }

        public kp5(s880 s880Var) {
            this.a = s880Var;
            this.b = xqu.b(new chp(this, 2, (byte) 22));
            this.c = xqu.b(new chp(this, 1, (byte) 22));
            this.d = xqu.b(new chp(this, 3, (byte) 22));
            this.e = iy81.a(new chp(this, 0, (byte) 22));
            this.f = xqu.b(new chp(this, 4, (byte) 22));
            this.g = xqu.b(new chp(this, 5, (byte) 22));
            this.h = xqu.b(new chp(this, 6, (byte) 22));
        }

        public kp5(dp5 dp5Var, zeu zeuVar, ilh1 ilh1Var, zfr zfrVar, nt21 nt21Var, lqr lqrVar, j2e0 j2e0Var, zeu zeuVar2, sfq sfqVar) {
            this.a = dp5Var;
            this.b = zeuVar;
            this.c = ilh1Var;
            this.d = zfrVar;
            this.e = nt21Var;
            this.f = lqrVar;
            this.g = j2e0Var;
            this.h = zeuVar2;
        }

        public kp5(k2h k2hVar, l2h l2hVar, q7r0 q7r0Var) {
            this.a = k2hVar;
            this.b = l2hVar;
            this.c = q7r0Var;
            this.d = new b2p(this, 0, (byte) 24);
            this.e = xqu.b(new b2p(this, 1, (byte) 24));
            this.f = new b2p(this, 2, (byte) 24);
            this.g = iy81.a(new b2p(this, 3, (byte) 24));
            this.h = new b2p(this, 4, (byte) 24);
        }

        public kp5(nwp nwpVar, q2p0 q2p0Var) {
            this.b = nwpVar;
            this.a = q2p0Var;
            this.c = iy81.a(new p2p(nwpVar, this, 0, (byte) 6));
            this.d = iy81.a(new p2p(nwpVar, this, 1, (byte) 6));
            this.e = iy81.a(new p2p(nwpVar, this, 3, (byte) 6));
            this.f = iy81.a(new p2p(nwpVar, this, 4, (byte) 6));
            this.g = iy81.a(new p2p(nwpVar, this, 2, (byte) 6));
            this.h = iy81.a(new p2p(nwpVar, this, 5, (byte) 6));
        }

        public kp5(daq daqVar, OutputSwitcherPermissionNudgeActivity outputSwitcherPermissionNudgeActivity) {
            this.b = daqVar;
            this.a = outputSwitcherPermissionNudgeActivity;
            g5t g5tVar = new g5t();
            this.c = g5tVar;
            byte b = 20;
            this.d = new s2q(daqVar, this, 3, b);
            g5t.a(g5tVar, new s2q(daqVar, this, 2, b));
            this.e = new s2q(daqVar, this, 1, b);
            this.f = xqu.b(new s2q(daqVar, this, 5, b));
            this.g = new s2q(daqVar, this, 4, b);
            this.h = xqu.b(new s2q(daqVar, this, 0, b));
        }
    }
