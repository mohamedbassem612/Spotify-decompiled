package app.p000rive.runtime.kotlin.fonts;

import java.util.Map;
import kotlin.Metadata;
import p.hab0;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$2 extends hab0 implements iu30 {
    public static final FontHelper$Companion$findMatches$matchingFamiliesSequence$2 INSTANCE = new FontHelper$Companion$findMatches$matchingFamiliesSequence$2();

    public FontHelper$Companion$findMatches$matchingFamiliesSequence$2() {
        super(1);
    }

    public final Fonts.Family invoke(Map.Entry<String, Fonts.Family> entry) {
        return entry.getValue();
    }
}
