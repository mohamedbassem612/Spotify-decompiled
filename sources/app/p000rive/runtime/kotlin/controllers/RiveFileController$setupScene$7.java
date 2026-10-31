package app.p000rive.runtime.kotlin.controllers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.f4i1;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveFileController$setupScene$7 extends hab0 implements Function0 {
    final /* synthetic */ String $smName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileController$setupScene$7(String str) {
        super(0);
        this.$smName = str;
    }

    public final String invoke() {
        return f4i1.f("Autoplay enabled. Playing state machine: ", this.$smName, ".");
    }
}
