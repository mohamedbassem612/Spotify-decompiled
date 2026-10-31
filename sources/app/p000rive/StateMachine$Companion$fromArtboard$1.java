package app.p000rive;

import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.FileHandle;
import app.p000rive.core.StateMachineHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.gvg;
import p.hab0;
import p.rjx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class StateMachine$Companion$fromArtboard$1 extends hab0 implements Function0 {
    final /* synthetic */ Artboard $artboard;
    final /* synthetic */ long $handle;
    final /* synthetic */ String $nameLog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$Companion$fromArtboard$1(long j, String str, Artboard artboard) {
        super(0);
        this.$handle = j;
        this.$nameLog = str;
        this.$artboard = artboard;
    }

    public final String invoke() {
        String strM439toStringimpl = StateMachineHandle.m439toStringimpl(this.$handle);
        String str = this.$nameLog;
        return rjx.o(gvg.n("Created ", strM439toStringimpl, " ", str, " ("), ArtboardHandle.m183toStringimpl(this.$artboard.getArtboardHandle()), "; ", FileHandle.m372toStringimpl(this.$artboard.getFileHandle()), ")");
    }
}
