package androidx.fragment.app.strictmode;

import kotlin.Metadata;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Violation extends RuntimeException {
    public final zf30 a;

    public Violation(String str, zf30 zf30Var) {
        super(str);
        this.a = zf30Var;
    }
}
