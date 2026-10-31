package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PrefetchLevel;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions$Builder;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import p.aha0;
import p.bga0;
import p.dar;
import p.ega0;
import p.fga0;
import p.h661;
import p.j380;
import p.j9k1;
import p.jga0;
import p.nma0;
import p.omo1;
import p.spq0;
import p.uax;
import p.uga0;
import p.vga0;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/PreparePlayOptionsSerializer;", "Lp/nma0;", "Lcom/spotify/player/model/command/options/PreparePlayOptions;", "<init>", "()V", "Lp/uga0;", "json", "Lcom/spotify/player/model/command/options/PreparePlayOptions$Builder;", "builder", "Lp/rih1;", "readPlayerOptionOverrides", "(Lp/uga0;Lcom/spotify/player/model/command/options/PreparePlayOptions$Builder;)V", "readSuppressions", "Lp/ega0;", "", "toConfigurationOverrideValue", "(Lp/ega0;)Ljava/lang/String;", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/player/model/command/options/PreparePlayOptions;", "Lp/uax;", "encoder", "value", "serialize", "(Lp/uax;Lcom/spotify/player/model/command/options/PreparePlayOptions;)V", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PreparePlayOptionsSerializer implements nma0 {
    public static final PreparePlayOptionsSerializer INSTANCE = new PreparePlayOptionsSerializer();
    private static final h661 descriptor = omo1.j("com.spotify.player.model.command.options.PreparePlayOptions", new h661[0]);

    private PreparePlayOptionsSerializer() {
    }

    private final void readPlayerOptionOverrides(uga0 json, PreparePlayOptions$Builder builder) {
        if (json.a.isEmpty()) {
            return;
        }
        PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
        ega0 ega0Var = (ega0) json.get("repeating_context");
        if (ega0Var != null) {
            builder2.repeatingContext(Boolean.valueOf(fga0.e(fga0.m(ega0Var))));
        }
        ega0 ega0Var2 = (ega0) json.get("shuffling_context");
        if (ega0Var2 != null) {
            builder2.shufflingContext(Boolean.valueOf(fga0.e(fga0.m(ega0Var2))));
        }
        ega0 ega0Var3 = (ega0) json.get("repeating_track");
        if (ega0Var3 != null) {
            builder2.repeatingTrack(Boolean.valueOf(fga0.e(fga0.m(ega0Var3))));
        }
        builder.playerOptionsOverride(builder2.build());
    }

    private final void readSuppressions(uga0 json, PreparePlayOptions$Builder builder) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ega0 ega0Var = (ega0) json.get("providers");
        if (ega0Var != null) {
            Iterator it = fga0.k(ega0Var).a.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(fga0.m((ega0) it.next()).b());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        builder.suppressions(linkedHashSet);
    }

    private final String toConfigurationOverrideValue(ega0 ega0Var) {
        String strB;
        aha0 aha0Var = ega0Var instanceof aha0 ? (aha0) ega0Var : null;
        return (aha0Var == null || (strB = aha0Var.b()) == null) ? ega0Var.toString() : strB;
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public PreparePlayOptions m26deserialize(dar decoder) {
        String strG;
        String strG2;
        String strG3;
        String strG4;
        ega0 ega0Var;
        String strG5;
        String strG6;
        uga0 uga0VarL = fga0.l(((bga0) decoder).m());
        PreparePlayOptions$Builder preparePlayOptions$BuilderBuilder = PreparePlayOptions.builder();
        ega0 ega0Var2 = (ega0) uga0VarL.get("playback_id");
        if (ega0Var2 != null && (strG6 = fga0.g(fga0.m(ega0Var2))) != null) {
            preparePlayOptions$BuilderBuilder.playbackId(strG6);
        }
        ega0 ega0Var3 = (ega0) uga0VarL.get("always_play_something");
        if (ega0Var3 != null) {
            preparePlayOptions$BuilderBuilder.alwaysPlaySomething(fga0.e(fga0.m(ega0Var3)));
        }
        ega0 ega0Var4 = (ega0) uga0VarL.get("seek_to");
        if (ega0Var4 != null) {
            preparePlayOptions$BuilderBuilder.seekTo(Long.valueOf(fga0.n(fga0.m(ega0Var4))));
        }
        ega0 ega0Var5 = (ega0) uga0VarL.get("skip_to");
        if (ega0Var5 != null && (ega0Var = (ega0) fga0.l(ega0Var5).get("track_uri")) != null && (strG5 = fga0.g(fga0.m(ega0Var))) != null) {
            preparePlayOptions$BuilderBuilder.skipTo(SkipToTrack.fromUri(strG5));
        }
        ega0 ega0Var6 = (ega0) uga0VarL.get("initially_paused");
        if (ega0Var6 != null) {
            preparePlayOptions$BuilderBuilder.initiallyPaused(fga0.e(fga0.m(ega0Var6)));
        }
        ega0 ega0Var7 = (ega0) uga0VarL.get("system_initiated");
        if (ega0Var7 != null) {
            preparePlayOptions$BuilderBuilder.systemInitiated(fga0.e(fga0.m(ega0Var7)));
        }
        ega0 ega0Var8 = (ega0) uga0VarL.get("player_options_override");
        if (ega0Var8 != null) {
            uga0 uga0VarL2 = fga0.l(ega0Var8);
            PreparePlayOptionsSerializer preparePlayOptionsSerializer = INSTANCE;
            preparePlayOptions$BuilderBuilder.getClass();
            preparePlayOptionsSerializer.readPlayerOptionOverrides(uga0VarL2, preparePlayOptions$BuilderBuilder);
        }
        ega0 ega0Var9 = (ega0) uga0VarL.get("suppressions");
        if (ega0Var9 != null) {
            uga0 uga0VarL3 = fga0.l(ega0Var9);
            PreparePlayOptionsSerializer preparePlayOptionsSerializer2 = INSTANCE;
            preparePlayOptions$BuilderBuilder.getClass();
            preparePlayOptionsSerializer2.readSuppressions(uga0VarL3, preparePlayOptions$BuilderBuilder);
        }
        ega0 ega0Var10 = (ega0) uga0VarL.get("prefetch_level");
        if (ega0Var10 != null && (strG4 = fga0.g(fga0.m(ega0Var10))) != null) {
            preparePlayOptions$BuilderBuilder.prefetchLevel(PrefetchLevel.valueOf(strG4));
        }
        ega0 ega0Var11 = (ega0) uga0VarL.get("audio_stream");
        if (ega0Var11 != null && (strG3 = fga0.g(fga0.m(ega0Var11))) != null) {
            preparePlayOptions$BuilderBuilder.audioStream(AudioStream.valueOf(strG3));
        }
        ega0 ega0Var12 = (ega0) uga0VarL.get("session_id");
        if (ega0Var12 != null && (strG2 = fga0.g(fga0.m(ega0Var12))) != null) {
            preparePlayOptions$BuilderBuilder.sessionId(strG2);
        }
        ega0 ega0Var13 = (ega0) uga0VarL.get("license");
        if (ega0Var13 != null && (strG = fga0.g(fga0.m(ega0Var13))) != null) {
            preparePlayOptions$BuilderBuilder.license(strG);
        }
        ega0 ega0Var14 = (ega0) uga0VarL.get("configuration_override");
        if (ega0Var14 != null) {
            Map map = fga0.l(ega0Var14).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), INSTANCE.toConfigurationOverrideValue((ega0) entry.getValue()));
            }
            preparePlayOptions$BuilderBuilder.configurationOverride(j380.c(linkedHashMap));
        }
        return preparePlayOptions$BuilderBuilder.build();
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    public void serialize(uax encoder, PreparePlayOptions value) {
        spq0 spq0VarTrackUri;
        jga0 jga0Var = (jga0) encoder;
        vga0 vga0Var = new vga0();
        String str = (String) value.playbackId().h();
        if (str != null) {
            j9k1.A(vga0Var, "playback_id", str);
        }
        spq0 spq0VarAlwaysPlaySomething = value.alwaysPlaySomething();
        Boolean bool = Boolean.FALSE;
        j9k1.y(vga0Var, "always_play_something", (Boolean) spq0VarAlwaysPlaySomething.e(bool));
        SkipToTrack skipToTrack = (SkipToTrack) value.skipTo().h();
        if (skipToTrack != null && (spq0VarTrackUri = skipToTrack.trackUri()) != null && spq0VarTrackUri.c()) {
            j9k1.B(vga0Var, "skip_to", new PreparePlayOptionsSerializer$serialize$1$2(value));
        }
        if (value.seekTo().c()) {
            j9k1.z(vga0Var, "seek_to", (Number) value.seekTo().b());
        }
        j9k1.y(vga0Var, "initially_paused", (Boolean) value.initiallyPaused().e(bool));
        if (value.systemInitiated().c()) {
            j9k1.y(vga0Var, "system_initiated", (Boolean) value.systemInitiated().b());
        }
        j9k1.B(vga0Var, "player_options_override", new PreparePlayOptionsSerializer$serialize$1$3(value));
        j9k1.B(vga0Var, "suppressions", new PreparePlayOptionsSerializer$serialize$1$4(value));
        if (value.prefetchLevel().c()) {
            j9k1.A(vga0Var, "prefetch_level", ((PrefetchLevel) value.prefetchLevel().b()).toString());
        }
        if (value.audioStream().c()) {
            j9k1.A(vga0Var, "audio_stream", ((AudioStream) value.audioStream().b()).toString());
        }
        if (value.sessionId().c()) {
            j9k1.A(vga0Var, "session_id", (String) value.sessionId().b());
        }
        if (value.license().c()) {
            j9k1.A(vga0Var, "license", (String) value.license().b());
        }
        j9k1.B(vga0Var, "configuration_override", new PreparePlayOptionsSerializer$serialize$1$5(value));
        jga0Var.R(vga0Var.a());
    }
}
