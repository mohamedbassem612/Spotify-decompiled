package app.p000rive.runtime.kotlin.fonts;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.cy30;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SystemFontsParser$Companion$readAlias$1 extends hab0 implements Function0 {
    final /* synthetic */ String $name;
    final /* synthetic */ String $to;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemFontsParser$Companion$readAlias$1(String str, String str2) {
        super(0);
        this.$name = str;
        this.$to = str2;
    }

    public final String invoke() {
        return cy30.p("Skipping alias with blank name ('", this.$name, "') or to ('", this.$to, "').");
    }
}
