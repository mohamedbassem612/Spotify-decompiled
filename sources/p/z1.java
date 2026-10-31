package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteError;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(String str, vu30 vu30Var, ihl ihlVar, Integer num, Function0 function0, ihl ihlVar2, ihl ihlVar3) {
        super(1);
        this.a = (byte) 22;
        this.b = str;
        this.e = vu30Var;
        this.f = ihlVar;
        this.c = num;
        this.g = function0;
        this.d = ihlVar2;
        this.h = ihlVar3;
    }

    private final Object a(Object obj) {
        ui8 ui8Var = (ui8) this.e;
        nx9 nx9Var = (nx9) this.f;
        vuk vukVar = (vuk) this.b;
        mlv0 mlv0Var = (mlv0) this.c;
        wdm wdmVar = (wdm) this.d;
        pd61 pd61Var = (pd61) this.g;
        ex01 ex01Var = (ex01) this.h;
        nx9Var.c();
        klm klmVar = ((wn41) obj).a;
        io80 io80VarB = klmVar.b("AudioPreviewService", wso0.t);
        ucp0 ucp0Var = new ucp0(pd61Var, (byte) 14);
        kly0 kly0Var = pd61Var.o1;
        io80 io80VarB2 = klmVar.b("DataActionLauncherService", new rap0(ucp0Var, new fdp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), (byte) 13));
        io80 io80VarB3 = klmVar.b("MediaSessionDataPoolService", new nbp0(new ucp0(pd61Var, (byte) 15), (byte) 22));
        kly0 kly0Var2 = pd61Var.t;
        fdp0 fdp0Var = new fdp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29);
        gdp0 gdp0Var = new gdp0(0, pd61Var.u, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0);
        kly0 kly0Var3 = pd61Var.I0;
        io80 io80VarB4 = klmVar.b("LockStatePageResolverService", new iyo0(fdp0Var, gdp0Var, new gdp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), (byte) 21));
        kly0 kly0Var4 = pd61Var.a;
        ldp0 ldp0Var = new ldp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18);
        sap0 sap0Var = new sap0(ui8Var, (byte) 17);
        mcp0 mcp0Var = new mcp0(ex01Var, (byte) 14);
        kly0 kly0Var5 = pd61Var.n1;
        io80 io80VarB5 = klmVar.b("UserKeyValueStorageService", new k7h0(ldp0Var, sap0Var, mcp0Var, new ldp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), (byte) 29));
        io80 io80VarB6 = klmVar.b("PlayerControlsService", new pcp0(new ddp0(wdmVar, (byte) 1), new y52(0, pd61Var.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), new idp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), (byte) 0));
        kly0 kly0Var6 = pd61Var.Y0;
        gdp0 gdp0Var2 = new gdp0(0, kly0Var6, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20);
        kly0 kly0Var7 = pd61Var.O;
        gdp0 gdp0Var3 = new gdp0(0, kly0Var7, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21);
        gdp0 gdp0Var4 = new gdp0(0, pd61Var.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22);
        kly0 kly0Var8 = pd61Var.l;
        io80 io80VarB7 = klmVar.b("PlaybackNotificationPlayerService", new kx70(gdp0Var2, gdp0Var3, gdp0Var4, new gdp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), new hdp0(io80VarB6, (byte) 0), new ycp0(wdmVar, (byte) 11), new gdp0(0, pd61Var.k0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), (byte) 9));
        io80 io80VarB8 = klmVar.b("GoogleDesktopPlaybackShutdownService", new rap0(new fdp0(0, pd61Var.C, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), new hbp0(io80VarB7, (byte) 20), (byte) 18));
        edp0 edp0Var = new edp0(0, pd61Var.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5);
        ycp0 ycp0Var = new ycp0(wdmVar, (byte) 6);
        kly0 kly0Var9 = pd61Var.e;
        io80 io80VarB9 = klmVar.b("AudioSessionManagerService", new iyo0(edp0Var, ycp0Var, new edp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), (byte) 9));
        io80 io80VarB10 = klmVar.b("SpotifyWidgetPlayerService", new ocp0(new hdp0(io80VarB6, (byte) 10), new ucp0(pd61Var, (byte) 20), (byte) 16));
        ldp0 ldp0Var2 = new ldp0(0, kly0Var6, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4);
        ldp0 ldp0Var3 = new ldp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5);
        kly0 kly0Var10 = pd61Var.f;
        ldp0 ldp0Var4 = new ldp0(0, kly0Var10, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6);
        kly0 kly0Var11 = pd61Var.g;
        io80 io80VarB11 = klmVar.b("SpotifyWidgetUpdaterService", new itw(ldp0Var2, ldp0Var3, ldp0Var4, new ldp0(0, kly0Var11, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), new ldp0(0, pd61Var.U0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), new ldp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), new ldp0(0, pd61Var.b1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new ldp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), new ldp0(0, pd61Var.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), new ldp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3)));
        io80 io80VarB12 = klmVar.b("PlaybackStatusObserverService", new ocp0(new gdp0(0, kly0Var6, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), new gdp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), (byte) 1));
        edp0 edp0Var2 = new edp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7);
        hbp0 hbp0Var = new hbp0(io80VarB12, (byte) 13);
        edp0 edp0Var3 = new edp0(0, pd61Var.g1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8);
        kly0 kly0Var12 = pd61Var.o;
        io80 io80VarB13 = klmVar.b("BluetoothLoggerService", new k7h0(edp0Var2, hbp0Var, edp0Var3, new edp0(0, kly0Var12, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), (byte) 6));
        io80 io80VarB14 = klmVar.b("MediaButtonActionHandlerService", new kx70(new gdp0(0, pd61Var.Z0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), new gdp0(0, kly0Var6, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), new gdp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new hbp0(io80VarB6, (byte) 26), new hbp0(io80VarB13, (byte) 27), new gdp0(0, kly0Var12, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new gdp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), (byte) 6));
        ycp0 ycp0Var2 = new ycp0(wdmVar, (byte) 15);
        jdp0 jdp0Var = new jdp0(0, pd61Var.a0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2);
        jdp0 jdp0Var2 = new jdp0(0, pd61Var.Y, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3);
        jdp0 jdp0Var3 = new jdp0(0, pd61Var.X, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4);
        jdp0 jdp0Var4 = new jdp0(0, pd61Var.W, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5);
        jdp0 jdp0Var5 = new jdp0(0, pd61Var.V, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6);
        jdp0 jdp0Var6 = new jdp0(0, kly0Var11, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7);
        jdp0 jdp0Var7 = new jdp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8);
        y52 y52Var = new y52(0, kly0Var10, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16);
        idp0 idp0Var = new idp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17);
        idp0 idp0Var2 = new idp0(0, pd61Var.p1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18);
        idp0 idp0Var3 = new idp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19);
        idp0 idp0Var4 = new idp0(0, pd61Var.A0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20);
        idp0 idp0Var5 = new idp0(0, pd61Var.B0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21);
        idp0 idp0Var6 = new idp0(0, pd61Var.C0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22);
        idp0 idp0Var7 = new idp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23);
        idp0 idp0Var8 = new idp0(0, pd61Var.D0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24);
        kly0 kly0Var13 = pd61Var.E0;
        idp0 idp0Var9 = new idp0(0, kly0Var13, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25);
        kly0 kly0Var14 = pd61Var.v1;
        idp0 idp0Var10 = new idp0(0, kly0Var14, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26);
        idp0 idp0Var11 = new idp0(0, pd61Var.G1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27);
        idp0 idp0Var12 = new idp0(0, pd61Var.H1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28);
        kly0 kly0Var15 = pd61Var.I1;
        io80 io80VarB15 = klmVar.b("PushNotificationService", new scp0(ycp0Var2, jdp0Var, jdp0Var2, jdp0Var3, jdp0Var4, jdp0Var5, jdp0Var6, jdp0Var7, y52Var, idp0Var, idp0Var2, idp0Var3, idp0Var4, idp0Var5, idp0Var6, idp0Var7, idp0Var8, idp0Var9, idp0Var10, idp0Var11, idp0Var12, new idp0(0, kly0Var15, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), new ycp0(wdmVar, (byte) 16), new jdp0(0, pd61Var.E1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new jdp0(0, pd61Var.e1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1)));
        io80 io80VarB16 = klmVar.b("ContributionDataSourceService", new kbp0(new fdp0(0, pd61Var.J1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new fdp0(0, pd61Var.K1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new fdp0(0, pd61Var.L1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), new fdp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), new fdp0(0, pd61Var.N1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), (byte) 0));
        io80 io80VarB17 = klmVar.b("ContributionMutationNotifierService", w0n0.e);
        fdp0 fdp0Var2 = new fdp0(0, kly0Var7, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
        kly0 kly0Var16 = pd61Var.d;
        io80 io80VarB18 = klmVar.b("EndlessNotificationService", new dy7(fdp0Var2, new fdp0(0, kly0Var16, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), new fdp0(0, pd61Var.w0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new fdp0(0, pd61Var.S, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), new fdp0(0, pd61Var.x0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16), new fdp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), (byte) 19));
        io80 io80VarB19 = klmVar.b("DataPreloadingService", new iyo0(new y52(0, pd61Var.s1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), new fdp0(0, pd61Var.u1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new fdp0(0, pd61Var.t1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), (byte) 11));
        io80 io80VarB20 = klmVar.b("CollectionNotificationService", new dy7(new edp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), new edp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), new edp0(0, pd61Var.q1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), new edp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), new edp0(0, kly0Var14, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), new edp0(0, pd61Var.y1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), (byte) 16));
        jdp0 jdp0Var8 = new jdp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
        jdp0 jdp0Var9 = new jdp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13);
        y52 y52Var2 = new y52(0, kly0Var10, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17);
        jdp0 jdp0Var10 = new jdp0(0, pd61Var.v, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14);
        kly0 kly0Var17 = pd61Var.q;
        jdp0 jdp0Var11 = new jdp0(0, kly0Var17, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15);
        jdp0 jdp0Var12 = new jdp0(0, pd61Var.r, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16);
        kdp0 kdp0Var = new kdp0(nx9Var, (byte) 0);
        jdp0 jdp0Var13 = new jdp0(0, pd61Var.s, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17);
        jdp0 jdp0Var14 = new jdp0(0, pd61Var.j1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18);
        jdp0 jdp0Var15 = new jdp0(0, pd61Var.n0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10);
        kly0 kly0Var18 = pd61Var.p;
        io80 io80VarB21 = klmVar.b("RemoteConfigAuthenticatedFetcherService", new tcp0(jdp0Var8, jdp0Var9, y52Var2, jdp0Var10, jdp0Var11, jdp0Var12, kdp0Var, jdp0Var13, jdp0Var14, jdp0Var15, new jdp0(0, kly0Var18, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11)));
        io80 io80VarB22 = klmVar.b("RemoteConfigAuthResolverService", new pcp0(new yap0(vukVar, (byte) 12), new jdp0(0, kly0Var18, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new kdp0(nx9Var, (byte) 1), (byte) 2));
        io80 io80VarB23 = klmVar.b("ProductStateResolverService", new dbp0(new idp0(0, kly0Var17, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new hdp0(io80VarB21, (byte) 4), new idp0(0, kly0Var10, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new idp0(0, pd61Var.o0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new idp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), new wap0(nx9Var, (byte) 2), new hdp0(io80VarB22, (byte) 5), new bdp0(mlv0Var, (byte) 1), (byte) 3));
        io80 io80VarB24 = klmVar.b("PostLoginFlowRemotePropertiesService", new mcp0(new hdp0(io80VarB22, (byte) 3), (byte) 5));
        io80 io80VarB25 = klmVar.b("PlayerSubscriptionsListFactoryService", new ocp0(new ycp0(wdmVar, (byte) 13), new ycp0(wdmVar, (byte) 14), (byte) 2));
        idp0 idp0Var13 = new idp0(pd61Var.F1, (byte) 10);
        idp0 idp0Var14 = new idp0(kly0Var14, (byte) 11);
        idp0 idp0Var15 = new idp0(kly0Var7, (byte) 12);
        idp0 idp0Var16 = new idp0(pd61Var.R, (byte) 13);
        idp0 idp0Var17 = new idp0(pd61Var.x1, (byte) 14);
        idp0 idp0Var18 = new idp0(kly0Var5, (byte) 15);
        kly0 kly0Var19 = pd61Var.P1;
        io80 io80VarB26 = klmVar.b("PromptedPlaylistGenerationService", new kx70(idp0Var13, idp0Var14, idp0Var15, idp0Var16, idp0Var17, idp0Var18, new idp0(kly0Var19, (byte) 16), (byte) 10));
        fdp0 fdp0Var3 = new fdp0(kly0Var2, (byte) 18);
        hbp0 hbp0Var2 = new hbp0(io80VarB23, (byte) 24);
        hbp0 hbp0Var3 = new hbp0(io80VarB22, (byte) 25);
        fdp0 fdp0Var4 = new fdp0(pd61Var.j, (byte) 19);
        kly0 kly0Var20 = pd61Var.c1;
        io80 io80VarB27 = klmVar.b("GatingSessionService", new dy7(fdp0Var3, hbp0Var2, hbp0Var3, fdp0Var4, new fdp0(kly0Var20, (byte) 20), new fdp0(kly0Var5, (byte) 21), (byte) 21));
        ldp0 ldp0Var5 = new ldp0(pd61Var.w1, (byte) 15);
        ldp0 ldp0Var6 = new ldp0(kly0Var14, (byte) 16);
        hdp0 hdp0Var = new hdp0(io80VarB27, (byte) 11);
        kly0 kly0Var21 = pd61Var.i;
        io80 io80VarB28 = klmVar.b("UcpPromptsService", new k7h0(ldp0Var5, ldp0Var6, hdp0Var, new ldp0(kly0Var21, (byte) 17), (byte) 28));
        io80 io80VarB29 = klmVar.b("MediaFocusManagerService", new kx70(new gdp0(kly0Var4, (byte) 7), new hbp0(io80VarB6, (byte) 28), new gdp0(pd61Var.h1, (byte) 8), new ycp0(wdmVar, (byte) 10), new gdp0(kly0Var6, (byte) 9), new gdp0(kly0Var9, (byte) 10), new gdp0(pd61Var.m1, (byte) 11), (byte) 7));
        io80 io80VarB30 = klmVar.b("PiPPlayerService", new k7h0(new y52(kly0Var6, (byte) 14), new gdp0(kly0Var16, (byte) 18), new hbp0(io80VarB6, (byte) 29), new gdp0(kly0Var8, (byte) 19), (byte) 22));
        klmVar.b("StsService", new mcp0(new y52(pd61Var.D1, (byte) 18), (byte) 19));
        io80 io80VarB31 = klmVar.b("WidgetPlaybackAttributionService", new kbp0(new ldp0(pd61Var.C1, (byte) 21), new ldp0(pd61Var.B1, (byte) 22), new ldp0(pd61Var.S0, (byte) 23), new ldp0(kly0Var, (byte) 24), new ldp0(kly0Var20, (byte) 25), (byte) 13));
        io80 io80VarB32 = klmVar.b("XrProjectedService", new pcp0(new ldp0(kly0Var4, (byte) 26), new ldp0(kly0Var, (byte) 27), new ldp0(pd61Var.J0, (byte) 28), (byte) 9));
        io80 io80VarB33 = klmVar.b("SearchObservationPrivateService", new mcp0(new jdp0(kly0Var, (byte) 22), (byte) 12));
        io80 io80VarB34 = klmVar.b("SearchObservationServiceImpl", new mcp0(new hdp0(io80VarB33, (byte) 6), (byte) 13));
        kly0 kly0Var22 = pd61Var.H2;
        io80 io80VarB35 = klmVar.b("CampfireFeatureAvailabilityService", new rap0(new edp0(kly0Var22, (byte) 20), new edp0(kly0Var2, (byte) 21), (byte) 4));
        io80 io80VarB36 = klmVar.b("ExternalContributionsService", wso0.X);
        io80 io80VarB37 = klmVar.b("AgentMetadataClientFacadeService", new s2n0(new edp0(kly0Var15, (byte) 3), new edp0(kly0Var5, (byte) 4), (byte) 26));
        io80 io80VarB38 = klmVar.b("ProfileV2MetadataClientFacadeService", new ocp0(new idp0(kly0Var15, (byte) 8), new idp0(kly0Var5, (byte) 9), (byte) 6));
        io80 io80VarB39 = klmVar.b("RichMediaMetadataClientFacadeService", new ocp0(new jdp0(kly0Var15, (byte) 20), new jdp0(kly0Var5, (byte) 21), (byte) 13));
        io80 io80VarB40 = klmVar.b("ShareMetadataClientFacadeService", new k7h0(new jdp0(kly0Var15, (byte) 29), new ldp0(kly0Var22, (byte) 0), new ldp0(pd61Var.L2, (byte) 1), new ldp0(kly0Var5, (byte) 2), (byte) 25));
        io80 io80VarB41 = klmVar.b("TasteMatchMetadataClientFacadeService", new ocp0(new ldp0(kly0Var15, (byte) 13), new ldp0(kly0Var5, (byte) 14), (byte) 19));
        edp0 edp0Var4 = new edp0(kly0Var22, (byte) 12);
        hbp0 hbp0Var4 = new hbp0(io80VarB35, (byte) 19);
        edp0 edp0Var5 = new edp0(kly0Var13, (byte) 13);
        edp0 edp0Var6 = new edp0(pd61Var.F0, (byte) 14);
        edp0 edp0Var7 = new edp0(kly0Var, (byte) 15);
        edp0 edp0Var8 = new edp0(kly0Var5, (byte) 16);
        edp0 edp0Var9 = new edp0(kly0Var21, (byte) 17);
        edp0 edp0Var10 = new edp0(kly0Var17, (byte) 18);
        edp0 edp0Var11 = new edp0(kly0Var11, (byte) 19);
        hbp0 hbp0Var5 = new hbp0(io80VarB37, (byte) 14);
        hbp0 hbp0Var6 = new hbp0(io80VarB38, (byte) 15);
        hbp0 hbp0Var7 = new hbp0(io80VarB39, (byte) 16);
        hbp0 hbp0Var8 = new hbp0(io80VarB40, (byte) 17);
        hbp0 hbp0Var9 = new hbp0(io80VarB41, (byte) 18);
        edp0 edp0Var12 = new edp0(pd61Var.Z, (byte) 10);
        kly0 kly0Var23 = pd61Var.F2;
        io80 io80VarB42 = klmVar.b("CampfireService", new ebp0(edp0Var4, hbp0Var4, edp0Var5, edp0Var6, edp0Var7, edp0Var8, edp0Var9, edp0Var10, edp0Var11, hbp0Var5, hbp0Var6, hbp0Var7, hbp0Var8, hbp0Var9, edp0Var12, new edp0(kly0Var23, (byte) 11), (byte) 0));
        io80 io80VarB43 = klmVar.b("RecentEmojisRepositoryService", new ocp0(new ucp0(pd61Var, (byte) 19), new jdp0(kly0Var5, (byte) 9), (byte) 9));
        gdp0 gdp0Var5 = new gdp0(kly0Var21, (byte) 12);
        gdp0 gdp0Var6 = new gdp0(pd61Var.D2, (byte) 13);
        ucp0 ucp0Var2 = new ucp0(pd61Var, (byte) 16);
        kly0 kly0Var24 = pd61Var.b;
        io80 io80VarB44 = klmVar.b("MediaUploadChatService", new kx70(gdp0Var5, gdp0Var6, ucp0Var2, new gdp0(kly0Var24, (byte) 14), new gdp0(kly0Var5, (byte) 15), new gdp0(kly0Var23, (byte) 16), new gdp0(kly0Var22, (byte) 17), (byte) 8));
        io80 io80VarB45 = klmVar.b("ListeningPartyChatService", new kx70(new fdp0(kly0Var16, (byte) 22), new fdp0((ipq) wdmVar.t, (byte) 23), new ycp0(wdmVar, (byte) 7), new ycp0(wdmVar, (byte) 8), new fdp0((ipq) wdmVar.i, (byte) 24), new ycp0(wdmVar, (byte) 9), new fdp0(kly0Var19, (byte) 25), (byte) 3));
        io80 io80VarB46 = klmVar.b("ListeningPartyRoomEventsService", new iyo0(new fdp0((ipq) wdmVar.t, (byte) 26), new fdp0(pd61Var.W0, (byte) 27), new fdp0(kly0Var5, (byte) 28), (byte) 20));
        io80 io80VarB47 = klmVar.b("ReceiptSettingsService", new ocp0(new ucp0(pd61Var, (byte) 17), new ucp0(pd61Var, (byte) 18), (byte) 8));
        io80 io80VarB48 = klmVar.b("ShareListService", new ang(new jdp0(kly0Var21, (byte) 23), new jdp0(kly0Var13, (byte) 24), new hdp0(io80VarB38, (byte) 7), new hdp0(io80VarB37, (byte) 8), new jdp0(pd61Var.M2, (byte) 25), new jdp0(kly0Var4, (byte) 26), new jdp0(kly0Var22, (byte) 27), new jdp0(pd61Var.K2, (byte) 28), new hdp0(io80VarB35, (byte) 9), (byte) 8));
        io80 io80VarU = hxo1.u(klmVar, new fdp0(pd61Var.U0, (byte) 9), new hbp0(klmVar.b("CampfireImageStorageService", new nap0(new edp0(kly0Var24, (byte) 22), (byte) 11)), (byte) 21), new fdp0(kly0Var5, (byte) 10));
        io80 io80VarM = vxo1.m(klmVar, new hbp0(k5p1.p(klmVar, new ldp0(pd61Var.G2, (byte) 20)), (byte) 22), new hbp0(oto1.q(klmVar, new edp0(kly0Var24, (byte) 23)), (byte) 23), new fdp0(kly0Var5, (byte) 11));
        io80 io80VarS = f2p1.s(klmVar, new gdp0(kly0Var16, (byte) 27), new hdp0(io80VarB42, (byte) 1), new hdp0(io80VarB47, (byte) 2), new gdp0(kly0Var22, (byte) 28), new gdp0(kly0Var6, (byte) 29), new idp0(kly0Var5, (byte) 0));
        io80 io80VarN = i2p1.n(klmVar, new idp0(kly0Var15, (byte) 2), new idp0(kly0Var5, (byte) 3));
        io80 io80VarZ = b2p1.z(klmVar, new ycp0(wdmVar, (byte) 12));
        b5n b5nVarB = mlv0Var.b();
        ynb0 ynb0VarA = xqu.a((ipq) wdmVar.e);
        ra61 ra61Var = (ra61) wdmVar.b;
        yqg yqgVar = ra61Var.a;
        c8o.l(yqgVar);
        cve0 cve0Var = new cve0(yqgVar);
        List list = ra61Var.d;
        c8o.l(list);
        return new rf61(io80VarB, io80VarB2, io80VarB3, io80VarB4, io80VarB5, io80VarB8, io80VarB9, io80VarB10, io80VarB11, io80VarB14, io80VarB15, io80VarB12, io80VarB16, io80VarB17, io80VarB18, io80VarB19, io80VarB20, io80VarB7, io80VarB21, io80VarB22, io80VarB23, io80VarB24, io80VarB13, io80VarB6, io80VarB25, io80VarB26, io80VarB28, io80VarB29, io80VarB30, io80VarB31, io80VarB32, io80VarB33, io80VarB34, io80VarB35, io80VarB36, io80VarB42, io80VarB43, io80VarB44, io80VarB45, io80VarB46, io80VarB47, io80VarB48, io80VarU, io80VarM, io80VarS, io80VarB37, io80VarN, io80VarB38, io80VarB39, io80VarB40, io80VarZ, ui8Var, mlv0Var, b5nVarB, f2u0.n(ynb0VarA, cve0Var, list), wdmVar.o(), (Observable) ((jly0) wdmVar.f).get(), (Observable) ((jly0) wdmVar.g).get());
    }

    private final Object d(Object obj) {
        dhl dhlVar = (dhl) obj;
        xid xidVar = dhlVar.f;
        xid xidVar2 = dhlVar.d;
        ihl ihlVar = dhlVar.c;
        u1p1.C(dhlVar, (((String) this.b) == null && ((vu30) this.e) == null) ? false : true);
        dhlVar.g(new e5u((p3v) null, "spread"));
        yf.p(dhlVar.e, ihlVar.e, 12.0f, 4);
        yf.p(dhlVar.g, ((ihl) this.f).e, 0.0f, 6);
        if (((Integer) this.c) == null && ((Function0) this.g) == null) {
            xid.r(xidVar2, ihlVar.d, 12.0f, 4);
            xid.r(xidVar, ihlVar.f, 12.0f, 4);
        } else {
            xid.r(xidVar2, ((ihl) this.d).f, 0.0f, 6);
            xid.r(xidVar, ((ihl) this.h).d, 0.0f, 6);
        }
        return rih1.a;
    }

    private final Object e(Object obj) {
        p3u0 p3u0Var;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
        vy30 vy30Var = (vy30) this.c;
        Object tag = videoSurfaceView.getTag(2131428986);
        uoa uoaVarA = tag instanceof uoa ? (uoa) tag : null;
        if (uoaVarA == null) {
            uoaVarA = woa.a((woa) this.e, "campfire-media-gallery-video", (o2u0) null, (w2k1) null, (kma) this.f, Collections.singletonList((d0u0) this.b), false, (bas) null, (sn10) null, 998);
            uoaVarA.q(false);
            uoaVarA.o(false);
            uoaVarA.d(videoSurfaceView);
        }
        m0u0 m0u0VarE = uoaVarA.e();
        if (!u890.j(m0u0VarE != null ? m0u0VarE.a.a : null, vy30Var.a)) {
            long jLongValue = ((Number) ((ven0) this.d).getValue()).longValue();
            uoaVarA.h(new o2u0(vy30Var.a, 14, (Map) null), new oot0(0L, 0L, ((Boolean) ((ven0) this.g).getValue()).booleanValue() || jLongValue == 0, false, (hu7) null, (tne1) null, false, 243));
            if (jLongValue > 0 && (p3u0Var = uoaVarA.f) != null) {
                p3u0Var.J0(jLongValue, true);
            }
        }
        ((ven0) this.h).setValue(uoaVarA);
        videoSurfaceView.setTag(2131428986, uoaVarA);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x074f  */
    /* JADX WARN: Code duplicated, block: B:131:0x075b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0778  */
    /* JADX WARN: Code duplicated, block: B:149:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x07be  */
    /* JADX WARN: Code duplicated, block: B:152:0x07ee  */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        upk0 upk0Var;
        PreparePlayOptions.Builder builder;
        boolean z;
        Context.Builder builderUrl;
        int i4;
        float f;
        float f2;
        tw4 tw4Var;
        float f3;
        float f4;
        zh9 m231Var;
        hdz0 gdz0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                Set setS0 = f46.S0(new x0[]{(x0) obj8, (x0) obj7});
                String str = (String) obj3;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj2;
                smc0 smc0VarN = k4p1.n();
                if (setS0.contains(x0.a)) {
                    smc0VarN.add(new epo(str, new y1(function0, (byte) 0)));
                }
                if (setS0.contains(x0.b) && str2.length() > 0) {
                    smc0VarN.add(new epo(str3, new y1(function1, (byte) 1)));
                }
                b261.p(e261Var, k4p1.k(smc0VarN));
                return rih1Var;
            case 1:
                fdc fdcVar = (fdc) obj2;
                Notification notification = (Notification) obj;
                String str4 = (String) obj6;
                iu30 iu30Var = (iu30) obj4;
                b74 b74Var = (b74) obj8;
                xgb0 xgb0Var = ((nba) b74Var).i;
                LinkedHashMap linkedHashMap = b74Var.y;
                LinkedHashMap linkedHashMap2 = b74Var.w;
                String str5 = (String) obj3;
                Boolean bool = Boolean.TRUE;
                mmr0 mmr0Var = (mmr0) linkedHashMap.get(str5);
                linkedHashMap.put(str5, new mmr0(bool, mmr0Var != null ? (ou80) mmr0Var.b : null));
                if (NotificationLite.h(notification.a)) {
                    ou80 ou80Var = (ou80) obj7;
                    String str6 = ou80Var != null ? ou80Var.a : null;
                    Throwable thC = notification.c();
                    thC.getClass();
                    u210 u210Var = ((nba) b74Var).j;
                    String str7 = ((nba) b74Var).a.a().a;
                    String message = thC.getMessage();
                    if (message == null) {
                        message = j2h1.I(thC);
                    }
                    String strF = f4i1.f(str5, "|", message);
                    if (str7.length() != 0 || (str6 != null && str6.length() != 0)) {
                        t2j0 t2j0Var = u210Var.a;
                        s210 s210VarN = ExternalAccessoryRemoteError.n();
                        s210VarN.n("ui_navigate");
                        s210VarN.r(str7);
                        s210VarN.q(strF);
                        if (str6 != null) {
                            s210VarN.s(str6);
                        }
                        t2j0Var.a(s210VarN.build());
                    }
                    iu30Var.invoke(z6x.a);
                    xgb0Var.a(fdcVar, 3, 1);
                } else if (notification.e()) {
                    Object objD = notification.d();
                    objD.getClass();
                    mmr0 mmr0Var2 = (mmr0) objD;
                    m510 m510Var = (m510) mmr0Var2.a;
                    List list = (List) mmr0Var2.b;
                    if (linkedHashMap2.get(str4) == list) {
                        i3 = 2;
                        i = 2;
                    } else {
                        int i5 = m510Var == null ? -1 : y64.a[m510Var.ordinal()];
                        if (i5 == -1 || i5 == 1) {
                            i = 2;
                            i2 = 1;
                        } else {
                            i = 2;
                            if (i5 == 2) {
                                i2 = 3;
                            } else {
                                if (i5 != 3) {
                                    eg.o();
                                    return null;
                                }
                                i2 = 4;
                            }
                        }
                        i3 = i2;
                    }
                    xgb0Var.a(fdcVar, list.isEmpty() ? i : 1, i3);
                    if (b74.o((String) obj5)) {
                        linkedHashMap2.put(str4, list);
                    }
                    iu30Var.invoke(list);
                }
                return rih1Var;
            case 2:
                oud oudVar = (oud) obj;
                wh71 wh71Var = (wh71) obj8;
                q8n q8nVar = (q8n) obj2;
                return new e27(new f70((byte) 2), new uq7(oudVar, q8nVar, new br7(new yqu0(wh71Var, (gqg) obj7, (byte) 9), new dqu(wh71Var, (byte) 18), new o860((wh41) obj3, (vr51) obj6, (android.content.Context) obj5, (ol71) obj4), new g3x(oudVar), q8nVar)));
            case 3:
                o32 o32Var = (o32) obj;
                r32 r32Var = (t32) obj7;
                p32 p32Var = o32Var.a;
                l32 l32Var = o32Var.e;
                if (l32Var instanceof l32) {
                    xx10 xx10Var = l32Var.a;
                    ((xu30) obj8).invoke(xx10Var.getEventId(), xx10Var, (Object) null);
                } else {
                    if (!(l32Var instanceof m32)) {
                        eg.o();
                        return null;
                    }
                    if (p32Var == p32.c) {
                        ((Function0) obj4).invoke();
                    } else if (p32Var == p32.d) {
                        ((Function0) obj2).invoke();
                    } else {
                        r32 r32Var2 = r32Var;
                        if (u890.j(r32Var2.a, "report_ad_categories") && (upk0Var = p32Var.a) != null) {
                            int iIndexOf = r32Var2.c.indexOf(o32Var);
                            ((ven0) obj5).setValue(new mmr0(Integer.valueOf(iIndexOf), upk0Var));
                            ((vu30) obj6).invoke(Integer.valueOf(iIndexOf), upk0Var);
                        }
                    }
                    aab1.e(((bab1) obj3).d, ((m32) l32Var).a);
                }
                return rih1Var;
            case 4:
                long j = ((Offset) obj).a;
                drr0 drr0Var = (drr0) obj8;
                if (drr0Var.s() > 1.0f) {
                    ven0 ven0Var = (ven0) obj7;
                    kaa0.j(frm.a(Offset.g(((Offset) ven0Var.getValue()).a, j), ((ni7) obj3).i(), ((yr80) ((ven0) obj6).getValue()).a, drr0Var.s()), ven0Var);
                } else {
                    fn31.T((c9n) obj5, (o8n) null, 0, new vqm((o95) obj4, j, (o95) obj2, null, (byte) 0), 3);
                }
                return rih1Var;
            case 5:
                List list2 = (List) obj;
                return ((dv30) obj8).Y(((l4r) obj7).e.invoke(list2.get(0)), ((l4r) obj3).e.invoke(list2.get(1)), ((l4r) obj6).e.invoke(list2.get(2)), ((l4r) obj5).e.invoke(list2.get(3)), ((l4r) obj4).e.invoke(list2.get(4)), ((l4r) obj2).e.invoke(list2.get(5)));
            case 6:
                wsc0 wsc0Var = (wsc0) obj;
                q410 q410Var = (q410) obj8;
                g3d0 g3d0Var = (g3d0) obj7;
                Map map = (Map) obj3;
                boolean zL = y7y0.L(map);
                boolean zC = rh11.c(map);
                PreparePlayOptions preparePlayOptions = (PreparePlayOptions) obj6;
                PlayOrigin playOrigin = (PlayOrigin) obj5;
                LoggingParams loggingParams = (LoggingParams) obj4;
                Map map2 = (Map) obj2;
                LinkedHashMap linkedHashMap3 = map2 != null ? new LinkedHashMap(map2) : new LinkedHashMap();
                if (preparePlayOptions == null || (builder = preparePlayOptions.toBuilder()) == null) {
                    builder = PreparePlayOptions.builder();
                }
                Set set = s4b1.f;
                kby kbyVar = wsc0Var.f;
                String str8 = kbyVar.a;
                Map map3 = kbyVar.q;
                builder.playerOptionsOverride(q410.e(preparePlayOptions, zL, uic.x(str8).c == blc0.fh));
                if (!zL && !zC && u890.j(kbyVar.m, Boolean.TRUE)) {
                    linkedHashMap3.put("license", "mod");
                }
                List list3 = wsc0Var.e;
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zuc0 zuc0Var = (zuc0) it.next();
                            Set set2 = s4b1.f;
                            if (uic.x(zuc0Var.c).c == blc0.M3) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                if (u890.j(g3d0Var, u2d0.a) || list3.isEmpty() || z) {
                    builderUrl = u890.j(map3.get("lexicon_set_type"), "your_dj") ? Context.fromUri("").toBuilder().url((String) map3.get("lexicon_context_url")) : Context.fromUri(str8).toBuilder();
                } else {
                    ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ContextTrack.builder(((zuc0) it2.next()).c).build());
                    }
                    builderUrl = Context.builder(str8).pages(Collections.singletonList(ContextPage.builder().tracks(arrayList).build())).build().toBuilder();
                }
                return ((muz) q410Var.m.getValue()).a(PlayCommand.builder(builderUrl.metadata(linkedHashMap3).build(), playOrigin).options(builder.build()).loggingParams(loggingParams).build());
            case 7:
                dm20 dm20Var = (dm20) obj;
                xvu xvuVar = (xvu) obj8;
                d0r d0rVar = (d0r) obj6;
                cn01 cn01Var = (cn01) obj5;
                ne neVar = (ne) obj4;
                t7y t7yVar = (t7y) obj2;
                mr20 ht20Var = new ht20((mr20) obj7, new qjr(2, (lnm) null, (byte) 28));
                mr20 ht20Var2 = new ht20(yoi1.g(((f8b) obj3).a(dm20Var.k.b)), new qjr(2, (lnm) null, (byte) 27));
                mr20 iprVar = new ipr(d3p1.H(d0rVar, dm20Var.g.a ? (o3r) xvuVar.Z : (o3r) xvuVar.Y, dm20Var), cn01Var, dm20Var, (byte) 15);
                return rqt0.u(new wa3((mr20[]) o7h.l1(p7h.M(new mr20[]{ht20Var, ht20Var2, iprVar, new ht20(neVar.H(dm20Var.a), new qjr(2, (lnm) null, (byte) 29)), hu20.e(rqt0.u(new huz(iprVar, (byte) 4)), new qd0((lnm) null, t7yVar, dm20Var, (byte) 20))})).toArray(new mr20[0]), (byte) 15));
            case 8:
                DrawScope drawScope = (DrawScope) obj;
                tw4 tw4Var2 = (u8s0) obj4;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f;
                float fX0 = drawScope.X0(45.0f) + (drawScope.X0(24.0f) / 2.0f);
                tw4 tw4Var3 = (u8s0) obj8;
                tw4 tw4Var4 = tw4Var3;
                tw4Var4.o();
                tw4Var4.k(-fX0, fIntBitsToFloat2);
                float f5 = fIntBitsToFloat * 0.28571427f;
                float f6 = fIntBitsToFloat2 * 1.7142857f;
                tw4Var4.j(f5, f6);
                tw4Var4.j(fIntBitsToFloat, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)));
                float f7 = fIntBitsToFloat * 1.7142857f;
                tw4Var4.j(f7, f6);
                tw4Var4.j(Float.intBitsToFloat((int) (drawScope.j() >> 32)) + fX0, fIntBitsToFloat2);
                float f8 = fIntBitsToFloat2 * 0.28571427f;
                tw4Var4.j(f7, f8);
                tw4Var4.j(fIntBitsToFloat, 0.0f);
                tw4Var4.j(f5, f8);
                tw4Var4.g();
                vw4 vw4Var = (vw4) obj7;
                vw4Var.c(tw4Var3, true);
                float length = vw4Var.a.getLength();
                float fMin = Math.min(drawScope.X0(520.0f), 0.75f * length);
                float fFloatValue = (1.0f - ((Number) ((tob1) obj2).getValue()).floatValue()) * length;
                float fX1 = drawScope.X0(24.0f);
                float fX2 = drawScope.X0(1.0f);
                float f9 = fMin / 24.0f;
                float f10 = fFloatValue - (fMin / 2.0f);
                long j2 = ((u7h) ((tob1) obj3).getValue()).a;
                lw4 lw4Var = (lw4) obj6;
                if (lw4Var != null) {
                    Paint paint = lw4Var.a;
                    BlurMaskFilter blurMaskFilter = (BlurMaskFilter) obj5;
                    if (blurMaskFilter != null) {
                        fid fidVarP = drawScope.a1().p();
                        int i6 = 0;
                        for (int i7 = 24; i6 < i7; i7 = 24) {
                            float f11 = i6;
                            long j3 = j2;
                            float fCos = (float) Math.cos(Math.abs(((f11 + 0.5f) / 24.0f) - 0.5f) * 2.0f * 1.5707964f);
                            float f12 = fCos * fCos;
                            if (f12 >= 0.01f) {
                                float f13 = f12 * f12;
                                tw4 tw4Var5 = tw4Var2;
                                tw4Var5.n();
                                float f14 = ((f11 * f9) + f10) % length;
                                if (f14 != 0.0f && Math.signum(f14) != Math.signum(length)) {
                                    f14 += length;
                                }
                                float f15 = (((i6 + 1) * f9) + f10) % length;
                                if (f15 != 0.0f && Math.signum(f15) != Math.signum(length)) {
                                    f15 += length;
                                }
                                if (f14 < f15) {
                                    vw4Var.b(f14, f15, tw4Var5);
                                } else {
                                    vw4Var.b(f14, length, tw4Var5);
                                    vw4Var.b(0.0f, f15, tw4Var5);
                                }
                                float fE = l1d.e(fX1, fX2, f13, fX2);
                                lw4Var.c(u7h.b(j3, f12, 0.0f, 0.0f, 0.0f, 14));
                                lw4Var.f(fE);
                                fdg1.e0(paint, 0);
                                paint.setMaskFilter(blurMaskFilter);
                                fidVarP.u(tw4Var5, lw4Var);
                            }
                            i6++;
                            f9 = f9;
                            j2 = j3;
                        }
                    } else {
                        for (i4 = 0; i4 < 24; i4++) {
                            f = i4;
                            float fCos2 = (float) Math.cos(Math.abs(((f + 0.5f) / 24.0f) - 0.5f) * 2.0f * 1.5707964f);
                            f2 = fCos2 * fCos2;
                            if (f2 >= 0.01f) {
                                float f16 = f2 * f2;
                                tw4Var = tw4Var2;
                                tw4Var.n();
                                f3 = ((f * f9) + f10) % length;
                                if (f3 != 0.0f && Math.signum(f3) != Math.signum(length)) {
                                    f3 += length;
                                }
                                f4 = (((i4 + 1) * f9) + f10) % length;
                                if (f4 != 0.0f && Math.signum(f4) != Math.signum(length)) {
                                    f4 += length;
                                }
                                if (f3 < f4) {
                                    vw4Var.b(f3, f4, tw4Var);
                                } else {
                                    vw4Var.b(f3, length, tw4Var);
                                    vw4Var.b(0.0f, f4, tw4Var);
                                }
                                DrawScope.w0(drawScope, tw4Var, u7h.b(j2, f2, 0.0f, 0.0f, 0.0f, 14), new phc1(l1d.e(fX1, fX2, f16, fX2), 0.0f, 0, 0, (uw4) null, 26), 52);
                            }
                        }
                    }
                } else {
                    while (i4 < 24) {
                        f = i4;
                        float fCos3 = (float) Math.cos(Math.abs(((f + 0.5f) / 24.0f) - 0.5f) * 2.0f * 1.5707964f);
                        f2 = fCos3 * fCos3;
                        if (f2 >= 0.01f) {
                            float f17 = f2 * f2;
                            tw4Var = tw4Var2;
                            tw4Var.n();
                            f3 = ((f * f9) + f10) % length;
                            if (f3 != 0.0f) {
                                f3 += length;
                            }
                            f4 = (((i4 + 1) * f9) + f10) % length;
                            if (f4 != 0.0f) {
                                f4 += length;
                            }
                            if (f3 < f4) {
                                vw4Var.b(f3, f4, tw4Var);
                            } else {
                                vw4Var.b(f3, length, tw4Var);
                                vw4Var.b(0.0f, f4, tw4Var);
                            }
                            DrawScope.w0(drawScope, tw4Var, u7h.b(j2, f2, 0.0f, 0.0f, 0.0f, 14), new phc1(l1d.e(fX1, fX2, f17, fX2), 0.0f, 0, 0, (uw4) null, 26), 52);
                        }
                    }
                }
                return rih1Var;
            case 9:
                kil kilVar = (kil) obj;
                View view = (View) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj3;
                View view2 = (View) obj7;
                View view3 = (View) obj4;
                View view4 = (View) obj5;
                View view5 = (View) obj6;
                Iterator it3 = ((List) obj8).iterator();
                while (it3.hasNext()) {
                    op71.t((View) it3.next(), kilVar);
                }
                kilVar.g(view2.getId(), 1, constraintLayout.getId(), 1);
                kilVar.g(view5.getId(), 1, view2.getId(), 2);
                kilVar.g(view5.getId(), 2, view4.getId(), 1);
                kilVar.l(view5.getId()).e.x = 0.55f;
                ViewGroup viewGroup = (ViewGroup) view4.getParent();
                kilVar.g(view4.getId(), 6, viewGroup.getId(), 6);
                kilVar.g(view4.getId(), 7, viewGroup.getId(), 7);
                kilVar.g(view3.getId(), 1, view4.getId(), 2);
                kilVar.g(view3.getId(), 2, view.getId(), 1);
                kilVar.l(view3.getId()).e.x = 0.45f;
                kilVar.g(view.getId(), 2, constraintLayout.getId(), 2);
                return rih1Var;
            case 10:
                xzq xzqVar = new xzq((hw2) obj8, new pdb0((bl6) obj5, (byte) 20));
                f7c0 f7c0Var = f7c0.R0;
                LinkedHashMap linkedHashMap4 = ((ji50) obj).b;
                linkedHashMap4.put(hic1.class, new r3r(xzqVar, f7c0Var, 4));
                linkedHashMap4.put(gic1.class, new r3r(new xzq((tva1) obj7, xdc0.V0), f7c0.S0, 4));
                linkedHashMap4.put(qic1.class, new r3r(new xzq((fos) obj3, xdc0.W0), f7c0.T0, 4));
                linkedHashMap4.put(oic1.class, r4o1.Q(xdc0.X0, w7x.a, new inc0((cm0) obj4, (android.content.Context) obj2, (byte) 0), f7c0.U0));
                linkedHashMap4.put(fic1.class, new r3r(new xzq((xzq) obj6, xdc0.U0), f7c0.Q0, 4));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                rtb0 rtb0Var = (rtb0) obj;
                ysf0 ysf0Var = (ysf0) obj8;
                ArrayList arrayList2 = ysf0Var.c;
                rtb0Var.e(arrayList2.size(), new qbb0(arrayList2, (byte) 2), new qbb0(arrayList2, (byte) 3), new j2i(802480018, new pi1(arrayList2, ysf0Var, (iu30) obj3, (ven0) obj6, (Boolean) obj5, (ven0) obj4, (tob1) obj2), true));
                vu30 vu30Var = (vu30) obj7;
                if (vu30Var != null) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-28161663, new a2(vu30Var, (byte) 3), true), 3);
                }
                if (ysf0Var.g instanceof lsf0) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1042992534, new otf0(ysf0Var, (byte) 0), true), 3);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                long j4 = ((Offset) obj).a;
                ceo ceoVar = uvg0.a;
                ((ven0) obj3).setValue(Boolean.TRUE);
                ((tui1) obj8).d();
                Float fValueOf = Float.valueOf(0.0f);
                ((ven0) obj6).setValue(fValueOf);
                ((ven0) obj5).setValue(fValueOf);
                fn31.T((c9n) obj7, (o8n) null, 0, new yqm((o95) obj4, (o95) obj2, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 13:
                mi80 mi80Var = (si80) obj;
                Function0 function2 = (Function0) obj4;
                ven0 ven0Var2 = (ven0) obj8;
                if (mi80Var instanceof mi80) {
                    function2.invoke();
                    mi80 mi80Var2 = mi80Var;
                    ((iu30) ven0Var2.getValue()).invoke(new p3h0(mi80Var2.a, mi80Var2.b));
                } else if (mi80Var.equals(qi80.a)) {
                    function2.invoke();
                } else if (mi80Var.equals(ki80.a)) {
                    ((Function0) ((ven0) obj7).getValue()).invoke();
                } else if (mi80Var.equals(ji80.a)) {
                    ((Function0) ((ven0) obj3).getValue()).invoke();
                } else if (mi80Var instanceof ri80) {
                    iu30 iu30Var2 = (iu30) ven0Var2.getValue();
                    boolean z2 = ((ri80) mi80Var).a;
                    iu30Var2.invoke(new z3h0(z2));
                    if (z2) {
                        ((iu30) ((ven0) obj6).getValue()).invoke((String) ((ven0) obj5).getValue());
                    }
                } else if (mi80Var.equals(pi80.a)) {
                    ((Function0) obj2).invoke();
                } else if (mi80Var.equals(li80.a)) {
                    ((iu30) ven0Var2.getValue()).invoke(i3h0.a);
                } else if (mi80Var.equals(ni80.a)) {
                    ((iu30) ven0Var2.getValue()).invoke(s3h0.a);
                } else {
                    if (!mi80Var.equals(oi80.a)) {
                        eg.o();
                        return null;
                    }
                    ((iu30) ven0Var2.getValue()).invoke(t3h0.a);
                }
                return rih1Var;
            case 14:
                mey0 mey0Var = (mey0) obj;
                String str9 = mey0Var.c;
                n0o n0oVar = (n0o) obj8;
                eci0 eci0Var = (eci0) obj5;
                return new x010(new fu20(h5p1.q(new p1e0(d3p1.F(n0oVar.b, (o3r) n0oVar.Y, mey0Var), (byte) 11), ((nwt) obj7).a(), ((clm) obj3).a, ((kko) n0oVar.f).a(), ((ytp0) obj6).E(eci0Var.i ? str9 : null), new mci0(eci0Var, (yy4) obj2, (lnm) null, (byte) 0)), new hyg0(n0oVar, (lnm) null, (byte) 4), (byte) 1), f7p1.n((zob1) ((p1f0) obj4).h, str9, eci0Var.j), new vv70(3, (lnm) null, (byte) 21), (byte) 1);
            case 15:
                uei0 uei0Var = (uei0) obj7;
                return z8p1.n((mey0) obj, (clm) obj6, (ymd0) obj5, (nwt) obj4, (kko) ((yxb0) obj8).c, uei0Var.a, ((yy4) obj3).g(), uei0Var.c, uei0Var.d, false, uei0Var.e, uei0Var.g, uei0Var.h, uei0Var.j, (ytp0) obj2, null, uei0Var.k, uei0Var.l, uei0Var.m, 300544);
            case 16:
                ohi0 ohi0Var = (ohi0) obj8;
                return z8p1.n((mey0) obj, (clm) obj3, (epb1) obj6, (nwt) obj5, (kko) obj4, true, ((yy4) obj7).g(), ohi0Var.b, ohi0Var.c, ohi0Var.d, false, false, false, false, null, (uvy) obj2, false, ohi0Var.e, ohi0Var.f, 776192);
            case 17:
                mey0 mey0Var2 = (mey0) obj;
                Object value = ((epb1) obj8).Y.getValue();
                value.getClass();
                ioj0 ioj0Var = (ioj0) value;
                ohi0 ohi0Var2 = (ohi0) obj7;
                thi0 thi0Var = (thi0) obj5;
                return lro1.x(mey0Var2, new t810(ioj0Var, (zkm) null, (hwt) null, (ijo) null, true, ((yy4) obj3).g(), ohi0Var2.b, ohi0Var2.c, ohi0Var2.d, false, false, false, (y2u0) null, (sq51) null, false, ohi0Var2.e, ohi0Var2.f, 388110), lro1.n(ioj0Var, mey0Var2), (yqg) obj6, thi0Var.c, (ytp0) obj4, (hvp0) obj2, new shi0(mey0Var2, thi0Var, (byte) 0), thi0Var.a);
            case 18:
                q8n q8nVar2 = (q8n) obj8;
                wh71 wh71Var2 = (wh71) obj7;
                return new e27(new f70((byte) 12), new t9y0((oud) obj, q8nVar2, new aay0(new tzr0(wh71Var2, (gqg) obj3, (bhf) obj6, (iyc0) obj5, (byte) 19), new ki20(wh71Var2), new pux0((xrc0) obj4, (uu00) obj2, (byte) 3), q8nVar2)));
            case 19:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                byte[] bArr = (byte[]) obj5;
                ai9 ai9Var = (ai9) obj8;
                if (ai9Var == null) {
                    return new gdz0(hg9.a);
                }
                Object objCompute = ((ndz0) obj7).n.compute((String) obj3, new mdz0(ai9Var, (byte) 1));
                objCompute.getClass();
                fdz0 fdz0Var = (fdz0) objCompute;
                jdz0 jdz0Var = new jdz0((UUID) obj6, f46.L0(bArr));
                if (fdz0Var.b.contains(jdz0Var)) {
                    ((l811) obj4).a = true;
                    return new hdz0(rih1Var);
                }
                fdz0Var.c.set(new ddz0((ih9) obj2, jdz0Var));
                try {
                    m231Var = ai9Var.d(bluetoothGattCharacteristic, bArr);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    zh9 zh9Var = m231Var;
                    if (zh9Var instanceof yh9) {
                        gdz0Var = new hdz0(rih1Var);
                    } else {
                        if (!(zh9Var instanceof xh9)) {
                            eg.o();
                            return null;
                        }
                        gdz0Var = new gdz0(new kg9(Integer.valueOf(((xh9) zh9Var).a)));
                    }
                } else {
                    gdz0Var = new gdz0(new ig9(thA.getClass().getSimpleName()));
                }
                return gdz0Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                c380 c380Var = (c380) obj8;
                ((rtb0) obj).e(c380Var.size(), new rw11(c380Var, (byte) 6), new rw11(c380Var, (byte) 7), new j2i(802480018, new pi1(c380Var, (u380) obj7, (iyr0) obj3, (d0r) obj6, (em0) obj5, (vb1) obj4, (dc80) obj2, (byte) 3), true));
                return rih1Var;
            case 21:
                return a(obj);
            case 22:
                return d(obj);
            case 23:
                return e(obj);
            default:
                fn31.T((c9n) obj8, (o8n) null, 0, new sq71((iu30) obj7, (Uri) obj, (wkt) obj6, (xwa) obj5, (vwa) obj4, (String) obj3, (xwa) obj2, (lnm) null), 3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        super(1);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(Function0 function0, Function0 function1, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5) {
        super(1);
        this.a = (byte) 13;
        this.g = function0;
        this.h = function1;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.b = ven0Var3;
        this.c = ven0Var4;
        this.d = ven0Var5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(b74 b74Var, String str, ou80 ou80Var, iu30 iu30Var, fdc fdcVar, String str2, String str3) {
        super(1);
        this.a = (byte) 1;
        this.e = b74Var;
        this.b = str;
        this.f = ou80Var;
        this.g = iu30Var;
        this.h = fdcVar;
        this.c = str2;
        this.d = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c9n c9nVar, iu30 iu30Var, wkt wktVar, xwa xwaVar, vwa vwaVar, String str, xwa xwaVar2) {
        super(1);
        this.a = (byte) 24;
        this.e = c9nVar;
        this.f = iu30Var;
        this.c = wktVar;
        this.d = xwaVar;
        this.g = vwaVar;
        this.b = str;
        this.h = xwaVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(xu30 xu30Var, Function0 function0, Function0 function1, t32 t32Var, bab1 bab1Var, vu30 vu30Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 3;
        this.e = xu30Var;
        this.g = function0;
        this.h = function1;
        this.f = t32Var;
        this.b = bab1Var;
        this.c = vu30Var;
        this.d = ven0Var;
    }
}
