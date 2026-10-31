package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q410 {
    public static final Set n = dm61.z0(blc0.ALBUM, blc0.LOCAL_FILES_ROOT);
    public static final Set o = dm61.z0(sqc0.a, xqc0.a, yqc0.a, wqc0.a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qrc0 f68p = qrc0.a;
    public static final Set q = dm61.z0(blc0.TRACK, blc0.SHOW_EPISODE, blc0.PODCAST_CHAPTER, blc0.CLIP);
    public final o241 a;
    public final xrc0 b;
    public final cyp c;
    public final n3d0 d;
    public final Observable e;
    public final kly0 f;
    public final yqg g;
    public final dxz0 h;
    public final fgr i;
    public final q8n j;
    public final Flowable k;
    public final uu00 l;
    public final idd1 m = new idd1(new pdy(this, (byte) 28));

    public q410(o241 o241Var, rh11 rh11Var, xrc0 xrc0Var, agc0 agc0Var, wqg wqgVar, cyp cypVar, n3d0 n3d0Var, Observable observable, chp chpVar, yqg yqgVar, dxz0 dxz0Var, fgr fgrVar, q8n q8nVar, Flowable flowable, uu00 uu00Var) {
        this.a = o241Var;
        this.b = xrc0Var;
        this.c = cypVar;
        this.d = n3d0Var;
        this.e = observable;
        this.f = chpVar;
        this.g = yqgVar;
        this.h = dxz0Var;
        this.i = fgrVar;
        this.j = q8nVar;
        this.k = flowable;
        this.l = uu00Var;
    }

    public static Single d(q410 q410Var, PlayOrigin playOrigin, LoggingParams loggingParams, Map map, String str, PreparePlayOptions preparePlayOptions) {
        return q410Var.a.a.firstOrError().flatMap(new p410(q410Var, str, preparePlayOptions, map, loggingParams, playOrigin, (Object) null, (byte) 0));
    }

    public static PlayerOptionOverrides e(PreparePlayOptions preparePlayOptions, boolean z, boolean z2) {
        PlayerOptionOverrides.Builder builder;
        spq0 spq0VarPlayerOptionsOverride;
        PlayerOptionOverrides playerOptionOverrides;
        spq0 spq0VarRepeatingContext;
        spq0 spq0VarPlayerOptionsOverride2;
        PlayerOptionOverrides playerOptionOverrides2;
        spq0 spq0VarShufflingContext;
        spq0 spq0VarPlayerOptionsOverride3;
        PlayerOptionOverrides playerOptionOverrides3;
        if (preparePlayOptions == null || (spq0VarPlayerOptionsOverride3 = preparePlayOptions.playerOptionsOverride()) == null || (playerOptionOverrides3 = (PlayerOptionOverrides) spq0VarPlayerOptionsOverride3.h()) == null || (builder = playerOptionOverrides3.toBuilder()) == null) {
            builder = PlayerOptionOverrides.builder();
        }
        if (z2) {
            builder.shufflingContext(Boolean.FALSE);
        } else if (!z) {
            boolean zJ = false;
            if ((preparePlayOptions == null || (spq0VarPlayerOptionsOverride2 = preparePlayOptions.playerOptionsOverride()) == null || (playerOptionOverrides2 = (PlayerOptionOverrides) spq0VarPlayerOptionsOverride2.h()) == null || (spq0VarShufflingContext = playerOptionOverrides2.shufflingContext()) == null) ? false : u890.j(spq0VarShufflingContext.h(), Boolean.FALSE)) {
                builder = PlayerOptionOverrides.builder();
                if (preparePlayOptions != null && (spq0VarPlayerOptionsOverride = preparePlayOptions.playerOptionsOverride()) != null && (playerOptionOverrides = (PlayerOptionOverrides) spq0VarPlayerOptionsOverride.h()) != null && (spq0VarRepeatingContext = playerOptionOverrides.repeatingContext()) != null) {
                    zJ = u890.j(spq0VarRepeatingContext.h(), Boolean.TRUE);
                }
                if (zJ) {
                    builder.repeatingContext(Boolean.TRUE);
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r13 == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.String r12, p.onm r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.k410
            if (r0 == 0) goto L13
            r0 = r13
            p.k410 r0 = (p.k410) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.k410 r0 = new p.k410
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r13)
            goto L5e
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r2
        L31:
            java.lang.String r12 = r0.a
            p.hm5.M(r13)
            goto L4b
        L37:
            p.hm5.M(r13)
            io.reactivex.rxjava3.core.Observable r13 = r11.e
            io.reactivex.rxjava3.core.Single r13 = r13.firstOrError()
            r0.a = r12
            r0.d = r4
            java.lang.Object r13 = p.fc11.j(r13, r0)
            if (r13 != r5) goto L4b
            goto L5d
        L4b:
            java.lang.String r13 = (java.lang.String) r13
            p.n3d0 r1 = r11.d
            p.r3d0 r13 = r1.a(r13)
            r0.a = r2
            r0.d = r3
            java.lang.Object r13 = r13.a(r12, r0)
            if (r13 != r5) goto L5e
        L5d:
            return r5
        L5e:
            r2 = r13
            p.g3d0 r2 = (p.g3d0) r2
            p.trc0 r0 = new p.trc0
            p.kly0 r11 = r11.f
            java.lang.Object r11 = r11.get()
            r1 = r11
            com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy r1 = (com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy) r1
            r9 = 0
            r10 = 448(0x1c0, float:6.28E-43)
            java.util.Set r3 = p.q410.o
            r4 = 0
            p.qrc0 r5 = p.q410.f68p
            p.hqz0 r6 = p.hqz0.a
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            p.mmr0 r11 = new p.mmr0
            r11.<init>(r0, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q410.a(java.lang.String, p.onm):java.io.Serializable");
    }

    public final Single b(String str, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        Context.Builder builder = Context.fromUri(str).toBuilder();
        if (map != null) {
            builder.metadata(map);
        }
        PlayCommand.Builder builderLoggingParams = PlayCommand.builder(builder.build(), playOrigin).loggingParams(loggingParams);
        if (preparePlayOptions != null) {
            builderLoggingParams.options(preparePlayOptions);
        }
        return ((muz) this.m.getValue()).a(builderLoggingParams.build());
    }

    public final Single c(String str, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        Single singleJust;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        blc0 blc0Var = s4b1VarX.c;
        if (blc0Var == blc0.ARTIST) {
            singleJust = this.h.e().take(1L).singleOrError().map(new kp00(this, str, (byte) 3));
        } else if (blc0Var == blc0.COLLECTION_ARTIST) {
            singleJust = Single.just("spotify:list:liked-songs-artist:".concat(s4b1VarX.h()));
        } else {
            singleJust = blc0Var == blc0.COLLECTION_PODCASTS_EPISODES ? Single.just("spotify:list:whats-new:podcasts") : Single.just(str);
        }
        return singleJust.flatMap(new bjx(this, str, preparePlayOptions, playOrigin, loggingParams, map, (byte) 3));
    }
}
