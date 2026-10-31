package app.p000rive.runtime.kotlin.fonts;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.nhc1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "family", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "invoke", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Family;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$3 extends hab0 implements iu30 {
    final /* synthetic */ String $familyName;
    final /* synthetic */ String $lang;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$findMatches$matchingFamiliesSequence$3(String str, String str2) {
        super(1);
        this.$familyName = str;
        this.$lang = str2;
    }

    public final Boolean invoke(Fonts.Family family) {
        boolean z = true;
        if ((this.$familyName != null && !nhc1.S(family.getName(), this.$familyName, true)) || (this.$lang != null && !u890.j(family.getLang(), this.$lang))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
