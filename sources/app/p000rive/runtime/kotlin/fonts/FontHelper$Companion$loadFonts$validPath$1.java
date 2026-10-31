package app.p000rive.runtime.kotlin.fonts;

import java.io.File;
import kotlin.Metadata;
import p.hab0;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/io/File;", "pathStr", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FontHelper$Companion$loadFonts$validPath$1 extends hab0 implements iu30 {
    public static final FontHelper$Companion$loadFonts$validPath$1 INSTANCE = new FontHelper$Companion$loadFonts$validPath$1();

    public FontHelper$Companion$loadFonts$validPath$1() {
        super(1);
    }

    public final File invoke(String str) {
        return new File(str);
    }
}
