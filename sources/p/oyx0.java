package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/oyx0;", "", "", "clientContext", "scenario", "Lp/gfh1;", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "a", "p/nyx0", "src_main_java_com_spotify_aipartner_promptsuggestionsprovider-promptsuggestionsprovider"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public interface oyx0 {
    public static final nyx0 a = nyx0.a;
    public static final String b = "PARTNER_UNAUTH";

    static /* synthetic */ Object a(oyx0 oyx0Var, String str, String str2, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getPromptSuggestions");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = b;
        }
        return oyx0Var.b(str, str2, lnmVar);
    }

    @ay30("{clientContext}/v1/unauthenticated-prompt-suggestions")
    Object b(@t8s0(encoded = true, value = "clientContext") String str, @u0z0("scenario") String str2, lnm<? super gfh1> lnmVar);
}
