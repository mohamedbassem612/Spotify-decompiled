package p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import app.p000rive.semantics.SemanticState;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.challenges.v1.api.pub.proto.GetSessionRequest;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t7o0 implements k1q0, Function, hp80, BiFunction, qiw, SingleOnSubscribe, Function7, ya, xi7 {
    public static final re40 c = new re40((byte) 1);
    public final /* synthetic */ byte a;
    public final Object b;

    public t7o0() {
        kzi0 kzi0Var;
        this.a = (byte) 1;
        liy0 liy0Var = liy0.c;
        try {
            kzi0Var = (kzi0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            kzi0Var = c;
        }
        kzi0[] kzi0VarArr = {re40.b, kzi0Var};
        hig0 hig0Var = new hig0();
        hig0Var.a = kzi0VarArr;
        Charset charset = j290.a;
        this.b = hig0Var;
    }

    public void a(ju1 ju1Var, vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1990137923);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ju1Var) : x340Var.i(ju1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new c6(this, (lnm) null, (byte) 11);
                x340Var.s0(objT);
            }
            ven0 ven0VarQ = yto.q(z6x.a, x340Var, (vu30) objT);
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.g(ju1Var));
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new vap((ans) ((yms) this.b).a.get(), new x6o0((Object) ju1Var, (byte) 9)).a();
                x340Var.s0(objT2);
            }
            zms zmsVar = (zms) objT2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(uyn1.w(u291.f(qim0Var3, 1.0f), vzq0Var), l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            otw.c(zmsVar, new xms((List) ven0VarQ.getValue()), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, ju1Var, vzq0Var, qim0Var2, (byte) 7);
        }
    }

    public boolean accept(Object obj) {
        return ((hp4) this.b).a();
    }

    public Object apply(Object obj) {
        r2j1 q2j1Var;
        r2j1 q2j1Var2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                wq wqVar = (wq) obj;
                return ((jq) ((zq) obj2).a.get()).c(wqVar.a, wqVar.b, wqVar.c).onErrorReturn(mpi1.c).map(vrg.b).toObservable();
            case 4:
            case 6:
            case 8:
            case 9:
            case 14:
            case 16:
            case 17:
            default:
                return Single.create(new ymm0((ax4) obj2, (byte) 18));
            case 5:
                return new CompletableFromAction(new bm0((cm0) obj2, (mmr0) obj, (byte) 0));
            case 7:
                mce mceVar = ((u11) obj2).a;
                xp40 xp40VarO = GetSessionRequest.o();
                xp40VarO.n(((il40) obj).a);
                return mceVar.a(xp40VarO.build()).map(v560.c).onErrorResumeNext(qz70.c).onErrorReturn(b6j0.c);
            case 10:
                Observable observable = ((i62) obj2).b;
                h62 h62Var = h62.b;
                return observable.map(new bjx0((byte) 27)).first(new gq0("")).map(new x6o0(obj, (byte) 10));
            case 11:
                f320 f320Var = (f320) obj;
                c320 c320Var = f320Var instanceof c320 ? (c320) f320Var : null;
                if (c320Var == null) {
                    Logger.d(f4i1.f("Unexpected FieldValidationResponse type: ", f320Var.getClass().getSimpleName(), ". Expected FieldValidationResponse.Age for Birthdate validation."), new Object[0]);
                    c320Var = new c320(dk2.d);
                }
                bg2 bg2Var = (bg2) obj2;
                int i = bg2Var.a;
                int i2 = bg2Var.b;
                int i3 = bg2Var.c;
                zr7 zr7Var = c320Var.a;
                if (zr7Var instanceof bk2) {
                    q2j1Var2 = r2j1.c;
                } else {
                    if (zr7Var instanceof ck2) {
                        q2j1Var = new q2j1(new xb90(((ck2) zr7Var).d));
                    } else if (zr7Var instanceof dk2) {
                        q2j1Var2 = new q2j1(yb90.a);
                    } else if (zr7Var.equals(ak2.d)) {
                        q2j1Var2 = new q2j1(wb90.a);
                    } else {
                        if (!(zr7Var instanceof zj2)) {
                            eg.o();
                            return null;
                        }
                        q2j1Var = new q2j1(new vb90(((zj2) zr7Var).d));
                    }
                    q2j1Var2 = q2j1Var;
                }
                return new ph2(i, i2, i3, q2j1Var2);
            case 12:
                return Observable.fromIterable((List) obj).concatMap(new x6o0(obj2, (byte) 12)).toList();
            case 13:
                kk3 kk3Var = ((mk3) obj).a;
                if (kk3Var == null) {
                    return ((bl3) obj2).h(nk3.g, cl3.g);
                }
                Single singleJust = Single.just(kk3Var);
                singleJust.getClass();
                return singleJust;
            case 15:
                return Single.create(new ymm0((g84) obj2, (byte) 14));
            case 18:
                ContextTrack contextTrack = (ContextTrack) ((spq0) obj).h();
                if (contextTrack == null || !l4o1.P(contextTrack) || l4o1.U(contextTrack)) {
                    return Flowable.I(Boolean.FALSE);
                }
                return rqt0.F(o6x.a, new hi2((ys4) obj2, contextTrack, (lnm) null, (byte) 16)).toFlowable().N(Boolean.FALSE);
        }
    }

    public fp80 b() {
        o0i o0iVar = (o0i) ((q9l1) this.b).c.getValue();
        if (o0iVar != null) {
            return o0iVar.e.b();
        }
        return null;
    }

    public void c() {
        rm5 rm5Var = (rm5) this.b;
        if (dhn.a.contains(rm5Var)) {
            return;
        }
        try {
            gm5.c(1);
        } catch (Throwable th) {
            dhn.a(rm5Var, th);
        }
    }

    public odf0 d(Context context, String str, InputStream inputStream, String str2, String str3) {
        odf0 odf0VarH;
        e420 e420Var;
        x6o0 x6o0Var = (x6o0) this.b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            nue0.a();
            e420 e420Var2 = e420.ZIP;
            odf0VarH = str3 != null ? kcf0.h(context, new ZipInputStream(new FileInputStream(x6o0Var.u(str, inputStream, e420Var2))), str) : kcf0.h(context, new ZipInputStream(inputStream), (String) null);
            e420Var = e420Var2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            nue0.a();
            e420Var = e420.GZIP;
            odf0VarH = str3 != null ? kcf0.c(new GZIPInputStream(new FileInputStream(x6o0Var.u(str, inputStream, e420Var))), str) : kcf0.c(new GZIPInputStream(inputStream), (String) null);
        } else {
            nue0.a();
            e420Var = e420.JSON;
            odf0VarH = str3 != null ? kcf0.c(new FileInputStream(x6o0Var.u(str, inputStream, e420Var).getAbsolutePath()), str) : kcf0.c(inputStream, (String) null);
        }
        if (str3 != null && odf0VarH.a != null) {
            File file = new File(x6o0Var.r(), x6o0.f(str, e420Var, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            nue0.a();
            if (!zRenameTo) {
                nue0.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return odf0VarH;
    }

    public Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        fwq fwqVar = (fwq) obj;
        sfu0 sfu0Var = (sfu0) obj3;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj7).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
        y87 y87Var = (y87) this.b;
        boolean zO = y87Var.g.o();
        qdy0 qdy0Var = y87Var.a;
        return fwq.a(fwqVar, (ArrayList) null, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, sfu0Var, zO, qdy0Var.c, qdy0Var.d, 131);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((Observable) ((ct8) this.b).b.invoke()).firstOrError().map(new bt8(intent, (byte) 0)).onErrorReturn(ns80.Z);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 16:
                hg4 hg4Var = (hg4) obj;
                luk lukVar = hg4Var.c;
                if (lukVar == null || !lukVar.i("android-feature-kidsmode.debug_is_in_kids_mode")) {
                    lukVar = hg4Var.d;
                }
                if (lukVar != null) {
                    lukVar.e(new p54(singleEmitter, hg4Var, (byte) 4));
                }
                break;
            case 17:
                ek4 ek4Var = (ek4) obj;
                luk lukVar2 = ek4Var.i;
                if (lukVar2 == null || !lukVar2.i("android-gen-alpha-blocking.is_managed_accounts_request_settings_page_enabled")) {
                    lukVar2 = ek4Var.j;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new dk4(singleEmitter, ek4Var, (byte) 3));
                }
                break;
            case 18:
            case 19:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar3 = m26Var.r;
                if (lukVar3 == null || !lukVar3.i("apps-music-libs-eventsender.rate_limiting_rule_2_time_unit_seconds")) {
                    lukVar3 = m26Var.s;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new k26(singleEmitter, m26Var, (byte) 10));
                }
                break;
            case 20:
                b25 b25Var = (b25) obj;
                luk lukVar4 = b25Var.b;
                if (lukVar4 == null || !lukVar4.i("android-storage-settings-cachelimit.show_cache_limit_item")) {
                    lukVar4 = b25Var.c;
                }
                if (lukVar4 != null) {
                    lukVar4.e(new p54(singleEmitter, b25Var, (byte) 10));
                }
                break;
        }
    }

    public void v(Object obj) {
        String string;
        x3p1 p51Var;
        x3p1 o51Var;
        String string2;
        x3p1 g51Var;
        String strC;
        int i;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                s31 s31Var = (s31) obj;
                v51 v51Var = (v51) obj2;
                PublishSubject publishSubject = v51Var.Z;
                boolean z = v51Var.e;
                gid gidVar = v51Var.a;
                View view = v51Var.N0;
                if (s31Var != null) {
                    String str = s31Var.b;
                    int i2 = s31Var.a;
                    bk8 bk8Var = s31Var.d;
                    a31 a31Var = s31Var.c;
                    boolean z2 = a31Var instanceof u21;
                    String title = z2 ? ((u21) a31Var).getTitle() : a31Var instanceof z21 ? ((z21) a31Var).a : view.getContext().getString(2131955699);
                    String string3 = "";
                    if (z2) {
                        string = ((u21) a31Var).b();
                    } else if (a31Var instanceof z21) {
                        string = o7h.y0(((z21) a31Var).b, "\n", (String) null, (String) null, (iu30) null, 62);
                    } else if (a31Var instanceof j31) {
                        string = view.getContext().getString(2131955700);
                    } else if (a31Var instanceof y21) {
                        string = ((y21) a31Var).a ? view.getContext().getString(2131955700) : "";
                        string.getClass();
                    } else {
                        string = "";
                    }
                    if (a31Var instanceof w21) {
                        p51Var = new h51(title, string);
                    } else if (a31Var instanceof y21) {
                        if (((y21) a31Var).a) {
                            p51Var = new p51(title, string, bk8Var);
                        } else {
                            g51Var = new g51(title, string, bk8Var, false);
                            p51Var = g51Var;
                        }
                    } else if ((a31Var instanceof o31) || (a31Var instanceof p31) || (a31Var instanceof j31)) {
                        p51Var = new p51(title, string, bk8Var);
                    } else if (a31Var instanceof k31) {
                        p51Var = new m51(((k31) a31Var).a);
                    } else if (a31Var instanceof z21) {
                        g51Var = new g51(title, string, bk8Var, false);
                        p51Var = g51Var;
                    } else if (a31Var instanceof q31) {
                        p51Var = new g51(title, string, null, true);
                    } else if (a31Var instanceof a31) {
                        bk8 bk8Var2 = a31Var.a;
                        int i3 = bk8Var2 == null ? -1 : r51.a[bk8Var2.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            string2 = view.getContext().getString(2131955719);
                        } else if (i3 == 3) {
                            string2 = view.getContext().getString(2131958007);
                        } else if (i3 == 4) {
                            string2 = view.getContext().getString(2131960737);
                        } else if (i3 != 5) {
                            string2 = view.getContext().getString(2131955699);
                        } else {
                            string2 = z ? view.getContext().getString(2131960739) : view.getContext().getString(2131960737);
                        }
                        string2.getClass();
                        int i4 = bk8Var2 == null ? -1 : r51.a[bk8Var2.ordinal()];
                        if (i4 == 4) {
                            string3 = view.getContext().getString(2131960736);
                        } else if (i4 == 5) {
                            string3 = z ? view.getContext().getString(2131960738) : view.getContext().getString(2131960736);
                        }
                        string3.getClass();
                        p51Var = new i51(string2, string3, bk8Var2);
                    } else if (a31Var instanceof b31) {
                        p51Var = new j51(view.getContext().getString(2131955702), view.getContext().getString(2131955683));
                    } else {
                        boolean z3 = a31Var instanceof m31;
                        x3p1 x3p1Var = e51.c;
                        if (z3) {
                            ((ohv0) gidVar.b).a(new jhv0("adaptive_authentication", "session_terminated_during_authentication", 4, ((m31) a31Var).a));
                            publishSubject.onNext(new t41(null));
                        } else if (a31Var instanceof x21) {
                            publishSubject.onNext(((x21) a31Var).a ? r41.a : new t41(null));
                        } else if (!(a31Var instanceof l31)) {
                            if (a31Var instanceof g31) {
                                p51Var = new k51(((g31) a31Var).a);
                            } else if (a31Var instanceof i31) {
                                p51Var = new g51(title, string, null, true);
                            } else if (a31Var instanceof h31) {
                                ((ohv0) gidVar.b).a(new khv0("adaptive_authentication", 4, (Map) null, "missing_challenge"));
                                p51Var = new g51(title, string, null, true);
                            } else if (a31Var instanceof n31) {
                                o51Var = new o51(title, string, v51Var.b || v51Var.c);
                                p51Var = o51Var;
                            } else if (!(a31Var instanceof v21)) {
                                eg.o();
                            } else {
                                v21 v21Var = (v21) a31Var;
                                p51Var = new f51(v21Var.a, v21Var.b);
                            }
                            break;
                        } else {
                            g2d1 g2d1Var = ((l31) a31Var).a;
                            if (g2d1Var instanceof y1d1) {
                                o51Var = new g51(title, string, null, false);
                                p51Var = o51Var;
                            } else {
                                if (u890.j(g2d1Var, z1d1.a)) {
                                    title = view.getContext().getString(2131955747);
                                } else if (u890.j(g2d1Var, a2d1.a)) {
                                    title = view.getContext().getString(2131955748);
                                } else if (u890.j(g2d1Var, d2d1.a)) {
                                    title = view.getContext().getString(2131955749);
                                } else if (u890.j(g2d1Var, e2d1.a)) {
                                    title = view.getContext().getString(2131955750);
                                } else {
                                    u890.j(g2d1Var, y1d1.a);
                                }
                                title.getClass();
                                p51Var = new n51(title, g2d1Var, bk8Var);
                            }
                        }
                        p51Var = x3p1Var;
                    }
                    v51Var.a(p51Var);
                    ohv0 ohv0Var = (ohv0) gidVar.b;
                    String str2 = "email";
                    switch (l1d.C(i2)) {
                        case 0:
                            break;
                        case 1:
                            String str3 = null;
                            int i5 = bk8Var != null ? z01.a[bk8Var.ordinal()] : -1;
                            if (i5 == 1) {
                                str3 = "email";
                            } else if (i5 == 2) {
                                str3 = "phone_number";
                            } else if (i5 == 3) {
                                str3 = "google";
                            } else if (i5 == 4) {
                                str3 = "graduation_email";
                            }
                            ohv0Var.a(new jhv0("adaptive_authentication", str3 != null ? "adaptive_auth_api_create_".concat(str3) : "adaptive_auth_api_create", "none", str));
                            break;
                        case 2:
                            gidVar.m(24, str);
                            break;
                        case 3:
                            gidVar.m(23, str);
                            if (u890.j(str, "failure")) {
                                ohv0Var.a(new khv0("adaptive_authentication", 4, (Map) null, "adaptiveauth_failed_challenge"));
                            }
                            break;
                        case 4:
                            int i6 = bk8Var != null ? z01.a[bk8Var.ordinal()] : -1;
                            if (i6 != 1) {
                                str2 = i6 != 2 ? i6 != 3 ? null : "google" : "phone_number";
                            }
                            if (a31Var instanceof a31) {
                                strC = "invalid_credentials";
                            } else if (a31Var instanceof j31) {
                                Integer num = ((j31) a31Var).a;
                                strC = num != null ? f4i1.c(num.intValue(), "network_") : "network";
                            } else if (a31Var instanceof b31) {
                                strC = "invalid_phone_number";
                            } else if (a31Var instanceof p31) {
                                Integer num2 = ((p31) a31Var).a;
                                strC = num2 != null ? f4i1.c(num2.intValue(), "unexpected_") : "unexpected";
                            } else {
                                strC = ((a31Var instanceof g31) && u890.j(((g31) a31Var).a, e31.a)) ? "region_mismatch" : null;
                            }
                            ohv0Var.a(new jhv0("adaptive_authentication", str2 != null ? "error_sdk_auth-client_start_".concat(str2) : "error_sdk_auth-client_start", "none", strC));
                            if (a31Var instanceof a31) {
                                if (a31Var.a != bk8.b) {
                                    i = 4;
                                } else if (z01.b[l1d.C(i2)] != 1) {
                                    eg.m("Unsupported Error Source");
                                } else {
                                    i = 4;
                                    ohv0Var.a(new jhv0("adaptive_authentication", "error_sdk_auth-client-authenticate_one-time-token", 4, "invalid_credentials"));
                                }
                                ohv0Var.a(new khv0("adaptive_authentication", i, (Map) null, "invalid_credentials"));
                                break;
                            } else if (a31Var instanceof i31) {
                                ohv0Var.a(new jhv0("adaptive_authentication", "login_while_session_already_exists", 12, (String) null));
                                break;
                            } else if ((a31Var instanceof g31) && (((g31) a31Var).a instanceof e31)) {
                                ohv0Var.a(new khv0("adaptive_authentication", 4, (Map) null, "region_mismatch"));
                                break;
                            }
                            break;
                        case 5:
                            gidVar.m(25, (String) null);
                            break;
                        case 6:
                            gidVar.m(26, (String) null);
                            break;
                        case 7:
                            ohv0Var.a(new khv0("adaptive_authentication", 4, (Map) null, "adaptiveauth_failed_challenge"));
                            break;
                        case 8:
                            ohv0Var.a(new khv0("adaptive_authentication", 4, (Map) null, "otp_request_failure"));
                            break;
                        case 9:
                            ohv0Var.a(new khv0("adaptive_authentication", 4, (Map) null, "otp_request_failure"));
                            ohv0Var.a(new jhv0("adaptive_authentication", "error_sdk_auth-client_resend-code", 4, str));
                            break;
                        default:
                            eg.o();
                            break;
                    }
                }
                break;
            default:
                x04 x04Var = (x04) obj;
                b14 b14Var = (b14) obj2;
                EncoreButton encoreButton = (EncoreButton) b14Var.e;
                if (x04Var instanceof v04) {
                    encoreButton.setText(2131952332);
                    idd1 idd1Var = rg10.a;
                    encoreButton.setAlpha(0.0f);
                    encoreButton.setVisibility(0);
                    encoreButton.animate().alpha(1.0f).setInterpolator((Interpolator) rg10.a.getValue()).setDuration(200L).start();
                } else if (!(x04Var instanceof w04)) {
                    eg.o();
                } else {
                    idd1 idd1Var2 = rg10.a;
                    encoreButton.animate().alpha(0.0f).setDuration(200L).setInterpolator((Interpolator) rg10.a.getValue()).withEndAction(new ai(encoreButton, (byte) 2)).start();
                    a14 a14Var = new a14(b14Var, (byte) 0);
                    if (!((AtomicBoolean) b14Var.c).getAndSet(true)) {
                        a14Var.invoke();
                    }
                }
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = nk80VarI.b;
        view.setLayoutParams(marginLayoutParams);
        u961 u961Var = ((AccountPickerActivity) this.b).g1;
        if (u961Var == null) {
            u890.C("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) u961Var.c;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), nk80VarI.d);
        return hsl1.b;
    }

    public /* synthetic */ t7o0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }

    public t7o0(gg2 gg2Var, bg2 bg2Var) {
        this.a = (byte) 11;
        this.b = bg2Var;
    }

    public t7o0(Context context) {
        this.a = (byte) 21;
        this.b = new rm5(context, (String) null);
    }

    public /* synthetic */ t7o0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        ((j62) this.b).g((String) obj, (fvf1) obj2);
        return rih1.a;
    }
}
