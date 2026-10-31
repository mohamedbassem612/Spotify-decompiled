package app.p000rive.runtime.kotlin.controllers;

import app.p000rive.runtime.kotlin.core.Artboard;
import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.gvg;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveFileController$setupScene$defaultInstance$1 extends hab0 implements Function0 {
    final /* synthetic */ Artboard $activeArtboard;
    final /* synthetic */ ViewModelException $e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileController$setupScene$defaultInstance$1(Artboard artboard, ViewModelException viewModelException) {
        super(0);
        this.$activeArtboard = artboard;
        this.$e = viewModelException;
    }

    public final String invoke() {
        return gvg.h("Could not auto-bind artboard ", this.$activeArtboard.getName(), ": ", this.$e.getMessage());
    }
}
