package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.FacebookException;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.liveroom.listeningpartyvotingcardimpl.proto.GetVotingWidgetResponse;
import com.spotify.liveroom.listeningpartyvotingcardimpl.proto.SendVotesRequestV2;
import com.spotify.player.model.ContextTrack;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.watchfeed.uiusecases.element.videothumbnail.VideoThumbnailView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ilh1 implements Function, n6j0, gvt0, k1q0, ObservableOnSubscribe, ya, whl1 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public ilh1(i8h1 i8h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 29:
                this.b = i8h1Var;
                this.c = new pdl0((byte) 15);
                break;
            default:
                this.b = i8h1Var;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.c = new wqk0(yon1.W4().c, nik1.W0.a, (byte) 28);
                break;
        }
    }

    public void a(Bundle bundle, FacebookException facebookException) {
        ((mjl1) this.b).K((rye0) this.c, bundle, facebookException);
    }

    public boolean accept(Object obj) {
        return ((gal1) this.b).b() && !((fza1) this.c).b(((ksk) obj).a);
    }

    public Object apply(Object obj) {
        Object objInvoke;
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 5:
                String str = (String) obj;
                hce1 hce1Var = (hce1) obj2;
                Scheduler scheduler = (Scheduler) hce1Var.e;
                HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) hce1Var.b;
                k560 k560Var = (m560) this.b;
                if (k560Var instanceof k560) {
                    return m5n1.o(headphoneFilterStateDatabase.u().a, new String[]{"BluetoothHeadphoneFilterStateEntity"}, new os(k560Var.a, str, (byte) 6)).subscribeOn(scheduler).map(new h5a1(hce1Var, (byte) 20)).publish(new ulc((byte) 28));
                }
                if (k560Var instanceof l560) {
                    return m5n1.o(headphoneFilterStateDatabase.v().a, new String[]{"WiredHeadphoneFilterStateEntity"}, new ec21(((l560) k560Var).a, str, (byte) 10)).subscribeOn(scheduler).map(new lxh1(hce1Var, (byte) 1)).publish(new ulc((byte) 28));
                }
                eg.o();
                return null;
            case 8:
                beh behVar = (feh) obj;
                boolean z = behVar instanceof ceh;
                ywv0 ywv0Var = (ywv0) this.b;
                if (!z) {
                    return ((behVar instanceof beh) && ihc1.h0(behVar.a, "pick_and_shuffle_capped_video_context", false)) ? Single.just(odj1.a) : Single.just(odj1.b);
                }
                Flowable flowable = (Flowable) ywv0Var.g;
                Scheduler scheduler2 = (Scheduler) ywv0Var.i;
                return flowable.L(scheduler2).x(new zjp1((String) obj2, (byte) 10)).z().timeout(5L, TimeUnit.SECONDS, scheduler2).map(i5x0.U0);
            case 10:
                return !((Boolean) obj).booleanValue() ? CompletableEmpty.a : ((gmj1) this.b).b.a((tv80) obj2);
            case 14:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Couldn't create request for play", new Object[0]);
                ((a77) ((tp7) this.b).h).d(th, (VoiceAssistantLoggingContext) obj2);
                return CompletableEmpty.a;
            case 20:
                ly21 ly21Var = (py21) obj;
                hij1 hij1Var = new hij1((j0l1) this.b, (zsc) obj2, (byte) 19);
                if (ly21Var instanceof ly21) {
                    objInvoke = Single.error(new Exception(l1d.m("Failed to create playlist: ", ly21Var.a.b())));
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = hij1Var.invoke(((oy21) ly21Var).a);
                }
                return (SingleSource) objInvoke;
            default:
                f291 f291Var = (f291) this.b;
                Uri.Builder builder = (Uri.Builder) obj2;
                String str2 = ((wze1) obj).a;
                String fragment = builder.build().getFragment();
                return Single.just(new dlb1(f291Var, builder.encodedFragment((fragment != null ? fragment.concat("&") : "") + "id_token=" + str2).build().toString(), (String) null));
        }
    }

    public void b(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-209746910);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kvvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (kvvVar.P0) {
            x340Var.i0(607394805);
            qcp qcpVar = (qcp) this.c;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ceg1(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            glh1 glh1VarA = qcpVar.a((iu30) objT);
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hlh1(this, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("unsaved-changes-dialog", (iu30) objT2, apo.r(1062328505, new sqv(glh1VarA, (byte) 1), x340Var), x340Var, 390);
            x340Var.r(false);
        } else {
            x340Var.i0(608297184);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, kvvVar, iu30Var, i, (byte) 25);
        }
    }

    public boolean c(m0u0 m0u0Var) {
        ContextTrack contextTrack = (ContextTrack) this.b;
        String str = (String) m0u0Var.a.d.get("track_uid");
        if (str != null) {
            return l4o1.k(contextTrack, str, c2p1.r(m0u0Var)) && ((yyd) ((w611) ((tij1) this.c)).a.getTag(2131430298)).a;
        }
        hhg1.n("Required value was null.");
        return false;
    }

    public File d() {
        File file = (File) this.b;
        if (file != null) {
            return file;
        }
        File file2 = new File(((Context) this.c).getCacheDir(), "volley");
        this.b = file2;
        return file2;
    }

    public Single e(int i, String str, String str2) {
        str.getClass();
        return ((yze1) this.b).a(str).flatMap(mgx0.W0).doOnSuccess(new d0l1(this, i, (byte) 0)).doOnError(new d0l1(this, i, (byte) 1)).doOnSubscribe(new d0l1(this, str2, i));
    }

    public View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        viewGroup.setBackgroundColor(viewGroup.getContext().getColor(2131100258));
        ComposeView composeView = new ComposeView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        String str = (String) this.b;
        nni1 nni1Var = (nni1) this.c;
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        composeView.setContent(new j2i(-574093897, new mni1(str, nni1Var, (byte) 1), true));
        return composeView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r6 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(p.x2i1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.nrn0
            r1 = 1
            if (r0 == 0) goto L11
            java.lang.Object r5 = r5.b
            p.lzn0 r5 = (p.lzn0) r5
            p.nrn0 r6 = (p.nrn0) r6
            java.lang.String r6 = r6.a
            r5.h(r6)
            return r1
        L11:
            boolean r0 = r6 instanceof p.mrn0
            r2 = 0
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof p.ljq0
            if (r0 == 0) goto L1b
            goto L1f
        L1b:
            p.eg.o()
            return r2
        L1f:
            java.lang.String r6 = r6.a()
            android.net.Uri r0 = p.bno1.x(r6)
            if (r0 != 0) goto L2a
            goto L72
        L2a:
            java.lang.String r3 = r0.getScheme()
            if (r3 == 0) goto L73
            int r4 = r3.hashCode()
            switch(r4) {
                case -1183762788: goto L63;
                case -1081572750: goto L52;
                case 114715: goto L41;
                case 109566356: goto L38;
                default: goto L37;
            }
        L37:
            goto L73
        L38:
            java.lang.String r6 = "smsto"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L5b
            goto L73
        L41:
            java.lang.String r6 = "tel"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L4a
            goto L73
        L4a:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.DIAL"
            r6.<init>(r3, r0)
            goto L7a
        L52:
            java.lang.String r6 = "mailto"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L5b
            goto L73
        L5b:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.SENDTO"
            r6.<init>(r3, r0)
            goto L7a
        L63:
            java.lang.String r4 = "intent"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L6c
            goto L73
        L6c:
            android.content.Intent r6 = p.bno1.w(r6)
            if (r6 != 0) goto L7a
        L72:
            return r2
        L73:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r6.<init>(r3, r0)
        L7a:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r0)
            java.lang.Object r5 = r5.c     // Catch: android.content.ActivityNotFoundException -> L87
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: android.content.ActivityNotFoundException -> L87
            r5.startActivity(r6)     // Catch: android.content.ActivityNotFoundException -> L87
            return r1
        L87:
            r5 = move-exception
            java.lang.String r6 = "Unable to launch external uri"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r5, r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ilh1.g(p.x2i1):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[PHI: r4
      0x0075: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v7 int) binds: [B:19:0x0061, B:20:0x0063, B:22:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(String str, onm onmVar) {
        fvk1 fvk1Var;
        xyk1 xyk1Var;
        int i;
        if (onmVar instanceof fvk1) {
            fvk1Var = (fvk1) onmVar;
            int i2 = fvk1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fvk1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                fvk1Var = new fvk1(this, onmVar);
            }
        } else {
            fvk1Var = new fvk1(this, onmVar);
        }
        Object obj = fvk1Var.b;
        int i3 = fvk1Var.d;
        int i4 = 1;
        if (i3 == 0) {
            hm5.M(obj);
            xyk1 xyk1Var2 = (xyk1) this.c;
            qvk1 qvk1Var = (qvk1) this.b;
            fvk1Var.a = xyk1Var2;
            fvk1Var.d = 1;
            Object objA = qvk1Var.a(str, fvk1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            obj = objA;
            xyk1Var = xyk1Var2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xyk1Var = fvk1Var.a;
            hm5.M(obj);
        }
        xyk1Var.getClass();
        GetVotingWidgetResponse getVotingWidgetResponse = (GetVotingWidgetResponse) obj;
        Context context = xyk1Var.a;
        qr40 qr40VarS = getVotingWidgetResponse.s();
        int iOrdinal = qr40VarS.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = i4;
        } else {
            i4 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Logger.k("Unsupported voting state: %s", new Object[]{qr40VarS});
                }
                i = 3;
            } else {
                i = i4;
            }
        }
        String string = getVotingWidgetResponse.u() ? context.getString(2131957787, DateUtils.formatDateTime(context, (getVotingWidgetResponse.t().q() * 1000) + ((long) (getVotingWidgetResponse.t().p() / 1000000)), 65560)) : "";
        string.getClass();
        String string2 = i == 3 ? context.getString(2131957791) : getVotingWidgetResponse.r();
        string2.getClass();
        int iN = getVotingWidgetResponse.n();
        String strP = getVotingWidgetResponse.p();
        String strO = getVotingWidgetResponse.o();
        h290<GetVotingWidgetResponse.WidgetNominee> h290VarQ = getVotingWidgetResponse.q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (GetVotingWidgetResponse.WidgetNominee widgetNominee : h290VarQ) {
            arrayList.add(new xdo0(widgetNominee.getUri(), widgetNominee.getImageUrl(), widgetNominee.getTitle(), widgetNominee.getSubtitle()));
        }
        return new gwk1(string2, string, iN, i, strP, strO, arrayList, context.getString(2131957800), context.getString(2131957784), context.getString(2131957783), context.getString(2131957798), context.getString(2131957797), b7x.a, false, false, false, false, false, false);
    }

    public void i(int i, Throwable th) {
        String strM = th.getMessage() != null ? l1d.m("Auth failed with error: ", th.getMessage()) : "Auth failed with no error message.";
        Logger.d("vtec-startup step 2 (AUTH): Auth Error: ".concat(strM), new Object[0]);
        ((my30) this.c).a(new l2l1((String) null, 1, sqg0.J(new mmr0[]{new mmr0("error", strM), new mmr0("reason", xvj1.c(i))}), "authenticationFailed"));
    }

    public void j() {
        x6h1 x6h1VarC = ((pdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("button_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("yes_btn", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        ((i8h1) this.b).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void k(svj1 svj1Var, int i, int i2) {
        char c;
        String str;
        char c2;
        String str2;
        String str3;
        int iC = l1d.C(i2);
        if (iC == 0) {
            c = 2;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            c = 1;
        }
        wqk0 wqk0Var = (wqk0) this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("streaming_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        if (i2 == 1) {
            str = "WIFI";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "CELLULAR";
        }
        String str4 = str;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("quality_setting_selection_row", str4, numValueOf, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        int iC2 = l1d.C(svj1Var.a);
        if (iC2 == 1) {
            c2 = 2;
        } else if (iC2 != 2) {
            c2 = iC2 != 3 ? (char) 4 : (char) 1;
        } else {
            c2 = 3;
        }
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (c == 1) {
            str2 = "cellular_quality_option";
        } else {
            if (c != 2) {
                throw null;
            }
            str2 = "wifi_quality_option";
        }
        mmr0 mmr0Var = new mmr0("setting_name", str2);
        if (c2 == 1) {
            str3 = "high";
        } else if (c2 == 2) {
            str3 = "low";
        } else if (c2 == 3) {
            str3 = "medium";
        } else {
            if (c2 != 4) {
                throw null;
            }
            str3 = "very_high";
        }
        ((i8h1) this.b).m(new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str3)})), y6h1VarA2, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public Object l() {
        Reference referencePoll;
        Object obj;
        bfn0 bfn0Var = (bfn0) this.b;
        do {
            referencePoll = ((ReferenceQueue) this.c).poll();
            if (referencePoll != null) {
                bfn0Var.k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = bfn0Var.c;
            if (i == 0) {
                return null;
            }
            obj = ((Reference) bfn0Var.l(i - 1)).get();
        } while (obj == null);
        return obj;
    }

    public void m(Object obj) {
        Reference referencePoll;
        bfn0 bfn0Var = (bfn0) this.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) this.c;
        do {
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                bfn0Var.k(referencePoll);
            }
        } while (referencePoll != null);
        bfn0Var.b(new WeakReference(obj, referenceQueue));
    }

    public Object n(String str, String str2, Map map, String str3, suk1 suk1Var) {
        qvk1 qvk1Var = (qvk1) this.b;
        y461 y461VarO = SendVotesRequestV2.o();
        y461VarO.r(str);
        y461VarO.q(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        y461VarO.n(linkedHashMap);
        y461VarO.s(str3);
        Object objB = qvk1Var.b(str, str2, (SendVotesRequestV2) y461VarO.build(), suk1Var);
        return objB == d9n.a ? objB : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable o(bkc0 bkc0Var, p371 p371Var, ela1 ela1Var, g471 g471Var, onm onmVar) throws Throwable {
        mxh1 mxh1Var;
        ela1 ela1Var2;
        g471 g471Var2;
        p371 p371Var2;
        g471 g471Var3;
        String m231Var;
        p371 p371Var3;
        ela1 ela1Var3;
        Throwable thA;
        Throwable thA2;
        if (onmVar instanceof mxh1) {
            mxh1Var = (mxh1) onmVar;
            int i = mxh1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mxh1Var.f = i - Integer.MIN_VALUE;
            } else {
                mxh1Var = new mxh1(this, onmVar);
            }
        } else {
            mxh1Var = new mxh1(this, onmVar);
        }
        Object objM = mxh1Var.d;
        int i2 = mxh1Var.f;
        if (i2 == 0) {
            hm5.M(objM);
            try {
                eea0 eea0Var = (eea0) this.b;
                try {
                    mxh1Var.a = p371Var;
                    ela1Var2 = ela1Var;
                    try {
                        mxh1Var.b = ela1Var2;
                        g471Var2 = g471Var;
                        try {
                            mxh1Var.c = g471Var2;
                            mxh1Var.f = 1;
                            objM = eea0Var.m(p371Var, bkc0Var, mxh1Var);
                            d9n d9nVar = d9n.a;
                            if (objM == d9nVar) {
                                return d9nVar;
                            }
                            p371Var2 = p371Var;
                            g471Var3 = g471Var2;
                            m231Var = (String) objM;
                        } catch (Throwable th) {
                            th = th;
                            p371Var2 = p371Var;
                            m231Var = new m231(th);
                            g471Var3 = g471Var2;
                            p371Var3 = p371Var2;
                            ela1Var3 = ela1Var2;
                            thA = e331.a(m231Var);
                            if (thA == null) {
                            }
                            thA2 = e331.a(m231Var);
                            if (thA2 != null) {
                                Logger.e(thA2, "Failed to upload link preview", new Object[0]);
                                vyo1.y((g871) this.c, k771.P0, thA2, p371Var3, ela1Var3, g471Var3.a(), (String) null, 32);
                            }
                            if (m231Var instanceof m231) {
                                return null;
                            }
                            return m231Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        g471Var2 = g471Var;
                        p371Var2 = p371Var;
                        m231Var = new m231(th);
                        g471Var3 = g471Var2;
                        p371Var3 = p371Var2;
                        ela1Var3 = ela1Var2;
                        thA = e331.a(m231Var);
                        if (thA == null) {
                        }
                        thA2 = e331.a(m231Var);
                        if (thA2 != null) {
                            Logger.e(thA2, "Failed to upload link preview", new Object[0]);
                            vyo1.y((g871) this.c, k771.P0, thA2, p371Var3, ela1Var3, g471Var3.a(), (String) null, 32);
                        }
                        if (m231Var instanceof m231) {
                            return null;
                        }
                        return m231Var;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ela1Var2 = ela1Var;
                }
            } catch (Throwable th4) {
                th = th4;
                ela1Var2 = ela1Var;
                g471Var2 = g471Var;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g471Var3 = mxh1Var.c;
            ela1 ela1Var4 = mxh1Var.b;
            p371 p371Var4 = mxh1Var.a;
            try {
                hm5.M(objM);
                ela1Var2 = ela1Var4;
                p371Var2 = p371Var4;
                try {
                    m231Var = (String) objM;
                } catch (Throwable th5) {
                    th = th5;
                    g471Var2 = g471Var3;
                    m231Var = new m231(th);
                    g471Var3 = g471Var2;
                }
            } catch (Throwable th6) {
                th = th6;
                g471Var2 = g471Var3;
                ela1Var2 = ela1Var4;
                p371Var2 = p371Var4;
                m231Var = new m231(th);
                g471Var3 = g471Var2;
                p371Var3 = p371Var2;
                ela1Var3 = ela1Var2;
                thA = e331.a(m231Var);
                if (thA == null) {
                }
                thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    Logger.e(thA2, "Failed to upload link preview", new Object[0]);
                    vyo1.y((g871) this.c, k771.P0, thA2, p371Var3, ela1Var3, g471Var3.a(), (String) null, 32);
                }
                if (m231Var instanceof m231) {
                    return null;
                }
                return m231Var;
            }
        }
        p371Var3 = p371Var2;
        ela1Var3 = ela1Var2;
        thA = e331.a(m231Var);
        if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        thA2 = e331.a(m231Var);
        if (thA2 != null) {
            Logger.e(thA2, "Failed to upload link preview", new Object[0]);
            vyo1.y((g871) this.c, k771.P0, thA2, p371Var3, ela1Var3, g471Var3.a(), (String) null, 32);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        l6s l6sVar = (l6s) this.b;
        l6sVar.b = new g4k1(observableEmitter, (onr) this.c, (byte) 6);
        ((Context) l6sVar.a).getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, (p2a) l6sVar.c);
        observableEmitter.setCancellable(new ci0(l6sVar, (byte) 11));
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        return (hsl1) ((ut1) this.b).invoke(view, hsl1Var, (rc80) this.c);
    }

    public ilh1(f291 f291Var, vi11 vi11Var, Uri.Builder builder) {
        this.a = (byte) 21;
        this.b = f291Var;
        this.c = builder;
    }

    public /* synthetic */ ilh1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ilh1() {
        this.a = (byte) 26;
        this.b = new bfn0(0, new Reference[16]);
        this.c = new ReferenceQueue();
    }

    public ilh1(VideoThumbnailView videoThumbnailView, IconVideo iconVideo, ArtworkView artworkView) {
        this.a = (byte) 12;
        this.b = iconVideo;
        this.c = artworkView;
    }

    public ilh1(Context context) {
        this.a = (byte) 15;
        this.c = context;
        this.b = null;
    }
}
