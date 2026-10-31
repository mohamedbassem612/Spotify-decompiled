package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class v7s implements lxh0 {
    public final s24 a;
    public final x610 b;
    public final PlayOrigin c;
    public final fkt0 d;
    public final oyr e;
    public final g510 f;
    public final r8l g;
    public final b791 h;
    public final u210 i;
    public final phl1 j;

    public v7s(x610 x610Var, PlayOrigin playOrigin, int i, oyr oyrVar, g510 g510Var, d8q d8qVar, r8l r8lVar, b791 b791Var, u210 u210Var, phl1 phl1Var, e8q e8qVar, uic uicVar) {
        this.b = x610Var;
        this.c = playOrigin;
        this.e = oyrVar;
        this.f = g510Var;
        this.g = r8lVar;
        this.h = b791Var;
        this.a = d8qVar.a(x610Var);
        this.i = u210Var;
        this.j = phl1Var;
        daq daqVar = e8qVar.a.a;
        this.d = new fkt0(x610Var, playOrigin, i, daqVar.v1(), (g510) daqVar.L5.get(), daqVar.Y(), new hs41((zle1) daqVar.a3.get()));
    }

    public Completable a(long j, String str) {
        return this.f.l(j, this.g.a(str)).map(new ofr((byte) 11)).flatMap(new t7s(this, j, (byte) 0)).ignoreElement();
    }

    public Completable b(String str, Uri uri, Bundle bundle) {
        Logger.d("MBS: MediaSessionCallback.onPlayFromUri - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public Completable c(String str) {
        m210 m210VarA = this.g.a(str);
        v(m210VarA);
        return this.f.o(m210VarA).map(new ofr((byte) 12)).flatMapCompletable(new r7s(this, (byte) 1));
    }

    public final Completable d(long j, String str) {
        return this.h.a((int) j, this.g.a(str));
    }

    public Completable e(String str) {
        m210 m210VarA = this.g.a(str);
        v(m210VarA);
        return this.f.d(m210VarA).map(new ofr((byte) 15)).flatMapCompletable(new r7s(this, (byte) 0));
    }

    public final boolean f(String str) {
        return false;
    }

    public final Completable g(String str, String str2, Bundle bundle) {
        try {
            return this.a.F(str2, bundle, this.g.a(str));
        } catch (IllegalArgumentException e) {
            Logger.e(e, "MBS: Media action %s is not supported", new Object[]{str2});
            return CompletableEmpty.a;
        }
    }

    public Completable h(int i, String str) {
        Logger.d("MBS: MediaSessionCallback.onSetRating - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public Completable i(String str, String str2, Bundle bundle) {
        m210 m210VarA = this.g.a(str);
        o6x o6xVar = o6x.a;
        fkt0 fkt0Var = this.d;
        lnm lnmVar = null;
        return (str2 == null || str2.length() == 0) ? j2h1.D(o6xVar, new f3t0(fkt0Var, m210VarA, lnmVar, (byte) 7)) : j2h1.D(o6xVar, new ofk0((Object) fkt0Var, (Object) str2, (Object) m210VarA, lnmVar, (byte) 26));
    }

    public final Single j(Bundle bundle, String str) {
        return Single.never();
    }

    public Completable k(String str) {
        m210 m210VarA = this.g.a(str);
        v(m210VarA);
        return this.f.n(m210VarA).map(new ofr((byte) 13)).flatMapCompletable(new r7s(this, (byte) 2));
    }

    public Completable l(String str, y0i0 y0i0Var) {
        y0i0Var.toString();
        m210 m210VarA = this.g.a(str);
        int iOrdinal = y0i0Var.ordinal();
        g510 g510Var = this.f;
        x610 x610Var = this.b;
        if (iOrdinal == 0) {
            return x610Var.c().k(1).ignoreElement().q(g510Var.h(m210VarA).ignoreElement());
        }
        if (iOrdinal == 1) {
            return x610Var.c().k(3).ignoreElement().q(g510Var.i(m210VarA).ignoreElement());
        }
        if (iOrdinal == 2) {
            return x610Var.c().k(2).ignoreElement().q(g510Var.g(m210VarA).ignoreElement());
        }
        Logger.d("MBS: Setting Repeat mode unsupported: (%s)", new Object[]{y0i0Var.toString()});
        return CompletableEmpty.a;
    }

    public final List m() {
        return new ArrayList();
    }

    public Completable n(int i, String str) {
        pze0.o(i);
        m210 m210VarA = this.g.a(str);
        int iC = l1d.C(i);
        g510 g510Var = this.f;
        x610 x610Var = this.b;
        if (iC == 0) {
            g710 g710VarC = x610Var.c();
            return g710VarC.j.d(SetShufflingContextCommand.create(false)).ignoreElement().q(g510Var.m(m210VarA, 2, 1).ignoreElement());
        }
        if (iC != 1) {
            Logger.d("MBS: Setting Shuffle mode unsupported: (%s)", new Object[]{pze0.o(i)});
            return CompletableEmpty.a;
        }
        g710 g710VarC2 = x610Var.c();
        return g710VarC2.j.d(SetShufflingContextCommand.create(true)).ignoreElement().q(g510Var.m(m210VarA, 1, 2).ignoreElement());
    }

    public Completable o(String str) {
        return t(str, false).ignoreElement();
    }

    public final Completable p(String str) {
        return this.b.c().d(j5.a).ignoreElement();
    }

    public Completable q(String str, Uri uri, Bundle bundle) {
        Logger.d("MBS: MediaSessionCallback.onPrepareFromUri - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public Completable r(int i, Bundle bundle, String str, String str2) {
        return s(str, str2, bundle, i, bundle != null && (bundle.getInt("com.spotify.music.extra.PLAYBACK_TYPE") == 1 || i == 4));
    }

    public final Completable s(String str, String str2, Bundle bundle, int i, final boolean z) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String string = bundle2.getString("com.spotify.music.extra.CONTEXT_URI");
        List listQ0 = ihc1.Q0(str2, new String[]{"---"}, 0, 6);
        String str3 = listQ0.size() == 2 ? (String) listQ0.get(1) : str2;
        String string2 = bundle2.getString("com.spotify.music.extra.CONTEXT_URI");
        int i2 = bundle2.getInt("com.spotify.music.extra.TRACK_INDEX", -1);
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        if (i2 >= 0 || (string2 != null && !str3.equals(string2))) {
            b3i1 b3i1Var = nyu0.e;
            if (string2 != null) {
                SkipToTrack.Builder builderTrackUri = SkipToTrack.builder().trackUri(str3);
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(string2);
                v5b1 v5b1Var = s4b1VarX.d;
                if ((s4b1VarX.c == blc0.g1 || (v5b1Var != null && v5b1Var.getType() == b3i1Var)) && i2 >= 0) {
                    builderTrackUri.trackIndex(Long.valueOf(i2)).pageIndex(0L);
                }
                builder.skipTo(builderTrackUri.build());
            } else {
                Set set2 = s4b1.f;
                s4b1 s4b1VarX2 = uic.x(str3);
                v5b1 v5b1Var2 = s4b1VarX2.d;
                if (s4b1VarX2.c == blc0.g1 || (v5b1Var2 != null && v5b1Var2.getType() == b3i1Var)) {
                    builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf(i2)).build());
                }
            }
        }
        AudioStream audioStream = i == 4 ? AudioStream.ALARM : AudioStream.DEFAULT;
        if (audioStream == AudioStream.ALARM) {
            builder.playerOptionsOverride(PlayerOptionOverrides.builder().repeatingContext(Boolean.TRUE).build());
        }
        builder.audioStream(audioStream);
        if (pst0.a(bundle2)) {
            builder.playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.valueOf(bundle2.getBoolean("com.spotify.music.extra.SHUFFLE"))).build());
        }
        if (bundle2.containsKey("com.spotify.music.extra.ALWAYS_PLAY_SOMETHING") && bundle2.getBoolean("com.spotify.music.extra.ALWAYS_PLAY_SOMETHING")) {
            builder.alwaysPlaySomething(true);
        }
        final PreparePlayOptions preparePlayOptionsBuild = builder.build();
        String str4 = string != null ? string : str3;
        PlayOrigin.Builder builder2 = this.c.toBuilder();
        String string3 = bundle2.getString("com.spotify.music.extra.PLAY_ORIGIN");
        if (string3 != null) {
            builder2.referrerIdentifier(string3);
        }
        final PlayOrigin playOriginBuild = builder2.viewUri(str4).build();
        List listQ1 = ihc1.Q0(str2, new String[]{"---"}, 0, 6);
        i410 i410Var = new i410(listQ1.size() == 2 ? (String) listQ1.get(0) : null);
        final m210 m210VarA = this.g.a(str);
        Single map = u(str, str3, string, bundle2, i410Var).map(new ofr((byte) 14));
        final String str5 = str4;
        return map.flatMap(new Function() { // from class: p.u7s
            public final Object apply(Object obj) {
                Single singleE;
                LoggingParams loggingParams = (LoggingParams) obj;
                v7s v7sVar = this.a;
                x610 x610Var = v7sVar.b;
                if (z) {
                    x610Var.b().b((String) loggingParams.interactionId().h());
                }
                u210 u210Var = v7sVar.i;
                m210 m210Var = m210VarA;
                b8p1 b8p1Var = new b8p1(u210Var, 2, m210Var.a, (String) loggingParams.interactionId().b(), (byte) 3);
                g710 g710VarC = x610Var.c();
                Map map2 = Collections.EMPTY_MAP;
                String str6 = str5;
                PreparePlayOptions preparePlayOptions = preparePlayOptionsBuild;
                PlayOrigin playOrigin = playOriginBuild;
                z610 z610Var = new z610(str6, (Context) null, map2, preparePlayOptions, playOrigin, loggingParams);
                g710 g710Var = g710VarC;
                String strP = g710Var.e.a(m210Var).p();
                if (strP != null) {
                    PlayOrigin playOriginBuild2 = playOrigin.toBuilder().restrictionIdentifier(strP).build();
                    playOriginBuild2.getClass();
                    singleE = g710Var.e(z610.b(z610Var, playOriginBuild2));
                } else {
                    singleE = g710Var.e(z610Var);
                }
                return b8p1Var.w(singleE);
            }
        }).ignoreElement();
    }

    public final Single t(String str, boolean z) {
        m210 m210VarA = this.g.a(str);
        v(m210VarA);
        return this.f.j(m210VarA).map(new s7s(this, z, (byte) 0)).flatMap(new uk4(this, m210VarA, (byte) 15));
    }

    public Single u(String str, String str2, String str3, Bundle bundle, i410 i410Var) {
        UbiSpecificationId ubiSpecificationId;
        String str4;
        Integer numValueOf;
        boolean zA = pst0.a(bundle);
        oyr oyrVar = this.e;
        Iterator it = oyrVar.b.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ubiSpecificationId = (UbiSpecificationId) entry.getKey();
            ((r64) entry.getValue()).getClass();
        } while (!jo31.o(i410Var.a()));
        String str5 = str3 != null ? str3 : str2;
        spq0 spq0VarB = oyrVar.b(str2, ubiSpecificationId);
        if (spq0VarB.c()) {
            numValueOf = Integer.valueOf(((q710) spq0VarB.b()).b);
            str4 = ((q710) spq0VarB.b()).c;
        } else {
            str4 = null;
            numValueOf = null;
        }
        spq0 spq0VarA = oyrVar.a(zA, str2, new r710(ubiSpecificationId, str5, str4, numValueOf));
        m210 m210VarA = this.g.a(str);
        g510 g510Var = this.f;
        if (!zA) {
            return g510Var.e(m210VarA, str2, (w7h1) spq0VarA.h(), (ou80) null, 1);
        }
        w7h1 w7h1Var = (w7h1) spq0VarA.h();
        uqk0 uqk0Var = g510Var.h;
        w7h1 w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str2)), uqk0Var.c, uqk0Var.b, System.currentTimeMillis());
        if (w7h1Var == null) {
            w7h1Var = w7h1Var2;
        }
        return Single.defer(new h23((Object) null, g510Var, w7h1Var, m210VarA, (byte) 1));
    }

    public final void v(m210 m210Var) {
        boolean zEquals = m210Var.a.equals("wear_os");
        phl1 phl1Var = this.j;
        if (zEquals) {
            phl1Var.d.a(ohl1.d);
        }
        if (m210Var.k.equals("com.android.systemui") && m210Var.j.equals("media_session") && m210Var.d.equals("app_to_app") && phl1Var.b.b() - phl1Var.a.g(qhl1.b, Long.MAX_VALUE) > 2419200000L) {
            phl1Var.d.a(ohl1.b);
        }
    }
}
