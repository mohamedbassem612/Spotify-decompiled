package p;

import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions$Builder;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w410 implements Function {
    public final /* synthetic */ PreparePlayOptions a;

    public w410(PreparePlayOptions preparePlayOptions, z410 z410Var) {
        this.a = preparePlayOptions;
    }

    public final Object apply(Object obj) {
        PreparePlayOptions$Builder preparePlayOptions$BuilderBuilder;
        PlayerOptionOverrides playerOptionOverridesBuild;
        spq0 spq0VarPlayerOptionsOverride;
        Map map = (Map) obj;
        PreparePlayOptions preparePlayOptions = this.a;
        if (preparePlayOptions == null || (preparePlayOptions$BuilderBuilder = preparePlayOptions.toBuilder()) == null) {
            preparePlayOptions$BuilderBuilder = PreparePlayOptions.builder();
        }
        PlayerOptionOverrides playerOptionOverrides = (preparePlayOptions == null || (spq0VarPlayerOptionsOverride = preparePlayOptions.playerOptionsOverride()) == null) ? null : (PlayerOptionOverrides) spq0VarPlayerOptionsOverride.h();
        if (playerOptionOverrides == null) {
            playerOptionOverridesBuild = PlayerOptionOverrides.builder().modes(map).build();
            playerOptionOverridesBuild.getClass();
        } else {
            playerOptionOverridesBuild = playerOptionOverrides.toBuilder().modes(sqg0.O(playerOptionOverrides.modes(), map)).build();
            playerOptionOverridesBuild.getClass();
        }
        preparePlayOptions$BuilderBuilder.playerOptionsOverride(playerOptionOverridesBuild);
        return Single.just(preparePlayOptions$BuilderBuilder.build());
    }
}
