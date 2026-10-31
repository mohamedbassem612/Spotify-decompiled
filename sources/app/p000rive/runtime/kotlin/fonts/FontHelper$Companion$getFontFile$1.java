package app.p000rive.runtime.kotlin.fonts;

import java.io.File;
import kotlin.Metadata;
import p.hab0;
import p.ihc1;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/io/File;", "basePath", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FontHelper$Companion$getFontFile$1 extends hab0 implements iu30 {
    final /* synthetic */ Fonts.Font $font;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$getFontFile$1(Fonts.Font font) {
        super(1);
        this.$font = font;
    }

    public final File invoke(String str) {
        return new File(str, ihc1.e1(this.$font.getName()).toString());
    }
}
