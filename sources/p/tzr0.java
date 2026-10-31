package p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.spotify.login.credentialmanager.passkeys.MissingIdentityAssertionException;
import com.spotify.login.credentialmanager.passkeys.PasskeysApiException;
import com.spotify.passkeys.v1.FinishAuthenticationResponse;
import com.spotify.passkeys.v1.StartRegistrationResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tzr0 implements Function, ObservableOnSubscribe {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public tzr0(xrc0 xrc0Var, iyc0 iyc0Var, mzc0 mzc0Var) {
        this.a = (byte) 29;
        this.b = xrc0Var;
        this.c = iyc0Var;
        this.d = mzc0Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.d0();
        sku0VarP.R();
        sku0VarP.G();
        sku0VarP.C();
        hru0VarS.w(sku0VarP.build());
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        this.e = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
    }

    public static void k(tzr0 tzr0Var, String str, tv80 tv80Var, Bundle bundle, int i) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        oxf oxfVar = (i & 8) != 0 ? oxf.b : mxf.b;
        tzr0Var.getClass();
        new Handler(Looper.getMainLooper()).post(new n9m(str, tv80Var, bundle2, tzr0Var, oxfVar));
    }

    public static nbx0 u(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        if (u890.j(type, nyu0.e) || u890.j(type, wyu0.f)) {
            return ibx0.a;
        }
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal == 44) {
            return dbx0.a;
        }
        if (iOrdinal == 704) {
            return jbx0.a;
        }
        n57.e("Unexpected uri: ".concat(str));
        return mbx0.a;
    }

    public void a(bpb1 bpb1Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1527496927);
        int i2 = (b0kVar2.i(bpb1Var) ? 4 : 2) | i | (b0kVar2.i(this) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarK = f4p1.k(bpb1Var, null, b0kVar2, 7);
            ulc ulcVar = (ulc) this.d;
            zpu0 zpu0Var = (zpu0) ven0VarK.getValue();
            boolean zI = b0kVar2.i(ven0VarK) | b0kVar2.i(this);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                objT = new wpu0(ven0VarK, this, (byte) 1);
                b0kVar2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = b0kVar2.i(ven0VarK) | b0kVar2.i(this);
            Object objT2 = b0kVar2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new hws0(ven0VarK, this, (byte) 12);
                b0kVar2.s0(objT2);
            }
            ulcVar.f(zpu0Var, function0, (vu30) objT2, b0kVar2, 3072);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(this, bpb1Var, i, (byte) 13);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 17:
                xtv0 xtv0Var = (xtv0) obj;
                Single singleF = ((mzr0) obj3).f(xtv0Var.a, (String) null, xtv0Var.d, xtv0Var.c);
                rrv0 rrv0Var = (rrv0) this.d;
                return singleF.doOnSubscribe(new fuv0(rrv0Var, (byte) 4)).doOnDispose(new guv0(rrv0Var, (byte) 1)).doOnSuccess(new fuv0(rrv0Var, (byte) 5)).map(new n0v0((zhq0) this.e, (byte) 4)).map(new vgq0((gal) obj2, (byte) 16)).doOnSuccess(new fuv0(rrv0Var, (byte) 6)).map(zj20.a1).doOnError(new fuv0(rrv0Var, (byte) 7)).onErrorReturn(new hwb((byte) 20));
            case 21:
                ozv0 ozv0Var = (ozv0) obj;
                q2w0 q2w0Var = (q2w0) obj3;
                lik1 lik1Var = (lik1) obj2;
                String str = (String) this.e;
                String str2 = (String) this.d;
                String str3 = ozv0Var.a;
                int i = ozv0Var.d;
                String str4 = ozv0Var.b;
                Uri uri = (str4 == null || str4.length() == 0) ? Uri.EMPTY : Uri.parse(str4);
                uri.getClass();
                igm igmVar = new igm(str2, new wfm(uri, xfm.c), str3);
                smc0 smc0VarN = k4p1.n();
                int i2 = ozv0Var.c;
                e2t0 e2t0Var = e2t0.e;
                e2t0 e2t0Var2 = e2t0.d;
                if (i2 == 1) {
                    dlg1 dlg1Var = q2w0Var.c;
                    if (p2w0.a[l1d.C(i)] == 1) {
                        e2t0Var = e2t0Var2;
                    }
                    smc0VarN.add(dlg1Var.i(str, e2t0Var));
                } else if (i2 != 4) {
                    tzr0 tzr0Var = q2w0Var.a;
                    if (p2w0.a[l1d.C(i)] == 1) {
                        e2t0Var = e2t0Var2;
                    }
                    smc0VarN.add(tzr0Var.g(str, e2t0Var, lik1Var));
                }
                return new kjm(igmVar, k4p1.k(smc0VarN), 4);
            default:
                String str5 = (String) obj;
                mzr0 mzr0Var = (mzr0) obj3;
                agu0 agu0Var = (vfu0) mzr0Var.d;
                zwu0 zwu0Var = (zwu0) obj2;
                List list = zwu0Var.c;
                String str6 = zwu0Var.b;
                String str7 = zwu0Var.k;
                String str8 = (String) this.e;
                return agu0Var.b(new ufu0(str5, str8, str7, str6, list)).h(mux0.b).g(new nux0(mzr0Var, str8, zwu0Var, (String) this.d, (byte) 0));
        }
    }

    public dt71 b(long j) {
        d18 d18Var = (d18) this.d;
        if (d18Var != null) {
            if (Math.abs(j - d18Var.a) > 2000) {
                d18Var = null;
            }
            if (d18Var != null) {
                return (dt71) d18Var.c;
            }
        }
        d18 d18Var2 = (d18) this.d;
        if (d18Var2 != null) {
            ((xab1) d18Var2.b).d((CancellationException) null);
        }
        m441 m441Var = new m441(new mug((ggv0) this.e, this, j, (lnm) null, (byte) 5));
        c9n c9nVar = (c9n) this.c;
        d18 d18Var3 = new d18();
        d18Var3.a = j;
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        d18Var3.b = l4p1.u(c9nVar, new fu20(m441Var, new nsm0(2, dt71VarE, sen0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 8), (byte) 1));
        d18Var3.c = dt71VarE;
        this.d = d18Var3;
        return (dt71) d18Var3.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(iu30 iu30Var, onm onmVar) {
        p4s0 p4s0Var;
        PasskeysApiException.UnexpectedHttpError invalidRequest;
        PasskeysApiException.UnexpectedHttpError unexpectedHttpError;
        if (onmVar instanceof p4s0) {
            p4s0Var = (p4s0) onmVar;
            int i = p4s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p4s0Var.c = i - Integer.MIN_VALUE;
            } else {
                p4s0Var = new p4s0(this, onmVar);
            }
        } else {
            p4s0Var = new p4s0(this, onmVar);
        }
        Object obj = p4s0Var.a;
        int i2 = p4s0Var.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            p4s0Var.c = 1;
            Object objInvoke = iu30Var.invoke(p4s0Var);
            d9n d9nVar = d9n.a;
            return objInvoke == d9nVar ? d9nVar : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (HttpException e2) {
            int i3 = e2.a;
            if (i3 == 400) {
                invalidRequest = new PasskeysApiException.InvalidRequest(400, e2);
            } else if (i3 == 401) {
                invalidRequest = new PasskeysApiException.Unauthenticated(401, e2);
            } else if (i3 == 403) {
                invalidRequest = new PasskeysApiException.Forbidden(403, e2);
            } else if (i3 == 404) {
                invalidRequest = new PasskeysApiException.CredentialNotFound(404, e2);
            } else {
                if (i3 != 410) {
                    if (i3 != 503) {
                        unexpectedHttpError = new PasskeysApiException.UnexpectedHttpError(i3, e2);
                    } else {
                        invalidRequest = new PasskeysApiException.ServiceUnavailable(503, e2);
                    }
                    return new m231(unexpectedHttpError);
                }
                invalidRequest = new PasskeysApiException.SessionGone(410, e2);
            }
            unexpectedHttpError = invalidRequest;
            return new m231(unexpectedHttpError);
        } catch (Exception e3) {
            return new m231(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(wa71 wa71Var, onm onmVar) throws Throwable {
        wxv0 wxv0Var;
        String m231Var;
        if (onmVar instanceof wxv0) {
            wxv0Var = (wxv0) onmVar;
            int i = wxv0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wxv0Var.d = i - Integer.MIN_VALUE;
            } else {
                wxv0Var = new wxv0(this, onmVar);
            }
        } else {
            wxv0Var = new wxv0(this, onmVar);
        }
        Object objH = wxv0Var.b;
        int i2 = wxv0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                xyc0 xyc0Var = (iyc0) this.e;
                String str = wa71Var.a;
                wls0 wls0Var = wls0.d;
                wxv0Var.a = wa71Var;
                wxv0Var.d = 1;
                xyc0 xyc0Var2 = xyc0Var;
                objH = c921.H(xyc0Var2.c, new z290(wls0Var, str, xyc0Var2, (lnm) null, (byte) 12), wxv0Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wa71Var = wxv0Var.a;
                hm5.M(objH);
            }
            m231Var = ((cyc0) ((py21) objH).d()).a;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str2 = m231Var;
        if (str2 == null || str2.length() == 0) {
            return wa71Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) wa71Var.c);
        linkedHashMap.put("pt", str2);
        return wa71.a(wa71Var, null, mqo1.G(linkedHashMap), null, 123);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[PHI: r15
      0x00c9: PHI (r15v10 java.lang.Object) = (r15v9 java.lang.Object), (r15v1 java.lang.Object) binds: [B:37:0x00c6, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        if (r13.a(r14, r7) == r11) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p.day0 r14, p.onm r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tzr0.e(p.day0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:19:0x0043, B:70:0x0135, B:39:0x009b, B:43:0x00a4, B:44:0x00a9, B:46:0x00bf, B:48:0x00cc, B:34:0x007c, B:36:0x0083), top: B:104:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #4 {all -> 0x013c, blocks: (B:52:0x00e7, B:54:0x00ee, B:57:0x00fd, B:59:0x0103, B:61:0x0109, B:63:0x011a, B:79:0x0141, B:80:0x0148), top: B:110:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103 A[Catch: all -> 0x013c, TryCatch #4 {all -> 0x013c, blocks: (B:52:0x00e7, B:54:0x00ee, B:57:0x00fd, B:59:0x0103, B:61:0x0109, B:63:0x011a, B:79:0x0141, B:80:0x0148), top: B:110:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141 A[Catch: all -> 0x013c, TRY_ENTER, TryCatch #4 {all -> 0x013c, blocks: (B:52:0x00e7, B:54:0x00ee, B:57:0x00fd, B:59:0x0103, B:61:0x0109, B:63:0x011a, B:79:0x0141, B:80:0x0148), top: B:110:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0155  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0163  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a7, code lost:
    
        if (r0.a(r1, r9) == r14) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p.ogb1 r18, p.onm r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tzr0.f(p.ogb1, p.onm):java.lang.Object");
    }

    public jhm g(String str, e2t0 e2t0Var, lik1 lik1Var) {
        int i;
        switch (e2t0Var.ordinal()) {
            case 0:
                i = 2131954401;
                break;
            case 1:
                i = 2131954403;
                break;
            case 2:
                i = 2131954404;
                break;
            case 3:
                i = 2131954402;
                break;
            case 4:
                i = 2131954405;
                break;
            case 5:
                i = 2131954406;
                break;
            case 6:
                i = 2131954407;
                break;
            case 7:
                i = 2131954409;
                break;
            case 8:
                i = 2131954414;
                break;
            case 9:
                i = 2131954415;
                break;
            case 10:
                i = 2131954413;
                break;
            case 11:
                i = 2131954412;
                break;
            case 12:
                ((npm1) this.c).getClass();
                i = !str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") ? 2131954410 : 2131954408;
                break;
            case 13:
                i = 2131954411;
                break;
            default:
                eg.o();
                return null;
        }
        return new jhm("your_library_pin_to_your_library", wpx.c, (fhm) null, Integer.valueOf(i), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(egs0.V0, new atp0(str, (byte) 21)), new mvn0((Object) this, (Object) str, (Object) lik1Var, (byte) 20)), 244);
    }

    public obx0 h(obx0 obx0Var, eww0 eww0Var) {
        String str = eww0Var.c;
        if (!((gdx0) this.e).a.s()) {
            str = null;
        }
        return obx0.a(obx0Var, (nbx0) null, eww0Var.b, str, (String) o7h.s0(eww0Var.e), (q730) null, Integer.valueOf(eww0Var.g), 0, 3043);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v8, types: [byte[], java.io.Serializable] */
    public Serializable i(j4s0 j4s0Var, byte[] bArr, onm onmVar) {
        q4s0 q4s0Var;
        Object objC;
        if (onmVar instanceof q4s0) {
            q4s0Var = (q4s0) onmVar;
            int i = q4s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q4s0Var.c = i - Integer.MIN_VALUE;
            } else {
                q4s0Var = new q4s0(this, onmVar);
            }
        } else {
            q4s0Var = new q4s0(this, onmVar);
        }
        Object obj = q4s0Var.a;
        int i2 = q4s0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            iu30 l24Var = new l24(this, j4s0Var, bArr, (lnm) null, (byte) 14);
            q4s0Var.c = 1;
            objC = c(l24Var, q4s0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objC = ((e331) obj).a;
        }
        Throwable thA = e331.a(objC);
        if (thA != null) {
            return new m231(thA);
        }
        FinishAuthenticationResponse finishAuthenticationResponse = (FinishAuthenticationResponse) objC;
        return finishAuthenticationResponse.o() ? finishAuthenticationResponse.n().o().t() : new m231(new MissingIdentityAssertionException());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, StartRegistrationResponse startRegistrationResponse, onm onmVar) {
        r4s0 r4s0Var;
        if (onmVar instanceof r4s0) {
            r4s0Var = (r4s0) onmVar;
            int i = r4s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r4s0Var.c = i - Integer.MIN_VALUE;
            } else {
                r4s0Var = new r4s0(this, onmVar);
            }
        } else {
            r4s0Var = new r4s0(this, onmVar);
        }
        Object obj = r4s0Var.a;
        int i2 = r4s0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        iu30 l24Var = new l24(this, str, startRegistrationResponse, (lnm) null, (byte) 15);
        r4s0Var.c = 1;
        Object objC = c(l24Var, r4s0Var);
        Object obj2 = d9n.a;
        return objC == obj2 ? obj2 : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable l(String str, String str2, onm onmVar) {
        guu0 guu0Var;
        xj61 xj61Var;
        xj61 xj61Var2;
        if (onmVar instanceof guu0) {
            guu0Var = (guu0) onmVar;
            int i = guu0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                guu0Var.f = i - Integer.MIN_VALUE;
            } else {
                guu0Var = new guu0(this, onmVar);
            }
        } else {
            guu0Var = new guu0(this, onmVar);
        }
        Object obj = guu0Var.d;
        int i2 = guu0Var.f;
        if (i2 == 0) {
            hm5.M(obj);
            xj61 xj61Var3 = new xj61();
            guu0Var.a = str2;
            guu0Var.b = xj61Var3;
            guu0Var.c = xj61Var3;
            guu0Var.f = 1;
            Object objM = m(str, guu0Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
            xj61Var = xj61Var3;
            obj = objM;
            xj61Var2 = xj61Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xj61Var2 = guu0Var.c;
            xj61Var = guu0Var.b;
            str2 = guu0Var.a;
            hm5.M(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            xj61Var2.add(euu0.a);
        }
        if (str2 != null) {
            xj61Var2.add(fuu0.a);
        }
        return cwl1.j(xj61Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, onm onmVar) {
        huu0 huu0Var;
        Boolean m231Var;
        boolean zBooleanValue;
        qp31 qp31Var;
        if (onmVar instanceof huu0) {
            huu0Var = (huu0) onmVar;
            int i = huu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                huu0Var.d = i - Integer.MIN_VALUE;
            } else {
                huu0Var = new huu0(this, onmVar);
            }
        } else {
            huu0Var = new huu0(this, onmVar);
        }
        Object objK = huu0Var.b;
        int i2 = huu0Var.d;
        boolean z = false;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                ezc ezcVarG = yoi1.g(((uu00) this.c).b(new oi("yourlibrary-playlist-skubb-operations", false, new zqu0(str, (byte) 3))));
                huu0Var.a = str;
                huu0Var.d = 1;
                objK = b5p1.k(ezcVarG, huu0Var);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = huu0Var.a;
                hm5.M(objK);
            }
            uv00 uv00Var = (uv00) objK;
            m231Var = (uv00Var == null || (qp31Var = uv00Var.a(qp31.class, str).b) == null) ? null : Boolean.valueOf(qp31Var.a);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Boolean bool = m231Var instanceof m231 ? null : m231Var;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            ((agc0) this.b).getClass();
            if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str, "spotify:user:", false) || !nhc1.R(str, ":collection", false))) {
                ((xrm1) this.d).getClass();
                if (!xrm1.a(str) && !str.equals("spotify:local-files")) {
                    ((upp0) this.e).getClass();
                    if (!upp0.b(str)) {
                        z = true;
                    }
                }
            }
            zBooleanValue = z;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, cns0 cns0Var, onm onmVar) {
        wms0 wms0Var;
        if (onmVar instanceof wms0) {
            wms0Var = (wms0) onmVar;
            int i = wms0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wms0Var.d = i - Integer.MIN_VALUE;
            } else {
                wms0Var = new wms0(this, onmVar);
            }
        } else {
            wms0Var = new wms0(this, onmVar);
        }
        Object objP = wms0Var.b;
        int i2 = wms0Var.d;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objP);
            if (((b0a0) this.d).a()) {
                wms0Var.a = cns0Var;
                wms0Var.d = 1;
                objP = p(str, wms0Var);
                if (objP != obj) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objP);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cns0Var = wms0Var.a;
        hm5.M(objP);
        zms0 zms0Var = new zms0((String) objP, cns0Var);
        q8n q8nVar = (q8n) this.e;
        rwm0 rwm0Var = new rwm0(this, (Object) null, zms0Var, (lnm) null, (byte) 15);
        wms0Var.a = null;
        wms0Var.d = 2;
        return fn31.Y(q8nVar, rwm0Var, wms0Var) == obj ? obj : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(List list, x8d1 x8d1Var, Uri uri, onm onmVar) {
        uxv0 uxv0Var;
        if (onmVar instanceof uxv0) {
            uxv0Var = (uxv0) onmVar;
            int i = uxv0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxv0Var.c = i - Integer.MIN_VALUE;
            } else {
                uxv0Var = new uxv0(this, onmVar);
            }
        } else {
            uxv0Var = new uxv0(this, onmVar);
        }
        Object objA = uxv0Var.a;
        int i2 = uxv0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            if (!aq8.B(list) && (x8d1Var instanceof t8d1)) {
                k3i0 k3i0Var = (k3i0) this.d;
                Uri uri2 = ((t8d1) x8d1Var).a;
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                uxv0Var.c = 1;
                objA = saw0.a(k3i0Var, uri2, uri, uxv0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        Uri uri3 = (Uri) objA;
        String string = uri3 != null ? uri3.toString() : null;
        if (string != null) {
            return new bkc0(string, (String) null, 62, (String) null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(String str, onm onmVar) {
        xms0 xms0Var;
        if (onmVar instanceof xms0) {
            xms0Var = (xms0) onmVar;
            int i = xms0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xms0Var.c = i - Integer.MIN_VALUE;
            } else {
                xms0Var = new xms0(this, onmVar);
            }
        } else {
            xms0Var = new xms0(this, onmVar);
        }
        Object objJ = xms0Var.a;
        int i2 = xms0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = ((v5n) this.c).a(str);
            xms0Var.c = 1;
            objJ = fc11.j(singleA, xms0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) throws NoWhenBranchMatchedException {
        pyx0 pyx0Var;
        boolean zB;
        boolean zB2;
        if (onmVar instanceof pyx0) {
            pyx0Var = (pyx0) onmVar;
            int i = pyx0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pyx0Var.d = i - Integer.MIN_VALUE;
            } else {
                pyx0Var = new pyx0(this, onmVar);
            }
        } else {
            pyx0Var = new pyx0(this, onmVar);
        }
        Object objD = pyx0Var.b;
        d9n d9nVar = d9n.a;
        int i2 = pyx0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                w420 w420Var = (vyx0) this.b;
                String str2 = (String) this.e;
                w420 w420Var2 = w420Var;
                synchronized (w420Var2) {
                    v420 v420VarC = w420Var2.c(str2);
                    v420VarC.a();
                    zB2 = v420VarC.b(str);
                }
                if (!zB2) {
                    return rih1.a;
                }
                gid gidVar = (vwx0) this.c;
                String str3 = (String) this.e;
                pyx0Var.a = str;
                pyx0Var.d = 1;
                objD = gidVar.d(str3, pyx0Var);
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = pyx0Var.a;
                hm5.M(objD);
            }
            twx0 twx0Var = (uwx0) objD;
            if (twx0Var instanceof twx0) {
                zB = ((vyx0) this.b).a((String) this.e, str, twx0Var.a);
            } else {
                if (!u890.j(twx0Var, swx0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zB = ((vyx0) this.b).b((String) this.e, str);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            zB = ((vyx0) this.b).b((String) this.e, str);
        }
        if (zB) {
            ((g1x0) this.d).invoke();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(onm onmVar) {
        s4s0 s4s0Var;
        if (onmVar instanceof s4s0) {
            s4s0Var = (s4s0) onmVar;
            int i = s4s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4s0Var.c = i - Integer.MIN_VALUE;
            } else {
                s4s0Var = new s4s0(this, onmVar);
            }
        } else {
            s4s0Var = new s4s0(this, onmVar);
        }
        Object obj = s4s0Var.a;
        int i2 = s4s0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (!((g1f0) this.b).p()) {
            return null;
        }
        iu30 t4s0Var = new t4s0(this, (lnm) null, (byte) 0);
        s4s0Var.c = 1;
        Object objC = c(t4s0Var, s4s0Var);
        Object obj2 = d9n.a;
        return objC == obj2 ? obj2 : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(onm onmVar) {
        u4s0 u4s0Var;
        if (onmVar instanceof u4s0) {
            u4s0Var = (u4s0) onmVar;
            int i = u4s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4s0Var.c = i - Integer.MIN_VALUE;
            } else {
                u4s0Var = new u4s0(this, onmVar);
            }
        } else {
            u4s0Var = new u4s0(this, onmVar);
        }
        Object obj = u4s0Var.a;
        int i2 = u4s0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (!((g1f0) this.b).n()) {
            return null;
        }
        t4s0 t4s0Var = new t4s0(this, (lnm) null, (byte) 1);
        u4s0Var.c = 1;
        Object objC = c(t4s0Var, u4s0Var);
        d9n d9nVar = d9n.a;
        return objC == d9nVar ? d9nVar : objC;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        kp5 kp5Var = (kp5) this.b;
        obx0 obx0Var = (obx0) this.c;
        Integer num = obx0Var.X;
        String str = (String) this.e;
        y8x0 y8x0Var = (y8x0) this.d;
        kp5Var.z(num, str, y8x0Var.d, obx0Var.e, obx0Var.c, new d4v0(observableEmitter, str, y8x0Var, (byte) 7), new n1r(observableEmitter, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(String str, String str2, onm onmVar) {
        o0y0 o0y0Var;
        if (onmVar instanceof o0y0) {
            o0y0Var = (o0y0) onmVar;
            int i = o0y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0y0Var.c = i - Integer.MIN_VALUE;
            } else {
                o0y0Var = new o0y0(this, onmVar);
            }
        } else {
            o0y0Var = new o0y0(this, onmVar);
        }
        Object obj = o0y0Var.a;
        int i2 = o0y0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        mzc0 mzc0Var = (mzc0) this.d;
        o0y0Var.c = 1;
        Object objA = mzc0Var.a(str, str2, o0y0Var);
        d9n d9nVar = d9n.a;
        return objA == d9nVar ? d9nVar : objA;
    }

    public /* synthetic */ tzr0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public tzr0(ynb0 ynb0Var, lmo lmoVar, w25 w25Var) {
        this.a = (byte) 27;
        this.b = ynb0Var;
        this.c = lmoVar;
        this.d = w25Var;
        this.e = new idd1(new z6v0(this, (byte) 27));
    }

    public tzr0(e831 e831Var, fcm1 fcm1Var, i8h1 i8h1Var) {
        this.a = (byte) 22;
        this.b = e831Var;
        this.c = fcm1Var;
        this.d = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new dsk0(yon1.g6().c, "party", (byte) 15);
    }

    public tzr0(xm41 xm41Var, bsp bspVar, Flowable flowable, lxg lxgVar) {
        this.a = (byte) 16;
        this.b = bspVar;
        this.c = flowable;
        this.d = lxgVar;
        this.e = Observable.create(new n3t(xm41Var)).skipWhile(as10.c1).switchMap(new swm0(this, (byte) 29));
    }

    public tzr0(bhf bhfVar, wh71 wh71Var, gqg gqgVar, k3i0 k3i0Var, aru0 aru0Var) {
        this.a = (byte) 18;
        this.b = wh71Var;
        this.c = gqgVar;
        this.d = k3i0Var;
        this.e = aru0Var;
    }

    public tzr0(Flowable flowable, hj91 hj91Var, bnj0 bnj0Var, c9c c9cVar, ouw ouwVar, uu00 uu00Var) {
        this.a = (byte) 10;
        this.b = flowable;
        this.c = hj91Var;
        this.d = bnj0Var;
        this.e = uu00Var;
    }

    public /* synthetic */ tzr0(byte b, Object obj, Object obj2, Object obj3, String str) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = str;
        this.d = obj3;
    }

    public tzr0(o2r o2rVar, n3r n3rVar, uzr0 uzr0Var) {
        this.a = (byte) 0;
        this.b = o2rVar;
        this.c = n3rVar;
        this.d = uzr0Var;
    }

    public tzr0(ggv0 ggv0Var, oei1 oei1Var, c9n c9nVar) {
        this.a = (byte) 14;
        this.e = ggv0Var;
        this.b = oei1Var;
        this.c = c9nVar;
    }

    public tzr0(qnf1 qnf1Var, boolean[] zArr) {
        this.a = (byte) 25;
        this.b = qnf1Var;
        this.c = zArr;
        int i = qnf1Var.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }
}
