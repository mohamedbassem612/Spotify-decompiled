package p;

import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tow {
    public final a710 a;
    public final h610 b;
    public final m210 c;

    public tow(a710 a710Var, h610 h610Var, m210 m210Var) {
        this.a = a710Var;
        this.b = h610Var;
        this.c = m210Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.carapplibrary.api.CommandFailedException */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(sdh sdhVar, onm onmVar) throws CommandFailedException {
        sow sowVar;
        Single singleE;
        Long l;
        String str;
        if (onmVar instanceof sow) {
            sowVar = (sow) onmVar;
            int i = sowVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sowVar.c = i - Integer.MIN_VALUE;
            } else {
                sowVar = new sow(this, onmVar);
            }
        } else {
            sowVar = new sow(this, onmVar);
        }
        Object objJ = sowVar.a;
        int i2 = sowVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            mdh mdhVar = (mdh) sdhVar;
            PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
            boolean z = sdhVar instanceof ldh;
            ldh ldhVar = z ? (ldh) sdhVar : null;
            if (ldhVar != null && (str = ldhVar.b) != null) {
                builder.skipTo(SkipToTrack.builder().trackUri(str).build());
            }
            ldh ldhVar2 = z ? (ldh) sdhVar : null;
            if (ldhVar2 != null && (l = ldhVar2.e) != null) {
                builder.seekTo(new Long(l.longValue()));
            }
            if (sdhVar instanceof odh) {
                builder.playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build());
            }
            PlayOrigin.Builder builder2 = PlayOrigin.builder("android-auto");
            String strA = mdhVar.a();
            if (u890.j(strA, ypn0.b) || u890.j(strA, upn0.b)) {
                strA = l1d.m("android_auto_", strA);
            } else {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                if (u890.j(strA, yon1.U4().c)) {
                    strA = l1d.m("android_auto_", strA);
                } else if (u890.j(strA, lqn0.b)) {
                    strA = "android_auto_recently_played";
                } else if (u890.j(strA, cqn0.b)) {
                    strA = "android_auto_your_library";
                }
            }
            builder2.referrerIdentifier(strA);
            builder2.viewUri(mdhVar.getContextUri());
            String str2 = sdhVar.b().a.a;
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(str2);
            y6r0 y6r0Var = sdhVar.b().b;
            LoggingParams loggingParamsBuild = builderInteractionId.pageInstanceId(y6r0Var != null ? y6r0Var.a : null).build();
            this.b.b(str2);
            String contextUri = mdhVar.getContextUri();
            PreparePlayOptions preparePlayOptionsBuild = builder.build();
            PlayOrigin playOriginBuild = builder2.build();
            z610 z610Var = new z610(contextUri, (Context) null, (Map) null, preparePlayOptionsBuild, playOriginBuild, loggingParamsBuild, 6);
            g710 g710Var = this.a;
            String strP = g710Var.e.a(this.c).p();
            if (strP != null) {
                PlayOrigin playOriginBuild2 = playOriginBuild.toBuilder().restrictionIdentifier(strP).build();
                playOriginBuild2.getClass();
                singleE = g710Var.e(z610.b(z610Var, playOriginBuild2));
            } else {
                singleE = g710Var.e(z610Var);
            }
            sowVar.c = 1;
            objJ = fc11.j(singleE, sowVar);
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
        feh fehVar = (feh) objJ;
        fehVar.getClass();
        if (fehVar instanceof beh) {
            throw new CommandFailedException(((beh) fehVar).a);
        }
        return rih1.a;
    }
}
