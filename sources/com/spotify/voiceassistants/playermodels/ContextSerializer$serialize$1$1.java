package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.Context;
import java.util.Map;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.j9k1;
import p.rih1;
import p.vga0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/vga0;", "Lp/rih1;", "invoke", "(Lp/vga0;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class ContextSerializer$serialize$1$1 extends hab0 implements iu30 {
    final /* synthetic */ Context $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextSerializer$serialize$1$1(Context context) {
        super(1);
        this.$value = context;
    }

    public final void invoke(vga0 vga0Var) {
        for (Map.Entry entry : this.$value.metadata().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            j9k1.A(vga0Var, str, str2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vga0) obj);
        return rih1.a;
    }
}
