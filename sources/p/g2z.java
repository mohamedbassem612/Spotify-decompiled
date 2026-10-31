package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.videoview.VideoView;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.libs.sociallistening.events.proto.JamNearbyBroadcastStarted;
import com.spotify.libs.sociallistening.events.proto.SocialConnectInviteNotificationCriteriaFailureV1;
import com.spotify.promptedplaylists.artifactpage.playlistconfig.PlaylistGenerationException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkip;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g2z implements o2r0, kvp0, a56, lrd1 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public g2z(Scheduler scheduler, myq0 myq0Var, epc0 epc0Var) {
        this.a = scheduler;
        this.b = myq0Var;
        this.c = epc0Var;
        this.d = new idd1(new cpc0(this, (byte) 0));
        this.e = new idd1(new dpc0(this));
        this.f = new idd1(new cpc0(this, (byte) 1));
    }

    public static void F(g2z g2zVar, String str, String str2, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if ((i & 16) != 0) {
            str2 = "";
        }
        cpr cprVar = (cpr) g2zVar.e;
        yx91 yx91VarN = SocialConnectInviteNotificationCriteriaFailureV1.n();
        yx91VarN.t(str);
        yx91VarN.s(z);
        yx91VarN.n(z2);
        yx91VarN.q(z3);
        yx91VarN.r(str2);
        SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1Build = yx91VarN.build();
        t2j0 t2j0Var = cprVar.a;
        socialConnectInviteNotificationCriteriaFailureV1Build.getClass();
        t2j0Var.a(socialConnectInviteNotificationCriteriaFailureV1Build);
    }

    public static boolean G(Calendar calendar, Calendar calendar2) {
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1);
    }

    public static final /* synthetic */ tu4 s(g2z g2zVar) {
        return (tu4) g2zVar.e;
    }

    public static ka71 x(g2z g2zVar, xwa xwaVar, int i) {
        if ((i & 4) != 0) {
            xwaVar = null;
        }
        return new ka71((gw70) g2zVar.a, (woa) g2zVar.b, (kma) g2zVar.c, (yqg) g2zVar.d, (ypq) g2zVar.e, (ruz) g2zVar.f, xwaVar);
    }

    public void A(String str, int i, Function0 function0, xu30 xu30Var) {
        fn31.T(cto1.q((dg30) this.b), (o8n) null, 0, new dk6(str, this, xu30Var, function0, i, (lnm) null), 3);
    }

    public ObservableTransformer B() {
        return (ObservableTransformer) ((idd1) this.d).getValue();
    }

    public jen0 C(rl7 rl7Var) {
        return (jen0) ((LinkedHashMap) this.c).get(rl7Var);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r1 == r3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable D(p.onm r22) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g2z.D(p.onm):java.io.Serializable");
    }

    public void E(yqq0 yqq0Var, boolean z) {
        dg30 dg30Var = (dg30) this.a;
        r4p0 r4p0Var = (r4p0) this.c;
        if (!z) {
            this.f = yqq0Var;
        }
        int iOrdinal = yqq0Var.ordinal();
        if (iOrdinal == 0) {
            dg30Var.setRequestedOrientation(12);
            r4p0Var.b = z;
        } else if (iOrdinal == 1) {
            dg30Var.setRequestedOrientation(11);
            r4p0Var.b = z;
        } else {
            if (r4p0Var.b) {
                return;
            }
            dg30Var.setRequestedOrientation(-1);
        }
    }

    public void H(y4a1 y4a1Var) {
        iy91 iy91VarL;
        cpr cprVar = (cpr) this.b;
        if (y4a1Var instanceof x4a1) {
            iy91VarL = t3k1.l(y4a1Var);
            iy91VarL.x(((x4a1) y4a1Var).g);
        } else {
            if (!(y4a1Var instanceof t4a1)) {
                eg.o();
                return;
            }
            iy91VarL = t3k1.l(y4a1Var);
            u4a1 u4a1Var = ((t4a1) y4a1Var).g;
            if (u4a1Var instanceof u4a1) {
                iy91VarL.q("client");
                String str = u4a1Var.a;
                iy91VarL.r(str != null ? str : "Unknown");
            } else {
                if (!(u4a1Var instanceof v4a1)) {
                    eg.o();
                    return;
                }
                iy91VarL.q("server");
                v4a1 v4a1Var = (v4a1) u4a1Var;
                int i = v4a1Var.a;
                String str2 = v4a1Var.b;
                iy91VarL.r(i + ":" + (str2 != null ? str2 : "Unknown"));
            }
        }
        cprVar.a.a(iy91VarL.build());
    }

    public void I(i6k1 i6k1Var) {
        uk41 uk41Var;
        VideoView videoView = (VideoView) this.a;
        f6k1 f6k1Var = f6k1.a;
        boolean zEquals = i6k1Var.equals(f6k1Var);
        d6k1 d6k1Var = d6k1.a;
        g6k1 g6k1Var = g6k1.a;
        if (zEquals || (i6k1Var instanceof c6k1)) {
            videoView.z();
        } else {
            if (i6k1Var instanceof e6k1) {
                videoView.X0.setOnClickListener(new kus((zb91) this.b, (byte) 1));
                VideoView.y(videoView, false, 48);
            } else if (i6k1Var instanceof h6k1) {
                boolean z = ((h6k1) i6k1Var).a == 0;
                zrj1 zrj1Var = new zrj1((dzp0) this.d, (String) this.e, (r2a1) this.f, (byte) 5);
                videoView.getClass();
                VideoView.y(videoView, !z, 15);
                videoView.U0.setOnClickListener(new gl61(zrj1Var, (byte) 16));
            } else {
                if (!i6k1Var.equals(g6k1Var) && !i6k1Var.equals(d6k1Var)) {
                    eg.o();
                    return;
                }
                videoView.z();
            }
        }
        zoj1 zoj1Var = (zoj1) ((f2g1) this.c).b;
        if (i6k1Var.equals(g6k1Var)) {
            zoj1Var.h(agi1.a);
            return;
        }
        boolean z2 = i6k1Var instanceof c6k1;
        wfi1 wfi1Var = wfi1.a;
        if (z2) {
            zoj1Var.h(wfi1Var);
            return;
        }
        if (i6k1Var instanceof e6k1) {
            zoj1Var.h(wfi1Var);
            return;
        }
        if (i6k1Var instanceof h6k1) {
            zoj1Var.h(wfi1Var);
            return;
        }
        if (!i6k1Var.equals(d6k1Var)) {
            if (i6k1Var.equals(f6k1Var)) {
                return;
            }
            eg.o();
        } else {
            if ((zoj1Var.m instanceof mj41) || (uk41Var = ((zda) zoj1Var).d) == null) {
                return;
            }
            uk41Var.a();
        }
    }

    public void J(pvq0 pvq0Var) {
        Flowable flowable = (Flowable) this.a;
        Flowable flowable2 = (Flowable) this.b;
        flowable2.getClass();
        Function function = Functions.a;
        Flowable flowableH = Flowable.h(flowable, flowable2.t(function), new twb(this, (byte) 18));
        flowableH.getClass();
        FlowableZip flowableZipC0 = flowableH.t(function).c0(Flowable.O(0, Integer.MAX_VALUE), qs10.W0);
        Scheduler scheduler = (Scheduler) this.d;
        Disposable disposableSubscribe = flowableZipC0.L(scheduler).subscribe(new cj9(pvq0Var, this, (byte) 5));
        vku vkuVar = (vku) this.f;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(new FlowableSkip((FlowableMap) this.c).L(scheduler).subscribe(new ixp0(pvq0Var, (byte) 3)));
    }

    public void K() {
        ((vku) this.f).c();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0277  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02db  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x0438  */
    /* JADX WARN: Code duplicated, block: B:213:0x044e A[LOOP:0: B:211:0x0448->B:213:0x044e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v64, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v66, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, p.qr31] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v51, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02b6 -> B:120:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x02cb -> B:130:0x02d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x040d -> B:230:0x0410). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x041e -> B:202:0x0424). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01f9 -> B:229:0x01ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0224 -> B:83:0x0209). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object L(java.util.Map r22, boolean r23, p.onm r24) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g2z.L(java.util.Map, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object M(List list, onm onmVar) {
        f921 f921Var;
        if (onmVar instanceof f921) {
            f921Var = (f921) onmVar;
            int i = f921Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f921Var.c = i - Integer.MIN_VALUE;
            } else {
                f921Var = new f921(this, onmVar);
            }
        } else {
            f921Var = new f921(this, onmVar);
        }
        Object objJ = f921Var.a;
        int i2 = f921Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            u4h u4hVarQ = CollectionPlatformItemsRequest.q();
            u4hVarQ.n(list);
            u4hVarQ.t(w5h.c);
            CollectionPlatformItemsRequest collectionPlatformItemsRequestBuild = u4hVarQ.build();
            w4h w4hVar = (w4h) this.c;
            collectionPlatformItemsRequestBuild.getClass();
            Single singleB = w4hVar.b(collectionPlatformItemsRequestBuild);
            f921Var.c = 1;
            objJ = fc11.j(singleB, f921Var);
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
        int iO = ((CollectionPlatformEsperantoItemsResponse) objJ).n().o();
        return Boolean.valueOf(200 <= iO && iO < 300);
    }

    public void N(Set set) {
        Set<rl7> setV0 = dm61.v0(set, (Set) this.e);
        Set<rl7> setV1 = dm61.v0((Set) this.e, set);
        this.e = set;
        for (rl7 rl7Var : setV1) {
            ogr ogrVar = (ogr) this.f;
            if (ogrVar != null) {
                pgr pgrVar = (pgr) ogrVar.b;
                Iterator it = pgrVar.d.iterator();
                while (it.hasNext()) {
                    ((sl7) it.next()).a(rl7Var);
                }
                pgrVar.g = null;
            }
        }
        for (rl7 rl7Var2 : setV0) {
            ogr ogrVar2 = (ogr) this.f;
            if (ogrVar2 != null) {
                pgr pgrVar2 = (pgr) ogrVar2.b;
                pgrVar2.g = rl7Var2;
                Iterator it2 = pgrVar2.d.iterator();
                while (it2.hasNext()) {
                    ((sl7) it2.next()).b(rl7Var2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object O(onm onmVar) {
        kbo0 kbo0Var;
        fqz0 fqz0Var = (fqz0) this.b;
        if (onmVar instanceof kbo0) {
            kbo0Var = (kbo0) onmVar;
            int i = kbo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbo0Var.c = i - Integer.MIN_VALUE;
            } else {
                kbo0Var = new kbo0(this, onmVar);
            }
        } else {
            kbo0Var = new kbo0(this, onmVar);
        }
        Object obj = kbo0Var.a;
        int i2 = kbo0Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            kbo0Var.c = 1;
            double d = fqz0Var.b * 2.0d;
            Random random = fqz0Var.a;
            n5f0 n5f0Var = fqz0Var.c;
            long j = n5f0Var.b;
            long j2 = n5f0Var.a;
            double dNextFloat = d + j2 + ((long) (random.nextFloat() * (j - j2)));
            fqz0Var.b = dNextFloat;
            double dMin = Math.min(dNextFloat, 30000.0d);
            fqz0Var.b = dMin;
            n5f0 n5f0Var2 = fqz0Var.d;
            long j3 = n5f0Var2.b;
            long j4 = n5f0Var2.a;
            Object objI = hap1.i(j4 + ((long) (random.nextFloat() * (j3 - j4))) + ((long) dMin), kbo0Var);
            if (objI != d9nVar) {
                objI = rih1Var;
            }
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (fqz0Var.b > 0.0d) {
            dt71 dt71Var = (dt71) this.d;
            kbo0Var.c = 2;
            if (dt71Var.emit(rih1Var, kbo0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object P(onm onmVar) {
        uc41 uc41Var;
        p811 p811Var;
        if (onmVar instanceof uc41) {
            uc41Var = (uc41) onmVar;
            int i = uc41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc41Var.d = i - Integer.MIN_VALUE;
            } else {
                uc41Var = new uc41(this, onmVar);
            }
        } else {
            uc41Var = new uc41(this, onmVar);
        }
        Object obj = uc41Var.b;
        int i2 = uc41Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            p811VarU.a = vro.a;
            q721 q721Var = new q721((Object) p811VarU, (Object) this, lnmVar, (byte) 5);
            uc41Var.a = p811VarU;
            uc41Var.d = 1;
            Object objO = rc2.O(5000L, q721Var, uc41Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
            obj = objO;
            p811Var = p811VarU;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = uc41Var.a;
            hm5.M(obj);
        }
        if (obj == null && (p811Var.a instanceof uro)) {
            throw new IllegalStateException() { // from class: com.spotify.playlistmixing.editpage.domain.effecthandlers.SaveTransitionEffectHandler$TransitionNotPersistedException
            };
        }
        return rih1.a;
    }

    public mr20 a() {
        return (mr20) ((idd1) this.f).getValue();
    }

    public void b(ogr ogrVar) {
        this.f = ogrVar;
    }

    public o46 c() {
        return (mmu0) this.d;
    }

    public v46 d() {
        return (you0) this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    public fa6 e(v46 v46Var) {
        jvh1 jvh1Var;
        jvh1 kvh1Var;
        boolean z;
        iz31 iz31Var = (iz31) this.b;
        u46 u46Var = (u46) this.c;
        txx0 txx0Var = ((you0) v46Var).i;
        String str = txx0Var.a;
        String str2 = txx0Var.b;
        boolean z2 = txx0Var.c;
        String str3 = txx0Var.d;
        String str4 = txx0Var.e;
        n86 n86Var = (n86) this.a;
        boolean zB = n86Var.b();
        boolean zA = n86Var.a();
        ee11 ee11Var = txx0Var.f;
        int iC = l1d.C(ee11Var.a);
        if (iC != 0) {
            int i = 2;
            if (iC == 1) {
                switch (l1d.C(ee11Var.b)) {
                    case 0:
                        i = 1;
                        kvh1Var = new kvh1(i);
                        break;
                    case 1:
                        kvh1Var = new kvh1(i);
                        break;
                    case 2:
                        i = 3;
                        kvh1Var = new kvh1(i);
                        break;
                    case 3:
                        i = 4;
                        kvh1Var = new kvh1(i);
                        break;
                    case 4:
                        i = 5;
                        kvh1Var = new kvh1(i);
                        break;
                    case 5:
                        i = 6;
                        kvh1Var = new kvh1(i);
                        break;
                    case 6:
                        i = 7;
                        kvh1Var = new kvh1(i);
                        break;
                    default:
                        eg.o();
                        return null;
                }
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                jvh1Var = jvh1.a;
            }
            nmu0 nmu0Var = txx0Var.g;
            boolean zF = n86Var.f();
            if (u46Var.d == psk.b) {
                z = true;
            } else {
                z = false;
            }
            return new fa6(new y86(str, str3, str2, z2, str4, zB, zA, kvh1Var, nmu0Var, zF, z, false, txx0Var.h, u46Var.e, txx0Var.i, txx0Var.j, (xw51) null, (String) null, txx0Var.k, false, (Set) null, txx0Var.l, iz31Var.b(), iz31Var.a(), new z740(1, n86Var.g(), "generate"), -254619400, 541), u46Var.d, u46Var.c, false, 2040);
        }
        jvh1Var = hvh1.a;
        kvh1Var = jvh1Var;
        nmu0 nmu0Var2 = txx0Var.g;
        boolean zF2 = n86Var.f();
        if (u46Var.d == psk.b) {
            z = true;
        } else {
            z = false;
        }
        return new fa6(new y86(str, str3, str2, z2, str4, zB, zA, kvh1Var, nmu0Var2, zF2, z, false, txx0Var.h, u46Var.e, txx0Var.i, txx0Var.j, (xw51) null, (String) null, txx0Var.k, false, (Set) null, txx0Var.l, iz31Var.b(), iz31Var.a(), new z740(1, n86Var.g(), "generate"), -254619400, 541), u46Var.d, u46Var.c, false, 2040);
    }

    public List f(Throwable th) {
        k46 l46Var;
        PlaylistGenerationException playlistGenerationException = th instanceof PlaylistGenerationException ? (PlaylistGenerationException) th : null;
        if (playlistGenerationException == null) {
            String message = th.getMessage();
            return Collections.singletonList(new l46(message != null ? message : "Unknown error"));
        }
        List<n4y0> list = playlistGenerationException.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (n4y0 n4y0Var : list) {
            if (n4y0Var instanceof h4y0) {
                h4y0 h4y0Var = (h4y0) n4y0Var;
                l46Var = new k46(h4y0Var.a, Instant.parse(h4y0Var.b).toEpochMilli());
            } else {
                String strA = n4y0Var.a();
                if (ihc1.y0(strA)) {
                    strA = "Unknown error";
                }
                l46Var = new l46(strA);
            }
            arrayList.add(l46Var);
        }
        return arrayList;
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        k241 k241Var = (k241) ((w6e0) this.a).b;
        u7r0 u7r0Var = (u7r0) this.d;
        iu30 iu30Var = (iu30) this.e;
        n7e0 n7e0Var = (n7e0) this.f;
        q7e0 q7e0Var = (q7e0) this.b;
        return new o7e0(nhr0Var, k241Var, u7r0Var, iu30Var, n7e0Var, q7e0Var.b, new c4z(2, q7e0Var.c, i1n0.class, "createViewBuilder", "createViewBuilder(Lcom/spotify/navigation/identifier/ViewUri$Provider;Lcom/spotify/ubi/pageidentifier/PageIdentifierProvider;)Lcom/spotify/tome/pageloader/PageLoaderView$Builder;", 0, (byte) 22), ((q7r0) this.c).d.b().a());
    }

    public void h(rl7 rl7Var) {
        ((LinkedHashSet) this.b).remove(rl7Var);
        ((LinkedHashMap) this.c).remove(rl7Var);
        if (((Set) this.e).contains(rl7Var)) {
            N(dm61.u0(rl7Var, (Set) this.e));
        }
    }

    public void i(jen0 jen0Var) {
        this.d = jen0Var;
    }

    public void j(jen0 jen0Var, float f) {
        Object next;
        this.a = jen0Var;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        ArrayList<rl7> arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            jen0 jen0VarC = C((rl7) obj);
            if (jen0VarC != null && jen0VarC.e((jen0) this.d) >= 0.5f) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (rl7 rl7Var : arrayList) {
            jen0 jen0VarC2 = C(rl7Var);
            if (jen0VarC2 != null && jen0Var.a <= jen0VarC2.c && jen0Var.c >= jen0VarC2.a && jen0Var.b <= jen0VarC2.d && jen0Var.d >= jen0VarC2.b) {
                linkedHashSet2.add(rl7Var);
            }
        }
        float f2 = (jen0Var.a + jen0Var.c) / 2.0f;
        float fC = jen0Var.c();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSet2) {
            jen0 jen0VarC3 = C((rl7) obj2);
            if (jen0VarC3 != null) {
                float f3 = jen0VarC3.b;
                float f4 = jen0VarC3.d;
                if (fC >= f3 && fC <= f4) {
                    arrayList2.add(obj2);
                }
            }
        }
        Iterator it = arrayList2.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                jen0 jen0VarC4 = C((rl7) next);
                jen0VarC4.getClass();
                float fAbs = Math.abs(((jen0VarC4.a + jen0VarC4.c) / 2.0f) - f2);
                do {
                    Object next3 = it.next();
                    jen0 jen0VarC5 = C((rl7) next3);
                    jen0VarC5.getClass();
                    float fAbs2 = Math.abs(((jen0VarC5.a + jen0VarC5.c) / 2.0f) - f2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next3;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        rl7 rl7Var2 = (rl7) next;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (C((rl7) obj3) != null) {
                arrayList3.add(obj3);
            }
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                jen0 jen0VarC6 = C((rl7) next2);
                jen0VarC6.getClass();
                float fAbs3 = Math.abs(jen0VarC6.c() - fC);
                do {
                    Object next4 = it2.next();
                    jen0 jen0VarC7 = C((rl7) next4);
                    jen0VarC7.getClass();
                    float fAbs4 = Math.abs(jen0VarC7.c() - fC);
                    if (Float.compare(fAbs3, fAbs4) > 0) {
                        next2 = next4;
                        fAbs3 = fAbs4;
                    }
                } while (it2.hasNext());
            }
        }
        rl7 rl7Var3 = (rl7) next2;
        if (rl7Var2 == null) {
            rl7Var2 = rl7Var3;
        }
        N(rl7Var2 != null ? Collections.singleton(rl7Var2) : w7x.a);
    }

    public n2r k() {
        return (w6e0) this.a;
    }

    public void l(rl7 rl7Var, jen0 jen0Var) {
        ((LinkedHashMap) this.c).put(rl7Var, jen0Var);
        jen0 jen0Var2 = (jen0) this.a;
        if (jen0Var2 == null) {
            return;
        }
        j(jen0Var2, 0.0f);
    }

    public void m(rl7 rl7Var) {
        ((LinkedHashSet) this.b).add(rl7Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public fg40 n(hg40 hg40Var) {
        n8y0 n8y0Var;
        ea6 ea6Var = (ea6) ((da6) this.f).b.a.getValue();
        String str = hg40Var.a;
        String str2 = hg40Var.b;
        String str3 = ((u46) this.c).b;
        String str4 = hg40Var.c;
        String str5 = hg40Var.d;
        boolean z = ea6Var.d;
        kvh1 kvh1Var = ea6Var.e;
        int i = 2;
        if (u890.j(kvh1Var, hvh1.a)) {
            n8y0Var = new n8y0(2);
        } else if (u890.j(kvh1Var, jvh1.a)) {
            n8y0Var = new n8y0(3);
        } else if (kvh1Var instanceof kvh1) {
            int i2 = kvh1Var.a;
            switch (i2) {
                case 1:
                    i = 7;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 6;
                    break;
                default:
                    n57.k(1 <= i2 && i2 < 8, "Weekly dayOfWeek must be in 1..7, but was %s", new Object[]{Integer.valueOf(i2)});
                    i = 7;
                    break;
            }
            n8y0Var = new n8y0(3, i);
        } else {
            n57.e("Unsupported schedule for playlists: " + kvh1Var);
            n8y0Var = new n8y0(3);
        }
        return new imu0(str, str2, str3, str4, str5, z, n8y0Var, hg40Var.h, hg40Var.k);
    }

    public void p(qcb1 qcb1Var, iu30 iu30Var, jha1 jha1Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var3;
        hrr0 hrr0Var = (hrr0) this.e;
        m4c m4cVar = fkj0.X;
        rbt rbtVar = (rbt) this.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-327844770);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(qcb1Var) : x340Var.i(qcb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jha1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            iu30Var3 = iu30Var2;
            i2 |= x340Var.i(iu30Var3) ? 2048 : 1024;
        } else {
            iu30Var3 = iu30Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            bw50 bw50VarL = d4o1.l(rbtVar, x340Var);
            qx50 qx50Var = bw50VarL.a;
            long j = bw50VarL.b;
            boolean zG = x340Var.g(qx50Var) | x340Var.f(j) | x340Var.f(((Offset) hrr0Var.getValue()).a);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = d4o1.p(qx50Var, j, ((Offset) hrr0Var.getValue()).a);
                x340Var.s0(objT);
            }
            Brush brush = (Brush) objT;
            u7h u7hVar = new u7h(j);
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(x340Var).c;
            gao gaoVarK = d4o1.k(qx50Var, u7hVar, brush, xpv0.e(), x340Var);
            qim0 qim0VarF = u291.f(exd0.r(qim0Var, new w060(gaoVarK.a, brush, gaoVarK.b, (byte) 1)), 1.0f);
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new l5b1(this, (byte) 6);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = ern1.x(qim0VarF, (iu30) objT2);
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
            pbq pbqVar = rbtVar.i;
            x340Var.i0(65411593);
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qgo1.g(pbqVar, h2cVar.b(nim0Var), x340Var);
            x340Var.r(false);
            x340Var.i0(2028108042);
            x340Var.r(false);
            WeakHashMap weakHashMap = osl1.x;
            e6p1.b(48, 0, apo.r(1172502380, new wnx0(this, qcb1Var, iu30Var, jha1Var, iu30Var3), x340Var), x340Var, uyn1.B(nim0Var, 0.0f, poo1.x(lhc.g(x340Var).f, x340Var).d(), 0.0f, 0.0f, 13));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((Object) this, (Object) qcb1Var, iu30Var, (Object) jha1Var, (Object) iu30Var2, qim0Var, i, (byte) 29);
        }
    }

    public void q(zej1 zej1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-478283108);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zej1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(oi7.a.a((gw70) this.a), apo.r(1101786972, new pej1(this, zej1Var, iu30Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(this, zej1Var, iu30Var, i, (byte) 4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void r(qcb1 qcb1Var, iu30 iu30Var, jha1 jha1Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        err0 err0Var = (err0) this.d;
        pcb1 pcb1Var = qcb1Var.i;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(87743544);
        int i2 = i | (x340Var.g(qcb1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(jha1Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192) | (x340Var.i(this) ? 131072 : 65536);
        if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.b0();
        } else if (pcb1Var instanceof ocb1) {
            x340Var.i0(-1666826585);
            boolean zI = x340Var.i(this) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ccb1((Object) this, (Object) iu30Var2, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            lnm lnmVar = null;
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
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 64.0f));
            ven0 ven0VarJ = f4p1.j(jha1Var, 0, null, x340Var, ((i2 >> 6) & 14) | 48, 14);
            boolean zI2 = x340Var.i(jha1Var) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new sb91(jha1Var, this, lnmVar, (byte) 20);
                x340Var.s0(objT2);
            }
            qxd0.t(jha1Var, x340Var, (vu30) objT2);
            String str = ((ocb1) pcb1Var).a;
            boolean z = qcb1Var.e;
            String strO0 = cwl1.o0(x340Var, 2131962794);
            boolean zI3 = x340Var.i(ven0VarJ) | x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new ccb1((Object) ven0VarJ, (Object) this, (byte) 3);
                x340Var.s0(objT3);
            }
            qim0 qim0VarC = i541.C(nim0Var, (iu30) objT3);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new pba1(iu30Var, (byte) 9);
                x340Var.s0(objT4);
            }
            Function0 function0 = (Function0) objT4;
            boolean z3 = i3 == 32;
            Object objT5 = x340Var.T();
            if (z3 || objT5 == m4cVar) {
                objT5 = new pba1(iu30Var, (byte) 10);
                x340Var.s0(objT5);
            }
            b3o1.l(z, str, strO0, function0, (Function0) objT5, qim0VarC, x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            x340Var.r(true);
            x340Var.r(false);
        } else {
            if (!(pcb1Var instanceof ncb1)) {
                throw p3d1.k(x340Var, -1577791379, false);
            }
            x340Var.i0(-1665205161);
            x340Var.r(false);
            if (err0Var.s() != 0) {
                err0Var.t(0);
                iu30Var2.invoke(new l160(((err0) this.c).s(), err0Var.s()));
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0((Object) this, (Object) qcb1Var, (Object) iu30Var, (Object) jha1Var, (Object) iu30Var2, (Object) qim0Var, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object u(vr20 vr20Var, x0k0 x0k0Var, onm onmVar) {
        tc41 tc41Var;
        vr20 vr20Var2;
        Exception exc;
        x0k0 x0k0Var2;
        x0k0 x0k0Var3;
        alg1 alg1Var = (alg1) this.a;
        if (onmVar instanceof tc41) {
            tc41Var = (tc41) onmVar;
            int i = tc41Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tc41Var.e = i - Integer.MIN_VALUE;
            } else {
                tc41Var = new tc41(this, onmVar);
            }
        } else {
            tc41Var = new tc41(this, onmVar);
        }
        tc41 tc41Var2 = tc41Var;
        Object objG = tc41Var2.c;
        int i2 = tc41Var2.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objG);
                    ((cdk0) this.b).c();
                    ykg1 ykg1VarF = alg1Var.f(x0k0Var);
                    tc41Var2.a = vr20Var;
                    tc41Var2.b = x0k0Var;
                    tc41Var2.e = 1;
                    objG = alg1Var.g(ykg1VarF, tc41Var2);
                    if (objG == obj) {
                    }
                    return obj;
                }
                if (i2 == 1) {
                    x0k0Var = tc41Var2.b;
                    vr20Var = tc41Var2.a;
                    hm5.M(objG);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            hm5.M(objG);
                            return rih1Var;
                        }
                        if (i2 == 4) {
                            hm5.M(objG);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x0k0Var3 = tc41Var2.b;
                    vr20Var2 = tc41Var2.a;
                    try {
                        hm5.M(objG);
                    } catch (Exception e) {
                        exc = e;
                        cbk0 cbk0Var = (cbk0) this.c;
                        Logger.e(exc, "Transition save failed for playlist %s at outgoing row %s", new Object[]{cbk0Var.a, cbk0Var.b.b});
                        z9k0.a((z9k0) this.d, r9k0.a);
                        tc41Var2.a = null;
                        tc41Var2.b = null;
                        tc41Var2.e = 3;
                        if (vr20Var2.emit(c4k0.a, tc41Var2) == obj) {
                            return obj;
                        }
                    }
                }
                x0k0Var2 = x0k0Var3;
                vr20Var = vr20Var2;
                tc41Var2.a = null;
                tc41Var2.b = null;
                tc41Var2.e = 4;
                if (alg1Var.c(vr20Var, x0k0Var2, (String) null, (String) null, tc41Var2) == obj) {
                    return obj;
                }
                return rih1Var;
                ((py21) objG).d();
                if (x0k0Var.a != null) {
                    tc41Var2.a = vr20Var;
                    tc41Var2.b = x0k0Var;
                    tc41Var2.e = 2;
                    if (P(tc41Var2) != obj) {
                        x0k0 x0k0Var4 = x0k0Var;
                        vr20Var2 = vr20Var;
                        x0k0Var3 = x0k0Var4;
                        x0k0Var2 = x0k0Var3;
                        vr20Var = vr20Var2;
                        tc41Var2.a = null;
                        tc41Var2.b = null;
                        tc41Var2.e = 4;
                        if (alg1Var.c(vr20Var, x0k0Var2, (String) null, (String) null, tc41Var2) == obj) {
                            return rih1Var;
                        }
                    }
                } else {
                    x0k0Var2 = x0k0Var;
                    tc41Var2.a = null;
                    tc41Var2.b = null;
                    tc41Var2.e = 4;
                    if (alg1Var.c(vr20Var, x0k0Var2, (String) null, (String) null, tc41Var2) == obj) {
                        return rih1Var;
                    }
                }
            } catch (Exception e2) {
                vr20Var2 = vr20Var;
                exc = e2;
            }
            return obj;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    public void v(int i, String str, String str2) {
        String str3;
        int i2;
        int i3;
        k9r k9rVar = (k9r) this.d;
        if (str2 == null || ((no4) ((b0a0) k9rVar.d).a.get()).F()) {
            l0l l0lVarC = ((g0l) k9rVar.c).c();
            sq80 sq80Var = l0lVarC != null ? xap1.u(l0lVarC).b : null;
            t2j0 t2j0Var = (t2j0) k9rVar.b;
            xy90 xy90VarN = JamNearbyBroadcastStarted.n();
            xy90VarN.s(str);
            if (i == 1) {
                str3 = "mdns";
            } else {
                if (i != 2) {
                    throw null;
                }
                str3 = "social_radar";
            }
            xy90VarN.n(str3);
            if (sq80Var != null && (i3 = sq80Var.a) != 0) {
                xy90VarN.t(ab80.h(i3));
            }
            if (sq80Var != null && (i2 = sq80Var.b) != 0) {
                xy90VarN.r(ab80.i(i2));
            }
            if (str2 != null) {
                xy90VarN.q(str2);
            }
            t2j0Var.a(xy90VarN.build());
        }
    }

    public Object w(onm onmVar) {
        if (((dn7) this.b) != null) {
            eg.m("Connect called while a service connection is already active.");
            return null;
        }
        ayh ayhVarA = sap1.a();
        ServiceConnection dn7Var = new dn7(ayhVarA, this, (byte) 1);
        this.b = dn7Var;
        Context context = (Context) this.a;
        Intent intent = new Intent("androidx.xr.projected.ACTION_BIND");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 1048576);
        if (listQueryIntentServices.isEmpty()) {
            eg.m("System doesn't include a service supporting Projected XR devices.");
            return null;
        }
        if (listQueryIntentServices.size() != 1) {
            jah.h("More than one system service found for action: ", intent, ".");
            return null;
        }
        ServiceInfo serviceInfo = ((ResolveInfo) o7h.q0(listQueryIntentServices)).serviceInfo;
        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        intent2.setAction("androidx.xr.projected.ACTION_BIND");
        if (!context.bindService(intent2, dn7Var, 1)) {
            ayhVarA.y0(new IllegalStateException("Projected service not found or binding was not permitted."));
        }
        return rc2.M(5000L, new vse0(ayhVarA, (lnm) null, (byte) 10), onmVar);
    }

    public vqo y(String str, int i, p6r0 p6r0Var) {
        huz huzVarU;
        List list = (List) ((Map) ((ss61) this.a).b.getValue()).get(p6r0Var);
        rs61 rs61VarA = list != null ? ss61.a(p6r0Var, list) : null;
        if (rs61VarA == null) {
            return null;
        }
        o3e0 o3e0Var = (o3e0) this.f;
        pbo1 pbo1Var = pbo1.N0;
        xr61 xr61VarCreate = ((yr61) rs61VarA.c().get()).create();
        bw20 bw20Var = (ov20) o3e0Var.c;
        List listU = eso1.u(xr61VarCreate, j690.f);
        ArrayList<sq61> arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            r7h.W(((xt61) it.next()).e, arrayList);
        }
        if (arrayList.isEmpty()) {
            huzVarU = new huz(Boolean.FALSE, (byte) 10);
        } else if (arrayList.isEmpty()) {
            huzVarU = rqt0.u(hu20.e(bw20Var.a("restrict-settings-for-child", false), new af01((lnm) null, arrayList, (byte) 13)));
        } else {
            for (sq61 sq61Var : arrayList) {
                mr20 mr20VarIsVisible = sq61Var.isVisible();
                huz huzVar = wbx0.X;
                if (u890.j(mr20VarIsVisible, huzVar)) {
                    c0g c0gVarA = sq61Var.a();
                    c0g.x.getClass();
                    if (u890.j(c0gVarA, pbo1Var)) {
                        huzVarU = huzVar;
                    }
                }
            }
            huzVarU = rqt0.u(hu20.e(bw20Var.a("restrict-settings-for-child", false), new af01((lnm) null, arrayList, (byte) 13)));
        }
        c0g.x.getClass();
        return o3e0Var.h(str, huzVarU, pbo1Var, new n2g0(i, rs61VarA.getViewUri(), eso1.u(xr61VarCreate, j690.c), xr61VarCreate.a, uyn1.r(xr61VarCreate.b, (Activity) o3e0Var.b), null));
    }

    public void z() {
        bpb1 bpb1Var = (bpb1) this.e;
        Boolean bool = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
        Context context = (Context) this.a;
        dn7 dn7Var = (dn7) this.b;
        if (dn7Var == null) {
            eg.m("Service connection is null");
            return;
        }
        context.unbindService(dn7Var);
        IBinder iBinder = (IBinder) this.c;
        if (iBinder != null) {
            iBinder.unlinkToDeath((llh0) this.d, 0);
        }
        this.c = null;
        this.b = null;
    }

    public g2z(Flowable flowable, Flowable flowable2, FlowableMap flowableMap, Scheduler scheduler, tu4 tu4Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = flowableMap;
        this.d = scheduler;
        this.e = tu4Var;
        this.f = new vku();
    }

    public /* synthetic */ g2z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public g2z(mu4 mu4Var, fqz0 fqz0Var, esa1 esa1Var) {
        this.a = mu4Var;
        this.b = fqz0Var;
        this.c = esa1Var;
        this.d = mgo1.e(1, 0, 0, 6);
        this.e = smo1.e(new z8n("NoInternetDetectorScope"));
        this.f = new idd1(new ivn0(this, (byte) 9));
    }

    public g2z(Context context) {
        this.a = context;
        this.d = new llh0(this, (byte) 1);
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
    }

    public g2z(String str, yqg yqgVar, di4 di4Var, pob pobVar, o551 o551Var, uny unyVar, psc pscVar, xy41 xy41Var) {
        this.a = str;
        this.b = yqgVar;
        this.c = di4Var;
        this.d = o551Var;
        this.e = unyVar;
        this.f = pscVar;
    }

    public g2z(byte b) {
        switch (b) {
            case 17:
                this.b = new LinkedHashSet();
                this.c = new LinkedHashMap();
                this.d = new jen0();
                this.e = w7x.a;
                break;
        }
    }
}
