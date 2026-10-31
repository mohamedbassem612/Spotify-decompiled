package app.p000rive.runtime.kotlin.fonts;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FontHelper$Companion$loadFontList$loadedFonts$1$1 extends hab0 implements Function0 {
    final /* synthetic */ Exception $e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$loadFontList$loadedFonts$1$1(Exception exc) {
        super(0);
        this.$e = exc;
    }

    public final String invoke() {
        return l1d.m("Error parsing fonts XML: ", this.$e.getMessage());
    }
}
