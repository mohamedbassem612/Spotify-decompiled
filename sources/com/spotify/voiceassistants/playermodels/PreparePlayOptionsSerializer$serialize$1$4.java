package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Iterator;
import kotlin.Metadata;
import p.fga0;
import p.hab0;
import p.iu30;
import p.pfa0;
import p.qfa0;
import p.rih1;
import p.vga0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/vga0;", "Lp/rih1;", "invoke", "(Lp/vga0;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class PreparePlayOptionsSerializer$serialize$1$4 extends hab0 implements iu30 {
    final /* synthetic */ PreparePlayOptions $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparePlayOptionsSerializer$serialize$1$4(PreparePlayOptions preparePlayOptions) {
        super(1);
        this.$value = preparePlayOptions;
    }

    public final void invoke(vga0 vga0Var) {
        if (this.$value.suppressions().c()) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$value);
            qfa0 qfa0Var = new qfa0();
            anonymousClass1.invoke(qfa0Var);
            vga0Var.b("providers", new pfa0(qfa0Var.a));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vga0) obj);
        return rih1.a;
    }

    /* JADX INFO: renamed from: com.spotify.voiceassistants.playermodels.PreparePlayOptionsSerializer$serialize$1$4$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/qfa0;", "Lp/rih1;", "invoke", "(Lp/qfa0;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ PreparePlayOptions $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PreparePlayOptions preparePlayOptions) {
            super(1);
            this.$value = preparePlayOptions;
        }

        public final void invoke(qfa0 qfa0Var) {
            Iterator it = ((Suppressions) this.$value.suppressions().b()).providers().iterator();
            while (it.hasNext()) {
                qfa0Var.a.add(fga0.c((String) it.next()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((qfa0) obj);
            return rih1.a;
        }
    }
}
