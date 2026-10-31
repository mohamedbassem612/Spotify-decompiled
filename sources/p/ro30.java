package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.play.agesignals.AgeSignalsException;
import com.spotify.appauthorization.sso.ClientIdentity;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.gpb.trackingimpl.events.proto.CPGpbCheckoutLoaded;
import com.spotify.gpb.trackingimpl.events.proto.GpbCheckoutEvents;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messages.PerformanceDiagnosticsV2NonAuth;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ro30 implements Function, h5a, d5q0, jl51, k1q0, nk60, z57, InstallReferrerStateListener, l890 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ro30(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 10;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public static final qim0 d(qim0 qim0Var, int i, float f, float f2, int i2, float f3) {
        if (i2 != i) {
            return qim0Var;
        }
        return u291.j(zjy.p(0.0f, new p3v(f2 - f3)).a, 0.0f, 2, uyn1.B(qim0Var, 0.0f, 0.0f, f, 0.0f, 11));
    }

    public o2r a(int i) {
        return i == 4 ? ((k2r) this.b).j() : ((k2r) this.c).j();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.sso.ClientIdentity$ValidationException */
    public Object apply(Object obj) {
        ss60 ss60Var;
        g71 vx40Var;
        xig xigVar;
        byte b = this.a;
        btx0 btx0Var = btx0.a;
        atx0 atx0Var = atx0.a;
        int i = 3;
        xig xigVarB = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                j8x0 j8x0Var = (j8x0) obj;
                List list = j8x0Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof obx0) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hbx0 hbx0Var = hbx0.a;
                    if (!zHasNext) {
                        j8x0 j8x0Var2 = (j8x0) obj3;
                        p410 p410Var = (p410) obj2;
                        smc0 smc0VarN = k4p1.n();
                        smc0VarN.addAll(j8x0Var2.b);
                        if (!arrayList2.isEmpty()) {
                            List<obx0> list2 = j8x0Var2.b;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                smc0VarN.add(new zbx0(((Activity) p410Var.b).getResources().getString(2131960522)));
                            } else {
                                for (obx0 obx0Var : list2) {
                                    if (!(obx0Var instanceof obx0) || !u890.j(obx0Var.a, hbx0Var)) {
                                    }
                                }
                                smc0VarN.add(new zbx0(((Activity) p410Var.b).getResources().getString(2131960522)));
                            }
                        }
                        smc0VarN.addAll(arrayList2);
                        return j8x0.a(j8x0Var, 0, k4p1.k(smc0VarN), (String) null, false, false, 0, 3, 61);
                    }
                    arrayList2.add(obx0.a((obx0) it.next(), hbx0Var, (String) null, (String) null, (String) null, (q730) null, (Integer) null, 0, 4094));
                }
                break;
            case 7:
                j331 j331Var = (j331) obj;
                r050 r050Var = (r050) obj3;
                if (j331Var instanceof v231) {
                    yfu yfuVar = r050Var.c;
                    pf61 pf61Var = (pf61) yfuVar.c;
                    pf61Var.a();
                    b550 b550VarN = GpbCheckoutEvents.n();
                    b550VarN.n("GPBCartLoaded");
                    b550VarN.r();
                    b550VarN.t(pf61Var.a());
                    ((t2j0) yfuVar.b).a(b550VarN.build());
                    aih1 aih1Var = ((j050) obj2).a.d;
                    if (aih1Var != null) {
                        b6y b6yVar = r050Var.d;
                        String str = aih1Var.a;
                        String str2 = aih1Var.b;
                        onc oncVarN = CPGpbCheckoutLoaded.n();
                        oncVarN.n(str2);
                        oncVarN.q(b6y.b(str));
                        b6yVar.a.a(oncVarN.build());
                    }
                }
                return new u050(j331Var);
            case 15:
                sy21 sy21Var = (sy21) obj;
                boolean z = sy21Var.a.Q0;
                String str3 = ((zs60) obj3).b;
                if (z) {
                    return new xt60(str3, (kb) sy21Var.b);
                }
                uz21 uz21Var = sy21Var.c;
                xigVarB = uz21Var != null ? ut60.b(uz21Var, (nfa0) obj2) : null;
                if (xigVarB != null) {
                    String str4 = xigVarB.b;
                    if (u890.j(str4, "REQUEST_NOT_FOUND")) {
                        i = 2;
                    } else if (u890.j(str4, "SESSION_FULL")) {
                        i = 1;
                    }
                    ss60Var = new ss60(i);
                } else {
                    ss60Var = new ss60(3);
                }
                return new wt60(str3, ss60Var);
            case 16:
                Map map = (Map) obj;
                String str5 = (String) obj3;
                eww0 eww0Var = (eww0) map.get(str5);
                ps60 ps60Var = eww0Var != null ? new ps60(eww0Var.a, eww0Var.b, eww0Var.f) : new ps60(str5, null, null);
                np21 np21Var = (np21) obj2;
                xigVarB = np21Var != null ? np21Var.a : null;
                Collection collection = (Collection) xigVarB;
                return new gu60((collection == null || collection.isEmpty()) ? is60.a : new ls60(ps60Var, new ks60(ut60.d(xigVarB, map))));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((FlowableElementAtSingle) obj3).flatMapCompletable(new mjv((io91) obj2, (byte) 26)).w();
            case 22:
                if (!((Boolean) obj).booleanValue()) {
                    Observable observableJust = Observable.just(btx0Var);
                    observableJust.getClass();
                    return observableJust;
                }
                yc80 yc80Var = (yc80) obj3;
                String str6 = ((jqx0) obj2).a;
                if (str6 == null || str6.length() == 0) {
                    return nf61.b(yc80Var.b, yc80Var.c.a(), (String) null, 30);
                }
                phi0 phi0Var = yc80Var.d;
                String strC = mka.c(str6);
                mwm1 mwm1Var = (mwm1) phi0Var.e;
                ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
                ssm1VarQ.q(strC);
                return mwm1Var.a(ssm1VarQ.build()).flatMapObservable(new hyy0(phi0Var, strC, (byte) 16)).onErrorReturnItem(atx0Var);
            case 23:
                if (!((Boolean) obj).booleanValue()) {
                    Observable observableJust2 = Observable.just(btx0Var);
                    observableJust2.getClass();
                    return observableJust2;
                }
                phi0 phi0Var2 = (phi0) ((so) obj3).b;
                lqx0 lqx0Var = (lqx0) obj2;
                String str7 = lqx0Var.a;
                String str8 = lqx0Var.b;
                String strC2 = mka.c(str7);
                mwm1 mwm1Var2 = (mwm1) phi0Var2.e;
                ssm1 ssm1VarQ2 = YourLibraryContainsRequest.q();
                ssm1VarQ2.q(strC2);
                return mwm1Var2.a(ssm1VarQ2.build()).flatMapObservable(new k811(phi0Var2, str8, strC2, (byte) 1)).onErrorReturnItem(atx0Var);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intent intent = (Intent) obj2;
                Activity activity = (Activity) ((dh30) obj3).c;
                int iC = l1d.C(t2b.g(intent));
                if (iC == 1) {
                    vx40Var = new vx40(new g71(intent), intent, (byte) 21);
                } else if (iC == 2) {
                    vx40Var = new dh30(new g71(intent), intent, (byte) 28);
                } else if (iC != 3) {
                    vx40Var = new g71(intent);
                } else {
                    Uri data = intent.getData();
                    data.getClass();
                    vx40Var = new w2i1(data.toString());
                }
                fyq0 fyq0Var = (vx40Var.n() == null || vx40Var.d() == null) ? null : new fyq0(vx40Var.n(), vx40Var.d());
                String clientId = vx40Var.getClientId();
                int iE = vx40Var.e();
                String strA = vx40Var.a();
                try {
                    if (activity.getPackageName().equals(activity.getCallingPackage())) {
                        xigVarB = vx40Var.k();
                        xigVar = xigVarB;
                    } else {
                        ComponentName callingActivity = activity.getCallingActivity();
                        if (callingActivity == null) {
                            throw new ClientIdentity.ValidationException("Calling activity can't be null");
                        }
                        String packageName = callingActivity.getPackageName();
                        Signature signatureA = xig.a(activity, packageName);
                        int i2 = hu50.a;
                        cyi0 cyi0Var = fu50.a;
                        byte[] byteArray = signatureA.toByteArray();
                        cyi0Var.getClass();
                        int length = byteArray.length;
                        dm5.v(0, length, byteArray.length);
                        dm5.l("expectedInputSize must be >= 0 but was %s", length, length >= 0);
                        bmq0 bmq0VarM = cyi0Var.M();
                        bmq0VarM.U(byteArray, length);
                        xigVar = new xig(packageName, bmq0VarM.C().toString().toUpperCase(Locale.US));
                    }
                } catch (ClientIdentity.ValidationException unused) {
                }
                String state = vx40Var.getState();
                if (state == null) {
                    state = UUID.randomUUID().toString();
                }
                return new mq8(new wq8(clientId, iE, strA, xigVar, state, f46.Q0(vx40Var.q()), fyq0Var, vx40Var.f(), vx40Var.j(), vx40Var.r(), vx40Var.i(), vx40Var.m()), t2b.g(intent), spq0.a(intent.getStringExtra("ID_TOKEN")), zBooleanValue, u890.j(activity.getPackageName(), activity.getCallingPackage()) || izd1.a || hzd1.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r11v19 */
    public void b(qcb1 qcb1Var, jha1 jha1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean zE;
        int i3;
        float f;
        Object objP;
        ?? r10;
        float f2;
        ?? r11;
        int i4;
        float f3;
        qcb1 qcb1Var2 = qcb1Var;
        err0 err0Var = (err0) this.c;
        m4c m4cVar = fkj0.X;
        rbt rbtVar = (rbt) this.b;
        pbq pbqVar = rbtVar.h;
        boolean z = qcb1Var2.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-538452275);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(qcb1Var2) : x340Var.i(qcb1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jha1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            uvb0 uvb0Var = (crl1) x340Var.k(t4k.u);
            boolean zE2 = x340Var.e((int) (uvb0Var.a() & 4294967295L));
            Object objT = x340Var.T();
            if (zE2 || objT == m4cVar) {
                objT = ktd.k(watVar.M0((int) (uvb0Var.a() & 4294967295L)) * 0.4f, x340Var);
            }
            float f4 = ((p3v) objT).a;
            boolean zE3 = fq7.E(pbqVar, x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT2;
            if (z != 0) {
                x340Var.i0(-2056525095);
                zE = fq7.E(rbtVar.q, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(672232732);
                x340Var.r(false);
                zE = false;
            }
            boolean zE4 = fq7.E(rbtVar.l, x340Var);
            boolean zE5 = fq7.E(rbtVar.k, x340Var);
            if (zE) {
                i3 = 1;
            } else if (zE4) {
                i3 = 2;
            } else {
                i3 = zE5 ? 3 : 4;
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            if (zE3 != 0) {
                x340Var.i0(673043790);
                float fM0 = watVar.M0((int) (((yr80) ven0Var.getValue()).a >> 32)) + 16.0f;
                cvx cvxVar2 = cbx.b(x340Var).b;
                f = zjy.p(0.0f, new p3v(fM0 - 16.0f)).a;
                x340Var.r(false);
            } else {
                x340Var.i0(673210911);
                x340Var.r(false);
                f = 0.0f;
            }
            float fM1 = zE3 ? watVar.M0(((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) - ((((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) * 2) / 3)) : 0.0f;
            bw50 bw50VarL = d4o1.l(rbtVar, x340Var);
            qx50 qx50Var = bw50VarL.a;
            long j = bw50VarL.b;
            boolean zG = x340Var.g(qx50Var) | x340Var.f(j);
            int i5 = i3;
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objP = d4o1.p(qx50Var, j, 9205357640488583168L);
                x340Var.s0(objP);
            } else {
                objP = objT3;
            }
            qim0 qim0VarF = u291.f(dug.e(qim0Var, (Brush) objP, (hw61) null, 0.0f, 6), 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            float f5 = f;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            pbq pbqVar2 = rbtVar.i;
            x340Var.i0(229766840);
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qgo1.g(pbqVar2, h2cVar.b(nim0Var), x340Var);
            x340Var.r(false);
            x340Var.i0(-1466813893);
            x340Var.r(false);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            float f6 = fM1;
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            qim0 qim0VarR = i1p1.r(u291.h(u291.f(nim0Var, 1.0f), f4));
            boolean zI = ((i2 & 896) == 256) | x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new zf10(this, iu30Var, (byte) 20);
                x340Var.s0(objT4);
            }
            qim0 qim0VarX = ern1.x(qim0VarR, (iu30) objT4);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            qgo1.g(rbtVar.o, h2cVar.b(nim0Var), x340Var);
            ven0 ven0VarJ = f4p1.j(jha1Var, 0, (iac0) null, x340Var, ((i2 >> 3) & 14) | 48, 14);
            float fS = err0Var.s() * 0.3f;
            float fO = err0Var.s() > 0 ? 1.0f - yoi1.o(yoi1.o(-((Number) ven0VarJ.getValue()).intValue(), 0.0f, fS) / fS, 0.0f, 1.0f) : 0.0f;
            qim0 qim0VarF3 = u291.f(h2cVar.a(nim0Var, een.t), 1.0f);
            zsc zscVar = zex.a;
            u7h u7hVar = new u7h(((vex) zscVar.e).a);
            long j2 = ((vex) zscVar.e).d;
            qim0 qim0VarB = uyn1.B(dug.e(qim0VarF3, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(u7h.b(j2, u7h.c(j2) * fO, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), 0.0f, cbx.b(x340Var).e.b, 0.0f, 0.0f, 13);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            qcb1Var2 = qcb1Var;
            e6p1.b(48, 1, apo.r(-1001889623, new gf((Object) this, (Object) qcb1Var2, f5, (byte) 7), x340Var), x340Var, (qim0) null);
            x340Var.r(true);
            x340Var.r(true);
            if (z) {
                x340Var.i0(-759927649);
                r10 = 1;
                r11 = 0;
                f3 = f6;
                f2 = f5;
                i4 = i5;
                e6p1.b(48, 1, apo.r(608612522, new or30(this, i4, f2, f3, (byte) 0), x340Var), x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                r10 = 1;
                f2 = f5;
                r11 = 0;
                i4 = i5;
                f3 = f6;
                x340Var.i0(-759479823);
                x340Var.r(false);
            }
            e6p1.b(48, (int) r10, apo.r(-1445281243, new or30(this, i4, f2, f3, (byte) 1), x340Var), x340Var, (qim0) null);
            x340Var.r((boolean) r10);
            x340Var.i0(229956162);
            u890.b(pbqVar, apo.r(1256157291, new pr30(r11, f4, ven0Var), x340Var), x340Var, 48);
            x340Var.r((boolean) r11);
            x340Var.r((boolean) r10);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 12, i, this, qcb1Var2, jha1Var, qim0Var, iu30Var);
        }
    }

    public Single c() {
        return new FlowableSingleSingle(new FlowableTake(((tuz) this.b).c)).map(new jl00(this, (byte) 14));
    }

    public b67 e(e4w e4wVar, Looper looper, a67 a67Var, y57 y57Var) {
        return new hr70((Context) this.b, e4wVar, a67Var, (q2r) this.c, y57Var.b);
    }

    public af5 g(x340 x340Var) {
        x340Var.i0(1800142775);
        af5 af5VarA = ((q350) this.b).a(2131956291, (hrd0) this.c, x340Var);
        x340Var.r(false);
        return af5VarA;
    }

    public String h() {
        throw null;
    }

    public void i(Exception exc) {
        String strValueOf;
        int errorCode;
        b450 b450Var = (b450) this.b;
        boolean z = exc instanceof AgeSignalsException;
        int i = 6;
        if (z && (errorCode = ((AgeSignalsException) exc).getErrorCode()) != -100) {
            if (errorCode == -9) {
                i = 2;
            } else if (errorCode == -3) {
                i = 4;
            } else if (errorCode == -1) {
                i = 1;
            }
        }
        AgeSignalsException ageSignalsException = z ? (AgeSignalsException) exc : null;
        if (ageSignalsException == null || (strValueOf = String.valueOf(ageSignalsException.getErrorCode())) == null) {
            strValueOf = "non-AgeSignalsException";
        }
        b450Var.b.a(1, sqg0.J(new mmr0[]{new mmr0("outcome", "failure"), new mmr0("error_code", strValueOf), new mmr0("mapped_error", h4b1.n(i))}));
        ((ohd) this.c).resumeWith(new a2c1(i, 1, exc));
    }

    public void onInstallReferrerServiceDisconnected() {
        ayh ayhVar = (ayh) this.b;
        if (ayhVar.v()) {
            return;
        }
        ayhVar.m0((Object) null);
    }

    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.c;
        i1k0.B("getGooglePlayStoreReferrerDetails onInstallReferrerSetupFinished response code: " + i);
        ayh ayhVar = (ayh) this.b;
        qn80 qn80Var = null;
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                f4t f4tVar = f4t.b;
                qn80Var = new qn80("PlayStore", installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()), Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()), true);
            } catch (Exception e) {
                i1k0.C("Caught getGooglePlayStoreReferrerDetails installReferrer exception: " + e);
            }
            ayhVar.m0(qn80Var);
        } else {
            ayhVar.m0((Object) null);
        }
        installReferrerClient.endConnection();
    }

    public gn31 p(String[] strArr, axl1 axl1Var) {
        return new gn31((en31) this.b, this, strArr, axl1Var);
    }

    public float q(float f, float f2, float f3) {
        l890 l890Var = (l890) ((m890) this.b).d;
        m890 m890Var = (m890) this.c;
        return l890Var.q(m890Var.b, m890Var.c, ((l890) m890Var.d).q(f, f2, f3));
    }

    public mr20 r() {
        g23 g23Var = (g23) this.b;
        c9c0 c9c0Var = (c9c0) g23Var.b;
        int i = kr90.b;
        c64 c64Var = new c64(new any(new x010(c9c0Var.b.current(), c9c0Var.d.b(), new ir90(3, null, (byte) 0), (byte) 1), (byte) 18), g23Var, (byte) 0);
        ytw0 ytw0Var = jfv.b;
        return e4p1.i(new m441(new wn2(c64Var, fdg1.k0(20, ngv.e), (lnm) null, (byte) 10)), new ux70(this, (byte) 11));
    }

    public void s(nmu0 nmu0Var) {
        char c;
        String str;
        i8h1 i8h1Var = (i8h1) this.b;
        brl0 brl0Var = (brl0) this.c;
        int iOrdinal = nmu0Var.ordinal();
        if (iOrdinal == 0) {
            c = 1;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            c = 2;
        }
        x6h1 x6h1VarC = brl0Var.b.c();
        if (c == 1) {
            str = "adds_new";
        } else {
            if (c != 2) {
                throw null;
            }
            str = "replaces";
        }
        x6h1VarC.i.add(new a7h1("generation_mode_row", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void t(String str) {
        try {
            SharedPreferences sharedPreferences = ((Context) this.b).getSharedPreferences("com.spotify.oops", 0);
            sharedPreferences.getBoolean("AndroidProfilingEnabledFromRCProperty", false);
            if (sharedPreferences.getBoolean("DiagnosticReportUploadEnabledFromRCProperty", false)) {
                t2j0 t2j0Var = (t2j0) ((kly0) this.c).get();
                ujs0 ujs0VarN = PerformanceDiagnosticsV2NonAuth.n();
                ujs0VarN.q();
                ujs0VarN.n(str);
                t2j0Var.a(ujs0VarN.build());
            }
        } catch (Exception unused) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return String.format(Locale.US, "%s -> %s", (l890) ((m890) this.c).d, (l890) ((m890) this.b).d);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(String str, onm onmVar) {
        jq80 jq80Var;
        m231 m231Var;
        if (onmVar instanceof jq80) {
            jq80Var = (jq80) onmVar;
            int i = jq80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jq80Var.c = i - Integer.MIN_VALUE;
            } else {
                jq80Var = new jq80(this, onmVar);
            }
        } else {
            jq80Var = new jq80(this, onmVar);
        }
        Object obj = jq80Var.a;
        int i2 = jq80Var.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                g23 g23Var = (g23) this.b;
                jq80Var.c = 1;
                Object objC = ((up90) g23Var.d).c(str, jq80Var);
                d9n d9nVar = d9n.a;
                if (objC != d9nVar) {
                    objC = m231Var2;
                }
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            ae5 ae5Var = (ae5) this.c;
            String strS = nmn1.s(thA);
            t2j0 t2j0Var = ae5Var.a;
            t210 t210VarN = ExternalAccessoryRemoteError.n();
            t210VarN.n("remove_jam_user");
            t210VarN.r();
            t210VarN.q(strS);
            t2j0Var.a(t210VarN.build());
        }
        return m231Var2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(onm onmVar) {
        kq80 kq80Var;
        m231 m231Var;
        Object objE;
        if (onmVar instanceof kq80) {
            kq80Var = (kq80) onmVar;
            int i = kq80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kq80Var.c = i - Integer.MIN_VALUE;
            } else {
                kq80Var = new kq80(this, onmVar);
            }
        } else {
            kq80Var = new kq80(this, onmVar);
        }
        Object obj = kq80Var.a;
        int i2 = kq80Var.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                g23 g23Var = (g23) this.b;
                kq80Var.c = 1;
                Object value = ((c9c0) g23Var.b).b.current().getValue();
                d9n d9nVar = d9n.a;
                if (value == null) {
                    up90 up90Var = (up90) g23Var.d;
                    up90Var.getClass();
                    objE = up90Var.e(gjb1.a, new djb1(), kq80Var);
                    if (objE != d9nVar) {
                        objE = m231Var2;
                    }
                } else {
                    objE = m231Var2;
                }
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            ae5 ae5Var = (ae5) this.c;
            String strS = nmn1.s(thA);
            t2j0 t2j0Var = ae5Var.a;
            t210 t210VarN = ExternalAccessoryRemoteError.n();
            t210VarN.n("start_jam");
            t210VarN.r();
            t210VarN.q(strS);
            t2j0Var.a(t210VarN.build());
        }
        return m231Var2;
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        int i = hsl1Var.a.i(519).b;
        h72 h72Var = (h72) this.b;
        h360.d(h72Var, i);
        ((iu30) this.c).invoke(Integer.valueOf(i));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(behaviorRetainingAppBarLayout, (k1q0) null);
        return hsl1Var;
    }

    public ro30(i8h1 i8h1Var) {
        this.a = (byte) 4;
        this.b = i8h1Var;
        this.c = new brl0((byte) 1);
    }

    public ro30(Activity activity) {
        this.a = (byte) 17;
        this.c = activity;
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{2130969954});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.b = drawable;
    }

    public ro30(Context context, q8n q8nVar) {
        this.a = (byte) 6;
        this.b = q8nVar;
        this.c = new idd1(new mo2(context, (byte) 25));
    }

    public ro30(en31 en31Var) {
        this.a = (byte) 29;
        this.b = en31Var;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public ro30(rbt rbtVar) {
        this.a = (byte) 1;
        this.b = rbtVar;
        this.c = new err0(0);
    }

    public ro30(m890 m890Var, m890 m890Var2) {
        this.a = (byte) 28;
        this.c = m890Var;
        this.b = m890Var2;
    }

    public /* synthetic */ ro30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ro30(int i, int i2) {
        this.a = (byte) 10;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public ro30(int i, int i2, int i3) {
        this.a = (byte) 10;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
