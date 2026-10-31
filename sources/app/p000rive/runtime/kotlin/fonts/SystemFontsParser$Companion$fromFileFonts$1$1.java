package app.p000rive.runtime.kotlin.fonts;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SystemFontsParser$Companion$fromFileFonts$1$1 extends hab0 implements Function0 {
    final /* synthetic */ String $familyName;
    final /* synthetic */ Fonts.FileFont $filefont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemFontsParser$Companion$fromFileFonts$1$1(String str, Fonts.FileFont fileFont) {
        super(0);
        this.$familyName = str;
        this.$filefont = fileFont;
    }

    public final String invoke() {
        String str = this.$familyName;
        return l1d.n(this.$filefont.getName(), "'", l1d.s(SystemFontsParser.fontFilesOrder.size(), "Legacy family '", str, "' has more than ", " files in <fileset>. Ignoring extra file: '"));
    }
}
