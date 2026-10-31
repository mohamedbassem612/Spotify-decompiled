package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.j9k1;
import p.rih1;
import p.vga0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/vga0;", "Lp/rih1;", "invoke", "(Lp/vga0;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class PreparePlayOptionsSerializer$serialize$1$3 extends hab0 implements iu30 {
    final /* synthetic */ PreparePlayOptions $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparePlayOptionsSerializer$serialize$1$3(PreparePlayOptions preparePlayOptions) {
        super(1);
        this.$value = preparePlayOptions;
    }

    public final void invoke(vga0 vga0Var) {
        if (this.$value.playerOptionsOverride().c()) {
            PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) this.$value.playerOptionsOverride().b();
            if (playerOptionOverrides.shufflingContext().c()) {
                j9k1.y(vga0Var, "shuffling_context", (Boolean) playerOptionOverrides.shufflingContext().b());
            }
            if (playerOptionOverrides.repeatingContext().c()) {
                j9k1.y(vga0Var, "repeating_context", (Boolean) playerOptionOverrides.repeatingContext().b());
            }
            if (playerOptionOverrides.repeatingTrack().c()) {
                j9k1.y(vga0Var, "repeating_track", (Boolean) playerOptionOverrides.repeatingTrack().b());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vga0) obj);
        return rih1.a;
    }
}
