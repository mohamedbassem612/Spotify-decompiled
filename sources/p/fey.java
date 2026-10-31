package p;

import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.download.esperanto.proto.EsDownload$FileStreamerId;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.esperanto.proto.EsCommandOptions;
import com.spotify.player.esperanto.proto.EsPlayAsNextInQueueRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayAsNextInQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeDelayErrorIterable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fey implements Function, Producer, yu30, cy81, hx30, u561, h4i1, rbu0, BiFunction {
    public final /* synthetic */ byte a;
    public final Object b;

    public fey(xdn0 xdn0Var) {
        Object objE;
        this.a = (byte) 22;
        this.b = xdn0Var;
        Object objE2 = null;
        try {
            objE = xdn0Var.e(jrd1.s0);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        Class cls = (Class) objE;
        if (cls != null && !cls.equals(uq70.class)) {
            hhg1.i("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        ((xdn0) this.b).r(i4i1.I0, k4i1.c);
        xdn0 xdn0Var2 = (xdn0) this.b;
        xdn0Var2.r(jrd1.s0, uq70.class);
        try {
            objE2 = xdn0Var2.e(jrd1.r0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objE2 == null) {
            xdn0Var2.r(jrd1.r0, uq70.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public static ssb0 f(fey feyVar, int i) {
        xtb0 xtb0Var = (xtb0) feyVar.b;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            ptb0 ptb0Var = (ptb0) xtb0Var.f.getValue();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            tsb0 tsb0Var = xtb0Var.q;
            long j = ptb0Var.j;
            boolean z = xtb0Var.d;
            pv40 pv40Var = new pv40(i, ptb0Var);
            rl1 rl1Var = tsb0Var.c;
            return rl1Var != null ? rl1Var.F(i, j, tsb0Var.b, z, pv40Var) : vev.a;
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    public static ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hp90 hp90Var = (hp90) it.next();
            arrayList2.add(new ix90(hp90Var.a, hp90Var.d, hp90Var.b, hp90Var.e));
        }
        return arrayList2;
    }

    public String a(long j, String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        String str3;
        byte[] bArrG1;
        rok0 rok0Var = (rok0) this.b;
        if (ihc1.y0(str2)) {
            hhg1.n("Preset name cannot be null or empty");
            return null;
        }
        Map map = (Map) rok0Var.c;
        Locale locale = Locale.ROOT;
        biq0 biq0Var = (biq0) map.get(str2.toUpperCase(locale));
        if (biq0Var == null) {
            hhg1.n("Unknown preset: ".concat(str2));
            return null;
        }
        int i = biq0Var.b;
        byte b = biq0Var.c;
        byte b2 = biq0Var.d;
        if (ihc1.y0(str)) {
            hhg1.n("Shared secret cannot be null or empty");
            return null;
        }
        String upperCase = ihc1.g1(str, new char[]{'='}).toUpperCase(locale);
        ArrayList arrayList = new ArrayList();
        int length = upperCase.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= length) {
                str3 = null;
                bArrG1 = o7h.g1(arrayList);
                break;
            }
            str3 = null;
            int iV0 = ihc1.v0("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", upperCase.charAt(i2), 0, 6);
            if (iV0 == -1) {
                bArrG1 = null;
                break;
            }
            i3 = (i3 << 5) | iV0;
            int i5 = i4 + 5;
            if (i5 >= 8) {
                i4 -= 3;
                arrayList.add(Byte.valueOf((byte) ((i3 >> i4) & 255)));
            } else {
                i4 = i5;
            }
            i2++;
        }
        if (bArrG1 == null) {
            hhg1.n("Invalid Base32 shared secret");
            return str3;
        }
        if (1 > b || b > 18) {
            hhg1.n("Code digits must be between 1 and 18 (extended mode)");
            return str3;
        }
        if (1 > b2 || b2 >= 1001) {
            hhg1.n("Hash rounds must be between 1 and 1000");
            return str3;
        }
        byte[] bArr = new byte[8];
        long j2 = j;
        for (int i6 = 7; -1 < i6; i6--) {
            bArr[i6] = (byte) (255 & j2);
            j2 >>= 8;
        }
        Mac mac = Mac.getInstance(jup0.e(i));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrG1, jup0.e(i));
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        for (int i7 = 1; i7 < b2; i7++) {
            mac.reset();
            mac.init(secretKeySpec);
            bArrDoFinal = mac.doFinal(bArrDoFinal);
        }
        bArrDoFinal.getClass();
        int i8 = bArrDoFinal[bArrDoFinal.length - 1] & 7;
        long j3 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            j3 = (j3 << 8) | (((long) bArrDoFinal[(i8 + i9) % bArrDoFinal.length]) & 255);
        }
        return "https://open.spotify.com/multi-user-plan-verification/code/verify/".concat(String.format(gvg.e(b, "%0", "d"), Arrays.copyOf(new Object[]{Long.valueOf((Long.MAX_VALUE & j3) % ((long) Math.pow(10.0d, b)))}, 1)));
    }

    public Object apply(Object obj) {
        Single singleJust;
        Single singleB;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ly21 ly21Var = (py21) obj;
                if (ly21Var instanceof ly21) {
                    singleJust = Single.error(new Throwable(ly21Var.a.b()));
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    singleJust = Single.just((wsc0) ((oy21) ly21Var).a);
                }
                return singleJust.map(new wcr((zeu) obj2, (byte) 27));
            case 3:
                ruz ruzVar = (ruz) obj2;
                PlayAsNextInQueueCommand playAsNextInQueueCommand = ((f9u0) obj).a;
                vpz vpzVarO = EsPlayAsNextInQueueRequest.PlayAsNextInQueueRequest.o();
                EsCommandOptions.CommandOptions commandOptionsB = ruzVar.b((CommandOptions) playAsNextInQueueCommand.options().h());
                if (commandOptionsB != null) {
                    vpzVarO.r(commandOptionsB);
                }
                vpzVarO.q(tgp1.s(ruzVar.b.a(playAsNextInQueueCommand.loggingParams())));
                b380 b380VarTracks = playAsNextInQueueCommand.tracks();
                ArrayList arrayList = new ArrayList(q7h.U(b380VarTracks, 10));
                Iterator it = b380VarTracks.iterator();
                while (it.hasNext()) {
                    arrayList.add(xlm.b((ContextTrack) it.next()));
                }
                vpzVarO.n(arrayList);
                EsPlayAsNextInQueueRequest.PlayAsNextInQueueRequest playAsNextInQueueRequestBuild = vpzVarO.build();
                ujm ujmVar = ruzVar.a;
                playAsNextInQueueRequestBuild.getClass();
                return ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "PlayAsNextInQueue", playAsNextInQueueRequestBuild).map(zhm0.Q0).map(bbn.c1);
            case 4:
                fc00 fc00Var = (fc00) obj2;
                return fc00.h(fc00Var.a, new s20(fc00Var, (byte) 26)).o(new laz(fc00Var, (byte) 3));
            case 5:
                r9c r9cVar = (r9c) obj;
                c610 c610Var = (c610) obj2;
                UbiSpecificationId ubiSpecificationIdH = r9cVar.h();
                if (ubiSpecificationIdH != UbiSpecificationId.UNKNOWN) {
                    c610Var.g.c(new r710(ubiSpecificationIdH, r9cVar.e(), (Integer) null, 12));
                }
                w310 w310VarF = c610Var.f(r9cVar);
                if (w310VarF == null) {
                    Logger.d("could not find a loader for browser params, " + r9cVar, new Object[0]);
                    singleB = Single.just(new z310(z6x.a, (f410) null, (m510) null, (String) null));
                } else {
                    w310VarF.toString();
                    if (r9cVar.h) {
                        singleB = w310VarF.b(r9cVar).map(new h0y(r9cVar, (byte) 8)).doOnSuccess(new a610(c610Var, r9cVar, (byte) 2)).doOnError(new a610(c610Var, r9cVar, (byte) 3));
                        singleB.getClass();
                    } else {
                        singleB = w310VarF.b(r9cVar);
                    }
                }
                return singleB.map(new laz(r9cVar, (byte) 5));
            case 9:
                int iN = ((EsDownload$FileStreamerId) obj).n();
                Integer numValueOf = Integer.valueOf(iN);
                ((f520) obj2).j = Integer.valueOf(iN);
                return numValueOf;
            case 11:
                return j2h1.D(o6x.a, new j020((p410) obj2, (lnm) null, (byte) 7));
            case 15:
                u740 u740Var = (u740) obj2;
                return (u740Var.b.isEmpty() || !((Boolean) obj).booleanValue()) ? MaybeEmpty.a : Maybe.e(new mmr0(u740Var.a, u740Var.c.a));
            case 16:
                return Observable.fromIterable(((bj40) obj).a).flatMapSingle(new laz((lc20) obj2, (byte) 14)).toList();
            case 18:
                return ((Boolean) obj).booleanValue() ? new i5w0((AccessoryStateManager.Event) obj2) : j5.a;
            case 21:
                return Observable.fromAction(new tt60((z1s) obj2, (hj70) obj, (byte) 0));
            case 23:
                h580 h580Var = (h580) obj2;
                smc0 smc0VarN = k4p1.n();
                ljg ljgVar = h580Var.c;
                String str = nik1.l1.a;
                TriggerType triggerType = TriggerType.URI;
                j7a j7aVar = j7a.a;
                smc0VarN.add(ljg.c(ljgVar, str, triggerType, (String) null, (List) null, (tv80) null, j7aVar, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 476).ignoreElement());
                ljg ljgVar2 = h580Var.c;
                TriggerType triggerType2 = TriggerType.CLIENT_EVENT;
                smc0VarN.add(ljg.c(ljgVar2, "nowplayingview:npv-open:v1", triggerType2, (String) null, (List) null, (tv80) null, j7aVar, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 476).ignoreElement());
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrack != null && contextTrack.metadata().get("video_association") != null) {
                    smc0VarN.add(ljg.c(h580Var.c, "nowplayingview:npv-open-mv:v1", triggerType2, (String) null, (List) null, (tv80) null, j7aVar, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 476).ignoreElement());
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                Objects.requireNonNull(smc0VarK, "sources is null");
                return new CompletableMergeDelayErrorIterable(smc0VarK);
            default:
                p0b0 p0b0Var = (p0b0) ((spq0) obj).h();
                if (p0b0Var == null) {
                    p0b0Var = (p0b0) obj2;
                }
                return new l941(wza0.c(p0b0Var));
        }
    }

    public void b(int i, Object obj) {
        List list = ((x590) this.b).e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ipb) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ipb) it.next()).r((xw7) obj);
        }
    }

    public void c(v561 v561Var) {
        sk60 sk60Var = (sk60) this.b;
        sk60Var.Q0.c(sk60Var);
    }

    public void d() {
        sk60 sk60Var = (sk60) this.b;
        int i = sk60Var.R0 - 1;
        sk60Var.R0 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (rl60 rl60Var : sk60Var.T0) {
            rl60Var.z();
            i2 += rl60Var.i1.a;
        }
        pnf1[] pnf1VarArr = new pnf1[i2];
        int i3 = 0;
        for (rl60 rl60Var2 : sk60Var.T0) {
            rl60Var2.z();
            int i4 = rl60Var2.i1.a;
            int i5 = 0;
            while (i5 < i4) {
                rl60Var2.z();
                pnf1VarArr[i3] = rl60Var2.i1.a(i5);
                i5++;
                i3++;
            }
        }
        sk60Var.S0 = new qnf1(pnf1VarArr);
        sk60Var.Q0.j(sk60Var);
    }

    public xdn0 e() {
        return (xdn0) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, iu30 iu30Var, onm onmVar) {
        vtz vtzVar;
        if (onmVar instanceof vtz) {
            vtzVar = (vtz) onmVar;
            int i = vtzVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                vtzVar.d = i - os00.INVALID_ID;
            } else {
                vtzVar = new vtz(this, onmVar);
            }
        } else {
            vtzVar = new vtz(this, onmVar);
        }
        Object objInvoke = vtzVar.b;
        int i2 = vtzVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                vtzVar.a = str;
                vtzVar.d = 1;
                objInvoke = iu30Var.invoke(vtzVar);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = vtzVar.a;
                hm5.M(objInvoke);
            }
            EsOffline.DownloadResponse downloadResponse = (EsOffline.DownloadResponse) objInvoke;
            if (downloadResponse.n() != 0) {
                n57.s("Failed to " + str + ", error " + downloadResponse.n());
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to " + str, e2);
        }
        return rih1.a;
    }

    public Object get() {
        return new DispatcherWorker(((cny) this.b).e);
    }

    public i4i1 h() {
        return new xq70(eqq0.b((xdn0) this.b));
    }

    public void onFailure(Throwable th) {
        MaybeEmitter maybeEmitter = (MaybeEmitter) this.b;
        if (maybeEmitter.isDisposed()) {
            return;
        }
        maybeEmitter.onError(th);
    }

    public void onSuccess(Object obj) {
        MaybeEmitter maybeEmitter = (MaybeEmitter) this.b;
        if (obj == null || maybeEmitter.isDisposed()) {
            maybeEmitter.onComplete();
        } else {
            maybeEmitter.onSuccess(obj);
        }
    }

    public void z() {
        zk10 zk10Var = (zk10) this.b;
        ConstraintLayout constraintLayout = zk10Var.w;
        if (constraintLayout == null) {
            u890.C("frontContainer");
            throw null;
        }
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = zk10Var.y;
        if (constraintLayout2 == null) {
            u890.C("backContainer");
            throw null;
        }
        constraintLayout2.setVisibility(4);
        ParagraphView paragraphView = zk10Var.z;
        if (paragraphView == null) {
            u890.C("storyTitleView");
            throw null;
        }
        paragraphView.setVisibility(4);
        ConstraintLayout constraintLayout3 = zk10Var.v;
        if (constraintLayout3 != null) {
            constraintLayout3.setAlpha(1.0f);
        } else {
            u890.C("frontSceneContainer");
            throw null;
        }
    }

    public fey(mg30 mg30Var, zf30 zf30Var) {
        this.a = (byte) 12;
        this.b = zf30Var;
    }

    public fey(p0b0 p0b0Var, wza0 wza0Var) {
        this.a = (byte) 27;
        this.b = p0b0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fey(byte b) {
        this(xdn0.d());
        this.a = b;
        switch (b) {
            case 22:
                break;
            default:
                this.b = (ExtraSupportedSurfaceCombinationsQuirk) vvt.a.m(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
        }
    }

    public /* synthetic */ fey(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        return new r3c0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((q3c0) this.b).k.a.i());
    }
}
