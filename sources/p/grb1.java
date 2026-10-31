package p;

import android.os.Handler;
import com.spotify.player.model.AdBreakContext;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.SleepTimer;
import com.spotify.player.model.command.SeekToCommand;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class grb1 {
    public final yqg a;
    public final erb1 b;
    public final frb1 c;
    public final Handler d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public PlayerState i = PlayerState.EMPTY;
    public Runnable j = new k((byte) 14);
    public final BehaviorProcessor k;
    public final FlowableRefCount l;
    public final rku m;

    public grb1(FlowableObserveOn flowableObserveOn, yqg yqgVar, erb1 erb1Var, frb1 frb1Var, Handler handler) {
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.k = behaviorProcessor;
        rku rkuVar = new rku();
        this.m = rkuVar;
        this.l = new FlowableRefCount(new FlowableDoFinally(behaviorProcessor.w(new po5(this, flowableObserveOn, (byte) 6)), new w43(rkuVar, (byte) 12)).Q());
        this.a = yqgVar;
        this.b = erb1Var;
        this.c = frb1Var;
        this.d = handler;
    }

    public final void a() {
        this.e = true;
        g(this.i, 1, false);
    }

    public final void b() {
        g(this.i, 1, false);
    }

    public final void c() {
        this.e = false;
        g(this.i, 1, false);
    }

    public final void d(boolean z) {
        this.f = z;
        g(this.i, 1, false);
    }

    public final void e() {
        frb1 frb1Var = this.c;
        if (frb1Var.e.c() && frb1Var.h + frb1Var.i + 1 < frb1Var.g.size()) {
            frb1Var.i++;
            frb1Var.j = new i5w0(Long.valueOf(frb1Var.a.b()));
            frb1Var.a();
        }
        g(this.i, 1, false);
    }

    public final void f(boolean z) {
        if (!z || ((Long) this.i.position(this.a.b()).e(0L)).longValue() < 3000) {
            frb1 frb1Var = this.c;
            if (frb1Var.e.c()) {
                int i = frb1Var.h;
                int i2 = frb1Var.i;
                if (i + i2 > 0) {
                    frb1Var.i = i2 - 1;
                    frb1Var.j = new i5w0(Long.valueOf(frb1Var.a.b()));
                    frb1Var.a();
                }
            }
        } else {
            this.b.b(0L, SeekToCommand.Relative.BEGINNING);
        }
        g(this.i, 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    public final void g(PlayerState playerState, int i, boolean z) {
        boolean z2;
        erb1 erb1Var = this.b;
        frb1 frb1Var = this.c;
        spq0 spq0Var = j5.a;
        if (i == 2) {
            this.e = playerState.isPaused();
            this.g = playerState.options().repeatingTrack();
            this.h = playerState.options().repeatingContext();
            this.f = playerState.options().shufflingContext();
            if (!erb1Var.c.c() || erb1Var.d < playerState.timestamp()) {
                erb1Var.b = playerState;
                erb1Var.c = spq0Var;
                erb1Var.d = 0L;
            }
            if (!frb1Var.j.c()) {
                b380 b380VarPrevTracks = playerState.prevTracks();
                spq0 spq0VarTrack = playerState.track();
                b380 b380VarNextTracks = playerState.nextTracks();
                ArrayList arrayList = new ArrayList(b380VarNextTracks.size() + b380VarPrevTracks.size() + 1);
                arrayList.addAll(b380VarPrevTracks);
                arrayList.add((ContextTrack) spq0VarTrack.h());
                arrayList.addAll(b380VarNextTracks);
                frb1Var.g = arrayList;
                frb1Var.h = playerState.prevTracks().size();
                frb1Var.i = 0;
                frb1Var.j = spq0Var;
                frb1Var.b = playerState.playbackId();
                frb1Var.c = playerState.index();
                frb1Var.a();
            } else if (playerState.timestamp() >= ((Long) frb1Var.j.b()).longValue()) {
                spq0 spq0VarTrack2 = playerState.track();
                String strUri = frb1Var.e.c() ? ((ContextTrack) frb1Var.e.b()).uri() : null;
                String strUri2 = spq0VarTrack2.c() ? ((ContextTrack) spq0VarTrack2.b()).uri() : "";
                spq0 spq0VarTrack3 = playerState.track();
                if (spq0VarTrack3.c()) {
                    String strProvider = ((ContextTrack) spq0VarTrack3.b()).provider();
                    if ("context".equals(strProvider) || "queue".equals(strProvider)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                if (z || strUri == null || strUri.equals(strUri2) || playerState.timestamp() >= ((Long) frb1Var.j.b()).longValue() + 500 || z2) {
                    b380 b380VarPrevTracks2 = playerState.prevTracks();
                    spq0 spq0VarTrack4 = playerState.track();
                    b380 b380VarNextTracks2 = playerState.nextTracks();
                    ArrayList arrayList2 = new ArrayList(b380VarNextTracks2.size() + b380VarPrevTracks2.size() + 1);
                    arrayList2.addAll(b380VarPrevTracks2);
                    arrayList2.add((ContextTrack) spq0VarTrack4.h());
                    arrayList2.addAll(b380VarNextTracks2);
                    frb1Var.g = arrayList2;
                    frb1Var.h = playerState.prevTracks().size();
                    frb1Var.i = 0;
                    frb1Var.j = spq0Var;
                    frb1Var.b = playerState.playbackId();
                    frb1Var.c = playerState.index();
                    frb1Var.a();
                }
            }
        }
        boolean zC = frb1Var.j.c();
        Runnable runnable = this.j;
        Handler handler = this.d;
        handler.removeCallbacks(runnable);
        if (i == 2 && zC && !z) {
            z0d z0dVar = new z0d(this, playerState, i, (byte) 9);
            this.j = z0dVar;
            handler.postDelayed(z0dVar, 200L);
            return;
        }
        Double dValueOf = Double.valueOf(0.0d);
        long jB = this.a.b();
        boolean zC2 = frb1Var.j.c();
        PlayerState.Builder builderOptions = PlayerState.builder().timestamp(jB).contextUri(playerState.contextUri()).contextUrl(playerState.contextUrl()).contextRestrictions(playerState.contextRestrictions()).playOrigin(playerState.playOrigin()).isPlaying(playerState.isPlaying()).isPaused(this.e).isBuffering(playerState.isBuffering()).isSystemInitiated(playerState.isSystemInitiated()).options(PlayerOptions.builder().shufflingContext(this.f).repeatingContext(this.h).repeatingTrack(this.g).modes(playerState.options().modes()).build());
        Restrictions restrictions = playerState.restrictions();
        Restrictions.Builder builder = restrictions.toBuilder();
        HashSet hashSet = new HashSet((Collection) restrictions.disallowPausingReasons());
        if (this.e) {
            hashSet.add("already_paused");
        } else {
            hashSet.remove("already_paused");
        }
        Restrictions.Builder builderDisallowPausingReasons = builder.disallowPausingReasons(hashSet);
        HashSet hashSet2 = new HashSet((Collection) restrictions.disallowResumingReasons());
        if (this.e) {
            hashSet2.remove("not_paused");
        } else {
            hashSet2.add("not_paused");
        }
        PlayerState.Builder builderSignals = builderOptions.restrictions(builderDisallowPausingReasons.disallowResumingReasons(hashSet2).build()).suppressions(playerState.suppressions()).prevTracks(frb1Var.d).nextTracks(frb1Var.f).contextMetadata(playerState.contextMetadata()).pageMetadata(playerState.pageMetadata()).sessionId(playerState.sessionId()).queueRevision(playerState.queueRevision()).audioStream(playerState.audioStream()).signals(playerState.signals());
        spq0 spq0VarAdBreakContext = playerState.adBreakContext();
        if (spq0VarAdBreakContext.c()) {
            builderSignals.adBreakContext((AdBreakContext) spq0VarAdBreakContext.b());
        }
        spq0 spq0VarSleepTimer = playerState.sleepTimer();
        if (spq0VarSleepTimer.c()) {
            builderSignals.sleepTimer((SleepTimer) spq0VarSleepTimer.b());
        }
        spq0 spq0Var2 = frb1Var.e;
        if (spq0Var2.c()) {
            builderSignals.track((ContextTrack) spq0Var2.b());
            spq0 spq0Var3 = !frb1Var.j.c() ? frb1Var.b : spq0Var;
            if (spq0Var3.c()) {
                builderSignals.playbackId((String) spq0Var3.b());
            }
            spq0 spq0VarPlaybackQuality = playerState.playbackQuality();
            if (spq0VarPlaybackQuality.c()) {
                builderSignals.playbackQuality((PlaybackQuality) spq0VarPlaybackQuality.b());
            }
            if (!frb1Var.j.c()) {
                spq0Var = frb1Var.c;
            }
            if (spq0Var.c()) {
                builderSignals.index((ContextIndex) spq0Var.b());
            }
        }
        if (!zC2) {
            spq0 spq0VarA = erb1Var.a(jB);
            if (spq0VarA.c()) {
                builderSignals.positionAsOfTimestamp((Long) spq0VarA.b());
            }
            spq0 spq0VarDuration = playerState.duration();
            if (spq0VarDuration.c()) {
                builderSignals.duration((Long) spq0VarDuration.b());
            }
            spq0 i5w0Var = (this.e || !erb1Var.b.duration().c() || erb1Var.c.c()) ? new i5w0(dValueOf) : erb1Var.b.playbackSpeed();
            if (i5w0Var.c()) {
                builderSignals.playbackSpeed((Double) i5w0Var.b());
            }
        }
        PlayerState playerStateBuild = builderSignals.build();
        this.i = playerStateBuild;
        this.k.onNext(playerStateBuild);
    }
}
